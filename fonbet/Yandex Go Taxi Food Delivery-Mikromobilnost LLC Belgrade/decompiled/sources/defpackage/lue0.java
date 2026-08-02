package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class lue0 {
    public static final kue0 Companion = new kue0();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(22)), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ lue0(String str, int i, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, jue0.a.getDescriptor());
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
        if (!(obj instanceof lue0)) {
            return false;
        }
        lue0 lue0Var = (lue0) obj;
        return jl40.l(this.a, lue0Var.a) && jl40.l(this.b, lue0Var.b) && jl40.l(this.c, lue0Var.c) && jl40.l(this.d, lue0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresaleRequestDto(offers=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", eventSessionId=");
        sb.append(this.c);
        sb.append(", language=");
        return b64.p(sb, this.d, ')');
    }

    public lue0(List list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
