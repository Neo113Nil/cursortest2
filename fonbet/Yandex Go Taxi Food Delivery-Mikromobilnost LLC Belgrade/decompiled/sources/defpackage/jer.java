package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class jer implements p651 {
    public final int a;
    public final int b;

    public jer(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.p651
    public final int a(fwi fwiVar) {
        return this.b;
    }

    @Override // defpackage.p651
    public final int b(fwi fwiVar, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // defpackage.p651
    public final int c(fwi fwiVar) {
        return this.a;
    }

    @Override // defpackage.p651
    public final int d(fwi fwiVar, LayoutDirection layoutDirection) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jer)) {
            return false;
        }
        jer jerVar = (jer) obj;
        return this.a == jerVar.a && this.b == jerVar.b;
    }

    public final int hashCode() {
        return (this.a * 961) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=0, top=");
        sb.append(this.a);
        sb.append(", right=0, bottom=");
        return oyr.s(sb, this.b, ')');
    }
}
