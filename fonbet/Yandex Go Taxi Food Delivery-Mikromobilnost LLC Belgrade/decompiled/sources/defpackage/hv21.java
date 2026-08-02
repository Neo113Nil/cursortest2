package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hv21 {
    public final String a;
    public final boolean b;
    public final LocalizationDescriptor c;
    public final Map d;

    public hv21(String str, boolean z, LocalizationDescriptor localizationDescriptor, Map map) {
        this.a = str;
        this.b = z;
        this.c = localizationDescriptor;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv21)) {
            return false;
        }
        hv21 hv21Var = (hv21) obj;
        return jl40.l(this.a, hv21Var.a) && this.b == hv21Var.b && jl40.l(this.c, hv21Var.c) && jl40.l(this.d, hv21Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        LocalizationDescriptor localizationDescriptor = this.c;
        int hashCode = (e + (localizationDescriptor == null ? 0 : localizationDescriptor.hashCode())) * 31;
        Map map = this.d;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("UsersLocalizationEntity(userId=", this.a, ", loaded=", ", descriptor=", this.b);
        l.append(this.c);
        l.append(", localizationMap=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
