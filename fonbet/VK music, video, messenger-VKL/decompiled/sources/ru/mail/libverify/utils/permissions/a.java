package ru.mail.libverify.utils.permissions;

import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.anj;

/* loaded from: classes9.dex */
public final class a {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final LongSparseArray<InterfaceC2216a> b = new LongSparseArray<>();

    /* renamed from: ru.mail.libverify.utils.permissions.a$a, reason: collision with other inner class name */
    public interface InterfaceC2216a {
        void a(@NonNull String str);

        void b(@NonNull String str);

        void onCompleted(boolean z);
    }

    public static void a(@NonNull Context context, @NonNull String[] strArr, @NonNull InterfaceC2216a interfaceC2216a) {
        FileLog.v("PermissionRequester", "income permissions %s", Arrays.toString(strArr));
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (anj.a(context, str) == 0) {
                FileLog.v("PermissionRequester", "permission granted %s", str);
                interfaceC2216a.a(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            FileLog.v("PermissionRequester", "no permissions to request");
            interfaceC2216a.onCompleted(true);
            return;
        }
        FileLog.v("PermissionRequester", "permissions to request %s", arrayList);
        Intent intent = new Intent(context, (Class<?>) ShadowActivity.class);
        int andIncrement = a.getAndIncrement();
        synchronized (a.class) {
            b.put(andIncrement, interfaceC2216a);
        }
        intent.setFlags(268435456);
        intent.putExtra(CommonUrlParts.REQUEST_ID, andIncrement);
        intent.putExtra(SignalingProtocol.KEY_PERMISSIONS, (String[]) arrayList.toArray(new String[0]));
        context.startActivity(intent);
    }

    public static void a(int i, @NonNull String[] strArr, int[] iArr) {
        InterfaceC2216a interfaceC2216a;
        synchronized (a.class) {
            try {
                LongSparseArray<InterfaceC2216a> longSparseArray = b;
                long j = i;
                interfaceC2216a = longSparseArray.get(j);
                if (interfaceC2216a != null) {
                    longSparseArray.remove(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC2216a != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (iArr[i3] == 0) {
                    interfaceC2216a.a(strArr[i3]);
                    i2++;
                } else {
                    interfaceC2216a.b(strArr[i3]);
                }
            }
            interfaceC2216a.onCompleted(i2 == strArr.length);
        }
    }
}
