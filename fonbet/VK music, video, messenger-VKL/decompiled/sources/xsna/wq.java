package xsna;

import android.util.Pair;
import androidx.media3.exoplayer.source.p;
import com.vk.api.generated.apps.dto.AppsIsNotificationsAllowedResponseDto;
import com.vk.api.generated.audio.dto.AudioGetReactionsConfigResponseDto;
import com.vk.api.generated.audio.dto.AudioMoosicAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetConversationByCallResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetCommentsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.api.generated.goodsOrders.dto.GoodsOrdersNewOrderItemDto;
import com.vk.api.generated.groups.dto.GroupsGetBidOrganizationsListResponseDto;
import com.vk.api.generated.leadForms.dto.LeadFormsGetUserFormDataResponseDto;
import com.vk.api.generated.market.dto.MarketDeleteCommunityReviewCommentResponseDto;
import com.vk.api.generated.messages.dto.MessagesChangeConversationMemberRestrictionsResponseDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.restore.dto.RestoreGetInstantAuthByNotifyInfoResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import xsna.lta;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wq implements b03, io.reactivex.rxjava3.functions.l, f03, io.reactivex.rxjava3.functions.c, ValueValidator, j7j {
    public final /* synthetic */ int b;

    public /* synthetic */ wq(int i) {
        this.b = i;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static int b(JSONArray jSONArray, int i, ArrayList arrayList, int i2, int i3) {
        arrayList.add(jSONArray.getString(i));
        return i2 + i3;
    }

    public static String c(String str, String str2, List list) {
        return str + list + str2;
    }

    public static ArrayList d(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        ((p.b) obj).b.release();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return ((zrb0) obj).a;
            case 4:
                return ((AudioGetReactionsConfigResponseDto) obj).d();
            case 5:
            case 8:
            case 9:
            case 10:
            default:
                return j5g.O0((List) obj);
            case 6:
                return lta.a.C3293a.a;
            case 7:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Set<CallMemberId> set = L != null ? L.o : null;
                return set == null ? EmptySet.b : set;
            case 11:
                return ((wsf) obj).b;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
                return (AppsIsNotificationsAllowedResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsIsNotificationsAllowedResponseDto.class).getType())).a();
            case 9:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 17:
                return (GoodsOrdersNewOrderItemDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, GoodsOrdersNewOrderItemDto.class).getType())).a();
            case 20:
                return (LeadFormsGetUserFormDataResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, LeadFormsGetUserFormDataResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, MessagesContactDto.class).getType()).getType())).a();
            default:
                return (RestoreGetInstantAuthByNotifyInfoResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, RestoreGetInstantAuthByNotifyInfoResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioMoosicAudioDto.class).getType()).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsGetConversationByCallResponseDto.class).getType());
            case 10:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsGetCommentsResponseDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetListsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetBidOrganizationsListResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketDeleteCommunityReviewCommentResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesChangeConversationMemberRestrictionsResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    public /* synthetic */ wq(int i, xzs xzsVar) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 12:
                return (it80) obj;
            default:
                return new Pair(Boolean.valueOf(((Integer) obj).intValue() > 0), (Boolean) obj2);
        }
    }
}
