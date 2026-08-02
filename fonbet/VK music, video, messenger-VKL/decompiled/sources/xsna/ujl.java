package xsna;

/* compiled from: DefaultOpenTelemetry.java */
/* loaded from: classes11.dex */
public final class ujl implements bs80 {
    public static final ujl a = new ujl();

    @Override // xsna.bs80
    public final cj20 getMeterProvider() {
        return cj20.m();
    }

    @Override // xsna.bs80
    public final mep0 getTracerProvider() {
        return epl.b;
    }

    public final String toString() {
        return "DefaultOpenTelemetry{propagators=" + bdl.b + "}";
    }
}
