package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.editor.timeline.entity.Animation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AnimExt.kt */
/* loaded from: classes18.dex */
public final class fxo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ gxo0 b;
    public final /* synthetic */ ArrayList c;

    public fxo0(ArrayList arrayList, gxo0 gxo0Var) {
        this.b = gxo0Var;
        this.c = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gxo0 gxo0Var = this.b;
        ftm ftmVar = gxo0Var.b;
        ArrayList<List> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (List list : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                Animation C = ((gp6) obj).C();
                if ((C != null ? C.a : null) != Animation.Type.Delete) {
                    arrayList3.add(obj);
                }
            }
            arrayList2.add(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!arrayList.isEmpty()) {
                arrayList4.add(next);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
                ((gp6) it3.next()).A(null);
            }
        }
        ftmVar.invoke(arrayList4);
        gxo0Var.d = null;
    }
}
