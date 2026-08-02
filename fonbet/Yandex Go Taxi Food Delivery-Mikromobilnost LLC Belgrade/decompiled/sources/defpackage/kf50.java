package defpackage;

import android.os.Bundle;
import androidx.view.b;
import androidx.view.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public abstract class kf50 {
    public final ReentrantLock a = new ReentrantLock(true);
    public final r0 b;
    public final r0 c;
    public boolean d;
    public final gci0 e;
    public final gci0 f;

    public kf50() {
        r0 c = bvf0.c(EmptyList.a);
        this.b = c;
        r0 c2 = bvf0.c(EmptySet.a);
        this.c = c2;
        this.e = e.d(c);
        this.f = e.d(c2);
    }

    public abstract b a(f fVar, Bundle bundle);

    public void b(b bVar) {
        r0 r0Var = this.c;
        LinkedHashSet f = v4r0.f((Set) r0Var.getValue(), bVar);
        r0Var.getClass();
        r0Var.m(null, f);
    }

    public final void c(b bVar) {
        int i;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList((Collection) this.e.a.getValue());
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (jl40.l(((b) listIterator.previous()).y, bVar.y)) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            arrayList.set(i, bVar);
            r0 r0Var = this.b;
            r0Var.getClass();
            r0Var.m(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void d(b bVar, boolean z) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            r0 r0Var = this.b;
            Iterable iterable = (Iterable) r0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (jl40.l((b) obj, bVar)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            r0Var.getClass();
            r0Var.m(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void e(b bVar, boolean z) {
        Object obj;
        r0 r0Var = this.c;
        Iterable iterable = (Iterable) r0Var.getValue();
        boolean z2 = iterable instanceof Collection;
        gci0 gci0Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((b) it.next()) == bVar) {
                    Iterable iterable2 = (Iterable) gci0Var.a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((b) it2.next()) == bVar) {
                        }
                    }
                    return;
                }
            }
        }
        LinkedHashSet i = v4r0.i((Set) r0Var.getValue(), bVar);
        r0Var.getClass();
        r0Var.m(null, i);
        List list = (List) gci0Var.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            b bVar2 = (b) obj;
            if (!jl40.l(bVar2, bVar) && ((List) gci0Var.a.getValue()).lastIndexOf(bVar2) < ((List) gci0Var.a.getValue()).lastIndexOf(bVar)) {
                break;
            }
        }
        b bVar3 = (b) obj;
        if (bVar3 != null) {
            LinkedHashSet i2 = v4r0.i((Set) r0Var.getValue(), bVar3);
            r0Var.getClass();
            r0Var.m(null, i2);
        }
        d(bVar, z);
    }

    public void f(b bVar) {
        r0 r0Var = this.c;
        LinkedHashSet i = v4r0.i((Set) r0Var.getValue(), bVar);
        r0Var.getClass();
        r0Var.m(null, i);
    }

    public void g(b bVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            r0 r0Var = this.b;
            ArrayList o0 = a.o0((Collection) r0Var.getValue(), bVar);
            r0Var.getClass();
            r0Var.m(null, o0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(b bVar) {
        r0 r0Var = this.c;
        Iterable iterable = (Iterable) r0Var.getValue();
        boolean z = iterable instanceof Collection;
        gci0 gci0Var = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((b) it.next()) == bVar) {
                    Iterable iterable2 = (Iterable) gci0Var.a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((b) it2.next()) == bVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        b bVar2 = (b) a.b0((List) gci0Var.a.getValue());
        if (bVar2 != null) {
            LinkedHashSet i = v4r0.i((Set) r0Var.getValue(), bVar2);
            r0Var.getClass();
            r0Var.m(null, i);
        }
        LinkedHashSet i2 = v4r0.i((Set) r0Var.getValue(), bVar);
        r0Var.getClass();
        r0Var.m(null, i2);
        g(bVar);
    }
}
