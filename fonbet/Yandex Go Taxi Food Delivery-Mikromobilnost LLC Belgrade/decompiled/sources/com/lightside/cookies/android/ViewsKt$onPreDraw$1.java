package com.lightside.cookies.android;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/lightside/cookies/android/ViewsKt$onPreDraw$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewsKt$onPreDraw$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ sls $action;
    final /* synthetic */ View $this_onPreDraw;

    public ViewsKt$onPreDraw$1(View view, sls slsVar) {
        this.$this_onPreDraw = view;
        this.$action = slsVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.$this_onPreDraw.getViewTreeObserver().removeOnPreDrawListener(this);
        return ((Boolean) this.$action.invoke()).booleanValue();
    }
}
