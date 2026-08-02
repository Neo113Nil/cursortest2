package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SearchVideoPickerState.kt */
/* loaded from: classes5.dex */
public final class tzh0 implements km50 {
    public final UserId b;
    public final wia0<o2t0> c;
    public final boolean d;
    public final ewp e;

    public tzh0(UserId userId, wia0 wia0Var, boolean z, ewp ewpVar) {
        this.b = userId;
        this.c = wia0Var;
        this.d = z;
        this.e = ewpVar;
    }

    public static tzh0 a(tzh0 tzh0Var, wia0 wia0Var, boolean z, ewp ewpVar, int i) {
        UserId userId = tzh0Var.b;
        if ((i & 2) != 0) {
            wia0Var = tzh0Var.c;
        }
        tzh0Var.getClass();
        tzh0Var.getClass();
        return new tzh0(userId, wia0Var, z, ewpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzh0)) {
            return false;
        }
        tzh0 tzh0Var = (tzh0) obj;
        return epx.f(this.b, tzh0Var.b) && epx.f(this.c, tzh0Var.c) && this.d == tzh0Var.d && epx.f(this.e, tzh0Var.e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        wia0<o2t0> wia0Var = this.c;
        int b = qoy.b((hashCode + (wia0Var == null ? 0 : wia0Var.hashCode())) * 31, 31, this.d);
        ewp ewpVar = this.e;
        return (b + (ewpVar != null ? ewpVar.a.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "SearchVideoPickerState(ownerId=" + this.b + ", videos=" + this.c + ", isLoading=" + this.d + ", errorLoading=" + this.e + ", searchText=)";
    }
}
