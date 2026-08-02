package xsna;

import android.util.Pair;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.vk.api.generated.apps.dto.AppsIsNotificationsAllowedResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsCreateCommentResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetRecommendationsResponseDto;
import com.vk.api.generated.goodsOrders.dto.GoodsOrdersNewOrderItemDto;
import com.vk.api.generated.groups.dto.GroupsGetChatsResponseDto;
import com.vk.api.generated.leadForms.dto.LeadFormsGetUserFormDataResponseDto;
import com.vk.api.generated.market.dto.MarketGetCartExtendedResponseDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messages.dto.MessagesGetReactedPeersResponseDto;
import com.vk.api.generated.restore.dto.RestoreGetInstantAuthByNotifyInfoResponseDto;
import com.vk.dto.common.FriendFolder;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xq implements f03, b03, io.reactivex.rxjava3.functions.l, ValueValidator, ListValidator, io.reactivex.rxjava3.functions.c, MediaCodecUtil.c {
    public final /* synthetic */ int b;

    public /* synthetic */ xq(int i) {
        this.b = i;
    }

    public static int b(WidgetSettings widgetSettings, int i, int i2) {
        return (widgetSettings.hashCode() + i) * i2;
    }

    public static String c(char c, float f, StringBuilder sb) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String d(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static n8m f(ImFeatureScopeProviderComponent imFeatureScopeProviderComponent, Peer peer, l7m l7mVar) {
        return l7mVar.d(imFeatureScopeProviderComponent.getProvider().a(peer));
    }

    public static void h(String str, String str2, Throwable th) {
        com.mbridge.msdk.foundation.tools.q0.b(str2, str + th);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
    public int a(Object obj) {
        String str = ((hq10) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return new Pair((Boolean) obj, (Boolean) obj2);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 6:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 10:
                return (ChannelsCreateCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsCreateCommentResponseDto.class).getType())).a();
            case 15:
                return (FriendsGetRecommendationsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, FriendsGetRecommendationsResponseDto.class).getType())).a();
            case 18:
                return (GroupsGetChatsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetChatsResponseDto.class).getType())).a();
            case 25:
                return (MessagesGetReactedPeersResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetReactedPeersResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsIsNotificationsAllowedResponseDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GoodsOrdersNewOrderItemDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, LeadFormsGetUserFormDataResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCartExtendedResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, MessagesContactDto.class).getType()).getType());
            default:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, RestoreGetInstantAuthByNotifyInfoResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        return doubleValue >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && doubleValue <= 1.0d;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                return va9.r;
            case 11:
                return ((stf) obj).b;
            case 20:
                Throwable th = (Throwable) obj;
                return th instanceof IOException ? io.reactivex.rxjava3.core.q.B0(3000L, TimeUnit.MILLISECONDS) : io.reactivex.rxjava3.core.q.H(th);
            default:
                int[] iArr = PrivacyEditFragment.W0;
                ArrayList arrayList = new ArrayList();
                for (FriendsFriendsListDto friendsFriendsListDto : ((FriendsGetListsResponseDto) obj).d()) {
                    FriendFolder friendFolder = new FriendFolder();
                    friendFolder.b = friendsFriendsListDto.getId();
                    friendFolder.c = friendsFriendsListDto.d();
                    arrayList.add(friendFolder);
                }
                return arrayList;
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
