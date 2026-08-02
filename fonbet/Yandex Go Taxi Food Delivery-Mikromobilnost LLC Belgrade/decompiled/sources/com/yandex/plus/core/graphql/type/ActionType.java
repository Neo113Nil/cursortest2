package com.yandex.plus.core.graphql.type;

import defpackage.bz;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/core/graphql/type/ActionType;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "bz", "accept", "activatePresent", "afisha", "cardActivation", "cashback", "closeCurrentWebview", "closePopup", "currentWindow", "custom", "iframe", "modalWindow", "newWindow", "none", "popup", "retryPayment", "subscribe", "unconditionalExternalTransition", "unconditionalTransition", "unfreeze", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final bz Companion;
    public static final ActionType UNKNOWN__;
    public static final ActionType accept;
    public static final ActionType activatePresent;
    public static final ActionType afisha;
    public static final ActionType cardActivation;
    public static final ActionType cashback;
    public static final ActionType closeCurrentWebview;
    public static final ActionType closePopup;
    public static final ActionType currentWindow;
    public static final ActionType custom;
    public static final ActionType iframe;
    public static final ActionType modalWindow;
    public static final ActionType newWindow;
    public static final ActionType none;
    public static final ActionType popup;
    public static final ActionType retryPayment;
    public static final ActionType subscribe;
    private static final p4o type;
    public static final ActionType unconditionalExternalTransition;
    public static final ActionType unconditionalTransition;
    public static final ActionType unfreeze;
    private final String rawValue;

    static {
        ActionType actionType = new ActionType("accept", 0, "accept");
        accept = actionType;
        ActionType actionType2 = new ActionType("activatePresent", 1, "activatePresent");
        activatePresent = actionType2;
        ActionType actionType3 = new ActionType("afisha", 2, "afisha");
        afisha = actionType3;
        ActionType actionType4 = new ActionType("cardActivation", 3, "cardActivation");
        cardActivation = actionType4;
        ActionType actionType5 = new ActionType("cashback", 4, "cashback");
        cashback = actionType5;
        ActionType actionType6 = new ActionType("closeCurrentWebview", 5, "closeCurrentWebview");
        closeCurrentWebview = actionType6;
        ActionType actionType7 = new ActionType("closePopup", 6, "closePopup");
        closePopup = actionType7;
        ActionType actionType8 = new ActionType("currentWindow", 7, "currentWindow");
        currentWindow = actionType8;
        ActionType actionType9 = new ActionType("custom", 8, "custom");
        custom = actionType9;
        ActionType actionType10 = new ActionType("iframe", 9, "iframe");
        iframe = actionType10;
        ActionType actionType11 = new ActionType("modalWindow", 10, "modalWindow");
        modalWindow = actionType11;
        ActionType actionType12 = new ActionType("newWindow", 11, "newWindow");
        newWindow = actionType12;
        ActionType actionType13 = new ActionType("none", 12, "none");
        none = actionType13;
        ActionType actionType14 = new ActionType("popup", 13, "popup");
        popup = actionType14;
        ActionType actionType15 = new ActionType("retryPayment", 14, "retryPayment");
        retryPayment = actionType15;
        ActionType actionType16 = new ActionType("subscribe", 15, "subscribe");
        subscribe = actionType16;
        ActionType actionType17 = new ActionType("unconditionalExternalTransition", 16, "unconditionalExternalTransition");
        unconditionalExternalTransition = actionType17;
        ActionType actionType18 = new ActionType("unconditionalTransition", 17, "unconditionalTransition");
        unconditionalTransition = actionType18;
        ActionType actionType19 = new ActionType("unfreeze", 18, "unfreeze");
        unfreeze = actionType19;
        ActionType actionType20 = new ActionType("UNKNOWN__", 19, "UNKNOWN__");
        UNKNOWN__ = actionType20;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9, actionType10, actionType11, actionType12, actionType13, actionType14, actionType15, actionType16, actionType17, actionType18, actionType19, actionType20};
        $VALUES = actionTypeArr;
        $ENTRIES = a.a(actionTypeArr);
        Companion = new bz();
        scc.g("accept", "activatePresent", "afisha", "cardActivation", "cashback", "closeCurrentWebview", "closePopup", "currentWindow", "custom", "iframe", "modalWindow", "newWindow", "none", "popup", "retryPayment", "subscribe", "unconditionalExternalTransition", "unconditionalTransition", "unfreeze");
        type = new p4o("ActionType");
    }

    public ActionType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
