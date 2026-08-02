package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetByIdResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBannedExtendedResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsActionRedesignResponseDto;
import com.vk.api.generated.photos.dto.PhotosVerticalizeResponseDto;
import com.vk.api.generated.wall.dto.WallGetExtendedResponseDto;
import com.vk.clips.sdk.shared.api.deps.clips.ShortVideoUserSettings;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.apihelpers.RedirectHandler;
import org.chromium.net.apihelpers.RedirectHandlers;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.sdk.api.TokenProvider;
import xsna.cri;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yu50 implements b03, f03, TokenProvider, RedirectHandler, io.reactivex.rxjava3.functions.l, Preference.b, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ yu50(int i) {
        this.b = i;
    }

    public static Iterator a(androidx.compose.runtime.a aVar, q630 q630Var, cri.a.d dVar, int i, List list) {
        k9q0.w(aVar, q630Var, dVar);
        aVar.K(i);
        return list.iterator();
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        if (obj == null) {
            return true;
        }
        if (((Boolean) obj).booleanValue()) {
            L.y(e43.a(LoggerOutputTarget.RING_FILE, LoggerOutputTarget.LOGCAT));
            return true;
        }
        LoggerOutputTarget.Companion.getClass();
        L.y(e43.a(LoggerOutputTarget.NONE));
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                return ShortVideoUserSettings.c;
            case 12:
                return null;
            default:
                return s3q0.a;
        }
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.uv0.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (NarrativesGetByIdResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, NarrativesGetByIdResponseDto.class).getType())).a();
            case 1:
                return (NewsfeedGetBannedExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, NewsfeedGetBannedExtendedResponseDto.class).getType())).a();
            case 4:
                return (PhotosVerticalizeResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosVerticalizeResponseDto.class).getType())).a();
            case 10:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (WallGetExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsActionRedesignResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // ru.ok.android.sdk.api.TokenProvider
    public String getToken() {
        String str;
        str = OkApi.Builder.tokenProvider$lambda$0();
        return str;
    }

    @Override // org.chromium.net.apihelpers.RedirectHandler
    public boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
        boolean lambda$neverFollow$0;
        lambda$neverFollow$0 = RedirectHandlers.lambda$neverFollow$0(urlResponseInfo, str);
        return lambda$neverFollow$0;
    }
}
