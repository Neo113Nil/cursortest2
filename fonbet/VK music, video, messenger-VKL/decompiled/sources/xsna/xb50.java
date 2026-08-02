package xsna;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.ju70;

/* compiled from: MusicTrackImageExtractor.kt */
/* loaded from: classes.dex */
public final class xb50 {
    public final bpn0 a = new bpn0(new u0f(3));
    public final bpn0 b = new bpn0(new zg9(8));

    /* compiled from: MusicTrackImageExtractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final List<Uri> a;
        public final List<Uri> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Uri> list, List<? extends Uri> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    public static a a(List list, List list2) {
        LinkedHashMap h = h(list);
        LinkedHashMap h2 = h(list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h2);
        Iterator it = h.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h);
        Iterator it2 = h2.keySet().iterator();
        while (it2.hasNext()) {
            linkedHashMap2.remove((String) it2.next());
        }
        return new a(j5g.O0(linkedHashMap.values()), j5g.O0(linkedHashMap2.values()));
    }

    public static Thumb g(Thumb thumb, List list) {
        SparseArray sparseArray = new SparseArray(thumb.Fb().size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Uri Cb = intValue == -1 ? thumb.Cb(Integer.MAX_VALUE, false) : thumb.Cb(intValue, false);
            if (Cb != null) {
                sparseArray.append(thumb.Fb().keyAt(thumb.Fb().indexOfValue(Cb)), Cb);
            }
        }
        return Thumb.zb(thumb, sparseArray, 7);
    }

    public static LinkedHashMap h(List list) {
        List<Uri> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Uri uri : list2) {
            linkedHashMap.put(ju70.a.a(uri), uri);
        }
        return linkedHashMap;
    }

    public final Playlist b(Playlist playlist) {
        Thumb thumb = playlist.m;
        return thumb == null ? playlist : Playlist.zb(playlist, g(thumb, (List) this.b.getValue()), null, null, null, -2049, 255);
    }

    public final List<Uri> c(MusicTrack musicTrack) {
        SparseArray<Uri> Fb;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Thumb Jb = musicTrack.Jb();
        if (Jb != null && (Fb = g(Jb, (List) this.a.getValue()).Fb()) != null) {
            int size = Fb.size();
            for (int i = 0; i < size; i++) {
                linkedHashSet.add(Fb.valueAt(i));
            }
        }
        return j5g.O0(linkedHashSet);
    }

    public final List<Uri> d(Playlist playlist) {
        List<Thumb> H0;
        SparseArray<Uri> Fb;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Thumb thumb = playlist.m;
        if (thumb != null) {
            H0 = Collections.singletonList(thumb);
        } else {
            List<Thumb> list = playlist.p;
            H0 = list != null ? j5g.H0(list, 4) : null;
        }
        if (H0 != null) {
            for (Thumb thumb2 : H0) {
                if (thumb2 != null && (Fb = g(thumb2, (List) this.b.getValue()).Fb()) != null) {
                    int size = Fb.size();
                    for (int i = 0; i < size; i++) {
                        linkedHashSet.add(Fb.valueAt(i));
                    }
                }
            }
        }
        return j5g.O0(linkedHashSet);
    }

    public final List<Uri> e(AudioBook audioBook) {
        SparseArray<Uri> Fb;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Image Cb = audioBook.Cb();
        Thumb thumb = Cb != null ? new Thumb(Cb) : null;
        if (thumb != null && (Fb = g(thumb, (List) this.b.getValue()).Fb()) != null) {
            int size = Fb.size();
            for (int i = 0; i < size; i++) {
                linkedHashSet.add(Fb.valueAt(i));
            }
        }
        return j5g.O0(linkedHashSet);
    }

    public final List<Uri> f(Podcast podcast) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<Thumb> list = podcast.f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SparseArray<Uri> Fb = g((Thumb) it.next(), (List) this.b.getValue()).Fb();
                int size = Fb.size();
                for (int i = 0; i < size; i++) {
                    linkedHashSet.add(Fb.valueAt(i));
                }
            }
        }
        return j5g.O0(linkedHashSet);
    }
}
