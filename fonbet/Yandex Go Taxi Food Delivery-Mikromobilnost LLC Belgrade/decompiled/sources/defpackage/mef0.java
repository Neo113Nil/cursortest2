package defpackage;

import com.yandex.go.profile.domain.flex.f;

/* loaded from: classes8.dex */
public final class mef0 extends ad5 {
    public k20 A;
    public final f x;
    public final nni0 y;
    public final v3u0 z;

    public mef0(f fVar, d0m d0mVar, fxl fxlVar, nni0 nni0Var, v3u0 v3u0Var) {
        super(kef0.class);
        this.x = fVar;
        this.y = nni0Var;
        this.z = v3u0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        k20 k20Var = this.A;
        if (k20Var != null) {
            k20Var.cancel();
        }
    }
}
