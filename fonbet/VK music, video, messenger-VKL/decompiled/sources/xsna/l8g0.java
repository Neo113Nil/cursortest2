package xsna;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: RequestTag.kt */
/* loaded from: classes.dex */
public final class l8g0 {
    public final Long a;
    public final Boolean b;
    public final String c;

    public l8g0() {
        this(null, null, null, 15);
    }

    public final LinkedHashMap a() {
        return pn00.m(new Pair("UID", this.a), new Pair("AWAIT_NETWORK", this.b), new Pair("REASON", this.c), new Pair("RETRY_COUNT", null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8g0)) {
            return false;
        }
        l8g0 l8g0Var = (l8g0) obj;
        return epx.f(this.a, l8g0Var.a) && epx.f(this.b, l8g0Var.b) && epx.f(this.c, l8g0Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        return (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestTag(uid=");
        sb.append(this.a);
        sb.append(", awaitNetwork=");
        sb.append(this.b);
        sb.append(", reason=");
        return i5s.a(sb, this.c, ", retryCount=null)");
    }

    public l8g0(Long l, Boolean bool, String str, int i) {
        l = (i & 1) != 0 ? null : l;
        bool = (i & 2) != 0 ? null : bool;
        str = (i & 4) != 0 ? null : str;
        this.a = l;
        this.b = bool;
        this.c = str;
    }
}
