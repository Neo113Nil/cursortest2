package xsna;

import com.vkontakte.android.R;

/* compiled from: MusicPlayerSnackbarEvent.kt */
/* loaded from: classes3.dex */
public interface qy40 {

    /* compiled from: MusicPlayerSnackbarEvent.kt */
    public static abstract class a implements qy40 {
        public final int a;

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        /* renamed from: xsna.qy40$a$a, reason: collision with other inner class name */
        public static final class C3582a extends a {
            public static final C3582a b = new C3582a(R.string.music_player_snack_bar_chapter_removed_from_downloaded);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3582a);
            }

            public final int hashCode() {
                return 1247713409;
            }

            public final String toString() {
                return "ChapterRemovedFromDownloaded";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class b extends a {
            public static final b b = new b(R.string.music_player_snack_bar_common_error);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1963162976;
            }

            public final String toString() {
                return "CommonError";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class c extends a {
            public static final c b = new c(R.string.music_player_snack_bar_kids_shuffle_mode_applied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1269933963;
            }

            public final String toString() {
                return "KidsShuffleModeApplied";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class d extends a {
            public static final d b = new d(R.string.music_player_snack_bar_kids_track_loop_mode_applied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -957361227;
            }

            public final String toString() {
                return "KidsTrackLoopModeApplied";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class e extends a {
            public static final e b = new e(R.string.music_player_snack_bar_link_copied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1017280389;
            }

            public final String toString() {
                return "LinkCopied";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class f extends a {
            public static final f b = new f(R.string.music_player_snack_bar_network_error);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 969194071;
            }

            public final String toString() {
                return "NetworkError";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class g extends a {
            public static final g b = new g(R.string.music_player_snack_bar_podcast_listened);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -2085744296;
            }

            public final String toString() {
                return "PodcastEpisodeMarkedAsListened";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class h extends a {
            public static final h b = new h(R.string.music_player_snack_bar_queue_loop_mode_applied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1079892062;
            }

            public final String toString() {
                return "QueueLoopModeApplied";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class i extends a {
            public static final i b = new i(R.string.music_snack_bar_radio_added);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1428030750;
            }

            public final String toString() {
                return "RadioAdded";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class j extends a {
            public static final j b = new j(R.string.music_snack_bar_radio_removed);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -3063358;
            }

            public final String toString() {
                return "RadioRemoved";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class k extends a {
            public static final k b = new k(R.string.music_player_snack_bar_shuffle_mode_applied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1510467774;
            }

            public final String toString() {
                return "ShuffleModeApplied";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class l extends a {
            public static final l b = new l(R.string.music_player_snack_bar_playlist_has_already_be_saved);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -751913096;
            }

            public final String toString() {
                return "TrackListAlreadyBeSaved";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class m extends a {
            public static final m b = new m(R.string.music_player_snack_bar_track_loop_mode_applied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return -1732602840;
            }

            public final String toString() {
                return "TrackLoopModeApplied";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class n extends a {
            public static final n b = new n(R.string.music_player_snack_bar_playlist_created);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -79518744;
            }

            public final String toString() {
                return "TrackQueueSavedAsPlaylist";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class o extends a {
            public static final o b = new o(R.string.music_player_snack_bar_track_removed_from_downloaded);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return -256499325;
            }

            public final String toString() {
                return "TrackRemovedFromDownloaded";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class p extends a {
            public static final p b = new p(R.string.music_player_snack_bar_kids_track_removed_from_downloaded);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return 1238582736;
            }

            public final String toString() {
                return "TrackRemovedFromKidsDownloaded";
            }
        }

        /* compiled from: MusicPlayerSnackbarEvent.kt */
        public static final class q extends a {
            public static final q b = new q(R.string.music_player_snack_bar_track_unavailable_action);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 380238512;
            }

            public final String toString() {
                return "TrackUnavailableActionError";
            }
        }

        public a(int i2) {
            this.a = i2;
        }
    }

    /* compiled from: MusicPlayerSnackbarEvent.kt */
    public static final class b implements qy40 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -212258918;
        }

        public final String toString() {
            return "None";
        }
    }
}
