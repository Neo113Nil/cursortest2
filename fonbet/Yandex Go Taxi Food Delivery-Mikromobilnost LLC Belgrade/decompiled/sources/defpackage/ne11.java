package defpackage;

import androidx.room.ObservedTableStates$ObserveOp;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ne11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ObservedTableStates$ObserveOp.values().length];
        try {
            iArr[ObservedTableStates$ObserveOp.NO_OP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ObservedTableStates$ObserveOp.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ObservedTableStates$ObserveOp.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
