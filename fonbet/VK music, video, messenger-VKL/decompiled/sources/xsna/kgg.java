package xsna;

/* compiled from: CommentsUiData.kt */
/* loaded from: classes17.dex */
public final class kgg {
    public final Boolean a;

    public kgg() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgg) && epx.f(this.a, ((kgg) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("CommentsUiData(progress="), this.a, ')');
    }

    public kgg(Boolean bool) {
        this.a = bool;
    }
}
