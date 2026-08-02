package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class jvl implements pzo {
    public final int a;
    public final int b;

    public jvl(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        vzw.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = c2pVar.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(c2pVar.b((i5 - i4) + (-1))) && Character.isLowSurrogate(c2pVar.b(c2pVar.b - i4))) ? i3 + 2 : i4;
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
            int i8 = c2pVar.c;
            mk90 mk90Var = c2pVar.a;
            if (i8 + i7 >= mk90Var.a()) {
                i6 = mk90Var.a() - c2pVar.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(c2pVar.b((c2pVar.c + i7) + (-1))) && Character.isLowSurrogate(c2pVar.b(c2pVar.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = c2pVar.c;
        c2pVar.a(i9, i6 + i9);
        int i10 = c2pVar.b;
        c2pVar.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvl)) {
            return false;
        }
        jvl jvlVar = (jvl) obj;
        return this.a == jvlVar.a && this.b == jvlVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vu5.b(sb, this.b, ')');
    }
}
