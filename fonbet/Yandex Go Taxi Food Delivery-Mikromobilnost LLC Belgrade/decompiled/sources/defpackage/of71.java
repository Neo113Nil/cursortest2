package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public final class of71 {
    public static final l971 g = new l971();
    public static final long h = 1000;
    public static volatile of71 i;
    public final s421 c;
    public boolean e;
    public boolean f;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final qo61 d = new qo61();

    public of71(Context context) {
        this.c = new s421(context, 22);
    }

    public final void a(ho61 ho61Var) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            z = this.f;
            if (!z) {
                qo61 qo61Var = this.d;
                synchronized (qo61Var.a) {
                    qo61Var.b.put(ho61Var, null);
                }
            }
        }
        if (z) {
            ho61Var.a();
            return;
        }
        synchronized (this.a) {
            if (this.e) {
                z2 = false;
            } else {
                z2 = true;
                this.e = true;
            }
        }
        if (z2) {
            this.b.postDelayed(new jy31(24, this), h);
            s421 s421Var = this.c;
            lc71 lc71Var = new lc71(this);
            gg81 a = ((a081) s421Var.x).a((Context) s421Var.b);
            String str = a != null ? a.T : null;
            String c = ((y381) s421Var.c).a.c("YmadOmSdkJsUrl");
            if (str == null || str.length() <= 0 || str.equals(c)) {
                lc71Var.a();
                return;
            }
            mj31 mj31Var = new mj31(s421Var, str, lc71Var, false, 17);
            nl71 nl71Var = new nl71(str, mj31Var, mj31Var);
            nl71Var.setTag("om_sdk_js_request_tag");
            ys81 ys81Var = (ys81) s421Var.w;
            Context context = (Context) s421Var.b;
            synchronized (ys81Var) {
                hba1.b(context).b(nl71Var);
            }
        }
    }
}
