package xsna;

import com.vk.im.engine.models.messages.MsgReaction;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Triple;

/* compiled from: OnMsgSetReactionsEvent.kt */
/* loaded from: classes2.dex */
public final class n980 extends sxp {
    public final Object b;
    public final Map<Long, Collection<Triple<Integer, Integer, Collection<MsgReaction>>>> c;

    public n980(HashMap hashMap, Object obj) {
        this.b = obj;
        this.c = hashMap;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n980)) {
            return false;
        }
        n980 n980Var = (n980) obj;
        return epx.f(this.b, n980Var.b) && epx.f(this.c, n980Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgSetReactionsEvent(changerTag=");
        sb.append(this.b);
        sb.append(", reactions=");
        return cjl0.a(sb, this.c, ')');
    }
}
