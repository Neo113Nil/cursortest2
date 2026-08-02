package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.profile.ProfilePrivacy$Category;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* compiled from: ProfileContentItem.kt */
/* loaded from: classes5.dex */
public abstract class cvd0 {

    /* compiled from: ProfileContentItem.kt */
    public static final class a {
        public final List<Playlist> a;
        public final List<MusicTrack> b;
        public final ProfilePrivacy$Category c;

        public a(List<Playlist> list, List<MusicTrack> list2, ProfilePrivacy$Category profilePrivacy$Category) {
            this.a = list;
            this.b = list2;
            this.c = profilePrivacy$Category;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class.equals(obj.getClass())) {
                a aVar = obj instanceof a ? (a) obj : null;
                if (aVar != null) {
                    List<MusicTrack> list = aVar.b;
                    List<MusicTrack> list2 = this.b;
                    if (list.containsAll(list2) && list.size() == list2.size()) {
                        List<Playlist> list3 = aVar.a;
                        List<Playlist> list4 = list3;
                        boolean z = list4 instanceof Collection;
                        List<Playlist> list5 = this.a;
                        if (!z || !list4.isEmpty()) {
                            loop0: for (Playlist playlist : list4) {
                                List<Playlist> list6 = list5;
                                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                    for (Playlist playlist2 : list6) {
                                        if (!epx.f(playlist, playlist2) || !epx.f(playlist.h, playlist2.h) || !epx.f(playlist.Cb(), playlist2.Cb())) {
                                        }
                                    }
                                    break loop0;
                                }
                                break;
                            }
                        }
                        if (list3.size() != list5.size() || aVar.c != this.c) {
                            break;
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            ProfilePrivacy$Category profilePrivacy$Category = this.c;
            return a + (profilePrivacy$Category != null ? profilePrivacy$Category.hashCode() : 0);
        }

        public final String toString() {
            return "MusicWrapper(playlists=" + this.a + ", musicTracks=" + this.b + ", privacyCategory=" + this.c + ')';
        }
    }

    /* compiled from: ProfileContentItem.kt */
    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            boolean z = obj instanceof b;
            b bVar = z ? (b) obj : null;
            if (bVar != null) {
                ArrayList arrayList = bVar.a;
                ArrayList arrayList2 = this.a;
                if (arrayList2.size() == arrayList.size()) {
                    Object[] array = arrayList2.toArray(new Narrative[0]);
                    b bVar2 = z ? (b) obj : null;
                    if (jw5.c(array, bVar2 != null ? (Narrative[]) bVar2.a.toArray(new Narrative[0]) : null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            Iterator it = this.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((Narrative) it.next()).hashCode();
            }
            return i;
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("NarrativesWrapper(data="), this.a);
        }
    }

    /* compiled from: ProfileContentItem.kt */
    public static final class c {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            boolean z;
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                ArrayList arrayList = cVar.a;
                ArrayList arrayList2 = this.a;
                boolean z2 = arrayList2.size() == arrayList.size();
                ArrayList X0 = j5g.X0(arrayList2, arrayList);
                if (!X0.isEmpty()) {
                    Iterator it = X0.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        PhotoAlbum photoAlbum = (PhotoAlbum) pair.d();
                        PhotoAlbum photoAlbum2 = (PhotoAlbum) pair.g();
                        if (!epx.f(photoAlbum.g, photoAlbum2.g) || photoAlbum.f != photoAlbum2.f || !epx.f(photoAlbum.i, photoAlbum2.i) || !epx.f(photoAlbum.s, photoAlbum2.s) || photoAlbum.d != photoAlbum2.d || photoAlbum.b != photoAlbum2.b || !epx.f(photoAlbum.k, photoAlbum2.k) || !epx.f(photoAlbum.l, photoAlbum2.l)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z2 && z) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = 0;
            for (PhotoAlbum photoAlbum : this.a) {
                i += Arrays.hashCode(new Object[]{photoAlbum.g, Integer.valueOf(photoAlbum.f), photoAlbum.i, photoAlbum.s, Integer.valueOf(photoAlbum.d), Integer.valueOf(photoAlbum.b), photoAlbum.k, photoAlbum.l}) * 31;
            }
            return i;
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("PhotoAlbumsWrapper(albums="), this.a);
        }
    }

    /* compiled from: ProfileContentItem.kt */
    public static final class d {
        public final ArrayList a;
        public final Set<Integer> b;
        public final int c;

        public d(ArrayList arrayList, Set set, int i) {
            this.a = arrayList;
            this.b = set;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar == null) {
                return false;
            }
            ArrayList arrayList = dVar.a;
            ArrayList arrayList2 = this.a;
            if (arrayList2.size() != arrayList.size()) {
                return false;
            }
            ArrayList X0 = j5g.X0(arrayList2, arrayList);
            if (!X0.isEmpty()) {
                Iterator it = X0.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Photo photo = (Photo) pair.d();
                    Photo photo2 = (Photo) pair.g();
                    if (!epx.f(photo, photo2) || !epx.f(photo.L, photo2.L)) {
                        return false;
                    }
                }
            }
            return epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return ((j5g.F0(this.b) + (this.a.hashCode() * 961)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotosWrapper(photos=");
            sb.append(this.a);
            sb.append(", tagsCount=0, unblurredPhotoIds=");
            sb.append(this.b);
            sb.append(", totalCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ProfileContentItem.kt */
    public static final class e {
        public final List<VideoAlbum> a;

        public e(List<VideoAlbum> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            e eVar = obj instanceof e ? (e) obj : null;
            if (eVar == null) {
                return false;
            }
            ArrayList X0 = j5g.X0(this.a, eVar.a);
            if (X0.isEmpty()) {
                return true;
            }
            Iterator it = X0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                VideoAlbum videoAlbum = (VideoAlbum) pair.d();
                VideoAlbum videoAlbum2 = (VideoAlbum) pair.g();
                if (videoAlbum.b != videoAlbum2.b || !epx.f(videoAlbum.j, videoAlbum2.j) || !epx.f(videoAlbum.d, videoAlbum2.d) || videoAlbum.f != videoAlbum2.f || !epx.f(videoAlbum.h, videoAlbum2.h)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("VideoAlbumsWrapper(albums="), this.a);
        }
    }

    /* compiled from: ProfileContentItem.kt */
    public static final class f {
        public final ArrayList a;

        public f(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("VideoWrapper(data="), this.a);
        }
    }
}
