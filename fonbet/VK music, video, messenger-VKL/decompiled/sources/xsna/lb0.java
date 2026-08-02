package xsna;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import xsna.lb0;

/* compiled from: ActivityResultRegistry.kt */
/* loaded from: classes.dex */
public abstract class lb0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* compiled from: ActivityResultRegistry.kt */
    public static final class a<O> {
        public final ua0<O> a;
        public final va0<?, O> b;

        public a(va0 va0Var, ua0 ua0Var) {
            this.a = ua0Var;
            this.b = va0Var;
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    /* loaded from: classes11.dex */
    public static final class b {
        public final Lifecycle a;
        public final ArrayList b = new ArrayList();

        public b(Lifecycle lifecycle) {
            this.a = lifecycle;
        }

        public final void a(jb0 jb0Var) {
            this.a.addObserver(jb0Var);
            this.b.add(jb0Var);
        }

        public final void b() {
            ArrayList arrayList = this.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.a.removeObserver((androidx.lifecycle.l) it.next());
            }
            arrayList.clear();
        }
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.e.get(str);
        if ((aVar != null ? aVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                aVar.a.onActivityResult(aVar.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public abstract void b(int i, va0 va0Var, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.jb0] */
    public final mb0 c(final String str, f5z f5zVar, final va0 va0Var, final ua0 ua0Var) {
        Lifecycle lifecycle = f5zVar.getLifecycle();
        if (lifecycle.getCurrentState().a(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + f5zVar + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        b bVar = (b) linkedHashMap.get(str);
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b(lifecycle);
        }
        bVar2.a(new androidx.lifecycle.l() { // from class: xsna.jb0
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                lb0 lb0Var = lb0.this;
                LinkedHashMap linkedHashMap2 = lb0Var.e;
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                String str2 = str;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            lb0Var.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = lb0Var.g;
                LinkedHashMap linkedHashMap3 = lb0Var.f;
                va0 va0Var2 = va0Var;
                ua0 ua0Var2 = ua0Var;
                linkedHashMap2.put(str2, new lb0.a(va0Var2, ua0Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    ua0Var2.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) zn8.a(ActivityResult.class, bundle, str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    ua0Var2.onActivityResult(va0Var2.c(activityResult.b, activityResult.c));
                }
            }
        });
        linkedHashMap.put(str, bVar2);
        return new mb0(this, str, va0Var);
    }

    public final nb0 d(String str, va0 va0Var, ua0 ua0Var) {
        e(str);
        this.e.put(str, new a(va0Var, ua0Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            ua0Var.onActivityResult(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) zn8.a(ActivityResult.class, bundle, str);
        if (activityResult != null) {
            bundle.remove(str);
            ua0Var.onActivityResult(va0Var.c(activityResult.b, activityResult.c));
        }
        return new nb0(this, str, va0Var);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = ((t5j) dli0.f(new kb0(0))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((ActivityResult) zn8.a(ActivityResult.class, bundle, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b bVar = (b) linkedHashMap2.get(str);
        if (bVar != null) {
            bVar.b();
            linkedHashMap2.remove(str);
        }
    }
}
