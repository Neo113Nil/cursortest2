package defpackage;

import com.yandex.go.places.map.domain.entities.PinLayer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ehq0 {
    public final boolean a;
    public final kn00 b;
    public final PinLayer c;
    public final boolean d;

    public ehq0(boolean z, kn00 kn00Var, PinLayer pinLayer, boolean z2) {
        this.a = z;
        this.b = kn00Var;
        this.c = pinLayer;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehq0)) {
            return false;
        }
        ehq0 ehq0Var = (ehq0) obj;
        return this.a == ehq0Var.a && jl40.l(this.b, ehq0Var.b) && this.c == ehq0Var.c && this.d == ehq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectedMapObjectInfo(isSingleObjectOnMap=" + this.a + ", mapObjectItem=" + this.b + ", layer=" + this.c + ", wasAddedByCard=" + this.d + Extension.C_BRAKE;
    }
}
