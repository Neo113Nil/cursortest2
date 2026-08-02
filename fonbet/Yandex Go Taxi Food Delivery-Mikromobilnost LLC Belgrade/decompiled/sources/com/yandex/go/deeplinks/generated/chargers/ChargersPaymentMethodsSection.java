package com.yandex.go.deeplinks.generated.chargers;

import defpackage.k4o;
import defpackage.xla;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/deeplinks/generated/chargers/ChargersPaymentMethodsSection;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "xla", "PAYMENTMETHODS", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPaymentMethodsSection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersPaymentMethodsSection[] $VALUES;
    public static final xla Companion;
    public static final ChargersPaymentMethodsSection PAYMENTMETHODS;
    private final String value = "paymentmethods";

    static {
        ChargersPaymentMethodsSection chargersPaymentMethodsSection = new ChargersPaymentMethodsSection();
        PAYMENTMETHODS = chargersPaymentMethodsSection;
        ChargersPaymentMethodsSection[] chargersPaymentMethodsSectionArr = {chargersPaymentMethodsSection};
        $VALUES = chargersPaymentMethodsSectionArr;
        $ENTRIES = a.a(chargersPaymentMethodsSectionArr);
        Companion = new xla();
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ChargersPaymentMethodsSection valueOf(String str) {
        return (ChargersPaymentMethodsSection) Enum.valueOf(ChargersPaymentMethodsSection.class, str);
    }

    public static ChargersPaymentMethodsSection[] values() {
        return (ChargersPaymentMethodsSection[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
