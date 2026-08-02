package xsna;

/* compiled from: PopupStickersSettingsScreenModel.kt */
/* loaded from: classes6.dex */
public final class nyb0 {
    public final zp2 a;
    public final yp2 b;
    public final boolean c;

    public nyb0(zp2 zp2Var, yp2 yp2Var, boolean z) {
        this.a = zp2Var;
        this.b = yp2Var;
        this.c = z;
    }

    public static nyb0 a(nyb0 nyb0Var, zp2 zp2Var, yp2 yp2Var, boolean z, int i) {
        if ((i & 1) != 0) {
            zp2Var = nyb0Var.a;
        }
        if ((i & 2) != 0) {
            yp2Var = nyb0Var.b;
        }
        nyb0Var.getClass();
        return new nyb0(zp2Var, yp2Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyb0)) {
            return false;
        }
        nyb0 nyb0Var = (nyb0) obj;
        return epx.f(this.a, nyb0Var.a) && epx.f(this.b, nyb0Var.b) && this.c == nyb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupStickersSettingsScreenModel(animationOnSendModel=");
        sb.append(this.a);
        sb.append(", animationOnGetModel=");
        sb.append(this.b);
        sb.append(", isNeedShowErrorPopup=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
