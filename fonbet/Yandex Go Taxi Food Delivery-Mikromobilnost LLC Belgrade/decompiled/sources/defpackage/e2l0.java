package defpackage;

import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class e2l0 {
    public final pv0 a;
    public final ihv0 b;
    public final RouteData$Continuation c;

    public e2l0(pv0 pv0Var, ihv0 ihv0Var, RouteData$Continuation routeData$Continuation) {
        this.a = pv0Var;
        this.b = ihv0Var;
        this.c = routeData$Continuation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2l0)) {
            return false;
        }
        e2l0 e2l0Var = (e2l0) obj;
        return jl40.l(this.a, e2l0Var.a) && jl40.l(this.b, e2l0Var.b) && this.c == e2l0Var.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        RouteData$Continuation routeData$Continuation = this.c;
        return hashCode + (routeData$Continuation == null ? 0 : routeData$Continuation.hashCode());
    }

    public final String toString() {
        return "Result(sourceAddressInfo=" + this.a + ", expandState=" + this.b + ", continuation=" + this.c + Extension.C_BRAKE;
    }
}
