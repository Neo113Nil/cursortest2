package xsna;

import xsna.tlo0;

/* compiled from: ImCallBubble.kt */
/* loaded from: classes2.dex */
public final class byv {
    public final tlo0.h a;
    public final y4 b;

    public byv(tlo0.h hVar, y4 y4Var) {
        this.a = hVar;
        this.b = y4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byv)) {
            return false;
        }
        byv byvVar = (byv) obj;
        return this.a.equals(byvVar.a) && this.b.equals(byvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(text=" + this.a + ", onClick=" + this.b + ')';
    }
}
