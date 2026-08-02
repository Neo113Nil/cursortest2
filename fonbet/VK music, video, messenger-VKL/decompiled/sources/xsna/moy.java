package xsna;

import xsna.q630;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes11.dex */
public final class moy extends q630.c implements noy {
    public yzs<? super ep10, ? super zo10, ? super o6j, ? extends dp10> p;

    public moy() {
        throw null;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        return this.p.invoke(ep10Var, zo10Var, new o6j(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.p + ')';
    }
}
