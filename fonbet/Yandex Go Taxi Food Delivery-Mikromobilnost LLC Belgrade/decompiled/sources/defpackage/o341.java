package defpackage;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o341 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final z041 f;
    public final WalkNavFocusButtonState g;
    public final boolean h;
    public final Long i;
    public final double j;
    public final Long k;
    public final boolean l;
    public final boolean m;

    public o341(String str, String str2, String str3, List list, String str4, z041 z041Var, WalkNavFocusButtonState walkNavFocusButtonState, boolean z, Long l, double d, Long l2, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = z041Var;
        this.g = walkNavFocusButtonState;
        this.h = z;
        this.i = l;
        this.j = d;
        this.k = l2;
        this.l = z2;
        this.m = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o341)) {
            return false;
        }
        o341 o341Var = (o341) obj;
        return jl40.l(this.a, o341Var.a) && jl40.l(this.b, o341Var.b) && jl40.l(this.c, o341Var.c) && jl40.l(this.d, o341Var.d) && jl40.l(this.e, o341Var.e) && jl40.l(this.f, o341Var.f) && this.g == o341Var.g && this.h == o341Var.h && jl40.l(this.i, o341Var.i) && Double.compare(this.j, o341Var.j) == 0 && jl40.l(this.k, o341Var.k) && this.l == o341Var.l && this.m == o341Var.m;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.g.hashCode() + ((this.f.hashCode() + unr0.b(unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, false), 31, this.h);
        Long l = this.i;
        int a = unr0.a((e + (l == null ? 0 : l.hashCode())) * 31, 31, this.j);
        Long l2 = this.k;
        return Boolean.hashCode(this.m) + unr0.e((a + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder v = b64.v("WalkNavGuidanceUiState(title=", this.a, ", titleContentDescription=", this.b, ", subtitle=");
        tse0.x(this.c, ", routeItems=", ", buttonText=", v, this.d);
        v.append(this.e);
        v.append(", compassFabState=");
        v.append(this.f);
        v.append(", focusFabState=");
        v.append(this.g);
        v.append(", showMockSettings=false, isRouteFinished=");
        v.append(this.h);
        v.append(", startTimeMillis=");
        v.append(this.i);
        v.append(", totalDistanceMeters=");
        v.append(this.j);
        v.append(", finishTimeMillis=");
        v.append(this.k);
        v.append(", isUserLocationReady=");
        v.append(this.l);
        return xra1.a(v, ", enableV2Design=", this.m, Extension.C_BRAKE);
    }
}
