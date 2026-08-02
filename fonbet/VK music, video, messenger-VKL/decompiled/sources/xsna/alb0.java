package xsna;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.podcasts.dto.PodcastsSuccessResponseDto;
import com.vk.api.generated.polls.dto.PollsFieldsVotersDto;
import com.vk.api.generated.search.dto.SearchGetCoOwnersResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersBonusRewardsCatalogResponseDto;
import com.vk.api.generated.utils.dto.UtilsGuessUserSexResponseDto;
import com.vk.api.generated.video.dto.VideoVideoBookmakerAdStateDto;
import com.vk.api.generated.wall.dto.WallGetSubscriptionsExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.o2z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class alb0 implements b03, f03, io.reactivex.rxjava3.functions.l, k0z0, o2z0.b {
    public final /* synthetic */ int b;

    public /* synthetic */ alb0(int i) {
        this.b = i;
    }

    public static String b(StringBuilder sb, Uri uri, char c) {
        sb.append(uri);
        sb.append(c);
        return sb.toString();
    }

    public static NoWhenBranchMatchedException c(int i, androidx.compose.runtime.a aVar) {
        aVar.K(i);
        aVar.j();
        return new NoWhenBranchMatchedException();
    }

    @Override // xsna.o2z0.b
    public void a(boolean z) {
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((wj8) obj).d;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (PodcastsSuccessResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PodcastsSuccessResponseDto.class).getType())).a();
            case 1:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PollsFieldsVotersDto.class).getType()).getType())).a();
            case 2:
            default:
                return (VideoVideoBookmakerAdStateDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoVideoBookmakerAdStateDto.class).getType())).a();
            case 3:
                return (SearchGetCoOwnersResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, SearchGetCoOwnersResponseDto.class).getType())).a();
            case 4:
                return (ShortVideoGetResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoGetResponseDto.class).getType())).a();
            case 5:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 6:
                return (StoreGetStickersBonusRewardsCatalogResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoreGetStickersBonusRewardsCatalogResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 8:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UtilsGuessUserSexResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetSubscriptionsExtendedResponseDto.class).getType());
        }
    }

    @Override // xsna.k0z0
    public Float a(View view) {
        float f;
        if (!kly0.h(view)) {
            if (view.getLocalVisibleRect(new Rect())) {
                f = (r0.bottom / view.getHeight()) * 100.0f;
                return Float.valueOf(f);
            }
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return Float.valueOf(f);
    }
}
