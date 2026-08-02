package xsna;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public final class yll implements a8h0 {
    public static final Logger f = Logger.getLogger(zop0.class.getName());
    public final dxx0 a;
    public final Executor b;
    public final tv5 c;
    public final n0q d;
    public final uon0 e;

    public yll(Executor executor, tv5 tv5Var, dxx0 dxx0Var, n0q n0qVar, uon0 uon0Var) {
        this.b = executor;
        this.c = tv5Var;
        this.a = dxx0Var;
        this.d = n0qVar;
        this.e = uon0Var;
    }

    @Override // xsna.a8h0
    public final void a(final eo5 eo5Var, final yl5 yl5Var, final bpp0 bpp0Var) {
        this.b.execute(new Runnable() { // from class: xsna.vll
            @Override // java.lang.Runnable
            public final void run() {
                yll yllVar = yll.this;
                eo5 eo5Var2 = eo5Var;
                String str = eo5Var2.a;
                bpp0 bpp0Var2 = bpp0Var;
                yl5 yl5Var2 = yl5Var;
                Logger logger = yll.f;
                try {
                    rop0 rop0Var = yllVar.c.get(str);
                    if (rop0Var != null) {
                        yllVar.e.b(new wll(yllVar, eo5Var2, rop0Var.b(yl5Var2)));
                        bpp0Var2.b(null);
                    } else {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        bpp0Var2.b(new IllegalArgumentException(str2));
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    bpp0Var2.b(e);
                }
            }
        });
    }
}
