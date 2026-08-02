package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LiveDataObservable.java */
/* loaded from: classes11.dex */
public final class wiz<T> {
    public final ug50<b<T>> a = new ug50<>();
    public final HashMap b = new HashMap();

    /* compiled from: LiveDataObservable.java */
    public static final class a<T> implements fr70<b<T>> {
        public final AtomicBoolean b = new AtomicBoolean(true);
        public final androidx.camera.view.b c;
        public final Executor d;

        public a(@NonNull Executor executor, @NonNull androidx.camera.view.b bVar) {
            this.d = executor;
            this.c = bVar;
        }

        @Override // xsna.fr70
        public final void a(@NonNull Object obj) {
            this.d.execute(new viz(this, (b) obj));
        }
    }

    /* compiled from: LiveDataObservable.java */
    public static final class b<T> {

        @Nullable
        public T a;

        public b() {
            throw null;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("[Result: <");
            sb.append("Value: " + this.a);
            sb.append(">]");
            return sb.toString();
        }
    }
}
