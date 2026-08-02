package xsna;

import com.vk.superapp.api.dto.auth.AuthSupportedWay;
import com.vk.toggle.anonymous.SakFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ValidateAccountDelegate.kt */
/* loaded from: classes15.dex */
public final class mir0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new kcc0(8));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static io.reactivex.rxjava3.core.q a(mir0 mir0Var, oir0 oir0Var) {
        boolean booleanValue = ((Boolean) mir0Var.a.getValue()).booleanValue();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        wfn0 e = vdx0Var.e();
        String str = oir0Var.a;
        boolean z = oir0Var.b;
        String str2 = oir0Var.d;
        String str3 = oir0Var.e;
        List<String> list = oir0Var.f;
        AuthSupportedWay.a aVar = AuthSupportedWay.Companion;
        boolean a = ol90.a();
        boolean z2 = oir0Var.c;
        boolean h = oir0Var.h | SakFeatures.Type.SAK_MAIL_PROMO_MAX.h();
        boolean z3 = oir0Var.i;
        aVar.getClass();
        ArrayList o = e43.o(AuthSupportedWay.PUSH, AuthSupportedWay.EMAIL, AuthSupportedWay.SMS, AuthSupportedWay.CALLRESET, AuthSupportedWay.PASSWORD, AuthSupportedWay.RESERVE_CODE, AuthSupportedWay.CODEGEN, AuthSupportedWay.OFFICIAL_MESSENGER);
        if (a) {
            o.add(AuthSupportedWay.PASSKEY);
        }
        if (z2) {
            o.add(AuthSupportedWay.LIBVERIFY);
        }
        if (h) {
            o.add(AuthSupportedWay.MAX_MESSENGER);
        }
        if (z3) {
            o.add(AuthSupportedWay.MAX_CODE);
        }
        List<i2q> list2 = oir0Var.g;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((i2q) it.next()).b);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 r = e.r(str, z, str3, list, o, str2, arrayList);
        f7r0 f7r0Var = new f7r0(new lir0(0), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 a2 = com.vk.registration.funnels.a.a(r.E(f7r0Var, lVar, kVar, kVar));
        if (!booleanValue) {
            return a2;
        }
        vdx0 vdx0Var2 = e370.e;
        return new io.reactivex.rxjava3.internal.operators.mixed.q(com.vk.registration.funnels.a.b((vdx0Var2 != null ? vdx0Var2 : null).x().b(oir0Var.a, oir0Var.d)).l(new o860(new p6e0(14), 13)), new ao90(new l5r0(1), 7)).L(new ac20(new e9i0(a2, 18), 20), false);
    }
}
