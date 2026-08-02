package ru.ok.tracer.base.limits;

/* compiled from: TracerFeatureLimits.kt */
/* loaded from: classes9.dex */
final class NoTracerFeatureLimits implements TracerFeatureLimits {
    public static final NoTracerFeatureLimits INSTANCE = new NoTracerFeatureLimits();

    private NoTracerFeatureLimits() {
    }

    @Override // ru.ok.tracer.base.limits.TracerFeatureLimits
    public boolean isLimited(String str, String str2) {
        return false;
    }

    @Override // ru.ok.tracer.base.limits.TracerFeatureLimits
    public void setShutdownMs(Long l, String str, Long l2, String str2, Long l3) {
    }
}
