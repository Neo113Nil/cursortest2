package xsna;

import com.vk.libvideo.donut.model.Donut;

/* compiled from: DonutStatus.kt */
/* loaded from: classes14.dex */
public final class u2o extends xc6 {
    public final Donut a;
    public final lyn b;
    public final Boolean c;

    public u2o(Donut donut, lyn lynVar, Boolean bool) {
        this.a = donut;
        this.b = lynVar;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2o)) {
            return false;
        }
        u2o u2oVar = (u2o) obj;
        return epx.f(this.a, u2oVar.a) && epx.f(this.b, u2oVar.b) && epx.f(this.c, u2oVar.c);
    }

    public final int hashCode() {
        Donut donut = this.a;
        int hashCode = (donut == null ? 0 : donut.hashCode()) * 31;
        lyn lynVar = this.b;
        int hashCode2 = (hashCode + (lynVar == null ? 0 : lynVar.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutStatus(donut=");
        sb.append(this.a);
        sb.append(", donutBlock=");
        sb.append(this.b);
        sb.append(", isAdmin=");
        return tn.a(sb, this.c, ')');
    }
}
