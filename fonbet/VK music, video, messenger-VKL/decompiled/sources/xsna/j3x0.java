package xsna;

import com.vk.dto.common.id.UserId;
import xsna.i3x0;

/* compiled from: VoipVideoEffectsDelegateCallUseCaseImpl.kt */
/* loaded from: classes7.dex */
public final class j3x0 implements i3x0.a {
    public final com.vk.voip.ui.c a;

    public j3x0(com.vk.voip.ui.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.i3x0.a
    public final UserId a() {
        this.a.getClass();
        return com.vk.voip.ui.c.J().f();
    }

    @Override // xsna.i3x0.a
    public final boolean b() {
        this.a.getClass();
        return com.vk.voip.ui.c.q0();
    }

    @Override // xsna.i3x0.a
    public final boolean isCallActive() {
        this.a.getClass();
        return ((apv) com.vk.voip.ui.c.w0.getValue()).isCallActive();
    }
}
