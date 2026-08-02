package xsna;

/* compiled from: EventData.kt */
/* loaded from: classes11.dex */
public final class eta0 {
    public final String a;

    public eta0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eta0) && epx.f(this.a, ((eta0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Platform(value="), this.a, ')');
    }
}
