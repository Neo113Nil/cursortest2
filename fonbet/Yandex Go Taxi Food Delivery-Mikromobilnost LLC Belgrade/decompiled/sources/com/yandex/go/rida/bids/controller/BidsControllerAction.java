package com.yandex.go.rida.bids.controller;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/rida/bids/controller/BidsControllerAction;", "", "OnAcceptRequested", "OnAcceptFailed", "OnAcceptSuccess", "OnCancelRequested", "OnCancelCompleted", "OnTimerExpired", "OnItemRemovedFromUi", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BidsControllerAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BidsControllerAction[] $VALUES;
    public static final BidsControllerAction OnAcceptFailed;
    public static final BidsControllerAction OnAcceptRequested;
    public static final BidsControllerAction OnAcceptSuccess;
    public static final BidsControllerAction OnCancelCompleted;
    public static final BidsControllerAction OnCancelRequested;
    public static final BidsControllerAction OnItemRemovedFromUi;
    public static final BidsControllerAction OnTimerExpired;

    static {
        BidsControllerAction bidsControllerAction = new BidsControllerAction("OnAcceptRequested", 0);
        OnAcceptRequested = bidsControllerAction;
        BidsControllerAction bidsControllerAction2 = new BidsControllerAction("OnAcceptFailed", 1);
        OnAcceptFailed = bidsControllerAction2;
        BidsControllerAction bidsControllerAction3 = new BidsControllerAction("OnAcceptSuccess", 2);
        OnAcceptSuccess = bidsControllerAction3;
        BidsControllerAction bidsControllerAction4 = new BidsControllerAction("OnCancelRequested", 3);
        OnCancelRequested = bidsControllerAction4;
        BidsControllerAction bidsControllerAction5 = new BidsControllerAction("OnCancelCompleted", 4);
        OnCancelCompleted = bidsControllerAction5;
        BidsControllerAction bidsControllerAction6 = new BidsControllerAction("OnTimerExpired", 5);
        OnTimerExpired = bidsControllerAction6;
        BidsControllerAction bidsControllerAction7 = new BidsControllerAction("OnItemRemovedFromUi", 6);
        OnItemRemovedFromUi = bidsControllerAction7;
        BidsControllerAction[] bidsControllerActionArr = {bidsControllerAction, bidsControllerAction2, bidsControllerAction3, bidsControllerAction4, bidsControllerAction5, bidsControllerAction6, bidsControllerAction7};
        $VALUES = bidsControllerActionArr;
        $ENTRIES = kotlin.enums.a.a(bidsControllerActionArr);
    }

    public static BidsControllerAction valueOf(String str) {
        return (BidsControllerAction) Enum.valueOf(BidsControllerAction.class, str);
    }

    public static BidsControllerAction[] values() {
        return (BidsControllerAction[]) $VALUES.clone();
    }
}
