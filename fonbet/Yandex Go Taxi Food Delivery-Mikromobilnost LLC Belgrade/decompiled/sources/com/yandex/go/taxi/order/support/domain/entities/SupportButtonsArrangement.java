package com.yandex.go.taxi.order.support.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/support/domain/entities/SupportButtonsArrangement;", "", "VERTICAL", "HORIZONTAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SupportButtonsArrangement {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportButtonsArrangement[] $VALUES;
    public static final SupportButtonsArrangement HORIZONTAL;
    public static final SupportButtonsArrangement VERTICAL;

    static {
        SupportButtonsArrangement supportButtonsArrangement = new SupportButtonsArrangement("VERTICAL", 0);
        VERTICAL = supportButtonsArrangement;
        SupportButtonsArrangement supportButtonsArrangement2 = new SupportButtonsArrangement("HORIZONTAL", 1);
        HORIZONTAL = supportButtonsArrangement2;
        SupportButtonsArrangement[] supportButtonsArrangementArr = {supportButtonsArrangement, supportButtonsArrangement2};
        $VALUES = supportButtonsArrangementArr;
        $ENTRIES = a.a(supportButtonsArrangementArr);
    }

    public static SupportButtonsArrangement valueOf(String str) {
        return (SupportButtonsArrangement) Enum.valueOf(SupportButtonsArrangement.class, str);
    }

    public static SupportButtonsArrangement[] values() {
        return (SupportButtonsArrangement[]) $VALUES.clone();
    }
}
