package xsna;

import io.opentelemetry.api.logs.Severity;

/* compiled from: LogRecordData.java */
/* loaded from: classes8.dex */
public interface m000 {
    q8x c();

    gag0 d();

    long e();

    long f();

    String g();

    @Deprecated
    nj7 getBody();

    Severity getSeverity();

    default ljr0<?> h() {
        getBody();
        throw null;
    }
}
