package xsna;

import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.dto.common.VideoFile;

/* compiled from: ToggleDislikeUseCase.kt */
/* loaded from: classes17.dex */
public final class k0p0 implements hjc {
    public final i7e b;
    public final q1t c;
    public final g6o0 d;
    public final rwc e;
    public final ClipFeedSideControlsView.c f;
    public final com.vk.movika.sdk.base.logic.processor.h g;
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();

    public k0p0(i7e i7eVar, q1t q1tVar, g6o0 g6o0Var, rwc rwcVar, ClipFeedSideControlsView.c cVar, com.vk.movika.sdk.base.logic.processor.h hVar) {
        this.b = i7eVar;
        this.c = q1tVar;
        this.d = g6o0Var;
        this.e = rwcVar;
        this.f = cVar;
        this.g = hVar;
    }

    @Override // xsna.hjc
    public final boolean a() {
        return false;
    }

    @Override // xsna.hjc
    public final void onClick() {
        VideoFile videoFile = ((ClipFeedSideControlsView) this.g.c).q;
        if (videoFile == null) {
            return;
        }
        rwc rwcVar = this.e;
        if (rwcVar.c.a.b.a.b.h() || this.c.h()) {
            pih0 pih0Var = this.b.a.d;
            if (pih0Var != null) {
                pih0Var.o2(new SdkClipViewerClick.g(k15.B(videoFile)));
            }
            boolean z = rwcVar.c.a.b.b.c;
            io.reactivex.rxjava3.disposables.b bVar = this.h;
            g6o0 g6o0Var = this.d;
            if (z) {
                rwcVar.a(ReactionsLoading.LOAD_REMOVE_DISLIKE);
                bVar.b(g6o0Var.e(videoFile).o(asu0.a.d()).subscribe(new sh1(this, 3), new whm0(new n9m0(this, 9), 2)));
            } else {
                rwcVar.a(ReactionsLoading.LOAD_ADD_DISLIKE);
                bVar.b(g6o0Var.e(videoFile).o(asu0.a.d()).subscribe(new ph8(this, 5), new jsb0(new ggb0(this, 23), 14)));
            }
        }
    }
}
