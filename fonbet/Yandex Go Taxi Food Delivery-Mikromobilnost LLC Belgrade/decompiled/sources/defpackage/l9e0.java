package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection;

/* loaded from: classes5.dex */
public final class l9e0 {
    public final CharSequence a;
    public final ldc b;
    public final PopupModel$TextHintPopup$ArrowDirection c;

    public l9e0(CharSequence charSequence, ldc ldcVar, PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection) {
        this.a = charSequence;
        this.b = ldcVar;
        this.c = popupModel$TextHintPopup$ArrowDirection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9e0)) {
            return false;
        }
        l9e0 l9e0Var = (l9e0) obj;
        return jl40.l(this.a, l9e0Var.a) && jl40.l(this.b, l9e0Var.b) && this.c == l9e0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return this.c.hashCode() + ((hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31);
    }

    public final String toString() {
        return "TextHintPopup(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", arrowDirection=" + this.c + Extension.C_BRAKE;
    }
}
