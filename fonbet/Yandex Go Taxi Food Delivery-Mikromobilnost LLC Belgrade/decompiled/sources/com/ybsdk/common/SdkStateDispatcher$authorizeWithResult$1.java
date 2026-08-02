package com.ybsdk.common;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.SdkStateDispatcher", f = "SdkStateDispatcher.kt", l = {NetworkRequestException.INVALID_RANGE, HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY, 152, BlendingGradientView.BASE_ALPHA, HProv.PP_REFCOUNT}, m = "authorizeWithResult")
/* loaded from: classes8.dex */
final class SdkStateDispatcher$authorizeWithResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStateDispatcher$authorizeWithResult$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, false, null, null, this);
    }
}
