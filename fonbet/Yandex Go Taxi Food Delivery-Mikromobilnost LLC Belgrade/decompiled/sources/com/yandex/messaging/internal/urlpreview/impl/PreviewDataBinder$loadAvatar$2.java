package com.yandex.messaging.internal.urlpreview.impl;

import defpackage.g020;
import defpackage.ib4;
import defpackage.kb4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uxe0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lad7;", "<anonymous>", "(Ltse;)Lad7;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.PreviewDataBinder$loadAvatar$2", f = "ChatUrlPreview.kt", l = {200}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PreviewDataBinder$loadAvatar$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $avatarId;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ uxe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewDataBinder$loadAvatar$2(String str, uxe0 uxe0Var, String str2, Continuation continuation) {
        super(2, continuation);
        this.$avatarId = str;
        this.this$0 = uxe0Var;
        this.$name = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreviewDataBinder$loadAvatar$2(this.$avatarId, this.this$0, this.$name, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreviewDataBinder$loadAvatar$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$avatarId;
        uxe0 uxe0Var = this.this$0;
        int i2 = uxe0Var.k;
        g020 g020Var = new g020(com.yandex.messaging.internal.images.b.f(str), i2, this.$name, uxe0Var.d, new ib4(new Integer(new kb4(i2).a())));
        com.yandex.messaging.internal.avatar.a aVar = this.this$0.b;
        this.label = 1;
        Object b = aVar.b(g020Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
