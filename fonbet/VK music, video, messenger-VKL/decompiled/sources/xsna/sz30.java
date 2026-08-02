package xsna;

/* compiled from: MsgShareContext.kt */
/* loaded from: classes2.dex */
public final class sz30 {
    public final boolean a;

    public sz30() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz30) && this.a == ((sz30) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("MsgShareContext(isHighlightRepostToStoryButton="), this.a, ')');
    }

    public sz30(boolean z) {
        this.a = z;
    }
}
