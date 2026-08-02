package xsna;

import xsna.hbo0;

/* compiled from: ChatHeaderInfoMenuState.kt */
/* loaded from: classes16.dex */
public final class srb {
    public final int a;
    public final hbo0.a b;
    public final q720 c;

    public srb(int i, hbo0.a aVar, q720 q720Var) {
        this.a = i;
        this.b = aVar;
        this.c = q720Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srb)) {
            return false;
        }
        srb srbVar = (srb) obj;
        return this.a == srbVar.a && this.b.equals(srbVar.b) && this.c.equals(srbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ChatHeaderMenuItem(id=" + this.a + ", title=" + this.b + ", icon=" + this.c + ')';
    }
}
