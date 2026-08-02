package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class hfr0 implements ev31 {
    public final vdr0 a = new vdr0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static List a(List list, j59 j59Var) {
        if (j59Var != null) {
            String str = j59Var.a;
            Iterable<j59> iterable = (Iterable) list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (jl40.l(((j59) it.next()).a, str)) {
                        list = new ArrayList(tcc.n(iterable, 10));
                        for (j59 j59Var2 : iterable) {
                            if (jl40.l(j59Var2.a, str)) {
                                j59Var2 = new j59(j59Var2.a, j59Var2.b, a.m0(j59Var2.c, j59Var.c));
                            }
                            list.add(j59Var2);
                        }
                    }
                }
            }
        }
        return list;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        wdr0 wdr0Var = (wdr0) obj;
        u8j0 u8j0Var = wdr0Var.a;
        boolean z = u8j0Var instanceof t8j0;
        List list = EmptyList.a;
        if (!z && !(u8j0Var instanceof s8j0)) {
            if (!(u8j0Var instanceof r8j0)) {
                w511.b();
                return null;
            }
            v7r0 v7r0Var = (v7r0) ((r8j0) u8j0Var).a;
            List a = a(a(a(a(a(v7r0Var.c, wdr0Var.g), wdr0Var.j), wdr0Var.f), wdr0Var.h), wdr0Var.i);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : a) {
                if (!((j59) obj2).c.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            ListBuilder a2 = rcc.a();
            Text.Constant i = g8e.i(Text.Companion, v7r0Var.a);
            String str = v7r0Var.b;
            a2.add(new ier0(i, str != null ? new Text.Constant(str) : null));
            Set set = wdr0Var.b;
            boolean z2 = wdr0Var.e;
            ListBuilder a3 = rcc.a();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j59 j59Var = (j59) it.next();
                a3.add(new l8r0(j59Var.a, j59Var.b));
                for (o8r0 o8r0Var : j59Var.c) {
                    a3.add(j9r0.b(o8r0Var, set.contains(o8r0Var.a), !z2));
                }
            }
            a2.addAll(a3.j());
            a2.add(this.a);
            list = a2.j();
        }
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        return new gfr0(list, z, s8j0Var != null ? r501.a(s8j0Var.a, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : null);
    }
}
