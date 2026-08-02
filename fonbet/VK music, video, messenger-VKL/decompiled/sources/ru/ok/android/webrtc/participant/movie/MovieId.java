package ru.ok.android.webrtc.participant.movie;

import xsna.qlb0;

/* loaded from: classes9.dex */
public final class MovieId {
    public final long a;

    public MovieId(long j) {
        this.a = j;
    }

    public static /* synthetic */ MovieId copy$default(MovieId movieId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = movieId.a;
        }
        return movieId.copy(j);
    }

    public final long component1() {
        return this.a;
    }

    public final MovieId copy(long j) {
        return new MovieId(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieId) && this.a == ((MovieId) obj).a;
    }

    public final long getId() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        return qlb0.a(this.a, "MovieId(id=", ")");
    }
}
