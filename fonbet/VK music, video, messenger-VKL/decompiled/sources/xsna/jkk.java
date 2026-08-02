package xsna;

import java.util.AbstractList;
import java.util.List;
import xsna.tlo0;

/* compiled from: ClipCtaWithDonutViewState.kt */
/* loaded from: classes16.dex */
public final class jkk {
    public final tlo0.f a;
    public final List b;
    public final boolean c;

    public jkk(tlo0.f fVar, AbstractList abstractList, boolean z) {
        this.a = fVar;
        this.b = abstractList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkk)) {
            return false;
        }
        jkk jkkVar = (jkk) obj;
        return this.a.equals(jkkVar.a) && epx.f(this.b, jkkVar.b) && this.c == jkkVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fw3.a(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CtaGroup(title=");
        sb.append(this.a);
        sb.append(", items=");
        mr.c(", isLoading=", sb, this.b);
        return defpackage.q0.a(sb, this.c, ')');
    }
}
