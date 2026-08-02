package com.yandex.messaging.internal.menu;

import com.yandex.messaging.ChatRequest;
import defpackage.ems;
import defpackage.f3b;
import defpackage.j3b;
import defpackage.m150;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r2c0;
import defpackage.tz10;
import defpackage.x270;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lj3b;", "info", "Lm150;", "name", "Lr2c0;", "pins", "Lx270;", "ongoingMeetingStatus", "Lkotlin/Pair;", "", "<destruct>", "Lf3b;", "<anonymous>", "(Lj3b;Lm150;Lr2c0;Lx270;Lkotlin/Pair;)Lf3b;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.menu.ChatHolderDialogMenuViewController$getDataAsync$3", f = "ChatHolderDialogMenuViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatHolderDialogMenuViewController$getDataAsync$3 extends SuspendLambda implements ems {
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHolderDialogMenuViewController$getDataAsync$3(c cVar, ChatRequest chatRequest, Continuation continuation) {
        super(6, continuation);
        this.this$0 = cVar;
        this.$chatRequest = chatRequest;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ChatHolderDialogMenuViewController$getDataAsync$3 chatHolderDialogMenuViewController$getDataAsync$3 = new ChatHolderDialogMenuViewController$getDataAsync$3(this.this$0, this.$chatRequest, (Continuation) obj6);
        chatHolderDialogMenuViewController$getDataAsync$3.L$0 = (j3b) obj;
        chatHolderDialogMenuViewController$getDataAsync$3.L$1 = (m150) obj2;
        chatHolderDialogMenuViewController$getDataAsync$3.L$2 = (r2c0) obj3;
        chatHolderDialogMenuViewController$getDataAsync$3.L$3 = (x270) obj4;
        chatHolderDialogMenuViewController$getDataAsync$3.L$4 = (Pair) obj5;
        return chatHolderDialogMenuViewController$getDataAsync$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j3b j3bVar = (j3b) this.L$0;
        m150 m150Var = (m150) this.L$1;
        r2c0 r2c0Var = (r2c0) this.L$2;
        x270 x270Var = (x270) this.L$3;
        Pair pair = (Pair) this.L$4;
        boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
        boolean booleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
        if (!this.this$0.s.a(tz10.O)) {
            booleanValue2 = true;
        }
        return new f3b(this.$chatRequest, j3bVar, m150Var, r2c0Var, booleanValue, booleanValue2, x270Var);
    }
}
