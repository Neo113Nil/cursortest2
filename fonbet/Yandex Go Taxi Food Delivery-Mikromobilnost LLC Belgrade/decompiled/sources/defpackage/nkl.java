package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class nkl {
    public final Div2View a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;

    public nkl(Div2View div2View) {
        this.a = div2View;
    }

    public static ArrayList b(View view, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lkl lklVar = (lkl) it.next();
            kkl kklVar = jl40.l(lklVar.c(), view) ? (kkl) a.b0(lklVar.b()) : null;
            if (kklVar != null) {
                arrayList.add(kklVar);
            }
        }
        return arrayList;
    }

    public final void a(ViewGroup viewGroup, boolean z) {
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        ArrayList arrayList = this.b;
        if (!isAttachedToWindow) {
            arrayList.clear();
            return;
        }
        if (z) {
            TransitionManager.b(viewGroup);
        }
        TransitionSet transitionSet = new TransitionSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            transitionSet.Z(((lkl) it.next()).d());
        }
        transitionSet.a(new mkl(transitionSet, this));
        TransitionManager.a(transitionSet, viewGroup);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            lkl lklVar = (lkl) it2.next();
            for (kkl kklVar : lklVar.a()) {
                lklVar.c().setVisibility(kklVar.a);
                ((ArrayList) lklVar.b()).add(kklVar);
            }
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
    }
}
