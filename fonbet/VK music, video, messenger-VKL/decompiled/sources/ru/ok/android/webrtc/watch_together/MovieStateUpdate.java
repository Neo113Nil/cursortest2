package ru.ok.android.webrtc.watch_together;

import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.epx;
import xsna.n23;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class MovieStateUpdate {
    public final CallVideoTrackParticipantKey a;
    public final float b;
    public final boolean c;
    public final Long d;
    public final boolean e;

    public MovieStateUpdate(CallVideoTrackParticipantKey callVideoTrackParticipantKey, float f, boolean z, Long l, boolean z2) {
        this.a = callVideoTrackParticipantKey;
        this.b = f;
        this.c = z;
        this.d = l;
        this.e = z2;
    }

    public static /* synthetic */ MovieStateUpdate copy$default(MovieStateUpdate movieStateUpdate, CallVideoTrackParticipantKey callVideoTrackParticipantKey, float f, boolean z, Long l, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            callVideoTrackParticipantKey = movieStateUpdate.a;
        }
        if ((i & 2) != 0) {
            f = movieStateUpdate.b;
        }
        if ((i & 4) != 0) {
            z = movieStateUpdate.c;
        }
        if ((i & 8) != 0) {
            l = movieStateUpdate.d;
        }
        if ((i & 16) != 0) {
            z2 = movieStateUpdate.e;
        }
        boolean z3 = z2;
        boolean z4 = z;
        return movieStateUpdate.copy(callVideoTrackParticipantKey, f, z4, l, z3);
    }

    public final CallVideoTrackParticipantKey component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final Long component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final MovieStateUpdate copy(CallVideoTrackParticipantKey callVideoTrackParticipantKey, float f, boolean z, Long l, boolean z2) {
        return new MovieStateUpdate(callVideoTrackParticipantKey, f, z, l, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieStateUpdate)) {
            return false;
        }
        MovieStateUpdate movieStateUpdate = (MovieStateUpdate) obj;
        return epx.f(this.a, movieStateUpdate.a) && Float.compare(this.b, movieStateUpdate.b) == 0 && this.c == movieStateUpdate.c && epx.f(this.d, movieStateUpdate.d) && this.e == movieStateUpdate.e;
    }

    public final Long getPosition() {
        return this.d;
    }

    public final CallVideoTrackParticipantKey getTrackKey() {
        return this.a;
    }

    public final float getVolume() {
        return this.b;
    }

    public int hashCode() {
        int b = wn4.b(this.c, b.a(this.b, this.a.hashCode() * 31, 31));
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((b + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final boolean isMuted() {
        return this.e;
    }

    public final boolean isPaused() {
        return this.c;
    }

    public String toString() {
        CallVideoTrackParticipantKey callVideoTrackParticipantKey = this.a;
        float f = this.b;
        boolean z = this.c;
        Long l = this.d;
        boolean z2 = this.e;
        StringBuilder sb = new StringBuilder("MovieStateUpdate(trackKey=");
        sb.append(callVideoTrackParticipantKey);
        sb.append(", volume=");
        sb.append(f);
        sb.append(", isPaused=");
        sb.append(z);
        sb.append(", position=");
        sb.append(l);
        sb.append(", isMuted=");
        return n23.b(sb, z2, ")");
    }
}
