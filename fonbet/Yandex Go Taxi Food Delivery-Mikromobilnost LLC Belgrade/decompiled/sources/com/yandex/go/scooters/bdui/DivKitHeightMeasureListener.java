package com.yandex.go.scooters.bdui;

import android.view.View;
import android.view.ViewGroup;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/scooters/bdui/DivKitHeightMeasureListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Lkotlin/Function1;", "", "Lzy11;", "onHeightChanged", "<init>", "(Ltls;)V", "Landroid/view/View;", "parent", "child", "calculateNewHeight", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewAdded", "onChildViewRemoved", "Ltls;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DivKitHeightMeasureListener implements ViewGroup.OnHierarchyChangeListener {
    private final tls onHeightChanged;

    public DivKitHeightMeasureListener(tls tlsVar) {
        this.onHeightChanged = tlsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateNewHeight(final View parent, final View child) {
        child.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.scooters.bdui.DivKitHeightMeasureListener$calculateNewHeight$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                tls tlsVar;
                view.removeOnLayoutChangeListener(this);
                child.measure(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = child.getMeasuredHeight();
                if (measuredHeight > 0) {
                    ru.yandex.taxi.design.utils.c.C(measuredHeight, parent);
                    tlsVar = this.onHeightChanged;
                    tlsVar.invoke(Integer.valueOf(measuredHeight));
                }
                this.calculateNewHeight(parent, child);
            }
        });
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View parent, View child) {
        calculateNewHeight(parent, child);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View parent, View child) {
    }
}
