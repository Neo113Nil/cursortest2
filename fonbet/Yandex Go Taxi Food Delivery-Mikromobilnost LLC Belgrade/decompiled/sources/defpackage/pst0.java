package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class pst0 implements v7p {
    public final /* synthetic */ int a;
    public final o9g b;

    public /* synthetic */ pst0(o9g o9gVar, int i) {
        this.a = i;
        this.b = o9gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        o9g o9gVar = this.b;
        switch (i) {
            case 0:
                return new f42((AppAnalyticsReporter) o9gVar.get(), 11);
            default:
                return new m04((AppAnalyticsReporter) o9gVar.get());
        }
    }
}
