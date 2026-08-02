package xsna;

/* compiled from: DefaultMeterProvider.java */
/* loaded from: classes8.dex */
public final class sil implements cj20 {
    public static final cj20 b = (cj20) qjg.d(new sil(), "io.opentelemetry.api.incubator.metrics.ExtendedDefaultMeterProvider");
    public static final a c = new a();

    @Override // xsna.cj20
    public final aj20 meterBuilder(String str) {
        return c;
    }

    /* compiled from: DefaultMeterProvider.java */
    public static class a implements aj20 {
        @Override // xsna.aj20
        public final yi20 build() {
            return ril.a;
        }

        @Override // xsna.aj20
        public final aj20 setInstrumentationVersion(String str) {
            return this;
        }

        @Override // xsna.aj20
        public final aj20 setSchemaUrl(String str) {
            return this;
        }
    }
}
