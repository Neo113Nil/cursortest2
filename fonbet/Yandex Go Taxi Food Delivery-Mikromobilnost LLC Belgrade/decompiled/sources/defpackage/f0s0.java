package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.VerticalContentAlignment;

/* loaded from: classes5.dex */
public final class f0s0 {
    public final h0s0 a;
    public final VerticalContentAlignment b;

    public f0s0(h0s0 h0s0Var, VerticalContentAlignment verticalContentAlignment) {
        this.a = h0s0Var;
        this.b = verticalContentAlignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0s0)) {
            return false;
        }
        f0s0 f0s0Var = (f0s0) obj;
        return this.a.equals(f0s0Var.a) && this.b == f0s0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        VerticalContentAlignment verticalContentAlignment = this.b;
        return hashCode + (verticalContentAlignment == null ? 0 : verticalContentAlignment.hashCode());
    }

    public final String toString() {
        return "ShortcutLayerModel(widget=" + this.a + ", verticalAlignment=" + this.b + Extension.C_BRAKE;
    }
}
