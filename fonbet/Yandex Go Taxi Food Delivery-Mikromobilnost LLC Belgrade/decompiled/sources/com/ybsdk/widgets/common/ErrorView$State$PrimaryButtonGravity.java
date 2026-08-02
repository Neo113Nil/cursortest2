package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity", "", "Lcom/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity;", "<init>", "(Ljava/lang/String;I)V", "BOTTOM", "CENTER", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorView$State$PrimaryButtonGravity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorView$State$PrimaryButtonGravity[] $VALUES;
    public static final ErrorView$State$PrimaryButtonGravity BOTTOM = new ErrorView$State$PrimaryButtonGravity("BOTTOM", 0);
    public static final ErrorView$State$PrimaryButtonGravity CENTER = new ErrorView$State$PrimaryButtonGravity("CENTER", 1);

    private static final /* synthetic */ ErrorView$State$PrimaryButtonGravity[] $values() {
        return new ErrorView$State$PrimaryButtonGravity[]{BOTTOM, CENTER};
    }

    static {
        ErrorView$State$PrimaryButtonGravity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ErrorView$State$PrimaryButtonGravity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ErrorView$State$PrimaryButtonGravity valueOf(String str) {
        return (ErrorView$State$PrimaryButtonGravity) Enum.valueOf(ErrorView$State$PrimaryButtonGravity.class, str);
    }

    public static ErrorView$State$PrimaryButtonGravity[] values() {
        return (ErrorView$State$PrimaryButtonGravity[]) $VALUES.clone();
    }
}
