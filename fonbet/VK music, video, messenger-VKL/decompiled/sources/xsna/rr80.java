package xsna;

import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.dto.common.VideoFile;

/* compiled from: OpenMoreMenuUseCase.kt */
/* loaded from: classes17.dex */
public final class rr80 implements hjc {
    public final q1t b;
    public final g6o0 c;
    public final rwc d;
    public final com.vk.movika.sdk.base.logic.processor.h e;

    public rr80(q1t q1tVar, g6o0 g6o0Var, rwc rwcVar, com.vk.movika.sdk.base.logic.processor.h hVar) {
        this.b = q1tVar;
        this.c = g6o0Var;
        this.d = rwcVar;
        this.e = hVar;
    }

    @Override // xsna.hjc
    public final boolean a() {
        return false;
    }

    @Override // xsna.hjc
    public final void onClick() {
        izs<? super VideoFile, s3q0> izsVar;
        VideoFile videoFile = ((ClipFeedSideControlsView) this.e.c).q;
        if (videoFile == null) {
            return;
        }
        if ((this.d.c.e.a.b.h() || this.b.h()) && (izsVar = ((y8e) this.c.b).k) != null) {
            izsVar.invoke(videoFile);
        }
    }
}
