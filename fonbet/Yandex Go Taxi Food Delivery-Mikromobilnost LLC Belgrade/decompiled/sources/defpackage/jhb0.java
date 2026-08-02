package defpackage;

import com.fluttercandies.photo_manager.core.PhotoManagerWriteManager$OperationType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class jhb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PhotoManagerWriteManager$OperationType.values().length];
        try {
            iArr[PhotoManagerWriteManager$OperationType.MOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhotoManagerWriteManager$OperationType.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
