package xsna;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: OnMsgUpdateReactionsEvent.kt */
/* loaded from: classes2.dex */
public final class q980 extends sxp {
    public final Object b;
    public final Map<Long, Collection<Pair<Integer, Integer>>> c;

    public q980(HashMap hashMap, Object obj) {
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
        if (!(obj instanceof q980)) {
            return false;
        }
        q980 q980Var = (q980) obj;
        return epx.f(this.b, q980Var.b) && epx.f(this.c, q980Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgUpdateReactionsEvent(changerTag=");
        sb.append(this.b);
        sb.append(", reactions=");
        return cjl0.a(sb, this.c, ')');
    }
}
