package com.yandex.go.shortcuts.view.adapter.model.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/model/PlainButtonModel$Style", "", "Lcom/yandex/go/shortcuts/view/adapter/model/model/PlainButtonModel$Style;", "GRAY", "OUTLINE", "CONTROL_MINOR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlainButtonModel$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlainButtonModel$Style[] $VALUES;
    public static final PlainButtonModel$Style CONTROL_MINOR;
    public static final PlainButtonModel$Style GRAY;
    public static final PlainButtonModel$Style OUTLINE;

    static {
        PlainButtonModel$Style plainButtonModel$Style = new PlainButtonModel$Style("GRAY", 0);
        GRAY = plainButtonModel$Style;
        PlainButtonModel$Style plainButtonModel$Style2 = new PlainButtonModel$Style("OUTLINE", 1);
        OUTLINE = plainButtonModel$Style2;
        PlainButtonModel$Style plainButtonModel$Style3 = new PlainButtonModel$Style("CONTROL_MINOR", 2);
        CONTROL_MINOR = plainButtonModel$Style3;
        PlainButtonModel$Style[] plainButtonModel$StyleArr = {plainButtonModel$Style, plainButtonModel$Style2, plainButtonModel$Style3};
        $VALUES = plainButtonModel$StyleArr;
        $ENTRIES = a.a(plainButtonModel$StyleArr);
    }

    public static PlainButtonModel$Style valueOf(String str) {
        return (PlainButtonModel$Style) Enum.valueOf(PlainButtonModel$Style.class, str);
    }

    public static PlainButtonModel$Style[] values() {
        return (PlainButtonModel$Style[]) $VALUES.clone();
    }
}
