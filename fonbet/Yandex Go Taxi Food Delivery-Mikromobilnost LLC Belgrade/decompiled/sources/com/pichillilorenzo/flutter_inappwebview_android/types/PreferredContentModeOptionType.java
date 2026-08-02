package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes11.dex */
public enum PreferredContentModeOptionType {
    RECOMMENDED(0),
    MOBILE(1),
    DESKTOP(2);

    private final int value;

    PreferredContentModeOptionType(int i) {
        this.value = i;
    }

    public static PreferredContentModeOptionType fromValue(int i) {
        for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (i == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
            }
        }
        ny61.g(oyr.i(i, "No enum constant: "));
        return null;
    }

    public boolean equalsValue(int i) {
        return this.value == i;
    }

    public int toValue() {
        return this.value;
    }
}
