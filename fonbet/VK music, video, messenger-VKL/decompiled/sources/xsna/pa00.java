package xsna;

/* compiled from: LyricsListItem.kt */
/* loaded from: classes3.dex */
public final class pa00 extends ja00 {
    public final String a;

    public pa00(String str) {
        this.a = str;
    }

    @Override // xsna.ja00
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa00) && epx.f(this.a, ((pa00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("LyricsListItemStaticLine(line="), this.a, ')');
    }
}
