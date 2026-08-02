package xsna;

/* compiled from: ClipCarouselAttachesState.kt */
/* loaded from: classes17.dex */
public final class umc {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public umc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umc)) {
            return false;
        }
        umc umcVar = (umc) obj;
        return this.a == umcVar.a && this.b == umcVar.b && this.c == umcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCarouselAttachesState(carouselClosed=");
        sb.append(this.a);
        sb.append(", carouselWasShown=");
        sb.append(this.b);
        sb.append(", showByTimer=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
