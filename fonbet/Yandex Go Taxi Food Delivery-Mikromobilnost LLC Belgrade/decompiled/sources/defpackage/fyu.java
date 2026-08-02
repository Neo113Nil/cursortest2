package defpackage;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class fyu {
    public static final /* synthetic */ kgx[] g = {new MutablePropertyReference1Impl("savedSelectedTransportTypeIds", 0, "getSavedSelectedTransportTypeIds()Ljava/util/Set;", fyu.class)};
    public final sme0 a;
    public String b;
    public final r0 c;
    public final gci0 d;
    public final r0 e;
    public final gci0 f;

    public fyu(dne0 dne0Var) {
        cne0 a = dne0Var.a("HUB_PERSONALIZATION_PREFERENCES");
        sme0 sme0Var = new sme0(1, a, a, "SELECTED_TRANSPORT_TYPE_IDS");
        this.a = sme0Var;
        r0 c = bvf0.c(new j5r(null, false));
        this.c = c;
        this.d = e.d(c);
        r0 c2 = bvf0.c(new oa11((Set) sme0Var.getValue(this, g[0]), false));
        this.e = c2;
        this.f = e.d(c2);
    }

    public final String a() {
        String str = this.b;
        return str == null ? ((j5r) this.c.getValue()).a : str;
    }

    public final Set b() {
        return ((oa11) this.f.a.getValue()).a;
    }

    public final boolean c(String str, boolean z) {
        r0 r0Var = this.c;
        j5r j5rVar = (j5r) r0Var.getValue();
        if (jl40.l(str, j5rVar.a) && (z || !j5rVar.b)) {
            return false;
        }
        if (z) {
            String str2 = this.b;
            if (str2 != null && !jl40.l(str, str2)) {
                return false;
            }
        } else {
            this.b = str;
        }
        j5r j5rVar2 = new j5r(str, z);
        r0Var.getClass();
        r0Var.m(null, j5rVar2);
        return true;
    }

    public final void d(Set set, boolean z) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.e;
            value = r0Var.getValue();
            this.a.setValue(this, g[0], set);
        } while (!r0Var.k(value, new oa11(set, z)));
    }
}
