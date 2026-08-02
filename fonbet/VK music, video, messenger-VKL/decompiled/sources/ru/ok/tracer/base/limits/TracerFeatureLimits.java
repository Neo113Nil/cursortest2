package ru.ok.tracer.base.limits;

/* compiled from: TracerFeatureLimits.kt */
/* loaded from: classes11.dex */
public interface TracerFeatureLimits {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: TracerFeatureLimits.kt */
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TracerFeatureLimits unlimited() {
            return NoTracerFeatureLimits.INSTANCE;
        }
    }

    static TracerFeatureLimits unlimited() {
        return Companion.unlimited();
    }

    boolean isLimited(String str, String str2);

    void setShutdownMs(Long l, String str, Long l2, String str2, Long l3);
}
