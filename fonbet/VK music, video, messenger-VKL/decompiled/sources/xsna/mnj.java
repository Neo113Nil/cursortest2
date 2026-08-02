package xsna;

/* compiled from: ContextMenuUi.kt */
/* loaded from: classes11.dex */
public final class mnj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public mnj(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mnj)) {
            return false;
        }
        mnj mnjVar = (mnj) obj;
        return l5g.d(this.a, mnjVar.a) && l5g.d(this.b, mnjVar.b) && l5g.d(this.c, mnjVar.c) && l5g.d(this.d, mnjVar.d) && l5g.d(this.e, mnjVar.e);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.e) + bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        dn.h(this.a, ", textColor=", sb);
        dn.h(this.b, ", iconColor=", sb);
        dn.h(this.c, ", disabledTextColor=", sb);
        dn.h(this.d, ", disabledIconColor=", sb);
        return pm0.d(')', this.e, sb);
    }
}
