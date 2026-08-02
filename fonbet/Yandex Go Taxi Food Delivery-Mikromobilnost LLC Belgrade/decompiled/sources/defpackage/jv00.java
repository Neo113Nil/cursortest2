package defpackage;

import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;

/* loaded from: classes15.dex */
public final class jv00 {
    public final String a;
    public final MapObject b;
    public uj0 c;
    public IconStyle d;
    public String e;
    public IconStyle f;
    public String g;
    public String h;

    public jv00(String str, MapObject mapObject, IconStyle iconStyle, String str2, IconStyle iconStyle2, String str3, String str4, int i) {
        iconStyle = (i & 8) != 0 ? null : iconStyle;
        str2 = (i & 16) != 0 ? null : str2;
        iconStyle2 = (i & 32) != 0 ? null : iconStyle2;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        this.a = str;
        this.b = mapObject;
        this.c = null;
        this.d = iconStyle;
        this.e = str2;
        this.f = iconStyle2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (jv00.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((jv00) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
