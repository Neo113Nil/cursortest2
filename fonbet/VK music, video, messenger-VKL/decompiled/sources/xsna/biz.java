package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.aiz;

/* compiled from: LiteViewBinding.kt */
/* loaded from: classes2.dex */
public final class biz implements androidx.lifecycle.l {
    public final /* synthetic */ yv50 b;

    public biz(yv50 yv50Var) {
        this.b = yv50Var;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            yv50 yv50Var = this.b;
            yv50Var.n();
            yv50Var.b = null;
            LinkedList<aiz.b> linkedList = yv50Var.c;
            Iterator<T> it = linkedList.iterator();
            while (it.hasNext()) {
                ((aiz.b) it.next()).b.invoke();
            }
            linkedList.clear();
        }
    }
}
