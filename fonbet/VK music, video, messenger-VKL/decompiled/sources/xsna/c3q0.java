package xsna;

/* compiled from: UndoManager.kt */
/* loaded from: classes11.dex */
public final class c3q0 {
    public final int a;
    public a b;
    public a c;
    public int d;
    public Long e;
    public boolean f;

    /* compiled from: UndoManager.kt */
    public static final class a {
        public a a;
        public tho0 b;

        public a(a aVar, tho0 tho0Var) {
            this.a = aVar;
            this.b = tho0Var;
        }
    }

    public c3q0() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[LOOP:0: B:25:0x0059->B:30:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[EDGE_INSN: B:31:0x0068->B:32:0x0068 BREAK  A[LOOP:0: B:25:0x0059->B:30:0x0065], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(tho0 tho0Var) {
        a aVar;
        tho0 tho0Var2;
        this.f = false;
        a aVar2 = this.b;
        if (epx.f(tho0Var, aVar2 != null ? aVar2.b : null)) {
            return;
        }
        String str = tho0Var.a.c;
        a aVar3 = this.b;
        if (epx.f(str, (aVar3 == null || (tho0Var2 = aVar3.b) == null) ? null : tho0Var2.a.c)) {
            a aVar4 = this.b;
            if (aVar4 != null) {
                aVar4.b = tho0Var;
                return;
            }
            return;
        }
        this.b = new a(this.b, tho0Var);
        this.c = null;
        int length = tho0Var.a.c.length() + this.d;
        this.d = length;
        if (length > this.a) {
            a aVar5 = this.b;
            if ((aVar5 != null ? aVar5.a : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 != null) {
                    a aVar6 = aVar5.a;
                    if (aVar6 != null) {
                        aVar = aVar6.a;
                        if (aVar != null) {
                            break;
                        } else {
                            aVar5 = aVar5.a;
                        }
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
            }
            if (aVar5 != null) {
                aVar5.a = null;
            }
        }
    }

    public c3q0(int i) {
        this.a = 100000;
    }
}
