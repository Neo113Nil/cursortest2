package xsna;

import com.ironsource.InterfaceC4321fg;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.vk.api.generated.apps.dto.AppsMarkBadgeAsClickedResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsMessageDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetMaxSessionStatusResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetInviteLinkPreviewResponseDto;
import com.vk.api.generated.identity.dto.IdentityAddressResponseDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsDto;
import com.vk.api.generated.market.dto.MarketGetAddressesResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetScheduledCallsResponseDto;
import com.vk.api.generated.messages.dto.MessagesJoinChatByInviteLinkResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreatedRecordDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.dto.common.Image;
import com.vk.dto.masks.MasksCatalogItem;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fq implements b03, io.reactivex.rxjava3.functions.l, f03, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, ValueValidator, InterfaceC4321fg {
    public final /* synthetic */ int b;

    public /* synthetic */ fq(int i) {
        this.b = i;
    }

    public static int b(Image image, int i, int i2) {
        return (image.hashCode() + i) * i2;
    }

    public static /* synthetic */ String c(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (str.length() > 33554431) {
            throw new OutOfMemoryError("Repeating " + str.length() + " bytes String 64 times will produce a String exceeding maximum size.");
        }
        StringBuilder sb = new StringBuilder(length * 64);
        for (int i = 0; i < 64; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String d(StringBuilder sb, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, char c) {
        sb.append(newsfeedItemDebugInfoDto);
        sb.append(c);
        return sb.toString();
    }

    @Override // com.ironsource.InterfaceC4321fg
    public void a(gzs gzsVar) {
        IronSourceThreadManager.a(gzsVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Result) obj;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (AppsMarkBadgeAsClickedResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsMarkBadgeAsClickedResponseDto.class).getType())).a();
            case 6:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 12:
                return (EcosystemGetMaxSessionStatusResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, EcosystemGetMaxSessionStatusResponseDto.class).getType())).a();
            case 15:
                return (IdentityAddressResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, IdentityAddressResponseDto.class).getType())).a();
            case 18:
                return (MarketCheckoutSettingsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketCheckoutSettingsDto.class).getType())).a();
            case 19:
                return (MarketGetAddressesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetAddressesResponseDto.class).getType())).a();
            case 21:
                return (MessagesGetScheduledCallsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetScheduledCallsResponseDto.class).getType())).a();
            case 28:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsMessageDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetInviteLinkPreviewResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesJoinChatByInviteLinkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingCreatedRecordDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoSetCoOwnerStatusResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool.booleanValue();
            default:
                return obj instanceof pru0;
        }
    }

    public /* synthetic */ fq(int i, xzs xzsVar) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Set<CallMemberId> set;
        switch (this.b) {
            case 2:
                return ((PageLoadingState) obj).Bb();
            case 4:
                dhw0 L = com.vk.voip.ui.c.b.L();
                return (L == null || (set = L.l) == null) ? EmptySet.b : set;
            case 13:
                return s3q0.a;
            default:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MasksCatalogItem) it.next()).zb());
                }
                return arrayList;
        }
    }
}
