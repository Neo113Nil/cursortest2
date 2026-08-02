package xsna;

import android.text.TextUtils;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class xey0 {
    public l0n A;
    public int B;
    public int C;
    public float D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public wty0 L;
    public fwy M;
    public String N;
    public String O;
    public boolean P;
    public String Q;
    public String R;
    public final wey0 S;
    public final giy0 T;
    public final e5z0 a;
    public final ery0 b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Float j;
    public Integer k;
    public String l;
    public long m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public List s;
    public kiw t;
    public kiw u;
    public k6z0 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public xey0() {
        this(giy0.d, null, null);
    }

    public final String a() {
        return this.p;
    }

    public String b() {
        return this.O;
    }

    public final float c() {
        Float f = this.j;
        return f == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue();
    }

    public final e5z0 d() {
        return this.a;
    }

    public final String e() {
        return this.J;
    }

    public final int f() {
        Integer num = this.k;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int g() {
        return this.B;
    }

    public final boolean h() {
        return this.x;
    }

    public final String i() {
        String str = "";
        if (!TextUtils.isEmpty(this.r)) {
            str = "" + this.r;
        }
        if (TextUtils.isEmpty(this.h)) {
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            str = fo8.a(str, " ");
        }
        StringBuilder e = fw3.e(str);
        e.append(this.h);
        return e.toString();
    }

    public final giy0 j() {
        return this.T;
    }

    public final String k() {
        return this.H;
    }

    public String l() {
        return this.K;
    }

    public void m(String str) {
        this.N = str;
    }

    public final String n() {
        String str = this.d;
        return str == null ? X3.i.U.equals(this.p) ? "Install" : "Visit" : str;
    }

    public String o() {
        return this.N;
    }

    public void p(String str) {
        this.O = str;
    }

    public int q() {
        return this.C;
    }

    public final String r() {
        return this.F;
    }

    public xey0(giy0 giy0Var, nl nlVar, bqz0 bqz0Var) {
        ery0 ery0Var = new ery0();
        ery0Var.a = 1.0f;
        ery0Var.b = 0.5f;
        ery0Var.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = ery0Var;
        this.c = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.l = "";
        this.m = -1L;
        this.n = "";
        this.o = "";
        this.p = "web";
        this.r = "";
        this.s = new ArrayList();
        this.v = k6z0.p;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = 0;
        this.E = "";
        this.F = "";
        this.P = false;
        this.Q = "";
        wey0 wey0Var = new wey0();
        wey0Var.a = false;
        wey0Var.b = false;
        wey0Var.c = false;
        this.S = wey0Var;
        this.T = giy0Var;
        this.a = new e5z0(giy0Var, nlVar, bqz0Var);
    }
}
