package io.reactivex.rxjava3.internal.operators.mixed;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.vk.api.generated.account.dto.AccountPushSettingsDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.audio.dto.AudioRadioStationDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsResponseObjectDto;
import com.vk.api.generated.messages.dto.MessagesDeleteConversationResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetRecordsResponseDto;
import com.vk.core.util.NoLocation;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.lists.AbstractPaginatedView;
import com.vk.log.L;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.yandex.div.internal.parser.ValueValidator;
import io.appmetrica.analytics.impl.Ho;
import io.appmetrica.analytics.impl.Jo;
import io.reactivex.rxjava3.internal.operators.mixed.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONObject;
import xsna.b03;
import xsna.cn70;
import xsna.dt1;
import xsna.e3m;
import xsna.f03;
import xsna.f4m;
import xsna.m99;
import xsna.rbr;
import xsna.rzz;
import xsna.szz;
import xsna.wwx;
import xsna.xq;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class k implements b03, a.k, f03, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, ValueValidator, FeedGoodsPhotoHolder.b, Jo, AbstractPaginatedView.f {
    public final /* synthetic */ int b;

    public /* synthetic */ k(int i) {
        this.b = i;
    }

    public static int c(int i, int i2, Source source) {
        return (source.hashCode() + i) * i2;
    }

    public static String d(StringBuilder sb, ExtendedUserProfile extendedUserProfile, char c) {
        sb.append(extendedUserProfile);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ void f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, rzz rzzVar, szz szzVar, szz szzVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(rzzVar, szzVar, szzVar2) && atomicReferenceFieldUpdater.get(rzzVar) == szzVar) {
        }
    }

    public static /* synthetic */ boolean h(AtomicReference atomicReference, l.a.C2137a c2137a, l.a.C2137a c2137a2) {
        while (!atomicReference.compareAndSet(c2137a, c2137a2)) {
            if (atomicReference.get() != c2137a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.appmetrica.analytics.impl.Jo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        return Ho.a(jSONObject, jSONObject2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 7:
                L.g("CameraLocationHelper", (Throwable) obj);
                return NoLocation.b;
            case 8:
                return io.reactivex.rxjava3.core.q.H((Throwable) obj);
            case 16:
                return new rbr(null, null);
            case 20:
                return ((io.reactivex.rxjava3.core.q) obj).L(new xq(20), false);
            default:
                return ((Playlist) obj).y;
        }
    }

    @Override // androidx.compose.foundation.layout.a.k
    public int b(int i, LayoutDirection layoutDirection) {
        dt1.a.getClass();
        return dt1.a.n.a(0, i, layoutDirection);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AccountPushSettingsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountPushSettingsDto.class).getType())).a();
            case 2:
                return (AppsGamesCatalogDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGamesCatalogDto.class).getType())).a();
            case 9:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 22:
                return (MarketUserReviewsItemsResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketUserReviewsItemsResponseObjectDto.class).getType())).a();
            case 23:
                Boolean bool = (Boolean) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Boolean.class).getType())).a();
                bool.getClass();
                return bool;
            default:
                return (ServiceBookingGetRecordsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingGetRecordsResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioRadioStationDto.class).getType()).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsGetHistoryResponseDto.class).getType());
            case 11:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, UserId.class).getType()).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesDeleteConversationResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder.b
    public FeedGoodsPhotoHolder.GoodsVisibilityState getState() {
        return FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 12:
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

    @Override // com.vk.lists.AbstractPaginatedView.f
    public View l(Context context) {
        VkSpinner vkSpinner = new VkSpinner(context, null, 6, 0);
        vkSpinner.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        f4m.q(cn70.b(168) + e3m.d(R.attr.actionBarSize, context), vkSpinner);
        return vkSpinner;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ k(Object obj, int i) {
        this.b = i;
    }
}
