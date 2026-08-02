package xsna;

import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.toggle.features.MusicFeatures;

/* compiled from: PlayerSettingsOnboardingDelegate.kt */
/* loaded from: classes3.dex */
public final class b4b0 {
    public final q7v0 a;
    public final VkOnboardingCampaign b;

    public b4b0(q7v0 q7v0Var) {
        this.a = q7v0Var;
        this.b = q7v0Var.e("music_player:crossfade_normalization");
        if (MusicFeatures.AUDIO_LOUDNESS_NORMALIZATION.h() && fg40.a() == null && !q7v0Var.isReady()) {
            q7v0Var.init();
        }
    }
}
