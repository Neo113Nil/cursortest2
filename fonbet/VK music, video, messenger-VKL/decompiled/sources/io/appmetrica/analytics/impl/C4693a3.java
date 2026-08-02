package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4693a3 implements InterfaceC5252vk {
    public final ArrayList a;
    public Intent b;
    public final Context c;
    public final S5 d;
    public final IHandlerExecutor e;

    public C4693a3(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    @Nullable
    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.a.add(consumer);
        return this.b;
    }

    public final void b() {
        this.b = null;
        S5 s5 = this.d;
        Context context = this.c;
        synchronized (s5) {
            if (s5.b) {
                try {
                    context.unregisterReceiver(s5.a);
                    s5.b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5252vk
    public final synchronized void onCreate() {
        Intent a = a();
        this.b = a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5252vk
    public final synchronized void onDestroy() {
        this.b = null;
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C4693a3(Context context, IHandlerExecutor iHandlerExecutor, int i) {
        this.a = new ArrayList();
        this.b = null;
        this.c = context;
        this.e = iHandlerExecutor;
        this.d = R5.a(new F2(new Z2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        S5 s5 = this.d;
        Context context = this.c;
        IHandlerExecutor iHandlerExecutor = this.e;
        synchronized (s5) {
            intent = null;
            try {
                intent = context.registerReceiver(s5.a, intentFilter, null, iHandlerExecutor.getHandler());
                s5.b = true;
            } catch (Throwable unused) {
            }
        }
        return intent;
    }
}
