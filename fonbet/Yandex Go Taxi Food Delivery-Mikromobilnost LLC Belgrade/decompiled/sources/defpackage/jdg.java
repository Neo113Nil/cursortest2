package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jdg {
    public final String a;
    public final h2d0 b;
    public final List c;
    public final List d;

    public jdg(String str, h2d0 h2d0Var, List list, List list2) {
        this.a = str;
        this.b = h2d0Var;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdg)) {
            return false;
        }
        jdg jdgVar = (jdg) obj;
        return jl40.l(this.a, jdgVar.a) && this.b.equals(jdgVar.b) && this.c.equals(jdgVar.c) && this.d.equals(jdgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextProperties(text=");
        sb.append(this.a);
        sb.append(", textDrawableHolder=");
        sb.append(this.b);
        sb.append(", shortcutTextsIcons=");
        sb.append(this.c);
        sb.append(", shortcutStyledTexts=");
        return unr0.t(sb, this.d, ')');
    }
}
