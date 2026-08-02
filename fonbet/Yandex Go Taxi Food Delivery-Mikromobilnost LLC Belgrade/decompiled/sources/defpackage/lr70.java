package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.model.ModalDefaultAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lr70 implements mr70 {
    public final String a;
    public final ModalDefaultAction b;
    public final String c;

    public lr70(String str, ModalDefaultAction modalDefaultAction, String str2) {
        this.a = str;
        this.b = modalDefaultAction;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr70)) {
            return false;
        }
        lr70 lr70Var = (lr70) obj;
        return jl40.l(this.a, lr70Var.a) && this.b == lr70Var.b && this.c.equals(lr70Var.c);
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
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slider(title=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
