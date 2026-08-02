package xsna;

import xsna.o2d0;

/* compiled from: LinkStateInteractionSourceObserver.kt */
/* loaded from: classes11.dex */
public final class yaz<T> implements lsr {
    public final /* synthetic */ fh50<vax> b;
    public final /* synthetic */ zaz c;

    public yaz(fh50<vax> fh50Var, zaz zazVar) {
        this.b = fh50Var;
        this.c = zazVar;
    }

    @Override // xsna.lsr
    public final Object emit(Object obj, spj spjVar) {
        vax vaxVar = (vax) obj;
        boolean z = vaxVar instanceof lgv;
        fh50<vax> fh50Var = this.b;
        if (z || (vaxVar instanceof pvr) || (vaxVar instanceof o2d0.b)) {
            fh50Var.j(vaxVar);
        } else if (vaxVar instanceof mgv) {
            fh50Var.n(((mgv) vaxVar).a);
        } else if (vaxVar instanceof qvr) {
            fh50Var.n(((qvr) vaxVar).a);
        } else if (vaxVar instanceof o2d0.c) {
            fh50Var.n(((o2d0.c) vaxVar).a);
        } else if (vaxVar instanceof o2d0.a) {
            fh50Var.n(((o2d0.a) vaxVar).a);
        }
        Object[] objArr = fh50Var.a;
        int i = fh50Var.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zaz zazVar = this.c;
            if (i2 >= i) {
                ((wak0) zazVar.b).C(i3);
                return s3q0.a;
            }
            vax vaxVar2 = (vax) objArr[i2];
            if (vaxVar2 instanceof lgv) {
                zazVar.getClass();
                i3 |= 2;
            } else if (vaxVar2 instanceof pvr) {
                zazVar.getClass();
                i3 |= 1;
            } else if (vaxVar2 instanceof o2d0.b) {
                zazVar.getClass();
                i3 |= 4;
            }
            i2++;
        }
    }
}
