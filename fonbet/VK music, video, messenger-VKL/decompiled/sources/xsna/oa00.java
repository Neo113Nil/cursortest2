package xsna;

/* compiled from: LyricsListItem.kt */
/* loaded from: classes3.dex */
public final class oa00 extends ja00 {
    public final int a;

    public oa00(int i) {
        this.a = i;
    }

    @Override // xsna.ja00
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa00) && this.a == ((oa00) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("LyricsListItemPlaceholder(height="), this.a, ')');
    }
}
