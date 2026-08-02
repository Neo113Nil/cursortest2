package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import xsna.vuk0;

/* compiled from: FactoryPools.java */
/* loaded from: classes12.dex */
public final class yhq {
    public static final a a = new a();

    /* compiled from: FactoryPools.java */
    public interface b<T> {
        T create();
    }

    /* compiled from: FactoryPools.java */
    public static final class c<T> implements svb0<T> {
        public final b<T> a;
        public final e<T> b;
        public final vvb0 c;

        public c(@NonNull vvb0 vvb0Var, @NonNull b bVar, @NonNull e eVar) {
            this.c = vvb0Var;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // xsna.svb0
        public final boolean a(@NonNull T t) {
            if (t instanceof d) {
                ((d) t).h().a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // xsna.svb0
        public final T c() {
            T t = (T) this.c.c();
            if (t == null) {
                t = this.a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    t.getClass().toString();
                }
            }
            if (t instanceof d) {
                t.h().a = false;
            }
            return (T) t;
        }
    }

    /* compiled from: FactoryPools.java */
    public interface d {
        @NonNull
        vuk0.a h();
    }

    /* compiled from: FactoryPools.java */
    public interface e<T> {
        void a(@NonNull T t);
    }

    @NonNull
    public static c a(int i, @NonNull b bVar) {
        return new c(new vvb0(i), bVar, a);
    }

    /* compiled from: FactoryPools.java */
    public class a implements e<Object> {
        @Override // xsna.yhq.e
        public final void a(@NonNull Object obj) {
        }
    }
}
