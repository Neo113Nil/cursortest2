package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class ap41 implements bp41 {
    public final r0 a;
    public final mth b;
    public final sls c;

    public ap41() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = new mth(c, 6);
        this.c = new bgc(12);
    }

    public final mth a() {
        return this.b;
    }

    @Override // defpackage.bp41
    public final void c(zo41 zo41Var) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zo41Var));
        if (zo41Var instanceof uo41) {
            this.c.invoke();
        }
    }
}
