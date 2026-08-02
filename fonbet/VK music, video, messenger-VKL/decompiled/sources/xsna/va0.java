package xsna;

import android.content.Context;
import android.content.Intent;

/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class va0<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* loaded from: classes11.dex */
    public static final class a<T> {
        public final T a;

        public a(T t) {
            this.a = t;
        }
    }

    public abstract Intent a(Context context, I i);

    public a<O> b(Context context, I i) {
        return null;
    }

    public abstract O c(int i, Intent intent);
}
