package xsna;

/* compiled from: PopupStickersSettingsScreenModel.kt */
/* loaded from: classes6.dex */
public final class yp2 {
    public final boolean a;
    public final boolean b;

    public yp2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp2)) {
            return false;
        }
        yp2 yp2Var = (yp2) obj;
        return this.a == yp2Var.a && this.b == yp2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationOnGetModel(isEnabled=");
        sb.append(this.a);
        sb.append(", isSwitchEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
