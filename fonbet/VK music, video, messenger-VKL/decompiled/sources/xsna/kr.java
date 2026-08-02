package xsna;

import android.view.View;
import com.vk.api.generated.account.dto.AccountGetProfilesSwitcherInfoResponseDto;
import com.vk.api.generated.apps.dto.AppsJoinAndGetResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioRestrictionDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetDetailsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutDonatorSubscriptionInfoDto;
import com.vk.api.generated.fave.dto.FaveGetPhotosResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFriendsDeletionSuggestionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFieldsResponseDto;
import com.vk.api.generated.market.dto.MarketCommunityExternalLinkDetailsDto;
import com.vk.api.generated.market.dto.MarketGroupForAttachDto;
import com.vk.api.generated.messages.dto.MessagesIsMessagesFromGroupAllowedResponseDto;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.cri;
import xsna.ihz;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kr implements f03, b03, io.reactivex.rxjava3.functions.l, ihz.a, ValueValidator, DatabaseOpenHelperProvider, l8x.a, StoryViewerRouter.a {
    public final /* synthetic */ int b;

    public /* synthetic */ kr(int i) {
        this.b = i;
    }

    public static void a(int i, androidx.compose.runtime.a aVar, int i2, cri.a.b bVar) {
        aVar.R(Integer.valueOf(i));
        aVar.b(Integer.valueOf(i2), bVar);
    }

    public static void b(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
    }

    public static void d(ArrayList arrayList, StringBuilder sb, String str) {
        sb.append((Object) wow.c(arrayList));
        sb.append(str);
    }

    public static boolean f(androidx.compose.runtime.a aVar) {
        aVar.G();
        aVar.G();
        return androidx.compose.runtime.b.d();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                return ((fjw0) obj).a;
            case 12:
                return s3q0.a;
            default:
                return (List) obj;
        }
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new ncq(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsJoinAndGetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsJoinAndGetResponseDto.class).getType())).a();
            case 6:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 9:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 10:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 18:
                return (DonutDonatorSubscriptionInfoDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutDonatorSubscriptionInfoDto.class).getType())).a();
            case 20:
                return (FaveGetPhotosResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FaveGetPhotosResponseDto.class).getType())).a();
            case 21:
                return (FriendsGetFriendsDeletionSuggestionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsGetFriendsDeletionSuggestionsResponseDto.class).getType())).a();
            case 22:
                return (GroupsGetMembersFieldsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetMembersFieldsResponseDto.class).getType())).a();
            case 27:
                return (MessagesIsMessagesFromGroupAllowedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesIsMessagesFromGroupAllowedResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetProfilesSwitcherInfoResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioAudioRestrictionDto.class).getType()).getType());
            case 13:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CommunitySubscriptionsGetDetailsResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, MarketGroupForAttachDto.class).getType()).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketCommunityExternalLinkDetailsDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        return doubleValue >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && doubleValue <= 1.0d;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public View k(String str) {
        return null;
    }

    public /* synthetic */ kr(by1.a aVar, int i, int i2, boolean z) {
        this.b = 14;
    }
}
