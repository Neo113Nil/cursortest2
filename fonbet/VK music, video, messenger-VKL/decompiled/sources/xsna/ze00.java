package xsna;

import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import xsna.u59;

/* compiled from: MainMenuLayerDelegate.kt */
/* loaded from: classes7.dex */
public final class ze00 extends u59 {
    public final wfu0 j;
    public final k3b k;
    public final h69 l;

    /* compiled from: MainMenuLayerDelegate.kt */
    public static final class a extends u59.b {
        public final m9b b;
        public final xkw c;
        public final k3b d;
        public final tfm0 e;

        public a(m9b m9bVar, xkw xkwVar, k3b k3bVar, tfm0 tfm0Var, m1i m1iVar) {
            super(m1iVar);
            this.b = m9bVar;
            this.c = xkwVar;
            this.d = k3bVar;
            this.e = tfm0Var;
        }

        @Override // xsna.u59.b
        public final VoipMainMenuActionsFragment a(u59 u59Var) {
            int i = VoipMainMenuActionsFragment.V;
            return VoipMainMenuActionsFragment.a.a(u59Var);
        }

        @Override // xsna.u59.b
        public final boolean b() {
            return ((Boolean) this.b.invoke()).booleanValue();
        }

        @Override // xsna.u59.b
        public final boolean c() {
            com.vk.voip.ui.c.b.getClass();
            return !com.vk.voip.ui.c.v0();
        }

        @Override // xsna.u59.b
        public final boolean d() {
            com.vk.voip.ui.c.b.getClass();
            return emi.t(com.vk.voip.ui.c.K0);
        }

        @Override // xsna.u59.b
        public final boolean e(boolean z) {
            com.vk.voip.ui.c.b.getClass();
            VoipViewModelState voipViewModelState = com.vk.voip.ui.c.K0;
            return (voipViewModelState == VoipViewModelState.AboutToCallPeer || voipViewModelState == VoipViewModelState.InCall || voipViewModelState == VoipViewModelState.Connecting || voipViewModelState == VoipViewModelState.CallingPeer || voipViewModelState == VoipViewModelState.WaitingRoom) && z && !com.vk.voip.ui.c.W0 && !com.vk.voip.ui.c.u0();
        }

        public final gvw0 f() {
            return ((mjw0) this.e.c).b;
        }
    }

    public ze00(mjw0 mjw0Var, wfu0 wfu0Var, k3b k3bVar, tfm0 tfm0Var, m9b m9bVar, xkw xkwVar) {
        super(new a(m9bVar, xkwVar, k3bVar, tfm0Var, new m1i(mjw0Var, 25)));
        this.j = wfu0Var;
        this.k = k3bVar;
        t70 t70Var = this.h;
        z89 z89Var = t70Var instanceof z89 ? (z89) t70Var : null;
        if (z89Var != null) {
            z89Var.f = this.l;
        }
        this.l = new h69(this.d, new u0d(0, this, ze00.class, "getCurrentCallUserId", "getCurrentCallUserId()Lcom/vk/dto/common/id/UserId;", 0, 3));
    }
}
