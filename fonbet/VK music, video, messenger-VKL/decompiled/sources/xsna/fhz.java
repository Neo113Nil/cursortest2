package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class fhz {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @NonNull
    public static ehz a(@NonNull Looper looper, @NonNull Object obj, @NonNull String str) {
        exc0.j(obj, "Listener must not be null");
        exc0.j(looper, "Looper must not be null");
        exc0.j(str, "Listener type must not be null");
        return new ehz(looper, obj, str);
    }

    @NonNull
    public static ehz b(@NonNull Object obj, @NonNull String str, @NonNull Executor executor) {
        exc0.j(obj, "Listener must not be null");
        exc0.j(executor, "Executor must not be null");
        return new ehz(obj, str, executor);
    }

    @NonNull
    public static <L> ehz.a<L> c(@NonNull L l, @NonNull String str) {
        exc0.j(l, "Listener must not be null");
        exc0.g(str, "Listener type must not be empty");
        return new ehz.a<>(l, str);
    }
}
