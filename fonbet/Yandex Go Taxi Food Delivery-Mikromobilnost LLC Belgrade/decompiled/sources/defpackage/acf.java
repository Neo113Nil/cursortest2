package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class acf extends vtb1 {
    public final it1 a;

    public acf(so5 so5Var) {
        this.a = so5Var;
    }

    @Override // defpackage.vtb1
    public final int b(int i, int i2, LayoutDirection layoutDirection) {
        return this.a.a(i2, i, layoutDirection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acf) && jl40.l(this.a, ((acf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
    }
}
