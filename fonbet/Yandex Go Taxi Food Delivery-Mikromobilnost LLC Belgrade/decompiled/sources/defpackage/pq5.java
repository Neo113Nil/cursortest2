package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class pq5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ tq5 c;

    public /* synthetic */ pq5(pz40 pz40Var, tq5 tq5Var, int i) {
        this.a = i;
        this.b = pz40Var;
        this.c = tq5Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        int i = this.a;
        tq5 tq5Var = this.c;
        pz40 pz40Var = this.b;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) ((r0) pz40Var).getValue();
                boolean z = true;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (jl40.l((String) it.next(), tq5Var.a)) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, a.o0((List) value, tq5Var.a)));
        return zy11.a;
    }
}
