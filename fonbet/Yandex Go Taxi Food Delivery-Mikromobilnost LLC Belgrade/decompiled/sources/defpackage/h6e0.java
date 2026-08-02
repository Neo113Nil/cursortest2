package defpackage;

import androidx.room.Transactor$SQLiteTransactionType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class h6e0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Transactor$SQLiteTransactionType.values().length];
        try {
            iArr[Transactor$SQLiteTransactionType.DEFERRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Transactor$SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Transactor$SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
