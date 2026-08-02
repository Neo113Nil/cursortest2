package defpackage;

import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class j4c0 {
    public final LinkedHashMap a;
    public final ImageProvider b;
    public final IconStyle c;

    public j4c0(LinkedHashMap linkedHashMap, ImageProvider imageProvider, IconStyle iconStyle) {
        this.a = linkedHashMap;
        this.b = imageProvider;
        this.c = iconStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4c0)) {
            return false;
        }
        j4c0 j4c0Var = (j4c0) obj;
        return this.a.equals(j4c0Var.a) && this.b.equals(j4c0Var.b) && jl40.l(this.c, j4c0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        IconStyle iconStyle = this.c;
        return hashCode + (iconStyle == null ? 0 : iconStyle.hashCode());
    }

    public final String toString() {
        return "PlacemarksForAddData(placemarks=" + this.a + ", icon=" + this.b + ", iconStyle=" + this.c + Extension.C_BRAKE;
    }
}
