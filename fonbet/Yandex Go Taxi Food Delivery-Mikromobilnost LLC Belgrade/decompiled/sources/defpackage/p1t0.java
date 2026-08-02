package defpackage;

import just.adapter.snapping.SnappingAnchor;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class p1t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SnappingAnchor.values().length];
        try {
            iArr[SnappingAnchor.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnappingAnchor.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
