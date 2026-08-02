package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.b330;
import xsna.yhq;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes12.dex */
public final class j540 {
    public static final c e = new c();
    public static final a f = new a();
    public final yhq.c d;
    public final ArrayList a = new ArrayList();
    public final HashSet c = new HashSet();
    public final c b = e;

    /* compiled from: MultiModelLoaderFactory.java */
    public static class a implements b330<Object, Object> {
        @Override // xsna.b330
        @Nullable
        public final b330.a<Object> a(@NonNull Object obj, int i, int i2, @NonNull au80 au80Var) {
            return null;
        }

        @Override // xsna.b330
        public final boolean b(@NonNull Object obj) {
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final c330<? extends Model, ? extends Data> c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull c330<? extends Model, ? extends Data> c330Var) {
            this.a = cls;
            this.b = cls2;
            this.c = c330Var;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    public static class c {
    }

    public j540(@NonNull yhq.c cVar) {
        this.d = cVar;
    }

    @NonNull
    public final synchronized ArrayList a(@NonNull Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.c.contains(bVar) && bVar.a.isAssignableFrom(cls)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.d(this));
                    this.c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @NonNull
    public final synchronized <Model, Data> b330<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.b.isAssignableFrom(cls2)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.d(this));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                yhq.c cVar2 = this.d;
                cVar.getClass();
                return new i540(arrayList, cVar2);
            }
            if (arrayList.size() == 1) {
                return (b330) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    @NonNull
    public final synchronized ArrayList c(@NonNull Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
