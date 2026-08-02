package com.yandex.go.taxi.order.support.data.repositories;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.support.data.repositories.SupportRepository$supportIconStateFlow$2", f = "SupportRepository.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportRepository$supportIconStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRepository$supportIconStateFlow$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SupportRepository$supportIconStateFlow$2 supportRepository$supportIconStateFlow$2 = new SupportRepository$supportIconStateFlow$2(this.this$0, continuation);
        supportRepository$supportIconStateFlow$2.L$0 = obj;
        return supportRepository$supportIconStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportRepository$supportIconStateFlow$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        if (str != null) {
            obj2 = ru.yandex.taxi.utils.a.b(aVar.d.b().b(str), this);
            if (obj2 != coroutineSingletons) {
                obj2 = (Bitmap) obj2;
            }
        } else {
            aVar.getClass();
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
