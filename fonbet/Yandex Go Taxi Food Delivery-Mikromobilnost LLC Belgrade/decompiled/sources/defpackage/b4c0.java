package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class b4c0 {
    public final Point a;
    public final ImageProvider b;
    public final IconStyle c;

    public b4c0(Point point, ImageProvider imageProvider, IconStyle iconStyle) {
        this.a = point;
        this.b = imageProvider;
        this.c = iconStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4c0)) {
            return false;
        }
        b4c0 b4c0Var = (b4c0) obj;
        return this.a.equals(b4c0Var.a) && this.b.equals(b4c0Var.b) && jl40.l(this.c, b4c0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        IconStyle iconStyle = this.c;
        return hashCode + (iconStyle == null ? 0 : iconStyle.hashCode());
    }

    public final String toString() {
        return "PlacemarkForAddData(position=" + this.a + ", icon=" + this.b + ", iconStyle=" + this.c + Extension.C_BRAKE;
    }
}
