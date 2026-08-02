package defpackage;

import kotlinx.coroutines.flow.SharingCommand;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class pqr {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharingCommand.values().length];
        try {
            iArr[SharingCommand.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharingCommand.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
