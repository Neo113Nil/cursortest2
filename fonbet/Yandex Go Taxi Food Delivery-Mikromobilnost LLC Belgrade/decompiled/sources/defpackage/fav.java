package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class fav extends ccb1 {
    public final mwb0 a;
    public final PlacemarkType b;
    public final boolean c;

    public fav(mwb0 mwb0Var, PlacemarkType placemarkType, boolean z) {
        this.a = mwb0Var;
        this.b = placemarkType;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fav)) {
            return false;
        }
        fav favVar = (fav) obj;
        return jl40.l(this.a, favVar.a) && this.b == favVar.b && this.c == favVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageKey(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", visited=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
