package xsna;

import io.opentelemetry.sdk.common.InternalTelemetryVersion;

/* compiled from: LogRecordProcessorInstrumentation.java */
/* loaded from: classes8.dex */
public interface p000 {

    /* compiled from: LogRecordProcessorInstrumentation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InternalTelemetryVersion.values().length];
            a = iArr;
            try {
                iArr[InternalTelemetryVersion.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    void a();

    void b(int i, String str);

    void c(long j, kb kbVar);
}
