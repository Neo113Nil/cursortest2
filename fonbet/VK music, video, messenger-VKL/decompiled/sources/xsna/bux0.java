package xsna;

import com.vk.im.engine.models.messages.MsgReaction;
import java.util.List;

/* compiled from: WithReactions.kt */
/* loaded from: classes2.dex */
public final class bux0 implements aux0 {
    public List<? extends MsgReaction> b;
    public Integer c;

    public bux0() {
        throw null;
    }

    @Override // xsna.aux0
    public final List<MsgReaction> K() {
        return this.b;
    }

    @Override // xsna.aux0
    public final Integer R5() {
        return this.c;
    }

    @Override // xsna.aux0
    public final void d(Integer num) {
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bux0)) {
            return false;
        }
        bux0 bux0Var = (bux0) obj;
        return epx.f(this.b, bux0Var.b) && epx.f(this.c, bux0Var.c);
    }

    @Override // xsna.aux0
    public final void f5(List<? extends MsgReaction> list) {
        this.b = list;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithReactionsImpl(reactions=");
        sb.append(this.b);
        sb.append(", myReaction=");
        return uqi.b(sb, this.c, ')');
    }
}
