package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class azc {
    public static final zyc Companion = new zyc();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new juc(8)), null, null};
    public final boolean a;
    public final List b;
    public final String c;
    public final boolean d;

    public /* synthetic */ azc(int i, String str, List list, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, yyc.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azc)) {
            return false;
        }
        azc azcVar = (azc) obj;
        return this.a == azcVar.a && jl40.l(this.b, azcVar.b) && jl40.l(this.c, azcVar.c) && this.d == azcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletePurchaseParams(acknowledge=");
        sb.append(this.a);
        sb.append(", products=");
        sb.append(this.b);
        sb.append(", token=");
        sb.append(this.c);
        sb.append(", isSubscription=");
        return unr0.u(sb, this.d, ')');
    }

    public azc(String str, boolean z, boolean z2, List list) {
        this.a = z;
        this.b = list;
        this.c = str;
        this.d = z2;
    }
}
