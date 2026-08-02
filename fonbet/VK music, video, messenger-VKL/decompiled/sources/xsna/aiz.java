package xsna;

import android.view.View;
import com.vk.geo.impl.util.BinderNotFoundValueException;
import java.util.LinkedList;

/* compiled from: LiteViewBinding.kt */
/* loaded from: classes2.dex */
public abstract class aiz {
    public View b;
    public final LinkedList<b> c = new LinkedList<>();

    /* compiled from: LiteViewBinding.kt */
    public final class a<T> implements p7f0<Object, T> {
        public final gzs<T> b;
        public T c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gzs<? extends T> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.i7f0
        public final T getValue(Object obj, qcy<?> qcyVar) {
            T t = this.c;
            if (t != null) {
                return t;
            }
            try {
                T invoke = this.b.invoke();
                this.c = invoke;
                aiz.this.c.add(new b(invoke, new w8q(this, 19)));
                return invoke;
            } catch (Exception e) {
                throw new BinderNotFoundValueException(qcyVar.getName(), e);
            }
        }

        @Override // xsna.p7f0
        public final void setValue(Object obj, qcy<?> qcyVar, T t) {
            if (t == null) {
                this.c = null;
            }
        }
    }

    /* compiled from: LiteViewBinding.kt */
    public static final class b {
        public final Object a;
        public final w8q b;

        public b(Object obj, w8q w8qVar) {
            this.a = obj;
            this.b = w8qVar;
        }
    }

    public final <T extends View> a<T> b(int i) {
        return new a<>(new zhz(this, i));
    }
}
