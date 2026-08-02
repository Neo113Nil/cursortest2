package ru.ok.android.webrtc.stat;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallAnalytics {
    public final CallAnalyticsSender a;
    public boolean b;
    public boolean c;

    public CallAnalytics(CallAnalyticsSender callAnalyticsSender) {
        this.a = callAnalyticsSender;
        callAnalyticsSender.setIdle(this.c, !this.b);
    }

    public final CallAnalyticsSender getAnalyticsSender() {
        return this.a;
    }

    public final boolean isIdle$webrtc_android_sdk_release() {
        return this.c;
    }

    public final void release() {
        this.b = true;
        this.a.setIdle(true, false);
    }

    public final void setIdle(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        CallAnalyticsSender callAnalyticsSender = this.a;
        boolean z2 = this.b;
        callAnalyticsSender.setIdle(z2 || z, !z2);
    }
}
