package com.yandex.go.payments.sbp.domain.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/payments/sbp/domain/analytics/SbpBindingAnalytics$Button", "", "Lcom/yandex/go/payments/sbp/domain/analytics/SbpBindingAnalytics$Button;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACK", "CANCEL", "OPEN", "DELETE", "LEAVE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SbpBindingAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SbpBindingAnalytics$Button[] $VALUES;
    public static final SbpBindingAnalytics$Button BACK;
    public static final SbpBindingAnalytics$Button CANCEL;
    public static final SbpBindingAnalytics$Button DELETE;
    public static final SbpBindingAnalytics$Button LEAVE;
    public static final SbpBindingAnalytics$Button OPEN;
    private final String buttonName;

    static {
        SbpBindingAnalytics$Button sbpBindingAnalytics$Button = new SbpBindingAnalytics$Button("BACK", 0, "back");
        BACK = sbpBindingAnalytics$Button;
        SbpBindingAnalytics$Button sbpBindingAnalytics$Button2 = new SbpBindingAnalytics$Button("CANCEL", 1, "cancel");
        CANCEL = sbpBindingAnalytics$Button2;
        SbpBindingAnalytics$Button sbpBindingAnalytics$Button3 = new SbpBindingAnalytics$Button("OPEN", 2, OpenList.STR_OPEN);
        OPEN = sbpBindingAnalytics$Button3;
        SbpBindingAnalytics$Button sbpBindingAnalytics$Button4 = new SbpBindingAnalytics$Button("DELETE", 3, "delete");
        DELETE = sbpBindingAnalytics$Button4;
        SbpBindingAnalytics$Button sbpBindingAnalytics$Button5 = new SbpBindingAnalytics$Button("LEAVE", 4, "leave");
        LEAVE = sbpBindingAnalytics$Button5;
        SbpBindingAnalytics$Button[] sbpBindingAnalytics$ButtonArr = {sbpBindingAnalytics$Button, sbpBindingAnalytics$Button2, sbpBindingAnalytics$Button3, sbpBindingAnalytics$Button4, sbpBindingAnalytics$Button5};
        $VALUES = sbpBindingAnalytics$ButtonArr;
        $ENTRIES = a.a(sbpBindingAnalytics$ButtonArr);
    }

    public SbpBindingAnalytics$Button(String str, int i, String str2) {
        this.buttonName = str2;
    }

    public static SbpBindingAnalytics$Button valueOf(String str) {
        return (SbpBindingAnalytics$Button) Enum.valueOf(SbpBindingAnalytics$Button.class, str);
    }

    public static SbpBindingAnalytics$Button[] values() {
        return (SbpBindingAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
