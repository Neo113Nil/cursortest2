package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class bcf extends vtb1 {
    public final to5 a;

    public bcf(to5 to5Var) {
        this.a = to5Var;
    }

    @Override // defpackage.vtb1
    public final int b(int i, int i2, LayoutDirection layoutDirection) {
        return this.a.a(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcf) && jl40.l(this.a, ((bcf) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
    }
}
