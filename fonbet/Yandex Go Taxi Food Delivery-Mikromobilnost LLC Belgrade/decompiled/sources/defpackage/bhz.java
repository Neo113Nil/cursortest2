package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bhz implements yg20, dez {
    public final zjr a = new zjr(new hwn(), EmptyList.a);

    @Override // defpackage.dez
    public final zjr a() {
        return this.a;
    }

    @Override // defpackage.yg20
    public final void b(oju0 oju0Var, ygz ygzVar, peo peoVar) {
        try {
            e3m e3mVar = (e3m) oju0Var.a;
            ygzVar.a.invoke(peoVar);
            e3m e3mVar2 = (e3m) oju0Var.a;
            h5z0.a.h("[Success] " + ("\"" + qoi0.a(peoVar.getClass()).d() + "\"") + " dispatched (" + (jl40.l(e3mVar, e3mVar2) ? "state not changed" : "state changed") + Extension.C_BRAKE, new Object[0]);
        } catch (Exception e) {
            h5z0.a.f(e, oyr.p("[Failure] ", oyr.p("\"", qoi0.a(peoVar.getClass()).d(), "\""), " not dispatched (see error below)"), new Object[0]);
            throw e;
        }
    }
}
