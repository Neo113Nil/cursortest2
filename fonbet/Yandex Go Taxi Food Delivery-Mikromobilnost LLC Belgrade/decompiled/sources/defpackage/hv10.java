package defpackage;

import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;
import java.util.Date;

/* loaded from: classes14.dex */
public final class hv10 extends jv10 {
    public final String D;
    public isa0 E;

    public hv10(long j, int i, Date date, String str, MessagePresentationModel$State messagePresentationModel$State) {
        super(j, i, date, messagePresentationModel$State);
        this.D = str;
        this.E = null;
    }

    @Override // defpackage.jv10
    public final isa0 a() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !hv10.class.equals(obj.getClass())) {
            return false;
        }
        hv10 hv10Var = (hv10) obj;
        if (this.a == hv10Var.a && this.b == hv10Var.b && jl40.l(this.c, hv10Var.c) && this.w == hv10Var.w) {
            return this.D.equals(hv10Var.D);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.D.hashCode() + ((this.w.hashCode() + ((this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31)) * 31)) * 31);
    }
}
