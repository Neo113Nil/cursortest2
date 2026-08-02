package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kpx extends lpx {
    public final kao c;
    public final stz0 d = stz0.a(this.a, null, null, null, null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primary)), false, false, null, null, 0, 32735);

    public kpx(kao kaoVar) {
        this.c = kaoVar;
    }

    @Override // defpackage.lpx
    public final stz0 d() {
        return this.d;
    }

    public final kao e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpx) && this.c == ((kpx) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(errorState=", this.c, Extension.C_BRAKE);
    }
}
