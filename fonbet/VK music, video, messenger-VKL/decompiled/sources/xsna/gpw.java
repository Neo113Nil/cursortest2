package xsna;

/* compiled from: ImmutableQualityInfo.java */
/* loaded from: classes12.dex */
public final class gpw implements cpe0 {
    public static final gpw d = a(Integer.MAX_VALUE, true, true);
    public int a;
    public boolean b;
    public boolean c;

    public static gpw a(int i, boolean z, boolean z2) {
        gpw gpwVar = new gpw();
        gpwVar.a = i;
        gpwVar.b = z;
        gpwVar.c = z2;
        return gpwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gpw)) {
            return false;
        }
        gpw gpwVar = (gpw) obj;
        return this.a == gpwVar.a && this.b == gpwVar.b && this.c == gpwVar.c;
    }

    public final int hashCode() {
        return (this.a ^ (this.b ? 4194304 : 0)) ^ (this.c ? 8388608 : 0);
    }
}
