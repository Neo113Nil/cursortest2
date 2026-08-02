package xsna;

/* compiled from: CommunityActionButtonModel.kt */
/* loaded from: classes5.dex */
public final class dpg {
    public final int a;
    public final int b;

    public dpg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpg)) {
            return false;
        }
        dpg dpgVar = (dpg) obj;
        return this.a == dpgVar.a && this.b == dpgVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityActionButtonIconModel(iconResId=");
        sb.append(this.a);
        sb.append(", iconTintResId=");
        return vu5.b(sb, this.b, ')');
    }
}
