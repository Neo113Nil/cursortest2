package io.reactivex.rxjava3.internal.operators.flowable;

import xsna.jxm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class FlowableInternalHelper$RequestMax implements io.reactivex.rxjava3.functions.f<jxm0> {
    private static final /* synthetic */ FlowableInternalHelper$RequestMax[] $VALUES;
    public static final FlowableInternalHelper$RequestMax INSTANCE;

    static {
        FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax = new FlowableInternalHelper$RequestMax("INSTANCE", 0);
        INSTANCE = flowableInternalHelper$RequestMax;
        $VALUES = new FlowableInternalHelper$RequestMax[]{flowableInternalHelper$RequestMax};
    }

    public FlowableInternalHelper$RequestMax() {
        throw null;
    }

    public static FlowableInternalHelper$RequestMax valueOf(String str) {
        return (FlowableInternalHelper$RequestMax) Enum.valueOf(FlowableInternalHelper$RequestMax.class, str);
    }

    public static FlowableInternalHelper$RequestMax[] values() {
        return (FlowableInternalHelper$RequestMax[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(jxm0 jxm0Var) throws Throwable {
        jxm0Var.request(Long.MAX_VALUE);
    }
}
