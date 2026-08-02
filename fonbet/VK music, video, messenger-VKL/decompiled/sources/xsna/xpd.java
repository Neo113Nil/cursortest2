package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.store.dto.StoreStickerPackVersionHashDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.dto.stickers.StickersProduct;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xpd implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xpd(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj).getClass();
                return "desc_below_" + ((pgf) obj2).a().hashCode();
            case 1:
                return com.vk.photo.editor.features.colorgrading.a.a((com.vk.photo.editor.features.colorgrading.a) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 7679);
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1662249240, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.podcast.ComposableSingletons$CommunityProfileContentPodcastViewHolderKt.lambda$-1662249240.<anonymous> (CommunityProfileContentPodcastViewHolder.kt:113)");
                    }
                    tth.a(null, s200.b, aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Combine counters custom: " + map2 + " original: " + map});
                }
                return pn00.n(map, map2);
            case 4:
                ((Integer) obj2).getClass();
                t8s.p(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                return (List) obj2;
            case 6:
                f8m f8mVar = (f8m) obj;
                return new PublishFragmentInternalComponent((cce0) obj2, (ClipsUploadUiVkComponent) f8mVar.c(fpf0.a(ClipsUploadUiVkComponent.class)), (AppContextDiComponent) f8mVar.a(fpf0.a(AppContextDiComponent.class)), (BridgeComponent) f8mVar.a(fpf0.a(BridgeComponent.class)), (VideoChannelComponent) f8mVar.c(fpf0.a(VideoChannelComponent.class)), (ClipsConfigAuthorsComponent) f8mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class)), (VkOnboardingComponent) f8mVar.a(fpf0.a(VkOnboardingComponent.class)), (ContentPrivacyComponent) f8mVar.a(fpf0.a(ContentPrivacyComponent.class)));
            case 7:
                return Float.valueOf(((et6) obj2).a);
            case 8:
                Integer e = ((StoreStickerPackVersionHashDto) obj).e();
                int i = ((StickersProduct) obj2).b;
                if (e != null && e.intValue() == i) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 9:
                x6p0 x6p0Var = (x6p0) obj2;
                return e43.l(Float.valueOf(x6p0Var.c()), Float.valueOf(x6p0Var.b()), Float.valueOf(((Number) ((zak0) x6p0Var.a).getValue()).floatValue()));
            case 10:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-1820336682);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1820336682, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:145)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.i;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(-989683048);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-989683048, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:143)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.g;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
        }
    }
}
