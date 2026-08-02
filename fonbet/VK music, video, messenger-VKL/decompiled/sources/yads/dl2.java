package yads;

/* loaded from: classes10.dex */
public final class dl2 {
    public final int a;
    public final boolean b;

    public dl2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dl2.class == obj.getClass()) {
            dl2 dl2Var = (dl2) obj;
            if (this.a == dl2Var.a && this.b == dl2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
