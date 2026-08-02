package xsna;

import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import kotlin.Result;

/* compiled from: SuperAppMenuV3Cache.kt */
/* loaded from: classes6.dex */
public final class v9n0 {
    public static boolean a = false;
    public static int b = 0;
    public static boolean c = true;
    public static io.reactivex.rxjava3.subjects.d<Result<ProfileNavigationInfo>> d = io.reactivex.rxjava3.subjects.d.N0();
    public static io.reactivex.rxjava3.disposables.c e;

    public static io.reactivex.rxjava3.subjects.d a() {
        pro0.a();
        Result<ProfileNavigationInfo> P0 = d.P0();
        boolean z = (P0 == null || (P0.d() instanceof Result.Failure)) ? false : true;
        io.reactivex.rxjava3.disposables.c cVar = e;
        if ((cVar == null || cVar.h()) && !z) {
            pro0.a();
            if (!a) {
                o25.a().b0(new u9n0());
                a = true;
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.flowable.u0(new io.reactivex.rxjava3.internal.operators.flowable.r0(vdx0Var.a().h().u(), new s1j0(new l140(19), 5))).l(new mvc0(new q520(22), 6)), new itj0(4), null), new pmu(new jvl0(2), 24)), new t9n0()).subscribe(new d750(new dl70(20), 20));
        }
        return d;
    }

    public static boolean b() {
        return c;
    }

    public static boolean c(int i) {
        if (i != b) {
            return false;
        }
        b = i;
        return true;
    }

    public static void d() {
        c = false;
    }
}
