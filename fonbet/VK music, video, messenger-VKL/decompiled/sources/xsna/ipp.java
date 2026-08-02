package xsna;

/* compiled from: EnterProfileContract.kt */
/* loaded from: classes15.dex */
public final class ipp implements gpp {
    public final String b;

    public ipp(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipp) && epx.f(this.b, ((ipp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ServerErrorType(text="), this.b, ')');
    }
}
