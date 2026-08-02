package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.experiment.f;

/* loaded from: classes6.dex */
public final class py30 {
    public static final py30 h = new py30((ArrayList) null, (su30) null, (Throwable) null, (uu30) null, (f) null, (pd01) null, HProv.PP_PASSWD_TERM);
    public final List a;
    public final su30 b;
    public final boolean c;
    public final Throwable d;
    public final uu30 e;
    public final f f;
    public final pd01 g;

    public py30(ArrayList arrayList, su30 su30Var, Throwable th, uu30 uu30Var, f fVar, pd01 pd01Var, int i) {
        this((i & 1) != 0 ? EmptyList.a : arrayList, (i & 2) != 0 ? null : su30Var, (i & 4) == 0, (i & 8) != 0 ? null : th, (i & 16) != 0 ? null : uu30Var, (i & 32) != 0 ? null : fVar, (i & 64) != 0 ? pd01.e : pd01Var);
    }

    public static py30 a(py30 py30Var, su30 su30Var, uu30 uu30Var, int i) {
        List list = py30Var.a;
        if ((i & 2) != 0) {
            su30Var = py30Var.b;
        }
        su30 su30Var2 = su30Var;
        boolean z = (i & 4) != 0 ? py30Var.c : true;
        Throwable th = (i & 8) != 0 ? py30Var.d : null;
        if ((i & 16) != 0) {
            uu30Var = py30Var.e;
        }
        f fVar = py30Var.f;
        pd01 pd01Var = py30Var.g;
        py30Var.getClass();
        return new py30(list, su30Var2, z, th, uu30Var, fVar, pd01Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py30)) {
            return false;
        }
        py30 py30Var = (py30) obj;
        return jl40.l(this.a, py30Var.a) && jl40.l(this.b, py30Var.b) && this.c == py30Var.c && jl40.l(this.d, py30Var.d) && jl40.l(this.e, py30Var.e) && jl40.l(this.f, py30Var.f) && jl40.l(this.g, py30Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        su30 su30Var = this.b;
        int e = unr0.e((hashCode + (su30Var == null ? 0 : su30Var.hashCode())) * 31, 31, this.c);
        Throwable th = this.d;
        int hashCode2 = (e + (th == null ? 0 : th.hashCode())) * 31;
        uu30 uu30Var = this.e;
        int hashCode3 = (hashCode2 + (uu30Var == null ? 0 : uu30Var.hashCode())) * 31;
        f fVar = this.f;
        return this.g.hashCode() + ((hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MtRoutesState(routes=" + this.a + ", selectedRoute=" + this.b + ", isLoading=" + this.c + ", throwable=" + this.d + ", addresses=" + this.e + ", transportOnSummaryConfig=" + this.f + ", trainsFlowConfig=" + this.g + Extension.C_BRAKE;
    }

    public py30(List list, su30 su30Var, boolean z, Throwable th, uu30 uu30Var, f fVar, pd01 pd01Var) {
        this.a = list;
        this.b = su30Var;
        this.c = z;
        this.d = th;
        this.e = uu30Var;
        this.f = fVar;
        this.g = pd01Var;
    }

    public py30() {
        this((ArrayList) null, (su30) null, (Throwable) null, (uu30) null, (f) null, (pd01) null, HProv.PP_VERSION_TIMESTAMP);
    }
}
