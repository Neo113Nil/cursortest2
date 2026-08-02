package defpackage;

/* loaded from: classes2.dex */
public final class hpu {
    public final String a;
    public final wdg b;

    public hpu(String str, wdg wdgVar) {
        this.a = str;
        this.b = wdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpu)) {
            return false;
        }
        hpu hpuVar = (hpu) obj;
        return this.a.equals(hpuVar.a) && this.b.equals(hpuVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DarkConfiguration(__typename=" + this.a + ", darkConfigurationFragment=" + this.b + ')';
    }
}
