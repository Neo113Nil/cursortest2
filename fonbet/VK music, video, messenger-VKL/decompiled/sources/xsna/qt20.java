package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class qt20 {
    public static final Object b = new Object();

    @Nullable
    public static qt20 c;

    @Nullable
    public aai a;

    @NonNull
    public static qt20 c() {
        qt20 qt20Var;
        synchronized (b) {
            exc0.k("MlKitContext has not been initialized", c != null);
            qt20Var = c;
            exc0.i(qt20Var);
        }
        return qt20Var;
    }

    @NonNull
    public final <T> T a(@NonNull Class<T> cls) {
        exc0.k("MlKitContext has been deleted", c == this);
        exc0.i(this.a);
        return (T) this.a.a(cls);
    }

    @NonNull
    public final Context b() {
        return (Context) a(Context.class);
    }
}
