package xsna;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogVideo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockAnchorInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlockStatInfo;
import com.vk.catalog2.common.dto.api.poll.UxPollData;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.api.video.CatalogPinnedVideoInfo;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.catalog2.common.dto.api.video.TopshelfItem;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.author.VideoPinType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: VideoBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class x5s0 {

    /* compiled from: VideoBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.TITLE_SUBTITLE_AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.VIDEO_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UIBlockTopshelf.TopshelfLiveInfo a(TopshelfItem.TopshelfLiveInfo topshelfLiveInfo) {
        ArrayList arrayList;
        List<TopshelfItem.TopshelfLiveInfo.Icon> d;
        String d2;
        String h;
        List<TopshelfItem.TopshelfLiveInfo.Info> d3 = topshelfLiveInfo.d();
        ArrayList arrayList2 = null;
        if (d3 != null) {
            List<TopshelfItem.TopshelfLiveInfo.Info> list = d3;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            for (TopshelfItem.TopshelfLiveInfo.Info info : list) {
                if (info == null || (d = info.d()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (TopshelfItem.TopshelfLiveInfo.Icon icon : d) {
                        arrayList.add(new UIBlockTopshelf.TopshelfLiveInfo.Icon(icon != null ? icon.g() : null, (icon == null || (h = icon.h()) == null) ? null : arm0.m(10, h), (icon == null || (d2 = icon.d()) == null) ? null : arm0.m(10, d2)));
                    }
                }
                arrayList3.add(new UIBlockTopshelf.TopshelfLiveInfo.Info(info != null ? info.g() : null, arrayList));
            }
            arrayList2 = arrayList3;
        }
        return new UIBlockTopshelf.TopshelfLiveInfo(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a3  */
    /* JADX WARN: Type inference failed for: r7v21, types: [com.vk.dto.common.VideoFile] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [com.vk.dto.common.VideoFileOld] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List b(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        int i;
        int i2;
        CatalogViewType catalogViewType;
        Object obj;
        Iterator it;
        boolean z;
        boolean z2;
        UserId userId;
        boolean z3;
        boolean z4;
        List<String> list;
        Iterator it2;
        Object obj2;
        Iterator it3;
        Long l;
        UserId userId2;
        String P;
        UserId[] userIdArr;
        VideoNotificationsStatus videoNotificationsStatus;
        String str;
        Object obj3;
        UserId userId3;
        List<Artist> list2;
        Artist artist;
        Long l2;
        CatalogExtendedData catalogExtendedData2 = catalogExtendedData;
        CatalogBlock catalogBlock2 = catalogBlock;
        CatalogViewType catalogViewType2 = bi20Var.d;
        ArrayList Gb = catalogBlock2.Gb(catalogExtendedData2);
        ArrayList arrayList = new ArrayList();
        Iterator it4 = Gb.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            VideoFile videoFile = next instanceof VideoFile ? (VideoFile) next : null;
            if (videoFile != null) {
                arrayList.add(videoFile);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (true) {
            i = 3;
            i2 = 2;
            if (!it5.hasNext()) {
                break;
            }
            VideoFile videoFile2 = (VideoFile) it5.next();
            boolean Y0 = fxc0.B().J().Y0();
            if (Y0) {
                MusicVideoFile musicVideoFile = videoFile2 instanceof MusicVideoFile ? (MusicVideoFile) videoFile2 : null;
                if (musicVideoFile == null || (list2 = musicVideoFile.B1) == null || (artist = (Artist) j5g.a0(list2)) == null || (l2 = artist.l) == null) {
                    userId3 = UserId.d;
                } else {
                    long longValue = l2.longValue();
                    gzs<s3q0> gzsVar = fkq0.a;
                    userId3 = new UserId(longValue);
                }
                userIdArr = new UserId[]{videoFile2.getUid(), videoFile2.I0(), userId3};
            } else {
                userIdArr = new UserId[]{videoFile2.getUid(), videoFile2.I0()};
            }
            rba Gb2 = catalogExtendedData2.Gb((UserId[]) Arrays.copyOf(userIdArr, userIdArr.length));
            UserProfile userProfile = Gb2.a;
            Group group = Gb2.b;
            if (group == null || (str = group.k0) == null) {
                videoNotificationsStatus = null;
            } else {
                Iterator it6 = VideoNotificationsStatus.h().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    if (epx.f(((VideoNotificationsStatus) obj3).i(), str)) {
                        break;
                    }
                }
                videoNotificationsStatus = (VideoNotificationsStatus) obj3;
            }
            if (videoNotificationsStatus != null) {
                videoFile2.J6(videoNotificationsStatus);
            }
            if (!(videoFile2 instanceof MusicVideoFile) || Y0) {
                videoFile2.f1(userProfile != null ? userProfile.l0() : group != null ? tsj.a(group) : null);
            }
            arrayList2.add(videoFile2);
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            ?? r7 = (VideoFile) it7.next();
            String a1 = r7.a1();
            CatalogBlockStatInfo catalogBlockStatInfo = catalogBlock2.s;
            CatalogBlockStatInfo.CatalogItemStatInfo catalogItemStatInfo = catalogBlockStatInfo != null ? catalogBlockStatInfo.b.get(a1) : null;
            if (catalogItemStatInfo != null) {
                r7 = r7.copy();
                r7.W = catalogItemStatInfo.b;
            }
            arrayList3.add(r7);
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            VideoFile videoFile3 = (VideoFile) it8.next();
            boolean d8 = videoFile3.d8();
            Bundle bundle = bi20Var.p;
            int i3 = a.$EnumSwitchMapping$0[catalogViewType2.ordinal()];
            if (i3 != i2) {
                catalogViewType = (i3 == i && videoFile3.W9()) ? CatalogViewType.SYNTHETIC_VIDEO_SLIDER_INTERACTIVE : catalogViewType2;
            } else {
                float E0 = videoFile3.E0();
                catalogViewType = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > E0 || E0 > 0.9f) ? (0.9f > E0 || E0 > 1.1f) ? d8 ? catalogViewType2 : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY : d8 ? CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1 : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY : d8 ? CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5 : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY;
                if (epx.f(bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()), CatalogCustomAttributes$Values.FIT.h()) && !e43.l(CatalogViewType.LARGE_LIST, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY).contains(catalogViewType)) {
                    catalogViewType = CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_FIT;
                }
                if (videoFile3.W9()) {
                    catalogViewType = CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE;
                }
            }
            String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
            CatalogViewStyle verticalVideoCatalogViewStyle = catalogViewType2 == CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS ? new VerticalVideoCatalogViewStyle(string) : (catalogViewType2 == CatalogViewType.SLIDER || fxc0.B().J().F1()) ? new VideoCatalogViewStyle(string) : null;
            UIBlockVideo.ItemViewContentDescription itemViewContentDescription = (!videoFile3.C2() || (P = videoFile3.P()) == null) ? null : new UIBlockVideo.ItemViewContentDescription(R.string.catalog_accessibility_clip_author, (List<String>) Collections.singletonList(P));
            List<CatalogPinnedVideoInfo> list3 = catalogBlock2.v;
            String str2 = catalogBlock2.g;
            Iterator it9 = list3.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it9.next();
                if (epx.f(((CatalogPinnedVideoInfo) obj).b, videoFile3.a1())) {
                    break;
                }
            }
            CatalogPinnedVideoInfo catalogPinnedVideoInfo = (CatalogPinnedVideoInfo) obj;
            VideoPinType videoPinType = catalogPinnedVideoInfo != null ? catalogPinnedVideoInfo.c : null;
            String str3 = bi20Var.a;
            CatalogDataType catalogDataType = bi20Var.c;
            String x8 = videoFile3.x8();
            UserId userId4 = bi20Var.e;
            List<String> list4 = bi20Var.j;
            Set<UIBlockDragDropAction> set = bi20Var.m;
            CatalogViewType catalogViewType3 = catalogViewType2;
            UIBlockHint uIBlockHint = bi20Var.o;
            String a2 = cqm0.a(bi20Var.f);
            String str4 = bi20Var.n;
            if (str2 != null) {
                it = it8;
                z = true;
                if (drm0.D(str2, "history", false)) {
                    z2 = true;
                    boolean j0 = videoFile3.j0();
                    if (str2 == null) {
                        userId = userId4;
                        z3 = false;
                        if (drm0.D(str2, "my/liked", false) == z) {
                            z4 = z;
                            String str5 = str2 == null ? "" : str2;
                            boolean z5 = (str2 == null && drm0.D(str2, "my/bookmarks", z3) == z) ? z : z3;
                            boolean f = epx.f(catalogBlock2.i.h.getString(TtmlNode.TAG_STYLE), "with_episodes");
                            CatalogVideo catalogVideo = catalogExtendedData2.f.get(videoFile3.a1());
                            list = catalogVideo != null ? catalogVideo.b : null;
                            if (list == null) {
                                list = EmptyList.b;
                            }
                            List<String> list5 = list;
                            ShowcaseListItem showcaseListItem = catalogExtendedData2.h.get(videoFile3.a1());
                            List<CatalogBlockAnchorInfo> list6 = bi20Var.x;
                            it2 = catalogExtendedData2.p0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                UxPollData uxPollData = (UxPollData) obj2;
                                Long l3 = uxPollData.c;
                                long o0 = videoFile3.o0();
                                if (l3 != null && l3.longValue() == o0) {
                                    Long l4 = uxPollData.b;
                                    Owner s = videoFile3.s();
                                    if (s == null || (userId2 = s.b) == null) {
                                        it3 = it2;
                                        l = null;
                                    } else {
                                        it3 = it2;
                                        l = Long.valueOf(userId2.b);
                                    }
                                    if (epx.f(l4, l)) {
                                        break;
                                    }
                                } else {
                                    it3 = it2;
                                }
                                it2 = it3;
                            }
                            UxPollData uxPollData2 = (UxPollData) obj2;
                            arrayList4.add(new UIBlockVideo(str3, catalogViewType, catalogDataType, x8, userId, list4, set, uIBlockHint, new UIBlockVideo.a(a2, videoFile3, str4, z2, j0, z4, str5, itemViewContentDescription, z5, f, list5, showcaseListItem, list6, videoPinType, uxPollData2 != null ? new UIBlockVideo.DynamicPollData(uxPollData2.d) : null), verticalVideoCatalogViewStyle));
                            catalogExtendedData2 = catalogExtendedData;
                            catalogBlock2 = catalogBlock;
                            catalogViewType2 = catalogViewType3;
                            it8 = it;
                            i = 3;
                            i2 = 2;
                        }
                    } else {
                        userId = userId4;
                        z3 = false;
                    }
                    z4 = z3;
                    if (str2 == null) {
                    }
                    if (str2 == null) {
                    }
                    boolean f2 = epx.f(catalogBlock2.i.h.getString(TtmlNode.TAG_STYLE), "with_episodes");
                    CatalogVideo catalogVideo2 = catalogExtendedData2.f.get(videoFile3.a1());
                    if (catalogVideo2 != null) {
                    }
                    if (list == null) {
                    }
                    List<String> list52 = list;
                    ShowcaseListItem showcaseListItem2 = catalogExtendedData2.h.get(videoFile3.a1());
                    List<CatalogBlockAnchorInfo> list62 = bi20Var.x;
                    it2 = catalogExtendedData2.p0.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                        }
                        it2 = it3;
                    }
                    UxPollData uxPollData22 = (UxPollData) obj2;
                    arrayList4.add(new UIBlockVideo(str3, catalogViewType, catalogDataType, x8, userId, list4, set, uIBlockHint, new UIBlockVideo.a(a2, videoFile3, str4, z2, j0, z4, str5, itemViewContentDescription, z5, f2, list52, showcaseListItem2, list62, videoPinType, uxPollData22 != null ? new UIBlockVideo.DynamicPollData(uxPollData22.d) : null), verticalVideoCatalogViewStyle));
                    catalogExtendedData2 = catalogExtendedData;
                    catalogBlock2 = catalogBlock;
                    catalogViewType2 = catalogViewType3;
                    it8 = it;
                    i = 3;
                    i2 = 2;
                }
            } else {
                it = it8;
                z = true;
            }
            z2 = false;
            boolean j02 = videoFile3.j0();
            if (str2 == null) {
            }
            z4 = z3;
            if (str2 == null) {
            }
            if (str2 == null) {
            }
            boolean f22 = epx.f(catalogBlock2.i.h.getString(TtmlNode.TAG_STYLE), "with_episodes");
            CatalogVideo catalogVideo22 = catalogExtendedData2.f.get(videoFile3.a1());
            if (catalogVideo22 != null) {
            }
            if (list == null) {
            }
            List<String> list522 = list;
            ShowcaseListItem showcaseListItem22 = catalogExtendedData2.h.get(videoFile3.a1());
            List<CatalogBlockAnchorInfo> list622 = bi20Var.x;
            it2 = catalogExtendedData2.p0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                }
                it2 = it3;
            }
            UxPollData uxPollData222 = (UxPollData) obj2;
            arrayList4.add(new UIBlockVideo(str3, catalogViewType, catalogDataType, x8, userId, list4, set, uIBlockHint, new UIBlockVideo.a(a2, videoFile3, str4, z2, j02, z4, str5, itemViewContentDescription, z5, f22, list522, showcaseListItem22, list622, videoPinType, uxPollData222 != null ? new UIBlockVideo.DynamicPollData(uxPollData222.d) : null), verticalVideoCatalogViewStyle));
            catalogExtendedData2 = catalogExtendedData;
            catalogBlock2 = catalogBlock;
            catalogViewType2 = catalogViewType3;
            it8 = it;
            i = 3;
            i2 = 2;
        }
        ArrayList E = rte0.E(rte0.D(arrayList4, bi20Var), bi20Var);
        List<UIBlockAction> list7 = bi20Var.l;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list7) {
            UIBlockAction uIBlockAction = (UIBlockAction) obj4;
            if ((uIBlockAction instanceof UIBlockActionOpenUrl) && uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_BOTTOM) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it10 = arrayList5.iterator();
        while (it10.hasNext()) {
            arrayList6.add(((UIBlockActionOpenUrl) ((UIBlockAction) it10.next())).Sb(CatalogDataType.DATA_TYPE_ACTION, CatalogViewType.SYNTHETIC_ACTION_OPEN_URL));
        }
        return rte0.C(j5g.u0(arrayList6, E), bi20Var);
    }
}
