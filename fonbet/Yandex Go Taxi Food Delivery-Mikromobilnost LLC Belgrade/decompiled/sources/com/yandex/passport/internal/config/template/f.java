package com.yandex.passport.internal.config.template;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qje;
import defpackage.ta90;
import defpackage.unr0;
import java.util.List;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class f {
    public static final e Companion = new e();
    public static final KSerializer[] c;
    public final List a;
    public final List b;

    static {
        auu0 auu0Var = auu0.a;
        c = new KSerializer[]{new p53(auu0Var, 0), new p53(new ta90(auu0Var, auu0Var), 0)};
    }

    public /* synthetic */ f(List list, List list2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, d.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlTemplateEntryCacheV1(path=");
        sb.append(this.a);
        sb.append(", query=");
        return unr0.t(sb, this.b, ')');
    }

    public f(List list, List list2) {
        this.a = list;
        this.b = list2;
    }
}
