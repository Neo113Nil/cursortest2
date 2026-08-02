package xsna;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class es40 implements lr40 {
    public final boolean b;

    public es40(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es40) && this.b == ((es40) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SetIsSnippetPreferred(isPreferred="), this.b, ')');
    }
}
