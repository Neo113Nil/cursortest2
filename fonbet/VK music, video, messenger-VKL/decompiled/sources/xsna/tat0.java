package xsna;

import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoRecommendationsItemsFactory.kt */
/* loaded from: classes7.dex */
public final class tat0 {
    public final l5o a;
    public final boolean b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;

    /* compiled from: VideoRecommendationsItemsFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRecommendationVideosType.values().length];
            try {
                iArr[VideoRecommendationVideosType.SIMILAR_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRecommendationVideosType.SIMILAR_MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoRecommendationVideosType.MUSIC_MIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tat0(l5o l5oVar, boolean z, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3) {
        this.a = l5oVar;
        this.b = z;
        this.c = linkedHashSet;
        this.d = linkedHashSet2;
        this.e = linkedHashSet3;
    }

    public static List a(String str, String str2, String str3, List list) {
        if (str2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!epx.f(((VideoFile) obj).a1(), str2)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        return !list.isEmpty() ? Collections.singletonList(new AboutVideoItem.e(list, str, str3)) : EmptyList.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    public static ArrayList c(tat0 tat0Var, List list, int i, VideoRecommendationVideosType videoRecommendationVideosType, String str, AboutVideoItem.SimilarVideoRedesign.Style style, DonutVideoCardSource donutVideoCardSource, boolean z, String str2, int i2) {
        ?? r12;
        String a2 = (i2 & 8) != 0 ? com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY) : str;
        AboutVideoItem.SimilarVideoRedesign.Style style2 = (i2 & 16) != 0 ? AboutVideoItem.SimilarVideoRedesign.Style.NORMAL : style;
        DonutVideoCardSource donutVideoCardSource2 = (i2 & 32) != 0 ? DonutVideoCardSource.LARGE_CARD : donutVideoCardSource;
        boolean z2 = (i2 & 64) != 0 ? false : z;
        String str3 = (i2 & 128) != 0 ? null : str2;
        tat0Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            Doc2DocItem doc2DocItem = (Doc2DocItem) obj;
            if (doc2DocItem instanceof Doc2DocItem.Video) {
                List<VideoFile> list2 = doc2DocItem.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    VideoFile videoFile = (VideoFile) obj2;
                    if (i3 != i && !tat0Var.c.contains(videoFile.r1()) && (!z2 || !tat0Var.e.contains(videoFile.r1()))) {
                        if (str3 == null || !epx.f(videoFile.a1(), str3)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                r12 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    VideoFile videoFile2 = (VideoFile) it.next();
                    int i5 = a.$EnumSwitchMapping$0[videoRecommendationVideosType.ordinal()];
                    AboutVideoItem.SimilarVideoRedesign.Source source = i5 != 1 ? i5 != 2 ? i5 != 3 ? AboutVideoItem.SimilarVideoRedesign.Source.SIMILAR_VIDEOS : AboutVideoItem.SimilarVideoRedesign.Source.MUSIC_MIX_VIDEOS : AboutVideoItem.SimilarVideoRedesign.Source.SIMILAR_MUSIC : AboutVideoItem.SimilarVideoRedesign.Source.SIMILAR_VIDEOS;
                    r12.add(new AboutVideoItem.SimilarVideoRedesign(new noj0(videoFile2, a2, null, tat0Var.a.a(nkt0.a(videoFile2), donutVideoCardSource2)), false, rl3.y0(new AboutVideoItem.SimilarVideoRedesign.Source[]{AboutVideoItem.SimilarVideoRedesign.Source.SIMILAR_VIDEOS, AboutVideoItem.SimilarVideoRedesign.Source.SIMILAR_MUSIC}).contains(source) && tat0Var.d.contains(videoFile2.r1()), fxc0.B().c(videoFile2), source, z2, style2));
                }
            } else if (doc2DocItem instanceof Doc2DocItem.Carousel) {
                r12 = a("carousel_clips", str3, ((Doc2DocItem.Carousel) doc2DocItem).c, doc2DocItem.b);
            } else if (doc2DocItem instanceof Doc2DocItem.Floor) {
                r12 = a("floor_clips", str3, ((Doc2DocItem.Floor) doc2DocItem).c, doc2DocItem.b);
            } else if (doc2DocItem instanceof Doc2DocItem.Banner) {
                Doc2DocItem.Banner banner = (Doc2DocItem.Banner) doc2DocItem;
                r12 = Collections.singletonList(new AboutVideoItem.l(banner.c, banner.e, banner.f, banner.g));
            } else {
                if (!(doc2DocItem instanceof Doc2DocItem.Stub)) {
                    throw new NoWhenBranchMatchedException();
                }
                r12 = EmptyList.b;
            }
            g5g.y((Iterable) r12, arrayList);
            i3 = i4;
        }
        return arrayList;
    }

    public static ListBuilder d(ArrayList arrayList) {
        boolean m0 = fxc0.B().J().m0();
        ListBuilder e = e43.e();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            AboutVideoItem aboutVideoItem = (AboutVideoItem) it.next();
            AboutVideoItem.e eVar = aboutVideoItem instanceof AboutVideoItem.e ? (AboutVideoItem.e) aboutVideoItem : null;
            if (epx.f(eVar != null ? eVar.c : null, "carousel_clips") && (i != 0 || m0)) {
                e.add(AboutVideoItem.f.b);
            }
            e.add(aboutVideoItem);
            i = i2;
        }
        return e.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.vk.dto.video.Doc2DocItem$Stub] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.vk.dto.video.Doc2DocItem$Floor] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.vk.dto.video.Doc2DocItem$Carousel] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    public final ArrayList b(List list, int i, String str, AboutVideoItem.SimilarVideoRedesign.Style style, DonutVideoCardSource donutVideoCardSource, boolean z) {
        ?? r4;
        List list2 = list;
        if (i != -1 && !list2.isEmpty()) {
            list2 = j5g.u0(list2.subList(0, i), list2.subList(i + 1, list2.size()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Doc2DocItem doc2DocItem = (Doc2DocItem) it.next();
            List<VideoFile> list3 = doc2DocItem.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                DownloadInfo x = fxc0.B().s().x((VideoFile) obj);
                if ((x != null ? x.c : null) == DownloadInfo.State.STATE_COMPLETED) {
                    arrayList2.add(obj);
                }
            }
            Doc2DocItem.Video video = arrayList2.isEmpty() ? null : doc2DocItem instanceof Doc2DocItem.Video ? new Doc2DocItem.Video(arrayList2) : doc2DocItem instanceof Doc2DocItem.Carousel ? new Doc2DocItem.Carousel(arrayList2, null, 2, null) : doc2DocItem instanceof Doc2DocItem.Floor ? new Doc2DocItem.Floor(arrayList2, null, 2, null) : new Doc2DocItem.Stub(null, 1, null);
            if (video != null) {
                arrayList.add(video);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Doc2DocItem doc2DocItem2 = (Doc2DocItem) it2.next();
            if (doc2DocItem2 instanceof Doc2DocItem.Video) {
                List<VideoFile> list4 = doc2DocItem2.b;
                r4 = new ArrayList(c5g.u(list4, 10));
                for (VideoFile videoFile : list4) {
                    r4.add(new AboutVideoItem.SimilarVideoRedesign(new noj0(videoFile, str, null, this.a.a(nkt0.a(videoFile), donutVideoCardSource)), false, false, fxc0.B().c(videoFile), AboutVideoItem.SimilarVideoRedesign.Source.OFFLINE_VIDEOS, z, style));
                }
            } else if (doc2DocItem2 instanceof Doc2DocItem.Carousel) {
                r4 = a("carousel_clips", null, ((Doc2DocItem.Carousel) doc2DocItem2).c, doc2DocItem2.b);
            } else if (doc2DocItem2 instanceof Doc2DocItem.Floor) {
                r4 = a("floor_clips", null, ((Doc2DocItem.Floor) doc2DocItem2).c, doc2DocItem2.b);
            } else if (doc2DocItem2 instanceof Doc2DocItem.Banner) {
                Doc2DocItem.Banner banner = (Doc2DocItem.Banner) doc2DocItem2;
                r4 = Collections.singletonList(new AboutVideoItem.l(banner.c, banner.e, banner.f, banner.g));
            } else {
                if (!(doc2DocItem2 instanceof Doc2DocItem.Stub)) {
                    throw new NoWhenBranchMatchedException();
                }
                r4 = EmptyList.b;
            }
            g5g.y((Iterable) r4, arrayList3);
        }
        return arrayList3;
    }
}
