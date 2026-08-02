package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import xsna.gzs;
import xsna.rwi;

/* compiled from: Lazy.kt */
/* loaded from: classes11.dex */
public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {
    private Object _value = rwi.c;
    private gzs<? extends T> initializer;

    public UnsafeLazyImpl(gzs<? extends T> gzsVar) {
        this.initializer = gzsVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        if (this._value == rwi.c) {
            this._value = this.initializer.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this._value != rwi.c;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
