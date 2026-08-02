package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ajb0 {
    public final boolean a;
    public final boolean b;
    public final sr7 c;
    public final zib0 d;
    public final qib0 e;
    public final Map f;
    public final boolean g;
    public final uib0 h;

    public /* synthetic */ ajb0(int i) {
        this((i & 1) == 0, false, null, wib0.a, null, b.f(), true, null);
    }

    public static ajb0 a(ajb0 ajb0Var, boolean z, sr7 sr7Var, zib0 zib0Var, qib0 qib0Var, Map map, boolean z2, uib0 uib0Var, int i) {
        boolean z3 = (i & 1) != 0 ? ajb0Var.a : true;
        if ((i & 2) != 0) {
            z = ajb0Var.b;
        }
        if ((i & 4) != 0) {
            sr7Var = ajb0Var.c;
        }
        if ((i & 8) != 0) {
            zib0Var = ajb0Var.d;
        }
        if ((i & 16) != 0) {
            qib0Var = ajb0Var.e;
        }
        if ((i & 32) != 0) {
            map = ajb0Var.f;
        }
        if ((i & 64) != 0) {
            z2 = ajb0Var.g;
        }
        if ((i & 128) != 0) {
            uib0Var = ajb0Var.h;
        }
        uib0 uib0Var2 = uib0Var;
        ajb0Var.getClass();
        boolean z4 = z2;
        Map map2 = map;
        qib0 qib0Var2 = qib0Var;
        zib0 zib0Var2 = zib0Var;
        return new ajb0(z3, z, sr7Var, zib0Var2, qib0Var2, map2, z4, uib0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajb0)) {
            return false;
        }
        ajb0 ajb0Var = (ajb0) obj;
        return this.a == ajb0Var.a && this.b == ajb0Var.b && jl40.l(this.c, ajb0Var.c) && jl40.l(this.d, ajb0Var.d) && jl40.l(this.e, ajb0Var.e) && jl40.l(this.f, ajb0Var.f) && this.g == ajb0Var.g && jl40.l(this.h, ajb0Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        sr7 sr7Var = this.c;
        int hashCode = (this.d.hashCode() + ((e + (sr7Var == null ? 0 : sr7Var.hashCode())) * 31)) * 31;
        qib0 qib0Var = this.e;
        int e2 = unr0.e(unr0.d((hashCode + (qib0Var == null ? 0 : qib0Var.hashCode())) * 31, 31, this.f), 31, this.g);
        uib0 uib0Var = this.h;
        return e2 + (uib0Var != null ? uib0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("PhotoState(cameraReady=", ", flashEnabled=", ", currentPhoto=", this.a, this.b);
        u.append(this.c);
        u.append(", currentStage=");
        u.append(this.d);
        u.append(", screenContent=");
        u.append(this.e);
        u.append(", documentsIds=");
        u.append(this.f);
        u.append(", permissionGranted=");
        u.append(this.g);
        u.append(", generalError=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public ajb0(boolean z, boolean z2, sr7 sr7Var, zib0 zib0Var, qib0 qib0Var, Map map, boolean z3, uib0 uib0Var) {
        this.a = z;
        this.b = z2;
        this.c = sr7Var;
        this.d = zib0Var;
        this.e = qib0Var;
        this.f = map;
        this.g = z3;
        this.h = uib0Var;
    }

    public ajb0() {
        this(255);
    }
}
