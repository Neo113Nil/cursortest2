package com.yandex.voip_calls.calls_go;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/voip_calls/calls_go/IncomingCallAction;", "", "", "action", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ANSWER", "DECLINE", "DELETE", "calls_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IncomingCallAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IncomingCallAction[] $VALUES;
    public static final IncomingCallAction ANSWER;
    public static final IncomingCallAction DECLINE;
    public static final IncomingCallAction DELETE;
    private final String action;

    static {
        IncomingCallAction incomingCallAction = new IncomingCallAction("ANSWER", 0, "answer");
        ANSWER = incomingCallAction;
        IncomingCallAction incomingCallAction2 = new IncomingCallAction("DECLINE", 1, "decline");
        DECLINE = incomingCallAction2;
        IncomingCallAction incomingCallAction3 = new IncomingCallAction("DELETE", 2, "delete");
        DELETE = incomingCallAction3;
        IncomingCallAction[] incomingCallActionArr = {incomingCallAction, incomingCallAction2, incomingCallAction3};
        $VALUES = incomingCallActionArr;
        $ENTRIES = a.a(incomingCallActionArr);
    }

    public IncomingCallAction(String str, int i, String str2) {
        this.action = str2;
    }

    public static IncomingCallAction valueOf(String str) {
        return (IncomingCallAction) Enum.valueOf(IncomingCallAction.class, str);
    }

    public static IncomingCallAction[] values() {
        return (IncomingCallAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }
}
