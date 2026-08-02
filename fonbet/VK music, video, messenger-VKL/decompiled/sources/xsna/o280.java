package xsna;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: OnChannelMsgUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class o280 extends sxp {
    public final Object b;
    public final Map<Long, Collection<Integer>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public o280(Object obj, Map<Long, ? extends Collection<Integer>> map) {
        this.b = obj;
        this.c = map;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o280)) {
            return false;
        }
        o280 o280Var = (o280) obj;
        return epx.f(this.b, o280Var.b) && epx.f(this.c, o280Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgUpdateEvent(changerTag=");
        sb.append(this.b);
        sb.append(", msgLocalIds=");
        return cjl0.a(sb, this.c, ')');
    }

    public o280(String str, long j, int i) {
        this(str, on00.f(new Pair(Long.valueOf(j), Collections.singletonList(Integer.valueOf(i)))));
    }

    public o280(long j, String str, Collection collection) {
        this(str, on00.f(new Pair(Long.valueOf(j), j5g.O0(collection))));
    }
}
