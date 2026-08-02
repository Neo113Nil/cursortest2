package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;

/* loaded from: classes5.dex */
public final class l030 implements uni {
    public final zi8 a;
    public final ModalViewType b;
    public final boolean c;

    public l030(zi8 zi8Var, ModalViewType modalViewType, boolean z) {
        this.a = zi8Var;
        this.b = modalViewType;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l030)) {
            return false;
        }
        l030 l030Var = (l030) obj;
        return this.a.equals(l030Var.a) && this.b == l030Var.b && this.c == l030Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalViewArgs(cardMode=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", shouldHideBottomSection=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
