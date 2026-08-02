package com.yandex.go.requirements.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/api/domain/model/OptionViewStyle;", "", "SPINNER", "CHECKBOX", "RADIO", "go-client-android.features.requirements:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OptionViewStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OptionViewStyle[] $VALUES;
    public static final OptionViewStyle CHECKBOX;
    public static final OptionViewStyle RADIO;
    public static final OptionViewStyle SPINNER;

    static {
        OptionViewStyle optionViewStyle = new OptionViewStyle("SPINNER", 0);
        SPINNER = optionViewStyle;
        OptionViewStyle optionViewStyle2 = new OptionViewStyle("CHECKBOX", 1);
        CHECKBOX = optionViewStyle2;
        OptionViewStyle optionViewStyle3 = new OptionViewStyle("RADIO", 2);
        RADIO = optionViewStyle3;
        OptionViewStyle[] optionViewStyleArr = {optionViewStyle, optionViewStyle2, optionViewStyle3};
        $VALUES = optionViewStyleArr;
        $ENTRIES = a.a(optionViewStyleArr);
    }

    public static OptionViewStyle valueOf(String str) {
        return (OptionViewStyle) Enum.valueOf(OptionViewStyle.class, str);
    }

    public static OptionViewStyle[] values() {
        return (OptionViewStyle[]) $VALUES.clone();
    }
}
