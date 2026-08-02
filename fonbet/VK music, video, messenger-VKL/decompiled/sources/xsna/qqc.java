package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.pqc;

/* compiled from: ClipDiscoverCatalogCache.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class qqc extends FunctionReferenceImpl implements izs<pqc.c, io.reactivex.rxjava3.core.g<pqc.a>> {
    @Override // xsna.izs
    public final io.reactivex.rxjava3.core.g<pqc.a> invoke(pqc.c cVar) {
        pqc pqcVar = (pqc) this.receiver;
        pqc pqcVar2 = pqc.a;
        pqcVar.getClass();
        int i = pqc.d.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((vqd) pqc.j.getValue()).b ? pqc.c().d(pqc.d()) : pqc.d().q();
            }
            throw new NoWhenBranchMatchedException();
        }
        bpn0 bpn0Var = pqc.j;
        if (((vqd) bpn0Var.getValue()).a && ((vqd) bpn0Var.getValue()).b) {
            return pqc.c().d(pqc.d());
        }
        if (((vqd) bpn0Var.getValue()).a) {
            return pqc.d().q();
        }
        if (((vqd) bpn0Var.getValue()).b) {
            return pqc.c().q();
        }
        int i2 = io.reactivex.rxjava3.core.g.b;
        return io.reactivex.rxjava3.internal.operators.flowable.p.c;
    }
}
