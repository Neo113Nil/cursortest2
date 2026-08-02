package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChangesStore.kt */
/* loaded from: classes5.dex */
public final class pta {
    public final b a = new b();
    public akq0 b;
    public akq0 c;

    /* compiled from: ChangesStore.kt */
    public interface a {

        /* compiled from: ChangesStore.kt */
        /* renamed from: xsna.pta$a$a, reason: collision with other inner class name */
        public static final class C3530a implements a {
            public final ir5 a;

            public C3530a(ir5 ir5Var) {
                this.a = ir5Var;
            }
        }

        /* compiled from: ChangesStore.kt */
        public static final class b implements a {
            public final o2k a;

            public b(o2k o2kVar) {
                this.a = o2kVar;
            }
        }

        /* compiled from: ChangesStore.kt */
        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }
        }

        /* compiled from: ChangesStore.kt */
        public static final class d implements a {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: ChangesStore.kt */
        public static final class e implements a {
        }
    }

    /* compiled from: ChangesStore.kt */
    public final class b {
        public b() {
        }

        public final boolean a() {
            pta ptaVar = pta.this;
            return !epx.f(ptaVar.c.d, ptaVar.b.d);
        }
    }

    public pta(akq0 akq0Var) {
        this.b = akq0Var;
        this.c = akq0Var;
    }

    public final void a(a aVar) {
        akq0 a2;
        if (aVar instanceof a.C3530a) {
            a2 = akq0.a(this.c, ((a.C3530a) aVar).a, null, null, false, 30);
        } else if (aVar instanceof a.b) {
            a2 = akq0.a(this.c, null, ((a.b) aVar).a, null, false, 29);
        } else if (aVar instanceof a.c) {
            a2 = akq0.a(this.c, null, null, ((a.c) aVar).a, false, 23);
        } else if (aVar instanceof a.e) {
            a2 = akq0.a(this.c, null, null, null, false, 27);
        } else {
            if (!(aVar instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = akq0.a(this.c, null, null, null, ((a.d) aVar).a, 15);
        }
        this.c = a2;
    }
}
