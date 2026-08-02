package xsna;

/* compiled from: CheckAccessResponse.kt */
/* loaded from: classes6.dex */
public final class c0c {
    public final String a;

    public c0c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0c) && epx.f(this.a, ((c0c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CheckAccessResponse(token="), this.a, ')');
    }
}
