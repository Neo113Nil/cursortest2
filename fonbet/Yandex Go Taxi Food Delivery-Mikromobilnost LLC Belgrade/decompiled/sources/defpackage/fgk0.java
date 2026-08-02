package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fgk0 {
    public final boolean a;
    public final long b;
    public final long c;

    public fgk0(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public static fgk0 a(fgk0 fgk0Var, boolean z, long j, int i) {
        if ((i & 2) != 0) {
            j = fgk0Var.b;
        }
        long j2 = j;
        long j3 = (i & 4) != 0 ? fgk0Var.c : 100L;
        fgk0Var.getClass();
        return new fgk0(j2, j3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgk0)) {
            return false;
        }
        fgk0 fgk0Var = (fgk0) obj;
        return this.a == fgk0Var.a && this.b == fgk0Var.b && this.c == fgk0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideCardDriverAvatarOverlayUiState(avatarOverlayShown=");
        sb.append(this.a);
        sb.append(", avatarOverlayShowDuration=");
        sb.append(this.b);
        return g8e.l(this.c, ", avatarOverlayDisappearDuration=", Extension.C_BRAKE, sb);
    }
}
