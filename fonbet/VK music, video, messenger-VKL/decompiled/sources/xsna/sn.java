package xsna;

import android.os.Parcel;
import android.widget.RelativeLayout;
import com.vk.api.generated.account.dto.AccountCheckPasswordResponseDto;
import com.vk.api.generated.apps.dto.AppsGetAttachPickerListResponseDto;
import com.vk.api.generated.apps.dto.AppsGetFriendsListExtendedResponseDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistExtendedResponseDto;
import com.vk.api.generated.auth.dto.AuthInvalidateExchangeTokenMultiResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsChangePaymentMethodResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutCheckCensoredValidateResponseDto;
import com.vk.api.generated.friends.dto.FriendsDeleteResponseDto;
import com.vk.api.generated.groups.dto.GroupsInviteLinksDto;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCheckoutOrderResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewCreateConfigResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationStylesLangResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetRecomThemesResponseDto;
import com.vk.dto.common.Image;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.BitrateAdjuster;
import org.webrtc.BitrateAdjusterFactory;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.VideoCodecMimeType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class sn implements f03, mw, b03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, ListValidator, BitrateAdjusterFactory {
    public final /* synthetic */ int b;

    public /* synthetic */ sn(int i) {
        this.b = i;
    }

    public static io.reactivex.rxjava3.internal.operators.single.q b(String str) {
        return io.reactivex.rxjava3.core.x.i(new IllegalStateException(str));
    }

    public static hpm c(w2w w2wVar) {
        return w2wVar.I0().b().e();
    }

    public static void d(int i, String str) {
        ahn.F(str + i);
    }

    public static void f(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void h(String str, int i, RelativeLayout.LayoutParams layoutParams, int i2) {
        layoutParams.addRule(i2, str.substring(i).hashCode());
    }

    public static /* synthetic */ boolean i(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 12:
                return ((RecomSettingsGetRecomThemesResponseDto) obj).d();
            default:
                return Image.d;
        }
    }

    @Override // org.webrtc.BitrateAdjusterFactory
    public BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        BitrateAdjuster lambda$static$0;
        lambda$static$0 = HardwareVideoEncoderFactory.lambda$static$0(videoCodecMimeType, str);
        return lambda$static$0;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (AppsGetAttachPickerListResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetAttachPickerListResponseDto.class).getType())).a();
            case 8:
                return (AudioGetPlaylistExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioGetPlaylistExtendedResponseDto.class).getType())).a();
            case 9:
                return (AuthInvalidateExchangeTokenMultiResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthInvalidateExchangeTokenMultiResponseDto.class).getType())).a();
            case 18:
                return (DonutCheckCensoredValidateResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutCheckCensoredValidateResponseDto.class).getType())).a();
            case 22:
                return (GroupsInviteLinksDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsInviteLinksDto.class).getType())).a();
            case 24:
                return (LikesAddResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, LikesAddResponseDto.class).getType())).a();
            case 26:
                return (MarketCreateCheckoutOrderResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketCreateCheckoutOrderResponseDto.class).getType())).a();
            case 28:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (MessagesGetConversationStylesLangResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetConversationStylesLangResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountCheckPasswordResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetFriendsListExtendedResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 10:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 11:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CommunitySubscriptionsChangePaymentMethodResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsDeleteResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetItemReviewCreateConfigResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return !((HashSet) obj).isEmpty();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (vqt) obj;
    }

    @Override // xsna.mw
    public void a(boolean z) {
    }
}
