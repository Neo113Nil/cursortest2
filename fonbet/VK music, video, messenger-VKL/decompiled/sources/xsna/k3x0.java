package xsna;

import android.content.Context;
import android.view.TextureView;
import com.vk.voip.OKVoipEngine;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.i3x0;

/* compiled from: VoipVideoEffectsDelegateCameraUseCaseImpl.kt */
/* loaded from: classes7.dex */
public final class k3x0 implements i3x0.b {
    public final com.vk.voip.ui.c a;
    public final gvw0 b;

    public k3x0(com.vk.voip.ui.c cVar, gvw0 gvw0Var) {
        this.a = cVar;
        this.b = gvw0Var;
    }

    @Override // xsna.i3x0.b
    public final void a() {
        com.vk.voip.ui.c.k1(this.a);
    }

    @Override // xsna.i3x0.b
    public final io.reactivex.rxjava3.internal.operators.observable.y b() {
        this.a.getClass();
        return com.vk.voip.ui.c.M0();
    }

    @Override // xsna.i3x0.b
    public final void c(boolean z) {
        com.vk.voip.ui.c cVar = this.a;
        if (!z) {
            cVar.q1();
            return;
        }
        com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
        cVar.getClass();
        com.vk.voip.ui.c.s1(this.b, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.i3x0.b
    public final void d(TextureView textureView) {
        if (textureView instanceof TextureViewRenderer) {
            this.a.getClass();
            rct0 videoController = com.vk.voip.ui.c.r.getVideoController();
            RendererView rendererView = (RendererView) textureView;
            videoController.removeOwnVideoParticipantView(rendererView);
            videoController.releaseParticipantView(rendererView);
        }
    }

    @Override // xsna.i3x0.b
    public final gj9 e() {
        this.a.getClass();
        return com.vk.voip.ui.c.r.y();
    }

    @Override // xsna.i3x0.b
    public final TextureViewRenderer f(Context context, ehl ehlVar) {
        this.a.getClass();
        OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
        rct0 videoController = oKVoipEngine.getVideoController();
        TextureViewRenderer mo349createVideoViewInstance = videoController.mo349createVideoViewInstance(context);
        oKVoipEngine.getClass();
        videoController.setOwnVideoParticipantView(mo349createVideoViewInstance, new j7i(ehlVar, OKVoipEngine.f));
        return mo349createVideoViewInstance;
    }
}
