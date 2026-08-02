package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.model.ModalDefaultAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kr70 implements mr70 {
    public final String a;
    public final ModalDefaultAction b;

    public kr70(String str, ModalDefaultAction modalDefaultAction) {
        this.a = str;
        this.b = modalDefaultAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr70)) {
            return false;
        }
        kr70 kr70Var = (kr70) obj;
        return jl40.l(this.a, kr70Var.a) && this.b == kr70Var.b;
    }

    @Override // defpackage.mr70
    public final ModalDefaultAction getAction() {
        return this.b;
    }

    @Override // defpackage.mr70
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
