package com.ybsdk.feature.autotopup.internal.presentation.result;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/result/AutoTopupLogoResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "FAILED", "SUCCESS", "HIDDEN", "BIG_LOGO_PROCESSING", "TIMEOUT", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupLogoResultStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupLogoResultStatus[] $VALUES;
    public static final AutoTopupLogoResultStatus PROCESSING = new AutoTopupLogoResultStatus("PROCESSING", 0);
    public static final AutoTopupLogoResultStatus FAILED = new AutoTopupLogoResultStatus("FAILED", 1);
    public static final AutoTopupLogoResultStatus SUCCESS = new AutoTopupLogoResultStatus("SUCCESS", 2);
    public static final AutoTopupLogoResultStatus HIDDEN = new AutoTopupLogoResultStatus("HIDDEN", 3);
    public static final AutoTopupLogoResultStatus BIG_LOGO_PROCESSING = new AutoTopupLogoResultStatus("BIG_LOGO_PROCESSING", 4);
    public static final AutoTopupLogoResultStatus TIMEOUT = new AutoTopupLogoResultStatus("TIMEOUT", 5);

    private static final /* synthetic */ AutoTopupLogoResultStatus[] $values() {
        return new AutoTopupLogoResultStatus[]{PROCESSING, FAILED, SUCCESS, HIDDEN, BIG_LOGO_PROCESSING, TIMEOUT};
    }

    static {
        AutoTopupLogoResultStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AutoTopupLogoResultStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupLogoResultStatus valueOf(String str) {
        return (AutoTopupLogoResultStatus) Enum.valueOf(AutoTopupLogoResultStatus.class, str);
    }

    public static AutoTopupLogoResultStatus[] values() {
        return (AutoTopupLogoResultStatus[]) $VALUES.clone();
    }
}
