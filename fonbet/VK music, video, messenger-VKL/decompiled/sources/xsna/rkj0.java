package xsna;

import xsna.ejk;
import xsna.it1;
import xsna.q630;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public abstract class rkj0 extends q630.c implements mi90 {

    /* compiled from: RowColumnImpl.kt */
    public static final class a extends rkj0 {
        public gt1 p;

        @Override // xsna.mi90
        public final Object N(azl azlVar, Object obj) {
            opg0 opg0Var = obj instanceof opg0 ? (opg0) obj : null;
            if (opg0Var == null) {
                opg0Var = new opg0(0);
            }
            opg0Var.c = new ejk.a(new it1.a(this.p));
            return opg0Var;
        }
    }
}
