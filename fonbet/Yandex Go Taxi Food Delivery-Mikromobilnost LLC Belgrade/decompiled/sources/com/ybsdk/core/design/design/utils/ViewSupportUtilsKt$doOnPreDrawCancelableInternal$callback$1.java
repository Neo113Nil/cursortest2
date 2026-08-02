package com.ybsdk.core.design.design.utils;

import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.ybsdk.core.design.widget.ModalView;
import defpackage.h18;
import defpackage.o2w;
import defpackage.sls;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class ViewSupportUtilsKt$doOnPreDrawCancelableInternal$callback$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ sls $action;
    final /* synthetic */ Ref$ObjectRef<h18> $cancel;
    final /* synthetic */ boolean $returnValue;

    public ViewSupportUtilsKt$doOnPreDrawCancelableInternal$callback$1(sls slsVar, Ref$ObjectRef<h18> ref$ObjectRef, boolean z) {
        this.$action = slsVar;
        this.$cancel = ref$ObjectRef;
        this.$returnValue = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.$action.invoke();
        ModalView modalView = ((o2w) this.$cancel.element).a;
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(modalView, null);
        return this.$returnValue;
    }
}
