package com.yandex.go.pickup_from_photo.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.pickup_from_photo.domain.UploadPhotosInteractor", f = "UploadPhotosInteractor.kt", l = {17, 20}, m = "uploadSavedPhotos", v = 2)
/* loaded from: classes13.dex */
final class UploadPhotosInteractor$uploadSavedPhotos$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPhotosInteractor$uploadSavedPhotos$1(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
