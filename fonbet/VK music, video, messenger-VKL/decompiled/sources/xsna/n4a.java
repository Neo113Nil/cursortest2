package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistRecommendationData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: CatalogDownloadMarkerProcessor.kt */
/* loaded from: classes16.dex */
public final class n4a extends ida {
    public final bpn0 a;

    public n4a(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    public static CatalogSection f(CatalogSection catalogSection) {
        Set R0 = j5g.R0(catalogSection.h);
        g5g.y(s9a.a, R0);
        return CatalogSection.zb(catalogSection, null, null, j5g.O0(R0), null, 16319);
    }

    @Override // xsna.ida
    public final hda b(hda hdaVar, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        catalogExtendedData.zb(g(hdaVar));
        return new hda(catalogBlock, catalogExtendedData, hdaVar.c);
    }

    @Override // xsna.ida
    public final hda c(hda hdaVar, CatalogCatalog catalogCatalog, CatalogExtendedData catalogExtendedData) {
        CatalogExtendedData g = g(hdaVar);
        List<CatalogSection> list = catalogCatalog.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f((CatalogSection) it.next()));
        }
        CatalogCatalog zb = CatalogCatalog.zb(catalogCatalog, arrayList, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        catalogExtendedData.zb(g);
        return new hda(zb, catalogExtendedData, hdaVar.c);
    }

    @Override // xsna.ida
    public final CatalogReplacementResponse d(CatalogReplacementResponse catalogReplacementResponse) {
        CatalogExtendedData catalogExtendedData = catalogReplacementResponse.c;
        List<CatalogReplacement> list = catalogReplacementResponse.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((CatalogReplacement) it.next()).c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ArrayList Gb = ((CatalogBlock) it2.next()).Gb(catalogExtendedData);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = Gb.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof MusicTrack)) {
                    next = null;
                }
                MusicTrack musicTrack = (MusicTrack) next;
                if (musicTrack != null) {
                    arrayList3.add(musicTrack);
                }
            }
            g5g.y(arrayList3, arrayList2);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ArrayList Gb2 = ((CatalogBlock) it4.next()).Gb(catalogExtendedData);
            ArrayList arrayList5 = new ArrayList();
            Iterator it5 = Gb2.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (!(next2 instanceof Playlist)) {
                    next2 = null;
                }
                Playlist playlist = (Playlist) next2;
                if (playlist != null) {
                    arrayList5.add(playlist);
                }
            }
            g5g.y(arrayList5, arrayList4);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ArrayList Gb3 = ((CatalogBlock) it6.next()).Gb(catalogExtendedData);
            ArrayList arrayList7 = new ArrayList();
            Iterator it7 = Gb3.iterator();
            while (it7.hasNext()) {
                Object next3 = it7.next();
                if (!(next3 instanceof PlaylistRecommendationData)) {
                    next3 = null;
                }
                PlaylistRecommendationData playlistRecommendationData = (PlaylistRecommendationData) next3;
                if (playlistRecommendationData != null) {
                    arrayList7.add(playlistRecommendationData);
                }
            }
            g5g.y(arrayList7, arrayList6);
        }
        ArrayList arrayList8 = new ArrayList(c5g.u(arrayList6, 10));
        Iterator it8 = arrayList6.iterator();
        while (it8.hasNext()) {
            arrayList8.add(((PlaylistRecommendationData) it8.next()).b);
        }
        bpn0 bpn0Var = this.a;
        List<MusicTrack> d = ((abo) bpn0Var.getValue()).d(arrayList2);
        List<Playlist> c = ((abo) bpn0Var.getValue()).c(j5g.u0(arrayList8, arrayList4));
        List<MusicTrack> list2 = d;
        HashMap hashMap = new HashMap(list2.size());
        for (MusicTrack musicTrack2 : list2) {
            hashMap.put(musicTrack2.Fb(), musicTrack2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        List<Playlist> list3 = c;
        HashMap hashMap2 = new HashMap(list3.size());
        for (Playlist playlist2 : list3) {
            hashMap2.put(playlist2.Ib(), playlist2);
        }
        catalogExtendedData.zb(new CatalogExtendedData(null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap2), null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8449, -1, 7, null));
        return catalogReplacementResponse;
    }

    @Override // xsna.ida
    public final hda e(hda hdaVar, CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
        CatalogExtendedData g = g(hdaVar);
        CatalogSection f = f(catalogSection);
        catalogExtendedData.zb(g);
        return new hda(f, catalogExtendedData, hdaVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.abo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList, java.util.Collection] */
    public final CatalogExtendedData g(hda hdaVar) {
        ?? r4;
        ?? r6;
        ?? r2;
        Object obj = hdaVar.a;
        CatalogExtendedData catalogExtendedData = hdaVar.b;
        if (obj instanceof CatalogCatalog) {
            List<CatalogSection> list = ((CatalogCatalog) obj).b;
            r4 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<CatalogBlock> list2 = ((CatalogSection) it.next()).i;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ArrayList Gb = ((CatalogBlock) it2.next()).Gb(catalogExtendedData);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = Gb.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (!(next instanceof MusicTrack)) {
                            next = null;
                        }
                        MusicTrack musicTrack = (MusicTrack) next;
                        if (musicTrack != null) {
                            arrayList2.add(musicTrack);
                        }
                    }
                    g5g.y(arrayList2, arrayList);
                }
                g5g.y(arrayList, r4);
            }
        } else if (obj instanceof CatalogSection) {
            List<CatalogBlock> list3 = ((CatalogSection) obj).i;
            r4 = new ArrayList();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                ArrayList Gb2 = ((CatalogBlock) it4.next()).Gb(catalogExtendedData);
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = Gb2.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (!(next2 instanceof MusicTrack)) {
                        next2 = null;
                    }
                    MusicTrack musicTrack2 = (MusicTrack) next2;
                    if (musicTrack2 != null) {
                        arrayList3.add(musicTrack2);
                    }
                }
                g5g.y(arrayList3, r4);
            }
        } else if (obj instanceof CatalogBlock) {
            ArrayList Gb3 = ((CatalogBlock) obj).Gb(catalogExtendedData);
            r4 = new ArrayList();
            Iterator it6 = Gb3.iterator();
            while (it6.hasNext()) {
                Object next3 = it6.next();
                if (!(next3 instanceof MusicTrack)) {
                    next3 = null;
                }
                MusicTrack musicTrack3 = (MusicTrack) next3;
                if (musicTrack3 != null) {
                    r4.add(musicTrack3);
                }
            }
        } else {
            r4 = EmptyList.b;
        }
        boolean z = obj instanceof CatalogCatalog;
        if (z) {
            List<CatalogSection> list4 = ((CatalogCatalog) obj).b;
            r6 = new ArrayList();
            Iterator it7 = list4.iterator();
            while (it7.hasNext()) {
                List<CatalogBlock> list5 = ((CatalogSection) it7.next()).i;
                ArrayList arrayList4 = new ArrayList();
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    ArrayList Gb4 = ((CatalogBlock) it8.next()).Gb(catalogExtendedData);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it9 = Gb4.iterator();
                    while (it9.hasNext()) {
                        Object next4 = it9.next();
                        if (!(next4 instanceof Playlist)) {
                            next4 = null;
                        }
                        Playlist playlist = (Playlist) next4;
                        if (playlist != null) {
                            arrayList5.add(playlist);
                        }
                    }
                    g5g.y(arrayList5, arrayList4);
                }
                g5g.y(arrayList4, r6);
            }
        } else if (obj instanceof CatalogSection) {
            List<CatalogBlock> list6 = ((CatalogSection) obj).i;
            r6 = new ArrayList();
            Iterator it10 = list6.iterator();
            while (it10.hasNext()) {
                ArrayList Gb5 = ((CatalogBlock) it10.next()).Gb(catalogExtendedData);
                ArrayList arrayList6 = new ArrayList();
                Iterator it11 = Gb5.iterator();
                while (it11.hasNext()) {
                    Object next5 = it11.next();
                    if (!(next5 instanceof Playlist)) {
                        next5 = null;
                    }
                    Playlist playlist2 = (Playlist) next5;
                    if (playlist2 != null) {
                        arrayList6.add(playlist2);
                    }
                }
                g5g.y(arrayList6, r6);
            }
        } else if (obj instanceof CatalogBlock) {
            ArrayList Gb6 = ((CatalogBlock) obj).Gb(catalogExtendedData);
            r6 = new ArrayList();
            Iterator it12 = Gb6.iterator();
            while (it12.hasNext()) {
                Object next6 = it12.next();
                if (!(next6 instanceof Playlist)) {
                    next6 = null;
                }
                Playlist playlist3 = (Playlist) next6;
                if (playlist3 != null) {
                    r6.add(playlist3);
                }
            }
        } else {
            r6 = EmptyList.b;
        }
        if (z) {
            List<CatalogSection> list7 = ((CatalogCatalog) obj).b;
            r2 = new ArrayList();
            Iterator it13 = list7.iterator();
            while (it13.hasNext()) {
                List<CatalogBlock> list8 = ((CatalogSection) it13.next()).i;
                ArrayList arrayList7 = new ArrayList();
                Iterator it14 = list8.iterator();
                while (it14.hasNext()) {
                    ArrayList Gb7 = ((CatalogBlock) it14.next()).Gb(catalogExtendedData);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it15 = Gb7.iterator();
                    while (it15.hasNext()) {
                        Object next7 = it15.next();
                        if (!(next7 instanceof PlaylistRecommendationData)) {
                            next7 = null;
                        }
                        PlaylistRecommendationData playlistRecommendationData = (PlaylistRecommendationData) next7;
                        if (playlistRecommendationData != null) {
                            arrayList8.add(playlistRecommendationData);
                        }
                    }
                    g5g.y(arrayList8, arrayList7);
                }
                g5g.y(arrayList7, r2);
            }
        } else if (obj instanceof CatalogSection) {
            List<CatalogBlock> list9 = ((CatalogSection) obj).i;
            r2 = new ArrayList();
            Iterator it16 = list9.iterator();
            while (it16.hasNext()) {
                ArrayList Gb8 = ((CatalogBlock) it16.next()).Gb(catalogExtendedData);
                ArrayList arrayList9 = new ArrayList();
                Iterator it17 = Gb8.iterator();
                while (it17.hasNext()) {
                    Object next8 = it17.next();
                    if (!(next8 instanceof PlaylistRecommendationData)) {
                        next8 = null;
                    }
                    PlaylistRecommendationData playlistRecommendationData2 = (PlaylistRecommendationData) next8;
                    if (playlistRecommendationData2 != null) {
                        arrayList9.add(playlistRecommendationData2);
                    }
                }
                g5g.y(arrayList9, r2);
            }
        } else if (obj instanceof CatalogBlock) {
            ArrayList Gb9 = ((CatalogBlock) obj).Gb(catalogExtendedData);
            r2 = new ArrayList();
            Iterator it18 = Gb9.iterator();
            while (it18.hasNext()) {
                Object next9 = it18.next();
                if (!(next9 instanceof PlaylistRecommendationData)) {
                    next9 = null;
                }
                PlaylistRecommendationData playlistRecommendationData3 = (PlaylistRecommendationData) next9;
                if (playlistRecommendationData3 != null) {
                    r2.add(playlistRecommendationData3);
                }
            }
        } else {
            r2 = EmptyList.b;
        }
        Iterable iterable = (Iterable) r2;
        ArrayList arrayList10 = new ArrayList(c5g.u(iterable, 10));
        Iterator it19 = iterable.iterator();
        while (it19.hasNext()) {
            arrayList10.add(((PlaylistRecommendationData) it19.next()).b);
        }
        bpn0 bpn0Var = this.a;
        List<MusicTrack> d = ((abo) bpn0Var.getValue()).d(r4);
        List<Playlist> c = ((abo) bpn0Var.getValue()).c(j5g.u0(arrayList10, (Collection) r6));
        List<MusicTrack> list10 = d;
        HashMap hashMap = new HashMap(list10.size());
        for (MusicTrack musicTrack4 : list10) {
            hashMap.put(musicTrack4.Fb(), musicTrack4);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        List<Playlist> list11 = c;
        HashMap hashMap2 = new HashMap(list11.size());
        for (Playlist playlist4 : list11) {
            hashMap2.put(playlist4.Ib(), playlist4);
        }
        return new CatalogExtendedData(null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap2), null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8449, -1, 7, null);
    }
}
