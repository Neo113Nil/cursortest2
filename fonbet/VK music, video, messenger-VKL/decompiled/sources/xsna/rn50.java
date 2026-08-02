package xsna;

/* compiled from: MviTaskId.kt */
/* loaded from: classes3.dex */
public final class rn50 implements on50 {
    public final String a;

    public rn50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn50) && epx.f(this.a, ((rn50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MviTaskStringId(id="), this.a, ')');
    }
}
