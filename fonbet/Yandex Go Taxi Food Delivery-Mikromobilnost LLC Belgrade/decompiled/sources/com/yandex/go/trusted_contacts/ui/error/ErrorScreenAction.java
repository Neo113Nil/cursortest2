package com.yandex.go.trusted_contacts.ui.error;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/ui/error/ErrorScreenAction;", "", "BACK", "BACK_TO_CONTACT_SELECTION", "TRY_AGAIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ErrorScreenAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorScreenAction[] $VALUES;
    public static final ErrorScreenAction BACK;
    public static final ErrorScreenAction BACK_TO_CONTACT_SELECTION;
    public static final ErrorScreenAction TRY_AGAIN;

    static {
        ErrorScreenAction errorScreenAction = new ErrorScreenAction("BACK", 0);
        BACK = errorScreenAction;
        ErrorScreenAction errorScreenAction2 = new ErrorScreenAction("BACK_TO_CONTACT_SELECTION", 1);
        BACK_TO_CONTACT_SELECTION = errorScreenAction2;
        ErrorScreenAction errorScreenAction3 = new ErrorScreenAction("TRY_AGAIN", 2);
        TRY_AGAIN = errorScreenAction3;
        ErrorScreenAction[] errorScreenActionArr = {errorScreenAction, errorScreenAction2, errorScreenAction3};
        $VALUES = errorScreenActionArr;
        $ENTRIES = a.a(errorScreenActionArr);
    }

    public static ErrorScreenAction valueOf(String str) {
        return (ErrorScreenAction) Enum.valueOf(ErrorScreenAction.class, str);
    }

    public static ErrorScreenAction[] values() {
        return (ErrorScreenAction[]) $VALUES.clone();
    }
}
