package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public interface fyi0 extends xyc0 {
    void disable();

    void enable(lyi0 lyi0Var, a[] aVarArr, xyl0 xyl0Var, long j, boolean z, boolean z2, long j2, long j3, sf10 sf10Var);

    default void enableMayRenderStartOfStream() {
    }

    iyi0 getCapabilities();

    default long getDurationToProgressUs(long j, long j2) {
        return 10000L;
    }

    kb10 getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    xyl0 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i, vyc0 vyc0Var, y3c y3cVar);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError();

    void release();

    void render(long j, long j2);

    void replaceStream(a[] aVarArr, xyl0 xyl0Var, long j, long j2, sf10 sf10Var);

    void reset();

    void resetPosition(long j);

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f, float f2) {
    }

    void setTimeline(a9z0 a9z0Var);

    void start();

    void stop();
}
