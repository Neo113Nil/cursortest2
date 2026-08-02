package com.yandex.go.taxi.order.promotions.modal_default.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/promotions/modal_default/model/ModalDefaultAction;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Order", "Close", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ModalDefaultAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalDefaultAction[] $VALUES;
    public static final ModalDefaultAction Close;
    public static final ModalDefaultAction Order;
    private final String analyticsName;

    static {
        ModalDefaultAction modalDefaultAction = new ModalDefaultAction("Order", 0, "order");
        Order = modalDefaultAction;
        ModalDefaultAction modalDefaultAction2 = new ModalDefaultAction("Close", 1, null);
        Close = modalDefaultAction2;
        ModalDefaultAction[] modalDefaultActionArr = {modalDefaultAction, modalDefaultAction2};
        $VALUES = modalDefaultActionArr;
        $ENTRIES = a.a(modalDefaultActionArr);
    }

    public ModalDefaultAction(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ModalDefaultAction valueOf(String str) {
        return (ModalDefaultAction) Enum.valueOf(ModalDefaultAction.class, str);
    }

    public static ModalDefaultAction[] values() {
        return (ModalDefaultAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
