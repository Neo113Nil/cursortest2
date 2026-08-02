package xsna;

/* compiled from: VkRunStepsResponse.kt */
/* loaded from: classes6.dex */
public final class ghv0 {
    public final int a;
    public final float b;

    public ghv0(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final float a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghv0)) {
            return false;
        }
        ghv0 ghv0Var = (ghv0) obj;
        return this.a == ghv0Var.a && Float.compare(this.b, ghv0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunStepsResponse(steps=");
        sb.append(this.a);
        sb.append(", distanceKm=");
        return xq.c(')', this.b, sb);
    }
}
