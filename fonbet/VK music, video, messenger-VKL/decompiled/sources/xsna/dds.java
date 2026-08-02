package xsna;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes12.dex */
public final class dds implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ cds e;

    public dds(cds cdsVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = cdsVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        cds cdsVar = this.e;
        Object obj = this.a;
        if (obj != null) {
            cdsVar.A(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            cdsVar.A(obj2, this.d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
