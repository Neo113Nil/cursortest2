package defpackage;

import flex.engine.section.model.Side;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class k6q0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Side.values().length];
        try {
            iArr[Side.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Side.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
