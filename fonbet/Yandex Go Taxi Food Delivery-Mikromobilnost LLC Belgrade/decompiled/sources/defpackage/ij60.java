package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ij60 {
    public final int a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ij60(int i, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = i;
        this.b = num;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij60)) {
            return false;
        }
        ij60 ij60Var = (ij60) obj;
        return this.a == ij60Var.a && jl40.l(this.b, ij60Var.b) && this.c == ij60Var.c && this.d == ij60Var.d && this.e == ij60Var.e && this.f == ij60Var.f && this.g == ij60Var.g && this.h == ij60Var.h;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.h) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationSettingsUiState(notificationTitleRes=");
        sb.append(this.a);
        sb.append(", notificationDescriptionRes=");
        sb.append(this.b);
        sb.append(", notificationsIsChecked=");
        nnm.v(", notificationsIsEnabled=", ", showSoundButton=", sb, this.c, this.d);
        nnm.v(", showVibrationButton=", ", soundIsChecked=", sb, this.e, this.f);
        return smw0.k(", vibrationIsChecked=", Extension.C_BRAKE, sb, this.g, this.h);
    }
}
