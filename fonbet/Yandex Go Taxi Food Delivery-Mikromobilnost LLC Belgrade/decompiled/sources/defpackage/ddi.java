package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class ddi {
    public final r0 a;
    public final gci0 b;

    public ddi() {
        r0 c = bvf0.c(a.d);
        this.a = c;
        this.b = e.d(c);
    }

    public static final class a {
        public static final a d = new a(0);
        public final Set a;
        public final uc4 b;
        public final boolean c;

        public a(Set set, uc4 uc4Var, boolean z) {
            this.a = set;
            this.b = uc4Var;
            this.c = z;
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(EmptySet.a, null, false);
        }
    }
}
