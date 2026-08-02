package xsna;

/* compiled from: ErrorCommand.kt */
/* loaded from: classes2.dex */
public final class h8l extends avp {
    public final String a;

    public h8l(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8l) && epx.f(this.a, ((h8l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("DecoderFail(decoder="), this.a, ')');
    }
}
