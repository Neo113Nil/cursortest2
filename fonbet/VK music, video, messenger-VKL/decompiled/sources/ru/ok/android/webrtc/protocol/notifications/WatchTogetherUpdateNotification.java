package ru.ok.android.webrtc.protocol.notifications;

import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.watch_together.MovieStateUpdates;
import xsna.epx;

/* loaded from: classes9.dex */
public final class WatchTogetherUpdateNotification implements RtcNotification {
    public final MovieStateUpdates a;

    public WatchTogetherUpdateNotification(MovieStateUpdates movieStateUpdates) {
        this.a = movieStateUpdates;
    }

    public static /* synthetic */ WatchTogetherUpdateNotification copy$default(WatchTogetherUpdateNotification watchTogetherUpdateNotification, MovieStateUpdates movieStateUpdates, int i, Object obj) {
        if ((i & 1) != 0) {
            movieStateUpdates = watchTogetherUpdateNotification.a;
        }
        return watchTogetherUpdateNotification.copy(movieStateUpdates);
    }

    public final MovieStateUpdates component1() {
        return this.a;
    }

    public final WatchTogetherUpdateNotification copy(MovieStateUpdates movieStateUpdates) {
        return new WatchTogetherUpdateNotification(movieStateUpdates);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchTogetherUpdateNotification) && epx.f(this.a, ((WatchTogetherUpdateNotification) obj).a);
    }

    public final MovieStateUpdates getUpdates() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "WatchTogetherUpdateNotification(updates=" + this.a + ")";
    }
}
