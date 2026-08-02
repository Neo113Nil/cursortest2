package xsna;

/* compiled from: PopupStickersChatSettingsEntity.kt */
/* loaded from: classes5.dex */
public final class hyb0 {
    public final long a;
    public final boolean b;
    public final int c;

    public hyb0(int i, long j, boolean z) {
        this.a = j;
        this.b = z;
        this.c = i;
    }

    public static hyb0 a(hyb0 hyb0Var, boolean z, int i, int i2) {
        long j = hyb0Var.a;
        if ((i2 & 2) != 0) {
            z = hyb0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = hyb0Var.c;
        }
        hyb0Var.getClass();
        return new hyb0(i, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyb0)) {
            return false;
        }
        hyb0 hyb0Var = (hyb0) obj;
        return this.a == hyb0Var.a && this.b == hyb0Var.b && this.c == hyb0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qoy.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupStickersChatSettingsEntity(peerId=");
        sb.append(this.a);
        sb.append(", animationAutoplay=");
        sb.append(this.b);
        sb.append(", countOfInterruptClicks=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ hyb0(long j, int i) {
        this(0, j, (i & 2) != 0);
    }
}
