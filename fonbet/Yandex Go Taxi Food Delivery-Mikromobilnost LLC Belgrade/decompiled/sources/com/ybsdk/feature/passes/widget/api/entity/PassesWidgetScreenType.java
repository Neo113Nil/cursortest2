package com.ybsdk.feature.passes.widget.api.entity;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/passes/widget/api/entity/PassesWidgetScreenType;", "", "pageType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPageType", "()Ljava/lang/String;", "QR", "NFC", "feature-passes-widget-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassesWidgetScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassesWidgetScreenType[] $VALUES;
    private final String pageType;
    public static final PassesWidgetScreenType QR = new PassesWidgetScreenType("QR", 0, "pay_by_qr");
    public static final PassesWidgetScreenType NFC = new PassesWidgetScreenType("NFC", 1, "pay_by_nfc");

    private static final /* synthetic */ PassesWidgetScreenType[] $values() {
        return new PassesWidgetScreenType[]{QR, NFC};
    }

    static {
        PassesWidgetScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PassesWidgetScreenType(String str, int i, String str2) {
        this.pageType = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PassesWidgetScreenType valueOf(String str) {
        return (PassesWidgetScreenType) Enum.valueOf(PassesWidgetScreenType.class, str);
    }

    public static PassesWidgetScreenType[] values() {
        return (PassesWidgetScreenType[]) $VALUES.clone();
    }

    public final String getPageType() {
        return this.pageType;
    }
}
