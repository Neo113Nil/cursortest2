package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public final class o3z0 implements q3z0 {
    public final BannerWidgets.NamedActionType a;
    public final List b;

    public o3z0(BannerWidgets.NamedActionType namedActionType, List list) {
        this.a = namedActionType;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3z0)) {
            return false;
        }
        o3z0 o3z0Var = (o3z0) obj;
        return this.a == o3z0Var.a && jl40.l(this.b, o3z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedButtonClicked(name=" + this.a + ", extraActions=" + this.b + Extension.C_BRAKE;
    }
}
