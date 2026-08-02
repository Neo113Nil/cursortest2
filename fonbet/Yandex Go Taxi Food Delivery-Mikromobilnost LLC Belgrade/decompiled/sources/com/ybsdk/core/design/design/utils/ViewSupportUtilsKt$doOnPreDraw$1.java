package com.ybsdk.core.design.design.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ybsdk/core/design/design/utils/ViewSupportUtilsKt$doOnPreDraw$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class ViewSupportUtilsKt$doOnPreDraw$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ sls $action;
    final /* synthetic */ View $this_doOnPreDraw;
    final /* synthetic */ ViewTreeObserver $vto;

    public ViewSupportUtilsKt$doOnPreDraw$1(sls slsVar, ViewTreeObserver viewTreeObserver, View view) {
        this.$action = slsVar;
        this.$vto = viewTreeObserver;
        this.$this_doOnPreDraw = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.$action.invoke();
        if (this.$vto.isAlive()) {
            this.$vto.removeOnPreDrawListener(this);
            return true;
        }
        this.$this_doOnPreDraw.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
