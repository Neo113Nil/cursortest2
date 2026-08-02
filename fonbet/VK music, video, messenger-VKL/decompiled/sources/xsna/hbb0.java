package xsna;

import com.vkontakte.android.R;

/* compiled from: PlaylistMenuSnackbarEvent.kt */
/* loaded from: classes3.dex */
public interface hbb0 {

    /* compiled from: PlaylistMenuSnackbarEvent.kt */
    public static abstract class a implements hbb0 {
        public final int a;

        /* compiled from: PlaylistMenuSnackbarEvent.kt */
        /* renamed from: xsna.hbb0$a$a, reason: collision with other inner class name */
        public static final class C2983a extends a {
            public static final C2983a b = new C2983a(R.string.music_player_snack_bar_link_copied);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2983a);
            }

            public final int hashCode() {
                return 2086866437;
            }

            public final String toString() {
                return "LinkCopied";
            }
        }

        /* compiled from: PlaylistMenuSnackbarEvent.kt */
        public static final class b extends a {
            public static final b b = new b(R.string.music_player_snack_bar_internet_connection_problems);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -947976863;
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
