package com.yandex.div.core.widget;

import android.view.View;
import xsna.epx;
import xsna.izs;
import xsna.p7f0;
import xsna.qcy;

/* compiled from: Views.kt */
/* loaded from: classes7.dex */
final class AppearanceAffectingViewProperty<T> implements p7f0<View, T> {
    private final izs<T, T> modifier;
    private T propertyValue;

    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceAffectingViewProperty(T t, izs<? super T, ? extends T> izsVar) {
        this.propertyValue = t;
        this.modifier = izsVar;
    }

    @Override // xsna.i7f0
    public /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
        return getValue((View) obj, (qcy<?>) qcyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.p7f0
    public /* bridge */ /* synthetic */ void setValue(View view, qcy qcyVar, Object obj) {
        setValue2(view, (qcy<?>) qcyVar, (qcy) obj);
    }

    public T getValue(View view, qcy<?> qcyVar) {
        return this.propertyValue;
    }

    /* renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(View view, qcy<?> qcyVar, T t) {
        T invoke;
        izs<T, T> izsVar = this.modifier;
        if (izsVar != null && (invoke = izsVar.invoke(t)) != null) {
            t = invoke;
        }
        if (epx.f(this.propertyValue, t)) {
            return;
        }
        this.propertyValue = t;
        view.invalidate();
    }
}
