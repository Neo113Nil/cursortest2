package defpackage;

import flex.engine.section.model.ReusePolicy;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class k0z {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReusePolicy.values().length];
        try {
            iArr[ReusePolicy.FORCE_AND_STORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReusePolicy.USE_STORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReusePolicy.FALLBACK_TO_NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
