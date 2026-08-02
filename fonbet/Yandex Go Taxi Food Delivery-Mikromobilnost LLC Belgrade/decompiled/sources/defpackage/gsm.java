package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import androidx.compose.material3.p;
import androidx.compose.material3.w;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yx360.design.compose.atoms.utils.AndroidNavigationMode;

/* loaded from: classes4.dex */
public final class gsm implements wls {
    public final /* synthetic */ oz40 A;
    public final /* synthetic */ a B;
    public final /* synthetic */ float C;
    public final /* synthetic */ trm a;
    public final /* synthetic */ fwi b;
    public final /* synthetic */ a c;
    public final /* synthetic */ a w;
    public final /* synthetic */ f530 x;
    public final /* synthetic */ qrm y;
    public final /* synthetic */ sls z;

    public gsm(trm trmVar, fwi fwiVar, a aVar, a aVar2, f530 f530Var, qrm qrmVar, sls slsVar, oz40 oz40Var, a aVar3, float f) {
        this.a = trmVar;
        this.b = fwiVar;
        this.c = aVar;
        this.w = aVar2;
        this.x = f530Var;
        this.y = qrmVar;
        this.z = slsVar;
        this.A = oz40Var;
        this.B = aVar3;
        this.C = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ?? r5;
        boolean z;
        f530 f530Var;
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-740390679);
        trm trmVar = this.a;
        rrm rrmVar = rrm.a;
        boolean l = jl40.l(trmVar, rrmVar);
        a aVar = this.B;
        a aVar2 = this.w;
        a aVar3 = this.c;
        int i = 0;
        if (l) {
            r5 = 0;
        } else {
            btsVar2.e0(5004770);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new w5(25, this.A);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            r5 = 0;
            yrm.d(this.b, (tls) Q, aVar3, aVar2, wwg.S(-1927491554, true, new esm(aVar, i), btsVar2), btsVar2, 28080);
        }
        btsVar2.t(r5);
        f530 d = u3a1.d(an91.o(i9a1.f(this.x), 0.0f, 20.0f, 0.0f, 0.0f, 13), "BOTTOM_SHEET");
        btsVar2.e0(96421631);
        int i2 = Settings.Secure.getInt(((Context) btsVar2.m(AndroidCompositionLocals_androidKt.b)).getContentResolver(), "navigation_mode", r5);
        AndroidNavigationMode androidNavigationMode = i2 != 0 ? i2 != 1 ? i2 != 2 ? AndroidNavigationMode.Unknown : AndroidNavigationMode.Gesture : AndroidNavigationMode.TwoButtons : AndroidNavigationMode.ThreeButtons;
        boolean d2 = lpb1.d(btsVar2);
        c530 c530Var = c530.a;
        f530 k = d.k((!d2 || androidNavigationMode == AndroidNavigationMode.Gesture) ? c530Var : i9a1.d(c530Var));
        btsVar2.e0(-1828080325);
        if (lpb1.d(btsVar2)) {
            btsVar2.e0(570021147);
            Configuration configuration = (Configuration) btsVar2.m(AndroidCompositionLocals_androidKt.a);
            boolean z2 = (lpb1.d(btsVar2) ? configuration.screenHeightDp : configuration.screenWidthDp) >= 600 ? true : r5;
            btsVar2.t(r5);
            if (!z2) {
                z = true;
                btsVar2.t(r5);
                if (z) {
                    f530Var = c530Var;
                } else {
                    f530 b = i9a1.b(c530Var);
                    qnm.d.getClass();
                    f530Var = an91.m(b, 24.0f, 0.0f, 2);
                }
                f530 k2 = k.k(f530Var);
                btsVar2.t(r5);
                f530 k3 = k2.k(!jl40.l(trmVar, rrmVar) ? ljs0.c : ljs0.v(c530Var, null, 3));
                qnm qnmVar = qnm.a;
                long a = qnm.c(btsVar2).a();
                long c = qnm.c(btsVar2).c();
                qrm qrmVar = this.y;
                w wVar = qrmVar.a;
                float f = this.C;
                oz40 oz40Var = this.A;
                trm trmVar2 = this.a;
                sls slsVar = this.z;
                p.a(slsVar, k3, wVar, 0.0f, false, null, a, 0L, c, null, null, null, wwg.S(719296642, true, new fsm(trmVar2, f, aVar3, aVar2, aVar, qrmVar, slsVar, oz40Var), btsVar2), btsVar2, 0, 6584);
                return zy11.a;
            }
        }
        z = r5;
        btsVar2.t(r5);
        if (z) {
        }
        f530 k22 = k.k(f530Var);
        btsVar2.t(r5);
        f530 k32 = k22.k(!jl40.l(trmVar, rrmVar) ? ljs0.c : ljs0.v(c530Var, null, 3));
        qnm qnmVar2 = qnm.a;
        long a2 = qnm.c(btsVar2).a();
        long c2 = qnm.c(btsVar2).c();
        qrm qrmVar2 = this.y;
        w wVar2 = qrmVar2.a;
        float f2 = this.C;
        oz40 oz40Var2 = this.A;
        trm trmVar22 = this.a;
        sls slsVar2 = this.z;
        p.a(slsVar2, k32, wVar2, 0.0f, false, null, a2, 0L, c2, null, null, null, wwg.S(719296642, true, new fsm(trmVar22, f2, aVar3, aVar2, aVar, qrmVar2, slsVar2, oz40Var2), btsVar2), btsVar2, 0, 6584);
        return zy11.a;
    }
}
