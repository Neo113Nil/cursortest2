package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class ol30 {
    public final r0 a;
    public final gci0 b;
    public final r0 c;
    public final gci0 d;

    public ol30() {
        r0 c = bvf0.c(EmptyList.a);
        this.a = c;
        this.b = e.d(c);
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.c = c2;
        this.d = e.d(c2);
    }

    public final void a(List list) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        do {
            r0Var = this.c;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.FALSE));
        do {
            r0Var2 = this.a;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, list));
    }
}
