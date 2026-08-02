package com.yandex.go.platform.js_api.contact;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.yandex.go.platform.js_api.contact.ContactPickerHandler", f = "ContactPickerHandler.kt", l = {17}, m = "pickContact-IoAF18A")
/* loaded from: classes13.dex */
final class ContactPickerHandler$pickContact$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactPickerHandler$pickContact$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
