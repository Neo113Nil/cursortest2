package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gox {
    public final boolean a;
    public final boolean b;
    public final tnx c;
    public final fox d;
    public final c03 e;
    public final boolean f;
    public final aox g;

    public gox(boolean z, boolean z2, tnx tnxVar, fox foxVar, c03 c03Var, boolean z3, aox aoxVar) {
        this.a = z;
        this.b = z2;
        this.c = tnxVar;
        this.d = foxVar;
        this.e = c03Var;
        this.f = z3;
        this.g = aoxVar;
    }

    public static gox a(gox goxVar, boolean z, tnx tnxVar, fox foxVar, c03 c03Var, boolean z2, aox aoxVar, int i) {
        boolean z3 = (i & 1) != 0 ? goxVar.a : true;
        if ((i & 2) != 0) {
            z = goxVar.b;
        }
        if ((i & 4) != 0) {
            tnxVar = goxVar.c;
        }
        if ((i & 8) != 0) {
            foxVar = goxVar.d;
        }
        if ((i & 16) != 0) {
            c03Var = goxVar.e;
        }
        if ((i & 32) != 0) {
            z2 = goxVar.f;
        }
        if ((i & 64) != 0) {
            aoxVar = goxVar.g;
        }
        aox aoxVar2 = aoxVar;
        goxVar.getClass();
        boolean z4 = z2;
        c03 c03Var2 = c03Var;
        fox foxVar2 = foxVar;
        return new gox(z3, z, tnxVar, foxVar2, c03Var2, z4, aoxVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gox)) {
            return false;
        }
        gox goxVar = (gox) obj;
        return this.a == goxVar.a && this.b == goxVar.b && jl40.l(this.c, goxVar.c) && jl40.l(this.d, goxVar.d) && jl40.l(this.e, goxVar.e) && this.f == goxVar.f && jl40.l(this.g, goxVar.g);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        tnx tnxVar = this.c;
        int hashCode = (this.d.hashCode() + ((e + (tnxVar == null ? 0 : tnxVar.hashCode())) * 31)) * 31;
        c03 c03Var = this.e;
        int e2 = unr0.e((hashCode + (c03Var == null ? 0 : c03Var.hashCode())) * 31, 31, this.f);
        aox aoxVar = this.g;
        return e2 + (aoxVar != null ? aoxVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("KycPhotoV2State(cameraReady=", ", flashEnabled=", ", currentPhoto=", this.a, this.b);
        u.append(this.c);
        u.append(", currentStage=");
        u.append(this.d);
        u.append(", applicationInfo=");
        u.append(this.e);
        u.append(", permissionGranted=");
        u.append(this.f);
        u.append(", initializationError=");
        u.append(this.g);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public gox() {
        this(0);
    }

    public /* synthetic */ gox(int i) {
        this(false, false, null, cox.a, null, true, null);
    }
}
