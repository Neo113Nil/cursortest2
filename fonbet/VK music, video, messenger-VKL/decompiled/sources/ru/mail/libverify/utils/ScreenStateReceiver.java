package ru.mail.libverify.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.z.c;
import ru.mail.verify.core.utils.FileLog;
import xsna.vu5;

/* loaded from: classes9.dex */
public class ScreenStateReceiver extends BroadcastReceiver {
    private static final AtomicReference<a> a = new AtomicReference<>();
    private static volatile PowerManager b;

    public static final class a {
        final boolean a;
        final long b;

        public /* synthetic */ a(boolean z, long j, int i) {
            this(z, j);
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenStateInfo{isActive=");
            sb.append(this.a);
            sb.append(", timestamp=");
            return vu5.a('}', this.b, sb);
        }

        private a(boolean z, long j) {
            this.a = z;
            this.b = j;
        }
    }

    @NonNull
    public static c a(@NonNull Context context) {
        c cVar;
        if (b == null) {
            synchronized (ScreenStateReceiver.class) {
                try {
                    if (b == null) {
                        b = (PowerManager) context.getSystemService("power");
                    }
                } finally {
                }
            }
        }
        PowerManager powerManager = b;
        if (powerManager == null ? true : powerManager.isInteractive()) {
            cVar = new c(true, null);
        } else {
            a aVar = a.get();
            if (aVar == null || aVar.a) {
                cVar = new c(false, null);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - aVar.b;
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 0;
                }
                cVar = new c(false, Long.valueOf(currentTimeMillis));
            }
        }
        FileLog.d("ScreenStateReceiver", "current state %s", cVar);
        return cVar;
    }

    public static void b(@NonNull Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ScreenStateReceiver screenStateReceiver = new ScreenStateReceiver();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(screenStateReceiver, intentFilter, 4);
            } else {
                context.registerReceiver(screenStateReceiver, intentFilter);
            }
        } catch (Throwable th) {
            FileLog.e("ScreenStateReceiver", "failed to register receiver", th);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, @Nullable Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF") || intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            a aVar = TextUtils.isEmpty(intent.getAction()) ? null : new a(intent.getAction().equals("android.intent.action.SCREEN_ON"), System.currentTimeMillis(), 0);
            a.set(aVar);
            FileLog.d("ScreenStateReceiver", "received state %s", aVar);
        }
    }
}
