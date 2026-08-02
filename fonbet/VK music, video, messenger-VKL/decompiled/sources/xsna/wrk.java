package xsna;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DI.kt */
/* loaded from: classes.dex */
public final class wrk {
    public static a a;
    public static final Object b = new Object();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: DI.kt */
    public static final class a {
        public final mkb a;
        public final fmg0 b;
        public final nmg0 c;
        public final mdx0 d;

        public a(mkb mkbVar, fmg0 fmg0Var, nmg0 nmg0Var, mdx0 mdx0Var) {
            this.a = mkbVar;
            this.b = fmg0Var;
            this.c = nmg0Var;
            this.d = mdx0Var;
        }
    }

    public static void a(p8m p8mVar, wuj wujVar, izs izsVar) {
        if (!c.compareAndSet(false, true)) {
            a aVar = a;
            if (aVar == null) {
                aVar = null;
            }
            izsVar.invoke(new j7m(aVar.b));
            return;
        }
        fmg0 fmg0Var = new fmg0(p8mVar, wujVar);
        mkb mkbVar = new mkb(fmg0Var);
        a = new a(mkbVar, fmg0Var, new nmg0(fmg0Var), new mdx0(mkbVar));
        izsVar.invoke(new j7m(fmg0Var));
    }
}
