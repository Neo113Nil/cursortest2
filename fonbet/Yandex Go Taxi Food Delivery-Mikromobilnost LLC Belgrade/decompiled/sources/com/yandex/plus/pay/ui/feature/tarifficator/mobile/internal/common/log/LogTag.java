package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log;

import defpackage.ht90;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/common/log/LogTag;", "Lht90;", "", "TARIFFICATOR", "BDUI", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogTag implements ht90 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogTag[] $VALUES;
    public static final LogTag BDUI;
    public static final LogTag TARIFFICATOR;

    static {
        LogTag logTag = new LogTag("TARIFFICATOR", 0);
        TARIFFICATOR = logTag;
        LogTag logTag2 = new LogTag("BDUI", 1);
        BDUI = logTag2;
        LogTag[] logTagArr = {logTag, logTag2};
        $VALUES = logTagArr;
        $ENTRIES = a.a(logTagArr);
    }

    public static LogTag valueOf(String str) {
        return (LogTag) Enum.valueOf(LogTag.class, str);
    }

    public static LogTag[] values() {
        return (LogTag[]) $VALUES.clone();
    }

    @Override // defpackage.ht90
    public final String g() {
        return "PAY_UI";
    }

    @Override // defpackage.ht90
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
