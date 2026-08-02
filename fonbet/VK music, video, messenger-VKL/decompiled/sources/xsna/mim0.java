package xsna;

/* compiled from: StoryStickerTabStyle.kt */
/* loaded from: classes16.dex */
public final class mim0 {
    public final Integer a;
    public final Integer b;

    public mim0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mim0)) {
            return false;
        }
        mim0 mim0Var = (mim0) obj;
        return epx.f(this.a, mim0Var.a) && epx.f(this.b, mim0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStickerTabStyle(icon=");
        sb.append(this.a);
        sb.append(", accessibilityStringRes=");
        return uqi.b(sb, this.b, ')');
    }
}
