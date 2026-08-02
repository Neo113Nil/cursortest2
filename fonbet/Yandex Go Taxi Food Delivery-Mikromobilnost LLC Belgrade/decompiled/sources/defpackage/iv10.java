package defpackage;

import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;
import java.util.Date;

/* loaded from: classes14.dex */
public final class iv10 extends jv10 {
    public final String D;
    public final String E;

    public iv10(long j, int i, Date date, String str, String str2, MessagePresentationModel$State messagePresentationModel$State) {
        super(j, i, date, messagePresentationModel$State);
        this.D = str;
        this.E = str2;
    }

    @Override // defpackage.jv10
    public final isa0 a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !iv10.class.equals(obj.getClass())) {
            return false;
        }
        iv10 iv10Var = (iv10) obj;
        if (this.a == iv10Var.a && this.b == iv10Var.b && jl40.l(this.c, iv10Var.c) && this.w == iv10Var.w && this.D.equals(iv10Var.D)) {
            return this.E.equals(iv10Var.E);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.E.hashCode() + ((this.D.hashCode() + ((this.w.hashCode() + ((this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31)) * 31)) * 31)) * 31);
    }
}
