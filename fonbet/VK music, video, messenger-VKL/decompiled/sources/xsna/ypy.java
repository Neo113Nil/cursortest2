package xsna;

import xsna.q630;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class ypy extends q630.c implements mi90 {
    public float p;
    public boolean q;

    @Override // xsna.mi90
    public final Object N(azl azlVar, Object obj) {
        opg0 opg0Var = obj instanceof opg0 ? (opg0) obj : null;
        if (opg0Var == null) {
            opg0Var = new opg0(0);
        }
        opg0Var.a = this.p;
        opg0Var.b = this.q;
        return opg0Var;
    }
}
