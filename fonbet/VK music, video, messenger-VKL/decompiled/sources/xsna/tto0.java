package xsna;

import android.os.SystemClock;
import one.video.streaming.tools.TimeMachine;

/* compiled from: TimeMachineRealtime.java */
/* loaded from: classes8.dex */
public final class tto0 implements TimeMachine {
    @Override // one.video.streaming.tools.TimeMachine
    public final long currentTimeMillis() {
        return SystemClock.elapsedRealtime();
    }
}
