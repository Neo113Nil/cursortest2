package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.List;
import java.util.Objects;
import ru.ok.android.webrtc.participant.movie.Movie;

/* compiled from: GridViewPagerItem.kt */
/* loaded from: classes7.dex */
public abstract class sgu implements hfz {

    /* compiled from: GridViewPagerItem.kt */
    public static final class a extends sgu {
        public final CallMemberId b;

        public a(CallMemberId callMemberId) {
            this.b = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.hashCode());
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FullscreenScreenCaptureItem(participantId=" + this.b + ')';
        }
    }

    /* compiled from: GridViewPagerItem.kt */
    public static final class b extends sgu {
        public final int b;
        public final List<CallMemberId> c;
        public final boolean d;

        public b(int i, List<CallMemberId> list, boolean z) {
            this.b = i;
            this.c = list;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b + 2147483647L);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + fw3.a(Integer.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoGridItem(pageIndex=");
            sb.append(this.b);
            sb.append(", participantIds=");
            sb.append(this.c);
            sb.append(", showTipCard=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: GridViewPagerItem.kt */
    public static final class c extends sgu {
        public final CallMemberId b;
        public final Movie c;

        public c(CallMemberId callMemberId, Movie movie) {
            this.b = callMemberId;
            this.c = movie;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(Objects.hash(this.b, this.c.getMovieId()));
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "WatchTogetherItem(participantId=" + this.b + ", movie=" + this.c + ')';
        }
    }
}
