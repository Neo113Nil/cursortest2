package xsna;

/* compiled from: MviTaskId.kt */
/* loaded from: classes3.dex */
public final class in50<T> implements on50 {
    public final rfc a;

    public in50(rfc rfcVar) {
        this.a = rfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in50) && this.a.equals(((in50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MviTaskClassId(kClass=" + this.a + ')';
    }
}
