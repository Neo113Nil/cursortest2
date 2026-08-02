package xsna;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class h6w0 extends z6w0 {
    public final int b;

    public h6w0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6w0) && this.b == ((h6w0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) * 31;
    }

    public final String toString() {
        return h5s.c(this.b, ", firstNameGen=null)", new StringBuilder("VmojiCharacterCaptionItem(titleResId="));
    }
}
