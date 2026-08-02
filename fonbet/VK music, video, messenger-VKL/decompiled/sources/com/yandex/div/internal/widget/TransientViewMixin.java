package com.yandex.div.internal.widget;

import android.view.View;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import xsna.hfr;
import xsna.hyt0;
import xsna.izs;
import xsna.rli0;

/* compiled from: TransientView.kt */
/* loaded from: classes7.dex */
public final class TransientViewMixin implements TransientView {
    private int transitionCount;

    private final void invalidateView(View view) {
        view.invalidate();
        hfr.a aVar = new hfr.a(rli0.j(hyt0.b(view), new izs<Object, Boolean>() { // from class: com.yandex.div.internal.widget.TransientViewMixin$invalidateView$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.izs
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivBorderSupports);
            }
        }));
        while (aVar.hasNext()) {
            ((DivBorderSupports) aVar.next()).invalidateBorder();
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.transitionCount != 0;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        int i = this.transitionCount;
        if (i > 0) {
            int i2 = i - 1;
            this.transitionCount = i2;
            if (i2 == 0) {
                invalidateView(view);
            }
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        int i = this.transitionCount + 1;
        this.transitionCount = i;
        if (i == 1) {
            invalidateView(view);
        }
    }
}
