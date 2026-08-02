package xsna;

import xsna.dt1;
import xsna.ejk;
import xsna.q630;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class hor0 extends q630.c implements mi90 {
    public dt1.c p;

    @Override // xsna.mi90
    public final Object N(azl azlVar, Object obj) {
        opg0 opg0Var = obj instanceof opg0 ? (opg0) obj : null;
        if (opg0Var == null) {
            opg0Var = new opg0(0);
        }
        opg0Var.c = new ejk.c(this.p);
        return opg0Var;
    }
}
