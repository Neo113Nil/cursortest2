package xsna;

/* compiled from: DislikesState.kt */
/* loaded from: classes16.dex */
public final class zbn {
    public final xbn a;
    public final ybn b;

    public zbn() {
        this((xbn) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbn)) {
            return false;
        }
        zbn zbnVar = (zbn) obj;
        return epx.f(this.a, zbnVar.a) && epx.f(this.b, zbnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DislikesState(config=" + this.a + ", content=" + this.b + ')';
    }

    public zbn(xbn xbnVar, ybn ybnVar) {
        this.a = xbnVar;
        this.b = ybnVar;
    }

    public /* synthetic */ zbn(xbn xbnVar, int i) {
        this((i & 1) != 0 ? new xbn(null, 15) : xbnVar, new ybn(0));
    }
}
