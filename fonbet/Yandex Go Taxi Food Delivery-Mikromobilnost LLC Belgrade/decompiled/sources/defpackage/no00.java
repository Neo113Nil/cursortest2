package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes6.dex */
public final class no00 {
    public final String a;
    public final MapObjectType b;
    public final zzs c;
    public final wp31 d;
    public final List e;
    public final int f;

    public no00(String str, MapObjectType mapObjectType, zzs zzsVar, wp31 wp31Var, List list, int i) {
        this.a = str;
        this.b = mapObjectType;
        this.c = zzsVar;
        this.d = wp31Var;
        this.e = list;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no00)) {
            return false;
        }
        no00 no00Var = (no00) obj;
        return this.a.equals(no00Var.a) && this.b == no00Var.b && this.c.equals(no00Var.c) && jl40.l(this.d, no00Var.d) && jl40.l(this.e, no00Var.e) && this.f == no00Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + unr0.c((this.d.hashCode() + nnm.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "MapObjectRenderSignature(id=" + this.a + ", type=" + this.b + ", geometry=" + this.c + ", viewConfig=" + this.d + ", options=" + this.e + ", componentsSize=" + this.f + Extension.C_BRAKE;
    }
}
