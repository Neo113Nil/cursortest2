package xsna;

/* compiled from: EntityDeletionOrUpdateAdapter.android.kt */
@ozl
/* loaded from: classes.dex */
public abstract class tpp<T> extends s140 {
    public abstract void i(zin0 zin0Var, T t);

    public final int j(T t) {
        zin0 a = a();
        try {
            i(a, t);
            return a.executeUpdateDelete();
        } finally {
            d(a);
        }
    }
}
