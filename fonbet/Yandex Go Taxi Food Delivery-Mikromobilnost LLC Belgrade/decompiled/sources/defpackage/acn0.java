package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class acn0 {
    public final r0 a = bvf0.c(b.f());
    public final r0 b = bvf0.c(b.f());
    public final LinkedHashMap c = new LinkedHashMap();

    public final List a(String str) {
        List list = (List) ((Map) this.a.getValue()).get(str);
        return list == null ? EmptyList.a : list;
    }

    public final void b(String str, ArrayList arrayList) {
        r0 r0Var = this.a;
        r0Var.m(null, b.o((Map) r0Var.getValue(), new Pair(str, arrayList)));
    }

    public final void c(String str, fj91 fj91Var) {
        r0 r0Var = this.b;
        r0Var.m(null, b.o((Map) r0Var.getValue(), new Pair(str, fj91Var)));
    }
}
