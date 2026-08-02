package defpackage;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class amj0 implements rcx0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final wp2 d;
    public final RequirementRoundedCornersUiState e;
    public final int f;
    public final uij0 g;
    public final jdj0 h;
    public final ikj0 i;
    public final qkj0 j;
    public final xlj0 k;
    public final String l;
    public final RequirementTypeUiState m;

    public amj0(String str, String str2, boolean z, wp2 wp2Var, RequirementRoundedCornersUiState requirementRoundedCornersUiState, int i, uij0 uij0Var, jdj0 jdj0Var, ikj0 ikj0Var, qkj0 qkj0Var, xlj0 xlj0Var, String str3, RequirementTypeUiState requirementTypeUiState) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = wp2Var;
        this.e = requirementRoundedCornersUiState;
        this.f = i;
        this.g = uij0Var;
        this.h = jdj0Var;
        this.i = ikj0Var;
        this.j = qkj0Var;
        this.k = xlj0Var;
        this.l = str3;
        this.m = requirementTypeUiState;
    }

    public static amj0 a(amj0 amj0Var, String str, RequirementRoundedCornersUiState requirementRoundedCornersUiState, int i) {
        String str2 = (i & 1) != 0 ? amj0Var.a : str;
        String str3 = amj0Var.b;
        boolean z = amj0Var.c;
        wp2 wp2Var = amj0Var.d;
        RequirementRoundedCornersUiState requirementRoundedCornersUiState2 = (i & 16) != 0 ? amj0Var.e : requirementRoundedCornersUiState;
        int i2 = amj0Var.f;
        uij0 uij0Var = amj0Var.g;
        jdj0 jdj0Var = amj0Var.h;
        ikj0 ikj0Var = amj0Var.i;
        qkj0 qkj0Var = amj0Var.j;
        xlj0 xlj0Var = amj0Var.k;
        String str4 = amj0Var.l;
        RequirementTypeUiState requirementTypeUiState = amj0Var.m;
        amj0Var.getClass();
        return new amj0(str2, str3, z, wp2Var, requirementRoundedCornersUiState2, i2, uij0Var, jdj0Var, ikj0Var, qkj0Var, xlj0Var, str4, requirementTypeUiState);
    }

    @Override // defpackage.rcx0, defpackage.fex0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amj0)) {
            return false;
        }
        amj0 amj0Var = (amj0) obj;
        return jl40.l(this.a, amj0Var.a) && jl40.l(this.b, amj0Var.b) && this.c == amj0Var.c && jl40.l(this.d, amj0Var.d) && this.e == amj0Var.e && this.f == amj0Var.f && jl40.l(this.g, amj0Var.g) && this.h.equals(amj0Var.h) && jl40.l(this.i, amj0Var.i) && jl40.l(this.j, amj0Var.j) && jl40.l(this.k, amj0Var.k) && jl40.l(this.l, amj0Var.l) && this.m == amj0Var.m;
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = oyr.b(this.f, (this.e.hashCode() + n.b(this.d, unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31);
        uij0 uij0Var = this.g;
        int hashCode = (this.h.hashCode() + ((b + (uij0Var == null ? 0 : uij0Var.hashCode())) * 31)) * 31;
        ikj0 ikj0Var = this.i;
        int hashCode2 = (hashCode + (ikj0Var == null ? 0 : ikj0Var.hashCode())) * 31;
        qkj0 qkj0Var = this.j;
        int hashCode3 = (hashCode2 + (qkj0Var == null ? 0 : qkj0Var.hashCode())) * 31;
        xlj0 xlj0Var = this.k;
        return this.m.hashCode() + unr0.b((hashCode3 + (xlj0Var != null ? xlj0Var.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementUiState(id=", this.a, ", uniqueKey=", this.b, ", isAvailable=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(", roundedCornersUiState=");
        v.append(this.e);
        v.append(", horizontalPadding=");
        v.append(this.f);
        v.append(", leadUiState=");
        v.append(this.g);
        v.append(", bodyUiState=");
        v.append(this.h);
        v.append(", trail2UiState=");
        v.append(this.i);
        v.append(", trailUiState=");
        v.append(this.j);
        v.append(", action=");
        v.append(this.k);
        v.append(", contentDescription=");
        v.append(this.l);
        v.append(", type=");
        v.append(this.m);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
