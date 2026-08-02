package defpackage;

/* loaded from: classes10.dex */
public final class dsh implements zkn {
    public final int a;
    public final int b;

    public dsh(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        jxv.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.zkn
    public final void a(zi6 zi6Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = zi6Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(zi6Var.g((i5 - i4) + (-1))) && Character.isLowSurrogate(zi6Var.g(zi6Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = zi6Var.c;
            yi6 yi6Var = (yi6) zi6Var.y;
            if (i8 + i7 >= yi6Var.h()) {
                i6 = yi6Var.h() - zi6Var.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(zi6Var.g((zi6Var.c + i7) + (-1))) && Character.isLowSurrogate(zi6Var.g(zi6Var.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = zi6Var.c;
        zi6Var.d(i9, i6 + i9);
        int i10 = zi6Var.b;
        zi6Var.d(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsh)) {
            return false;
        }
        dsh dshVar = (dsh) obj;
        return this.a == dshVar.a && this.b == dshVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return oyr.s(sb, this.b, ')');
    }
}
