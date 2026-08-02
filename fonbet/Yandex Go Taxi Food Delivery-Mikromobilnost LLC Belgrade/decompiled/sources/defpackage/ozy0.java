package defpackage;

import android.os.HandlerThread;

/* loaded from: classes8.dex */
public final class ozy0 implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        HandlerThread handlerThread = new HandlerThread("Logic");
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
