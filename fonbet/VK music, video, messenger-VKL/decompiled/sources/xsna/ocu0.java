package xsna;

import com.vk.auth.api.models.AuthResult;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ocu0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pcu0 d;
    public final /* synthetic */ AuthResult e;

    public /* synthetic */ ocu0(boolean z, boolean z2, pcu0 pcu0Var, AuthResult authResult) {
        this.b = z;
        this.c = z2;
        this.d = pcu0Var;
        this.e = authResult;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        m6r0 m6r0Var = (m6r0) obj;
        boolean z = this.b;
        pcu0 pcu0Var = this.d;
        AuthResult authResult = this.e;
        if (!z || !this.c) {
            return pcu0Var.r(authResult);
        }
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new e7h0(m6r0Var, 1));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = s0Var.a0(asu0.i());
        i3q0 i3q0Var = new i3q0(new v0s0(3, pcu0Var, authResult), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return bxp0.c(a0.E(i3q0Var, lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()), authResult, false).U(new xq70(new m4k0(12), 23));
    }
}
