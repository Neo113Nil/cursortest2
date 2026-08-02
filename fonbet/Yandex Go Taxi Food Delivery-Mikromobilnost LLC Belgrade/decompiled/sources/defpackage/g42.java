package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class g42 implements v7p {
    public final /* synthetic */ int a;
    public final l5g b;

    public /* synthetic */ g42(l5g l5gVar, int i) {
        this.a = i;
        this.b = l5gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        l5g l5gVar = this.b;
        switch (i) {
            case 0:
                return new f42((AppAnalyticsReporter) l5gVar.get(), 0);
            default:
                return new us3((AppAnalyticsReporter) l5gVar.get());
        }
    }
}
