package xsna;

/* compiled from: SaveButtonAreaViewState.kt */
/* loaded from: classes16.dex */
public final class w0h0 {
    public static final w0h0 c = new w0h0(false, null);
    public final boolean a;
    public final Integer b;

    public w0h0(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0h0)) {
            return false;
        }
        w0h0 w0h0Var = (w0h0) obj;
        return this.a == w0h0Var.a && epx.f(this.b, w0h0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveButtonAreaViewState(saveEnabled=");
        sb.append(this.a);
        sb.append(", selectedCount=");
        return uqi.b(sb, this.b, ')');
    }
}
