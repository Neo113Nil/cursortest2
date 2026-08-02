package com.yandex.messaging.internal.urlpreview.impl;

import defpackage.g020;
import defpackage.hb4;
import defpackage.mvg;
import defpackage.nh21;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lad7;", "<anonymous>", "(Ltse;)Lad7;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.MessageUrlPreview$loadAvatarAsync$2", f = "MessageUrlPreview.kt", l = {216}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageUrlPreview$loadAvatarAsync$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $authorName;
    final /* synthetic */ String $avatarId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageUrlPreview$loadAvatarAsync$2(String str, c cVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.$avatarId = str;
        this.this$0 = cVar;
        this.$authorName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageUrlPreview$loadAvatarAsync$2(this.$avatarId, this.this$0, this.$authorName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageUrlPreview$loadAvatarAsync$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c cVar = this.this$0;
        g020 g020Var = new g020(com.yandex.messaging.internal.images.b.f(str), cVar.G, this.$authorName, ((nh21) ((ye0) cVar.b)).y, hb4.a);
        com.yandex.messaging.internal.avatar.a aVar = this.this$0.x;
        this.label = 1;
        Object b = aVar.b(g020Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
