package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class e7c {
    public static final d7c Companion = new d7c();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(3)), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ e7c(String str, int i, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, c7c.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7c)) {
            return false;
        }
        e7c e7cVar = (e7c) obj;
        return jl40.l(this.a, e7cVar.a) && jl40.l(this.b, e7cVar.b) && jl40.l(this.c, e7cVar.c) && jl40.l(this.d, e7cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClosingOfferRequestDto(offers=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", eventSessionId=");
        sb.append(this.c);
        sb.append(", language=");
        return b64.p(sb, this.d, ')');
    }

    public e7c(List list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
