package xsna;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes.dex */
public final class qkr {
    public final String a;

    public qkr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkr) && epx.f(this.a, ((qkr) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
