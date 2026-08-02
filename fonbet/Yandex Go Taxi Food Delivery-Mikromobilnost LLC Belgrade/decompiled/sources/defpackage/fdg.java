package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class fdg {
    public final PlusColor.Color a;
    public final String b;
    public final h2d0 c;

    public fdg(PlusColor.Color color, String str, h2d0 h2d0Var) {
        this.a = color;
        this.b = str;
        this.c = h2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdg)) {
            return false;
        }
        fdg fdgVar = (fdg) obj;
        return this.a.equals(fdgVar.a) && this.b.equals(fdgVar.b) && jl40.l(this.c, fdgVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        h2d0 h2d0Var = this.c;
        return b + (h2d0Var == null ? 0 : h2d0Var.hashCode());
    }

    public final String toString() {
        return "BadgeProperties(backgroundColor=" + this.a + ", text=" + this.b + ", textDrawableHolder=" + this.c + ')';
    }
}
