package androidx.core.app;

/* loaded from: classes.dex */
public abstract class PassportJobIntentService extends JobIntentService {
    com.yandex.passport.internal.analytics.t analyticsTrackerWrapper;

    @Override // androidx.core.app.JobIntentService
    public i dequeueWork() {
        i iVar;
        try {
            iVar = super.dequeueWork();
        } catch (Exception e) {
            this.analyticsTrackerWrapper.a.reportError(com.yandex.passport.internal.analytics.l.i.a, e);
            iVar = null;
        }
        return iVar != null ? new v0(this, iVar) : iVar;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.analyticsTrackerWrapper = com.yandex.passport.internal.di.a.a().getAnalyticsTrackerWrapper();
    }
}
