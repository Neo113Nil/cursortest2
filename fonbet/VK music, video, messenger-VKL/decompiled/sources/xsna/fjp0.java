package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes12.dex */
public final class fjp0 {
    public final ArrayList a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final bbg0<Z, R> c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull bbg0<Z, R> bbg0Var) {
            this.a = cls;
            this.b = cls2;
            this.c = bbg0Var;
        }
    }

    @NonNull
    public final synchronized ArrayList a(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if ((aVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }
}
