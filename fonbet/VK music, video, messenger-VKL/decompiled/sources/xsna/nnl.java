package xsna;

import com.vk.api.generated.auth.dto.AuthExternalFlowOutPlatformDto;
import com.vk.api.generated.auth.dto.AuthValidateAccountSupportedWaysDto;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.auth.AuthSupportedWay;
import com.vk.superapp.api.internal.oauthrequests.AuthGetEsiaSignature;
import com.vk.superapp.api.internal.requests.qr.ProcessAuthCode$Companion$Action;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.VkGender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultSuperappApi.kt */
/* loaded from: classes11.dex */
public final class nnl implements wfn0 {
    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.single.y a(String str) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a;
        bx2 e = e370.e(x1o0.a().e(str));
        e.d = true;
        e.c = true;
        a = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
        return a.m0().l(new e7(new pf(25), 21));
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(VkAuthState vkAuthState, String str, String str2, String str3, String str4) {
        return px2.c(new m1c(dgn0.g(), dgn0.b().b, str, str2, str3, vkAuthState, str4), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 c(String str) {
        String g = dgn0.g();
        l6r0 l6r0Var = (l6r0) dgn0.d.getValue();
        return px2.c(new ql90(g, str, l6r0Var != null ? l6r0Var.getToken() : null), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 d(String str, String str2, String str3, VkGender vkGender, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, boolean z2, String str10, String str11) {
        return px2.c(new g65(str, str2, str3, vkGender, str4, str5, str6, str7, z, str8, str9, z2, str10, str11), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 e(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a;
        bx2 e = e370.e(wwf0.m(x1o0.a(), str2, str, str3, str4, str5, String.valueOf(dgn0.b().b), dgn0.e(), Boolean.valueOf(z2), Boolean.valueOf(z3), str6));
        e370.a(e);
        e.r = z;
        a = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
        return a.U(new j6a(jnl.b, 2));
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 f(int i, boolean z) {
        h35 h35Var = new h35(i);
        h35Var.r = z;
        h35Var.d = true;
        return rdx0.B(h35Var);
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 g(int i) {
        return px2.c(new s35(i), dgn0.c()).m0();
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 h(String str, String str2) {
        return px2.c(new p25(dgn0.g(), dgn0.b().b, str, str2), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 i(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        return px2.c(new d35(dgn0.g(), dgn0.b().b, str, str2, str3, arrayList, arrayList2), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 j(String str, String str2) {
        return px2.c(new u65(str, str2), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 k(String str, String str2, String str3, String str4, String str5) {
        return px2.c(new c35(dgn0.g(), str, str2, str3, dgn0.b().b, str4, str5), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.single.y l(Long l) {
        bx2 e = e370.e(wwf0.l(x1o0.a(), l != null ? Integer.valueOf((int) l.longValue()) : null));
        e370.b(e);
        e.c = true;
        e.d = true;
        return rdx0.p(e).l(new i6a(mnl.b, 2));
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.single.y m(long j) {
        return rdx0.p(e370.e(x1o0.a().b((int) j))).l(new gqf(knl.b, 1));
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 n() {
        String g = dgn0.g();
        int i = dgn0.b().b;
        String str = dgn0.b().l;
        l6r0 l6r0Var = (l6r0) dgn0.d.getValue();
        return px2.c(new q35(g, i, str, l6r0Var != null ? l6r0Var.getToken() : null), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 o(VkAuthState vkAuthState, String str, boolean z, String str2, boolean z2, String str3, boolean z3, boolean z4, String str4) {
        mgn0 mgn0Var = dgn0.a;
        mgn0 mgn0Var2 = dgn0.a;
        if (mgn0Var2 == null) {
            mgn0Var2 = null;
        }
        return px2.c(new c65(vkAuthState, mgn0Var2.e.d.invoke(), str, dgn0.b().b, z, str2, z2, str3, z3, z4, str4), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 p() {
        return px2.c(new g35(), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 q(int i, String str, String str2, String str3) {
        return px2.c(new e35(dgn0.g(), i, str, str2, str3), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 r(String str, boolean z, String str2, List list, ArrayList arrayList, String str3, ArrayList arrayList2) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a;
        znk0 a2 = x1o0.a();
        String a3 = cqm0.a(str2);
        List x = rdi.x(list);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AuthValidateAccountSupportedWaysDto z2 = k9q0.z((AuthSupportedWay) it.next());
            if (z2 != null) {
                arrayList3.add(z2);
            }
        }
        bx2 e = e370.e(wwf0.k(a2, str, Boolean.valueOf(z), str3, arrayList3, a3, x, arrayList2));
        e370.a(e);
        a = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
        return a.U(new hnl(lnl.b, 0));
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 s(String str, String str2) {
        bx2 e = e370.e(x1o0.a().d(dgn0.b().b, str, str2));
        e370.a(e);
        return px2.c(e, dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.l2 t(List list) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a;
        bx2 e = e370.e(wwf0.h(x1o0.a(), list, Integer.valueOf(dgn0.b().b)));
        e.r = true;
        e.c = true;
        e.d = true;
        a = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
        return a;
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.l2 u(String str, String str2) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a;
        bx2 e = e370.e(wwf0.f(x1o0.a(), str, AuthExternalFlowOutPlatformDto.MOBILE, str2));
        e.c = true;
        e.d = true;
        a = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
        return a;
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 v(UserId userId, String str, boolean z) {
        kgd0 kgd0Var = new kgd0(ProcessAuthCode$Companion$Action.ALLOW, str, z);
        kgd0Var.p = userId;
        return px2.c(kgd0Var, dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 w(int i, String str, String str2, String str3, String str4, List list, String str5) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a;
        bx2 e = e370.e(wwf0.g(x1o0.a(), i, str, str2, str3, list, str4, str5));
        e.f = true;
        e.d = true;
        a = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e, dgn0.c(), null, null);
        return a.U(new nfc(inl.b)).m0();
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 x(String str, boolean z) {
        return px2.c(new AuthGetEsiaSignature(dgn0.b().b, dgn0.g(), dgn0.b().l, str, z), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 y(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, boolean z8) {
        return px2.c(new v65(str, str2, z, z2, z3, z4, z5, z6, z7, str3, z8), dgn0.c());
    }

    @Override // xsna.wfn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 z(String str, String str2) {
        bx2 e = e370.e(x1o0.a().c(str, ply.a(), str2));
        e.c = true;
        e.d = true;
        return rdx0.u(e);
    }
}
