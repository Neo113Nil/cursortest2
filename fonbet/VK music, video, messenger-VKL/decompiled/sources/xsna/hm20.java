package xsna;

import kotlin.NotImplementedError;

/* compiled from: Migration.android.kt */
/* loaded from: classes.dex */
public abstract class hm20 {
    public final int a;
    public final int b;

    public hm20(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(hyg0 hyg0Var) {
        if (!(hyg0Var instanceof qin0)) {
            throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((qin0) hyg0Var).b);
    }

    public void b(sin0 sin0Var) {
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
