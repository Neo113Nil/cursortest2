package com.yandex.div.core.view2.divs.widgets;

import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import xsna.kxt0;

/* compiled from: ReleaseUtils.kt */
/* loaded from: classes7.dex */
public final class ReleaseUtils {
    public static final ReleaseUtils INSTANCE = new ReleaseUtils();

    private ReleaseUtils() {
    }

    public final void releaseAndRemoveChildren$div_release(ViewGroup viewGroup, Div2View div2View) {
        releaseChildren$div_release(viewGroup, div2View);
        viewGroup.removeAllViews();
    }

    public final void releaseChildren$div_release(ViewGroup viewGroup, Div2View div2View) {
        kxt0 kxt0Var = new kxt0(viewGroup);
        while (kxt0Var.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), kxt0Var.next());
        }
    }

    public final void releaseMedia$div_release(ViewGroup viewGroup, Div2View div2View) {
        kxt0 kxt0Var = new kxt0(viewGroup);
        while (kxt0Var.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getMediaReleaseViewVisitor$div_release(), kxt0Var.next());
        }
    }
}
