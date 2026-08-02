package xsna;

/* compiled from: ProfileFabState.kt */
/* loaded from: classes5.dex */
public final class cwd0 {
    public final int a;
    public final int b;
    public final Integer c;

    public cwd0(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwd0)) {
            return false;
        }
        cwd0 cwd0Var = (cwd0) obj;
        return this.a == cwd0Var.a && this.b == cwd0Var.b && epx.f(this.c, cwd0Var.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeftButton(textId=");
        sb.append(this.a);
        sb.append(", customIcon=");
        sb.append(this.b);
        sb.append(", count=");
        return uqi.b(sb, this.c, ')');
    }
}
