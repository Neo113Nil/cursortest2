package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.api.generated.apps.dto.AppsVkAppsSectionDto;
import com.vk.api.generated.audio.dto.AudioGetAutoflowMixParamsResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionProfileDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRemoveAudiosResponseDto;
import com.vk.api.generated.messages.dto.MessagesSetConfigResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetUserPhotosResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetStaffResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetStatsTokenResponseDto;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.reporters.performance.events.LogType;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import okhttp3.p;
import ru.ok.face.entity.FaceFigure;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.v50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j8 implements io.reactivex.rxjava3.functions.l, f03, b03, io.reactivex.rxjava3.functions.m, ValueValidator, Function, ujo0, com.vk.im.engine.reporters.syncstate.d {
    public final /* synthetic */ int b;

    public /* synthetic */ j8(int i) {
        this.b = i;
    }

    public static String b(StringBuilder sb, fi50 fi50Var, char c) {
        sb.append(fi50Var);
        sb.append(c);
        return sb.toString();
    }

    public static lg90 c(qzu0 qzu0Var, androidx.compose.runtime.a aVar) {
        qzu0Var.getClass();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-585129644, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MoonOutline28> (VkIcons.kt:7760)");
        }
        lg90 b = or.b(aVar, 1675201554, R.drawable.vk_icon_moon_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b;
    }

    public static boolean d(Context context) {
        return g620.f().k0().a(context);
    }

    @Override // xsna.ujo0
    public void a(Object obj, String str, String str2) {
        ((p.a) obj).c.h(str, str2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Detection detection;
        ArrayList arrayList;
        switch (this.b) {
            case 0:
                return ((VideoListWithTotalCount) obj).b;
            case 2:
                return v50.b.a;
            case 9:
                return ((qvc) obj).b;
            case 11:
                detection = ((FaceFigure) obj).detection;
                return detection;
            case 17:
                List<FriendsGetBirthdaysSectionDto> d = ((FriendsGetBirthdaysResponseDto) obj).d();
                ArrayList arrayList2 = null;
                if (d != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it = d.iterator();
                    while (it.hasNext()) {
                        List<FriendsGetBirthdaysSectionProfileDto> d2 = ((FriendsGetBirthdaysSectionDto) it.next()).d();
                        if (d2 != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it2 = d2.iterator();
                            while (it2.hasNext()) {
                                UsersUserFullDto f = ((FriendsGetBirthdaysSectionProfileDto) it2.next()).f();
                                if (f != null) {
                                    arrayList.add(f);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList3.add(arrayList);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                return arrayList2 != null ? c5g.v(arrayList2) : EmptyList.b;
            case 20:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            default:
                return ((VideoGetStatsTokenResponseDto) obj).d();
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 4:
                return (AudioGetAutoflowMixParamsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AudioGetAutoflowMixParamsResponseDto.class).getType())).a();
            case 7:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 12:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 14:
                return (KidsCollectionRemoveAudiosResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, KidsCollectionRemoveAudiosResponseDto.class).getType())).a();
            case 19:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 23:
                return (PhotosGetUserPhotosResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosGetUserPhotosResponseDto.class).getType())).a();
            case 24:
                return (ServiceBookingGetStaffResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingGetStaffResponseDto.class).getType())).a();
            case 25:
                return (BaseOkResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    public void f(int i, Set set, ImBgSyncState imBgSyncState, ImSyncStateStatReporter.Target target) {
        new r3w0(LogType.SYNC_STATE_STAT, null, target.toString(), imBgSyncState.toString(), j5g.g0(set, null, null, null, 0, new u620(23), 31), null, null, Integer.valueOf(i), null, null, null, 16226).q();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetModelsResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AppsVkAppsSectionDto.class).getType()).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesSetConfigResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetV5113ResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ j8(Object obj, int i) {
        this.b = i;
    }
}
