package sg.bigo.ads.cl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.T3;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ai.i;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.cv.c;

/* loaded from: classes9.dex */
public final class d implements sg.bigo.ads.an.g {

    @NonNull
    public AdConfig a;

    @NonNull
    final Context b;

    @NonNull
    final sg.bigo.ads.ci.e c;
    String d;
    String e;
    int f;
    String g;
    String h;
    String i;
    String j;
    String k;
    public int l;
    public String m;
    String n;
    String o;
    int p;
    long q;
    long r;
    int s;
    String t;
    private long v = 0;
    private long w = 0;
    int u = 0;

    public d(@NonNull Context context, @NonNull AdConfig adConfig, @NonNull sg.bigo.ads.ci.e eVar) {
        this.b = context;
        this.a = adConfig;
        this.c = eVar;
    }

    @Override // sg.bigo.ads.an.g
    public final String A() {
        sg.bigo.ads.an.a M = this.c.M();
        return M != null ? M.b : "";
    }

    @Override // sg.bigo.ads.an.g
    public final String B() {
        return sg.bigo.ads.ap.a.a(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final String C() {
        return this.c.G();
    }

    @Override // sg.bigo.ads.an.g
    public final int D() {
        return (int) (s.b() / 1000);
    }

    @Override // sg.bigo.ads.an.g
    public final String E() {
        return this.c.j();
    }

    @Override // sg.bigo.ads.an.g
    public final boolean F() {
        sg.bigo.ads.an.a L = this.c.L();
        if (L != null) {
            return L.c;
        }
        return true;
    }

    @Override // sg.bigo.ads.an.g
    public final String G() {
        sg.bigo.ads.an.a L = this.c.L();
        return L != null ? L.b : "";
    }

    @Override // sg.bigo.ads.an.g
    public final String H() {
        return this.n;
    }

    @Override // sg.bigo.ads.an.g
    public final String I() {
        return this.o;
    }

    @Override // sg.bigo.ads.an.g
    public final int J() {
        return this.p;
    }

    @Override // sg.bigo.ads.an.g
    public final long K() {
        return this.q;
    }

    @Override // sg.bigo.ads.an.g
    public final long L() {
        return this.r;
    }

    @Override // sg.bigo.ads.an.g
    public final long M() {
        return q.a(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final long N() {
        return q.d();
    }

    @Override // sg.bigo.ads.an.g
    public final long O() {
        return q.a();
    }

    @Override // sg.bigo.ads.an.g
    public final String P() {
        return this.c.l();
    }

    @Override // sg.bigo.ads.an.g
    public final String Q() {
        return "";
    }

    @Override // sg.bigo.ads.an.g
    public final String R() {
        return r.d(sg.bigo.ads.bz.b.e(this.b));
    }

    @Override // sg.bigo.ads.an.g
    public final String S() {
        return r.d(sg.bigo.ads.bz.b.c(this.b));
    }

    @Override // sg.bigo.ads.an.g
    public final String T() {
        return this.t;
    }

    @Override // sg.bigo.ads.an.g
    public final String U() {
        sg.bigo.ads.ci.e eVar = this.c;
        return eVar != null ? eVar.H() : "";
    }

    @Override // sg.bigo.ads.an.g
    public final long V() {
        return h.a().e.a;
    }

    @Override // sg.bigo.ads.an.g
    public final long W() {
        return h.a().e.b;
    }

    @Override // sg.bigo.ads.an.g
    public final String X() {
        return sg.bigo.ads.bw.a.t();
    }

    @Override // sg.bigo.ads.an.g
    public final long Y() {
        if (this.v == 0) {
            try {
                Context context = this.b;
                this.v = sg.bigo.ads.common.utils.d.c(context, context.getPackageName());
            } catch (Exception unused) {
                this.v = -1L;
            }
        }
        return this.v;
    }

    @Override // sg.bigo.ads.an.g
    public final long Z() {
        if (this.w == 0) {
            try {
                Context context = this.b;
                this.w = sg.bigo.ads.common.utils.d.d(context, context.getPackageName());
            } catch (Exception unused) {
                this.w = -1L;
            }
        }
        return this.w;
    }

    @Override // sg.bigo.ads.an.g
    @NonNull
    public final String a() {
        return this.a.getAppKey();
    }

    @Override // sg.bigo.ads.an.g
    public final JSONObject aA() {
        sg.bigo.ads.a a = BigoAdSdk.a(this.b);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    @Override // sg.bigo.ads.an.g
    public final int aB() {
        JSONObject aA = aA();
        if (aA != null) {
            return aA.optInt(sg.bigo.ads.a.a.d, 0);
        }
        return 0;
    }

    @Override // sg.bigo.ads.an.g
    public final String aC() {
        JSONObject aA = aA();
        return aA != null ? aA.optString(sg.bigo.ads.a.a.i, "") : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    @Override // sg.bigo.ads.an.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int aD() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        JSONObject aA = aA();
        if (aA != null) {
            z2 = aA.optLong("anti_info_update_millis", 0L) == sg.bigo.ads.a.a;
            String str = sg.bigo.ads.a.a.k;
            z4 = aA.optBoolean(str);
            z3 = aA.has(str);
            JSONObject optJSONObject = aA.optJSONObject(sg.bigo.ads.a.a.F);
            if (optJSONObject != null) {
                z5 = optJSONObject.has(sg.bigo.ads.a.a.q);
                z6 = optJSONObject.has(sg.bigo.ads.a.a.E);
                z7 = optJSONObject.has(sg.bigo.ads.a.a.t);
                z8 = optJSONObject.has(sg.bigo.ads.a.a.r);
                z9 = optJSONObject.has(sg.bigo.ads.a.a.C);
                z10 = optJSONObject.has(sg.bigo.ads.a.a.u);
                z11 = optJSONObject.has(sg.bigo.ads.a.a.s);
                z = optJSONObject.has(sg.bigo.ads.a.a.B);
                boolean[] zArr = {z2, z4, z5, z6, z7, z8, z9, z10, z11, z, false, z3};
                int i = 0;
                for (int i2 = 0; i2 < 12; i2++) {
                    if (zArr[i2]) {
                        i |= 1 << i2;
                    }
                }
                return i;
            }
            z = false;
            z5 = false;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        z6 = z5;
        z7 = z6;
        z8 = z7;
        z9 = z8;
        z10 = z9;
        z11 = z10;
        boolean[] zArr2 = {z2, z4, z5, z6, z7, z8, z9, z10, z11, z, false, z3};
        int i3 = 0;
        while (i2 < 12) {
        }
        return i3;
    }

    @Override // sg.bigo.ads.an.g
    public final String aE() {
        JSONObject aA = aA();
        return aA != null ? String.valueOf(aA.optLong("anti_info_update_millis", 0L)) : "";
    }

    @Override // sg.bigo.ads.an.g
    public final String aF() {
        return this.c.P;
    }

    @Override // sg.bigo.ads.an.g
    public final boolean aG() {
        return this.c.n().a(30);
    }

    @Override // sg.bigo.ads.an.g
    public final String aH() {
        sg.bigo.ads.cv.c unused;
        unused = c.a.a;
        return sg.bigo.ads.cv.c.f();
    }

    @Override // sg.bigo.ads.an.g
    public final String aa() {
        return "official";
    }

    @Override // sg.bigo.ads.an.g
    public final int ab() {
        return this.s;
    }

    @Override // sg.bigo.ads.an.g
    public final sg.bigo.ads.an.b ac() {
        if (this.c.n().a(15)) {
            return sg.bigo.ads.bz.b.h(this.b);
        }
        sg.bigo.ads.bz.b.j(this.b);
        return null;
    }

    @Override // sg.bigo.ads.an.g
    public final boolean ad() {
        sg.bigo.ads.an.a N = this.c.N();
        if (N != null) {
            return N.c;
        }
        return true;
    }

    @Override // sg.bigo.ads.an.g
    public final String ae() {
        sg.bigo.ads.an.a N = this.c.N();
        return N != null ? N.b : "";
    }

    @Override // sg.bigo.ads.an.g
    public final Context af() {
        return this.b;
    }

    @Override // sg.bigo.ads.an.g
    public final boolean ag() {
        return sg.bigo.ads.bz.b.k(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final int ah() {
        return sg.bigo.ads.bz.b.l(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final boolean ai() {
        return sg.bigo.ads.bz.b.c();
    }

    @Override // sg.bigo.ads.an.g
    public final float aj() {
        return sg.bigo.ads.bz.b.m(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final int ak() {
        return sg.bigo.ads.bz.b.o(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final float al() {
        return sg.bigo.ads.bz.b.p(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final int am() {
        return sg.bigo.ads.bz.b.q(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final int an() {
        return sg.bigo.ads.bz.b.r(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final boolean ao() {
        return sg.bigo.ads.bz.b.u(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final int ap() {
        return sg.bigo.ads.bz.b.s(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final int aq() {
        return sg.bigo.ads.bz.b.t(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final long ar() {
        return sg.bigo.ads.bz.b.v(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final boolean as() {
        return sg.bigo.ads.bz.b.w(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final boolean at() {
        return sg.bigo.ads.bz.b.n(this.b);
    }

    @Override // sg.bigo.ads.an.g
    public final boolean au() {
        return sg.bigo.ads.bz.b.d();
    }

    @Override // sg.bigo.ads.an.g
    public final int av() {
        return i.b();
    }

    @Override // sg.bigo.ads.an.g
    public final int aw() {
        return this.c.n().a(25) ? 2 : 0;
    }

    @Override // sg.bigo.ads.an.g
    public final int ax() {
        return this.u;
    }

    @Override // sg.bigo.ads.an.g
    public final boolean ay() {
        return this.c.n().a(27);
    }

    @Override // sg.bigo.ads.an.g
    public final boolean az() {
        return this.c.n().a(28);
    }

    @Override // sg.bigo.ads.an.g
    public final String b() {
        return this.d;
    }

    @Override // sg.bigo.ads.an.g
    public final String c() {
        return this.e;
    }

    @Override // sg.bigo.ads.an.g
    public final int d() {
        return this.f;
    }

    @Override // sg.bigo.ads.an.g
    public final String e() {
        return this.a.getChannel();
    }

    @Override // sg.bigo.ads.an.g
    public final int f() {
        return this.a.getAge();
    }

    @Override // sg.bigo.ads.an.g
    public final int g() {
        return this.a.getGender();
    }

    @Override // sg.bigo.ads.an.g
    public final long h() {
        return this.a.getActivatedTime();
    }

    @Override // sg.bigo.ads.an.g
    public final String i() {
        return "android";
    }

    @Override // sg.bigo.ads.an.g
    public final String j() {
        return Build.VERSION.RELEASE;
    }

    @Override // sg.bigo.ads.an.g
    public final String k() {
        return this.g;
    }

    @Override // sg.bigo.ads.an.g
    public final String l() {
        return this.h;
    }

    @Override // sg.bigo.ads.an.g
    public final String m() {
        return this.i;
    }

    @Override // sg.bigo.ads.an.g
    public final String n() {
        return this.j;
    }

    @Override // sg.bigo.ads.an.g
    public final String o() {
        return this.k;
    }

    @Override // sg.bigo.ads.an.g
    public final int p() {
        return this.l;
    }

    @Override // sg.bigo.ads.an.g
    public final String q() {
        return this.m;
    }

    @Override // sg.bigo.ads.an.g
    public final String r() {
        int a = sg.bigo.ads.bz.c.a(this.b);
        return a != 1 ? a != 2 ? a != 3 ? a != 4 ? a != 5 ? "unknown" : "5g" : "4g" : "wifi" : T3.a : "2g";
    }

    @Override // sg.bigo.ads.an.g
    public final String s() {
        return r.d(sg.bigo.ads.common.utils.d.a());
    }

    @Override // sg.bigo.ads.an.g
    public final String t() {
        String k = this.c.k();
        return !TextUtils.isEmpty(k) ? k : v();
    }

    @Override // sg.bigo.ads.an.g
    public final String u() {
        return this.c.k();
    }

    @Override // sg.bigo.ads.an.g
    public final String v() {
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String R = R();
        return !TextUtils.isEmpty(R) ? R : S();
    }

    @Override // sg.bigo.ads.an.g
    public final String w() {
        return "";
    }

    @Override // sg.bigo.ads.an.g
    public final String x() {
        return "";
    }

    @Override // sg.bigo.ads.an.g
    public final String y() {
        return "5.9.0";
    }

    @Override // sg.bigo.ads.an.g
    public final boolean z() {
        sg.bigo.ads.an.a M = this.c.M();
        if (M != null) {
            return M.c;
        }
        return true;
    }
}
