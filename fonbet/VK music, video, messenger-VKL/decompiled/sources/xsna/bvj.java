package xsna;

/* compiled from: GalvitaLayoutParams.kt */
/* loaded from: classes17.dex */
public final class bvj {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public bvj() {
        this(15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvj)) {
            return false;
        }
        bvj bvjVar = (bvj) obj;
        return this.a == bvjVar.a && this.b == bvjVar.b && this.c == bvjVar.c && this.d == bvjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CornersState(roundLeftTop=");
        sb.append(this.a);
        sb.append(", roundRightTop=");
        sb.append(this.b);
        sb.append(", roundRightBottom=");
        sb.append(this.c);
        sb.append(", roundLeftBottom=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ bvj(int i) {
        this((i & 1) != 0, (i & 2) != 0, (i & 4) != 0, (i & 8) != 0);
    }

    public bvj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
