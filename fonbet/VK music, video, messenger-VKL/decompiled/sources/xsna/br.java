package xsna;

import android.view.View;
import androidx.media3.exoplayer.audio.AudioOutput;
import com.vk.api.generated.account.dto.AccountModelKeyDto;
import com.vk.api.generated.apps.dto.AppsActionBannerDto;
import com.vk.api.generated.apps.dto.AppsGetScopesResponseDto;
import com.vk.api.generated.articles.dto.ArticlesGetOwnerPublishedResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsJoinResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.docs.dto.DocsGetTypesResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetInterestingRequestsResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRemoveAudiosResponseDto;
import com.vk.api.generated.market.dto.MarketCreateItemReviewCommentResponseDto;
import com.vk.api.generated.market.dto.MarketGetUserReviewsAggregatedResponseDto;
import com.vk.api.generated.masks.dto.MasksGetAssetVersionResponseDto;
import com.vk.api.generated.messages.dto.MessagesDeleteFullResponseItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetHeaderTabsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptySet;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class br implements b03, io.reactivex.rxjava3.functions.m, f03, ihz.a, io.reactivex.rxjava3.functions.l, ValueValidator, whp {
    public final /* synthetic */ int b;

    public /* synthetic */ br(int i) {
        this.b = i;
    }

    public static String b(StringBuilder sb, View view, char c) {
        sb.append(view);
        sb.append(c);
        return sb.toString();
    }

    public static String c(StringBuilder sb, j4b0 j4b0Var, char c) {
        sb.append(j4b0Var);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ boolean f(AtomicReference atomicReference, Map map, LinkedHashMap linkedHashMap) {
        while (!atomicReference.compareAndSet(map, linkedHashMap)) {
            if (atomicReference.get() != map) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.whp
    public String a() {
        int i = ProfileFriendsFragment.k0;
        return y8g0.e(R.string.search_empty);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Set<CallMemberId> set = L != null ? L.n : null;
                return set == null ? EmptySet.b : set;
            default:
                return ((KidsCollectionRemoveAudiosResponseDto) obj).d();
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AccountModelKeyDto.class).getType()).getType())).a();
            case 4:
                return (AppsGetScopesResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetScopesResponseDto.class).getType())).a();
            case 5:
                return (ArticlesGetOwnerPublishedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ArticlesGetOwnerPublishedResponseDto.class).getType())).a();
            case 6:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 11:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 19:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 20:
                return (MarketCreateItemReviewCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketCreateItemReviewCommentResponseDto.class).getType())).a();
            case 22:
                return (MasksGetAssetVersionResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MasksGetAssetVersionResponseDto.class).getType())).a();
            case 23:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (ShortVideoGetHeaderTabsResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoGetHeaderTabsResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsActionBannerDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsGetHistoryResponseDto.class).getType());
            case 12:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsJoinResponseDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DocsGetTypesResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetInterestingRequestsResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetUserReviewsAggregatedResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, MessagesDeleteFullResponseItemDto.class).getType()).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((AudioOutput.a) obj).onReleased();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 13:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return obj instanceof bwg0;
            default:
                return Boolean.TRUE.booleanValue();
        }
    }

    public /* synthetic */ br(izs izsVar, int i) {
        this.b = i;
    }
}
