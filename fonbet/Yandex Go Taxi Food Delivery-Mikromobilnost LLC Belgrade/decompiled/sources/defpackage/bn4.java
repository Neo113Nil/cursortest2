package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bn4 extends zm4 {
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bn4(int i) {
        super(r1);
        int i2 = oyh0.badge_guest_user;
        this.f = i2;
    }

    @Override // defpackage.wm4
    public final int d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn4) && this.f == ((bn4) obj).f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f);
    }

    public final String toString() {
        return oyr.j(this.f, "UserGuestBadge(badgeText=", Extension.C_BRAKE);
    }

    public bn4() {
        this(0);
    }
}
