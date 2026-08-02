package com.yandex.mob.domain;

import defpackage.mvg;
import defpackage.ym20;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.domain.CurrentMobContourTracker", f = "CurrentMobContourTracker.kt", l = {39}, m = "currentContour-tWCzFD4")
/* loaded from: classes8.dex */
final class CurrentMobContourTracker$currentContour$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentMobContourTracker$currentContour$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(this);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        String str = (String) b;
        if (str != null) {
            return new ym20(str);
        }
        return null;
    }
}
