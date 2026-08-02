package xsna;

/* compiled from: AvatarColorScheme.kt */
/* loaded from: classes17.dex */
public final class nq5 {
    public final long a;
    public final long b;

    public nq5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq5)) {
            return false;
        }
        nq5 nq5Var = (nq5) obj;
        return l5g.d(this.a, nq5Var.a) && l5g.d(this.b, nq5Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarColorScheme(avatarOverlay=");
        dn.h(this.a, ", avatarOverlayInverseAlpha=", sb);
        return pm0.d(')', this.b, sb);
    }
}
