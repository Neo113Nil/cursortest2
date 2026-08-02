package defpackage;

import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;
import java.util.Date;

/* loaded from: classes14.dex */
public final class gv10 extends jv10 {
    public final String D;
    public isa0 E;

    public gv10(long j, int i, Date date, String str, MessagePresentationModel$State messagePresentationModel$State) {
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
        if (obj == null || !gv10.class.equals(obj.getClass())) {
            return false;
        }
        gv10 gv10Var = (gv10) obj;
        if (this.a == gv10Var.a && this.b == gv10Var.b && jl40.l(this.c, gv10Var.c) && this.w == gv10Var.w) {
            return jl40.l(this.D, gv10Var.D);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.D.hashCode() + ((this.w.hashCode() + ((this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31)) * 31)) * 31);
    }
}
