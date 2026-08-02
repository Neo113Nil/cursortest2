package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkArtist;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.shared.api.decoration.RecommendationDecorationPayload;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedCacheInfo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.sdk.shared.feed.controller.mvi.model.NoDecoration;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.wih0;

/* compiled from: ClipFeedListProducer.kt */
/* loaded from: classes17.dex */
public final class myc {
    public final z5e a;
    public final y5e b;
    public final ClipFeedTab c;
    public final xod d;
    public final ki0 e;
    public final ConcurrentHashMap<String, nlh0> f = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, kih0> g = new ConcurrentHashMap<>();

    public myc(z5e z5eVar, y5e y5eVar, ClipFeedTab clipFeedTab, xod xodVar, ki0 ki0Var, c9e c9eVar) {
        this.a = z5eVar;
        this.b = y5eVar;
        this.c = clipFeedTab;
        this.d = xodVar;
        this.e = ki0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (((r13 != null ? r13.Fb() : null) instanceof com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.MusicTemplate) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FeedItem.d d(myc mycVar, SdkVideoFile sdkVideoFile, wp50 wp50Var, int i) {
        wp50 wp50Var2 = (i & 2) != 0 ? null : wp50Var;
        ClipFeedTab clipFeedTab = mycVar.c;
        if (!(clipFeedTab instanceof ClipFeedTab.MusicTemplate)) {
            ClipFeedTab.CatalogClip catalogClip = clipFeedTab instanceof ClipFeedTab.CatalogClip ? (ClipFeedTab.CatalogClip) clipFeedTab : null;
        }
        if (sdkVideoFile instanceof SdkClipVideoFile) {
            return mycVar.m((SdkClipVideoFile) sdkVideoFile);
        }
        if (((clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip)) && (sdkVideoFile instanceof SdkClipVideoFile)) {
            return mycVar.m((SdkClipVideoFile) sdkVideoFile);
        }
        boolean z = sdkVideoFile instanceof SdkClipVideoFile;
        if (z && dgd.f(sdkVideoFile)) {
            SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) sdkVideoFile;
            FeedItem.l aVar = new FeedItem.a(mycVar.a.a(), mycVar.b.a, mycVar.c, sdkClipVideoFile, mycVar.c(sdkClipVideoFile), mycVar.a(sdkClipVideoFile), mycVar.b(sdkClipVideoFile), wp50Var2);
            mycVar.n(aVar);
            return aVar;
        }
        if (!z) {
            return sdkVideoFile.v() ? mycVar.k(sdkVideoFile) : mycVar.k(sdkVideoFile);
        }
        FeedItem.l j = j(mycVar, (SdkClipVideoFile) sdkVideoFile, wp50Var2);
        mycVar.n(j);
        return j;
    }

    public static FeedItem.f j(myc mycVar, SdkClipVideoFile sdkClipVideoFile, wp50 wp50Var) {
        ClipFeedTab clipFeedTab = mycVar.c;
        boolean z = clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration;
        ClipsFeedDecorationPayload clipsFeedDecorationPayload = NoDecoration.b;
        if (z) {
            ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration = (ClipFeedTab.SingleClipWithDecoration) clipFeedTab;
            if (epx.f(singleClipWithDecoration.b.a1(), sdkClipVideoFile.a1())) {
                ClipsFeedDecorationPayload clipsFeedDecorationPayload2 = singleClipWithDecoration.f;
                if (clipsFeedDecorationPayload2 != null) {
                    clipsFeedDecorationPayload = clipsFeedDecorationPayload2;
                }
            } else {
                clipsFeedDecorationPayload = new RecommendationDecorationPayload(sdkClipVideoFile);
            }
        }
        return mycVar.i(sdkClipVideoFile, wp50Var, clipsFeedDecorationPayload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static ag40 l(SdkMusicTrack sdkMusicTrack) {
        ?? r3;
        List<SdkArtist> list = sdkMusicTrack.e;
        ?? r1 = 0;
        if (list != null) {
            List<SdkArtist> list2 = list;
            r3 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r3.add(((SdkArtist) it.next()).b);
            }
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            r3 = EmptyList.b;
        }
        List<SdkArtist> list3 = sdkMusicTrack.f;
        if (list3 != null) {
            List<SdkArtist> list4 = list3;
            r1 = new ArrayList(c5g.u(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                r1.add(((SdkArtist) it2.next()).b);
            }
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        return new ag40(r3, r1, sdkMusicTrack.g);
    }

    public final kih0 a(SdkVideoFile sdkVideoFile) {
        Map<AdStatPixel.Type, List<AdStatPixel>> map;
        String r1 = sdkVideoFile.r1();
        ConcurrentHashMap<String, kih0> concurrentHashMap = this.g;
        kih0 kih0Var = concurrentHashMap.get(r1);
        if (kih0Var == null) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5 e = b.C1208b.a().e(k15.A(sdkVideoFile), null);
            e.X();
            VideoFile A = k15.A(sdkVideoFile);
            ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
            if (clipVideoFile != null && (map = clipVideoFile.O1) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<AdStatPixel.Type, List<AdStatPixel>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    g5g.y(it.next().getValue(), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof AdStatPixel.b) {
                        arrayList2.add(next);
                    }
                }
                e.e0(arrayList2);
            }
            qi5 qi5Var = new qi5(e);
            kih0 putIfAbsent = concurrentHashMap.putIfAbsent(r1, qi5Var);
            kih0Var = putIfAbsent == null ? qi5Var : putIfAbsent;
        }
        return kih0Var;
    }

    public final oi5 b(SdkVideoFile sdkVideoFile) {
        return new oi5(this.a.a(), this.b.a, sdkVideoFile.r(), 8);
    }

    public final nlh0 c(SdkVideoFile sdkVideoFile) {
        String r1 = sdkVideoFile.r1();
        ConcurrentHashMap<String, nlh0> concurrentHashMap = this.f;
        nlh0 nlh0Var = concurrentHashMap.get(r1);
        if (nlh0Var == null) {
            nlh0Var = new cls0(new yks0(k15.A(sdkVideoFile), this.a.a(), this.b.a));
            nlh0 putIfAbsent = concurrentHashMap.putIfAbsent(r1, nlh0Var);
            if (putIfAbsent != null) {
                nlh0Var = putIfAbsent;
            }
        }
        nlh0 nlh0Var2 = nlh0Var;
        nlh0Var2.c(sdkVideoFile);
        return nlh0Var2;
    }

    public final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            SdkVideoFile sdkVideoFile = (SdkVideoFile) pair.i();
            FeedItem.f fVar = null;
            if (sdkVideoFile instanceof SdkClipVideoFile) {
                fVar = i((SdkClipVideoFile) sdkVideoFile, null, (ClipsFeedDecorationPayload) pair.j());
                n(fVar);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$h$a] */
    /* JADX WARN: Type inference failed for: r3v0, types: [xsna.ki0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$j] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.vk.clips.sdk.shared.feed.model.FeedItem$m] */
    public final ArrayList f(List list) {
        FeedItem.d aVar;
        FeedItem.d dVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wih0 wih0Var = (wih0) it.next();
            if (wih0Var instanceof wih0.a) {
                wih0.a aVar2 = (wih0.a) wih0Var;
                aVar = g(aVar2.a, null, aVar2.b);
            } else {
                boolean z = wih0Var instanceof wih0.d;
                ?? r3 = this.e;
                if (z) {
                    wih0.d dVar2 = (wih0.d) wih0Var;
                    String str = dVar2.a;
                    ImageUrl imageUrl = dVar2.b;
                    wih0.d.a aVar3 = dVar2.c;
                    ?? mVar = new FeedItem.m(imageUrl, dVar2.d, str, dVar2.e, dVar2.f, dVar2.g, aVar3);
                    Map<AdStatPixel.Type, List<AdStatPixel>> map = aVar3.i;
                    dVar = mVar;
                    if (!map.isEmpty()) {
                        r3.k(map);
                        dVar = mVar;
                    }
                } else if (wih0Var instanceof wih0.b) {
                    wih0.b bVar = (wih0.b) wih0Var;
                    String str2 = bVar.a;
                    ArrayList arrayList2 = bVar.b;
                    ImageUrl imageUrl2 = bVar.c;
                    wih0.b.a aVar4 = bVar.d;
                    ?? jVar = new FeedItem.j(imageUrl2, bVar.e, str2, bVar.f, bVar.g, arrayList2, bVar.h, aVar4);
                    ?? r1 = aVar4.k;
                    dVar = jVar;
                    if (!r1.isEmpty()) {
                        r3.k(r1);
                        dVar = jVar;
                    }
                } else {
                    if (!(wih0Var instanceof wih0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wih0.c cVar = (wih0.c) wih0Var;
                    aVar = new FeedItem.h.a(cVar.a, cVar.c, cVar.d, cVar.b);
                }
                aVar = dVar;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (((r1 != null ? r1.Fb() : null) instanceof com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab.MusicTemplate) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FeedItem.d g(SdkVideoFile sdkVideoFile, ClipFeedCacheInfo clipFeedCacheInfo, wp50 wp50Var) {
        int indexOf;
        ClipFeedTab clipFeedTab = this.c;
        if (!(clipFeedTab instanceof ClipFeedTab.MusicTemplate)) {
            ClipFeedTab.CatalogClip catalogClip = clipFeedTab instanceof ClipFeedTab.CatalogClip ? (ClipFeedTab.CatalogClip) clipFeedTab : null;
        }
        if (sdkVideoFile instanceof SdkClipVideoFile) {
            return m((SdkClipVideoFile) sdkVideoFile);
        }
        if (((clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip)) && (sdkVideoFile instanceof SdkClipVideoFile)) {
            return m((SdkClipVideoFile) sdkVideoFile);
        }
        boolean z = sdkVideoFile instanceof SdkClipVideoFile;
        if (z && dgd.f(sdkVideoFile)) {
            SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) sdkVideoFile;
            FeedItem.l aVar = new FeedItem.a(this.a.a(), this.b.a, this.c, sdkClipVideoFile, c(sdkClipVideoFile), a(sdkClipVideoFile), b(sdkClipVideoFile), wp50Var);
            n(aVar);
            return aVar;
        }
        if (!z) {
            if (sdkVideoFile.v()) {
                return k(sdkVideoFile);
            }
            return null;
        }
        FeedItem.f j = j(this, (SdkClipVideoFile) sdkVideoFile, wp50Var);
        if (clipFeedCacheInfo != null && (indexOf = clipFeedCacheInfo.b.indexOf(j.e.r1())) >= 0) {
            j = FeedItem.f.a(j, null, new y0r(indexOf, clipFeedCacheInfo.c), null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
        }
        n(j);
        return j;
    }

    public final ArrayList h(List list, ClipFeedCacheInfo clipFeedCacheInfo) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FeedItem.d g = g((SdkVideoFile) it.next(), clipFeedCacheInfo, null);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public final FeedItem.f i(SdkClipVideoFile sdkClipVideoFile, wp50 wp50Var, ClipsFeedDecorationPayload clipsFeedDecorationPayload) {
        SdkMusicTrack V = sdkClipVideoFile.V();
        String str = V != null ? V.b : null;
        xod xodVar = this.d;
        sdkClipVideoFile.ea(xodVar.b(str));
        SdkMusicTrack V2 = sdkClipVideoFile.V();
        sdkClipVideoFile.R4(xodVar.d(V2 != null ? l(V2) : null));
        return new FeedItem.f(this.a.a(), this.b.a, this.c, sdkClipVideoFile, null, c(sdkClipVideoFile), a(sdkClipVideoFile), b(sdkClipVideoFile), wp50Var, null, clipsFeedDecorationPayload);
    }

    public final FeedItem.i k(SdkVideoFile sdkVideoFile) {
        return new FeedItem.i(this.a.a(), this.b.a, sdkVideoFile, c(sdkVideoFile), a(sdkVideoFile), b(sdkVideoFile), this.c instanceof ClipFeedTab.TopVideo);
    }

    public final FeedItem.k m(SdkClipVideoFile sdkClipVideoFile) {
        SdkMusicTrack V = sdkClipVideoFile.V();
        String str = V != null ? V.b : null;
        xod xodVar = this.d;
        sdkClipVideoFile.ea(xodVar.b(str));
        SdkMusicTrack V2 = sdkClipVideoFile.V();
        sdkClipVideoFile.R4(xodVar.d(V2 != null ? l(V2) : null));
        return new FeedItem.k(this.a.a(), this.b.a, this.c, sdkClipVideoFile, null, c(sdkClipVideoFile), a(sdkClipVideoFile), b(sdkClipVideoFile));
    }

    public final void n(FeedItem.l lVar) {
        Map<AdStatPixel.Type, List<AdStatPixel>> f6 = lVar.k().f6();
        if (f6.isEmpty()) {
            return;
        }
        this.e.k(f6);
    }
}
