package xsna;

import com.vk.metrics.trackers.CriticalException;

/* compiled from: FcmNonFatalLogger.kt */
/* loaded from: classes18.dex */
public final class wtq implements vtq {

    /* compiled from: FcmNonFatalLogger.kt */
    public static final class a extends CriticalException {
    }

    @Override // xsna.vtq
    public final void a(Throwable th) {
        com.vk.metrics.eventtracking.b.a.a(new a(th));
    }
}
