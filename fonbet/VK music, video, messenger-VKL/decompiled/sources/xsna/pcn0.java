package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;

/* compiled from: SuperAppUiPerformanceDispatcher.kt */
/* loaded from: classes6.dex */
public final class pcn0 implements wxt0 {
    public pcn0() {
        BuildInfo.h();
    }

    @Override // xsna.wxt0
    public final void a(ucn0 ucn0Var, long j) {
        L.e("onBind (" + ucn0Var + "): " + (j / 1000000) + " millis");
    }
}
