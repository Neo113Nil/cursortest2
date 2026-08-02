package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.apps.dto.AppsJoinAndGetResponseDto;
import com.vk.api.generated.apps.dto.AppsMemberAllowedScopeItemDto;
import com.vk.api.generated.audio.dto.AudioStandaloneMigrationStateResponseDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.auth.dto.AuthValidateEmailResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsMessagesConversationCardConfigDto;
import com.vk.api.generated.market.dto.MarketGetCountersResponseDto;
import com.vk.api.generated.messages.dto.MessagesCreateFolderResponseDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationMembersResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingsSectionResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wr implements b03, f03, io.reactivex.rxjava3.functions.l, xw8, io.reactivex.rxjava3.functions.m, Preference.b, ihz.a, ValueValidator, plp0, h9l {
    public final /* synthetic */ int b;

    public /* synthetic */ wr(int i) {
        this.b = i;
    }

    public static StringBuilder a(Integer num, String str, Integer num2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(num2);
        sb.append(str3);
        return sb;
    }

    public static void c(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        com.vkontakte.android.data.b.h().o = ((Boolean) obj).booleanValue();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return (t480) ((sxp) obj);
            case 17:
                return i7d.a((h7d) obj);
            default:
                return ((com.google.firebase.perf.v1.g) obj).toByteArray();
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountInfoDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountInfoDto.class).getType())).a();
            case 1:
                return (AppsJoinAndGetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsJoinAndGetResponseDto.class).getType())).a();
            case 5:
                return (AudioStandaloneMigrationStateResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioStandaloneMigrationStateResponseDto.class).getType())).a();
            case 9:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 11:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 19:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, GiftsMessagesConversationCardConfigDto.class).getType()).getType())).a();
            case 20:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (MessagesCreateFolderResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesCreateFolderResponseDto.class).getType())).a();
            case 28:
                return (NewsfeedGenericResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedGenericResponseDto.class).getType())).a();
            default:
                return (NotificationsEditRedesignSettingsSectionResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsEditRedesignSettingsSectionResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AppsMemberAllowedScopeItemDto.class).getType()).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioBooksBoolResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthValidateEmailResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCountersResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesSearchConversationMembersResponseDto.class).getType());
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
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            default:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // xsna.xw8
    public String k(evk evkVar) {
        String str = evkVar.i;
        return str == null ? evkVar.a.toString() : str;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new qmr();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ wr(Object obj, int i) {
        this.b = i;
    }

    public /* synthetic */ wr(by1.a aVar, nc4 nc4Var) {
        this.b = 13;
    }

    public /* synthetic */ wr(boolean z) {
        this.b = 0;
    }
}
