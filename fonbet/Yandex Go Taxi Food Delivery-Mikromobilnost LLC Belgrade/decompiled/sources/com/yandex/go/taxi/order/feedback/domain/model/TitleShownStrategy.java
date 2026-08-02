package com.yandex.go.taxi.order.feedback.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/domain/model/TitleShownStrategy;", "", "HIDDEN", "ABOVE_REASONS", "ABOVE_COMMENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TitleShownStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TitleShownStrategy[] $VALUES;
    public static final TitleShownStrategy ABOVE_COMMENT;
    public static final TitleShownStrategy ABOVE_REASONS;
    public static final TitleShownStrategy HIDDEN;

    static {
        TitleShownStrategy titleShownStrategy = new TitleShownStrategy("HIDDEN", 0);
        HIDDEN = titleShownStrategy;
        TitleShownStrategy titleShownStrategy2 = new TitleShownStrategy("ABOVE_REASONS", 1);
        ABOVE_REASONS = titleShownStrategy2;
        TitleShownStrategy titleShownStrategy3 = new TitleShownStrategy("ABOVE_COMMENT", 2);
        ABOVE_COMMENT = titleShownStrategy3;
        TitleShownStrategy[] titleShownStrategyArr = {titleShownStrategy, titleShownStrategy2, titleShownStrategy3};
        $VALUES = titleShownStrategyArr;
        $ENTRIES = a.a(titleShownStrategyArr);
    }

    public static TitleShownStrategy valueOf(String str) {
        return (TitleShownStrategy) Enum.valueOf(TitleShownStrategy.class, str);
    }

    public static TitleShownStrategy[] values() {
        return (TitleShownStrategy[]) $VALUES.clone();
    }
}
