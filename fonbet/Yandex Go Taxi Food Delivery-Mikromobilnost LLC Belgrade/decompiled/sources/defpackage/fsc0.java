package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.plaque.PlaqueView;

/* loaded from: classes6.dex */
public final class fsc0 extends TransitionListenerAdapter {
    public final /* synthetic */ PlaqueView a;
    public final /* synthetic */ brc0 b;
    public final /* synthetic */ brc0 c;

    public fsc0(PlaqueView plaqueView, brc0 brc0Var, brc0 brc0Var2) {
        this.a = plaqueView;
        this.b = brc0Var;
        this.c = brc0Var2;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        List list;
        list = this.a.plaqueStateChangeListeners;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((drc0) it.next()).a(this.b, this.c);
        }
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        List list;
        list = this.a.plaqueStateChangeListeners;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((drc0) it.next()).getClass();
        }
    }
}
