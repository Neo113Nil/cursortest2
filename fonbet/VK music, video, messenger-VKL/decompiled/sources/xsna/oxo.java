package xsna;

import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.nxo;
import xsna.sxo;

/* compiled from: EcosystemMultiAccountReducer.kt */
/* loaded from: classes6.dex */
public final class oxo extends dm50<uxo, nxo, sxo> {
    public final ynn0 d;

    public oxo(int i, ynn0 ynn0Var) {
        super(new sxo(new sxo.a.b.C3702a(i, exo.c), SwitcherUiMode.Ecoplate.b));
        this.d = ynn0Var;
    }

    @Override // xsna.dm50
    public final sxo c(sxo sxoVar, nxo nxoVar) {
        sxo sxoVar2 = sxoVar;
        nxo nxoVar2 = nxoVar;
        if (nxoVar2 instanceof nxo.c) {
            return sxo.a(sxoVar2, new sxo.a.c(((nxo.c) nxoVar2).b), null, 2);
        }
        if (nxoVar2 instanceof nxo.b.C3423b) {
            ((nxo.b.C3423b) nxoVar2).getClass();
            return sxo.a(sxoVar2, new sxo.a.b.C3703b(), null, 2);
        }
        if (nxoVar2 instanceof nxo.b.a) {
            nxo.b.a aVar = (nxo.b.a) nxoVar2;
            aVar.getClass();
            return sxo.a(sxoVar2, new sxo.a.b.C3702a(aVar.b, aVar.c), null, 2);
        }
        if (nxoVar2 instanceof nxo.a) {
            return sxo.a(sxoVar2, sxo.a.C3701a.a, null, 2);
        }
        if (nxoVar2 instanceof nxo.d) {
            return sxo.a(sxoVar2, null, ((nxo.d) nxoVar2).b, 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final uxo d() {
        return new uxo(e(new qcl(this, 3)));
    }

    @Override // xsna.dm50
    public final void h(sxo sxoVar, uxo uxoVar) {
        f(uxoVar.a, sxoVar);
    }
}
