package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import xsna.g120;
import xsna.i9b;
import xsna.v5g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a9b implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a9b(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                i9b.a aVar = (i9b.a) obj;
                i9b.a aVar2 = (i9b.a) obj2;
                return Boolean.valueOf(epx.f(aVar, aVar2) && epx.f(aVar.a.P, aVar2.a.P));
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-353503980, intValue, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.ComposableSingletons$MarketItemReviewsFragmentKt.lambda$-353503980.<anonymous> (MarketItemReviewsFragment.kt:609)");
                    }
                    zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar3, 6, 510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                return Boolean.FALSE;
            case 3:
                com.vk.photo.editor.features.colorgrading.a aVar4 = (com.vk.photo.editor.features.colorgrading.a) obj;
                return com.vk.photo.editor.features.colorgrading.a.a(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a.C1454a.a(aVar4.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 134217215), null, 6143);
            case 4:
                ((Integer) obj2).getClass();
                kb00.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                AttachForMediaViewer attachForMediaViewer = ((g120.a) obj).a;
                long y = attachForMediaViewer.y();
                AttachForMediaViewer attachForMediaViewer2 = ((g120.a) obj2).a;
                return Boolean.valueOf(y == attachForMediaViewer2.y() && attachForMediaViewer.sa() == attachForMediaViewer2.sa() && attachForMediaViewer.getPosition() == attachForMediaViewer2.getPosition());
            case 6:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                aVar5.K(524877742);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(524877742, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueueItem.Content.<anonymous> (PodcastPlaybackQueueItem.kt:64)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1381541033, 0, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueueItem.coverErrorContent (PodcastPlaybackQueueItem.kt:136)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                v5g a = v5g.a.a(ylu0Var.getBackground().z, aVar5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return a;
            case 7:
                ((Integer) obj2).getClass();
                xqc0.b(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj).intValue();
                return ((MusicDto) obj2).b;
            case 9:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(-1237610826);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1237610826, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:154)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.r;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
            default:
                return ((Boolean) obj).booleanValue() ? VoipCallServiceBannerHandler.a.C2038a.a : ((Boolean) obj2).booleanValue() ? VoipCallServiceBannerHandler.a.c.a : VoipCallServiceBannerHandler.a.b.a;
        }
    }
}
