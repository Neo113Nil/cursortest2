package defpackage;

import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class czp0 {
    public final boolean a;
    public final boolean b;
    public final bzp0 c;
    public final Boolean d;
    public final azp0 e;
    public final Boolean f;
    public final Boolean g;
    public final OptimizedPaginationTriggerFeatureConfig h;

    public czp0(boolean z, boolean z2, bzp0 bzp0Var, Boolean bool, azp0 azp0Var, Boolean bool2, Boolean bool3) {
        this(z, z2, bzp0Var, bool, azp0Var, bool2, bool3, Boolean.FALSE.equals(Boolean.TRUE) ? OptimizedPaginationTriggerFeatureConfig.ENABLED_AUTOMATIC_TRIGGER : OptimizedPaginationTriggerFeatureConfig.DISABLED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!czp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        czp0 czp0Var = (czp0) obj;
        return this.a == czp0Var.a && this.b == czp0Var.b && jl40.l(this.c, czp0Var.c) && jl40.l(this.d, czp0Var.d) && jl40.l(this.e, czp0Var.e) && jl40.l(this.f, czp0Var.f) && jl40.l(this.g, czp0Var.g) && this.h == czp0Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Boolean bool = this.d;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        azp0 azp0Var = this.e;
        int hashCode3 = (hashCode2 + (azp0Var != null ? azp0Var.hashCode() : 0)) * 31;
        Boolean bool2 = this.f;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.g;
        return this.h.hashCode() + ((hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Settings(refreshable=", ", scrollable=", ", paging=", this.a, this.b);
        u.append(this.c);
        u.append(", supportsPredictiveItemAnimations=");
        u.append(this.d);
        u.append(", paddings=");
        u.append(this.e);
        u.append(", enableSnippetsAnimations=");
        u.append(this.f);
        u.append(", overscroll=");
        u.append(this.g);
        u.append(", optimizedPaginationTriggerFeatureConfig=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ czp0(boolean z, bzp0 bzp0Var) {
        this(false, z, bzp0Var, null, null, Boolean.TRUE, null);
    }

    public czp0(boolean z, boolean z2, bzp0 bzp0Var, Boolean bool, azp0 azp0Var, Boolean bool2, Boolean bool3, OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig) {
        this.a = z;
        this.b = z2;
        this.c = bzp0Var;
        this.d = bool;
        this.e = azp0Var;
        this.f = bool2;
        this.g = bool3;
        this.h = optimizedPaginationTriggerFeatureConfig;
    }
}
