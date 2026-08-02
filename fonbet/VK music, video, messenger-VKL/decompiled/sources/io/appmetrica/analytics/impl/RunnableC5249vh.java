package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5249vh implements Runnable {
    public final Context a;
    public final C4722b6 b;
    public final Bundle c;
    public final C5004m4 d;

    public RunnableC5249vh(Context context, C4722b6 c4722b6, Bundle bundle, C5004m4 c5004m4) {
        this.a = context;
        this.b = c4722b6;
        this.c = bundle;
        this.d = c5004m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            T3 a = T3.a(this.a, this.c);
            if (a == null) {
                return;
            }
            C4720b4 a2 = C4720b4.a(a);
            C5071oj v = C5342za.I.v();
            v.a(a.b.getAppVersion(), a.b.getAppBuildNumber());
            v.a(a.b.getDeviceType());
            B4 b4 = new B4(new C4944jm(a), new A4(a.b, AbstractC5166sb.c(a.a.a.getAsString("PROCESS_CFG_CLIDS"))), a.a.b);
            this.d.a(a2, b4).a(this.b, b4);
        } catch (Throwable th) {
            C4710ak c4710ak = AbstractC5326yj.a;
            String str = "Exception during processing event with type: " + this.b.d + " (" + this.b.e + "): " + th.getMessage();
            c4710ak.getClass();
            c4710ak.a(new C5351zj(str, th));
        }
    }
}
