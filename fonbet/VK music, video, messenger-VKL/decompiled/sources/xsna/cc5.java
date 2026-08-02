package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.market.dto.MarketAddAlbumResponseDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.spw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cc5 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cc5(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                f8m f8mVar = (f8m) obj;
                return new AuthorModalInternalComponent((dc5) obj2, (VideoChannelComponent) f8mVar.c(fpf0.a(VideoChannelComponent.class)), (BridgeComponent) f8mVar.a(fpf0.a(BridgeComponent.class)));
            case 1:
                return new Pair((DialogExt) obj, (t140) obj2);
            case 2:
                return (it80) obj;
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1259532641, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesPlaceholderKt.lambda$-1259532641.<anonymous> (StorefrontServicesPlaceholder.kt:232)");
                    }
                    PlaceholderState placeholderState = PlaceholderState.Album;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new j60(17);
                        aVar.R(x);
                    }
                    hol0.f(placeholderState, null, null, false, null, (izs) x, aVar, 199686, 22);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                fzn fznVar = (fzn) obj2;
                DonutContactsListFactory donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP;
                return new s0o((String) obj, fznVar.e, fznVar.a, SortOrder.BY_NAME, fznVar.d);
            case 5:
                com.vk.photo.editor.features.colorgrading.a aVar2 = (com.vk.photo.editor.features.colorgrading.a) obj;
                return com.vk.photo.editor.features.colorgrading.a.a(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a.C1454a.a(aVar2.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 134213631), null, 6143);
            case 6:
                MarketAddAlbumResponseDto marketAddAlbumResponseDto = (MarketAddAlbumResponseDto) obj;
                int i = MarketEditAlbumGoodsFragment.c1;
                return marketAddAlbumResponseDto;
            case 7:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            case 8:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1487790758, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreen.<anonymous>.<anonymous> (StorefrontServicesScreen.kt:114)");
                    }
                    if (oq.h(-1287978532, aVar3)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 9:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(1264120637);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1264120637, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:158)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.v;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
            default:
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj2;
                return new spw0.d.b(friendsGetFieldsResponseDto.getCount(), kpw0.V((FriendsGetFieldsResponseDto) obj), kpw0.U(friendsGetFieldsResponseDto));
        }
    }

    public /* synthetic */ cc5(kpw0 kpw0Var) {
        this.b = 10;
    }
}
