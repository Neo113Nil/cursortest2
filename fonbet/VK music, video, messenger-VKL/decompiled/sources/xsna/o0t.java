package xsna;

import androidx.annotation.Nullable;

/* compiled from: FutureCallback.java */
/* loaded from: classes11.dex */
public interface o0t<V> {
    void onFailure(Throwable th);

    void onSuccess(@Nullable V v);
}
