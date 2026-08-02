package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class jnr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BufferOverflow.values().length];
        try {
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
