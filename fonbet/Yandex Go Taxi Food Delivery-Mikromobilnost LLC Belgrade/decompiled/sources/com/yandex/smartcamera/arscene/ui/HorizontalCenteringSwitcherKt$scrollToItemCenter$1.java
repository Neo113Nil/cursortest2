package com.yandex.smartcamera.arscene.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.smartcamera.arscene.ui.HorizontalCenteringSwitcherKt", f = "HorizontalCenteringSwitcher.kt", l = {174, 178, 181}, m = "scrollToItemCenter")
/* loaded from: classes11.dex */
final class HorizontalCenteringSwitcherKt$scrollToItemCenter$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.c(null, 0, false, this);
    }
}
