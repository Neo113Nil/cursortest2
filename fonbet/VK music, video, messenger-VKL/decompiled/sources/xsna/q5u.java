package xsna;

/* compiled from: GoodPreviewButtonsItemRefactored.kt */
/* loaded from: classes18.dex */
public final class q5u implements n4d0 {
    public final k7u b;
    public final r3d0 c;

    public q5u(k7u k7uVar, r3d0 r3d0Var) {
        this.b = k7uVar;
        this.c = r3d0Var;
    }

    @Override // xsna.n4d0
    public final int N9() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5u)) {
            return false;
        }
        q5u q5uVar = (q5u) obj;
        return epx.f(this.b, q5uVar.b) && this.c.equals(q5uVar.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(4) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GoodPreviewButtonsItemRefactored(good=" + this.b + ", previewButtonsState=" + this.c + ", blockType=4)";
    }
}
