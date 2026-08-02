package defpackage;

/* loaded from: classes2.dex */
public final class gpu {
    public final String a;
    public final y0e b;

    public gpu(String str, y0e y0eVar) {
        this.a = str;
        this.b = y0eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpu)) {
            return false;
        }
        gpu gpuVar = (gpu) obj;
        return this.a.equals(gpuVar.a) && this.b.equals(gpuVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Configuration(__typename=" + this.a + ", configurationFragment=" + this.b + ')';
    }
}
