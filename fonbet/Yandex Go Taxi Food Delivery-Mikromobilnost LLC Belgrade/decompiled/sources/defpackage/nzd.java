package defpackage;

import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.camera.data.OverlayImage;

/* loaded from: classes4.dex */
public final class nzd implements ozd {
    public final String a;
    public final OverlayImage b;

    public nzd(String str) {
        Object obj;
        this.a = str;
        OverlayImage.Companion.getClass();
        Iterator<E> it = OverlayImage.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((OverlayImage) obj).getKey(), str)) {
                    break;
                }
            }
        }
        this.b = (OverlayImage) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzd) && jl40.l(this.a, ((nzd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("StaticImage(id=", this.a, Extension.C_BRAKE);
    }
}
