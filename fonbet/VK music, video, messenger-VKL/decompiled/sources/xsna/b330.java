package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes12.dex */
public interface b330<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {
        public final ady a;
        public final List<ady> b;
        public final buk<Data> c;

        public a() {
            throw null;
        }

        public a(@NonNull ady adyVar, @NonNull buk<Data> bukVar) {
            List<ady> list = Collections.EMPTY_LIST;
            nr2.r(adyVar, "Argument must not be null");
            this.a = adyVar;
            nr2.r(list, "Argument must not be null");
            this.b = list;
            nr2.r(bukVar, "Argument must not be null");
            this.c = bukVar;
        }
    }

    @Nullable
    a<Data> a(@NonNull Model model, int i, int i2, @NonNull au80 au80Var);

    boolean b(@NonNull Model model);
}
