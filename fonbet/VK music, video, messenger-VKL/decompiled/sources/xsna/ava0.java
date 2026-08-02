package xsna;

import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.onboarding.OnboardingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.mixsettings.MixCategoryEntity;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.List;
import kotlin.random.Random;
import xsna.k840;
import xsna.p4v0;

/* compiled from: PlayMixPresetFacade.kt */
/* loaded from: classes16.dex */
public final class ava0 {
    public final u2b0 a;
    public final q4v0 b;
    public final zaf0 c;

    public /* synthetic */ ava0(u2b0 u2b0Var, q4v0 q4v0Var) {
        this(u2b0Var, q4v0Var, null);
    }

    public final void a(UIBlockPlayMixAction uIBlockPlayMixAction) {
        MixSettingsEntity mixSettingsEntity;
        String str = uIBlockPlayMixAction.A;
        String str2 = uIBlockPlayMixAction.B;
        if (str2 == null || drm0.N(str2)) {
            b(null, uIBlockPlayMixAction);
            return;
        }
        StartPlaySource j = this.a.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        if (!epx.f(startPlayVkMixSource != null ? startPlayVkMixSource.e : null, str) || (mixSettingsEntity = startPlayVkMixSource.h) == null) {
            itg0.h(this.b.a(str, str2), new v74(24, this, uIBlockPlayMixAction), new yl0(19, uIBlockPlayMixAction, this));
            return;
        }
        List<MixCategoryEntity> list = mixSettingsEntity.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MixCategoryEntity mixCategoryEntity : list) {
            List<MixOptionEntity> list2 = mixCategoryEntity.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (MixOptionEntity mixOptionEntity : list2) {
                arrayList2.add(new MixOptionEntity(mixOptionEntity.b, mixOptionEntity.c, mixOptionEntity.d, mixOptionEntity.e, mixOptionEntity.f));
            }
            arrayList.add(new MixCategoryEntity(mixCategoryEntity.b, mixCategoryEntity.c, mixCategoryEntity.d, arrayList2));
        }
        MixSettingsEntity a = MixSettingsEntity.a(mixSettingsEntity, arrayList, 7);
        a.f();
        p4v0.a.b(a, str2);
        b(a, uIBlockPlayMixAction);
    }

    public final void b(MixSettingsEntity mixSettingsEntity, UIBlockPlayMixAction uIBlockPlayMixAction) {
        Long l;
        MixSettingsEntity mixSettingsEntity2;
        u2b0 u2b0Var = this.a;
        StartPlaySource j = u2b0Var.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        boolean z = (epx.f(mixSettingsEntity != null ? mixSettingsEntity.e : null, (startPlayVkMixSource == null || (mixSettingsEntity2 = startPlayVkMixSource.h) == null) ? null : mixSettingsEntity2.e) || mixSettingsEntity == null) ? false : true;
        if (z) {
            Random.b.getClass();
            l = Long.valueOf(Random.c.n(9999999999999L));
        } else {
            l = null;
        }
        boolean z2 = false;
        String str = uIBlockPlayMixAction.b;
        String str2 = uIBlockPlayMixAction.c;
        String str3 = uIBlockPlayMixAction.A;
        String str4 = uIBlockPlayMixAction.E;
        String str5 = uIBlockPlayMixAction.z;
        String str6 = uIBlockPlayMixAction.C.a;
        if (mixSettingsEntity != null) {
            z2 = true;
        }
        lqk0 lqk0Var = new lqk0(new StartPlayVkMixSource(str, str2, str3, z2, str6, mixSettingsEntity, str5, str4, null, l, 256, null), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.M.Bb(uIBlockPlayMixAction.b), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822);
        CatalogOnboardingInfo catalogOnboardingInfo = uIBlockPlayMixAction.n;
        OnboardingInfo onboardingInfo = catalogOnboardingInfo != null ? new OnboardingInfo(catalogOnboardingInfo.c, catalogOnboardingInfo.b) : null;
        zaf0 zaf0Var = this.c;
        if (zaf0Var == null || !zaf0Var.b(lqk0Var, onboardingInfo)) {
            u2b0Var.N0(lqk0Var);
        }
        if (z) {
            s750 s750Var = k840.a.e;
            if (s750Var == null) {
                s750Var = null;
            }
            s750Var.G0(uIBlockPlayMixAction.A, l, mixSettingsEntity);
        }
    }

    public ava0(u2b0 u2b0Var, q4v0 q4v0Var, zaf0 zaf0Var) {
        this.a = u2b0Var;
        this.b = q4v0Var;
        this.c = zaf0Var;
    }
}
