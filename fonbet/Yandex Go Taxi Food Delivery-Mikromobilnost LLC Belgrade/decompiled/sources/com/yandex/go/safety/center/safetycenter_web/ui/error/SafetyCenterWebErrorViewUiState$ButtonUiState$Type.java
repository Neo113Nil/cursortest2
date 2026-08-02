package com.yandex.go.safety.center.safetycenter_web.ui.error;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/safety/center/safetycenter_web/ui/error/SafetyCenterWebErrorViewUiState$ButtonUiState$Type", "", "Lcom/yandex/go/safety/center/safetycenter_web/ui/error/SafetyCenterWebErrorViewUiState$ButtonUiState$Type;", "CALL_EMERGENCY", "SUPPORT", "SHARE_URL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterWebErrorViewUiState$ButtonUiState$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterWebErrorViewUiState$ButtonUiState$Type[] $VALUES;
    public static final SafetyCenterWebErrorViewUiState$ButtonUiState$Type CALL_EMERGENCY;
    public static final SafetyCenterWebErrorViewUiState$ButtonUiState$Type SHARE_URL;
    public static final SafetyCenterWebErrorViewUiState$ButtonUiState$Type SUPPORT;

    static {
        SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type = new SafetyCenterWebErrorViewUiState$ButtonUiState$Type("CALL_EMERGENCY", 0);
        CALL_EMERGENCY = safetyCenterWebErrorViewUiState$ButtonUiState$Type;
        SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type2 = new SafetyCenterWebErrorViewUiState$ButtonUiState$Type("SUPPORT", 1);
        SUPPORT = safetyCenterWebErrorViewUiState$ButtonUiState$Type2;
        SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type3 = new SafetyCenterWebErrorViewUiState$ButtonUiState$Type("SHARE_URL", 2);
        SHARE_URL = safetyCenterWebErrorViewUiState$ButtonUiState$Type3;
        SafetyCenterWebErrorViewUiState$ButtonUiState$Type[] safetyCenterWebErrorViewUiState$ButtonUiState$TypeArr = {safetyCenterWebErrorViewUiState$ButtonUiState$Type, safetyCenterWebErrorViewUiState$ButtonUiState$Type2, safetyCenterWebErrorViewUiState$ButtonUiState$Type3};
        $VALUES = safetyCenterWebErrorViewUiState$ButtonUiState$TypeArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterWebErrorViewUiState$ButtonUiState$TypeArr);
    }

    public static SafetyCenterWebErrorViewUiState$ButtonUiState$Type valueOf(String str) {
        return (SafetyCenterWebErrorViewUiState$ButtonUiState$Type) Enum.valueOf(SafetyCenterWebErrorViewUiState$ButtonUiState$Type.class, str);
    }

    public static SafetyCenterWebErrorViewUiState$ButtonUiState$Type[] values() {
        return (SafetyCenterWebErrorViewUiState$ButtonUiState$Type[]) $VALUES.clone();
    }
}
