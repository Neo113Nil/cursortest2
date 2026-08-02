package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.preference.Preference;
import com.vk.api.generated.ads.dto.AdsRetargetingHitDto;
import com.vk.api.generated.apps.dto.AppsStartCallResponseDto;
import com.vk.api.generated.audio.dto.AudioPreviewSnippetDto;
import com.vk.api.generated.auth.dto.AuthValidatePhoneCheckResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.email.dto.EmailCreationResponseDto;
import com.vk.api.generated.market.dto.MarketGetCartTotalQuantityResponseDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.messages.dto.MessagesEnumerateAppearancesResponseDto;
import com.vk.api.generated.onboarding.dto.OnboardingGetCardsResponseDto;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.zrv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w11 implements b03, io.reactivex.rxjava3.functions.l, f03, u6d, Preference.b, ValueValidator, ListValidator, zrv.a, ghj0 {
    public final /* synthetic */ int b;

    public /* synthetic */ w11(int i) {
        this.b = i;
    }

    public static int c(Instant instant, int i, int i2) {
        return (instant.hashCode() + i) * i2;
    }

    public static Rect d(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        int i = DebugUserSettingsFragment.l0;
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o260Var.d(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return EmptyList.b;
            case 8:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Map<CallMemberId, MediaOptionState> map = L != null ? L.s : null;
                return map == null ? jgp.b : map;
            case 15:
                return (List) obj;
            case 17:
                return i7d.a((h7d) obj);
            default:
                return (io.reactivex.rxjava3.core.x) obj;
        }
    }

    @Override // xsna.ghj0
    public boolean b() {
        return false;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AdsRetargetingHitDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AdsRetargetingHitDto.class).getType())).a();
            case 3:
                return (AppsStartCallResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsStartCallResponseDto.class).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 9:
                return (CatalogSectionResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogSectionResponseObjectDto.class).getType())).a();
            case 16:
                return (EmailCreationResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EmailCreationResponseDto.class).getType())).a();
            case 18:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 22:
                return (MarketGetCartTotalQuantityResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetCartTotalQuantityResponseDto.class).getType())).a();
            case 23:
                return (MarketReviewCommentsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketReviewCommentsDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 27:
                return (OnboardingGetCardsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, OnboardingGetCardsResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.zrv.a
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioPreviewSnippetDto.class).getType()).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthValidatePhoneCheckResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesEnumerateAppearancesResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 12:
                if (l.longValue() >= 0) {
                }
                break;
            case 13:
            default:
                if (l.longValue() >= 0) {
                }
                break;
            case 14:
                if (l.longValue() > 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 2;
    }

    @Override // xsna.u6d
    public void a(ClipItemViewEvent clipItemViewEvent) {
    }
}
