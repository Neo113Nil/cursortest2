package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes11.dex */
public enum UserScriptInjectionTime {
    AT_DOCUMENT_START(0),
    AT_DOCUMENT_END(1);

    private final int value;

    UserScriptInjectionTime(int i) {
        this.value = i;
    }

    public static UserScriptInjectionTime fromValue(int i) {
        for (UserScriptInjectionTime userScriptInjectionTime : values()) {
            if (i == userScriptInjectionTime.toValue()) {
                return userScriptInjectionTime;
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
