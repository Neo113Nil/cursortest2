package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hpx extends jpx {
    public final e d;

    public hpx(e eVar) {
        super(stz0.a(lpx.b, null, null, null, null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primary)), false, false, null, null, 0, 32735));
        this.d = eVar;
    }

    public final e e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpx) && jl40.l(this.d, ((hpx) obj).d);
    }

    public final int hashCode() {
        e eVar = this.d;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "FullscreenInfo(statusState=" + this.d + Extension.C_BRAKE;
    }
}
