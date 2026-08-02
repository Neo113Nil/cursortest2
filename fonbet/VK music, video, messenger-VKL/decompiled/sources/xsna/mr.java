package xsna;

import androidx.media3.common.VideoFrameProcessingException;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.same.report.l;
import com.vk.api.generated.account.dto.AccountCheckPasswordResponseDto;
import com.vk.api.generated.apps.dto.AppsGetFriendsListExtendedResponseDto;
import com.vk.api.generated.apps.dto.AppsGetGroupsListResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistOriginalFollowedDto;
import com.vk.api.generated.auth.dto.AuthGetWebAuthLinkResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsChangePaymentMethodResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetOneTimePaymentsResponseDto;
import com.vk.api.generated.friends.dto.FriendsDeleteResponseDto;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityShopConditionsResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewCreateConfigResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetFromOwnerResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedIgnoreItemResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsActionRedesignResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.n8o;
import xsna.o0u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mr implements b03, f03, o0u.a, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, ValueValidator {
    public final /* synthetic */ int b;

    public /* synthetic */ mr(int i) {
        this.b = i;
    }

    public static com.mbridge.msdk.foundation.same.report.l b(String str) {
        return new l.b(str).a();
    }

    public static void c(String str, StringBuilder sb, List list) {
        sb.append((Object) wow.c(list));
        sb.append(str);
    }

    public static /* synthetic */ boolean d(String str, AtomicReference atomicReference) {
        while (!atomicReference.compareAndSet(str, null)) {
            if (atomicReference.get() != str) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.o0u.a
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ahn.o("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 11:
                return s3q0.a;
            case 13:
                return ((x960) obj).a();
            case 16:
                n8o n8oVar = (n8o) obj;
                vao.d.remove(n8oVar.a());
                if (n8oVar instanceof n8o.b) {
                    String str = ((n8o.b) n8oVar).c;
                    return str != null ? e43.a.getString(R.string.file_saved, str) : e43.a.getString(R.string.saved);
                }
                if (!(n8oVar instanceof n8o.a)) {
                    return "";
                }
                Exception exc = ((n8o.a) n8oVar).c;
                if (exc == null) {
                    return e43.a.getString(R.string.error);
                }
                return e43.a.getString(R.string.error) + " [" + exc.getMessage() + X3.j.e;
            default:
                return s3q0.a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountCheckPasswordResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountCheckPasswordResponseDto.class).getType())).a();
            case 2:
                return (AppsGetFriendsListExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetFriendsListExtendedResponseDto.class).getType())).a();
            case 3:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 5:
                return (AuthGetWebAuthLinkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthGetWebAuthLinkResponseDto.class).getType())).a();
            case 9:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 12:
                return (CommunitySubscriptionsChangePaymentMethodResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CommunitySubscriptionsChangePaymentMethodResponseDto.class).getType())).a();
            case 18:
                return (FriendsDeleteResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsDeleteResponseDto.class).getType())).a();
            case 24:
                return (MarketGetItemReviewCreateConfigResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetItemReviewCreateConfigResponseDto.class).getType())).a();
            default:
                return (NotificationsActionRedesignResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsActionRedesignResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetGroupsListResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioPlaylistOriginalFollowedDto.class).getType());
            case 10:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutGetOneTimePaymentsResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, LikesDeleteResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCommunityShopConditionsResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NarrativesGetFromOwnerResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedIgnoreItemResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    public /* synthetic */ mr(izs izsVar, int i) {
        this.b = i;
    }
}
