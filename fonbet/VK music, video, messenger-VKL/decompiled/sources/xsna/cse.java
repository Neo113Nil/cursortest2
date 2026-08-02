package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: ClipsPlaylistsEventsSource.kt */
/* loaded from: classes16.dex */
public interface cse {

    /* compiled from: ClipsPlaylistsEventsSource.kt */
    public interface a {

        /* compiled from: ClipsPlaylistsEventsSource.kt */
        /* renamed from: xsna.cse$a$a, reason: collision with other inner class name */
        public static final class C2680a implements a {
            public final ClipsPlaylist a;
            public final ArrayList b;

            public C2680a(ClipsPlaylist clipsPlaylist, ArrayList arrayList) {
                this.a = clipsPlaylist;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2680a)) {
                    return false;
                }
                C2680a c2680a = (C2680a) obj;
                return epx.f(this.a, c2680a.a) && this.b.equals(c2680a.b);
            }

            public final int hashCode() {
                return qr.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "ClipsAdded(playlist=" + this.a + ", videoAdded=" + this.b + ", nextFrom=null)";
            }
        }

        /* compiled from: ClipsPlaylistsEventsSource.kt */
        public static final class b implements a {
            public final ClipsPlaylist a;
            public final Set<String> b;

            public b(ClipsPlaylist clipsPlaylist, Set<String> set) {
                this.a = clipsPlaylist;
                this.b = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipsRemoved(playlist=");
                sb.append(this.a);
                sb.append(", videoIds=");
                return ur.c(sb, this.b, ')');
            }
        }
    }

    void a(a aVar);

    io.reactivex.rxjava3.internal.operators.observable.j1 b();

    io.reactivex.rxjava3.internal.operators.observable.j1 c();
}
