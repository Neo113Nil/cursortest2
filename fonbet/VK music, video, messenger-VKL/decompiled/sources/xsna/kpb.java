package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.hpb;
import xsna.jpb;

/* compiled from: ChatClipsTopBarDecorationReducer.kt */
/* loaded from: classes2.dex */
public final class kpb extends dm50<npb, jpb, hpb> {
    @Override // xsna.dm50
    public final hpb c(hpb hpbVar, jpb jpbVar) {
        hpb hpbVar2 = hpbVar;
        jpb jpbVar2 = jpbVar;
        if (jpbVar2 instanceof jpb.a) {
            jpb.a aVar = (jpb.a) jpbVar2;
            return new hpb.b(aVar.b, aVar.c, aVar.d);
        }
        if (!(jpbVar2 instanceof jpb.b)) {
            if (jpbVar2 instanceof jpb.c) {
                return hpbVar2 instanceof hpb.b ? new hpb.c(((jpb.c) jpbVar2).b) : hpbVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (hpbVar2 instanceof hpb.b) {
            jpb.b bVar = (jpb.b) jpbVar2;
            return new hpb.b(((hpb.b) hpbVar2).b, bVar.b, bVar.c);
        }
        if (!(hpbVar2 instanceof hpb.c)) {
            return hpbVar2;
        }
        jpb.b bVar2 = (jpb.b) jpbVar2;
        return new hpb.b(((hpb.c) hpbVar2).b, bVar2.b, bVar2.c);
    }

    @Override // xsna.dm50
    public final npb d() {
        return new npb(e(new am0(20)), e(new ci3(9)), e(new pf(10)));
    }

    @Override // xsna.dm50
    public final void h(hpb hpbVar, npb npbVar) {
        hpb hpbVar2 = hpbVar;
        npb npbVar2 = npbVar;
        if (hpbVar2 instanceof hpb.a) {
            f(npbVar2.a, hpbVar2);
        } else if (hpbVar2 instanceof hpb.b) {
            f(npbVar2.b, hpbVar2);
        } else {
            if (!(hpbVar2 instanceof hpb.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f(npbVar2.c, hpbVar2);
        }
    }
}
