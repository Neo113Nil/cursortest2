package defpackage;

/* loaded from: classes10.dex */
public final class i750 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public i750(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i750.class == obj.getClass()) {
            i750 i750Var = (i750) obj;
            return this.c == i750Var.c && this.d == i750Var.d && this.b == i750Var.b && this.a == i750Var.a && this.e == i750Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + oyr.b(this.a, g8e.c(this.b, g8e.c(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", swipeEdge=");
        sb.append(this.a);
        sb.append(", frameTimeMillis=");
        return b64.o(sb, this.e, ')');
    }

    public i750() {
        this(0.0f, 0.0f, 0.0f, 2, 0L);
    }
}
