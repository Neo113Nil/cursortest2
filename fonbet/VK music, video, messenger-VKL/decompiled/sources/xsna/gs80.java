package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import java.util.ArrayList;
import xsna.h2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gs80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gs80(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        m6a m6aVar;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                one.video.player.tracks.a aVar = (one.video.player.tracks.a) obj3;
                ks80 ks80Var = (ks80) obj2;
                String str = (String) obj;
                lk3 lk3Var = new lk3();
                lk3 lk3Var2 = new lk3();
                if (aVar != null) {
                    so4 so4Var = (so4) aVar.c;
                    String str2 = so4Var.g;
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                    lk3Var2.b("audioTrack.label", str2);
                    String str3 = so4Var.h;
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    lk3Var2.b("audioTrack.language", str3);
                    String str4 = so4Var.b;
                    if (str4 == null) {
                        str4 = "unknown";
                    }
                    lk3Var2.b("audioTrack.sampleMimeType", str4);
                    String str5 = so4Var.a;
                    lk3Var2.b("audioTrack.formatId", str5 != null ? str5 : "unknown");
                    lk3Var2.b("audioTrack.type", aVar.a.name());
                    lk3Var2.a(so4Var.d, "audioTrack.bitrate");
                    lk3Var2.a(so4Var.f, "audioTrack.channelCount");
                }
                lk3Var.g(lk3Var2.e());
                jk3 e = lk3Var.e();
                ohk0 f = ks80Var.f().f(str);
                if (f != null) {
                    f.j("onSelectedAudioTrackChanged", e);
                }
                return s3q0.a;
            case 1:
                com.vk.auth.passport.e eVar = (com.vk.auth.passport.e) obj2;
                xav0 xav0Var = ((com.vk.auth.passport.b) obj3).d;
                if (xav0Var != null) {
                    xav0Var.b(eVar);
                }
                return s3q0.a;
            case 2:
                ((o2c0) obj3).d((PostingState) obj2, (ActionButton) obj);
                return s3q0.a;
            case 3:
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj3;
                SettingsState settingsState = (SettingsState) obj;
                VkOnboardingComponent vkOnboardingComponent = ((m2j0) obj2).f;
                VkOnboardingStat$Type vkOnboardingStat$Type = VkOnboardingStat$Type.Banner;
                VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                return SettingsState.a(settingsState, null, true, vkOnboardingCampaign, vkOnboardingComponent.ac(vkOnboardingStat$Type, "video:attached_clips"), null, null, null, null, null, 497);
            case 4:
                ((qhm0) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                return s3q0.a;
            case 5:
                Integer num = (Integer) obj;
                num.intValue();
                ((wzs) obj3).invoke(((hze) obj2).a, num);
                return s3q0.a;
            case 6:
                h2s0 h2s0Var = (h2s0) obj2;
                HistoryAttach historyAttach = ((h2s0.a) obj3).m;
                if (historyAttach != null && (m6aVar = h2s0Var.a) != null) {
                    m6aVar.b(historyAttach);
                }
                return s3q0.a;
            case 7:
                ups0 ups0Var = (ups0) obj;
                return new ups0(ups0Var.b, ((qps0) obj3).q((VideoFile) obj2), ups0Var.d, ups0Var.e, ups0Var.f, ups0Var.g, ups0Var.h, ups0Var.i);
            default:
                ((nfv0) obj3).d((String) obj2, tnf0.i);
                return s3q0.a;
        }
    }
}
