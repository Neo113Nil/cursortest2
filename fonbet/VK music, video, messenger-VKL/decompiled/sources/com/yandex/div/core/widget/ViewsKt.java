package com.yandex.div.core.widget;

import android.view.View;
import xsna.izs;
import xsna.p7f0;

/* compiled from: Views.kt */
/* loaded from: classes7.dex */
public final class ViewsKt {
    public static final <T> p7f0<View, T> appearanceAffecting(T t, izs<? super T, ? extends T> izsVar) {
        return new AppearanceAffectingViewProperty(t, izsVar);
    }

    public static /* synthetic */ p7f0 appearanceAffecting$default(Object obj, izs izsVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            izsVar = null;
        }
        return appearanceAffecting(obj, izsVar);
    }

    public static final <T> p7f0<View, T> dimensionAffecting(T t, izs<? super T, ? extends T> izsVar) {
        return new DimensionAffectingViewProperty(t, izsVar);
    }

    public static /* synthetic */ p7f0 dimensionAffecting$default(Object obj, izs izsVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            izsVar = null;
        }
        return dimensionAffecting(obj, izsVar);
    }

    public static final boolean isExact(int i) {
        return View.MeasureSpec.getMode(i) == 1073741824;
    }

    public static final boolean isUnspecified(int i) {
        return View.MeasureSpec.getMode(i) == 0;
    }

    public static final int makeAtMostSpec(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
    }

    public static final int makeExactSpec(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static final int makeUnspecifiedSpec() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
