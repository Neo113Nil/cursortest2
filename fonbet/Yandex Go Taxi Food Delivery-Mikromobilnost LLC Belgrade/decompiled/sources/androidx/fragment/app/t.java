package androidx.fragment.app;

import android.util.Log;
import defpackage.des;
import defpackage.ucs;
import defpackage.unr0;
import defpackage.vcs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class t implements vcs {
    public final /* synthetic */ FragmentManager a;

    public t(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // defpackage.vcs
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean b0;
        FragmentManager fragmentManager = this.a;
        ArrayList arrayList5 = fragmentManager.o;
        if (FragmentManager.O(2)) {
            Objects.toString(fragmentManager.a);
        }
        if (fragmentManager.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            b0 = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            a aVar = (a) unr0.k(1, fragmentManager.d);
            fragmentManager.h = aVar;
            Iterator it = aVar.a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((des) it.next()).b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            b0 = fragmentManager.b0(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(FragmentManager.I((a) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                ucs ucsVar = (ucs) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ucsVar.onBackStackChangeStarted((Fragment) it4.next(), booleanValue);
                }
            }
        }
        return b0;
    }
}
