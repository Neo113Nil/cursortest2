package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ModalAction$ModalType;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.OpeningSource;

/* loaded from: classes5.dex */
public final class c9x0 implements r9x0 {
    public final String a;
    public final zi8 b;
    public final ButtonType c;
    public final TapAction$ModalAction$ModalType d;
    public final m8s0 e;
    public final boolean f;
    public final OpeningSource g;
    public final ldc h;

    public c9x0(String str, zi8 zi8Var, ButtonType buttonType, TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType, m8s0 m8s0Var, boolean z, OpeningSource openingSource, ldc ldcVar) {
        this.a = str;
        this.b = zi8Var;
        this.c = buttonType;
        this.d = tapAction$ModalAction$ModalType;
        this.e = m8s0Var;
        this.f = z;
        this.g = openingSource;
        this.h = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9x0)) {
            return false;
        }
        c9x0 c9x0Var = (c9x0) obj;
        return jl40.l(this.a, c9x0Var.a) && this.b.equals(c9x0Var.b) && this.c == c9x0Var.c && this.d == c9x0Var.d && jl40.l(this.e, c9x0Var.e) && this.f == c9x0Var.f && this.g == c9x0Var.g && jl40.l(this.h, c9x0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        TapAction$ModalAction$ModalType tapAction$ModalAction$ModalType = this.d;
        int hashCode2 = (hashCode + (tapAction$ModalAction$ModalType == null ? 0 : tapAction$ModalAction$ModalType.hashCode())) * 31;
        m8s0 m8s0Var = this.e;
        int hashCode3 = (this.g.hashCode() + unr0.e((hashCode2 + (m8s0Var == null ? 0 : m8s0Var.hashCode())) * 31, 31, this.f)) * 31;
        ldc ldcVar = this.h;
        return hashCode3 + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        return "ModalAction(modalId=" + this.a + ", cardMode=" + this.b + ", topButton=" + this.c + ", type=" + this.d + ", showPolicy=" + this.e + ", shouldCloseByHardwareBack=" + this.f + ", source=" + this.g + ", backgroundColor=" + this.h + Extension.C_BRAKE;
    }
}
