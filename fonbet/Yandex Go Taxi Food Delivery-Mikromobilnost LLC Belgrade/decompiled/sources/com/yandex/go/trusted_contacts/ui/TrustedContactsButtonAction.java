package com.yandex.go.trusted_contacts.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/trusted_contacts/ui/TrustedContactsButtonAction;", "", "CLOSE", "DELETE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrustedContactsButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrustedContactsButtonAction[] $VALUES;
    public static final TrustedContactsButtonAction CLOSE;
    public static final TrustedContactsButtonAction DELETE;

    static {
        TrustedContactsButtonAction trustedContactsButtonAction = new TrustedContactsButtonAction("CLOSE", 0);
        CLOSE = trustedContactsButtonAction;
        TrustedContactsButtonAction trustedContactsButtonAction2 = new TrustedContactsButtonAction("DELETE", 1);
        DELETE = trustedContactsButtonAction2;
        TrustedContactsButtonAction[] trustedContactsButtonActionArr = {trustedContactsButtonAction, trustedContactsButtonAction2};
        $VALUES = trustedContactsButtonActionArr;
        $ENTRIES = kotlin.enums.a.a(trustedContactsButtonActionArr);
    }

    public static TrustedContactsButtonAction valueOf(String str) {
        return (TrustedContactsButtonAction) Enum.valueOf(TrustedContactsButtonAction.class, str);
    }

    public static TrustedContactsButtonAction[] values() {
        return (TrustedContactsButtonAction[]) $VALUES.clone();
    }
}
