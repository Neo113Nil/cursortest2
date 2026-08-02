package xsna;

/* compiled from: TaskExecutionMetrics.kt */
/* loaded from: classes.dex */
public final class i5o0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public i5o0(int i, String str, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5o0)) {
            return false;
        }
        i5o0 i5o0Var = (i5o0) obj;
        return this.a == i5o0Var.a && this.b == i5o0Var.b && epx.f(this.c, i5o0Var.c) && epx.f(this.d, i5o0Var.d) && epx.f(this.e, i5o0Var.e) && epx.f(this.f, i5o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskExecutionMetrics(executionTime=");
        sb.append(this.a);
        sb.append(", availableTime=");
        sb.append(this.b);
        sb.append(", taskName=");
        sb.append(this.c);
        sb.append(", stepKey=");
        sb.append(this.d);
        sb.append(", threadType=");
        sb.append(this.e);
        sb.append(", executorType=");
        return ho8.a(sb, this.f, ')');
    }
}
