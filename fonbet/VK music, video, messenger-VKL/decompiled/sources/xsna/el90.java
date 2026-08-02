package xsna;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieSourceTypeExtensionsKt;
import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* compiled from: ParticipantVideoCandidate.kt */
/* loaded from: classes7.dex */
public abstract class el90 {

    /* compiled from: ParticipantVideoCandidate.kt */
    public static final class a extends c {
        public final ParticipantId b;

        public a(ParticipantId participantId) {
            super(participantId, VideoTrackType.ANIMOJI);
            this.b = participantId;
        }

        @Override // xsna.el90.c
        public final ParticipantId b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AnimojiCandidate(id=" + this.b + ')';
        }
    }

    /* compiled from: ParticipantVideoCandidate.kt */
    public static final class b extends c {
        public final ParticipantId b;

        public b(ParticipantId participantId) {
            super(participantId, VideoTrackType.SCREEN_CAPTURE);
            this.b = participantId;
        }

        @Override // xsna.el90.c
        public final ParticipantId b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ScreenCaptureCandidate(id=" + this.b + ')';
        }
    }

    /* compiled from: ParticipantVideoCandidate.kt */
    public static class c extends el90 {
        public final VideoTrackType a;

        public c(ParticipantId participantId, VideoTrackType videoTrackType) {
            this.a = videoTrackType;
        }

        @Override // xsna.el90
        public final ConversationVideoTrackParticipantKey a() {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(b()).setType(this.a).build();
        }

        public ParticipantId b() {
            throw null;
        }
    }

    /* compiled from: ParticipantVideoCandidate.kt */
    public static final class d extends c {
        public final ParticipantId b;

        public d(ParticipantId participantId) {
            super(participantId, VideoTrackType.VIDEO);
            this.b = participantId;
        }

        @Override // xsna.el90.c
        public final ParticipantId b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VideoCandidate(id=" + this.b + ')';
        }
    }

    /* compiled from: ParticipantVideoCandidate.kt */
    public static final class e extends el90 {
        public final ParticipantId a;
        public final Movie b;

        public e(ParticipantId participantId, Movie movie) {
            this.a = participantId;
            this.b = movie;
        }

        @Override // xsna.el90
        public final ConversationVideoTrackParticipantKey a() {
            ConversationVideoTrackParticipantKey.Builder participantId = new ConversationVideoTrackParticipantKey.Builder().setParticipantId(this.a);
            Movie movie = this.b;
            return participantId.setMovieId(movie.getMovieId()).setType(MovieSourceTypeExtensionsKt.toVideoTrackType(movie.getSourceType())).build();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "WatchTogetherCandidate(id=" + this.a + ", movie=" + this.b + ')';
        }
    }

    public abstract ConversationVideoTrackParticipantKey a();
}
