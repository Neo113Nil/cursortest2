package xsna;

import io.opentelemetry.sdk.trace.samplers.SamplingDecision;

/* compiled from: SamplingResult.java */
/* loaded from: classes11.dex */
public interface p0h0 {

    /* compiled from: SamplingResult.java */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SamplingDecision.values().length];
            a = iArr;
            try {
                iArr[SamplingDecision.RECORD_AND_SAMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SamplingDecision.RECORD_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SamplingDecision.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
