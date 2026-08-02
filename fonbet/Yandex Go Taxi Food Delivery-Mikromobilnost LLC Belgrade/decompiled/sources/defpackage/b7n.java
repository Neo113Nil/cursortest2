package defpackage;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Alignment;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b7n extends n351 {
    public final cyu0 c;
    public final cyu0 d;
    public final DeliveryStateItem$TextWidget$Alignment e;
    public final DeliveryStateItem$TextWidget$Alignment f;
    public final float g;
    public final float h;
    public final j690 i;
    public final j690 j;
    public final DeliveryStateItem$TextWidget$Type k;
    public final gv90 l;
    public final boolean m;
    public final String n;

    public b7n(cyu0 cyu0Var, cyu0 cyu0Var2, DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment, DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment2, float f, float f2, j690 j690Var, j690 j690Var2, DeliveryStateItem$TextWidget$Type deliveryStateItem$TextWidget$Type, gv90 gv90Var, boolean z, String str) {
        super("dynamic-content-text-widget-key", false, 14);
        this.c = cyu0Var;
        this.d = cyu0Var2;
        this.e = deliveryStateItem$TextWidget$Alignment;
        this.f = deliveryStateItem$TextWidget$Alignment2;
        this.g = f;
        this.h = f2;
        this.i = j690Var;
        this.j = j690Var2;
        this.k = deliveryStateItem$TextWidget$Type;
        this.l = gv90Var;
        this.m = z;
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7n)) {
            return false;
        }
        b7n b7nVar = (b7n) obj;
        return this.c.equals(b7nVar.c) && jl40.l(this.d, b7nVar.d) && this.e == b7nVar.e && this.f == b7nVar.f && y7m.b(this.g, b7nVar.g) && y7m.b(this.h, b7nVar.h) && jl40.l(this.i, b7nVar.i) && jl40.l(this.j, b7nVar.j) && this.k == b7nVar.k && jl40.l(this.l, b7nVar.l) && this.m == b7nVar.m && jl40.l(this.n, b7nVar.n);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        cyu0 cyu0Var = this.d;
        int hashCode2 = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + g8e.c(this.h, g8e.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (cyu0Var == null ? 0 : cyu0Var.hashCode())) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31;
        gv90 gv90Var = this.l;
        int e = unr0.e((hashCode2 + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31, 31, this.m);
        String str = this.n;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String c = y7m.c(this.g);
        String c2 = y7m.c(this.h);
        StringBuilder sb = new StringBuilder("DynamicContentTextWidgetModel(title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", titleAlignment=");
        sb.append(this.e);
        sb.append(", subtitleAlignment=");
        sb.append(this.f);
        sb.append(", spaceAroundSize=");
        g8e.D(sb, c, ", minHeightSize=", c2, ", externalPaddings=");
        sb.append(this.i);
        sb.append(", internalPaddings=");
        sb.append(this.j);
        sb.append(", type=");
        sb.append(this.k);
        sb.append(", action=");
        sb.append(this.l);
        sb.append(", isShimmering=");
        return n.m(", metricaLabel=", this.n, Extension.C_BRAKE, sb, this.m);
    }
}
