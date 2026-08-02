package defpackage;

import androidx.lifecycle.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class eay implements e2m0 {
    public final void a(j2m0 j2m0Var) {
        if (!(j2m0Var instanceof rs31)) {
            vg10.o(j2m0Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
            return;
        }
        qs31 viewModelStore = ((rs31) j2m0Var).getViewModelStore();
        g2m0 savedStateRegistry = j2m0Var.getSavedStateRegistry();
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.a;
        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            yr31 yr31Var = (yr31) linkedHashMap.get((String) it.next());
            if (yr31Var != null) {
                j.a(yr31Var, savedStateRegistry, j2m0Var.getLifecycle());
            }
        }
        if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
            return;
        }
        savedStateRegistry.d();
    }
}
