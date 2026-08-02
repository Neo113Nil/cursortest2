package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class irj {
    public final DiscountsButtonAction a;
    public final CharSequence b;
    public final int c;
    public final boolean d;

    public irj(DiscountsButtonAction discountsButtonAction, CharSequence charSequence, int i, boolean z) {
        this.a = discountsButtonAction;
        this.b = charSequence;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irj)) {
            return false;
        }
        irj irjVar = (irj) obj;
        return this.a == irjVar.a && jl40.l(this.b, irjVar.b) && this.c == irjVar.c && this.d == irjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + oyr.b(this.c, smw0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Additional(action=" + this.a + ", title=" + ((Object) this.b) + ", background=" + this.c + ", active=" + this.d + Extension.C_BRAKE;
    }
}
