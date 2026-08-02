package xsna;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.uploader.api.task.ClipVideoFileUploadTask;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.user.UserProfile;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.SimpleConfigurationStore;
import ru.ok.android.sdk.api.ConfigurationStore;
import ru.ok.gleffects.dto.UserGender;
import xsna.bg7;
import xsna.h1e;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class la2 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ la2(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String W1;
        UserGender userGender;
        String str;
        int i = 0;
        switch (this.b) {
            case 0:
                ((Long) obj).longValue();
                return s3q0.a;
            case 1:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 2:
                return bg7.c.a.c;
            case 3:
                return qjg.a((BookingServicesScreenState.ServiceWrapper) obj);
            case 4:
                return Boolean.valueOf(((it80) obj).a != 0);
            case 5:
                return Boolean.valueOf(((djw0) obj).a);
            case 6:
                L.f("CanCallUseCase", "call attempt submit failed", (Throwable) obj);
                return s3q0.a;
            case 7:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 8:
                return Collections.singletonList((List) obj);
            case 9:
                return new JSONObject(((Cursor) obj).getString(0));
            case 10:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                String a = rq.a(usersUserFullDto, new StringBuilder(), ' ');
                Serializer.c<Image> cVar = Image.CREATOR;
                ImageSize Cb = Image.b.a(usersUserFullDto.r2()).Cb(iah0.a(400), true, false);
                if ((Cb == null || (W1 = Cb.d.d) == null) && (W1 = usersUserFullDto.W1()) == null) {
                    W1 = "http://vkontakte.ru/images/question_c.gif";
                }
                String str2 = W1;
                BaseSexDto L2 = usersUserFullDto.L2();
                int i2 = L2 == null ? -1 : h1e.a.$EnumSwitchMapping$0[L2.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    userGender = UserGender.UNKNOWN;
                } else if (i2 == 2) {
                    userGender = UserGender.MALE;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userGender = UserGender.FEMALE;
                }
                UserGender userGender2 = userGender;
                String i3 = usersUserFullDto.i();
                int f = i3 != null ? UserProfile.f(i3) : -1;
                BaseCityDto G = usersUserFullDto.G();
                if (G == null || (str = G.getTitle()) == null) {
                    str = "";
                }
                return new jkq0(str2, a, str, userGender2, f);
            case 11:
                return s3q0.a;
            case 12:
                return Long.valueOf(((zze.a) obj).c);
            case 13:
                return new LikesGetListExtendedResponseDto(0, EmptyList.b, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
            case 14:
                return io.reactivex.rxjava3.core.q.H(new ClipVideoFileUploadTask.Exception(ClipVideoFileUploadTask.Exception.Type.SHORT_VIDEO_API, (Throwable) obj));
            case 15:
                return Boolean.valueOf(((UploadImageModel) obj).d() == null);
            case 16:
                rry rryVar = (rry) obj;
                while (i < 20) {
                    rry.j(rryVar, null, jli.a, 7);
                    i++;
                }
                return s3q0.a;
            case 17:
                return ((com.vk.voip.ui.sessionrooms.f) obj).a.getId();
            case 18:
                Object obj2 = nbj.a;
                dz dzVar = new dz(17);
                return j5g.D0(new mbj(new lbj(dzVar), dzVar), (List) obj);
            case 19:
                return new SimpleConfigurationStore((ConfigurationStore) obj);
            case 20:
                return ((mla) obj).e.toString();
            case 21:
                ((Integer) obj).getClass();
                return Boolean.FALSE;
            case 22:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_voip_call_video, (Context) obj);
            case 23:
                return air.b('\'', "'", (String) obj);
            case 24:
                return ((u180) obj).b.a(LongPollType.MESSAGES);
            case 25:
                return new n9n(R.layout.stories_discover_empty, (ViewGroup) obj);
            case 26:
                return DzenArticleState.a((DzenArticleState) obj, null, null, null, null, null, false, 111);
            case 27:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 28:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            default:
                int i4 = 14;
                rsg0.Z(yfb.x(new tfx("fave.markSeen", new com.vk.movika.sdk.android.defaultplayer.interactive.c(i4), new gr(i4)))).subscribe(new brq(i), new ez(new dz(27), 21));
                return s3q0.a;
        }
    }
}
