package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: DummyInAppReviewManager.kt */
/* loaded from: classes.dex */
public final class pno implements crw {
    @Override // xsna.crw
    public final void onCreate() {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"InAppReview", "dummy:Dummy in-app review manager created"});
    }

    @Override // xsna.crw
    public final void onPause() {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"InAppReview", "dummy:Dummy in-app review manager paused"});
    }

    @Override // xsna.crw
    public final void onResume() {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"InAppReview", "dummy:Dummy in-app review manager resumed"});
    }
}
