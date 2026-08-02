package xsna;

import com.vk.api.generated.account.dto.AccountGetMultiResponseDto;
import com.vk.api.generated.apps.dto.AppsInviteMultipleFriendResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.esia.dto.EsiaGetEsiaUserInfoResponseDto;
import com.vk.api.generated.gifts.dto.GiftsGetResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesSectionResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetBackgroundsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetTemplatesResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingResponseDto;
import com.vk.api.generated.orders.dto.OrdersAppSubscriptionItemDto;
import com.vk.api.generated.photos.dto.PhotosGetLutImagesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.b0g;
import xsna.i6p;
import xsna.xec;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class as implements f03, b03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, i6p.a, ValueValidator, ListValidator, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ as(int i) {
        this.b = i;
    }

    public static boolean a(int i, yzs yzsVar, lg90 lg90Var, androidx.compose.runtime.a aVar) {
        yzsVar.invoke(lg90Var, aVar, Integer.valueOf(i));
        return androidx.compose.runtime.b.d();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(obj2);
        return arrayList;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsInviteMultipleFriendResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsInviteMultipleFriendResponseDto.class).getType())).a();
            case 3:
                return (AudioBooksBoolResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioBooksBoolResponseDto.class).getType())).a();
            case 4:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 9:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 20:
                return (MarketGetServicesSectionResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetServicesSectionResponseDto.class).getType())).a();
            case 22:
                return (MessagesGetBackgroundsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetBackgroundsResponseDto.class).getType())).a();
            case 24:
                return (NotificationsEditRedesignPushSettingResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsEditRedesignPushSettingResponseDto.class).getType())).a();
            case 26:
                return (PhotosGetLutImagesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosGetLutImagesResponseDto.class).getType())).a();
            default:
                return (ShortVideoGetTemplateExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ShortVideoGetTemplateExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetMultiResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsMiniappsCatalogItemPayloadListDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EsiaGetEsiaUserInfoResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GiftsGetResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.common.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetByIdObjectResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetTemplatesResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersAppSubscriptionItemDto.class).getType());
        }
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

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(final io.reactivex.rxjava3.core.y yVar) {
        b0g b0gVar = b0g.a;
        b0g.a(new b0g.a() { // from class: xsna.udq
            @Override // xsna.b0g.a
            public final void a() {
                io.reactivex.rxjava3.core.y.this.onSuccess(s3q0.a);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 8:
                return m99.m(obj);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool.booleanValue();
        }
    }

    public /* synthetic */ as(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 7:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Set<CallMemberId> set = L != null ? L.h : null;
                return set == null ? EmptySet.b : set;
            case 11:
                return ((ixw) obj).d;
            case 12:
                return new xec.b((Throwable) obj);
            default:
                return s3q0.a;
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
