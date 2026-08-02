package com.yandex.go.masstransit.sdk.ble.api.qrscan.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/qrscan/analytics/QrScanButtonAction;", "", "Close", "OpenSettings", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QrScanButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrScanButtonAction[] $VALUES;
    public static final QrScanButtonAction Close;
    public static final QrScanButtonAction OpenSettings;
    public static final QrScanButtonAction Other;

    static {
        QrScanButtonAction qrScanButtonAction = new QrScanButtonAction("Close", 0);
        Close = qrScanButtonAction;
        QrScanButtonAction qrScanButtonAction2 = new QrScanButtonAction("OpenSettings", 1);
        OpenSettings = qrScanButtonAction2;
        QrScanButtonAction qrScanButtonAction3 = new QrScanButtonAction("Other", 2);
        Other = qrScanButtonAction3;
        QrScanButtonAction[] qrScanButtonActionArr = {qrScanButtonAction, qrScanButtonAction2, qrScanButtonAction3};
        $VALUES = qrScanButtonActionArr;
        $ENTRIES = a.a(qrScanButtonActionArr);
    }

    public static QrScanButtonAction valueOf(String str) {
        return (QrScanButtonAction) Enum.valueOf(QrScanButtonAction.class, str);
    }

    public static QrScanButtonAction[] values() {
        return (QrScanButtonAction[]) $VALUES.clone();
    }
}
