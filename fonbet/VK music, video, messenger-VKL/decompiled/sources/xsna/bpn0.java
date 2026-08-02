package xsna;

import java.io.Serializable;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;

/* compiled from: LazyJVM.kt */
/* loaded from: classes11.dex */
public final class bpn0<T> implements Lazy<T>, Serializable {
    private gzs<? extends T> initializer;
    private volatile Object _value = rwi.c;
    private final Object lock = this;

    public bpn0(gzs gzsVar) {
        this.initializer = gzsVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        T t;
        T t2 = (T) this._value;
        rwi rwiVar = rwi.c;
        if (t2 != rwiVar) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == rwiVar) {
                t = this.initializer.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this._value != rwi.c;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
