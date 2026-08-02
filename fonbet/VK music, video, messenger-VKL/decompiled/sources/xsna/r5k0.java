package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.models.videofile.TimelineThumbsDo;
import com.vk.libvideo.models.videofile.VideoFilePlaybackDo;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import one.video.player.OneVideoPlayer;
import xsna.tlo0;

/* compiled from: SmartCropViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class r5k0 implements izs<SmartCropState, j5k0> {
    public final SmartCropArguments b;

    public r5k0(SmartCropArguments smartCropArguments) {
        this.b = smartCropArguments;
    }

    @Override // xsna.izs
    public final j5k0 invoke(SmartCropState smartCropState) {
        owo0 owo0Var;
        d3e0 d3e0Var;
        SmartCropState smartCropState2 = smartCropState;
        OneVideoPlayer oneVideoPlayer = smartCropState2.c;
        SmartCropState.CropVideoProgress cropVideoProgress = smartCropState2.i;
        y4k0 y4k0Var = new y4k0(oneVideoPlayer);
        q500 q500Var = smartCropState2.f;
        q500 q500Var2 = n5k0.b;
        VideoFilePlaybackDo videoFilePlaybackDo = this.b.b;
        long j = videoFilePlaybackDo.j;
        xh50<Long> xh50Var = smartCropState2.e;
        TimelineThumbsDo timelineThumbsDo = videoFilePlaybackDo.v;
        vh8 vh8Var = null;
        if (timelineThumbsDo == null) {
            owo0Var = null;
        } else {
            int i = timelineThumbsDo.b;
            int i2 = timelineThumbsDo.c;
            int i3 = timelineThumbsDo.d;
            owo0Var = new owo0(i, i2, i3, timelineThumbsDo.e / i3, timelineThumbsDo.f, timelineThumbsDo.i);
        }
        xrp0 xrp0Var = new xrp0(q500Var, q500Var2, j, xh50Var, owo0Var, (zjw) smartCropState2.m.getValue(), smartCropState2.g);
        boolean z = smartCropState2.h;
        tlo0.f h = z ? tq.h(tlo0.Companion, R.string.smart_crop_bottombar_button_start_crop) : tq.h(tlo0.Companion, R.string.smart_crop_bottombar_button_continue);
        if (cropVideoProgress != null) {
            long j2 = cropVideoProgress.d;
            Long l = cropVideoProgress.e;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (l != null) {
                float currentTimeMillis = System.currentTimeMillis() - j2;
                long longValue = l.longValue() - j2;
                if (longValue < 1) {
                    longValue = 1;
                }
                f = swe0.f((float) (Math.log((swe0.f(currentTimeMillis / longValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 34.0f) + 1) / Math.log(35.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            }
            d3e0Var = new d3e0(cropVideoProgress.c ? tq.h(tlo0.Companion, R.string.smart_crop_modal_progress_title_smart_crop) : tq.h(tlo0.Companion, R.string.smart_crop_modal_progress_title_crop), f);
        } else {
            d3e0Var = null;
        }
        if (smartCropState2.j && cropVideoProgress != null) {
            vh8Var = new vh8(cropVideoProgress.c ? tq.h(tlo0.Companion, R.string.smart_crop_dialog_abort_confirm_title_smart_crop) : tq.h(tlo0.Companion, R.string.smart_crop_dialog_abort_confirm_title_crop));
        }
        return new j5k0(y4k0Var, xrp0Var, z, h, d3e0Var, vh8Var, smartCropState2.k, smartCropState2.l);
    }
}
