package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class oly0 extends lqh implements fud, aly0 {
    public final qxi A = f.d(new oew0(18, this));
    public zii0 B = zii0.e;
    public atz0 c;
    public tls w;
    public tls x;
    public tls y;
    public pzt0 z;

    public oly0(atz0 atz0Var, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.c = atz0Var;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = tlsVar3;
    }

    @Override // defpackage.aly0
    public final zky0 data() {
        return (zky0) this.A.getValue();
    }

    @Override // defpackage.aly0
    public final zii0 k0(rzx rzxVar) {
        zii0 zii0Var;
        if (isAttached() && (zii0Var = (zii0) this.y.invoke(rzxVar)) != null) {
            this.B = zii0Var;
            return zii0Var;
        }
        return this.B;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        atz0 atz0Var = this.c;
        atz0Var.b = ToolbarHandlerState.Attached;
        atz0Var.a = this;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        atz0 atz0Var = this.c;
        atz0Var.b = ToolbarHandlerState.Detached;
        atz0Var.a = null;
    }

    @Override // defpackage.aly0
    public final long x(rzx rzxVar) {
        return k0(rzxVar).e();
    }
}
