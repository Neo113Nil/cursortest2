package com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/autotopup/internal/presentation/setup/v2/state/AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput", "", "Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/state/AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;", "<init>", "(Ljava/lang/String;I)V", "AMOUNT", "THRESHOLD", JCP.RAW_PREFIX, "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput[] $VALUES;
    public static final AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput AMOUNT = new AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput("AMOUNT", 0);
    public static final AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput THRESHOLD = new AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput("THRESHOLD", 1);
    public static final AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput NONE = new AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput(JCP.RAW_PREFIX, 2);

    private static final /* synthetic */ AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput[] $values() {
        return new AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput[]{AMOUNT, THRESHOLD, NONE};
    }

    static {
        AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput valueOf(String str) {
        return (AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput) Enum.valueOf(AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput.class, str);
    }

    public static AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput[] values() {
        return (AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput[]) $VALUES.clone();
    }
}
