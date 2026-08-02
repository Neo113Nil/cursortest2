package xsna;

/* compiled from: EditCommand.kt */
/* loaded from: classes11.dex */
public final class ivl implements pzo {
    public final int a;
    public final int b;

    public ivl(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        vzw.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // xsna.pzo
    public final void a(c2p c2pVar) {
        int i = c2pVar.c;
        mk90 mk90Var = c2pVar.a;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = mk90Var.a();
        }
        c2pVar.a(c2pVar.c, Math.min(i3, mk90Var.a()));
        int i4 = c2pVar.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        c2pVar.a(Math.max(0, i6), c2pVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivl)) {
            return false;
        }
        ivl ivlVar = (ivl) obj;
        return this.a == ivlVar.a && this.b == ivlVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vu5.b(sb, this.b, ')');
    }
}
