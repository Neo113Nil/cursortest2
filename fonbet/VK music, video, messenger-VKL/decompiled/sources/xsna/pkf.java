package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.dto.hints.HintId;
import xsna.ugf;

/* compiled from: ClipsUploadTooltipsMiddleware.kt */
/* loaded from: classes17.dex */
public final class pkf implements h7f0<ClipsUploadState, lbf, Object, mjf, ugf, qef> {
    public final sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> b;
    public final caf c;

    public pkf(sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> sl50Var, caf cafVar) {
        this.b = sl50Var;
        this.c = cafVar;
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
    public final void o(yl50 yl50Var) {
        ugf ugfVar = (ugf) yl50Var;
        boolean z = ugfVar instanceof ugf.i.d;
        caf cafVar = this.c;
        if (z) {
            cafVar.a.b(HintId.CLIPS_COAUTHORS_PUBLICATION_ONBOARDING.getId());
            return;
        }
        if (ugfVar.equals(ugf.i.a.a)) {
            cafVar.b.b();
            return;
        }
        if (ugfVar.equals(ugf.i.b.a)) {
            cafVar.b.j();
            return;
        }
        if (ugfVar instanceof ugf.i.f) {
            cafVar.b.a();
            return;
        }
        if (ugfVar instanceof ugf.i.C3805i) {
            cafVar.a.b(HintId.CLIPS_TREND_HASHTAG.getId());
            return;
        }
        if (ugfVar instanceof ugf.i.h) {
            cafVar.b.h();
        } else if (ugfVar instanceof ugf.i.e) {
            cafVar.a.b(HintId.CLIPS_DONUT_ACTION_BUTTON.getId());
        } else if (ugfVar instanceof ugf.i.c) {
            cafVar.b.i();
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
