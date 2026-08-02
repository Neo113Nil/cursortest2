package com.yandex.div.core.util;

import android.view.View;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.i9x;
import xsna.iut0;
import xsna.swe0;

/* compiled from: Views.kt */
/* loaded from: classes7.dex */
public final class ViewsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View farthestLayoutCaller(View view) {
        View view2 = null;
        while (view != null) {
            if (!isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static final i9x getIndices(View view, int i, int i2) {
        int i3 = i2 + i;
        return isLayoutRtl(view) ? swe0.m(i3 - 1, i) : swe0.q(i, i3);
    }

    public static final boolean isActuallyLaidOut(View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean isHierarchyLaidOut(View view) {
        return farthestLayoutCaller(view) == null;
    }

    public static final boolean isLayoutRtl(View view) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return view.getLayoutDirection() == 1;
    }
}
