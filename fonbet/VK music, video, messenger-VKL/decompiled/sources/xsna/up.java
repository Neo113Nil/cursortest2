package xsna;

import android.app.ActivityManager;
import android.os.Process;
import androidx.preference.Preference;
import com.vk.api.generated.audio.dto.AudioDeleteExtendedResponseDto;
import com.vk.api.generated.auth.dto.AuthProcessAuthCodeResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetOwnersForCreateResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddAudioResponseDto;
import com.vk.api.generated.market.dto.MarketGetOrderByIdResponseDto;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.yandex.div.internal.parser.ValueValidator;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.G2;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.hov;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class up implements f03, b03, Preference.c, ihz.a, ValueValidator, FunctionWithThrowable, io.reactivex.rxjava3.functions.c, whp, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ up(int i) {
        this.b = i;
    }

    public static String b(int i, String str, StringBuilder sb) {
        sb.append(str.substring(i));
        return sb.toString();
    }

    public static String c(StringBuilder sb, izs izsVar, char c) {
        sb.append(izsVar);
        sb.append(c);
        return sb.toString();
    }

    public static String f(b9y b9yVar, String str) {
        return b9yVar.h().q(str).k();
    }

    @Override // xsna.whp
    public String a() {
        int i = ModalPostDonutFragment.W;
        return "";
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Boolean a;
        switch (this.b) {
            case 14:
                a = G2.a((ActivityManager) obj);
                return a;
            case 26:
                int i = PollResultsFragment.b0;
                return (io.reactivex.rxjava3.core.q) obj;
            case 27:
                return Boolean.FALSE;
            default:
                return ((SearchQueryValueHelper.a) obj).a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AudioDeleteExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AudioDeleteExtendedResponseDto.class).getType())).a();
            case 3:
                return (AuthProcessAuthCodeResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AuthProcessAuthCodeResponseDto.class).getType())).a();
            case 5:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 6:
                return (ChannelsGetOwnersForCreateResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsGetOwnersForCreateResponseDto.class).getType())).a();
            case 15:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 17:
                return (KidsCollectionAddAudioResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, KidsCollectionAddAudioResponseDto.class).getType())).a();
            case 18:
                return (MarketProfileInfoDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketProfileInfoDto.class).getType())).a();
            case 22:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        try {
            Process.killProcess(Process.myPid());
            System.exit(0);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemSendOtpResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetOrderByIdResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
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
            case 10:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 11:
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

    public /* synthetic */ up(Object obj, int i) {
        this.b = i;
    }

    public /* synthetic */ up(by1.a aVar, float f) {
        this.b = 9;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
        return MenuApiApplicationsCache.b((List) obj, new it80(((hov.a) obj2).a));
    }
}
