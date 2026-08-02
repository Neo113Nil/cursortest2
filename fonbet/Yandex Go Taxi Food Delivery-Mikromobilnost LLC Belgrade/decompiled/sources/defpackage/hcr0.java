package defpackage;

import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes14.dex */
public final class hcr0 extends ad5 {
    public final ndl0 x;
    public final fcr0 y;
    public final ul z;

    public hcr0(ndl0 ndl0Var, fcr0 fcr0Var, ul ulVar) {
        super(gcr0.class);
        this.x = ndl0Var;
        this.y = fcr0Var;
        this.z = ulVar;
    }

    public final void Kg(ecr0 ecr0Var) {
        boolean z = ecr0Var instanceof dcr0;
        ndl0 ndl0Var = this.x;
        if (z) {
            ((jj3) ((rrj) ndl0Var.b).J).a(new um3(Events$Zalogin$LoginContext.PROFILE, null, false, false, 30), false);
            return;
        }
        if (ecr0Var instanceof ccr0) {
            this.z.a();
        } else {
            if (!(ecr0Var instanceof bcr0)) {
                w511.b();
                return;
            }
            rrj rrjVar = (rrj) ndl0Var.b;
            ((gbr0) rrjVar.N).a();
            rrjVar.r(new hlq0(23));
        }
    }
}
