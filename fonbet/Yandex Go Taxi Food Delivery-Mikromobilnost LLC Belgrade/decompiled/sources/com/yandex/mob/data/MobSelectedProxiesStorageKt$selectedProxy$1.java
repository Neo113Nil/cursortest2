package com.yandex.mob.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.data.MobSelectedProxiesStorageKt", f = "MobSelectedProxiesStorage.kt", l = {17}, m = "selectedProxy")
/* loaded from: classes8.dex */
final class MobSelectedProxiesStorageKt$selectedProxy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(null, null, this);
    }
}
