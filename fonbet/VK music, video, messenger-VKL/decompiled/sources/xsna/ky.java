package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.iy;
import xsna.my;

/* compiled from: ActionButtonsReducer.kt */
/* loaded from: classes4.dex */
public final class ky extends dm50<oy, iy, my> {
    public final qy d;

    public ky(my.a aVar, qy qyVar) {
        super(aVar);
        this.d = qyVar;
    }

    @Override // xsna.dm50
    public final my c(my myVar, iy iyVar) {
        my myVar2 = myVar;
        iy iyVar2 = iyVar;
        if (iyVar2 instanceof iy.b) {
            iy.b bVar = (iy.b) iyVar2;
            if (myVar2 instanceof my.a) {
                return my.a.a((my.a) myVar2, null, bVar.b, 3);
            }
        } else {
            if (!(iyVar2 instanceof iy.a)) {
                throw new NoWhenBranchMatchedException();
            }
            iy.a aVar = (iy.a) iyVar2;
            if (myVar2 instanceof my.a) {
                return my.a.a((my.a) myVar2, aVar.b, null, 5);
            }
        }
        return myVar2;
    }

    @Override // xsna.dm50
    public final oy d() {
        return new oy(e(new db(3)), e(new jy(this, 0)));
    }

    @Override // xsna.dm50
    public final void h(my myVar, oy oyVar) {
        my myVar2 = myVar;
        oy oyVar2 = oyVar;
        if (!(myVar2 instanceof my.a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(oyVar2.b, myVar2);
    }
}
