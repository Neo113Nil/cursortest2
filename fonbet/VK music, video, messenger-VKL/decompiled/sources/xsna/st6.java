package xsna;

import xsna.mt6;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class st6 implements kgn {
    public final /* synthetic */ mt6 a;

    public st6(mt6 mt6Var) {
        this.a = mt6Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        mt6.a aVar = (mt6.a) ((zak0) this.a.c).getValue();
        if (aVar != null) {
            aVar.close();
        }
    }
}
