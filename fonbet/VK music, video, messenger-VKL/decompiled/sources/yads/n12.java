package yads;

import android.content.Context;
import org.json.JSONObject;
import xsna.j5g;
import xsna.s3q0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class n12 extends zn {
    public final r53 A;
    public final n02 B;
    public final m12 C;
    public final b12 D;
    public final b22 w;
    public final w12 x;
    public final g22 y;
    public final j22 z;

    public n12(Context context, ov2 ov2Var, b22 b22Var, d4 d4Var, w12 w12Var, w5 w5Var, yvj yvjVar, g22 g22Var, j22 j22Var, r53 r53Var, n02 n02Var) {
        super(context, w5Var, d4Var, ov2Var, yvjVar);
        this.w = b22Var;
        this.x = w12Var;
        this.y = g22Var;
        this.z = j22Var;
        this.A = r53Var;
        this.B = n02Var;
        this.C = new m12(this);
        this.D = new b12(context, ov2Var, this, this);
        w12Var.a(j22Var);
    }

    @Override // yads.zn
    public final boolean a(g9 g9Var) {
        return true;
    }

    @Override // yads.zn
    public final synchronized void b(g9 g9Var) {
        throw null;
    }

    @Override // yads.zn
    public final l4 o() {
        return (l4) j5g.a0(this.j.a());
    }

    @Override // yads.zn
    public final pn a(String str, String str2) {
        JSONObject a;
        b12 b12Var = this.D;
        b22 b22Var = this.w;
        zp2 zp2Var = b22Var.c;
        d4 d4Var = this.c;
        g9 g9Var = b22Var.a;
        b12Var.getClass();
        a12 a12Var = new a12(b12Var.a, d4Var, ((mv3) b12Var.b).a(), str, str2, b12Var.c, b12Var.d, new v12(zp2Var), new d22());
        String str3 = g9Var.h;
        b12Var.f.getClass();
        String optString = (str3 == null || (a = je1.a(str3)) == null || !a.has("response")) ? null : a.optString("response");
        String str4 = g9Var.i;
        if (optString == null) {
            optString = str4;
        }
        if (optString == null) {
            return a12Var;
        }
        in2 in2Var = b12Var.e;
        in2Var.getClass();
        synchronized (in2.c) {
            in2Var.a.put(a12Var, optString);
            s3q0 s3q0Var = s3q0.a;
        }
        return a12Var;
    }

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.x.a(l4Var);
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        y32 xw2Var;
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.b.a(v5.s);
            this.v = v9Var;
        }
        this.z.d = v9Var;
        if (this.r == z5.b) {
            return;
        }
        g22 g22Var = this.y;
        g22Var.getClass();
        ir1 ir1Var = v9Var.q;
        if (ir1Var != null) {
            xw2Var = new qq1(v9Var, ir1Var);
        } else {
            xw2Var = new xw2(g22Var.a, g22Var.b);
        }
        x32 a = xw2Var.a(this);
        Context a2 = j1.a();
        if (a2 == null) {
            a2 = this.a;
        }
        a.a(a2, v9Var);
    }
}
