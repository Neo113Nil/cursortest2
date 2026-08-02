package com.yandex.go.vault.domain.prize;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/domain/prize/ActionButtonType;", "", "CLIPBOARD_COPY", "DEEPLINK", "CLOSE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionButtonType[] $VALUES;
    public static final ActionButtonType CLIPBOARD_COPY;
    public static final ActionButtonType CLOSE;
    public static final ActionButtonType DEEPLINK;

    static {
        ActionButtonType actionButtonType = new ActionButtonType("CLIPBOARD_COPY", 0);
        CLIPBOARD_COPY = actionButtonType;
        ActionButtonType actionButtonType2 = new ActionButtonType("DEEPLINK", 1);
        DEEPLINK = actionButtonType2;
        ActionButtonType actionButtonType3 = new ActionButtonType("CLOSE", 2);
        CLOSE = actionButtonType3;
        ActionButtonType[] actionButtonTypeArr = {actionButtonType, actionButtonType2, actionButtonType3};
        $VALUES = actionButtonTypeArr;
        $ENTRIES = a.a(actionButtonTypeArr);
    }

    public static ActionButtonType valueOf(String str) {
        return (ActionButtonType) Enum.valueOf(ActionButtonType.class, str);
    }

    public static ActionButtonType[] values() {
        return (ActionButtonType[]) $VALUES.clone();
    }
}
