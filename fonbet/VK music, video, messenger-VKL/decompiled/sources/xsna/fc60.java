package xsna;

/* compiled from: NewsMonothemeState.kt */
/* loaded from: classes17.dex */
public final class fc60 {
    public final boolean a;

    public fc60(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc60) && this.a == ((fc60) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("NewsMonothemeState(hasBeenAnimated="), this.a, ')');
    }
}
