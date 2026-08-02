package defpackage;

import com.ybsdk.feature.qr.internal.screens.container.QrContainerScreenParams;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o6g0 {
    public final List a;
    public final QrContainerScreenParams b;
    public final int c;
    public final nm90 d;

    public o6g0(List list, QrContainerScreenParams qrContainerScreenParams, int i, nm90 nm90Var) {
        this.a = list;
        this.b = qrContainerScreenParams;
        this.c = i;
        this.d = nm90Var;
    }

    public static o6g0 a(o6g0 o6g0Var, int i, nm90 nm90Var, int i2) {
        List list = o6g0Var.a;
        QrContainerScreenParams qrContainerScreenParams = o6g0Var.b;
        if ((i2 & 4) != 0) {
            i = o6g0Var.c;
        }
        if ((i2 & 8) != 0) {
            nm90Var = o6g0Var.d;
        }
        o6g0Var.getClass();
        return new o6g0(list, qrContainerScreenParams, i, nm90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6g0)) {
            return false;
        }
        o6g0 o6g0Var = (o6g0) obj;
        return jl40.l(this.a, o6g0Var.a) && this.b.equals(o6g0Var.b) && this.c == o6g0Var.c && this.d.equals(o6g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "QrContainerState(items=" + this.a + ", screenParams=" + this.b + ", selectedIndex=" + this.c + ", passesWidgetState=" + this.d + Extension.C_BRAKE;
    }
}
