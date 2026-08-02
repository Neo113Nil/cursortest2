package com.yandex.messaging.internal.urlpreview.impl;

import com.yandex.images.FadingDrawable;
import defpackage.ad7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rh21;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.ChatDataBinder$bindTo$1", f = "ChatUrlPreview.kt", l = {362}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatDataBinder$bindTo$1 extends SuspendLambda implements wls {
    final /* synthetic */ rh21 $previewLayout;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDataBinder$bindTo$1(b bVar, rh21 rh21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$previewLayout = rh21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatDataBinder$bindTo$1(this.this$0, this.$previewLayout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatDataBinder$bindTo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.this$0.g;
            String f = str == null ? null : com.yandex.messaging.internal.images.b.f(str);
            b bVar = this.this$0;
            String str2 = bVar.e;
            this.label = 1;
            obj = tje.k0(bVar.c, new PreviewDataBinder$loadAvatar$2(f, bVar, str2, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ad7 ad7Var = (ad7) obj;
        FadingDrawable.setBitmap(this.$previewLayout.a, ad7Var.a, false, ad7Var.d);
        return zy11.a;
    }
}
