package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class ccc0 {
    public final r0 a = bvf0.c(EmptyList.a);

    public static ArrayList c(List list, bcc0 bcc0Var, bcc0 bcc0Var2) {
        List<bcc0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (bcc0 bcc0Var3 : list2) {
            if (bcc0Var3 == bcc0Var) {
                bcc0Var3 = bcc0Var2;
            }
            arrayList.add(bcc0Var3);
        }
        return arrayList;
    }

    public final void a() {
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, EmptyList.a);
    }

    public final void b(bcc0 bcc0Var) {
        r0 r0Var;
        Object value;
        List list;
        bcc0 bcc0Var2;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            list = (List) value;
            bcc0Var2 = (bcc0) a.b0(list);
        } while (!r0Var.k(value, jl40.l(bcc0Var2 != null ? bcc0Var2.a : null, bcc0Var.a) ? a.o0(a.K(list), bcc0Var) : a.o0(list, bcc0Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r6 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(bcc0 bcc0Var) {
        r0 r0Var;
        Object value;
        List list;
        bcc0 bcc0Var2;
        dm80 dm80Var = bcc0Var.a;
        xl80 xl80Var = dm80Var instanceof xl80 ? (xl80) dm80Var : null;
        if (xl80Var == null) {
            return;
        }
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            list = (List) value;
            Iterator it = list.iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((bcc0) next).a instanceof xl80) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            bcc0Var2 = (bcc0) obj;
        } while (!r0Var.k(value, bcc0Var2 == null ? a.o0(list, bcc0Var) : c(list, bcc0Var2, new bcc0(xl80Var, bcc0Var2.b))));
    }
}
