package xsna;

import android.content.Intent;
import android.widget.HorizontalScrollView;
import android.widget.RatingBar;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.market.dto.MarketGetResponseDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerActionDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerModalDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.channels.impl.post_settings.e;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.photo.Photo;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.sharing.core.view.l;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import xsna.am;
import xsna.dvc0;
import xsna.fmc0;
import xsna.itx;
import xsna.mp90;
import xsna.o880;
import xsna.rxh;
import xsna.se90;
import xsna.vzi0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rj60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rj60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationAction notificationAction;
        ?? r5;
        List<ProfileFriendItem> list;
        int i = this.b;
        int i2 = 5;
        Boolean bool = null;
        bool = null;
        bool = null;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                uj60 uj60Var = (uj60) obj2;
                gzs gzsVar = (gzs) obj;
                uj60Var.f.k.c();
                qz60 qz60Var = (qz60) uj60Var.b.getCurrentState();
                int i4 = qz60Var.c;
                long currentTimeMillis = System.currentTimeMillis();
                NewsfeedList newsfeedList = qz60Var.e;
                String str = newsfeedList != null ? newsfeedList.c : null;
                if (qz60Var.c == 0) {
                    ce60.b.getClass();
                    if (ce60.m() && qz60Var.h.d) {
                        bool = Boolean.valueOf(!qz60Var.b.b.a.isEmpty());
                    }
                }
                break;
            case 1:
                zj70 zj70Var = (zj70) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                Serializer.c<NotificationEntity> cVar = NotificationEntity.CREATOR;
                HashMap hashMap = zj70Var.b;
                HashMap hashMap2 = zj70Var.a;
                String optString = jSONObject.optString("type");
                String optString2 = jSONObject.optString("object_id");
                if (jSONObject.has("action")) {
                    Serializer.c<NotificationAction> cVar2 = NotificationAction.CREATOR;
                    notificationAction = NotificationAction.a.a(jSONObject.optJSONObject("action"), zj70Var);
                } else {
                    notificationAction = null;
                }
                NotificationEntity notificationEntity = new NotificationEntity(optString, optString2, notificationAction, null, null, null, null, null, null);
                boolean Ab = notificationEntity.Ab();
                String str2 = notificationEntity.c;
                if (Ab) {
                    notificationEntity.e = hashMap2 != null ? (UserProfile) hashMap2.get(new UserId(Long.parseLong(str2))) : null;
                } else if (notificationEntity.zb()) {
                    notificationEntity.f = hashMap != null ? (Group) hashMap.get(new UserId(Long.parseLong(str2))) : null;
                } else {
                    String str3 = notificationEntity.b;
                    if ("photo".equals(str3)) {
                        HashMap hashMap3 = zj70Var.c;
                        notificationEntity.g = hashMap3 != null ? (Photo) hashMap3.get(str2) : null;
                    } else if ("video".equals(str3)) {
                        HashMap hashMap4 = zj70Var.d;
                        notificationEntity.h = hashMap4 != null ? (VideoFile) hashMap4.get(str2) : null;
                    } else if ("image".equals(str3)) {
                        Serializer.c<NotificationImage> cVar3 = NotificationImage.CREATOR;
                        notificationEntity.i = NotificationImage.a.a(jSONObject.optJSONArray("image_object"));
                    } else if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equals(str3)) {
                        HashMap hashMap5 = zj70Var.e;
                        notificationEntity.j = hashMap5 != null ? (ApiApplication) hashMap5.get(str2) : null;
                    }
                }
                Photo photo = notificationEntity.g;
                if (photo != null) {
                    UserId userId = photo.f;
                    photo.B = userId != null ? jcr.b(userId, hashMap2, hashMap) : null;
                }
                VideoFile videoFile = notificationEntity.h;
                if (videoFile != null) {
                    UserId I0 = videoFile.I0();
                    UserProfile b = I0 != null ? jcr.b(I0, hashMap2, hashMap) : null;
                    if (b != null) {
                        VideoFile videoFile2 = notificationEntity.h;
                        if (videoFile2 != null) {
                            videoFile2.N8(b.e);
                        }
                        VideoFile videoFile3 = notificationEntity.h;
                        if (videoFile3 != null) {
                            videoFile3.F9(b.h);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((qe70) obj2).o.b(vzi0.a.a);
                break;
            case 3:
                int i5 = fl70.f1;
                ((fl70) obj2).tn();
                break;
            case 4:
                break;
            case 5:
                ((zak0) ((se90) obj2).f).setValue((se90.c) obj);
                break;
            case 6:
                ((bp90) obj2).t.a(mp90.b.a.C3364a.a);
                break;
            case 7:
                qgi0.h((tgi0) obj, (String) obj2);
                break;
            case 8:
                ihb0 ihb0Var = (ihb0) obj2;
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    ihb0Var.f = false;
                }
                ihb0Var.e = list2.size() + ihb0Var.e;
                break;
            case 9:
                ((com.vk.channels.impl.post_settings.f) obj2).O(new e.b((Date) obj));
                break;
            case 10:
                ((wj50) obj2).b(new fmc0.p((PostingUserMessage) obj));
                break;
            case 11:
                Post post = (Post) obj2;
                if (((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i()) {
                    post.uc(false);
                    ce60.b.getClass();
                    p870.f().e(155, post);
                }
                break;
            case 12:
                pvc0 pvc0Var = (pvc0) obj2;
                List<ol60> list3 = ((uvc0) pvc0Var.b.getCurrentState()).b.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (obj3 instanceof z1c0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList4.add(x9v0Var);
                    }
                }
                pvc0Var.c(new dvc0.a(new yo60.i.a(arrayList4)));
                break;
            case 13:
                HorizontalScrollView horizontalScrollView = ((PrimaryActionsView) obj2).f;
                if (horizontalScrollView != null) {
                    horizontalScrollView.fullScroll(66);
                }
                break;
            case 14:
                ssd0 ssd0Var = (ssd0) obj2;
                MarketIntegrationSettingsAdminBannerModalDto marketIntegrationSettingsAdminBannerModalDto = (MarketIntegrationSettingsAdminBannerModalDto) obj;
                String title = marketIntegrationSettingsAdminBannerModalDto.getTitle();
                if (title == null) {
                    title = "";
                }
                String message = marketIntegrationSettingsAdminBannerModalDto.getMessage();
                String str4 = message != null ? message : "";
                List<MarketIntegrationSettingsAdminBannerActionDto> d = marketIntegrationSettingsAdminBannerModalDto.d();
                if (d != null) {
                    List<MarketIntegrationSettingsAdminBannerActionDto> list4 = d;
                    r5 = new ArrayList(c5g.u(list4, 10));
                    for (MarketIntegrationSettingsAdminBannerActionDto marketIntegrationSettingsAdminBannerActionDto : list4) {
                        ssd0Var.getClass();
                        r5.add(ssd0.b(marketIntegrationSettingsAdminBannerActionDto));
                    }
                } else {
                    r5 = EmptyList.b;
                }
                break;
            case 15:
                woe0 woe0Var = (woe0) obj2;
                RatingBar ratingBar = woe0Var.h;
                if (ratingBar == null) {
                    ratingBar = null;
                }
                ((v080) woe0Var.getActivity()).i1(new xw3((int) ratingBar.getRating(), null));
                break;
            case 16:
                ((gig0) obj2).l.a(rxh.b.a);
                break;
            case 17:
                x5h0 x5h0Var = (x5h0) obj2;
                String str5 = x5h0Var.b;
                String str6 = x5h0Var.d;
                long j = x5h0Var.g;
                break;
            case 18:
                ((io.reactivex.rxjava3.core.y) obj2).onSuccess(((SessionRoomParticipants) obj).getParticipants());
                break;
            case 19:
                e3j0 e3j0Var = (e3j0) obj2;
                ArrayList arrayList5 = ((ywd0) obj).a;
                qdc0 qdc0Var = e3j0Var.b;
                VkPaginationList<ProfileFriendItem> vkPaginationList = e3j0Var.l;
                boolean z = (vkPaginationList == null || (list = vkPaginationList.b) == null || !(list.isEmpty() ^ true)) ? false : true;
                if (!z && !arrayList5.isEmpty()) {
                    qdc0Var.Q(PostingVisibilityMode.BEST_FRIENDS);
                } else if (z && arrayList5.isEmpty()) {
                    qdc0Var.Q(PostingVisibilityMode.ALL);
                }
                e3j0Var.l = new VkPaginationList<>(new ArrayList(arrayList5), arrayList5.size(), false, 0, 8, null);
                break;
            case 20:
                l.a aVar = ((com.vk.sharing.core.view.f) obj2).D;
                if (aVar != null) {
                    aVar.o2();
                }
                break;
            case 21:
                bmj0 bmj0Var = (bmj0) obj2;
                break;
            case 22:
                SingleClipV2Holder singleClipV2Holder = (SingleClipV2Holder) obj2;
                int intValue = ((Integer) obj).intValue();
                singleClipV2Holder.H = p880.a(singleClipV2Holder.H, false, intValue, 1);
                singleClipV2Holder.b7(new o880.a(intValue));
                break;
            case 23:
                ldk0 ldk0Var = (ldk0) obj2;
                ListBuilder e = e43.e();
                e.add(itx.b.a);
                Iterator it4 = ((List) obj).iterator();
                while (it4.hasNext()) {
                    e.add(new itx.a((RequestUserProfile) it4.next()));
                }
                ListBuilder g = e.g();
                ldk0Var.h = g;
                break;
            case 24:
                L.i((Throwable) obj);
                ((s3l0) obj2).b.Ij();
                break;
            case 25:
                etj etjVar = ((ncl0) obj2).d;
                etjVar.getClass();
                n2i0.a(etjVar.b, hf8.a, new Intent("com.vkontakte.android.STICKERS_NUM_NEW_ITEMS"));
                break;
            case 26:
                lml0 lml0Var = (lml0) obj2;
                List<MarketMarketItemDto> d2 = ((MarketGetResponseDto) obj).d();
                ArrayList arrayList6 = new ArrayList(c5g.u(d2, 10));
                Iterator it5 = d2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(lml0Var.b((MarketMarketItemDto) it5.next()));
                }
                break;
            case 27:
                azl0 azl0Var = (azl0) obj2;
                dz2 x = yfb.x(zul0.c(azl0Var.m, (List) obj, null, 13));
                String s = o25.a().s(azl0Var.k);
                if (s != null) {
                    x.l = s;
                    x.m = "";
                }
                break;
            case 28:
                int i6 = StoryMediaPickerFragment.d0;
                qgi0.h((tgi0) obj, ((VkTopBar) obj2).getContext().getString(R.string.story_media_picker_accessibility_close));
                break;
            default:
                am amVar = (am) obj;
                amVar.n("android.widget.Button");
                amVar.b(new am.a(16, ((pfm0) obj2).getContext().getString(R.string.story_statistics_action_change_privacy)));
                break;
        }
        return s3q0.a;
    }
}
