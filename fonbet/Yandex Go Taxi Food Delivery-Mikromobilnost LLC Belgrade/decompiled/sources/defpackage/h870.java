package defpackage;

import com.yandex.go.profile.config.SuperAppConfigProfileExperiment;

/* loaded from: classes5.dex */
public final class h870 extends vx2 {
    public final szf b;
    public final yvf0 c;
    public final tzf d;
    public final dl40 e;

    public h870(szf szfVar, yvf0 yvf0Var, tzf tzfVar) {
        super(0);
        this.b = szfVar;
        this.c = yvf0Var;
        this.d = tzfVar;
        this.e = new dl40(i870.a);
    }

    @Override // defpackage.vx2
    public final tx2 a(h1p h1pVar) {
        boolean z;
        l8w0 l8w0Var = (l8w0) this.d.get();
        if (!l8w0Var.a()) {
            return null;
        }
        Boolean bool = ((SuperAppConfigProfileExperiment) l8w0Var.b.getValue()).c;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            ((ul51) l8w0Var.a).getClass();
            z = true;
        }
        if (z) {
            return new ux2("openSuperProfile", new xx8(13, this, o8w0.Companion.serializer(), new iu30(24, this, h1pVar)));
        }
        return null;
    }
}
