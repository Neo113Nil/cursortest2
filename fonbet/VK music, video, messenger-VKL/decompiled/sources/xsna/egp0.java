package xsna;

import com.vkontakte.android.R;

/* compiled from: TrackMenuSnackbarEvent.kt */
/* loaded from: classes3.dex */
public interface egp0 {

    /* compiled from: TrackMenuSnackbarEvent.kt */
    public static abstract class a implements egp0 {
        public final int a;

        /* compiled from: TrackMenuSnackbarEvent.kt */
        /* renamed from: xsna.egp0$a$a, reason: collision with other inner class name */
        public static final class C2808a extends a {
            public static final C2808a b = new C2808a(R.string.music_player_snack_bar_common_error);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2808a);
            }

            public final int hashCode() {
                return 1121078008;
            }

            public final String toString() {
                return "CommonError";
            }
        }

        /* compiled from: TrackMenuSnackbarEvent.kt */
        public static final class b extends a {
            public static final b b = new b(R.string.music_player_snack_bar_link_copied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1875728413;
            }

            public final String toString() {
                return "LinkCopied";
            }
        }

        /* compiled from: TrackMenuSnackbarEvent.kt */
        public static final class c extends a {
            public static final c b = new c(R.string.music_player_snack_bar_internet_connection_problems);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 634363839;
            }

            public final String toString() {
                return "NetworkError";
            }
        }

        public a(int i) {
            this.a = i;
        }
    }
}
