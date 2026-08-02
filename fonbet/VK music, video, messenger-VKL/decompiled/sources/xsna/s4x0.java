package xsna;

import com.vk.voip.ui.VoipViewModelState;

/* compiled from: VoipViewModelCallStateProviderImpl.kt */
/* loaded from: classes7.dex */
public final class s4x0 implements apv {
    public final com.vk.voip.ui.c a;

    public s4x0(com.vk.voip.ui.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.apv
    public final boolean a() {
        this.a.getClass();
        return com.vk.voip.ui.c.K0 == VoipViewModelState.InCall;
    }

    @Override // xsna.apv
    public final boolean isCallActive() {
        this.a.getClass();
        return com.vk.voip.ui.c.K0.h();
    }

    @Override // xsna.apv
    public final boolean isConnecting() {
        this.a.getClass();
        return com.vk.voip.ui.c.K0 == VoipViewModelState.Connecting;
    }

    @Override // xsna.apv
    public final boolean isIdle() {
        this.a.getClass();
        return com.vk.voip.ui.c.K0 == VoipViewModelState.Idle;
    }
}
