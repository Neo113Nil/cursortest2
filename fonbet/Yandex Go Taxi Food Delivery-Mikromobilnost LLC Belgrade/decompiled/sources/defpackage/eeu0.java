package defpackage;

import just.adapter.sticky.StickyGravity;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class eeu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StickyGravity.values().length];
        try {
            iArr[StickyGravity.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StickyGravity.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
