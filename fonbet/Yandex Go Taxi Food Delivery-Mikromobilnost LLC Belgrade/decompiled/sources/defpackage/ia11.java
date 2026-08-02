package defpackage;

import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ia11 implements la11 {
    public final CharSequence a;
    public final ArrayList b;
    public final MultimodalRouteFabState c;
    public final BoundingBox d;
    public final bg30 e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public ia11(CharSequence charSequence, ArrayList arrayList, MultimodalRouteFabState multimodalRouteFabState, BoundingBox boundingBox, bg30 bg30Var, String str, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = multimodalRouteFabState;
        this.d = boundingBox;
        this.e = bg30Var;
        this.f = str;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia11)) {
            return false;
        }
        ia11 ia11Var = (ia11) obj;
        return jl40.l(this.a, ia11Var.a) && this.b.equals(ia11Var.b) && this.c == ia11Var.c && jl40.l(this.d, ia11Var.d) && this.e.equals(ia11Var.e) && jl40.l(this.f, ia11Var.f) && this.g == ia11Var.g && this.h == ia11Var.h;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.h) + unr0.e(unr0.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ly3.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(title=");
        sb.append((Object) this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", focusFabState=");
        sb.append(this.c);
        sb.append(", routeFocusBBPoints=");
        sb.append(this.d);
        sb.append(", payload=");
        sb.append(this.e);
        sb.append(", offerId=");
        sb.append(this.f);
        sb.append(", isTaxiAndWalkingSectionCompleted=");
        return smw0.k(", enableV2Design=", Extension.C_BRAKE, sb, this.g, this.h);
    }
}
