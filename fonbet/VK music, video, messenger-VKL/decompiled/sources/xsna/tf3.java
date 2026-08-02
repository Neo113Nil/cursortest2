package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.preference.Preference;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceResponseDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokensResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetGroupInfoResponseDto;
import com.vk.api.generated.market.dto.MarketGetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPopularHashtagsResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.FollowersTabFragment;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.ihz;
import xsna.it80;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tf3 implements f03, b03, szs, io.reactivex.rxjava3.functions.l, Preference.c, ihz.a, HlsPlaylistTracker.a, ValueValidator, kss, tj50.a.c {
    public final /* synthetic */ int b;

    public /* synthetic */ tf3(int i) {
        this.b = i;
    }

    public static View b(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
    public HlsPlaylistTracker a(qfl qflVar, androidx.media3.exoplayer.upstream.b bVar, p9v p9vVar) {
        return new androidx.media3.exoplayer.hls.playlist.a(qflVar, bVar, p9vVar);
    }

    @Override // xsna.szs
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return ((pgq) obj).c().getClass().getSimpleName();
            case 4:
                it80.a aVar = it80.b;
                dhw0 L = com.vk.voip.ui.c.b.L();
                CallMemberId callMemberId = L != null ? L.y : null;
                aVar.getClass();
                return new it80(callMemberId);
            case 13:
                return (List) obj;
            case 25:
                return (io.reactivex.rxjava3.core.x) obj;
            default:
                return ((PageLoadingState) obj).Bb();
        }
    }

    @Override // xsna.kss
    public void c(gss gssVar) {
        int i = FollowersTabFragment.c0;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AudioGetIdsBySourceResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AudioGetIdsBySourceResponseDto.class).getType())).a();
            case 2:
                return (AuthRefreshTokensResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AuthRefreshTokensResponseDto.class).getType())).a();
            case 15:
                return (GroupsGetGroupInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetGroupInfoResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 26:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 27:
                return (ShortVideoGetPopularHashtagsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoGetPopularHashtagsResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        a201.b().a().b();
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemSendOtpResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 9:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 10:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ tf3(by1.a aVar, int i) {
        this.b = 7;
    }
}
