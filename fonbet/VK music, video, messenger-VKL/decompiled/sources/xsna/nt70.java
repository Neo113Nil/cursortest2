package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.OfflinePodcast;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;

/* compiled from: OfflineCatalogConfigBuilder.kt */
/* loaded from: classes16.dex */
public final class nt70 {
    public final String a;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int i;
    public int j;
    public yp40 k;
    public List<MusicTrack> l;
    public List<Playlist> m;
    public List<Playlist> n;
    public List<OfflinePodcast> o;
    public List<AudioBook> p;
    public List<MusicTrack> q;
    public List<Playlist> r;
    public List<String> s;
    public String t;
    public final bpn0 b = new bpn0(new x750(this, 5));
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new tju(this, 14));
    public final LinkedHashMap h = new LinkedHashMap();

    public nt70(String str) {
        this.a = str;
        this.i = c() ? R.string.catalog_offline_empty_redesign : R.string.catalog_offline_empty;
        this.j = c() ? R.string.catalog_offline_empty_query_regesign : R.string.catalog_offline_empty_query;
        this.k = yp40.h;
        EmptyList emptyList = EmptyList.b;
        this.l = emptyList;
        this.m = emptyList;
        this.n = emptyList;
        this.o = emptyList;
        this.p = emptyList;
        this.q = emptyList;
        this.r = emptyList;
        this.s = emptyList;
        this.t = "";
    }

    public static final void b(MapBuilder mapBuilder, OfflineCatalogCategories offlineCatalogCategories, ArrayList arrayList) {
        mapBuilder.put(offlineCatalogCategories.o(), on00.f(new Pair(offlineCatalogCategories.i(), arrayList)));
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0250 A[EDGE_INSN: B:84:0x0250->B:58:0x0250 BREAK  A[LOOP:9: B:77:0x0239->B:83:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mt70 a(String str) {
        List<Playlist> list;
        Iterator<T> it;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(CatalogDataType.DATA_TYPE_PLACEHOLDER, e43.o("empty_placeholder", "empty_podcasts_placeholder", "empty_audio_books_placeholder", "empty_placeholder_tracks", "empty_placeholder_playlists", "empty_placeholder_albums", "subscription_placeholder_small", "subscription_placeholder_big", "status_item"));
        CatalogDataType i = OfflineCatalogCategories.Tracks.i();
        List<MusicTrack> list2 = this.l;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MusicTrack) it2.next()).Fb());
        }
        mapBuilder.put(i, arrayList);
        CatalogDataType i2 = OfflineCatalogCategories.Playlists.i();
        List<Playlist> list3 = this.m;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Playlist) it3.next()).Ib());
        }
        mapBuilder.put(i2, arrayList2);
        mapBuilder.put(CatalogDataType.DATA_TYPE_LINKS, new ArrayList(this.s));
        MapBuilder h = mapBuilder.h();
        MapBuilder mapBuilder2 = new MapBuilder();
        OfflineCatalogCategories offlineCatalogCategories = OfflineCatalogCategories.Albums;
        List<Playlist> list4 = this.n;
        ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Playlist) it4.next()).Ib());
        }
        b(mapBuilder2, offlineCatalogCategories, arrayList3);
        OfflineCatalogCategories offlineCatalogCategories2 = OfflineCatalogCategories.Playlists;
        List<Playlist> list5 = this.m;
        ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
        Iterator<T> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((Playlist) it5.next()).Ib());
        }
        b(mapBuilder2, offlineCatalogCategories2, arrayList4);
        if (c()) {
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS;
            List<Playlist> list6 = this.r;
            ArrayList arrayList5 = new ArrayList(c5g.u(list6, 10));
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList5.add(((Playlist) it6.next()).Ib());
            }
            mapBuilder2.put("synthetic_offline_downloads_block_id", on00.f(new Pair(catalogDataType, arrayList5)));
            OfflineCatalogCategories offlineCatalogCategories3 = OfflineCatalogCategories.Podcasts;
            List<OfflinePodcast> list7 = this.o;
            ArrayList arrayList6 = new ArrayList(c5g.u(list7, 10));
            Iterator<T> it7 = list7.iterator();
            while (it7.hasNext()) {
                arrayList6.add(((OfflinePodcast) it7.next()).b.e());
            }
            b(mapBuilder2, offlineCatalogCategories3, arrayList6);
            OfflineCatalogCategories offlineCatalogCategories4 = OfflineCatalogCategories.Audiobooks;
            List<AudioBook> list8 = this.p;
            ArrayList arrayList7 = new ArrayList(c5g.u(list8, 10));
            Iterator<T> it8 = list8.iterator();
            while (it8.hasNext()) {
                arrayList7.add(String.valueOf(((AudioBook) it8.next()).b));
            }
            b(mapBuilder2, offlineCatalogCategories4, arrayList7);
            OfflineCatalogCategories offlineCatalogCategories5 = OfflineCatalogCategories.AutoDownload;
            List<MusicTrack> list9 = this.q;
            ArrayList arrayList8 = new ArrayList(c5g.u(list9, 10));
            Iterator<T> it9 = list9.iterator();
            while (it9.hasNext()) {
                arrayList8.add(((MusicTrack) it9.next()).Fb());
            }
            b(mapBuilder2, offlineCatalogCategories5, arrayList8);
        }
        MapBuilder h2 = mapBuilder2.h();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Context context2 = context;
        boolean z = this.d;
        boolean z2 = this.e;
        ListBuilder e = e43.e();
        if (!this.l.isEmpty()) {
            e.add(MusicCollectionType.AUDIOS);
        }
        if (c()) {
            if (!this.m.isEmpty()) {
                e.add(MusicCollectionType.PLAYLISTS);
            }
            if (!this.n.isEmpty()) {
                e.add(MusicCollectionType.ALBUMS);
            }
        } else {
            if (this.n.isEmpty()) {
                List<Playlist> list10 = this.m;
                if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                    Iterator<T> it10 = list10.iterator();
                    while (it10.hasNext()) {
                        if (((Playlist) it10.next()).Eb()) {
                        }
                    }
                }
                list = this.m;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((Playlist) it.next()).Eb()) {
                            e.add(MusicCollectionType.PLAYLISTS);
                            break;
                        }
                    }
                }
            }
            e.add(MusicCollectionType.ALBUMS);
            list = this.m;
            if (list instanceof Collection) {
            }
            it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
        }
        ListBuilder g = e.g();
        int i3 = this.i;
        int i4 = this.j;
        boolean z3 = this.f;
        boolean z4 = this.g;
        yp40 yp40Var = this.k;
        boolean booleanValue = ((Boolean) this.b.getValue()).booleanValue();
        boolean c = c();
        String str2 = this.t;
        Iterator<T> it11 = this.o.iterator();
        int i5 = 0;
        while (it11.hasNext()) {
            i5 += ((OfflinePodcast) it11.next()).c;
        }
        return new mt70(str, h, h2, context2, this.a, z, z2, g, this.h, i3, i4, z3, str2, z4, yp40Var, booleanValue, c, i5);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
