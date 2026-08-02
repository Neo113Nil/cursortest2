package com.yandex.quark.utils.extension;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/yandex/quark/utils/extension/ViewPivotKt$setPivot$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lzy11;", "onGlobalLayout", "()V", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ViewPivotKt$setPivot$2 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ sls $onPivotSet;
    final /* synthetic */ View $this_setPivot;
    final /* synthetic */ float $xFactor;
    final /* synthetic */ float $yFactor;

    public ViewPivotKt$setPivot$2(View view, float f, float f2, sls slsVar) {
        this.$this_setPivot = view;
        this.$xFactor = f;
        this.$yFactor = f2;
        this.$onPivotSet = slsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.$this_setPivot.getHeight() == 0 || this.$this_setPivot.getWidth() == 0) {
            return;
        }
        this.$this_setPivot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.$this_setPivot.setPivotX(r0.getWidth() * this.$xFactor);
        this.$this_setPivot.setPivotY(r0.getHeight() * this.$yFactor);
        this.$onPivotSet.invoke();
    }
}
