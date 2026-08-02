package xsna;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class gl8 {
    public static final gl8 c = new gl8(0, 0);
    public final int a;
    public final int b;

    public gl8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl8)) {
            return false;
        }
        gl8 gl8Var = (gl8) obj;
        return this.a == gl8Var.a && this.b == gl8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleColor(defaultColor=");
        sb.append(this.a);
        sb.append(", selectedColor=");
        return vu5.b(sb, this.b, ')');
    }
}
