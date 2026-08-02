package xsna;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.hkh0;
import xsna.q630;
import xsna.rd8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class md8 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ md8(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return rd8.a.a((rd8.a) obj2, null, null, null, null, null, ((Boolean) obj).booleanValue(), 255);
            case 1:
                gzs gzsVar = (gzs) obj2;
                qcy<Object>[] qcyVarArr = ClipsViewersSdkComponentImpl.l;
                Activity h = e3m.h((Context) obj);
                return h == null ? hkh0.a.a.getSTUB() : new lpf(rdi.p(h, gzsVar));
            case 2:
                return com.vk.photo.editor.features.colorgrading.a.a((com.vk.photo.editor.features.colorgrading.a) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 8183);
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1786325353, intValue, -1, "com.vk.draftslist.impl.ui.view.ComposableSingletons$DraftsListViewContentKt.lambda$1786325353.<anonymous> (DraftsListViewContent.kt:325)");
                    }
                    q630 q = txj0.q(q630.a.a, 16);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.accessibility_actions, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, N, q, ylu0Var.getIcon().l, aVar, 392, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1580551120, intValue2, -1, "com.vk.core.compose.component.image.ComposableSingletons$VkResizablePictureKt.lambda$-1580551120.<anonymous> (VkResizablePicture.kt:32)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                u1c0 u1c0Var = (u1c0) obj;
                NewsEntry newsEntry = (NewsEntry) obj2;
                if (!(newsEntry instanceof FaveEntry)) {
                    return s3q0.a;
                }
                u1c0Var.h = (ol60) j5g.a0(new oy00().b(0, new Pair<>((FaveMarketItem) ((FaveEntry) newsEntry).i.f, newsEntry), null));
                return s3q0.a;
            case 6:
                StringBuilder a2 = vq.a("horizontal_games_list_item_", ((Integer) obj).intValue(), '_');
                a2.append(((g7t) obj2).d.a.b);
                return a2.toString();
            case 7:
                ((Integer) obj2).getClass();
                lwn0.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                return ((hn50) obj2).d();
            case 9:
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() && !bool.booleanValue()) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(256297403);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(256297403, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:140)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }
}
