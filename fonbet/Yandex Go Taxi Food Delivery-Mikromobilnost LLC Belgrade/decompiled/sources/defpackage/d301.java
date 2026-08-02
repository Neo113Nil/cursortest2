package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d301 {
    public final r0 a;
    public final gci0 b;

    public d301() {
        r0 c = bvf0.c(EmptySet.a);
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(String str) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.i((Set) value, str)));
    }
}
