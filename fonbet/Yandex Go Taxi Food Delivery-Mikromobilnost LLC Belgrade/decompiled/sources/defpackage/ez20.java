package defpackage;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ez20 implements fz20 {
    public final uy20 a;
    public final uy20 b;
    public final uy20 c;
    public final PlacesMapConfig$RevealingState d;
    public final boolean e;
    public final xr00 f;
    public final xd7 g;
    public final xd7 h;
    public final i3y i;

    public ez20(ry20 ry20Var, uy20 uy20Var, ty20 ty20Var, PlacesMapConfig$RevealingState placesMapConfig$RevealingState, boolean z, xr00 xr00Var) {
        this.a = ry20Var;
        this.b = uy20Var;
        this.c = ty20Var;
        this.d = placesMapConfig$RevealingState;
        this.e = z;
        this.f = xr00Var;
        this.g = new xd7();
        this.h = new xd7();
        this.i = a.b(LazyThreadSafetyMode.NONE, new m020(10, this));
    }

    public final int a() {
        return ((Number) this.i.getValue()).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez20)) {
            return false;
        }
        ez20 ez20Var = (ez20) obj;
        return jl40.l(this.a, ez20Var.a) && jl40.l(this.b, ez20Var.b) && jl40.l(this.c, ez20Var.c) && this.d == ez20Var.d && this.e == ez20Var.e && jl40.l(this.f, ez20Var.f);
    }

    public final int hashCode() {
        uy20 uy20Var = this.a;
        int hashCode = (uy20Var == null ? 0 : uy20Var.hashCode()) * 31;
        uy20 uy20Var2 = this.b;
        int hashCode2 = (hashCode + (uy20Var2 == null ? 0 : uy20Var2.hashCode())) * 31;
        uy20 uy20Var3 = this.c;
        int hashCode3 = (hashCode2 + (uy20Var3 == null ? 0 : uy20Var3.hashCode())) * 31;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState = this.d;
        int e = unr0.e((hashCode3 + (placesMapConfig$RevealingState == null ? 0 : placesMapConfig$RevealingState.hashCode())) * 31, 31, this.e);
        xr00 xr00Var = this.f;
        return e + (xr00Var != null ? xr00Var.hashCode() : 0);
    }

    public final String toString() {
        return "Slideable(minHeight=" + this.a + ", anchorHeight=" + this.b + ", maxHeight=" + this.c + ", initialRevealingState=" + this.d + ", needSetFixCoordinatorDragHelper=" + this.e + ", mapSettings=" + this.f + Extension.C_BRAKE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ez20() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    public /* synthetic */ ez20(ry20 ry20Var, PlacesMapConfig$RevealingState placesMapConfig$RevealingState, xr00 xr00Var, int i) {
        this(null, (i & 2) != 0 ? null : ry20Var, null, (i & 8) != 0 ? null : placesMapConfig$RevealingState, (i & 16) == 0, (i & 32) != 0 ? null : xr00Var);
    }
}
