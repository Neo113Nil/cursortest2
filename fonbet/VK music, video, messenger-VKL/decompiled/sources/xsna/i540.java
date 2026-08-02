package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.b330;
import xsna.buk;
import xsna.yhq;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes12.dex */
public final class i540<Model, Data> implements b330<Model, Data> {
    public final ArrayList a;
    public final svb0<List<Throwable>> b;

    /* compiled from: MultiModelLoader.java */
    public static class a<Data> implements buk<Data>, buk.a<Data> {
        public final ArrayList b;
        public final svb0<List<Throwable>> c;
        public int d;
        public Priority e;
        public buk.a<? super Data> f;

        @Nullable
        public List<Throwable> g;
        public boolean h;

        public a(@NonNull ArrayList arrayList, @NonNull svb0 svb0Var) {
            this.c = svb0Var;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.b = arrayList;
            this.d = 0;
        }

        @Override // xsna.buk
        public final void a() {
            List<Throwable> list = this.g;
            if (list != null) {
                this.c.a(list);
            }
            this.g = null;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((buk) it.next()).a();
            }
        }

        @Override // xsna.buk
        @NonNull
        public final Class<Data> b() {
            return ((buk) this.b.get(0)).b();
        }

        @Override // xsna.buk.a
        public final void c(@Nullable Data data) {
            if (data != null) {
                this.f.c(data);
            } else {
                g();
            }
        }

        @Override // xsna.buk
        public final void cancel() {
            this.h = true;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((buk) it.next()).cancel();
            }
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super Data> aVar) {
            this.e = priority;
            this.f = aVar;
            this.g = this.c.c();
            ((buk) this.b.get(this.d)).d(priority, this);
            if (this.h) {
                cancel();
            }
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return ((buk) this.b.get(0)).e();
        }

        @Override // xsna.buk.a
        public final void f(@NonNull Exception exc) {
            List<Throwable> list = this.g;
            nr2.r(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public final void g() {
            if (this.h) {
                return;
            }
            if (this.d < this.b.size() - 1) {
                this.d++;
                d(this.e, this.f);
            } else {
                nr2.q(this.g);
                this.f.f(new GlideException("Fetch failed", new ArrayList(this.g)));
            }
        }
    }

    public i540(@NonNull ArrayList arrayList, @NonNull yhq.c cVar) {
        this.a = arrayList;
        this.b = cVar;
    }

    @Override // xsna.b330
    public final b330.a<Data> a(@NonNull Model model, int i, int i2, @NonNull au80 au80Var) {
        b330.a<Data> a2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        ady adyVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            b330 b330Var = (b330) arrayList.get(i3);
            if (b330Var.b(model) && (a2 = b330Var.a(model, i, i2, au80Var)) != null) {
                adyVar = a2.a;
                arrayList2.add(a2.c);
            }
        }
        if (arrayList2.isEmpty() || adyVar == null) {
            return null;
        }
        return new b330.a<>(adyVar, new a(arrayList2, this.b));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Model model) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((b330) it.next()).b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
