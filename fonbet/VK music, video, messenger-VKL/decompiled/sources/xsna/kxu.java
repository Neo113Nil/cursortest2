package xsna;

/* compiled from: StickerWordsItem.kt */
/* loaded from: classes6.dex */
public final class kxu extends qmc {
    public final int c;

    public kxu(int i) {
        super(1);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxu) && this.c == ((kxu) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("HeaderItem(titleRes="), this.c, ')');
    }
}
