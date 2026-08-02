package xsna;

import android.content.Context;

/* compiled from: VKSuperappAvatarControllerFactory.kt */
/* loaded from: classes6.dex */
public final class mgr0 implements v9r0<ggn0> {
    public final bpn0 a;

    public mgr0(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.v9r0
    public final lgr0 create(Context context) {
        return new lgr0(context, this.a);
    }
}
