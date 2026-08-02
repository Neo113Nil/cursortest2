package xsna;

import android.app.Activity;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.market.dto.MarketAddAlbumResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCommunityReviewResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetActivitiesResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetActivitiesResponseItemDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallPostActivityLikesLikesDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.feature.music.holders.MusicFollowCuratorButtonVh;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivitiesTarget;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivity;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.clips.uploader.api.model.ClipUploadStatus;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Curator;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.core.database.models.AutoDownloadType;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkclient.js.bridge.api.events.GetGroupInfo$Parameters;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import xsna.e8v0;
import xsna.g7b0;
import xsna.gm50;
import xsna.h120;
import xsna.htp;
import xsna.nsh0;
import xsna.nwb;
import xsna.owb;
import xsna.px9;
import xsna.t0a;
import xsna.x7a;
import xsna.xt0;
import xsna.zcv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class du0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ du0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        List<WallWallCommentDto> d;
        Parcelable comments;
        String str;
        SdkClipActivity.Comments.Comment comment;
        WallPostActivityLikesLikesDto d2;
        List<UserId> f;
        SdkClipActivity.Likes.Like like;
        uih0 uih0Var = (uih0) this.c;
        String str2 = (String) this.d;
        NewsfeedGetActivitiesResponseDto newsfeedGetActivitiesResponseDto = (NewsfeedGetActivitiesResponseDto) obj;
        cgd cgdVar = uih0Var.b;
        LinkedHashMap a = b590.a(cgdVar.b, newsfeedGetActivitiesResponseDto.e(), null, null, 14);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (NewsfeedGetActivitiesResponseItemDto newsfeedGetActivitiesResponseItemDto : newsfeedGetActivitiesResponseDto.d()) {
            SdkClipActivitiesTarget sdkClipActivitiesTarget = new SdkClipActivitiesTarget(newsfeedGetActivitiesResponseItemDto.q(), newsfeedGetActivitiesResponseItemDto.getId());
            yof yofVar = cgdVar.a;
            WallPostActivityDto d3 = newsfeedGetActivitiesResponseItemDto.d();
            if (d3 instanceof WallPostActivityDto.WallPostActivityLikesDto) {
                if (yofVar.Q() && (d2 = ((WallPostActivityDto.WallPostActivityLikesDto) d3).d()) != null && (f = d2.f()) != null) {
                    if (f.isEmpty()) {
                        f = null;
                    }
                    if (f != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = f.iterator();
                        while (it.hasNext()) {
                            Owner owner = (Owner) a.get((UserId) it.next());
                            if (owner != null) {
                                arrayList.add(owner);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Owner owner2 = (Owner) it2.next();
                            String str3 = owner2.d;
                            if (str3 == null) {
                                like = null;
                            } else {
                                SdkClipActivity.OwnerSex.a aVar = SdkClipActivity.OwnerSex.Companion;
                                int h = owner2.l.h();
                                aVar.getClass();
                                like = new SdkClipActivity.Likes.Like(owner2.b, str3, owner2.c, (h < 0 || h >= SdkClipActivity.OwnerSex.h().size()) ? SdkClipActivity.OwnerSex.UNKNOWN : (SdkClipActivity.OwnerSex) SdkClipActivity.OwnerSex.h().get(h), str2);
                            }
                            if (like != null) {
                                arrayList2.add(like);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            comments = new SdkClipActivity.Likes(arrayList2);
                        }
                    }
                }
                comments = null;
            } else {
                if (d3 instanceof WallPostActivityDto.WallPostActivityReplyDto) {
                    if (yofVar.Z() && (d = ((WallPostActivityDto.WallPostActivityReplyDto) d3).d()) != null) {
                        if (d.isEmpty()) {
                            d = null;
                        }
                        if (d != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (WallWallCommentDto wallWallCommentDto : d) {
                                Owner owner3 = (Owner) a.get(wallWallCommentDto.k());
                                if (owner3 != null && (str = owner3.d) != null) {
                                    String C = wallWallCommentDto.C();
                                    String str4 = C.length() > 0 ? C : null;
                                    if (str4 != null) {
                                        comment = new SdkClipActivity.Comments.Comment(wallWallCommentDto.getId(), wallWallCommentDto.u(), owner3.b, str4, str);
                                        if (comment == null) {
                                            arrayList3.add(comment);
                                        }
                                    }
                                }
                                comment = null;
                                if (comment == null) {
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                comments = new SdkClipActivity.Comments(arrayList3);
                            }
                        }
                    }
                } else if (!(d3 instanceof WallPostActivityDto.WallPostActivityReplyInputDto) && !(d3 instanceof WallPostActivityDto.WallPostActivityBottomExtensionDto) && !(d3 instanceof WallPostActivityDto.WallPostActivityClassifiedsBottomExtensionDto) && !(d3 instanceof WallPostActivityDto.WallPostActivityClassifiedsDetectedDto) && !(d3 instanceof WallPostActivityDto.WallPostActivityEventDto) && !(d3 instanceof WallPostActivityDto.WallPostActivityShareToStoryDto)) {
                    throw new NoWhenBranchMatchedException();
                }
                comments = null;
            }
            if (comments != null) {
                List list = (List) linkedHashMap.get(sdkClipActivitiesTarget);
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(sdkClipActivitiesTarget, list);
                }
                list.add(comments);
            }
        }
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(entry.getKey(), new SdkClipActivities((SdkClipActivitiesTarget) entry.getKey(), (List) entry.getValue()));
            linkedHashMap2.put(pair.i(), pair.j());
        }
        return linkedHashMap2;
    }

    private final Object c(Object obj) {
        Object obj2;
        int i;
        l7l0 l7l0Var = (l7l0) this.c;
        StickerStockItem stickerStockItem = (StickerStockItem) this.d;
        ArrayList arrayList = l7l0Var.f;
        h7l0 h7l0Var = l7l0Var.c;
        kcl0 kcl0Var = (kcl0) h7l0Var.a;
        arrayList.clear();
        List list = (List) obj;
        int i2 = 24;
        int i3 = 0;
        List<StickerStockItem> D0 = j5g.D0(jw5.a(new p7x(i2), new c3v(i2)), list);
        ArrayList arrayList2 = new ArrayList(c5g.u(D0, 10));
        for (StickerStockItem stickerStockItem2 : D0) {
            arrayList2.add(new qai0(stickerStockItem2, stickerStockItem2.k, kcl0Var.j(stickerStockItem2)));
        }
        arrayList.addAll(arrayList2);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((StickerStockItem) obj2).k) {
                break;
            }
        }
        StickerStockItem stickerStockItem3 = (StickerStockItem) obj2;
        if (stickerStockItem3 != null) {
            StickerStockItem stickerStockItem4 = l7l0Var.d;
            if (stickerStockItem4 == null) {
                stickerStockItem4 = null;
            }
            if (!stickerStockItem3.equals(stickerStockItem4)) {
                StickerStockItem I = kcl0Var.I(stickerStockItem3.b);
                if (I != null) {
                    ((kcl0) ((d80) h7l0Var.b).b).V0(I, true, new c80(i3));
                }
                l7l0Var.d = stickerStockItem3;
            }
        }
        int x = l7l0.x(arrayList);
        o7l0 o7l0Var = l7l0Var.b;
        StickerStockItem stickerStockItem5 = l7l0Var.d;
        if (stickerStockItem5 == null) {
            stickerStockItem5 = null;
        }
        PackStylesListHolder.State state = PackStylesListHolder.State.DATA;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((qai0) it2.next()).b && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        int i4 = -1;
        if (i == 1) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((qai0) it3.next()).b) {
                    i4 = i3;
                    break;
                }
                i3++;
            }
            if (i4 >= x) {
                i4++;
            }
        }
        o7l0Var.c(stickerStockItem5, stickerStockItem, arrayList, state, x, i4);
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0501  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        wf5 wf5Var;
        boolean z;
        DownloadingState downloadingState;
        AutoDownloadType a;
        int i;
        Long valueOf;
        Long valueOf2;
        d040 o;
        VideoFile videoFile;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        int i2 = 6;
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        Integer num = null;
        switch (this.b) {
            case 0:
                hu0 hu0Var = (hu0) this.c;
                xt0.a aVar = (xt0.a) this.d;
                bpn0 bpn0Var = hu0Var.c;
                List list = (List) ((ConcurrentHashMap) bpn0Var.getValue()).get(aVar.c);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(aVar.a);
                ((ConcurrentHashMap) bpn0Var.getValue()).put(aVar.c, list);
                return s3q0.a;
            case 1:
                c23 c23Var = (c23) this.c;
                fc3 fc3Var = (fc3) this.d;
                c23Var.c(((x7a.d.e) fc3Var.getItem()).e, ((x7a.d.e) fc3Var.getItem()).d, null);
                return s3q0.a;
            case 2:
                String str = (String) this.c;
                String str2 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM auto_download_track WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "mid");
                    int k4 = egi.k(V0, "access_key");
                    int k5 = egi.k(V0, "track_code");
                    int k6 = egi.k(V0, "downloading_state");
                    int k7 = egi.k(V0, "title");
                    int k8 = egi.k(V0, "subtitle");
                    int k9 = egi.k(V0, "artist_name_fallback");
                    int k10 = egi.k(V0, "main_artists");
                    int k11 = egi.k(V0, "featured_artists");
                    int k12 = egi.k(V0, "thumb");
                    int k13 = egi.k(V0, X3.a.k);
                    int k14 = egi.k(V0, "url");
                    int k15 = egi.k(V0, "manifest_url");
                    int k16 = egi.k(V0, "duration");
                    int k17 = egi.k(V0, "date");
                    int k18 = egi.k(V0, "is_explicit");
                    int k19 = egi.k(V0, "lyrics_id");
                    int k20 = egi.k(V0, "is_focus_track");
                    int k21 = egi.k(V0, "main_color");
                    int k22 = egi.k(V0, "content_restriction");
                    int k23 = egi.k(V0, "size_in_bytes");
                    int k24 = egi.k(V0, "auto_download_date");
                    int k25 = egi.k(V0, "initial_auto_download_date");
                    int k26 = egi.k(V0, "auto_download_type");
                    int k27 = egi.k(V0, "json_raw");
                    if (V0.step()) {
                        long j = V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        String l2 = V0.l2(k3);
                        String l22 = V0.isNull(k4) ? null : V0.l2(k4);
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        int i6 = (int) V0.getLong(k6);
                        if (i6 != 0) {
                            z = true;
                            if (i6 == 1) {
                                downloadingState = DownloadingState.Downloaded.b;
                            } else if (i6 == 2) {
                                downloadingState = DownloadingState.PendingDownload.b;
                            } else if (i6 == 3) {
                                downloadingState = DownloadingState.PartlyDownloaded.b;
                            } else {
                                if (i6 != 4) {
                                    throw new IllegalStateException("Incorrect download state value");
                                }
                                downloadingState = DownloadingState.Corrupted.b;
                            }
                        } else {
                            z = true;
                            downloadingState = DownloadingState.NotLoaded.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        String l24 = V0.isNull(k7) ? null : V0.l2(k7);
                        String l25 = V0.isNull(k8) ? null : V0.l2(k8);
                        String l26 = V0.isNull(k9) ? null : V0.l2(k9);
                        ArrayList a2 = sgn0.a(V0.isNull(k10) ? null : V0.l2(k10));
                        ArrayList a3 = sgn0.a(V0.isNull(k11) ? null : V0.l2(k11));
                        String l27 = V0.isNull(k12) ? null : V0.l2(k12);
                        Thumb e = l27 == null ? null : i7o0.e(l27);
                        MusicOfflineCacheStorage a4 = uh.a(V0.isNull(k13) ? null : V0.l2(k13));
                        String l28 = V0.isNull(k14) ? null : V0.l2(k14);
                        String l29 = V0.isNull(k15) ? null : V0.l2(k15);
                        Long valueOf3 = V0.isNull(k16) ? null : Long.valueOf(V0.getLong(k16));
                        Long valueOf4 = V0.isNull(k17) ? null : Long.valueOf(V0.getLong(k17));
                        boolean z2 = ((int) V0.getLong(k18)) != 0 ? z : false;
                        Integer valueOf5 = V0.isNull(k19) ? null : Integer.valueOf((int) V0.getLong(k19));
                        Integer valueOf6 = V0.isNull(k20) ? null : Integer.valueOf((int) V0.getLong(k20));
                        Boolean valueOf7 = valueOf6 != null ? Boolean.valueOf(valueOf6.intValue() != 0 ? z : false) : null;
                        String l210 = V0.isNull(k21) ? null : V0.l2(k21);
                        int i7 = (int) V0.getLong(k22);
                        Long valueOf8 = V0.isNull(k23) ? null : Long.valueOf(V0.getLong(k23));
                        Long valueOf9 = V0.isNull(k24) ? null : Long.valueOf(V0.getLong(k24));
                        Long valueOf10 = V0.isNull(k25) ? null : Long.valueOf(V0.getLong(k25));
                        Integer valueOf11 = V0.isNull(k26) ? null : Integer.valueOf((int) V0.getLong(k26));
                        if (valueOf11 == null) {
                            a = null;
                        } else {
                            int intValue = valueOf11.intValue();
                            AutoDownloadType.Companion.getClass();
                            a = AutoDownloadType.a.a(intValue);
                        }
                        wf5Var = new wf5(j, b, l2, l22, l23, downloadingState2, l24, l25, l26, a2, a3, e, a4, l28, l29, valueOf3, valueOf4, z2, valueOf5, valueOf7, l210, i7, valueOf8, valueOf9, valueOf10, a, V0.l2(k27));
                    } else {
                        wf5Var = null;
                    }
                    V0.close();
                    return wf5Var;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 3:
                s1d s1dVar = (s1d) this.c;
                String str3 = (String) this.d;
                kih0 j2 = ((pi5) obj).j();
                if (j2 != null) {
                    VideoTextureViewAdapter.a.a(s1dVar.o.getVideoTextureViewAdapter(), j2, str3, s1dVar, null, null, 24);
                }
                return s3q0.a;
            case 4:
                ((vw9) this.c).T(new px9.g.b((UserId) this.d, (List) obj));
                return s3q0.a;
            case 5:
                laa laaVar = (laa) this.c;
                String str4 = (String) this.d;
                List<Playlist> list2 = (List) obj;
                ld20 ld20Var = laaVar.s;
                nt70 nt70Var = new nt70((String) ld20Var.b);
                nt70Var.d = true;
                nt70Var.m = list2;
                List singletonList = Collections.singletonList(new CatalogReplacement(Collections.singletonList(((laa) ((defpackage.h) ld20Var.c).c).h), lu70.c(nt70Var.a(str4))));
                List<Playlist> list3 = list2;
                HashMap hashMap = new HashMap(list3.size());
                for (Playlist playlist : list3) {
                    hashMap.put(playlist.Ib(), playlist);
                }
                CatalogReplacementResponse catalogReplacementResponse = new CatalogReplacementResponse(singletonList, new CatalogExtendedData(null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 7, null), null);
                laaVar.h = str4;
                return catalogReplacementResponse;
            case 6:
                ((owb.a) this.c).m.e(((nwb.b) this.d).b);
                return s3q0.a;
            case 7:
                oed oedVar = (oed) this.c;
                ra raVar = (ra) this.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!(((ClipUploadJobInternal) obj2).f instanceof ClipUploadStatus.Done)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ClipUploadJobInternal clipUploadJobInternal = (ClipUploadJobInternal) it.next();
                    arrayList2.add(ClipUploadJobInternal.zb(clipUploadJobInternal, null, null, null, null, new ClipUploadStatus.Canceled(clipUploadJobInternal.b.b), null, null, 495));
                }
                ConcurrentHashMap<Integer, ClipUploadJobInternal> concurrentHashMap = oedVar.c;
                int e2 = on00.e(c5g.u(arrayList2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(Integer.valueOf(((ClipUploadJobInternal) next).b.b), next);
                }
                concurrentHashMap.putAll(linkedHashMap);
                wmi0.a.m("clips.uploads", arrayList2);
                oedVar.d.countDown();
                raVar.invoke();
                oedVar.a.getLogger().d("ClipUploadTaskCache", "load " + arrayList2.size() + " uploads from cache");
                return s3q0.a;
            case 8:
                nxf nxfVar = (nxf) this.c;
                Msg msg = (Msg) this.d;
                w2w w2wVar = nxfVar.c;
                d040 o2 = w2wVar.I0().o();
                hpm c = sn.c(w2wVar);
                if (o2.y0(msg.d, msg.c)) {
                    com.vk.im.engine.models.dialogs.b c2 = c.c(msg.c);
                    dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = c.c;
                    if (c2 != null && (i = msg.d) > c2.g && msg.i) {
                        boolean contains = c2.J.contains(Integer.valueOf(i));
                        if (nxfVar.g) {
                            dhl0Var.a(Long.valueOf(msg.c), new dpm(msg.d, i4), new vs6(1, c, hpm.class, "updateUnreadCnvMentions", "updateUnreadCnvMentions(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0, 3));
                            valueOf = Long.valueOf(msg.c);
                        } else if (contains) {
                            dhl0Var.a(Long.valueOf(msg.c), new onm(msg.d, i5), new kp1(1, c, hpm.class, "updateUnreadCnvMentions", "updateUnreadCnvMentions(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0, 5));
                            valueOf = Long.valueOf(msg.c);
                        }
                        if (valueOf != null) {
                            nxfVar.h = Long.valueOf(valueOf.longValue());
                        }
                        if (msg instanceof MsgFromUser) {
                            long j3 = msg.c;
                            if (q6x.w(w2wVar, j3, msg)) {
                                q6x.F(w2wVar, j3, (MsgFromUser) msg);
                                valueOf2 = Long.valueOf(j3);
                                if (valueOf2 != null) {
                                    nxfVar.h = Long.valueOf(valueOf2.longValue());
                                }
                                o = w2wVar.I0().o();
                                if (o.y0(msg.d, msg.c)) {
                                    long j4 = msg.c;
                                    Serializer.c<Peer> cVar = Peer.CREATOR;
                                    new com.vk.im.engine.internal.merge.messages.b(Peer.a.b(j4), msg, false, false, 48).o(w2wVar);
                                    num = o.a0(nxfVar.e, nxfVar.d);
                                }
                                nxfVar.i = num;
                                return s3q0.a;
                            }
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        o = w2wVar.I0().o();
                        if (o.y0(msg.d, msg.c)) {
                        }
                        nxfVar.i = num;
                        return s3q0.a;
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
                if (msg instanceof MsgFromUser) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                o = w2wVar.I0().o();
                if (o.y0(msg.d, msg.c)) {
                }
                nxfVar.i = num;
                return s3q0.a;
            case 9:
                yyg yygVar = (yyg) this.c;
                fzg fzgVar = (fzg) this.d;
                MarketCreateCommunityReviewResponseDto marketCreateCommunityReviewResponseDto = (MarketCreateCommunityReviewResponseDto) obj;
                String e3 = marketCreateCommunityReviewResponseDto.e();
                String d = marketCreateCommunityReviewResponseDto.d();
                n7k n7kVar = fzgVar.e;
                yygVar.W(e3, d, n7kVar != null ? n7kVar.b : null);
                return s3q0.a;
            case 10:
                return new w9h((ViewGroup) obj, ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) this.c).invoke()).booleanValue(), (rj1) this.d, cn70.b(16));
            case 11:
                htp htpVar = (htp) this.c;
                izs izsVar = (izs) this.d;
                if (htpVar.n) {
                    ViewGroup viewGroup = htpVar.l;
                    atp atpVar = htpVar.z;
                    if (atpVar != null && (videoFile = atpVar.b) != null) {
                        if (BuildInfo.q()) {
                            atp atpVar2 = htpVar.z;
                            if (atpVar2 != null) {
                                bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                                yg5 e4 = b.C1208b.a().e(atpVar2.b, null);
                                e4.f0(new htp.a(atpVar2.g * 1000));
                                e4.G0(false);
                                Activity c3 = g2u0.c(viewGroup);
                                if (c3 != null) {
                                    fxc0.B().Y().i(c3, videoFile, new VideoFeedDialogParams.Discover(null, videoFile.r(), htpVar.o, false, null, null, 0L, false, null, null, Z3.l, null));
                                }
                            }
                        } else {
                            fxc0.B().Y().k(viewGroup.getContext(), videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : htpVar.z != null ? r3.g : -1L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                        }
                    }
                } else {
                    atp atpVar3 = htpVar.z;
                    if (atpVar3 == null) {
                        return s3q0.a;
                    }
                    bpn0 bpn0Var3 = com.vk.libvideo.autoplay.b.B;
                    yg5 e5 = b.C1208b.a().e(atpVar3.b, null);
                    if (!e5.P0()) {
                        if (e5.J() || e5.v0() == null) {
                            e5.S(true);
                        }
                        e5.seek(atpVar3.g * 1000);
                    }
                }
                atp atpVar4 = htpVar.z;
                if (atpVar4 != null && izsVar != null) {
                    izsVar.invoke(atpVar4);
                }
                return s3q0.a;
            case 12:
                ((t2q) this.c).b.h((hyg0) obj, (i9l0) this.d);
                return s3q0.a;
            case 13:
                k8r0 k8r0Var = (k8r0) this.c;
                zcv.a aVar2 = (zcv.a) this.d;
                SectionAppItem sectionAppItem = aVar2.q;
                k8r0Var.e(sectionAppItem == null ? null : sectionAppItem, (sectionAppItem != null ? sectionAppItem : null).f, aVar2.getBindingAdapterPosition());
                return s3q0.a;
            case 14:
                x7y x7yVar = (x7y) this.c;
                List list4 = (List) obj;
                x7yVar.w0(0, list4, EmptyList.b, new wh9(list4, x7yVar, (GetGroupInfo$Parameters) this.d, i3));
                return s3q0.a;
            case 15:
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) this.c;
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) this.d;
                Pair pair = (Pair) obj;
                int i8 = MarketEditAlbumGoodsFragment.c1;
                Integer d2 = ((MarketAddAlbumResponseDto) pair.i()).d();
                String str5 = (String) pair.j();
                GoodAlbumEditFlowEntity zb = GoodAlbumEditFlowEntity.zb(goodAlbumEditFlowEntity, null, d2, null, goodAlbumEditFlowEntity.i.size(), false, false, str5, 491);
                ((fy00) marketEditAlbumGoodsFragment.V0.getValue()).b(new cy00(goodAlbumEditFlowEntity.Ab()));
                if (str5 == null || !(!drm0.N(str5))) {
                    ((ClassifiedsComponent) m7m.d(marketEditAlbumGoodsFragment).a(fpf0.a(ClassifiedsComponent.class))).dc().d(marketEditAlbumGoodsFragment.requireContext(), new ngc(null, "album", goodAlbumEditFlowEntity.b, null, null, null, null, null, null, null, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_ALBUM, CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS, null, null, null, null, false, null, false, false, null, false, 8057, null), d2, true, goodAlbumEditFlowEntity.c, 3211235));
                } else {
                    MarketEditAlbumFinishedFragment.a aVar3 = new MarketEditAlbumFinishedFragment.a(MarketEditAlbumFinishedFragment.class, null, null);
                    aVar3.j.putParcelable("album", zb);
                    aVar3.l(marketEditAlbumGoodsFragment);
                }
                marketEditAlbumGoodsFragment.finish();
                return s3q0.a;
            case 16:
                RecommendedMiniAppEntry recommendedMiniAppEntry = (RecommendedMiniAppEntry) this.c;
                hq20 hq20Var = (hq20) this.d;
                ImageSize Cb = recommendedMiniAppEntry.o.Cb(((VkImage) obj).getWidth(), true, true);
                hq20Var.D.o0(Cb != null ? Cb.d.d : null, null);
                return s3q0.a;
            case 17:
                wq30 wq30Var = (wq30) this.c;
                AttachGift attachGift = (AttachGift) this.d;
                pk30 pk30Var = wq30Var.u;
                if (pk30Var != null) {
                    pk30Var.k(attachGift);
                }
                return s3q0.a;
            case 18:
                MusicFollowCuratorButtonVh musicFollowCuratorButtonVh = (MusicFollowCuratorButtonVh) this.c;
                UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = (UIBlockActionCuratorSubscription) this.d;
                musicFollowCuratorButtonVh.f = musicFollowCuratorButtonVh.d.f(new Curator(uIBlockActionCuratorSubscription.z, null, null, null, null, false, false, null, 254, null)).subscribe(new cc20(new nv2(26, musicFollowCuratorButtonVh, uIBlockActionCuratorSubscription), 5), new tk40(new j4x(musicFollowCuratorButtonVh, 19), i4));
                dw20 dw20Var = musicFollowCuratorButtonVh.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                musicFollowCuratorButtonVh.g = null;
                return s3q0.a;
            case 19:
                NotificationItem notificationItem = (NotificationItem) this.c;
                bj70 bj70Var = (bj70) this.d;
                notificationItem.v = new NotificationItem.b(Integer.valueOf(R.drawable.vk_icon_done_24), Integer.valueOf(R.string.friend_req_sent));
                bj70Var.Q(notificationItem);
                return s3q0.a;
            case 20:
                com.vk.auth.passport.b bVar = (com.vk.auth.passport.b) this.c;
                com.vk.auth.passport.c cVar2 = (com.vk.auth.passport.c) this.d;
                xav0 xav0Var = bVar.d;
                if (xav0Var != null) {
                    xav0Var.c(cVar2);
                }
                return s3q0.a;
            case 21:
                PlaylistScreenFragment playlistScreenFragment = (PlaylistScreenFragment) this.c;
                String str6 = (String) this.d;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                nwy nwyVar = playlistScreenFragment.go().p;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[6];
                s0a s0aVar = ((g7b0) nwyVar.c()).a;
                int i9 = g7b0.a.$EnumSwitchMapping$0[((VideoPlaylistBottomSheet.Action) obj).ordinal()];
                if (i9 == 1) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER;
                } else if (i9 == 2) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK;
                } else {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE;
                }
                s0aVar.a(new t0a.a(str6, null, null, new t0a.a.d(action, SchemeStat$EventItem.Type.VIDEO_PLAYLIST), 6));
                return s3q0.a;
            case 22:
                return a(obj);
            case 23:
                zrh0 zrh0Var = (zrh0) this.c;
                vrh0 vrh0Var = (vrh0) this.d;
                nsh0.b bVar2 = (nsh0.b) obj;
                gm50.a.a(zrh0Var, bVar2.b, new e15(vrh0Var, 9));
                gm50.a.a(zrh0Var, bVar2.c, new g15(vrh0Var, 9));
                gm50.a.a(zrh0Var, bVar2.a, new ue40(i2, zrh0Var, vrh0Var));
                gm50.a.a(zrh0Var, bVar2.d, new eiz(zrh0Var, 29));
                return s3q0.a;
            case 24:
                return c(obj);
            case 25:
                q7v0 q7v0Var = (q7v0) this.c;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.d;
                ((etv0) obj).b(false);
                q7v0Var.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 26:
                UserId userId = (UserId) this.c;
                q3v0 q3v0Var = (q3v0) this.d;
                qtd0 Cb2 = ((ProfilesInfo) obj).Cb(Long.valueOf(userId.b));
                UserId userId2 = new UserId(Cb2.G3());
                String name = Cb2.name();
                ImageList C8 = Cb2.C8();
                int i10 = q3v0Var.n;
                Image Bb = C8.Bb(i10, i10);
                return new h120.a(userId2, name, Bb != null ? Bb.d : null);
            default:
                Throwable th2 = (Throwable) obj;
                boolean z3 = th2 instanceof VKApiExecutionException;
                ((yuv0) this.d).b.m(JsApiMethodType.SHOW_INVITE_BOX, (z3 && ((VKApiExecutionException) th2).s() == -1) ? VkAppsErrors.Client.CONNECTION_LOST : (z3 && ((VKApiExecutionException) th2).s() == 24) ? VkAppsErrors.Client.USER_DENIED : th2 instanceof JSONException ? VkAppsErrors.Client.INVALID_PARAMS : VkAppsErrors.Client.UNKNOWN_ERROR, new Pair<>("nonSentIds", (List) this.c), z3 ? ((VKApiExecutionException) th2).u() : th2.getMessage());
                return s3q0.a;
        }
    }

    public /* synthetic */ du0(String str, String str2, vf5 vf5Var) {
        this.b = 2;
        this.c = str;
        this.d = str2;
    }
}
