package defpackage;

import androidx.fragment.app.Fragment;
import androidx.view.c;
import androidx.view.fragment.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class fds implements ucs {
    public final /* synthetic */ c a;
    public final /* synthetic */ b b;

    public fds(c cVar, b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    @Override // defpackage.ucs
    public final void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        Object obj;
        Object obj2;
        b bVar = this.b;
        ArrayList arrayList = bVar.g;
        c cVar = this.a;
        ArrayList m0 = a.m0((Iterable) cVar.f.a.getValue(), (Collection) cVar.e.a.getValue());
        ListIterator listIterator = m0.listIterator(m0.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator.previous();
                if (jl40.l(((androidx.view.b) obj2).y, fragment.getTag())) {
                    break;
                }
            }
        }
        androidx.view.b bVar2 = (androidx.view.b) obj2;
        boolean z2 = z && arrayList.isEmpty() && fragment.isRemoving();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((Pair) next).c(), fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z2 && b.n()) {
            fragment.toString();
            Objects.toString(bVar2);
        }
        boolean z3 = pair != null && ((Boolean) pair.f()).booleanValue();
        if (!z && !z3 && bVar2 == null) {
            w511.f(oyr.o("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (bVar2 != null) {
            bVar.l(fragment, bVar2, cVar);
            if (z2) {
                if (b.n()) {
                    fragment.toString();
                    bVar2.toString();
                }
                cVar.e(bVar2, false);
            }
        }
    }

    @Override // defpackage.ucs
    public final void onBackStackChangeStarted(Fragment fragment, boolean z) {
        Object obj;
        if (z) {
            c cVar = this.a;
            List list = (List) cVar.e.a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (jl40.l(((androidx.view.b) obj).y, fragment.getTag())) {
                        break;
                    }
                }
            }
            androidx.view.b bVar = (androidx.view.b) obj;
            if (b.n()) {
                fragment.toString();
                Objects.toString(bVar);
            }
            if (bVar != null) {
                cVar.f(bVar);
            }
        }
    }

    @Override // defpackage.ucs
    public final void onBackStackChanged() {
    }
}
