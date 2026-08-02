package defpackage;

/* loaded from: classes2.dex */
public final class ipu implements za70 {
    public final gpu a;
    public final hpu b;

    public ipu(gpu gpuVar, hpu hpuVar) {
        this.a = gpuVar;
        this.b = hpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipu)) {
            return false;
        }
        ipu ipuVar = (ipu) obj;
        return this.a.equals(ipuVar.a) && this.b.equals(ipuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(configuration=" + this.a + ", darkConfiguration=" + this.b + ')';
    }
}
