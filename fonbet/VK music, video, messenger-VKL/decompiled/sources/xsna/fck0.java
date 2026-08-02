package xsna;

import xsna.fu80;
import xsna.go4;

/* compiled from: SnippetPlayerConfig.kt */
/* loaded from: classes3.dex */
public final class fck0 {
    public final go4 a;
    public final fu80 b;

    public fck0() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fck0)) {
            return false;
        }
        fck0 fck0Var = (fck0) obj;
        return epx.f(this.a, fck0Var.a) && epx.f(this.b, fck0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Default(audioFocusManagerConfig=" + this.a + ", orchestraPartConfig=" + this.b + ", allowBackgroundPlayback=false)";
    }

    public fck0(go4.a aVar, fu80.a aVar2, int i) {
        aVar = (i & 1) != 0 ? new go4.a(3) : aVar;
        aVar2 = (i & 2) != 0 ? new fu80.a(true, true) : aVar2;
        this.a = aVar;
        this.b = aVar2;
    }
}
