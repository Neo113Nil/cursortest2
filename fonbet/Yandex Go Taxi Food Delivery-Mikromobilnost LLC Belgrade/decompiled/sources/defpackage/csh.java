package defpackage;

/* loaded from: classes10.dex */
public final class csh implements zkn {
    public final int a;
    public final int b;

    public csh(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        jxv.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        int i = zi6Var.c;
        yi6 yi6Var = (yi6) zi6Var.y;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = yi6Var.h();
        }
        zi6Var.d(zi6Var.c, Math.min(i3, yi6Var.h()));
        int i4 = zi6Var.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        zi6Var.d(Math.max(0, i6), zi6Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csh)) {
            return false;
        }
        csh cshVar = (csh) obj;
        return this.a == cshVar.a && this.b == cshVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return oyr.s(sb, this.b, ')');
    }
}
