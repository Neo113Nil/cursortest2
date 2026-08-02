package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import java.util.List;
import xsna.tfp0;

/* compiled from: TrackMenuPatch.kt */
/* loaded from: classes3.dex */
public interface bgp0 extends xl50 {

    /* compiled from: TrackMenuPatch.kt */
    public static final class a implements bgp0 {
        public final List<tfp0.b> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends tfp0.b> list) {
            this.b = list;
        }
    }

    /* compiled from: TrackMenuPatch.kt */
    public static final class b implements bgp0 {
    }

    /* compiled from: TrackMenuPatch.kt */
    public static final class c implements bgp0 {
        public final MusicTrack b;
        public final DownloadingState c;

        public c(MusicTrack musicTrack, DownloadingState downloadingState) {
            this.b = musicTrack;
            this.c = downloadingState;
        }
    }

    /* compiled from: TrackMenuPatch.kt */
    public static final class d implements bgp0 {
        public final String b;
        public final String c;

        public d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }
    }
}
