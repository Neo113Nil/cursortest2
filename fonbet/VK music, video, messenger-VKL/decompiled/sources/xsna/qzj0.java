package xsna;

import xsna.q630;

/* compiled from: SkipContainer.kt */
/* loaded from: classes3.dex */
public final class qzj0 extends q630.c implements mi90 {
    public boolean p;

    @Override // xsna.mi90
    public final Object N(azl azlVar, Object obj) {
        kzj0 kzj0Var = obj instanceof kzj0 ? (kzj0) obj : null;
        if (kzj0Var == null) {
            kzj0Var = new kzj0(0);
        }
        kzj0Var.a = this.p;
        return kzj0Var;
    }
}
