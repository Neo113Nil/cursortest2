package xsna;

/* compiled from: SuperappAdBridge.kt */
/* loaded from: classes6.dex */
public final class hel0 {
    public final int a;
    public final String b;
    public final int c;

    public hel0(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hel0)) {
            return false;
        }
        hel0 hel0Var = (hel0) obj;
        return this.a == hel0Var.a && epx.f(this.b, hel0Var.b) && this.c == hel0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "StickyBannerSlotsResult(id=" + this.a + ", tag=" + this.b + ", adSource=" + ((Object) kq01.s(this.c)) + ')';
    }
}
