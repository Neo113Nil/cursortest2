package xsna;

/* compiled from: PopupStickersSettingsScreenModel.kt */
/* loaded from: classes6.dex */
public final class zp2 {
    public final boolean a;
    public final boolean b;

    public zp2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp2)) {
            return false;
        }
        zp2 zp2Var = (zp2) obj;
        return this.a == zp2Var.a && this.b == zp2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationOnSendModel(isEnabled=");
        sb.append(this.a);
        sb.append(", isSwitchEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
