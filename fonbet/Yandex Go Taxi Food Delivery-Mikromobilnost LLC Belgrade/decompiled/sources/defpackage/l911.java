package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l911 {
    public final String a;
    public final String b;
    public final Point c;

    public l911(String str, String str2, Point point) {
        this.a = str;
        this.b = str2;
        this.c = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l911)) {
            return false;
        }
        l911 l911Var = (l911) obj;
        return jl40.l(this.a, l911Var.a) && jl40.l(this.b, l911Var.b) && jl40.l(this.c, l911Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransportStopExit(id=", this.a, ", name=", this.b, ", point=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
