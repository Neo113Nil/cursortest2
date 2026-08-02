package defpackage;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class fgo extends jse {
    public static final /* synthetic */ int x = 0;
    public long b;
    public boolean c;
    public x43 w;

    @Override // defpackage.jse
    public final jse P(int i) {
        cma1.n(i);
        return this;
    }

    public final void R(boolean z) {
        long j = this.b - (z ? 4294967296L : 1L);
        this.b = j;
        if (j <= 0 && this.c) {
            shutdown();
        }
    }

    public final void T(qyj qyjVar) {
        x43 x43Var = this.w;
        if (x43Var == null) {
            x43Var = new x43();
            this.w = x43Var;
        }
        x43Var.addLast(qyjVar);
    }

    public final void U(boolean z) {
        this.b = (z ? 4294967296L : 1L) + this.b;
        if (z) {
            return;
        }
        this.c = true;
    }

    public long W() {
        if (Z()) {
            return 0L;
        }
        return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    }

    public final boolean Z() {
        qyj qyjVar;
        x43 x43Var = this.w;
        if (x43Var == null || (qyjVar = (qyj) x43Var.m()) == null) {
            return false;
        }
        qyjVar.run();
        return true;
    }

    public void shutdown() {
    }
}
