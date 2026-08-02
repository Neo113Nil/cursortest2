package com.yandex.go.agreement.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/agreement/api/Acceptance$Default$IconStyle", "", "Lcom/yandex/go/agreement/api/Acceptance$Default$IconStyle;", "LEFT", "CENTER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Acceptance$Default$IconStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Acceptance$Default$IconStyle[] $VALUES;
    public static final Acceptance$Default$IconStyle CENTER;
    public static final Acceptance$Default$IconStyle LEFT;

    static {
        Acceptance$Default$IconStyle acceptance$Default$IconStyle = new Acceptance$Default$IconStyle("LEFT", 0);
        LEFT = acceptance$Default$IconStyle;
        Acceptance$Default$IconStyle acceptance$Default$IconStyle2 = new Acceptance$Default$IconStyle("CENTER", 1);
        CENTER = acceptance$Default$IconStyle2;
        Acceptance$Default$IconStyle[] acceptance$Default$IconStyleArr = {acceptance$Default$IconStyle, acceptance$Default$IconStyle2};
        $VALUES = acceptance$Default$IconStyleArr;
        $ENTRIES = a.a(acceptance$Default$IconStyleArr);
    }

    public static Acceptance$Default$IconStyle valueOf(String str) {
        return (Acceptance$Default$IconStyle) Enum.valueOf(Acceptance$Default$IconStyle.class, str);
    }

    public static Acceptance$Default$IconStyle[] values() {
        return (Acceptance$Default$IconStyle[]) $VALUES.clone();
    }
}
