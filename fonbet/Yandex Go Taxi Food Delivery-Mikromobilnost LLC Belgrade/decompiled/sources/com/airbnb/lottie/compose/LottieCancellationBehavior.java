package com.airbnb.lottie.compose;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "Immediately", "OnIterationFinish", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LottieCancellationBehavior {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LottieCancellationBehavior[] $VALUES;
    public static final LottieCancellationBehavior Immediately;
    public static final LottieCancellationBehavior OnIterationFinish;

    static {
        LottieCancellationBehavior lottieCancellationBehavior = new LottieCancellationBehavior("Immediately", 0);
        Immediately = lottieCancellationBehavior;
        LottieCancellationBehavior lottieCancellationBehavior2 = new LottieCancellationBehavior("OnIterationFinish", 1);
        OnIterationFinish = lottieCancellationBehavior2;
        LottieCancellationBehavior[] lottieCancellationBehaviorArr = {lottieCancellationBehavior, lottieCancellationBehavior2};
        $VALUES = lottieCancellationBehaviorArr;
        $ENTRIES = kotlin.enums.a.a(lottieCancellationBehaviorArr);
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) $VALUES.clone();
    }
}
