package defpackage;

import flex.engine.section.model.ScrollPosition;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b3x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScrollPosition.values().length];
        try {
            iArr[ScrollPosition.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScrollPosition.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScrollPosition.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
