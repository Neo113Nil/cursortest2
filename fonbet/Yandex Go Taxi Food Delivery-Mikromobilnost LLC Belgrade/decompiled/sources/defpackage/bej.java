package defpackage;

import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.view.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class bej implements q {
    public final /* synthetic */ cej a;

    public bej(cej cejVar) {
        this.a = cejVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i;
        int i2 = aej.a[event.ordinal()];
        cej cejVar = this.a;
        if (i2 == 1) {
            DialogFragment dialogFragment = (DialogFragment) peyVar;
            Iterable iterable = (Iterable) cejVar.b().e.a.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((b) it.next()).y, dialogFragment.getTag())) {
                        return;
                    }
                }
            }
            dialogFragment.dismiss();
            return;
        }
        Object obj = null;
        if (i2 == 2) {
            DialogFragment dialogFragment2 = (DialogFragment) peyVar;
            for (Object obj2 : (Iterable) cejVar.b().f.a.getValue()) {
                if (jl40.l(((b) obj2).y, dialogFragment2.getTag())) {
                    obj = obj2;
                }
            }
            b bVar = (b) obj;
            if (bVar != null) {
                cejVar.b().b(bVar);
                return;
            }
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            DialogFragment dialogFragment3 = (DialogFragment) peyVar;
            for (Object obj3 : (Iterable) cejVar.b().f.a.getValue()) {
                if (jl40.l(((b) obj3).y, dialogFragment3.getTag())) {
                    obj = obj3;
                }
            }
            b bVar2 = (b) obj;
            if (bVar2 != null) {
                cejVar.b().b(bVar2);
            }
            dialogFragment3.getLifecycle().d(this);
            return;
        }
        DialogFragment dialogFragment4 = (DialogFragment) peyVar;
        if (dialogFragment4.requireDialog().isShowing()) {
            return;
        }
        List list = (List) cejVar.b().e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (jl40.l(((b) listIterator.previous()).y, dialogFragment4.getTag())) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        b bVar3 = (b) a.S(i, list);
        if (!jl40.l(a.b0(list), bVar3)) {
            Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
        }
        if (bVar3 != null) {
            cejVar.l(i, bVar3, false);
        }
    }
}
