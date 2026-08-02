package xsna;

/* compiled from: GameWithBadgeInfo.kt */
/* loaded from: classes17.dex */
public final class i8t {
    public final int a;
    public final int b;
    public final p7t c;

    public i8t(int i, int i2, p7t p7tVar) {
        this.a = i;
        this.b = i2;
        this.c = p7tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8t)) {
            return false;
        }
        i8t i8tVar = (i8t) obj;
        return this.a == i8tVar.a && this.b == i8tVar.b && epx.f(this.c, i8tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "GameWithBadgeInfo(innerIndex=" + this.a + ", innerRow=" + this.b + ", size=" + this.c + ')';
    }
}
