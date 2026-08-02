package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import xsna.b330;
import xsna.buk;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes12.dex */
public final class w3q0<Model> implements b330<Model, Model> {
    public static final w3q0<?> a = new w3q0<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements c330<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // xsna.c330
        @NonNull
        public final b330<Model, Model> d(j540 j540Var) {
            return w3q0.a;
        }
    }

    @Override // xsna.b330
    public final b330.a<Model> a(@NonNull Model model, int i, int i2, @NonNull au80 au80Var) {
        return new b330.a<>(new qp70(model), new b(model));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Model model) {
        return true;
    }

    /* compiled from: UnitModelLoader.java */
    public static class b<Model> implements buk<Model> {
        public final Model b;

        public b(Model model) {
            this.b = model;
        }

        @Override // xsna.buk
        @NonNull
        public final Class<Model> b() {
            return (Class<Model>) this.b.getClass();
        }

        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super Model> aVar) {
            aVar.c(this.b);
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return DataSource.LOCAL;
        }

        @Override // xsna.buk
        public final void a() {
        }

        @Override // xsna.buk
        public final void cancel() {
        }
    }
}
