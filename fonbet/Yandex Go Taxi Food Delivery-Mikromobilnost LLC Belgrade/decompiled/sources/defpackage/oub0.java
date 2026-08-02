package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class oub0 {
    public final mwb0 a;
    public final PlacemarkType b;
    public final boolean c;
    public final c3c0 d;

    public oub0(mwb0 mwb0Var, PlacemarkType placemarkType, boolean z, c3c0 c3c0Var) {
        this.a = mwb0Var;
        this.b = placemarkType;
        this.c = z;
        this.d = c3c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oub0)) {
            return false;
        }
        oub0 oub0Var = (oub0) obj;
        return jl40.l(this.a, oub0Var.a) && this.b == oub0Var.b && this.c == oub0Var.c && jl40.l(this.d, oub0Var.d);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        c3c0 c3c0Var = this.d;
        return e + (c3c0Var == null ? 0 : c3c0Var.hashCode());
    }

    public final String toString() {
        return "ImageRequest(id=" + this.a + ", type=" + this.b + ", visited=" + this.c + ", variation=" + this.d + Extension.C_BRAKE;
    }
}
