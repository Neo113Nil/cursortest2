package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesStoreFactory$ExecutorImpl", f = "ManagingPlusDevicesStoreFactory.kt", l = {186, 198}, m = "tryAddPlusDevice")
/* loaded from: classes2.dex */
final class ManagingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagingPlusDevicesStoreFactory$ExecutorImpl$tryAddPlusDevice$1(c0 c0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(false, this);
    }
}
