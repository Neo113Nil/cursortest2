package androidx.room;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"androidx/room/Transactor$SQLiteTransactionType", "", "Landroidx/room/Transactor$SQLiteTransactionType;", "DEFERRED", "IMMEDIATE", "EXCLUSIVE", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Transactor$SQLiteTransactionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Transactor$SQLiteTransactionType[] $VALUES;
    public static final Transactor$SQLiteTransactionType DEFERRED;
    public static final Transactor$SQLiteTransactionType EXCLUSIVE;
    public static final Transactor$SQLiteTransactionType IMMEDIATE;

    static {
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = new Transactor$SQLiteTransactionType("DEFERRED", 0);
        DEFERRED = transactor$SQLiteTransactionType;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2 = new Transactor$SQLiteTransactionType("IMMEDIATE", 1);
        IMMEDIATE = transactor$SQLiteTransactionType2;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType3 = new Transactor$SQLiteTransactionType("EXCLUSIVE", 2);
        EXCLUSIVE = transactor$SQLiteTransactionType3;
        Transactor$SQLiteTransactionType[] transactor$SQLiteTransactionTypeArr = {transactor$SQLiteTransactionType, transactor$SQLiteTransactionType2, transactor$SQLiteTransactionType3};
        $VALUES = transactor$SQLiteTransactionTypeArr;
        $ENTRIES = kotlin.enums.a.a(transactor$SQLiteTransactionTypeArr);
    }

    public static Transactor$SQLiteTransactionType valueOf(String str) {
        return (Transactor$SQLiteTransactionType) Enum.valueOf(Transactor$SQLiteTransactionType.class, str);
    }

    public static Transactor$SQLiteTransactionType[] values() {
        return (Transactor$SQLiteTransactionType[]) $VALUES.clone();
    }
}
