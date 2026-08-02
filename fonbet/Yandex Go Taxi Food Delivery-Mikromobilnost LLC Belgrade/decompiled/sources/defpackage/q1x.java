package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class q1x implements a2x {
    public static final p1x Companion = new p1x();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(20))};
    public final String a;
    public final List b;

    public /* synthetic */ q1x(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, o1x.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1x)) {
            return false;
        }
        q1x q1xVar = (q1x) obj;
        return jl40.l(this.a, q1xVar.a) && jl40.l(this.b, q1xVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Container(metaColor=");
        sb.append(this.a);
        sb.append(", items=");
        return unr0.t(sb, this.b, ')');
    }

    public q1x(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }
}
