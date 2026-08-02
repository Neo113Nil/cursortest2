package one.video.exo.offline;

import androidx.annotation.NonNull;
import androidx.media3.exoplayer.offline.DownloadRequest;
import xsna.kr10;
import xsna.o7o;

/* loaded from: classes8.dex */
public final class DownloadInfo {
    public final String a;
    public final byte[] b;
    public final State c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final kr10 h;

    public enum State {
        STATE_QUEUED(0),
        STATE_DOWNLOADING(2),
        STATE_COMPLETED(3),
        STATE_FAILED(4),
        STATE_REMOVING(5),
        STATE_RESTARTING(7),
        STATE_STOPPED(1);

        private final int value;

        State(int i) {
            this.value = i;
        }
    }

    public DownloadInfo(@NonNull o7o o7oVar) {
        DownloadRequest downloadRequest = o7oVar.a;
        this.a = downloadRequest.b;
        this.b = downloadRequest.h;
        int i = o7oVar.b;
        State state = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? null : State.STATE_RESTARTING : State.STATE_REMOVING : State.STATE_FAILED : State.STATE_COMPLETED : State.STATE_DOWNLOADING : State.STATE_STOPPED : State.STATE_QUEUED;
        this.c = state;
        this.d = o7oVar.h.a;
        this.e = o7oVar.e;
        this.f = o7oVar.c;
        if (state == State.STATE_COMPLETED) {
            this.g = 100.0f;
        } else {
            this.g = o7oVar.h.b;
        }
        this.h = o7oVar.a.d();
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.e;
    }

    public final byte[] c() {
        return this.b;
    }

    public final kr10 d() {
        return this.h;
    }

    public final float e() {
        return this.g;
    }

    public final State f() {
        return this.c;
    }
}
