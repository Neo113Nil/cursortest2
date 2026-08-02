package xsna;

import com.vk.core.apps.BuildInfo;

/* compiled from: DebugUtils.kt */
/* loaded from: classes.dex */
public final class b7l {
    public static final void a(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        if (BuildInfo.h()) {
            com.vk.metrics.eventtracking.b.a.q(illegalStateException);
        }
    }
}
