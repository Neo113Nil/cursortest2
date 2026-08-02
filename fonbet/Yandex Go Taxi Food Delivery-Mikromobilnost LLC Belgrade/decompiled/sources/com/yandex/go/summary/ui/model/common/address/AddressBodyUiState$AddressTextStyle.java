package com.yandex.go.summary.ui.model.common.address;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/summary/ui/model/common/address/AddressBodyUiState$AddressTextStyle", "", "Lcom/yandex/go/summary/ui/model/common/address/AddressBodyUiState$AddressTextStyle;", "TITLE_TEXT_STYLE", "SUBTITLE_TEXT_STYLE", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AddressBodyUiState$AddressTextStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressBodyUiState$AddressTextStyle[] $VALUES;
    public static final AddressBodyUiState$AddressTextStyle SUBTITLE_TEXT_STYLE;
    public static final AddressBodyUiState$AddressTextStyle TITLE_TEXT_STYLE;

    static {
        AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle = new AddressBodyUiState$AddressTextStyle("TITLE_TEXT_STYLE", 0);
        TITLE_TEXT_STYLE = addressBodyUiState$AddressTextStyle;
        AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle2 = new AddressBodyUiState$AddressTextStyle("SUBTITLE_TEXT_STYLE", 1);
        SUBTITLE_TEXT_STYLE = addressBodyUiState$AddressTextStyle2;
        AddressBodyUiState$AddressTextStyle[] addressBodyUiState$AddressTextStyleArr = {addressBodyUiState$AddressTextStyle, addressBodyUiState$AddressTextStyle2};
        $VALUES = addressBodyUiState$AddressTextStyleArr;
        $ENTRIES = a.a(addressBodyUiState$AddressTextStyleArr);
    }

    public static AddressBodyUiState$AddressTextStyle valueOf(String str) {
        return (AddressBodyUiState$AddressTextStyle) Enum.valueOf(AddressBodyUiState$AddressTextStyle.class, str);
    }

    public static AddressBodyUiState$AddressTextStyle[] values() {
        return (AddressBodyUiState$AddressTextStyle[]) $VALUES.clone();
    }
}
