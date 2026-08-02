package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;

/* loaded from: classes5.dex */
public final class la9 implements uni {
    public final String a;
    public final String b;
    public final String c;
    public final String w;
    public final String x;
    public final List y;
    public final ClickSource z;

    public la9(String str, String str2, String str3, String str4, String str5, List list, ClickSource clickSource) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.w = str4;
        this.x = str5;
        this.y = list;
        this.z = clickSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la9)) {
            return false;
        }
        la9 la9Var = (la9) obj;
        return jl40.l(this.a, la9Var.a) && jl40.l(this.b, la9Var.b) && jl40.l(this.c, la9Var.c) && jl40.l(this.w, la9Var.w) && jl40.l(this.x, la9Var.x) && this.y.equals(la9Var.y) && this.z == la9Var.z;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.z.hashCode() + unr0.c(unr0.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.w), 31, this.x), 31, this.y);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangeDateTimeArgs(deliveryId=", this.a, ", title=", this.b, ", text=");
        g8e.D(v, this.c, ", cancelButtonTitle=", this.w, ", changeButtonTitle=");
        tse0.x(this.x, ", options=", ", source=", v, this.y);
        v.append(this.z);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
