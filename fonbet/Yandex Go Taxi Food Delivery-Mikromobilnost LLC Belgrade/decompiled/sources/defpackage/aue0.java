package defpackage;

import androidx.core.widget.NestedScrollView;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes2.dex */
public final class aue0 extends TransitionListenerAdapter {
    public final /* synthetic */ bue0 a;
    public final /* synthetic */ Ref$IntRef b;

    public aue0(bue0 bue0Var, Ref$IntRef ref$IntRef) {
        this.a = bue0Var;
        this.b = ref$IntRef;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [zte0] */
    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        final bue0 bue0Var = this.a;
        if (!bue0Var.d().canScrollVertically(1)) {
            bue0Var.b.invoke();
            return;
        }
        final Ref$IntRef ref$IntRef = this.b;
        bue0Var.j = new nn50() { // from class: zte0
            @Override // defpackage.nn50
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                if (Math.abs(i2 - ref$IntRef2.element) >= 10) {
                    ref$IntRef2.element = i2;
                    kgx[] kgxVarArr = bue0.m;
                    bue0 bue0Var2 = bue0Var;
                    if (gi91.c(bue0Var2.a()) >= 1.0f) {
                        bue0Var2.b.invoke();
                        bue0Var2.d().setOnScrollChangeListener((nn50) null);
                    }
                }
            }
        };
        bue0Var.d().setOnScrollChangeListener(bue0Var.j);
    }
}
