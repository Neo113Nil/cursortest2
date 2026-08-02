package androidx.sqlite.driver;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"androidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation", "", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "END", "ROLLBACK", "BEGIN_EXCLUSIVE", "BEGIN_IMMEDIATE", "BEGIN_DEFERRED", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class SupportSQLiteStatement$Companion$TransactionOperation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportSQLiteStatement$Companion$TransactionOperation[] $VALUES;
    public static final SupportSQLiteStatement$Companion$TransactionOperation BEGIN_DEFERRED;
    public static final SupportSQLiteStatement$Companion$TransactionOperation BEGIN_EXCLUSIVE;
    public static final SupportSQLiteStatement$Companion$TransactionOperation BEGIN_IMMEDIATE;
    public static final SupportSQLiteStatement$Companion$TransactionOperation END;
    public static final SupportSQLiteStatement$Companion$TransactionOperation ROLLBACK;

    static {
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation = new SupportSQLiteStatement$Companion$TransactionOperation("END", 0);
        END = supportSQLiteStatement$Companion$TransactionOperation;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation2 = new SupportSQLiteStatement$Companion$TransactionOperation("ROLLBACK", 1);
        ROLLBACK = supportSQLiteStatement$Companion$TransactionOperation2;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation3 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_EXCLUSIVE", 2);
        BEGIN_EXCLUSIVE = supportSQLiteStatement$Companion$TransactionOperation3;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation4 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_IMMEDIATE", 3);
        BEGIN_IMMEDIATE = supportSQLiteStatement$Companion$TransactionOperation4;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation5 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_DEFERRED", 4);
        BEGIN_DEFERRED = supportSQLiteStatement$Companion$TransactionOperation5;
        SupportSQLiteStatement$Companion$TransactionOperation[] supportSQLiteStatement$Companion$TransactionOperationArr = {supportSQLiteStatement$Companion$TransactionOperation, supportSQLiteStatement$Companion$TransactionOperation2, supportSQLiteStatement$Companion$TransactionOperation3, supportSQLiteStatement$Companion$TransactionOperation4, supportSQLiteStatement$Companion$TransactionOperation5};
        $VALUES = supportSQLiteStatement$Companion$TransactionOperationArr;
        $ENTRIES = kotlin.enums.a.a(supportSQLiteStatement$Companion$TransactionOperationArr);
    }

    public static SupportSQLiteStatement$Companion$TransactionOperation valueOf(String str) {
        return (SupportSQLiteStatement$Companion$TransactionOperation) Enum.valueOf(SupportSQLiteStatement$Companion$TransactionOperation.class, str);
    }

    public static SupportSQLiteStatement$Companion$TransactionOperation[] values() {
        return (SupportSQLiteStatement$Companion$TransactionOperation[]) $VALUES.clone();
    }
}
