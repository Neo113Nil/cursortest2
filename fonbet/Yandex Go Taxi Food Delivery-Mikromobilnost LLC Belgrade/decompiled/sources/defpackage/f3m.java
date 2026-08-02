package defpackage;

import flex.engine.state.DocumentState$Tag;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class f3m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DocumentState$Tag.values().length];
        try {
            iArr[DocumentState$Tag.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DocumentState$Tag.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DocumentState$Tag.REFRESHING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DocumentState$Tag.RENDERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DocumentState$Tag.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
