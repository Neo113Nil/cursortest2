package xsna;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;

/* compiled from: LazyJVM.kt */
/* loaded from: classes11.dex */
public final class qzg0<T> implements Lazy<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<qzg0<?>, Object> b = AtomicReferenceFieldUpdater.newUpdater(qzg0.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    private final Object f52final;
    private volatile gzs<? extends T> initializer;

    public qzg0(gzs<? extends T> gzsVar) {
        this.initializer = gzsVar;
        rwi rwiVar = rwi.c;
        this._value = rwiVar;
        this.f52final = rwiVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public final T getValue() {
        T t = (T) this._value;
        rwi rwiVar = rwi.c;
        if (t != rwiVar) {
            return t;
        }
        gzs<? extends T> gzsVar = this.initializer;
        if (gzsVar != null) {
            T invoke = gzsVar.invoke();
            AtomicReferenceFieldUpdater<qzg0<?>, Object> atomicReferenceFieldUpdater = b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rwiVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != rwiVar) {
                }
            }
            this.initializer = null;
            return invoke;
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
