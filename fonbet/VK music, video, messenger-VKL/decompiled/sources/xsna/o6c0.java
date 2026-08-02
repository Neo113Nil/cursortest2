package xsna;

/* compiled from: PostParams.kt */
/* loaded from: classes4.dex */
public final class o6c0 {
    public final String a;

    public o6c0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6c0) && epx.f(this.a, ((o6c0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PostParams(postTooltipTitle="), this.a, ')');
    }

    public o6c0(String str) {
        this.a = str;
    }
}
