package xsna;

/* compiled from: SQLiteStatement.kt */
/* loaded from: classes.dex */
public interface qyg0 extends AutoCloseable {
    void D3(int i, String str);

    default boolean N3() {
        return getLong(0) != 0;
    }

    void bindLong(int i, long j);

    void bindNull(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    String l2(int i);

    void reset();

    boolean step();
}
