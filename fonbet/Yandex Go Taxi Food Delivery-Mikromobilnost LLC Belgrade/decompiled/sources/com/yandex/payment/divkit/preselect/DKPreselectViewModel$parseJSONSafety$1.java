package com.yandex.payment.divkit.preselect;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.divkit.preselect.DKPreselectViewModel", f = "DKPreselectViewModel.kt", l = {NetworkRequestException.BANNED, 456, 457}, m = "parseJSONSafety", v = 1)
/* loaded from: classes2.dex */
final class DKPreselectViewModel$parseJSONSafety$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKPreselectViewModel$parseJSONSafety$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.W(this.this$0, null, null, this);
    }
}
