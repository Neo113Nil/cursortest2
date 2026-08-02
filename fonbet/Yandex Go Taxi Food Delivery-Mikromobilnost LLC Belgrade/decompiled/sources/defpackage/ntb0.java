package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.minimap.MapPinType;

/* loaded from: classes5.dex */
public final class ntb0 {
    public final MapPinType a;
    public final jtb0 b;
    public final tl91 c;
    public final boolean d;

    public ntb0(MapPinType mapPinType, jtb0 jtb0Var, tl91 tl91Var, boolean z) {
        this.a = mapPinType;
        this.b = jtb0Var;
        this.c = tl91Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntb0)) {
            return false;
        }
        ntb0 ntb0Var = (ntb0) obj;
        return this.a == ntb0Var.a && this.b.equals(ntb0Var.b) && this.c.equals(ntb0Var.c) && this.d == ntb0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Pin(type=" + this.a + ", bubble=" + this.b + ", point=" + this.c + ", hasBubbleArrow=" + this.d + Extension.C_BRAKE;
    }
}
