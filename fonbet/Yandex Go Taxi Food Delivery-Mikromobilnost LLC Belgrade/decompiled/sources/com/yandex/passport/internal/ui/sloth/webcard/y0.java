package com.yandex.passport.internal.ui.sloth.webcard;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebCardSlothUi$WebCardPosition.values().length];
        try {
            iArr[WebCardSlothUi$WebCardPosition.Bottom.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebCardSlothUi$WebCardPosition.Mid.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebCardSlothUi$WebCardPosition.Top.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
