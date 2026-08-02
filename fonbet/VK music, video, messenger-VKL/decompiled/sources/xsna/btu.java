package xsna;

import com.vk.clips.design.view.sidecontrols.side.favorites.FavoritesLoadingState;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.dto.common.VideoFile;

/* compiled from: HandleFavoritesClickUseCase.kt */
/* loaded from: classes17.dex */
public final class btu implements hjc {
    public final c7e b;
    public final q1t c;
    public final g6o0 d;
    public final rwc e;
    public final com.vk.movika.sdk.base.logic.processor.h f;

    public btu(c7e c7eVar, q1t q1tVar, g6o0 g6o0Var, rwc rwcVar, com.vk.movika.sdk.base.logic.processor.h hVar) {
        this.b = c7eVar;
        this.c = q1tVar;
        this.d = g6o0Var;
        this.e = rwcVar;
        this.f = hVar;
    }

    @Override // xsna.hjc
    public final boolean a() {
        return false;
    }

    @Override // xsna.hjc
    public final void onClick() {
        y8e y8eVar = (y8e) this.d.b;
        y8e y8eVar2 = this.b.a;
        VideoFile videoFile = ((ClipFeedSideControlsView) this.f.c).q;
        if (videoFile == null) {
            return;
        }
        rwc rwcVar = this.e;
        if (rwcVar.c.d.a.b.h() || this.c.h()) {
            if (videoFile.X()) {
                pih0 pih0Var = y8eVar2.d;
                if (pih0Var != null) {
                    pih0Var.o2(new SdkClipViewerClick.h(k15.B(videoFile), false));
                }
                izs<? super VideoFile, s3q0> izsVar = y8eVar.j;
                if (izsVar != null) {
                    izsVar.invoke(videoFile);
                    return;
                }
                return;
            }
            n7e n7eVar = rwcVar.c;
            itq itqVar = n7eVar.d;
            if (!itqVar.b.c) {
                FavoritesLoadingState favoritesLoadingState = FavoritesLoadingState.LOAD_ADD_TO_FAVORITES;
                rwcVar.b.d.getClass();
                itq a = itqVar.c == favoritesLoadingState ? itqVar : itq.a(itqVar, null, null, favoritesLoadingState, 3);
                if (!itqVar.equals(a)) {
                    n7eVar = n7e.a(n7eVar, null, a, 23);
                }
                rwcVar.c(n7eVar);
            }
            pih0 pih0Var2 = y8eVar2.d;
            if (pih0Var2 != null) {
                pih0Var2.o2(new SdkClipViewerClick.h(k15.B(videoFile), true));
            }
            izs<? super VideoFile, s3q0> izsVar2 = y8eVar.i;
            if (izsVar2 != null) {
                izsVar2.invoke(videoFile);
            }
        }
    }
}
