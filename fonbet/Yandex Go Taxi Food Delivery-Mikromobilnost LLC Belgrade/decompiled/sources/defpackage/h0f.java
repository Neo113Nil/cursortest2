package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class h0f {
    public static final g0f Companion = new g0f();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(6)), null, null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ h0f(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, f0f.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0f)) {
            return false;
        }
        h0f h0fVar = (h0f) obj;
        return jl40.l(this.a, h0fVar.a) && jl40.l(this.b, h0fVar.b) && jl40.l(this.c, h0fVar.c) && jl40.l(this.d, h0fVar.d) && jl40.l(this.e, h0fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterOffersRequestDto(offers=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", eventSessionId=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", counterOffersReason=");
        return b64.p(sb, this.e, ')');
    }

    public h0f(String str, String str2, String str3, String str4, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
