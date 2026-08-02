package xsna;

/* compiled from: PlaylistsToTracksOldEntity.kt */
/* loaded from: classes3.dex */
public final class vfb0 {
    public final int a;
    public final String b;
    public final String c;

    /* compiled from: PlaylistsToTracksOldEntity.kt */
    public static final class a {
        public static ufb0 a(vfb0 vfb0Var) {
            return new ufb0(String.valueOf(vfb0Var.a), vfb0Var.b, vfb0Var.c);
        }
    }

    public vfb0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfb0)) {
            return false;
        }
        vfb0 vfb0Var = (vfb0) obj;
        return this.a == vfb0Var.a && epx.f(this.b, vfb0Var.b) && epx.f(this.c, vfb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistsToTracksOldEntity(uid=");
        sb.append(this.a);
        sb.append(", mid=");
        sb.append(this.b);
        sb.append(", pid=");
        return ho8.a(sb, this.c, ')');
    }
}
