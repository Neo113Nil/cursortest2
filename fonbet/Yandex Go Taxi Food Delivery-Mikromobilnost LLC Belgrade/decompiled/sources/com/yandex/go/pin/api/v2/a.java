package com.yandex.go.pin.api.v2;

import com.yandex.go.pin.api.v2.PinV2Component;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinV2Component.Position.values().length];
        try {
            iArr[PinV2Component.Position.MOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinV2Component.Position.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinV2Component.Position.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
