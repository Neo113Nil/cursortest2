package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.gson.Gson;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersPacksRecommendationBlockDto;
import com.vk.api.generated.vmoji.dto.VmojiGetStickerPacksRecommendationBlocksResponseDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.rating.VkRatingBarSkeleton;
import com.vk.dto.common.Attachment;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.Subscription;
import com.vk.log.L;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.voip.ui.asr.ui.list.a;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.thy;
import xsna.wit0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class av70 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ av70(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoNotificationsStatus videoNotificationsStatus;
        Subscription.Subscribed.Notifications notifications;
        GroupsGroupFullDto groupsGroupFullDto;
        GroupsGroupFullDto groupsGroupFullDto2;
        List<StickersPackPreviewDto> e;
        StickersPackPreviewDto stickersPackPreviewDto;
        Object obj2;
        r3 = false;
        boolean z = false;
        r3 = false;
        boolean z2 = false;
        r5 = null;
        r5 = null;
        r5 = null;
        ArrayList arrayList = null;
        r5 = null;
        GroupsGroupFullDto.VideoNotificationsStatusDto videoNotificationsStatusDto = null;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "podcastEpisodeProgressTime");
                return s3q0.a;
            case 1:
                return a.c.a;
            case 2:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `polls`.`id` AS `id`, `polls`.`triggers` AS `triggers`, `polls`.`initialHeight` AS `initialHeight`, `polls`.`status` AS `status`, `polls`.`metadata` AS `metadata` FROM polls");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.step()) {
                        int i = (int) V0.getLong(0);
                        String l2 = V0.l2(1);
                        bpn0 bpn0Var = ssj.a;
                        arrayList2.add(new ypb0(i, V0.isNull(2) ? null : Integer.valueOf((int) V0.getLong(2)), V0.isNull(3) ? null : V0.l2(3), V0.isNull(4) ? null : V0.l2(4), (List) ((Gson) ssj.a.getValue()).fromJson(l2, new msj().getType())));
                    }
                    return arrayList2;
                } finally {
                    V0.close();
                }
            case 3:
                return ((usb0) obj).c;
            case 4:
                qr.d(ce60.b, 101, (NewsEntry) obj);
                return s3q0.a;
            case 5:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList3 = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList3.add(resolveInfo);
                }
                return arrayList3;
            case 6:
                qgi0.r((tgi0) obj, "product_preview_market_header_title");
                return s3q0.a;
            case 7:
                int i3 = ProfileMainPhotosFragment.F0;
                qgi0.r((tgi0) obj, "profile_main_photos_top_bar_add");
                return s3q0.a;
            case 8:
                thy.b bVar = (thy.b) obj;
                bVar.a = 1332;
                bVar.a(666, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).b = x2e0.d;
                bVar.a(bVar.a, Float.valueOf(290.0f));
                return s3q0.a;
            case 9:
                Float f = (Float) obj;
                f.getClass();
                return new kge0(new if2(f, rte0.e, null, 12));
            case 10:
                return new VkRatingBarSkeleton((Context) obj, null, 6);
            case 11:
                return (io.reactivex.rxjava3.core.q) obj;
            case 12:
                return new pdo0(((Integer) obj).intValue());
            case 13:
                ArrayList<UIBlock> arrayList4 = ((UIBlockList) obj).y;
                if (arrayList4 == null || !arrayList4.isEmpty()) {
                    Iterator<T> it = arrayList4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((UIBlock) it.next()).e == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS) {
                                z2 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 14:
                L.i((Throwable) obj);
                return s3q0.a;
            case 15:
                hfz hfzVar = (hfz) obj;
                dhy dhyVar = hfzVar instanceof dhy ? (dhy) hfzVar : null;
                if (dhyVar != null && dhyVar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                return s3q0.a;
            case 17:
                return ca3.b((Attachment) obj);
            case 18:
                int i4 = StreamInfoFragment.S;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 19:
                int i5 = SuperAppFragment.o0;
                qgi0.r((tgi0) obj, "SuperAppHeaderTitle");
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "template_actions");
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return gdp.a((CharSequence) obj);
            case 23:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).x;
            case 24:
                GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) obj;
                List<GroupsGroupFullDto> d = groupsGetByIdObjectResponseDto.d();
                Object[] objArr = ((d == null || (groupsGroupFullDto2 = (GroupsGroupFullDto) j5g.a0(d)) == null) ? null : groupsGroupFullDto2.I3()) == BaseBoolIntDto.YES ? 1 : null;
                List<GroupsGroupFullDto> d2 = groupsGetByIdObjectResponseDto.d();
                if (d2 != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d2)) != null) {
                    videoNotificationsStatusDto = groupsGroupFullDto.W2();
                }
                int i6 = videoNotificationsStatusDto == null ? -1 : wit0.a.$EnumSwitchMapping$1[videoNotificationsStatusDto.ordinal()];
                if (i6 == -1) {
                    videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                } else if (i6 == 1) {
                    videoNotificationsStatus = VideoNotificationsStatus.NONE;
                } else if (i6 == 2) {
                    videoNotificationsStatus = VideoNotificationsStatus.ALL;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                }
                if (objArr == null) {
                    return Subscription.a.a;
                }
                int i7 = wit0.a.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()];
                if (i7 == 1) {
                    notifications = Subscription.Subscribed.Notifications.All;
                } else if (i7 == 2) {
                    notifications = Subscription.Subscribed.Notifications.Preferred;
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    notifications = Subscription.Subscribed.Notifications.None;
                }
                return new Subscription.Subscribed(notifications);
            case 25:
                return s3q0.a;
            case 26:
                return g5g.E((List) obj, Card.class);
            case 27:
                return null;
            case 28:
                VmojiGetStickerPacksRecommendationBlocksResponseDto vmojiGetStickerPacksRecommendationBlocksResponseDto = (VmojiGetStickerPacksRecommendationBlocksResponseDto) obj;
                Serializer.c<RecommendationsBlockModel> cVar = RecommendationsBlockModel.CREATOR;
                if (!vmojiGetStickerPacksRecommendationBlocksResponseDto.d().isEmpty() && (e = vmojiGetStickerPacksRecommendationBlocksResponseDto.e()) != null && !e.isEmpty()) {
                    List<StickersPacksRecommendationBlockDto> d3 = vmojiGetStickerPacksRecommendationBlocksResponseDto.d();
                    ArrayList arrayList5 = new ArrayList(c5g.u(d3, 10));
                    for (StickersPacksRecommendationBlockDto stickersPacksRecommendationBlockDto : d3) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator<T> it2 = stickersPacksRecommendationBlockDto.e().iterator();
                        while (it2.hasNext()) {
                            int intValue = ((Number) it2.next()).intValue();
                            List<StickersPackPreviewDto> e2 = vmojiGetStickerPacksRecommendationBlocksResponseDto.e();
                            if (e2 != null) {
                                Iterator<T> it3 = e2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = it3.next();
                                        if (((StickersPackPreviewDto) obj2).getId() == intValue) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                stickersPackPreviewDto = (StickersPackPreviewDto) obj2;
                            } else {
                                stickersPackPreviewDto = null;
                            }
                            if (stickersPackPreviewDto != null) {
                                Serializer.c<VmojiStickerPackPreviewModel> cVar2 = VmojiStickerPackPreviewModel.CREATOR;
                                arrayList6.add(VmojiStickerPackPreviewModel.a.a(stickersPackPreviewDto));
                            }
                        }
                        arrayList5.add(new RecommendationsBlockModel(stickersPacksRecommendationBlockDto.getId(), stickersPacksRecommendationBlockDto.getTitle(), stickersPacksRecommendationBlockDto.getType(), stickersPacksRecommendationBlockDto.d(), arrayList6));
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        if (!((RecommendationsBlockModel) next).f.isEmpty()) {
                            arrayList7.add(next);
                        }
                    }
                    if (!arrayList7.isEmpty()) {
                        arrayList = arrayList7;
                    }
                }
                return arrayList == null ? EmptyList.b : arrayList;
            default:
                return s3q0.a;
        }
    }
}
