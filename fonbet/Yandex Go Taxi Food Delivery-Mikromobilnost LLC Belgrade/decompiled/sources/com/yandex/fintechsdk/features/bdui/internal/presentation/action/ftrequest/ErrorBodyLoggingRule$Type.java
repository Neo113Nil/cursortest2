package com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/fintechsdk/features/bdui/internal/presentation/action/ftrequest/ErrorBodyLoggingRule$Type", "", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/action/ftrequest/ErrorBodyLoggingRule$Type;", "Skip", "Full", "Partial", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorBodyLoggingRule$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorBodyLoggingRule$Type[] $VALUES;
    public static final ErrorBodyLoggingRule$Type Full;
    public static final ErrorBodyLoggingRule$Type Partial;
    public static final ErrorBodyLoggingRule$Type Skip;

    static {
        ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type = new ErrorBodyLoggingRule$Type("Skip", 0);
        Skip = errorBodyLoggingRule$Type;
        ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type2 = new ErrorBodyLoggingRule$Type("Full", 1);
        Full = errorBodyLoggingRule$Type2;
        ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type3 = new ErrorBodyLoggingRule$Type("Partial", 2);
        Partial = errorBodyLoggingRule$Type3;
        ErrorBodyLoggingRule$Type[] errorBodyLoggingRule$TypeArr = {errorBodyLoggingRule$Type, errorBodyLoggingRule$Type2, errorBodyLoggingRule$Type3};
        $VALUES = errorBodyLoggingRule$TypeArr;
        $ENTRIES = kotlin.enums.a.a(errorBodyLoggingRule$TypeArr);
    }

    public static ErrorBodyLoggingRule$Type valueOf(String str) {
        return (ErrorBodyLoggingRule$Type) Enum.valueOf(ErrorBodyLoggingRule$Type.class, str);
    }

    public static ErrorBodyLoggingRule$Type[] values() {
        return (ErrorBodyLoggingRule$Type[]) $VALUES.clone();
    }
}
