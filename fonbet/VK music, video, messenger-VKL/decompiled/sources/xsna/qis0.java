package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.CorrectionView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.dto.clips.filters.FilterInfo;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.luc;
import xsna.wzd;

/* compiled from: VideoEffectsModificationView.kt */
/* loaded from: classes16.dex */
public final class qis0 extends huj0 {
    public final cmf m;
    public final bpn0 n;
    public final bpn0 o;
    public io.reactivex.rxjava3.disposables.c p;

    /* compiled from: VideoEffectsModificationView.kt */
    public final class a {
        public a() {
        }

        public final void a(FilterInfo filterInfo) {
            guj0 guj0Var = qis0.this.g;
            x8d x8dVar = guj0Var.a;
            kyd kydVar = guj0Var.d;
            if (kydVar == null) {
                kydVar = null;
            }
            if (kydVar instanceof com.vk.clips.editor.state.model.c) {
                kydVar = com.vk.clips.editor.state.model.c.a((com.vk.clips.editor.state.model.c) kydVar, null, 0L, 0L, null, filterInfo, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 524159);
            }
            guj0Var.e = kydVar;
            com.vk.clips.editor.state.model.a state = guj0Var.b.getState();
            kyd kydVar2 = guj0Var.e;
            if (kydVar2 == null) {
                kydVar2 = null;
            }
            x8dVar.c(guj0.c(state, kydVar2), null, true);
        }
    }

    public qis0(ViewGroup viewGroup, uy50 uy50Var, wn2 wn2Var, udl0 udl0Var, hwd hwdVar, cmf cmfVar, guj0 guj0Var) {
        super(viewGroup, R.layout.layout_clips_video_effects_screen, uy50Var, wn2Var, udl0Var, hwdVar, guj0Var);
        this.m = cmfVar;
        this.n = new bpn0(new dei0(this, 24));
        this.o = new bpn0(new iml0(this, 13));
    }

    @Override // xsna.huj0
    public final <T extends kyd> T a(T t, T t2) {
        return ((t2 instanceof com.vk.clips.editor.state.model.c) && (t instanceof com.vk.clips.editor.state.model.c)) ? com.vk.clips.editor.state.model.c.a((com.vk.clips.editor.state.model.c) t2, null, 0L, 0L, null, ((com.vk.clips.editor.state.model.c) t).h, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 524159) : t2;
    }

    @Override // xsna.huj0
    public final List<wzd> c() {
        return Collections.singletonList(new wzd.a(luc.b.a, 1));
    }

    @Override // xsna.huj0, com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        super.close();
        CorrectionView correctionView = (CorrectionView) this.o.getValue();
        io.reactivex.rxjava3.disposables.c cVar = correctionView.t.t.h;
        if (cVar != null) {
            cVar.dispose();
        }
        correctionView.x = null;
        correctionView.w = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.p;
        if (cVar2 != null) {
            cVar2.dispose();
        }
    }

    @Override // xsna.huj0
    public final void e(kyd kydVar) {
        com.vk.clips.editor.state.model.c cVar = kydVar instanceof com.vk.clips.editor.state.model.c ? (com.vk.clips.editor.state.model.c) kydVar : null;
        if (cVar == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new kqa0(2, this, cVar.a.getAbsolutePath()));
        cmf cmfVar = this.m;
        this.p = vVar.q(cmfVar.e().b()).m(cmfVar.e().d()).subscribe(new whm0(new qum0(4, this, cVar), 8), new be50(new vgs0(this, 1), 24));
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return ClipsEditorScreen.State.CORRECTION;
    }
}
