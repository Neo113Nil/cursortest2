package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.yandex.messaging.sqlite.SupportSQLiteDatabaseTransaction$1;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface hkw0 extends Closeable {
    boolean A();

    void E();

    void N();

    void R1(Object[] objArr);

    Cursor U0(nkw0 nkw0Var);

    Cursor W1(String str);

    void Y(SupportSQLiteDatabaseTransaction$1 supportSQLiteDatabaseTransaction$1);

    zfs g(String str);

    String getPath();

    void i();

    boolean isOpen();

    boolean j2();

    boolean k1();

    int o2(ContentValues contentValues, Object[] objArr);

    void r(String str);

    void s();

    void s0();

    void t();
}
