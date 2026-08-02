package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;

/* loaded from: classes5.dex */
public final class c330 extends n351 {
    public final ModalViewType c;
    public final y7m d;

    public c330(ModalViewType modalViewType, y7m y7mVar) {
        super("modal-view-skeleton", false, 14);
        this.c = modalViewType;
        this.d = y7mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c330)) {
            return false;
        }
        c330 c330Var = (c330) obj;
        return this.c == c330Var.c && jl40.l(this.d, c330Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        y7m y7mVar = this.d;
        return hashCode + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a));
    }

    public final String toString() {
        return "ModalViewSkeletonModel(type=" + this.c + ", height=" + this.d + Extension.C_BRAKE;
    }
}
