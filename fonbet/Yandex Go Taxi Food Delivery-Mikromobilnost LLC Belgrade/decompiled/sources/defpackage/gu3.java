package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class gu3 implements v7p {
    public final /* synthetic */ int a;
    public final gwf b;

    public /* synthetic */ gu3(gwf gwfVar, int i) {
        this.a = i;
        this.b = gwfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gwf gwfVar = this.b;
        switch (i) {
            case 0:
                return new f42((AppAnalyticsReporter) gwfVar.get(), 1);
            case 1:
                return new us3((AppAnalyticsReporter) gwfVar.get());
            case 2:
                return new f42((AppAnalyticsReporter) gwfVar.get(), 2);
            case 3:
                return new m04((AppAnalyticsReporter) gwfVar.get());
            default:
                return new us3((AppAnalyticsReporter) gwfVar.get());
        }
    }
}
