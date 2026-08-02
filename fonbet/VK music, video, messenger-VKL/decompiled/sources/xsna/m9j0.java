package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.dto.common.VideoFile;

/* compiled from: ShareUseCase.kt */
/* loaded from: classes17.dex */
public final class m9j0 implements hjc {
    public final k7e b;
    public final q1t c;
    public final g6o0 d;
    public final rwc e;
    public final com.vk.movika.sdk.base.logic.processor.h f;

    public m9j0(k7e k7eVar, q1t q1tVar, g6o0 g6o0Var, rwc rwcVar, com.vk.movika.sdk.base.logic.processor.h hVar) {
        this.b = k7eVar;
        this.c = q1tVar;
        this.d = g6o0Var;
        this.e = rwcVar;
        this.f = hVar;
    }

    @Override // xsna.hjc
    public final boolean a() {
        VideoFile videoFile = ((ClipFeedSideControlsView) this.f.c).q;
        if (videoFile == null) {
            return false;
        }
        if (!this.e.c.c.a.b.h() && !this.c.h()) {
            return false;
        }
        com.vk.im.engine.internal.storage.delegates.messages.b bVar = ((y8e) this.d.b).h;
        if (bVar == null) {
            return true;
        }
        bVar.invoke(videoFile);
        return true;
    }

    public final void b() {
        VideoFile videoFile = ((ClipFeedSideControlsView) this.f.c).q;
        if (videoFile == null) {
            return;
        }
        if (this.e.c.c.a.b.h() || this.c.h()) {
            pih0 pih0Var = this.b.a.d;
            if (pih0Var != null) {
                pih0Var.o2(new SdkClipViewerClick.s(k15.B(videoFile)));
            }
            y8e y8eVar = (y8e) this.d.b;
            izs<? super VideoFile, s3q0> izsVar = y8eVar.g;
            if (izsVar != null) {
                izsVar.invoke(videoFile);
                return;
            }
            h3d h3dVar = y8eVar.b;
            if (h3dVar != null) {
                h3dVar.Ih();
            }
        }
    }

    @Override // xsna.hjc
    public final void onClick() {
        b();
    }
}
