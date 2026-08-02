package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.api.generated.apps.dto.AppsGetLeaderboardByAppResponseDto;
import com.vk.api.generated.audio.dto.AudioGetAutoflowMixParamsResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRemoveAudiosResponseDto;
import com.vk.api.generated.market.dto.MarketGetRecommendsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetUserPhotosResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetStaffResponseDto;
import com.vk.api.generated.stories.dto.StoriesSearchGifResponseDto;
import com.vk.api.generated.translations.dto.TranslationsTranslateResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vkontakte.android.R;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jh implements b03, f03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.m, Preference.c, DivDownloader, VkTooltip.b, ScreenModeVideoStatMapper.a {
    public final /* synthetic */ int b;

    public /* synthetic */ jh(int i) {
        this.b = i;
    }

    public static lg90 c(qzu0 qzu0Var, androidx.compose.runtime.a aVar) {
        qzu0Var.getClass();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(875484578, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SunOutline28> (VkIcons.kt:10646)");
        }
        lg90 b = or.b(aVar, -1775154939, R.drawable.vk_icon_sun_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b;
    }

    public static void f(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static boolean h(String str, peq0 peq0Var, Regex regex, Regex regex2, int i) {
        return peq0.p(peq0Var, new Regex(str), regex, regex2, i);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                return va9.r;
            case 9:
                return (zqc) obj;
            default:
                return Boolean.TRUE;
        }
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return ibj0.f(unifiedStatScreenMode);
    }

    @Override // com.yandex.div.core.downloader.DivDownloader
    public LoadReference downloadPatch(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
        LoadReference lambda$static$0;
        lambda$static$0 = DivDownloader.lambda$static$0(div2View, str, divPatchDownloadCallback);
        return lambda$static$0;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AccountGetModelsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetModelsResponseDto.class).getType())).a();
            case 2:
                return (AppsGetLeaderboardByAppResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetLeaderboardByAppResponseDto.class).getType())).a();
            case 16:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 17:
                return (MarketGetRecommendsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetRecommendsResponseDto.class).getType())).a();
            case 18:
                return (MessagesGetConversationsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetConversationsResponseDto.class).getType())).a();
            case 25:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (StoriesSearchGifResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesSearchGifResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        throw new OutOfMemoryError();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetAutoflowMixParamsResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 13:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, KidsCollectionRemoveAudiosResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetUserPhotosResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingGetStaffResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, TranslationsTranslateResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        com.vk.movika.sdk.base.observable.k kVar = new com.vk.movika.sdk.base.observable.k(yVar, 18);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(kVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        t8j t8jVar = (t8j) obj;
        if (t8jVar.b.t8() != Peer.Type.USER) {
            return false;
        }
        qtd0 qtd0Var = t8jVar.b;
        User user = qtd0Var instanceof User ? (User) qtd0Var : null;
        return user != null && user.E;
    }

    public /* synthetic */ jh(Object obj, int i) {
        this.b = i;
    }

    @Override // com.vk.core.view.components.tooltip.VkTooltip.b
    public void b(VkTooltip.DismissReason dismissReason) {
    }
}
