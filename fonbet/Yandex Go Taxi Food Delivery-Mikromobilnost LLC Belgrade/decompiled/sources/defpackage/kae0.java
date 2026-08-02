package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.data.PopupLayer;

/* loaded from: classes5.dex */
public final class kae0 {
    public final String a;
    public final l9e0 b;
    public final zii0 c;
    public final zii0 d;
    public final boolean e;
    public final m8s0 f;
    public final PopupLayer g;
    public final int h;

    public kae0(String str, l9e0 l9e0Var, zii0 zii0Var, zii0 zii0Var2, boolean z, m8s0 m8s0Var, PopupLayer popupLayer, int i) {
        this.a = str;
        this.b = l9e0Var;
        this.c = zii0Var;
        this.d = zii0Var2;
        this.e = z;
        this.f = m8s0Var;
        this.g = popupLayer;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kae0)) {
            return false;
        }
        kae0 kae0Var = (kae0) obj;
        return jl40.l(this.a, kae0Var.a) && jl40.l(this.b, kae0Var.b) && jl40.l(this.c, kae0Var.c) && jl40.l(this.d, kae0Var.d) && this.e == kae0Var.e && jl40.l(this.f, kae0Var.f) && this.g == kae0Var.g && this.h == kae0Var.h;
    }

    public final int hashCode() {
        int e = unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        m8s0 m8s0Var = this.f;
        return Integer.hashCode(this.h) + ((this.g.hashCode() + ((e + (m8s0Var == null ? 0 : m8s0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "PopupRenderModel(popupId=" + this.a + ", popup=" + this.b + ", anchorRect=" + this.c + ", screenBounds=" + this.d + ", isDismissable=" + this.e + ", showPolicy=" + this.f + ", layer=" + this.g + ", scrollOffsetAtCapture=" + this.h + Extension.C_BRAKE;
    }
}
