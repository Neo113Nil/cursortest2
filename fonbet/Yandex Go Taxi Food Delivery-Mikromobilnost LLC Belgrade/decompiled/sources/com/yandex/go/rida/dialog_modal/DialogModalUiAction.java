package com.yandex.go.rida.dialog_modal;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/rida/dialog_modal/DialogModalUiAction;", "", "OnAccept", "OnCancel", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogModalUiAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DialogModalUiAction[] $VALUES;
    public static final DialogModalUiAction OnAccept;
    public static final DialogModalUiAction OnCancel;

    static {
        DialogModalUiAction dialogModalUiAction = new DialogModalUiAction("OnAccept", 0);
        OnAccept = dialogModalUiAction;
        DialogModalUiAction dialogModalUiAction2 = new DialogModalUiAction("OnCancel", 1);
        OnCancel = dialogModalUiAction2;
        DialogModalUiAction[] dialogModalUiActionArr = {dialogModalUiAction, dialogModalUiAction2};
        $VALUES = dialogModalUiActionArr;
        $ENTRIES = a.a(dialogModalUiActionArr);
    }

    public static DialogModalUiAction valueOf(String str) {
        return (DialogModalUiAction) Enum.valueOf(DialogModalUiAction.class, str);
    }

    public static DialogModalUiAction[] values() {
        return (DialogModalUiAction[]) $VALUES.clone();
    }
}
