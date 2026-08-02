package ru.ok.android.webrtc.watch_together;

import java.util.List;
import xsna.epx;
import xsna.wq;

/* loaded from: classes9.dex */
public final class MovieStateUpdates {
    public final List a;

    public MovieStateUpdates(List<MovieStateUpdate> list) {
        this.a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MovieStateUpdates copy$default(MovieStateUpdates movieStateUpdates, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = movieStateUpdates.a;
        }
        return movieStateUpdates.copy(list);
    }

    public final List<MovieStateUpdate> component1() {
        return this.a;
    }

    public final MovieStateUpdates copy(List<MovieStateUpdate> list) {
        return new MovieStateUpdates(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieStateUpdates) && epx.f(this.a, ((MovieStateUpdates) obj).a);
    }

    public final List<MovieStateUpdate> getUpdates() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return wq.c("MovieStateUpdates(updates=", ")", this.a);
    }
}
