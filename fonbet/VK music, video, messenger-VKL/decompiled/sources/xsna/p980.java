package xsna;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: OnMsgUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class p980 extends q490 {
    public final Object c;
    public final Map<Long, Collection<Integer>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public p980(Object obj, Map<Long, ? extends Collection<Integer>> map) {
        this.c = obj;
        this.d = map;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p980)) {
            return false;
        }
        p980 p980Var = (p980) obj;
        return epx.f(this.c, p980Var.c) && epx.f(this.d, p980Var.d);
    }

    public final int hashCode() {
        Object obj = this.c;
        return this.d.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgUpdateEvent(changerTag=");
        sb.append(this.c);
        sb.append(", msgIds=");
        return cjl0.a(sb, this.d, ')');
    }

    public p980(Object obj, long j, int i) {
        this(obj, on00.f(new Pair(Long.valueOf(j), Collections.singletonList(Integer.valueOf(i)))));
    }

    public p980(long j, String str, Collection collection) {
        this(str, on00.f(new Pair(Long.valueOf(j), j5g.O0(collection))));
    }
}
