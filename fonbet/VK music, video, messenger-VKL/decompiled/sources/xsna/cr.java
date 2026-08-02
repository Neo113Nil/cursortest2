package xsna;

import com.vk.api.generated.account.dto.AccountModelKeyDto;
import com.vk.api.generated.apps.dto.AppsGetScopesResponseDto;
import com.vk.api.generated.articles.dto.ArticlesGetOwnerPublishedResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsCheckParticipantNameResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsDonutSettingsDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.docs.dto.DocsGetResponseDto;
import com.vk.api.generated.market.dto.MarketCreateItemReviewCommentResponseDto;
import com.vk.api.generated.market.dto.MarketUpdateItemReviewResponseDto;
import com.vk.api.generated.masks.dto.MasksGetAssetVersionResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetRecommendedFoldersResponseDto;
import com.vk.api.generated.multiaccount.dto.MultiaccountCheckRelatedUserPinCodeResponseDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetHeaderTabsResponseDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cr implements f03, b03, io.reactivex.rxjava3.functions.l, ValueValidator, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ cr(int i) {
        this.b = i;
    }

    public static void a(ChannelMessageColumn channelMessageColumn, StringBuilder sb, String str) {
        sb.append(channelMessageColumn.getKey());
        sb.append(str);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                return ((nlq0) obj).m;
            case 24:
                return ((WallLastPostingInfoResponseDto) obj).d();
            default:
                return Optional.of((VKList) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 5:
                return (CallsCheckParticipantNameResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CallsCheckParticipantNameResponseDto.class).getType())).a();
            case 7:
                return (ChannelsDonutSettingsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ChannelsDonutSettingsDto.class).getType())).a();
            case 12:
                return (DocsGetResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DocsGetResponseDto.class).getType())).a();
            case 13:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 14:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 17:
                return (MarketUpdateItemReviewResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketUpdateItemReviewResponseDto.class).getType())).a();
            case 20:
                return (MessagesGetRecommendedFoldersResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetRecommendedFoldersResponseDto.class).getType())).a();
            case 21:
                return (MultiaccountCheckRelatedUserPinCodeResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MultiaccountCheckRelatedUserPinCodeResponseDto.class).getType())).a();
            case 22:
                return (AudioAudioDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioAudioDto.class).getType())).a();
            default:
                return (PollsPollExtendedDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PollsPollExtendedDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AccountModelKeyDto.class).getType()).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetScopesResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ArticlesGetOwnerPublishedResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketCreateItemReviewCommentResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MasksGetAssetVersionResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetHeaderTabsResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 9:
                return ParsingValidatorsKt.doesMatch((String) obj, "^[a-zA-Z_][a-zA-Z0-9_]*$");
            case 10:
                return ((Long) obj).longValue() >= 0;
            default:
                long longValue = ((Long) obj).longValue();
                return longValue > 0 && longValue <= 100;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof fjw0) || (obj instanceof h3x0);
    }

    public /* synthetic */ cr(izs izsVar, int i) {
        this.b = i;
    }
}
