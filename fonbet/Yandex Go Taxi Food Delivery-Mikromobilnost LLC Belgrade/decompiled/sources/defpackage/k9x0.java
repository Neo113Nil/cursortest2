package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$OrderAction$Flow;

/* loaded from: classes5.dex */
public final class k9x0 implements r9x0 {
    public final TapAction$OrderAction$Flow a;
    public final boolean b;

    public k9x0(TapAction$OrderAction$Flow tapAction$OrderAction$Flow, boolean z) {
        this.a = tapAction$OrderAction$Flow;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9x0)) {
            return false;
        }
        k9x0 k9x0Var = (k9x0) obj;
        return this.a == k9x0Var.a && this.b == k9x0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderAction(flow=" + this.a + ", needValidation=" + this.b + Extension.C_BRAKE;
    }
}
