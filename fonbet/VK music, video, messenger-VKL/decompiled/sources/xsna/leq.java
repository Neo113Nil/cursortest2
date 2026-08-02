package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.apps.dto.AppsActionBannerDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetVerificationMethodsResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemVerificationMethodDto;
import com.vk.api.generated.orders.dto.OrdersPersonalDiscountDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SuggestMusicNotificationInfo;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.file_picker.external.e;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.postmodal.reactions.donut.f;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.regionsdrawer.drawer.DrawMode;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.go20;
import xsna.jd50;
import xsna.r170;
import xsna.tj50;
import xsna.tlo0;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class leq implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ leq(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer k;
        Integer l;
        Integer j;
        Integer i;
        VideoFile videoFile;
        VerificationMethodTypes verificationMethodTypes;
        Integer num = null;
        EmptyList emptyList = null;
        num = null;
        switch (this.b) {
            case 0:
                return new e.b(((tj50.a) obj).a(meq.b, ao8.d));
            case 1:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 103) {
                        num = Integer.valueOf(R.string.fave_limit_tag_error);
                    }
                    if (num != null) {
                        enj.q(num.intValue(), 0, vx2.d.getContext());
                    } else {
                        h03.b(th);
                    }
                }
                return s3q0.a;
            case 2:
                AvatarAnimatedStack avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                tlo0.Companion.getClass();
                avatarAnimatedStack.setText(new tlo0.h("Нравится Ивану и ещё 5 людям"));
                avatarAnimatedStack.a(null, Collections.singletonList("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0"));
                return avatarAnimatedStack;
            case 3:
                return Boolean.valueOf(((Throwable) obj) instanceof TimeoutException);
            case 4:
                return new ahk0(new View(((ViewGroup) obj).getContext()));
            case 5:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.Y((List) obj);
                UserId s1 = usersUserFullDto.s1();
                boolean B = x19.B(usersUserFullDto);
                StringBuilder sb = new StringBuilder();
                String D0 = usersUserFullDto.D0();
                if (D0 == null) {
                    D0 = "";
                }
                sb.append(D0);
                sb.append(' ');
                String x1 = usersUserFullDto.x1();
                sb.append(x1 != null ? x1 : "");
                String obj2 = drm0.p0(sb.toString()).toString();
                UsersUserCountersDto R = usersUserFullDto.R();
                int intValue = (R == null || (i = R.i()) == null) ? 0 : i.intValue();
                UsersUserCountersDto R2 = usersUserFullDto.R();
                int intValue2 = (R2 == null || (j = R2.j()) == null) ? 0 : j.intValue();
                UsersUserCountersDto R3 = usersUserFullDto.R();
                int intValue3 = (R3 == null || (l = R3.l()) == null) ? 0 : l.intValue();
                UsersUserCountersDto R4 = usersUserFullDto.R();
                if (R4 != null && (k = R4.k()) != null) {
                    r5 = k.intValue();
                }
                return cls.a(s1, B, obj2, intValue, intValue2, intValue3, r5);
            case 6:
                OrdersPersonalDiscountDto ordersPersonalDiscountDto = (OrdersPersonalDiscountDto) obj;
                int e = ordersPersonalDiscountDto.e();
                AppsActionBannerDto d = ordersPersonalDiscountDto.d();
                l1a0 a = d != null ? m1a0.a(d) : null;
                Integer f = ordersPersonalDiscountDto.f();
                r5 = f != null ? f.intValue() : 0;
                UsersUserFullDto g = ordersPersonalDiscountDto.g();
                return new q1a0(e, a, r5, g != null ? new h1r0(new ikw()).a(g) : null);
            case 7:
                Attach attach = (Attach) obj;
                AttachVideo attachVideo = attach instanceof AttachVideo ? (AttachVideo) attach : null;
                if (attachVideo == null || (videoFile = attachVideo.b) == null) {
                    return null;
                }
                return videoFile.a1();
            case 8:
                L.e("Profile successfully added to recents");
                return s3q0.a;
            case 9:
                return DrawMode.OFFSCREEN_BITMAP;
            case 10:
                List list = (List) obj;
                bn40.f("HSNMan", "get notification info from CACHE list =", list);
                bzu bzuVar = bzu.b;
                SuggestMusicNotificationInfo suggestMusicNotificationInfo = (SuggestMusicNotificationInfo) j5g.a0(e43.r(list));
                if (suggestMusicNotificationInfo == null) {
                    suggestMusicNotificationInfo = (SuggestMusicNotificationInfo) bzu.m.getValue();
                }
                bzu.f(suggestMusicNotificationInfo);
                return s3q0.a;
            case 11:
                int i2 = ImSettingsDialogThemeFragment.c0;
                return io.reactivex.rxjava3.core.a.k(((epo0) obj).a);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 13:
                return s3q0.a;
            case 14:
                List<EcosystemVerificationMethodDto> d2 = ((EcosystemGetVerificationMethodsResponseDto) obj).d();
                if (d2 != null) {
                    List<EcosystemVerificationMethodDto> list2 = d2;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (EcosystemVerificationMethodDto ecosystemVerificationMethodDto : list2) {
                        VerificationMethodTypes.a aVar = VerificationMethodTypes.Companion;
                        String f2 = ecosystemVerificationMethodDto.f();
                        aVar.getClass();
                        if (f2 != null) {
                            for (VerificationMethodTypes verificationMethodTypes2 : VerificationMethodTypes.values()) {
                                if (epx.f(verificationMethodTypes2.i(), f2)) {
                                    verificationMethodTypes = verificationMethodTypes2;
                                    Integer i3 = ecosystemVerificationMethodDto.i();
                                    int intValue4 = i3 == null ? i3.intValue() : 0;
                                    Integer g2 = ecosystemVerificationMethodDto.g();
                                    int intValue5 = g2 == null ? g2.intValue() : 0;
                                    String e2 = ecosystemVerificationMethodDto.e();
                                    String str = e2 != null ? "" : e2;
                                    Boolean d3 = ecosystemVerificationMethodDto.d();
                                    arrayList.add(new cyo(verificationMethodTypes, intValue4, intValue5, str, d3 == null ? d3.booleanValue() : false));
                                }
                            }
                        }
                        verificationMethodTypes = null;
                        Integer i32 = ecosystemVerificationMethodDto.i();
                        if (i32 == null) {
                        }
                        Integer g22 = ecosystemVerificationMethodDto.g();
                        if (g22 == null) {
                        }
                        String e22 = ecosystemVerificationMethodDto.e();
                        if (e22 != null) {
                        }
                        Boolean d32 = ecosystemVerificationMethodDto.d();
                        arrayList.add(new cyo(verificationMethodTypes, intValue4, intValue5, str, d32 == null ? d32.booleanValue() : false));
                    }
                    emptyList = arrayList;
                }
                if (emptyList == null) {
                    emptyList = EmptyList.b;
                }
                return new gxo(emptyList);
            case 15:
                ((zak0) go20.m).setValue((go20.g) obj);
                return s3q0.a;
            case 16:
                tj50.a aVar2 = (tj50.a) obj;
                c130 c130Var = c130.b;
                ao8 ao8Var = ao8.d;
                return new f.a(aVar2.a(c130Var, ao8Var), aVar2.a(d130.b, ao8Var), aVar2.a(e130.b, ao8Var));
            case 17:
                return s3q0.a;
            case 18:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 19:
                DownloadingState downloadingState = ((n8b0) obj).a.H;
                return Boolean.valueOf(((downloadingState instanceof DownloadingState.Downloading) || (downloadingState instanceof DownloadingState.PendingDownload)) ? false : true);
            case 20:
                tj50.a aVar3 = (tj50.a) obj;
                j0r j0rVar = new j0r(14);
                ao8 ao8Var2 = ao8.d;
                return new jd50.b(aVar3.a(j0rVar, ao8Var2), aVar3.a(new p7x(9), ao8Var2), aVar3.a(new c3v(7), ao8Var2));
            case 21:
                m5z m5zVar = ((r170.a) obj).a;
                if (m5zVar != null) {
                    m5zVar.invoke();
                }
                return s3q0.a;
            case 22:
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 23:
                dc70 dc70Var = (dc70) obj;
                return new yb70.g(dc70Var.e, dc70Var.f, dc70Var.g);
            case 24:
                L.g("Can't handle search request by fave pages", (Throwable) obj);
                return s3q0.a;
            case 25:
                return ((pno0) obj).d().toString();
            case 26:
                return af10.a((TagsGetListResponseDto) obj);
            case 27:
                return ((PostingState.Editing) obj).i.i;
            case 28:
                Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                return ProfileFriendItem.a.a((JSONObject) obj);
            default:
                List<kei0> list3 = ((otd0) obj).g;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new lei0((kei0) it.next()));
                }
                return arrayList2;
        }
    }
}
