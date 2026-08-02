package xsna;

/* compiled from: LegacyCatalogVideoSlotInfo.kt */
/* loaded from: classes6.dex */
public final class l0z implements jht0 {
    public final iht0 a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public l0z(iht0 iht0Var, boolean z, String str, boolean z2) {
        this.a = iht0Var;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    @Override // xsna.jht0
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0z)) {
            return false;
        }
        l0z l0zVar = (l0z) obj;
        return epx.f(this.a, l0zVar.a) && this.b == l0zVar.b && epx.f(this.c, l0zVar.c) && this.d == l0zVar.d;
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // xsna.jht0
    public final boolean isActive() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyCatalogVideoSlotInfo(videoSlot=");
        sb.append(this.a);
        sb.append(", isActive=");
        sb.append(this.b);
        sb.append(", currentVideoId=");
        sb.append(this.c);
        sb.append(", focused=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
