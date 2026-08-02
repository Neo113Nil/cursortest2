package xsna;

/* compiled from: ObtainVerificationEvent.kt */
/* loaded from: classes18.dex */
public final class tr70 implements ur70 {
    public final String a;

    public tr70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr70) && epx.f(this.a, ((tr70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
    }
}
