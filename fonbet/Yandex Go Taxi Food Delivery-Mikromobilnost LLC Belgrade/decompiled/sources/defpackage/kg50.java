package defpackage;

import com.yandex.go.navigator.events.NavigatorTag;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kg50 {
    public final NavigatorTag a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ kg50(NavigatorTag navigatorTag, int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        this(navigatorTag, i, num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? null : num4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg50)) {
            return false;
        }
        kg50 kg50Var = (kg50) obj;
        return this.a == kg50Var.a && this.b == kg50Var.b && jl40.l(this.c, kg50Var.c) && jl40.l(this.d, kg50Var.d) && jl40.l(this.e, kg50Var.e) && jl40.l(this.f, kg50Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "NavigatorTagStyle(tag=" + this.a + ", imagePoiId=" + this.b + ", imagePinId=" + this.c + ", imageInFuturePoiId=" + this.d + ", imageInFuturePinId=" + this.e + ", imageAltId=" + this.f + Extension.C_BRAKE;
    }

    public kg50(NavigatorTag navigatorTag, int i, Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = navigatorTag;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
    }
}
