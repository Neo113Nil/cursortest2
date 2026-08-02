package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class va2 {
    public final Context a;
    public final za2 b;
    public final yp2 c = xp2.a();
    public final hx2 d = gx2.a();

    public va2(Context context) {
        this.a = context.getApplicationContext();
        this.b = ab2.a(context);
    }

    public final void a(xa2 xa2Var) {
        qu2 a = this.d.a(this.a);
        String str = a != null ? a.T : null;
        String c = ((uh1) this.b.a).c("YmadOmSdkJsUrl");
        if (str == null || str.length() <= 0 || str.equals(c)) {
            xa2Var.a();
            return;
        }
        ua2 ua2Var = new ua2(this, str, xa2Var);
        l53 l53Var = new l53(str, ua2Var, ua2Var);
        l53Var.q = "om_sdk_js_request_tag";
        yp2 yp2Var = this.c;
        Context context = this.a;
        synchronized (yp2Var) {
            t92.a(context).a(l53Var);
        }
    }
}
