package xsna;

/* compiled from: MessageTranslateActionItem.kt */
/* loaded from: classes6.dex */
public final class kb20 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public kb20(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb20)) {
            return false;
        }
        kb20 kb20Var = (kb20) obj;
        return this.a == kb20Var.a && this.b == kb20Var.b && this.c == kb20Var.c && this.d == kb20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageTranslateActionItem(actionId=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", clickable=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
