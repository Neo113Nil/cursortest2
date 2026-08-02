package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.SeparateTitleModel$Align;

/* loaded from: classes5.dex */
public final class jrq0 {
    public final CharSequence a;
    public final SeparateTitleModel$Align b;

    public jrq0(CharSequence charSequence, SeparateTitleModel$Align separateTitleModel$Align) {
        this.a = charSequence;
        this.b = separateTitleModel$Align;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrq0)) {
            return false;
        }
        jrq0 jrq0Var = (jrq0) obj;
        return jl40.l(this.a, jrq0Var.a) && this.b == jrq0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeparateTitleModel(text=" + ((Object) this.a) + ", align=" + this.b + Extension.C_BRAKE;
    }
}
