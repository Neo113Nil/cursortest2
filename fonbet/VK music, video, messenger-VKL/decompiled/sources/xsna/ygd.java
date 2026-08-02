package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.music.MusicTrack;
import kotlin.NoWhenBranchMatchedException;
import xsna.xgd;

/* compiled from: ClipsAudioReducer.kt */
/* loaded from: classes16.dex */
public final class ygd extends dm50<bhd, xgd, zgd> {
    @Override // xsna.dm50
    public final zgd c(zgd zgdVar, xgd xgdVar) {
        zgd zgdVar2 = zgdVar;
        xgd xgdVar2 = xgdVar;
        if (xgdVar2 instanceof xgd.b) {
            return zgd.a(zgdVar2, ((xgd.b) xgdVar2).b, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, false, false, false, 510);
        }
        if (xgdVar2 instanceof xgd.a) {
            ClipsEditorMusicInfo clipsEditorMusicInfo = ((xgd.a) xgdVar2).b;
            MusicTrack c = hxd.c(clipsEditorMusicInfo.b);
            int i = clipsEditorMusicInfo.d;
            return zgd.a(zgdVar2, c, i, (r5 - i) / 1000.0f, i, clipsEditorMusicInfo.e, clipsEditorMusicInfo.h, false, false, false, 384);
        }
        if (xgdVar2 instanceof xgd.d) {
            xgd.d dVar = (xgd.d) xgdVar2;
            return zgd.a(zgdVar2, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dVar.b, dVar.c, dVar.d, dVar.e, false, dVar.f, 135);
        }
        if (xgdVar2 instanceof xgd.e) {
            return zgd.a(zgdVar2, null, ((xgd.e) xgdVar2).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, false, false, false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
        }
        if (xgdVar2 instanceof xgd.c) {
            return zgd.a(zgdVar2, null, 0, ((xgd.c) xgdVar2).b, 0, 0, 0, false, false, false, 507);
        }
        if (xgdVar2 instanceof xgd.f) {
            return zgd.a(zgdVar2, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, false, ((xgd.f) xgdVar2).b, false, 383);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final bhd d() {
        return new bhd(e(new b40(7)));
    }

    @Override // xsna.dm50
    public final void h(zgd zgdVar, bhd bhdVar) {
        f(bhdVar.a, zgdVar);
    }
}
