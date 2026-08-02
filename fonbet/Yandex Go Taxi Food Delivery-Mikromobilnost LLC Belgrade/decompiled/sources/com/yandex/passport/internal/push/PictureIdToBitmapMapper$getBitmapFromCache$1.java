package com.yandex.passport.internal.push;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.push.PictureIdToBitmapMapper", f = "PictureIdToBitmapMapper.kt", l = {31}, m = "getBitmapFromCache-OaxHe8w")
/* loaded from: classes15.dex */
final class PictureIdToBitmapMapper$getBitmapFromCache$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PictureIdToBitmapMapper$getBitmapFromCache$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
