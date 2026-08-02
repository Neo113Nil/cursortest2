package xsna;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public final class yoa {
    public final int a;
    public final tlo0 b;
    public final Integer c;

    public yoa(int i, tlo0 tlo0Var, Integer num) {
        this.a = i;
        this.b = tlo0Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoa)) {
            return false;
        }
        yoa yoaVar = (yoa) obj;
        return this.a == yoaVar.a && epx.f(this.b, yoaVar.b) && epx.f(this.c, yoaVar.c);
    }

    public final int hashCode() {
        int a = com.vk.movika.sdk.base.model.history.b.a(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CellSuggestItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", icon=");
        return uqi.b(sb, this.c, ')');
    }
}
