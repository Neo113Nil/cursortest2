package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dnp0;
import xsna.e43;
import xsna.epx;
import xsna.hod;
import xsna.j5g;
import xsna.vlp0;
import xsna.ymp0;
import xsna.zcl;
import xsna.zmp0;

/* compiled from: DivTransitionHandler.kt */
/* loaded from: classes7.dex */
public final class DivTransitionHandler {
    private final Div2View divView;
    private boolean posted;
    private List<TransitionData> pendingTransitions = new ArrayList();
    private List<TransitionData> activeTransitions = new ArrayList();

    /* compiled from: DivTransitionHandler.kt */
    public static abstract class ChangeType {

        /* compiled from: DivTransitionHandler.kt */
        public static final class Visibility extends ChangeType {

            /* renamed from: new, reason: not valid java name */
            private final int f48new;

            public Visibility(int i) {
                super(null);
                this.f48new = i;
            }

            public void apply(View view) {
                view.setVisibility(this.f48new);
            }

            public final int getNew() {
                return this.f48new;
            }
        }

        public /* synthetic */ ChangeType(zcl zclVar) {
            this();
        }

        private ChangeType() {
        }
    }

    /* compiled from: DivTransitionHandler.kt */
    public static final class TransitionData {
        private final List<ChangeType.Visibility> changes;
        private final List<ChangeType.Visibility> savedChanges;
        private final View target;
        private final vlp0 transition;

        public TransitionData(vlp0 vlp0Var, View view, List<ChangeType.Visibility> list, List<ChangeType.Visibility> list2) {
            this.transition = vlp0Var;
            this.target = view;
            this.changes = list;
            this.savedChanges = list2;
        }

        public final List<ChangeType.Visibility> getChanges() {
            return this.changes;
        }

        public final List<ChangeType.Visibility> getSavedChanges() {
            return this.savedChanges;
        }

        public final View getTarget() {
            return this.target;
        }

        public final vlp0 getTransition() {
            return this.transition;
        }
    }

    public DivTransitionHandler(Div2View div2View) {
        this.divView = div2View;
    }

    private final void beginDelayedTransitions(ViewGroup viewGroup, boolean z) {
        if (!viewGroup.isAttachedToWindow()) {
            this.pendingTransitions.clear();
            return;
        }
        if (z) {
            zmp0.b(viewGroup);
        }
        final dnp0 dnp0Var = new dnp0();
        Iterator<T> it = this.pendingTransitions.iterator();
        while (it.hasNext()) {
            dnp0Var.c(((TransitionData) it.next()).getTransition());
        }
        dnp0Var.addListener(new ymp0() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionEnd(vlp0 vlp0Var) {
                List list;
                list = this.activeTransitions;
                list.clear();
                vlp0.this.removeListener(this);
            }
        });
        zmp0.a(viewGroup, dnp0Var);
        for (TransitionData transitionData : this.pendingTransitions) {
            for (ChangeType.Visibility visibility : transitionData.getChanges()) {
                visibility.apply(transitionData.getTarget());
                transitionData.getSavedChanges().add(visibility);
            }
        }
        this.activeTransitions.clear();
        this.activeTransitions.addAll(this.pendingTransitions);
        this.pendingTransitions.clear();
    }

    public static /* synthetic */ void beginDelayedTransitions$default(DivTransitionHandler divTransitionHandler, ViewGroup viewGroup, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            viewGroup = divTransitionHandler.divView;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        divTransitionHandler.beginDelayedTransitions(viewGroup, z);
    }

    private final List<ChangeType.Visibility> getChange(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = epx.f(transitionData.getTarget(), view) ? (ChangeType.Visibility) j5g.k0(transitionData.getSavedChanges()) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    private final void postTransitions() {
        if (this.posted) {
            return;
        }
        this.posted = true;
        this.divView.post(new hod(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTransitions$lambda$0(DivTransitionHandler divTransitionHandler) {
        if (divTransitionHandler.posted) {
            beginDelayedTransitions$default(divTransitionHandler, null, false, 3, null);
        }
        divTransitionHandler.posted = false;
    }

    public final ChangeType.Visibility getLastChange(View view) {
        ChangeType.Visibility visibility = (ChangeType.Visibility) j5g.k0(getChange(this.pendingTransitions, view));
        if (visibility != null) {
            return visibility;
        }
        ChangeType.Visibility visibility2 = (ChangeType.Visibility) j5g.k0(getChange(this.activeTransitions, view));
        if (visibility2 != null) {
            return visibility2;
        }
        return null;
    }

    public final void putTransition(vlp0 vlp0Var, View view, ChangeType.Visibility visibility) {
        this.pendingTransitions.add(new TransitionData(vlp0Var, view, e43.o(visibility), new ArrayList()));
        postTransitions();
    }

    public final void runTransitions(ViewGroup viewGroup, boolean z) {
        this.posted = false;
        beginDelayedTransitions(viewGroup, z);
    }
}
