package xsna;

/* compiled from: ImmutableHolder.kt */
@vby
/* loaded from: classes17.dex */
public final class qow<T> {
    public final T a;

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String b(Object obj) {
        return "ImmutableHolder(item=" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qow) {
            return epx.f(this.a, ((qow) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return a(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
