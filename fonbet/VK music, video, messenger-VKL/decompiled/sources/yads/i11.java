package yads;

import android.content.Context;
import org.json.JSONObject;
import xsna.s3q0;
import xsna.yvj;

/* loaded from: classes10.dex */
public abstract class i11 extends zn {
    public final nb2 w;
    public final in2 x;

    public /* synthetic */ i11(Context context, d4 d4Var, ov2 ov2Var, w5 w5Var) {
        this(context, d4Var, ov2Var, w5Var, z10.a((sm0) ((mv3) ov2Var).a()), new nb2(), in2.b.a());
    }

    @Override // yads.zn
    public final pn a(String str, String str2) {
        JSONObject a;
        Context context = this.a;
        d4 d4Var = this.c;
        bu1 a2 = ((mv3) this.d).a();
        iz2.a.getClass();
        j4 j4Var = new j4(context, d4Var, a2, str, str2, this, this, hz2.a(context), new v12(new c22(context, a2)), new d22());
        g9 g9Var = this.c.e;
        String str3 = null;
        String str4 = g9Var != null ? g9Var.h : null;
        this.w.getClass();
        if (str4 != null && (a = je1.a(str4)) != null && a.has("response")) {
            str3 = a.optString("response");
        }
        if (str3 == null) {
            return j4Var;
        }
        in2 in2Var = this.x;
        in2Var.getClass();
        synchronized (in2.c) {
            in2Var.a.put(j4Var, str3);
            s3q0 s3q0Var = s3q0.a;
        }
        return j4Var;
    }

    public i11(Context context, d4 d4Var, ov2 ov2Var, w5 w5Var, yvj yvjVar, nb2 nb2Var, in2 in2Var) {
        super(context, w5Var, d4Var, ov2Var, yvjVar);
        this.w = nb2Var;
        this.x = in2Var;
    }
}
