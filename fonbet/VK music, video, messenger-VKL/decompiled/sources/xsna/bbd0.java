package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Objects;
import ru.ok.android.webrtc.participant.movie.Movie;

/* compiled from: PrimaryViewPagerItem.kt */
/* loaded from: classes7.dex */
public abstract class bbd0 implements hfz {

    /* compiled from: PrimaryViewPagerItem.kt */
    public static final class a extends bbd0 {
        public final CallMemberId b;
        public final boolean c;
        public final sew0 d;

        public a(CallMemberId callMemberId, boolean z, sew0 sew0Var) {
            this.b = callMemberId;
            this.c = z;
            this.d = sew0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        @Override // xsna.bbd0, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.hashCode());
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "AnimojiItem(participantId=" + this.b + ", isConnecting=" + this.c + ", avatar=" + this.d + ')';
        }
    }

    /* compiled from: PrimaryViewPagerItem.kt */
    public static final class b extends bbd0 {
        public final CallMemberId b;

        public b(CallMemberId callMemberId) {
            this.b = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.bbd0, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.hashCode());
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ScreenCaptureItem(participantId=" + this.b + ')';
        }
    }

    /* compiled from: PrimaryViewPagerItem.kt */
    public static final class c extends bbd0 {
        public final CallMemberId b;
        public final boolean c;
        public final boolean d;
        public final sew0 e;

        public c(CallMemberId callMemberId, boolean z, boolean z2, sew0 sew0Var) {
            this.b = callMemberId;
            this.c = z;
            this.d = z2;
            this.e = sew0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e);
        }

        @Override // xsna.bbd0, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.hashCode());
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "VideoItem(participantId=" + this.b + ", isVideoEnabled=" + this.c + ", isConnecting=" + this.d + ", avatar=" + this.e + ')';
        }
    }

    /* compiled from: PrimaryViewPagerItem.kt */
    public static final class d extends bbd0 {
        public final CallMemberId b;
        public final Movie c;

        public d(CallMemberId callMemberId, Movie movie) {
            this.b = callMemberId;
            this.c = movie;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        @Override // xsna.bbd0, xsna.hfz
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

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
