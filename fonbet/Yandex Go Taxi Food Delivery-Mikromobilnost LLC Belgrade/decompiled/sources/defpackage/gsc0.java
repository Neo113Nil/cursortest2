package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import com.yandex.plus.plaquesdk.plaque.PlaqueView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class gsc0 extends TransitionListenerAdapter {
    public final /* synthetic */ PlaqueView a;

    public gsc0(PlaqueView plaqueView, crc0 crc0Var, crc0 crc0Var2) {
        this.a = plaqueView;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        List list;
        list = this.a.plaqueStateChangeListeners;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        List list;
        list = this.a.plaqueStateChangeListeners;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }
}
