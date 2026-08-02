package com.yandex.go.places.impl.ui.search.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.og10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lug10;", "<anonymous>", "()Lug10;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.utils.MediaInfoConverterUtilsKt$getFormattedText$2", f = "MediaInfoConverterUtils.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MediaInfoConverterUtilsKt$getFormattedText$2 extends SuspendLambda implements tls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MediaInfoConverterUtilsKt$getFormattedText$2(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MediaInfoConverterUtilsKt$getFormattedText$2) create((Continuation) obj)).invokeSuspend(zy11.a);
        return og10.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return og10.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
