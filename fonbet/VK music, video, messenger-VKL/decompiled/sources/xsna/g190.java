package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: OutlinedTextField.kt */
/* loaded from: classes11.dex */
public final class g190 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ q630 b;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ mfo0 e;
    public final /* synthetic */ tho0 f;
    public final /* synthetic */ izs<tho0, s3q0> g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ nmo0 i;
    public final /* synthetic */ rgy j;
    public final /* synthetic */ uey k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ b6u0 o;
    public final /* synthetic */ sg50 p;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> q;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> r;
    public final /* synthetic */ r5j0 s;

    public g190(q630 q630Var, wzs wzsVar, boolean z, mfo0 mfo0Var, tho0 tho0Var, izs izsVar, boolean z2, nmo0 nmo0Var, rgy rgyVar, uey ueyVar, boolean z3, int i, int i2, b6u0 b6u0Var, sg50 sg50Var, wzs wzsVar2, wzs wzsVar3, r5j0 r5j0Var) {
        this.b = q630Var;
        this.c = wzsVar;
        this.d = z;
        this.e = mfo0Var;
        this.f = tho0Var;
        this.g = izsVar;
        this.h = z2;
        this.i = nmo0Var;
        this.j = rgyVar;
        this.k = ueyVar;
        this.l = z3;
        this.m = i;
        this.n = i2;
        this.o = b6u0Var;
        this.p = sg50Var;
        this.q = wzsVar2;
        this.r = wzsVar3;
        this.s = r5j0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2094276683, intValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:572)");
            }
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.c;
            q630 q630Var = q630.a.a;
            if (wzsVar != null) {
                aVar2.K(-1901539802);
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new kpr(14);
                    aVar2.R(x);
                }
                q630Var = s200.H(egi0.b(q630Var, true, (izs) x), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fgo0.e(aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                aVar2.j();
            } else {
                aVar2.K(-1901156115);
                aVar2.j();
            }
            q630 g = this.b.g(q630Var);
            String b = e7b0.b(R.string.default_error_message, aVar2);
            float f = fgo0.a;
            boolean z = this.d;
            if (z) {
                g = egi0.b(g, false, new cso(b, 3));
            }
            q630 a = txj0.a(g, a190.c, a190.b);
            mfo0 mfo0Var = this.e;
            rek0 rek0Var = new rek0(z ? mfo0Var.j : mfo0Var.i);
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar2 = this.r;
            r5j0 r5j0Var = this.s;
            tho0 tho0Var = this.f;
            boolean z2 = this.h;
            boolean z3 = this.l;
            b6u0 b6u0Var = this.o;
            sg50 sg50Var = this.p;
            wt6.a(tho0Var, this.g, a, z2, false, this.i, this.j, this.k, z3, this.m, this.n, b6u0Var, null, sg50Var, rek0Var, kai.c(674541106, new f190(tho0Var, z2, z3, b6u0Var, sg50Var, this.d, this.c, this.q, wzsVar2, mfo0Var, r5j0Var), aVar2), aVar2, 0, 196608, 4096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
