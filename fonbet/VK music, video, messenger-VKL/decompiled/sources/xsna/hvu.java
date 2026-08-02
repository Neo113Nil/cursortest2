package xsna;

/* compiled from: HashtagSearchItem.kt */
/* loaded from: classes18.dex */
public final class hvu {
    public final String a;

    public hvu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvu) && epx.f(this.a, ((hvu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("HashtagSearchItem(result="), this.a, ')');
    }
}
