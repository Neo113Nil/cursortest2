package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.locationsdk.core.location.SpoofingType;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationType;

/* loaded from: classes9.dex */
public final class ga2 implements n6z {
    public final AndroidLocationType a;
    public final SpoofingType b;
    public final boolean c;
    public final String d;

    public ga2(AndroidLocationType androidLocationType, SpoofingType spoofingType, boolean z, String str) {
        this.a = androidLocationType;
        this.b = spoofingType;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.n6z
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga2)) {
            return false;
        }
        ga2 ga2Var = (ga2) obj;
        return this.a == ga2Var.a && this.b == ga2Var.b && this.c == ga2Var.c && jl40.l(this.d, ga2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        String a = q6z.a(this.d);
        StringBuilder sb = new StringBuilder("AndroidLocationMeta(type=");
        sb.append(this.a);
        sb.append(", spoofingType=");
        sb.append(this.b);
        sb.append(", isMock=");
        return n.m(", source=", a, Extension.C_BRAKE, sb, this.c);
    }
}
