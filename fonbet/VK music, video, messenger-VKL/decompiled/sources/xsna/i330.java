package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ModelWatcher.kt */
/* loaded from: classes3.dex */
public final class i330<Model> {
    public final List<b<Model, Object>> a;
    public final Map<dcy<? extends Model>, i330<? extends Model>> b;
    public Model c;

    /* compiled from: ModelWatcher.kt */
    public static final class a<Model> implements pn8<Model> {
        public final ArrayList a = new ArrayList();
        public final HashMap<dcy<? extends Model>, i330<? extends Model>> b = new HashMap<>();

        public static void d(a aVar, izs izsVar, izs izsVar2) {
            aVar.c(new bod(2), izsVar2, new qw6(izsVar, 8));
        }

        public final i330<Model> b() {
            return new i330<>(this.a, this.b);
        }

        public final void c(izs izsVar, izs izsVar2, wzs wzsVar) {
            this.a.add(new b(izsVar, izsVar2, wzsVar));
        }
    }

    /* compiled from: ModelWatcher.kt */
    public static final class b<Model, Field> {
        public final izs<Model, Field> a;
        public final izs<Field, s3q0> b;
        public final wzs<Field, Field, Boolean> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super Model, ? extends Field> izsVar, izs<? super Field, s3q0> izsVar2, wzs<? super Field, ? super Field, Boolean> wzsVar) {
            this.a = izsVar;
            this.b = izsVar2;
            this.c = wzsVar;
        }
    }

    public i330() {
        throw null;
    }

    public i330(ArrayList arrayList, HashMap hashMap) {
        this.a = arrayList;
        this.b = hashMap;
    }

    public final void a() {
        this.c = null;
        Iterator<T> it = this.b.values().iterator();
        while (it.hasNext()) {
            ((i330) it.next()).a();
        }
    }

    public final void b(Model model) {
        Map<dcy<? extends Model>, i330<? extends Model>> map = this.b;
        Set<dcy<? extends Model>> keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((dcy) obj).c(model)) {
                arrayList.add(obj);
            }
        }
        Set<dcy<? extends Model>> keySet2 = map.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : keySet2) {
            if (!((dcy) obj2).c(model)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i330<? extends Model> i330Var = map.get((dcy) it.next());
            i330<? extends Model> i330Var2 = i330Var instanceof i330 ? i330Var : null;
            if (i330Var2 != null) {
                i330Var2.b(model);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            i330<? extends Model> i330Var3 = map.get((dcy) it2.next());
            if (i330Var3 != null) {
                i330Var3.a();
            }
        }
        Model model2 = this.c;
        Iterator<T> it3 = this.a.iterator();
        while (it3.hasNext()) {
            b bVar = (b) it3.next();
            izs<Model, Field> izsVar = bVar.a;
            Object invoke = izsVar.invoke(model);
            if (model2 == null || bVar.c.invoke(izsVar.invoke(model2), invoke).booleanValue()) {
                bVar.b.invoke(invoke);
            }
        }
        this.c = model;
    }
}
