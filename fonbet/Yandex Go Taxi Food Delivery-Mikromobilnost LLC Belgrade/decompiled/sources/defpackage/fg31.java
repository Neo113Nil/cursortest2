package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fg31 {
    public final int a;
    public final bpl0 b;
    public final boolean c;
    public final jjp0 d;

    public fg31(int i, bpl0 bpl0Var, boolean z, jjp0 jjp0Var) {
        this.a = i;
        this.b = bpl0Var;
        this.c = z;
        this.d = jjp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg31)) {
            return false;
        }
        fg31 fg31Var = (fg31) obj;
        return this.a == fg31Var.a && this.b.equals(fg31Var.b) && this.c == fg31Var.c && this.d.equals(fg31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        return "VerticalSelectorUiState(selectedVerticalIndex=" + this.a + ", verticals=" + this.b + ", isVisible=" + this.c + ", scrollTypeUiState=" + this.d + Extension.C_BRAKE;
    }
}
