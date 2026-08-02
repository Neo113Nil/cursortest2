package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: DownloadedEntitiesMarker.kt */
/* loaded from: classes.dex */
public interface abo {
    List<MusicTrack> a(Playlist playlist, List<MusicTrack> list);

    AudioBook b(AudioBook audioBook);

    List<Playlist> c(List<Playlist> list);

    List<MusicTrack> d(List<MusicTrack> list);

    LinkedHashMap e(List list);

    List<MusicTrack> f(List<MusicTrack> list);

    Playlist g(Playlist playlist, ArrayList arrayList);

    /* compiled from: DownloadedEntitiesMarker.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final abo STUB = new C2536a();

        public final abo getSTUB() {
            return STUB;
        }

        /* compiled from: DownloadedEntitiesMarker.kt */
        /* renamed from: xsna.abo$a$a, reason: collision with other inner class name */
        public static final class C2536a implements abo {
            @Override // xsna.abo
            public final LinkedHashMap e(List list) {
                List<MusicTrack> list2 = list;
                int e = on00.e(c5g.u(list2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (MusicTrack musicTrack : list2) {
                    linkedHashMap.put(musicTrack.Fb(), musicTrack);
                }
                return linkedHashMap;
            }

            @Override // xsna.abo
            public final AudioBook b(AudioBook audioBook) {
                return audioBook;
            }

            @Override // xsna.abo
            public final List<Playlist> c(List<Playlist> list) {
                return list;
            }

            @Override // xsna.abo
            public final List<MusicTrack> d(List<MusicTrack> list) {
                return list;
            }

            @Override // xsna.abo
            public final List<MusicTrack> f(List<MusicTrack> list) {
                return list;
            }

            @Override // xsna.abo
            public final List<MusicTrack> a(Playlist playlist, List<MusicTrack> list) {
                return list;
            }

            @Override // xsna.abo
            public final Playlist g(Playlist playlist, ArrayList arrayList) {
                return playlist;
            }
        }
    }
}
