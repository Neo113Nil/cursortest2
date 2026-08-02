package com.yandex.go.trusted_contacts.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/trusted_contacts/domain/entities/DialogButton;", "", "ADDITIONAL", "MAIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DialogButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DialogButton[] $VALUES;
    public static final DialogButton ADDITIONAL;
    public static final DialogButton MAIN;

    static {
        DialogButton dialogButton = new DialogButton("ADDITIONAL", 0);
        ADDITIONAL = dialogButton;
        DialogButton dialogButton2 = new DialogButton("MAIN", 1);
        MAIN = dialogButton2;
        DialogButton[] dialogButtonArr = {dialogButton, dialogButton2};
        $VALUES = dialogButtonArr;
        $ENTRIES = a.a(dialogButtonArr);
    }

    public static DialogButton valueOf(String str) {
        return (DialogButton) Enum.valueOf(DialogButton.class, str);
    }

    public static DialogButton[] values() {
        return (DialogButton[]) $VALUES.clone();
    }
}
