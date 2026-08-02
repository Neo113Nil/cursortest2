package com.yandex.messaging.internal.menu;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.y400;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "canUpdateOrg", "Ly400;", "folderKey", "Lkotlin/Pair;", "<anonymous>", "(ZLy400;)Lkotlin/Pair;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.menu.ChatHolderDialogMenuViewController$getDataAsync$2", f = "ChatHolderDialogMenuViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatHolderDialogMenuViewController$getDataAsync$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ChatHolderDialogMenuViewController$getDataAsync$2 chatHolderDialogMenuViewController$getDataAsync$2 = new ChatHolderDialogMenuViewController$getDataAsync$2(3, (Continuation) obj3);
        chatHolderDialogMenuViewController$getDataAsync$2.Z$0 = booleanValue;
        chatHolderDialogMenuViewController$getDataAsync$2.L$0 = (y400) obj2;
        return chatHolderDialogMenuViewController$getDataAsync$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new Pair(Boolean.valueOf(this.Z$0), Boolean.valueOf(((y400) this.L$0) instanceof y400));
    }
}
