package xsna;

import android.os.Parcelable;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: MapBaseState.kt */
/* loaded from: classes18.dex */
public final class tj00 {
    public final gk9 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public tj00() {
        this(0);
    }

    public static tj00 a(tj00 tj00Var, gk9 gk9Var, boolean z, int i) {
        if ((i & 1) != 0) {
            gk9Var = tj00Var.a;
        }
        if ((i & 2) != 0) {
            z = tj00Var.b;
        }
        boolean z2 = (i & 4) != 0 ? tj00Var.c : true;
        boolean z3 = tj00Var.d;
        tj00Var.getClass();
        return new tj00(gk9Var, z, z2, z3);
    }

    public final boolean b() {
        Coordinates coordinates = this.a.a;
        Parcelable.Creator<Coordinates> creator = Coordinates.CREATOR;
        return !epx.f(coordinates, Coordinates.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj00)) {
            return false;
        }
        tj00 tj00Var = (tj00) obj;
        return epx.f(this.a, tj00Var.a) && this.b == tj00Var.b && this.c == tj00Var.c && this.d == tj00Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapBaseState(cameraPosition=");
        sb.append(this.a);
        sb.append(", isUserLocation=");
        sb.append(this.b);
        sb.append(", isPositionMoving=");
        sb.append(this.c);
        sb.append(", isAnyMoveRequestCompleted=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public tj00(gk9 gk9Var, boolean z, boolean z2, boolean z3) {
        this.a = gk9Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public /* synthetic */ tj00(int i) {
        this(new gk9(0), false, false, false);
    }
}
