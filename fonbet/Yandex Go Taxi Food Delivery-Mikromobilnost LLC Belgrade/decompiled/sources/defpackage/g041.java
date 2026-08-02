package defpackage;

import io.appmetrica.analytics.impl.C0175a0;
import io.appmetrica.analytics.impl.W;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final /* synthetic */ class g041 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0175a0 b;

    public /* synthetic */ g041(C0175a0 c0175a0, int i) {
        this.a = i;
        this.b = c0175a0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        C0175a0 c0175a0 = this.b;
        switch (i) {
            case 0:
                return W.a(c0175a0);
            case 1:
                return C0175a0.g(c0175a0);
            default:
                return C0175a0.f(c0175a0);
        }
    }
}
