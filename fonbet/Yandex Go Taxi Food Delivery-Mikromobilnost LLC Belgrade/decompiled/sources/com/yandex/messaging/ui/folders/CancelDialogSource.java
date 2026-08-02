package com.yandex.messaging.ui.folders;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/ui/folders/CancelDialogSource;", "", "CloseButton", "SwipeDismiss", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class CancelDialogSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelDialogSource[] $VALUES;
    public static final CancelDialogSource CloseButton;
    public static final CancelDialogSource SwipeDismiss;

    static {
        CancelDialogSource cancelDialogSource = new CancelDialogSource("CloseButton", 0);
        CloseButton = cancelDialogSource;
        CancelDialogSource cancelDialogSource2 = new CancelDialogSource("SwipeDismiss", 1);
        SwipeDismiss = cancelDialogSource2;
        CancelDialogSource[] cancelDialogSourceArr = {cancelDialogSource, cancelDialogSource2};
        $VALUES = cancelDialogSourceArr;
        $ENTRIES = kotlin.enums.a.a(cancelDialogSourceArr);
    }

    public static CancelDialogSource valueOf(String str) {
        return (CancelDialogSource) Enum.valueOf(CancelDialogSource.class, str);
    }

    public static CancelDialogSource[] values() {
        return (CancelDialogSource[]) $VALUES.clone();
    }
}
