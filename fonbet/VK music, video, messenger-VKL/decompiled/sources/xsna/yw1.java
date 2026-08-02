package xsna;

import com.vungle.ads.internal.AnalyticsClient;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yw1 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ yw1(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AnalyticsClient.a();
                break;
            default:
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                vdx0Var.C(null);
                break;
        }
    }
}
