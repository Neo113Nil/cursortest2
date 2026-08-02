package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;

/* compiled from: MusicTrackMenuPatch.kt */
/* loaded from: classes3.dex */
public interface fd50 extends xl50 {

    /* compiled from: MusicTrackMenuPatch.kt */
    public static final class a implements fd50 {
        public final ArrayList b;
        public final ArrayList c;

        public a(ArrayList arrayList, ArrayList arrayList2) {
            this.b = arrayList;
            this.c = arrayList2;
        }
    }

    /* compiled from: MusicTrackMenuPatch.kt */
    public static final class b implements fd50 {
        public final MusicTrack b;
        public final DownloadingState c;

        public b(MusicTrack musicTrack, DownloadingState downloadingState) {
            this.b = musicTrack;
            this.c = downloadingState;
        }
    }

    /* compiled from: MusicTrackMenuPatch.kt */
    public static final class c implements fd50 {
        public final Long b;

        public c(Long l) {
            this.b = l;
        }
    }
}
