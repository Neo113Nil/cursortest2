package xsna;

/* compiled from: OpenTelemetry.java */
/* loaded from: classes11.dex */
public interface bs80 {
    default cj20 getMeterProvider() {
        return cj20.m();
    }

    default wdp0 getTracer(String str) {
        return getTracerProvider().get(str);
    }

    mep0 getTracerProvider();

    default wdp0 getTracer(String str, String str2) {
        return getTracerProvider().get(str, str2);
    }
}
