package xsna;

import com.vk.dto.money.MoneyCard;

/* compiled from: MethodItems.kt */
/* loaded from: classes3.dex */
public final class it9 extends nai0 {
    public final MoneyCard c;
    public final boolean d;

    public it9(MoneyCard moneyCard, boolean z) {
        super(z);
        this.c = moneyCard;
        this.d = z;
    }

    @Override // xsna.nai0
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it9)) {
            return false;
        }
        it9 it9Var = (it9) obj;
        return epx.f(this.c, it9Var.c) && this.d == it9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardItem(card=");
        sb.append(this.c);
        sb.append(", selected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
