package xsna;

/* compiled from: SelectionAdjustment.kt */
/* loaded from: classes11.dex */
public interface zbi0 {

    /* compiled from: SelectionAdjustment.kt */
    public static final class a {
        public static final vbi0 a = new vbi0();
        public static final wbi0 b = new wbi0();
        public static final xbi0 c = new xbi0();
        public static final ybi0 d = new ybi0();

        /* compiled from: SelectionAdjustment.kt */
        /* renamed from: xsna.zbi0$a$a, reason: collision with other inner class name */
        public static final class C4172a implements x98 {
            public static final C4172a a = new C4172a();

            @Override // xsna.x98
            public final long a(jai0 jai0Var, int i) {
                String str = jai0Var.f.a.a.c;
                return jgz.c(xus.c(i, str), xus.b(i, str));
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        public static final class b implements x98 {
            public static final b a = new b();

            @Override // xsna.x98
            public final long a(jai0 jai0Var, int i) {
                return jai0Var.f.l(i);
            }
        }
    }

    obi0 a(ndi0 ndi0Var);
}
