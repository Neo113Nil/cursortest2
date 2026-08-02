package xsna;

/* compiled from: IdeasStoryState.kt */
/* loaded from: classes6.dex */
public final class vya0 {
    public final boolean a;
    public final boolean b;

    public vya0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static vya0 a(vya0 vya0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = vya0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = vya0Var.b;
        }
        vya0Var.getClass();
        vya0Var.getClass();
        return new vya0(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vya0)) {
            return false;
        }
        vya0 vya0Var = (vya0) obj;
        return this.a == vya0Var.a && this.b == vya0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(8000L) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState(isPlaying=");
        sb.append(this.a);
        sb.append(", isSelectedInPager=");
        return n23.b(sb, this.b, ", durationMs=8000)");
    }
}
