package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes12.dex */
public final class nag0 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final mag0<T, R> c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, mag0<T, R> mag0Var) {
            this.a = cls;
            this.b = cls2;
            this.c = mag0Var;
        }
    }

    @NonNull
    public final synchronized List<a<?, ?>> a(@NonNull String str) {
        List<a<?, ?>> list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = (List) this.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
