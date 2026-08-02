package xsna;

/* compiled from: TabbarSettingsMainItem.kt */
/* loaded from: classes6.dex */
public final class gzo0 {
    public final Integer a;
    public final String b;

    public gzo0() {
        this(3, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzo0)) {
            return false;
        }
        gzo0 gzo0Var = (gzo0) obj;
        return epx.f(this.a, gzo0Var.a) && epx.f(this.b, gzo0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleData(titleRes=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ gzo0(int i, Integer num) {
        this((i & 1) != 0 ? null : num, (String) null);
    }

    public gzo0(Integer num, String str) {
        this.a = num;
        this.b = str;
    }
}
