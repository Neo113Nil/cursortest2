package defpackage;

import com.yandex.fintechsdk.core.ui.impl.api.qrcode.QrCodeErrorCorrectionLevel;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e6g0 {
    public final int a;
    public final List b;
    public final QrCodeErrorCorrectionLevel c;
    public final float d;
    public final float e;
    public final int f;
    public final String g;

    public e6g0(int i, List list, QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel, float f, float f2, int i2, String str) {
        this.a = i;
        this.b = list;
        this.c = qrCodeErrorCorrectionLevel;
        this.d = f;
        this.e = f2;
        this.f = i2;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6g0)) {
            return false;
        }
        e6g0 e6g0Var = (e6g0) obj;
        return this.a == e6g0Var.a && jl40.l(this.b, e6g0Var.b) && this.c == e6g0Var.c && Float.compare(this.d, e6g0Var.d) == 0 && Float.compare(this.e, e6g0Var.e) == 0 && this.f == e6g0Var.f && this.g.equals(e6g0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + oyr.b(this.f, g8e.c(this.e, g8e.c(this.d, (this.c.hashCode() + unr0.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrCodeRenderRequest(color=");
        sb.append(this.a);
        sb.append(", cutouts=");
        sb.append(this.b);
        sb.append(", errorCorrectionLevel=");
        sb.append(this.c);
        sb.append(", finderCornerRatio=");
        sb.append(this.d);
        sb.append(", moduleCornerRatio=");
        sb.append(this.e);
        sb.append(", sizePx=");
        sb.append(this.f);
        sb.append(", value=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
