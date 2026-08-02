package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes11.dex */
public enum NavigationActionPolicy {
    CANCEL(0),
    ALLOW(1);

    private final int value;

    NavigationActionPolicy(int i) {
        this.value = i;
    }

    public static NavigationActionPolicy fromValue(int i) {
        for (NavigationActionPolicy navigationActionPolicy : values()) {
            if (i == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        ny61.g(oyr.i(i, "No enum constant: "));
        return null;
    }

    public boolean equalsValue(int i) {
        return this.value == i;
    }

    public int rawValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }
}
