package xsna;

/* compiled from: EntityInsertionAdapter.android.kt */
@ozl
/* loaded from: classes.dex */
public abstract class upp<T> extends s140 {
    public abstract void i(zin0 zin0Var, T t);

    public final void j(T t) {
        zin0 a = a();
        try {
            i(a, t);
            a.executeInsert();
        } finally {
            d(a);
        }
    }
}
