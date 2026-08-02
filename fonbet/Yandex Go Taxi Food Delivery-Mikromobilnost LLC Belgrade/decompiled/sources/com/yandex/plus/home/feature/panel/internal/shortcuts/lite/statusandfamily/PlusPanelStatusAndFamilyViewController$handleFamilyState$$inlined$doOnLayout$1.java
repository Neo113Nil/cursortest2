package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily;

import android.view.View;
import defpackage.b5d0;
import defpackage.j7d0;
import defpackage.ny61;
import defpackage.wbp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1", "core-ktx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelStatusAndFamilyViewController$handleFamilyState$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ wbp $familyState$inlined;
    final /* synthetic */ b5d0 $imageLoader$inlined;
    final /* synthetic */ j7d0 this$0;

    public PlusPanelStatusAndFamilyViewController$handleFamilyState$$inlined$doOnLayout$1(j7d0 j7d0Var, wbp wbpVar, b5d0 b5d0Var) {
        this.this$0 = j7d0Var;
        this.$familyState$inlined = wbpVar;
        this.$imageLoader$inlined = b5d0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        j7d0 j7d0Var = this.this$0;
        if (this.$familyState$inlined != null) {
            ny61.u();
        } else if (j7d0Var.h != null) {
            throw null;
        }
    }
}
