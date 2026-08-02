package defpackage;

import io.appmetrica.analytics.IParamsCallback;

/* loaded from: classes9.dex */
public final class fc20 implements IParamsCallback {
    public final tls a;
    public final tls b;

    public fc20(tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        this.a.invoke(new yb20(result != null ? result.getUuid() : null, result != null ? result.getDeviceId() : null));
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        IllegalStateException illegalStateException;
        int i = reason == null ? -1 : ec20.a[reason.ordinal()];
        if (i == 1) {
            illegalStateException = new IllegalStateException("Got network error on request metrica startup identifiers");
            jst.e.a(10, "MetricaWrapper", illegalStateException, null);
        } else if (i == 2) {
            illegalStateException = new IllegalStateException("Got unknown error on request metrica startup identifiers");
            jst.e.i("MetricaWrapper", illegalStateException);
        } else if (i != 3) {
            illegalStateException = new IllegalStateException("Got error on request metrica startup identifiers without reason");
            jst.e.i("MetricaWrapper", illegalStateException);
        } else {
            illegalStateException = new IllegalStateException("Got invalid response error on request metrica startup identifiers");
            jst.e.i("MetricaWrapper", illegalStateException);
        }
        this.b.invoke(illegalStateException);
    }
}
