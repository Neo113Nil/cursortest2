package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.ewo0;

/* compiled from: BasePlayer.java */
/* loaded from: classes12.dex */
public abstract class fk6 implements jza0 {
    public final ewo0.c b = new ewo0.c();

    @Override // xsna.jza0
    public final boolean d() {
        int e;
        ewo0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            e = -1;
        } else {
            int s = s();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            getShuffleModeEnabled();
            e = currentTimeline.e(s, repeatMode, false);
        }
        return e != -1;
    }

    @Override // xsna.jza0
    public final boolean e() {
        ewo0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(s(), this.b, 0L).a();
    }

    @Override // xsna.jza0
    public final boolean h() {
        int k;
        ewo0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            k = -1;
        } else {
            int s = s();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            getShuffleModeEnabled();
            k = currentTimeline.k(s, repeatMode, false);
        }
        return k != -1;
    }

    @Override // xsna.jza0
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && g() == 0;
    }

    @Override // xsna.jza0
    public final boolean m() {
        ewo0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(s(), this.b, 0L).h;
    }

    @Override // xsna.jza0
    public final void n() {
        k();
    }

    @Override // xsna.jza0
    public final boolean o() {
        ewo0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(s(), this.b, 0L).i;
    }

    public final int t() {
        if (p().a.a.get(16)) {
            long bufferedPosition = getBufferedPosition();
            long duration = getDuration();
            if (bufferedPosition != C.TIME_UNSET && duration != C.TIME_UNSET) {
                if (duration == 0) {
                    return 100;
                }
                return y2r0.j(y2r0.X(bufferedPosition, duration), 0, 100);
            }
        }
        return 0;
    }

    public final long u() {
        ewo0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return C.TIME_UNSET;
        }
        int s = s();
        ewo0.c cVar = this.b;
        return currentTimeline.m(s, cVar, 0L).f == C.TIME_UNSET ? C.TIME_UNSET : (y2r0.E(cVar.g) - cVar.f) - getContentPosition();
    }

    public abstract void v(int i, int i2, long j);

    public final void w(int i, long j) {
        v(i, 10, j);
    }

    public final void x(long j) {
        v(s(), 5, j);
    }
}
