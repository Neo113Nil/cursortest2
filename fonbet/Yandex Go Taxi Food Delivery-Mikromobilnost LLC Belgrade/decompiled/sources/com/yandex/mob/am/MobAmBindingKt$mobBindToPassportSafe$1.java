package com.yandex.mob.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.am.MobAmBindingKt", f = "MobAmBinding.kt", l = {42}, m = "mobBindToPassportSafe")
/* loaded from: classes8.dex */
final class MobAmBindingKt$mobBindToPassportSafe$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.e(null, null, null, null, null, this);
    }
}
