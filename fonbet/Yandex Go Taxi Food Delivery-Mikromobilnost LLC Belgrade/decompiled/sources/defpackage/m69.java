package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes12.dex */
public final class m69 implements z910 {
    public final /* synthetic */ to5 a;
    public final /* synthetic */ to5 b;
    public final /* synthetic */ to5 c;

    public m69(to5 to5Var, to5 to5Var2, to5 to5Var3) {
        this.a = to5Var;
        this.b = to5Var2;
        this.c = to5Var3;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Integer valueOf;
        aa10 w;
        ArrayList arrayList = new ArrayList(list.size());
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x910 x910Var = (x910) list.get(i);
            if (jl40.l(pj91.g(x910Var), "center")) {
                ref$IntRef.element = i;
            } else {
                arrayList.add(x910Var.l0(n8e.b(0, j, 0, 0, 0, 11)));
            }
        }
        Integer num = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((o) arrayList.get(0)).a);
            int f = scc.f(arrayList);
            if (1 <= f) {
                int i3 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((o) arrayList.get(i3)).a);
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == f) {
                        break;
                    }
                    i3++;
                }
            }
        }
        int intValue = (valueOf != null ? valueOf.intValue() : 0) * 2;
        o l0 = ((x910) list.get(ref$IntRef.element)).l0(n8e.e(j) ? n8e.b(0, j, n8e.i(j) - intValue, 0, 0, 9) : j);
        int i4 = intValue + l0.a;
        if (!arrayList.isEmpty()) {
            num = Integer.valueOf(((o) arrayList.get(0)).b);
            int f2 = scc.f(arrayList);
            if (1 <= f2) {
                while (true) {
                    Integer valueOf3 = Integer.valueOf(((o) arrayList.get(i2)).b);
                    if (valueOf3.compareTo(num) > 0) {
                        num = valueOf3;
                    }
                    if (i2 == f2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        int max = Math.max(num != null ? num.intValue() : 0, l0.b);
        if (n8e.e(j)) {
            i4 = Math.max(i4, n8e.i(j));
        }
        if (n8e.d(j)) {
            max = Math.max(max, n8e.h(j));
        }
        int i5 = i4;
        w = kVar.w(i5, max, b.f(), new l69(i5, ref$IntRef, arrayList, this.a, max, l0, this.b, this.c));
        return w;
    }
}
