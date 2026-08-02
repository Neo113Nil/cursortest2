package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes5.dex */
public final class baf implements v7p {
    public final /* synthetic */ int a;
    public final oxf b;

    public /* synthetic */ baf(oxf oxfVar, int i) {
        this.a = i;
        this.b = oxfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        oxf oxfVar = this.b;
        switch (i) {
            case 0:
                return new f42((AppAnalyticsReporter) oxfVar.get(), 4);
            case 1:
                return new m04((AppAnalyticsReporter) oxfVar.get());
            default:
                return new f42((AppAnalyticsReporter) oxfVar.get(), 5);
        }
    }
}
