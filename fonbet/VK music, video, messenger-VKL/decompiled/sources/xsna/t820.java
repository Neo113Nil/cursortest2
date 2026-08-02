package xsna;

/* compiled from: MenuViewItemUiData.kt */
/* loaded from: classes3.dex */
public final class t820 {
    public final int a;
    public final int b;
    public final Object c;

    public t820(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t820)) {
            return false;
        }
        t820 t820Var = (t820) obj;
        return this.a == t820Var.a && this.b == t820Var.b && epx.f(this.c, t820Var.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Object obj = this.c;
        return a + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuViewItemUiData(itemViewType=");
        sb.append(this.a);
        sb.append(", itemId=");
        sb.append(this.b);
        sb.append(", bindObject=");
        return k73.c(sb, this.c, ')');
    }
}
