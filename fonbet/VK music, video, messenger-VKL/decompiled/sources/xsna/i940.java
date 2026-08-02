package xsna;

import android.app.Activity;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: MusicAddTrackToPlaylistLauncher.kt */
/* loaded from: classes3.dex */
public interface i940 {

    /* compiled from: MusicAddTrackToPlaylistLauncher.kt */
    public interface a {

        /* compiled from: MusicAddTrackToPlaylistLauncher.kt */
        /* renamed from: xsna.i940$a$a, reason: collision with other inner class name */
        public static final class C3041a implements a {
            public static final C3041a a = new C3041a();

            @Override // xsna.i940.a
            public final boolean a() {
                return false;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3041a);
            }

            public final int hashCode() {
                return 1948093529;
            }

            public final String toString() {
                return "Fail";
            }
        }

        /* compiled from: MusicAddTrackToPlaylistLauncher.kt */
        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            @Override // xsna.i940.a
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Success(isInNewInstance="), this.a, ')');
            }
        }

        boolean a();
    }

    /* compiled from: MusicAddTrackToPlaylistLauncher.kt */
    public static final class b {
        public final long a;
        public final MusicTrack b;
        public final MusicPlaybackLaunchContext c;

        public b(long j, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = j;
            this.b = musicTrack;
            this.c = musicPlaybackLaunchContext;
        }
    }

    /* compiled from: MusicAddTrackToPlaylistLauncher.kt */
    public interface c {
        void a(Throwable th);

        void b();
    }

    void a(Activity activity, c cVar);

    a b(Activity activity, b bVar);
}
