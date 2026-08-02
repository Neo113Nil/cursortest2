package xsna;

/* compiled from: AsyncInflateConfig.kt */
/* loaded from: classes2.dex */
public final class my3 {
    public final int a;
    public final Integer b;

    public my3(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my3)) {
            return false;
        }
        my3 my3Var = (my3) obj;
        return this.a == my3Var.a && epx.f(this.b, my3Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return (hashCode + (num == null ? 0 : num.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncInflateConfig(viewId=");
        sb.append(this.a);
        sb.append(", tempLayoutId=");
        return oq.b(sb, this.b, ", tempViewFactory=null)");
    }
}
