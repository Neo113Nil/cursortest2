package defpackage;

import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bt40 implements et40 {
    public final String a;
    public final String b;
    public final List c;
    public final bg30 d;
    public final zr40 e;
    public final MultimodalRouteFabState f;
    public final BoundingBox g;
    public final v3y0 h;
    public final boolean i;

    public bt40(String str, String str2, List list, bg30 bg30Var, zr40 zr40Var, MultimodalRouteFabState multimodalRouteFabState, BoundingBox boundingBox, v3y0 v3y0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = bg30Var;
        this.e = zr40Var;
        this.f = multimodalRouteFabState;
        this.g = boundingBox;
        this.h = v3y0Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt40)) {
            return false;
        }
        bt40 bt40Var = (bt40) obj;
        return jl40.l(this.a, bt40Var.a) && jl40.l(this.b, bt40Var.b) && jl40.l(this.c, bt40Var.c) && this.d.equals(bt40Var.d) && jl40.l(this.e, bt40Var.e) && this.f == bt40Var.f && jl40.l(this.g, bt40Var.g) && jl40.l(this.h, bt40Var.h) && this.i == bt40Var.i;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((b + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        v3y0 v3y0Var = this.h;
        return Boolean.hashCode(this.i) + ((hashCode + (v3y0Var != null ? v3y0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Content(title=", this.a, ", subtitle=", this.b, ", items=");
        v.append(this.c);
        v.append(", payload=");
        v.append(this.d);
        v.append(", multimodalPaymentInfo=");
        v.append(this.e);
        v.append(", focusFabState=");
        v.append(this.f);
        v.append(", routeFocusBBPoints=");
        v.append(this.g);
        v.append(", taxiOrderPayload=");
        v.append(this.h);
        v.append(", enableV2Design=");
        return x4e.i(v, this.i, Extension.C_BRAKE);
    }
}
