package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.media3.exoplayer.drm.b;
import androidx.preference.Preference;
import com.google.common.collect.ImmutableList;
import com.vk.api.generated.accountVerification.dto.AccountVerificationGetSessionInfoResponseDto;
import com.vk.api.generated.ads.dto.AdsRetargetingHitDto;
import com.vk.api.generated.apps.dto.AppsStartCallResponseDto;
import com.vk.api.generated.auth.dto.AuthCheckAccessResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogReplaceBlocksDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.email.dto.EmailCreationResponseDto;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.messages.dto.MessagesCreateChatWithPeerIdsResponseDto;
import com.vk.api.generated.onboarding.dto.OnboardingGetCardsResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class at implements b03, f03, io.reactivex.rxjava3.functions.m, szs, Preference.b, ihz.a, ValueValidator, b.InterfaceC0056b, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ at(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, ExtendedCommunityProfile extendedCommunityProfile, char c) {
        sb.append(extendedCommunityProfile);
        sb.append(c);
        return sb.toString();
    }

    public static KotlinNothingValueException b(String str) {
        androidx.compose.runtime.b.b(str);
        return new KotlinNothingValueException();
    }

    public static Lazy c(LazyThreadSafetyMode lazyThreadSafetyMode) {
        return msy.a(lazyThreadSafetyMode, new re0(8));
    }

    public static void d(View view, int i, TextView textView) {
        textView.setText(view.getContext().getString(i));
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return j5g.u0((List) obj2, (List) obj);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountVerificationGetSessionInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountVerificationGetSessionInfoResponseDto.class).getType())).a();
            case 4:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 5:
                return (AuthCheckAccessResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthCheckAccessResponseDto.class).getType())).a();
            case 8:
                return (CatalogReplaceBlocksDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogReplaceBlocksDto.class).getType())).a();
            case 20:
                return (MarketGetByIdResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetByIdResponseDto.class).getType())).a();
            case 23:
                return (MessagesCreateChatWithPeerIdsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesCreateChatWithPeerIdsResponseDto.class).getType())).a();
            case 24:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AdsRetargetingHitDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsStartCallResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EmailCreationResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketReviewCommentsDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OnboardingGetCardsResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 14:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 15:
                if (((Double) obj).doubleValue() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                }
                break;
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ at(Object obj, int i) {
        this.b = i;
    }

    @Override // xsna.szs
    public Object apply(Object obj) {
        return ImmutableList.p(Integer.valueOf(((icc) obj).b));
    }

    public /* synthetic */ at(by1.a aVar, boolean z) {
        this.b = 13;
    }

    @Override // androidx.media3.exoplayer.drm.b.InterfaceC0056b
    public void release() {
    }
}
