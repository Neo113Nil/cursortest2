package com.ybsdk.feature.autotopup.internal.presentation.saver;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/autotopup/internal/presentation/saver/AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target", "", "Lcom/ybsdk/feature/autotopup/internal/presentation/saver/AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target;", "<init>", "(Ljava/lang/String;I)V", "AMOUNT_FIRST", "AMOUNT_SECOND", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target[] $VALUES;
    public static final AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target AMOUNT_FIRST = new AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target("AMOUNT_FIRST", 0);
    public static final AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target AMOUNT_SECOND = new AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target("AMOUNT_SECOND", 1);

    private static final /* synthetic */ AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target[] $values() {
        return new AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target[]{AMOUNT_FIRST, AMOUNT_SECOND};
    }

    static {
        AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target valueOf(String str) {
        return (AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target) Enum.valueOf(AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target.class, str);
    }

    public static AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target[] values() {
        return (AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target[]) $VALUES.clone();
    }
}
