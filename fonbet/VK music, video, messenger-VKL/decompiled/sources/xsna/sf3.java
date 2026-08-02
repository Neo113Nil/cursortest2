package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlResponseDto;
import com.vk.api.generated.auth.dto.AuthValidatePhoneConfirmResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsCatalogGiftDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.api.generated.messages.dto.MessagesAddChatUserResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemRecommendedAppBlockDto;
import com.vk.api.generated.notifications.dto.NotificationsGetSettingsNewResponseDto;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.api.generated.photos.dto.PhotosGetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAddFavoriteAudioResponseDto;
import com.vk.api.generated.video.dto.VideoGetMusicMixResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class sf3 implements f03, b03, Preference.b, Preference.c, ValueValidator, io.reactivex.rxjava3.functions.l, h9l, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ int b;

    public /* synthetic */ sf3(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, gzs gzsVar) {
        return (gzsVar.hashCode() + i) * i2;
    }

    public static void b(String str, com.vk.superapp.base.js.bridge.b bVar, String str2) {
        bVar.k(new JsMethod(str), str2);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        hf8.b("com.vkontakte.android.ACTION_DRAWER_MENU_CHAGNED");
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 11:
                Throwable th = (Throwable) obj;
                if (!(th instanceof ImTaskExecutionException)) {
                    throw th;
                }
                Throwable cause = ((ImTaskExecutionException) th).getCause();
                if (!(cause instanceof VKApiExecutionException)) {
                    throw th;
                }
                if (((VKApiExecutionException) cause).s() == 974) {
                    return new DialogsHistory(0, 30);
                }
                throw th;
            default:
                return io.reactivex.rxjava3.core.x.k(j5g.b0(0, (List) obj));
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AudioGetAudioPreviewUrlResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AudioGetAudioPreviewUrlResponseDto.class).getType())).a();
            case 4:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 5:
                return (CatalogSectionResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogSectionResponseObjectDto.class).getType())).a();
            case 18:
                return (BaseUploadServerDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
            case 20:
                return (NotificationsGetSettingsNewResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, NotificationsGetSettingsNewResponseDto.class).getType())).a();
            case 21:
                return (List) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, xtp0.getParameterized(List.class, OrdersOrderDto.class).getType()).getType())).a();
            case 25:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        LoggerOutputTarget.Companion.getClass();
        L.y(e43.a(LoggerOutputTarget.LOGCAT, LoggerOutputTarget.RING_FILE, LoggerOutputTarget.EXTERNAL));
        preference.F(false);
        preference.I("Уже включено");
        preference.l().edit().putBoolean("__dbg_log_to_file", true).apply();
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsMiniappsCatalogDto.class).getType());
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedItemRecommendedAppBlockDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthValidatePhoneConfirmResponseDto.class).getType());
            case 10:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 13:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, GiftsCatalogGiftDto.class).getType()).getType());
            case 14:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetEditUrlResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesAddChatUserResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoAddFavoriteAudioResponseDto.class).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 27:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetMusicMixResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new d0r();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final cdh0 cdh0Var = new cdh0(rVar);
        UiTracker uiTracker = UiTracker.a;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen != null) {
            rVar.onNext(uiTrackingScreen);
        }
        UiTracker.a(cdh0Var);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.bdh0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                UiTracker uiTracker2 = UiTracker.a;
                UiTracker.g(cdh0.this);
            }
        });
    }
}
