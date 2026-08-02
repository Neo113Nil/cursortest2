package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;

/* compiled from: ClipsUploadDraftInteractionMiddleware.kt */
/* loaded from: classes17.dex */
public final class jef implements h7f0<ClipsUploadState, lbf, Object, mjf, ugf, qef> {
    public final sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> b;
    public final mud c;

    public jef(sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> sl50Var, mud mudVar) {
        this.b = sl50Var;
        this.c = mudVar;
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void K(lj50 lj50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final void u(lm50 lm50Var) {
        ClipsUploadDataInternal clipsUploadDataInternal;
        ClipsUploadState clipsUploadState = (ClipsUploadState) lm50Var;
        ClipsUploadState.Loaded loaded = clipsUploadState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) clipsUploadState : null;
        if (loaded == null || (clipsUploadDataInternal = loaded.b) == null) {
            return;
        }
        this.c.f(clipsUploadDataInternal, ((ClipsUploadState.Loaded) clipsUploadState).f);
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
