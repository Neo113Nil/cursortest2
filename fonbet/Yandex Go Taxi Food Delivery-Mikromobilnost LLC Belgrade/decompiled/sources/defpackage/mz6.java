package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class mz6 {
    public final String a;
    public final h2d0 b;
    public final PlusColor c;

    public mz6(String str, h2d0 h2d0Var, PlusColor plusColor) {
        this.a = str;
        this.b = h2d0Var;
        this.c = plusColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz6)) {
            return false;
        }
        mz6 mz6Var = (mz6) obj;
        return jl40.l(this.a, mz6Var.a) && this.b.equals(mz6Var.b) && this.c.equals(mz6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonContent(text=" + this.a + ", textDrawableHolder=" + this.b + ", backgroundColor=" + this.c + ')';
    }
}
