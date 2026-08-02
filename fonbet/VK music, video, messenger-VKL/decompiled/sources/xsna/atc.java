package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.trends.ClipsTrendingHashtagsState;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import kotlin.NoWhenBranchMatchedException;
import xsna.d9k0;
import xsna.r8d;
import xsna.zsc;

/* compiled from: ClipEditSdkMviReducer.kt */
/* loaded from: classes17.dex */
public final class atc implements bm50<ClipEditSdkMviState, zsc> {
    @Override // xsna.bm50
    public final ClipEditSdkMviState a(ClipEditSdkMviState clipEditSdkMviState, zsc zscVar) {
        ClipsEditCoauthorsState enabled;
        ClipEditSdkMviState clipEditSdkMviState2 = clipEditSdkMviState;
        zsc zscVar2 = zscVar;
        ClipsEditCoauthorsState clipsEditCoauthorsState = clipEditSdkMviState2.f;
        if (zscVar2 instanceof zsc.e) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, true, null, false, false, null, 16127);
        }
        if (zscVar2 instanceof zsc.c) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, false, null, 16127);
        }
        if (zscVar2 instanceof zsc.m) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, ((zsc.m) zscVar2).a, null, null, null, null, null, false, null, false, false, null, 16382);
        }
        if (zscVar2 instanceof zsc.l) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, ((zsc.l) zscVar2).a, null, null, null, null, false, null, false, false, null, 16381);
        }
        if (zscVar2 instanceof zsc.b) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, false, null, 15871);
        }
        if (zscVar2 instanceof zsc.h) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, d9k0.a.a, false, false, null, 15871);
        }
        if (zscVar2 instanceof zsc.p) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, ((zsc.p) zscVar2).a, null, null, null, false, null, false, false, null, 16379);
        }
        if (zscVar2 instanceof zsc.q) {
            e2s0 e2s0Var = ((zsc.q) zscVar2).a;
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, e2s0Var == null ? ClipEditVideoAttachState.Empty.b : new ClipEditVideoAttachState.Selected(e2s0Var.c, e2s0Var.d, e2s0Var.b, e2s0Var.a, e2s0Var.e, null, 32, null), null, null, false, null, false, false, null, 16375);
        }
        if (zscVar2 instanceof zsc.j) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, ((zsc.j) zscVar2).a, null, false, null, false, false, null, 16367);
        }
        if (zscVar2 instanceof zsc.o) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, ((zsc.o) zscVar2).a, false, null, 15359);
        }
        if (zscVar2 instanceof zsc.k) {
            if (epx.f(clipsEditCoauthorsState, ClipsEditCoauthorsState.Disabled.b)) {
                enabled = clipsEditCoauthorsState;
            } else {
                if (!(clipsEditCoauthorsState instanceof ClipsEditCoauthorsState.Enabled)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsEditCoauthorsState.Enabled enabled2 = (ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState;
                enabled = new ClipsEditCoauthorsState.Enabled(enabled2.b, enabled2.c, ((zsc.k) zscVar2).a);
            }
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, enabled, null, false, null, false, false, null, 16367);
        }
        if (zscVar2 instanceof zsc.i) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, false, r8d.b.a, 12287);
        }
        if (zscVar2 instanceof zsc.d) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, false, null, 12287);
        }
        if (zscVar2 instanceof zsc.n) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, ((zsc.n) zscVar2).a, null, 14335);
        }
        if (zscVar2 instanceof zsc.g) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, false, r8d.a.a, 12287);
        }
        if (zscVar2 instanceof zsc.a) {
            return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, null, false, null, false, false, null, 12287);
        }
        if (!(zscVar2 instanceof zsc.f)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsTrendingHashtagsState clipsTrendingHashtagsState = clipEditSdkMviState2.h;
        return ClipEditSdkMviState.a(clipEditSdkMviState2, null, null, null, null, null, (clipsTrendingHashtagsState instanceof ClipsTrendingHashtagsState.Enabled ? (ClipsTrendingHashtagsState.Enabled) clipsTrendingHashtagsState : null) != null ? new ClipsTrendingHashtagsState.Enabled(((zsc.f) zscVar2).a) : clipsTrendingHashtagsState, false, null, false, false, null, 16319);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(zsc zscVar) {
        return true;
    }
}
