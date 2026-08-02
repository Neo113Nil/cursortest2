package xsna;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class iu40 implements fu40 {
    public final boolean b;

    public iu40(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu40) && this.b == ((iu40) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SetIsSnippetPreferred(isSnippedPreferred="), this.b, ')');
    }
}
