package androidx.sqlite.driver;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportSQLiteStatement$Companion$TransactionOperation.values().length];
        try {
            iArr[SupportSQLiteStatement$Companion$TransactionOperation.END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportSQLiteStatement$Companion$TransactionOperation.ROLLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SupportSQLiteStatement$Companion$TransactionOperation.BEGIN_DEFERRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
