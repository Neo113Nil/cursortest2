package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class oln0 {
    public final r0 a = bvf0.c(b.f());

    public final List a(String str) {
        List list = (List) ((Map) this.a.getValue()).get(str);
        return list == null ? EmptyList.a : list;
    }

    public final void b(String str, ArrayList arrayList) {
        r0 r0Var = this.a;
        Map o = b.o((Map) r0Var.getValue(), new Pair(str, arrayList));
        r0Var.getClass();
        r0Var.m(null, o);
    }
}
