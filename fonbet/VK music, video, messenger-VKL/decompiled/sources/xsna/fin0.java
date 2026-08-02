package xsna;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: Suppliers.java */
/* loaded from: classes13.dex */
public final class fin0 {

    /* compiled from: Suppliers.java */
    public static class a<T> implements zhn0<T>, Serializable {
        private static final long serialVersionUID = 0;
        public transient Object b = new Object();
        public volatile transient boolean c;
        public transient T d;
        final zhn0<T> delegate;

        public a(zhn0<T> zhn0Var) {
            this.delegate = zhn0Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.b = new Object();
        }

        @Override // xsna.zhn0
        public final T get() {
            if (!this.c) {
                synchronized (this.b) {
                    try {
                        if (!this.c) {
                            T t = this.delegate.get();
                            this.d = t;
                            this.c = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return this.d;
        }

        public final String toString() {
            return tk5.c(new StringBuilder("Suppliers.memoize("), this.c ? tk5.c(new StringBuilder("<supplier that returned "), this.d, ">") : this.delegate, ")");
        }
    }

    /* compiled from: Suppliers.java */
    public static class b<T> implements zhn0<T> {
        public static final ein0 e = new ein0();
        public final Object b = new Object();
        public volatile zhn0<T> c;
        public T d;

        public b(zhn0<T> zhn0Var) {
            this.c = zhn0Var;
        }

        @Override // xsna.zhn0
        public final T get() {
            zhn0<T> zhn0Var = this.c;
            ein0 ein0Var = e;
            if (zhn0Var != ein0Var) {
                synchronized (this.b) {
                    try {
                        if (this.c != ein0Var) {
                            T t = this.c.get();
                            this.d = t;
                            this.c = ein0Var;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return this.d;
        }

        public final String toString() {
            Object obj = this.c;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == e) {
                obj = tk5.c(new StringBuilder("<supplier that returned "), this.d, ">");
            }
            return tk5.c(sb, obj, ")");
        }
    }

    public static <T> zhn0<T> a(zhn0<T> zhn0Var) {
        return !(zhn0Var instanceof b) ? zhn0Var instanceof a ? zhn0Var : zhn0Var instanceof Serializable ? new a(zhn0Var) : new b(zhn0Var) : zhn0Var;
    }
}
