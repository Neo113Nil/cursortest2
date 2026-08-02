package xsna;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.fif;

/* compiled from: UploadBadgeControllerImpl.kt */
/* loaded from: classes17.dex */
public final class u9q0 {
    public final t9q0 a;
    public final eef b;
    public final Map<Integer, Boolean> c;
    public final io.reactivex.rxjava3.subjects.d<v9q0> d;
    public final io.reactivex.rxjava3.internal.operators.observable.z0 e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public Integer j;
    public boolean k;
    public List<fif> l;
    public int m;

    public u9q0(t9q0 t9q0Var, eef eefVar, ConcurrentHashMap concurrentHashMap) {
        this.a = t9q0Var;
        this.b = eefVar;
        this.c = concurrentHashMap;
        io.reactivex.rxjava3.subjects.d<v9q0> O0 = io.reactivex.rxjava3.subjects.d.O0(new v9q0(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
        this.d = O0;
        this.e = new io.reactivex.rxjava3.internal.operators.observable.z0(O0);
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.l = EmptyList.b;
    }

    public static int a(fif.a aVar) {
        if (aVar instanceof fif.a.c) {
            return 6;
        }
        if (aVar instanceof fif.a.C2875a) {
            return 5;
        }
        if (aVar instanceof fif.a.f) {
            return 4;
        }
        if (aVar instanceof fif.a.b) {
            return 3;
        }
        if (aVar instanceof fif.a.d) {
            return 2;
        }
        if (aVar instanceof fif.a.g) {
            return 1;
        }
        if (aVar instanceof fif.a.e) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(List<fif> list) {
        LinkedHashSet linkedHashSet;
        Object next;
        v9q0 v9q0Var;
        this.l = list;
        if (this.k) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        io.reactivex.rxjava3.subjects.d<v9q0> dVar = this.d;
        if (isEmpty) {
            dVar.onNext(new v9q0(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashSet = this.h;
            if (!hasNext) {
                break;
            }
            Object next2 = it.next();
            fif fifVar = (fif) next2;
            fif.a aVar = fifVar.b;
            int i = fifVar.a;
            if (!(aVar instanceof fif.a.e) && !(aVar instanceof fif.a.C2875a) && !linkedHashSet.contains(Integer.valueOf(i)) && !this.i.contains(Integer.valueOf(i))) {
                arrayList.add(next2);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int a = a(((fif) next).b);
                do {
                    Object next3 = it2.next();
                    int a2 = a(((fif) next3).b);
                    if (a < a2) {
                        next = next3;
                        a = a2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        fif fifVar2 = (fif) next;
        if (fifVar2 == null) {
            dVar.onNext(new v9q0(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
            return;
        }
        fif.a aVar2 = fifVar2.b;
        int i2 = fifVar2.a;
        this.m = i2;
        Integer valueOf = Integer.valueOf(i2);
        Map<Integer, Boolean> map = this.c;
        if (map.containsKey(valueOf)) {
            return;
        }
        File file = fifVar2.d;
        boolean containsKey = map.containsKey(Integer.valueOf(i2));
        if (aVar2 instanceof fif.a.g) {
            v9q0Var = new v9q0(Uri.fromFile(file).toString(), 0, fifVar2.a, false, false, false, false, containsKey, 26);
        } else if (aVar2 instanceof fif.a.d) {
            v9q0Var = new v9q0(Uri.fromFile(file).toString(), ((fif.a.d) aVar2).a, fifVar2.a, true, false, false, false, containsKey, 24);
        } else if (aVar2 instanceof fif.a.b) {
            v9q0Var = new v9q0(Uri.fromFile(file).toString(), 0, fifVar2.a, true, true, false, false, containsKey, 26);
        } else if (aVar2 instanceof fif.a.C2875a) {
            v9q0Var = new v9q0(Uri.fromFile(file).toString(), 0, fifVar2.a, false, false, true, false, containsKey, 26);
        } else if (aVar2 instanceof fif.a.c) {
            v9q0Var = new v9q0(Uri.fromFile(file).toString(), 0, fifVar2.a, true, false, false, true, containsKey, 26);
        } else if (aVar2 instanceof fif.a.f) {
            v9q0Var = new v9q0(Uri.fromFile(file).toString(), 0, fifVar2.a, true, true, false, false, containsKey, 26);
        } else {
            if (!(aVar2 instanceof fif.a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            v9q0Var = new v9q0(null, 0, fifVar2.a, false, false, false, false, containsKey, 475);
        }
        dVar.onNext(v9q0Var);
        if (!(aVar2 instanceof fif.a.b) && !(aVar2 instanceof fif.a.f)) {
            io.reactivex.rxjava3.disposables.c cVar = this.g;
            if (cVar != null) {
                cVar.dispose();
            }
            this.g = null;
            this.j = null;
            return;
        }
        if (!linkedHashSet.contains(Integer.valueOf(i2))) {
            linkedHashSet.add(Integer.valueOf(i2));
            this.a.a.invoke(Boolean.valueOf(fifVar2.e));
        }
        Integer num = this.j;
        if (num != null && num.intValue() == i2) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.j = Integer.valueOf(i2);
        this.g = io.reactivex.rxjava3.core.q.B0(2000L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new h4f0(new gqe0(this, 15), 10));
    }
}
