package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes12.dex */
public final class qag0 {
    public final ArrayList a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {
        public final Class<T> a;
        public final pag0<T> b;

        public a(@NonNull Class<T> cls, @NonNull pag0<T> pag0Var) {
            this.a = cls;
            this.b = pag0Var;
        }
    }

    @Nullable
    public final synchronized <Z> pag0<Z> a(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.isAssignableFrom(cls)) {
                return (pag0<Z>) aVar.b;
            }
        }
        return null;
    }
}
