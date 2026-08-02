package com.yandex.messaging;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/SendAction;", "", "", "action", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NO_ACTION", "SHARE", "FORWARD", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SendAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SendAction[] $VALUES;
    public static final SendAction FORWARD;
    public static final SendAction NO_ACTION;
    public static final SendAction SHARE;
    private final String action;

    static {
        SendAction sendAction = new SendAction("NO_ACTION", 0, "");
        NO_ACTION = sendAction;
        SendAction sendAction2 = new SendAction("SHARE", 1, "share action");
        SHARE = sendAction2;
        SendAction sendAction3 = new SendAction("FORWARD", 2, "forward action");
        FORWARD = sendAction3;
        SendAction[] sendActionArr = {sendAction, sendAction2, sendAction3};
        $VALUES = sendActionArr;
        $ENTRIES = kotlin.enums.a.a(sendActionArr);
    }

    public SendAction(String str, int i, String str2) {
        this.action = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static SendAction valueOf(String str) {
        return (SendAction) Enum.valueOf(SendAction.class, str);
    }

    public static SendAction[] values() {
        return (SendAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }
}
