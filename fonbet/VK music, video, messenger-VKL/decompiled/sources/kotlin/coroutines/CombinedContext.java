package kotlin.coroutines;

import com.ironsource.X3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.epx;
import xsna.ho8;
import xsna.o9d;
import xsna.s3q0;
import xsna.wzs;
import xsna.z9g;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes11.dex */
public final class CombinedContext implements d, Serializable {
    private final d.b element;
    private final d left;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes8.dex */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 0;
        private final d[] elements;

        public a(d[] dVarArr) {
            this.elements = dVarArr;
        }

        private final Object readResolve() {
            d[] dVarArr = this.elements;
            d dVar = EmptyCoroutineContext.b;
            for (d dVar2 : dVarArr) {
                dVar = dVar.plus(dVar2);
            }
            return dVar;
        }
    }

    public CombinedContext(d dVar, d.b bVar) {
        this.left = dVar;
        this.element = bVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int d = d();
        d[] dVarArr = new d[d];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(s3q0.a, new o9d(1, dVarArr, ref$IntRef));
        if (ref$IntRef.element == d) {
            return new a(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int d() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.left;
            combinedContext = dVar instanceof CombinedContext ? (CombinedContext) dVar : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.d() == d()) {
                CombinedContext combinedContext2 = this;
                while (true) {
                    d.b bVar = combinedContext2.element;
                    if (!epx.f(combinedContext.get(bVar.getKey()), bVar)) {
                        z = false;
                        break;
                    }
                    d dVar = combinedContext2.left;
                    if (!(dVar instanceof CombinedContext)) {
                        d.b bVar2 = (d.b) dVar;
                        z = epx.f(combinedContext.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) dVar;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke((Object) this.left.fold(r, wzsVar), this.element);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.element.get(cVar);
            if (e != null) {
                return e;
            }
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                return (E) dVar.get(cVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // kotlin.coroutines.d
    public final d minusKey(d.c<?> cVar) {
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        d minusKey = this.left.minusKey(cVar);
        return minusKey == this.left ? this : minusKey == EmptyCoroutineContext.b ? this.element : new CombinedContext(minusKey, this.element);
    }

    @Override // kotlin.coroutines.d
    public final /* bridge */ d plus(d dVar) {
        return d.a.a(this, dVar);
    }

    public final String toString() {
        return ho8.a(new StringBuilder(X3.j.d), (String) fold("", new z9g(0)), ']');
    }
}
