package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.podcast.OfflinePodcast;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MusicOfflineCatalogMapperImpl.kt */
/* loaded from: classes16.dex */
public final class aq40 {
    public final /* synthetic */ oq40 a = new oq40();
    public final /* synthetic */ zp40 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final lu70 g;
    public final String h;
    public final g5 i;
    public final i70 j;
    public final j70 k;

    public aq40(boolean z, boolean z2, boolean z3, boolean z4, lu70 lu70Var, String str, g5 g5Var, i70 i70Var, j70 j70Var) {
        Context context = e43.a;
        this.b = new zp40(context == null ? null : context);
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = lu70Var;
        this.h = str;
        this.i = g5Var;
        this.j = i70Var;
        this.k = j70Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static hda a(aq40 aq40Var, List list, List list2, boolean z, List list3, List list4, List list5, List list6, List list7, Map map, String str, int i) {
        int i2;
        Iterator it;
        long j;
        List list8 = (i & 64) != 0 ? EmptyList.b : list6;
        List list9 = (i & 128) != 0 ? null : list7;
        Map map2 = (i & 256) != 0 ? jgp.b : map;
        String str2 = (i & 512) != 0 ? "synthetic_offline_section" : str;
        boolean z2 = (i & 1024) == 0;
        j70 j70Var = aq40Var.k;
        nt70 nt70Var = new nt70(aq40Var.h);
        List list10 = list;
        Iterator it2 = list10.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 += ((MusicTrack) it2.next()).f;
        }
        List list11 = list9;
        long j2 = i3;
        Iterator it3 = list8.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            i4 += ((MusicTrack) it3.next()).f;
        }
        long j3 = i4;
        Iterator it4 = list2.iterator();
        int i5 = 0;
        while (it4.hasNext()) {
            int i6 = 0;
            for (Iterator it5 = ((Playlist) it4.next()).y.iterator(); it5.hasNext(); it5 = it5) {
                i6 += ((MusicTrack) it5.next()).f;
            }
            i5 += i6;
        }
        long j4 = i5;
        List list12 = list3;
        ArrayList arrayList = new ArrayList();
        for (Iterator it6 = list12.iterator(); it6.hasNext(); it6 = it6) {
            g5g.y(((Playlist) it6.next()).y, arrayList);
        }
        int i7 = 0;
        for (Iterator it7 = arrayList.iterator(); it7.hasNext(); it7 = it7) {
            i7 += ((MusicTrack) it7.next()).f;
        }
        long j5 = i7;
        Iterator it8 = list4.iterator();
        long j6 = 0;
        while (it8.hasNext()) {
            j6 += ((OfflinePodcast) it8.next()).d;
            j5 = j5;
        }
        long j7 = j5;
        Iterator it9 = list5.iterator();
        long j8 = 0;
        while (it9.hasNext()) {
            Iterable iterable = ((AudioBook) it9.next()).k;
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterator it10 = iterable.iterator();
            long j9 = 0;
            while (it10.hasNext()) {
                Iterator it11 = it9;
                AudioBookFile audioBookFile = ((AudioBookChapter) it10.next()).d;
                if (audioBookFile != null) {
                    it = it10;
                    j = audioBookFile.c;
                } else {
                    it = it10;
                    j = 0;
                }
                j9 += j;
                it9 = it11;
                it10 = it;
            }
            j8 += j9;
        }
        yp40 yp40Var = new yp40(j2, j3, j4, j7, j6, j8);
        nt70Var.l = list;
        nt70Var.n = list3;
        nt70Var.m = list2;
        nt70Var.o = list4;
        nt70Var.p = list5;
        nt70Var.q = list8;
        nt70Var.f = z2;
        nt70Var.t = ((laa) j70Var.c).j;
        nt70Var.r = list11 == null ? EmptyList.b : list11;
        nt70Var.g = myc0.f(((laa) aq40Var.j.c).i);
        nt70Var.k = yp40Var;
        nt70Var.s = j5g.O0(map2.keySet());
        boolean z3 = aq40Var.c;
        Iterator it12 = e43.l("empty_placeholder_tracks", "empty_placeholder_playlists", "empty_placeholder_albums", "empty_podcasts_placeholder", "empty_audio_books_placeholder", "empty_autodownload_placeholder").iterator();
        while (true) {
            boolean z4 = z3;
            Iterator it13 = it12;
            if (!it12.hasNext()) {
                List list13 = list8;
                nt70Var.h.put("subscription_placeholder_big", Integer.valueOf(z4 ? R.string.catalog_offline_kids_absent_subscription : R.string.catalog_offline_absent_subscription_redesign));
                mt70 a = nt70Var.a(((laa) aq40Var.i.c).h);
                Object g = z ? lu70.g(aq40Var.g, a, str2, 4) : aq40Var.g.e(a);
                ArrayList u0 = j5g.u0(list10, list13);
                HashMap hashMap = new HashMap(u0.size());
                for (Iterator it14 = u0.iterator(); it14.hasNext(); it14 = it14) {
                    Object next = it14.next();
                    hashMap.put(((MusicTrack) next).Fb(), next);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
                ArrayList u02 = j5g.u0(list11 == null ? EmptyList.b : list11, j5g.u0(list12, list2));
                HashMap hashMap2 = new HashMap(u02.size());
                Iterator it15 = u02.iterator();
                while (it15.hasNext()) {
                    Object next2 = it15.next();
                    hashMap2.put(((Playlist) next2).Ib(), next2);
                    linkedHashMap = linkedHashMap;
                }
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(hashMap2);
                List list14 = list5;
                HashMap hashMap3 = new HashMap(list14.size());
                for (Object obj : list14) {
                    hashMap3.put(String.valueOf(((AudioBook) obj).b), obj);
                    linkedHashMap3 = linkedHashMap3;
                }
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(hashMap3);
                List list15 = list4;
                HashMap hashMap4 = new HashMap(list15.size());
                for (Object obj2 : list15) {
                    hashMap4.put(((OfflinePodcast) obj2).b.e(), obj2);
                    linkedHashMap5 = linkedHashMap5;
                }
                LinkedHashMap linkedHashMap6 = linkedHashMap5;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(hashMap4);
                String str3 = ((laa) j70Var.c).j;
                oq40 oq40Var = aq40Var.a;
                LinkedHashMap m = pn00.m(new Pair("empty_placeholder", oq40Var.b(a, "synthetic_offline_placeholder_id", str3)), new Pair("empty_podcasts_placeholder", oq40Var.b(a, "empty_podcasts_placeholder", str3)), new Pair("empty_audio_books_placeholder", oq40Var.b(a, "empty_audio_books_placeholder", str3)), new Pair("empty_placeholder_tracks", oq40Var.b(a, "empty_placeholder_tracks", str3)), new Pair("empty_placeholder_playlists", oq40Var.b(a, "empty_placeholder_playlists", str3)), new Pair("empty_placeholder_albums", oq40Var.b(a, "empty_placeholder_albums", str3)), new Pair("subscription_placeholder_small", oq40Var.c(Integer.valueOf(R.string.catalog_offline_absent_subscription_redesign))), new Pair("subscription_placeholder_big", oq40Var.a(a.a("subscription_placeholder_big"))), new Pair("status_item", oq40.d(oq40Var, "", null, null, null, 10)));
                OfflineCatalogCategories offlineCatalogCategories = OfflineCatalogCategories.AutoDownload;
                if (!aq40Var.f || yp40Var.b <= 0) {
                    offlineCatalogCategories = null;
                }
                OfflineCatalogCategories offlineCatalogCategories2 = OfflineCatalogCategories.Playlists;
                OfflineCatalogCategories offlineCatalogCategories3 = OfflineCatalogCategories.Albums;
                OfflineCatalogCategories offlineCatalogCategories4 = OfflineCatalogCategories.Podcasts;
                if (!aq40Var.d) {
                    offlineCatalogCategories4 = null;
                }
                OfflineCatalogCategories offlineCatalogCategories5 = OfflineCatalogCategories.Audiobooks;
                if (!aq40Var.e) {
                    offlineCatalogCategories5 = null;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(aq40Var.b.a(yp40Var, rl3.I(new OfflineCatalogCategories[]{offlineCatalogCategories, offlineCatalogCategories2, offlineCatalogCategories3, offlineCatalogCategories4, offlineCatalogCategories5})));
                linkedHashMap8.putAll(map2);
                return new hda(g, new CatalogExtendedData(null, null, null, null, null, null, null, null, linkedHashMap4, null, null, null, null, linkedHashMap2, null, linkedHashMap8, null, null, null, null, null, null, null, null, m, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap7, null, null, null, linkedHashMap6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16818433, -34817, 7, null), null);
            }
            String str4 = (String) it13.next();
            if (!z4) {
                switch (str4.hashCode()) {
                    case -1820752317:
                        if (str4.equals("empty_audio_books_placeholder")) {
                            i2 = R.string.catalog_offline_empty_audio_books;
                            break;
                        }
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                    case -191878443:
                        if (str4.equals("empty_podcasts_placeholder")) {
                            i2 = R.string.catalog_offline_empty_podcasts;
                            break;
                        }
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                    case 112812963:
                        if (str4.equals("empty_placeholder_playlists")) {
                            i2 = R.string.catalog_offline_empty_playlists;
                            break;
                        }
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                    case 1143630946:
                        if (str4.equals("empty_placeholder_albums")) {
                            i2 = R.string.catalog_offline_empty_albums;
                            break;
                        }
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                    case 1693078790:
                        if (str4.equals("empty_placeholder_tracks")) {
                            i2 = R.string.catalog_offline_empty_tracks;
                            break;
                        }
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                    case 2089025309:
                        str4.equals("empty_autodownload_placeholder");
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                    default:
                        i2 = R.string.catalog_offline_empty_redesign;
                        break;
                }
            } else {
                i2 = R.string.catalog_kids_offline_empty;
            }
            nt70Var.h.put(str4, Integer.valueOf(i2));
            it12 = it13;
            z3 = z4;
        }
    }
}
