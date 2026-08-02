package defpackage;

import io.appmetrica.analytics.IParamsCallback;
import java.util.Map;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes9.dex */
public final class hc20 implements IParamsCallback {
    public final /* synthetic */ q a;
    public final /* synthetic */ h2c b;

    public hc20(q qVar, h2c h2cVar) {
        this.a = qVar;
        this.b = h2cVar;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        Map<String, String> clids = result != null ? result.getClids() : null;
        this.a.getClass();
        if (clids != null) {
            this.b.a(clids);
        }
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        int i = reason == null ? -1 : gc20.a[reason.ordinal()];
        if (i == 1) {
            jst.e.a(10, "MetricaWrapper", new IllegalStateException("Got network error on request clids from metrica"), null);
        } else if (i == 2) {
            jst.e.i("MetricaWrapper", new IllegalStateException("Got unknown error on request clids from metrica"));
        } else if (i == 3) {
            jst.e.i("MetricaWrapper", new IllegalStateException("Got invalid response error on request clids from metrica"));
        } else if (i != 4) {
            jst.e.i("MetricaWrapper", new IllegalStateException("Got error on request clids from metrica without reason"));
        } else {
            jst.e.i("MetricaWrapper", new IllegalStateException("Got inconsistency error on request clids from metrica"));
        }
        Map<String, String> clids = result != null ? result.getClids() : null;
        this.a.getClass();
        if (clids != null) {
            this.b.a(clids);
        }
    }
}
