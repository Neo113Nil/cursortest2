package androidx.core.app;

import android.content.Intent;

/* loaded from: classes.dex */
public final class v0 implements i {
    public final i a;
    public final /* synthetic */ PassportJobIntentService b;

    public v0(PassportJobIntentService passportJobIntentService, i iVar) {
        this.b = passportJobIntentService;
        this.a = iVar;
    }

    @Override // androidx.core.app.i
    public final void e() {
        try {
            this.a.e();
        } catch (Exception e) {
            this.b.analyticsTrackerWrapper.a.reportError(com.yandex.passport.internal.analytics.l.j.a, e);
        }
    }

    @Override // androidx.core.app.i
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}
