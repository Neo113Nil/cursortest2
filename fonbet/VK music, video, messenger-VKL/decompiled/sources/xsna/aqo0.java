package xsna;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class aqo0<T> {
    public final T a;
    public final T b;

    /* JADX WARN: Multi-variable type inference failed */
    public aqo0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqo0)) {
            return false;
        }
        aqo0 aqo0Var = (aqo0) obj;
        return epx.f(this.a, aqo0Var.a) && epx.f(this.b, aqo0Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemedValueVs(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return k73.c(sb, this.b, ')');
    }
}
