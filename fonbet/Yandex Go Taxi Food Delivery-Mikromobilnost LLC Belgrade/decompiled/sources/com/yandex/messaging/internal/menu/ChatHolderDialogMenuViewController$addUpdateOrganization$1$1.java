package com.yandex.messaging.internal.menu;

import defpackage.ab4;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5b0;
import defpackage.tcc;
import defpackage.w2b1;
import defpackage.w4b0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lw4b0;", "organizations", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.menu.ChatHolderDialogMenuViewController$addUpdateOrganization$1$1", f = "ChatHolderDialogMenuViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatHolderDialogMenuViewController$addUpdateOrganization$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHolderDialogMenuViewController$addUpdateOrganization$1$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatHolderDialogMenuViewController$addUpdateOrganization$1$1 chatHolderDialogMenuViewController$addUpdateOrganization$1$1 = new ChatHolderDialogMenuViewController$addUpdateOrganization$1$1(this.this$0, continuation);
        chatHolderDialogMenuViewController$addUpdateOrganization$1$1.L$0 = obj;
        return chatHolderDialogMenuViewController$addUpdateOrganization$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatHolderDialogMenuViewController$addUpdateOrganization$1$1 chatHolderDialogMenuViewController$addUpdateOrganization$1$1 = (ChatHolderDialogMenuViewController$addUpdateOrganization$1$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatHolderDialogMenuViewController$addUpdateOrganization$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.L$0;
        c cVar = this.this$0;
        com.yandex.messaging.ui.settings.c cVar2 = cVar.f;
        List<w4b0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (w4b0 w4b0Var : list2) {
            long j = w4b0Var.a;
            arrayList.add(new o5b0(j, w4b0Var.b, ab4.b(cVar.m, String.valueOf(j), w2b1.a(w4b0Var.b), null, 12), w4b0Var.f));
        }
        if (!jl40.l(cVar2.b, arrayList)) {
            cVar2.b = arrayList;
            cVar2.notifyDataSetChanged();
        }
        return zy11.a;
    }
}
