package defpackage;

import com.ybsdk.feature.server.tooltips.api.domain.ServerTooltipPositionEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class euq0 {
    public final ytq0 a;
    public final ServerTooltipPositionEntity b;
    public final ztq0 c;
    public final Integer d;
    public final Integer e;

    public euq0(ytq0 ytq0Var, ServerTooltipPositionEntity serverTooltipPositionEntity, ztq0 ztq0Var, Integer num, Integer num2) {
        this.a = ytq0Var;
        this.b = serverTooltipPositionEntity;
        this.c = ztq0Var;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euq0)) {
            return false;
        }
        euq0 euq0Var = (euq0) obj;
        return this.a.equals(euq0Var.a) && this.b == euq0Var.b && this.c.equals(euq0Var.c) && jl40.l(this.d, euq0Var.d) && jl40.l(this.e, euq0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerTooltipModelEntity(anchor=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", content=");
        sb.append(this.c);
        sb.append(", verticalMargin=");
        sb.append(this.d);
        sb.append(", durationMs=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
