package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;

/* compiled from: ClipsPlaylistPickerNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface uqe {

    /* compiled from: ClipsPlaylistPickerNavigationEvent.kt */
    public static final class a implements uqe {
        public static final a a = new a();
    }

    /* compiled from: ClipsPlaylistPickerNavigationEvent.kt */
    public static final class b implements uqe {
        public static final b a = new b();
    }

    /* compiled from: ClipsPlaylistPickerNavigationEvent.kt */
    public static final class c implements uqe {
        public final ClipsPlaylist a;

        public c(ClipsPlaylist clipsPlaylist) {
            this.a = clipsPlaylist;
        }
    }
}
