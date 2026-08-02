package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.model.ModalDefaultAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ar70 implements fr70 {
    public final String a;
    public final boolean b;
    public final ModalDefaultAction c;

    public ar70(String str, boolean z, ModalDefaultAction modalDefaultAction) {
        this.a = str;
        this.b = z;
        this.c = modalDefaultAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar70)) {
            return false;
        }
        ar70 ar70Var = (ar70) obj;
        return jl40.l(this.a, ar70Var.a) && this.b == ar70Var.b && this.c == ar70Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("ButtonItem(text=", this.a, ", isPrimaryButton=", ", action=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
