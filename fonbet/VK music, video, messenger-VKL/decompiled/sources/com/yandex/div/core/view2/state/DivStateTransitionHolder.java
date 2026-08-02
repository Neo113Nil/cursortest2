package com.yandex.div.core.view2.state;

import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;
import xsna.qj80;
import xsna.vlp0;

/* compiled from: DivStateTransitionHolder.kt */
/* loaded from: classes7.dex */
public class DivStateTransitionHolder {
    private boolean cleanScheduled;
    private final Div2View div2View;
    private final List<vlp0> transitions = new ArrayList();

    public DivStateTransitionHolder(Div2View div2View) {
        this.div2View = div2View;
    }

    private void scheduleClean() {
        if (this.cleanScheduled) {
            return;
        }
        final Div2View div2View = this.div2View;
        qj80.a(div2View, new Runnable() { // from class: com.yandex.div.core.view2.state.DivStateTransitionHolder$scheduleClean$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.clear();
            }
        });
        this.cleanScheduled = true;
    }

    public void append(vlp0 vlp0Var) {
        this.transitions.add(vlp0Var);
        scheduleClean();
    }

    public void clear() {
        this.transitions.clear();
    }
}
