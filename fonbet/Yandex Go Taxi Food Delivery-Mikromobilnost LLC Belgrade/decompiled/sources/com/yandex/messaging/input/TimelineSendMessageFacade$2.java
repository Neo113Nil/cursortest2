package com.yandex.messaging.input;

import com.yandex.messaging.internal.entities.ChatId;
import defpackage.ck51;
import defpackage.clb1;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x22;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3b;", "it", "Lzy11;", "<anonymous>", "(Lj3b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.TimelineSendMessageFacade$2", f = "SendMessageFacade.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineSendMessageFacade$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineSendMessageFacade$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineSendMessageFacade$2 timelineSendMessageFacade$2 = new TimelineSendMessageFacade$2(this.this$0, continuation);
        timelineSendMessageFacade$2.L$0 = obj;
        return timelineSendMessageFacade$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineSendMessageFacade$2 timelineSendMessageFacade$2 = (TimelineSendMessageFacade$2) create((j3b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineSendMessageFacade$2.invokeSuspend(zy11Var);
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
        j3b j3bVar = (j3b) this.L$0;
        g gVar = this.this$0;
        ck51 ck51Var = gVar.j;
        if (j3bVar == null) {
            ck51Var.getClass();
        } else {
            String str = j3bVar.b;
            boolean a = ck51Var.b.a(str, j3bVar.K, j3bVar.E, j3bVar.M, ChatId.Companion.b(str), clb1.d(ck51Var.c), true);
            Boolean bool = ck51Var.d;
            if (bool != null && !bool.equals(Boolean.valueOf(a))) {
                x22 x22Var = ck51Var.a;
                Pair pair = new Pair("chatId", str);
                Pair pair2 = new Pair("chatInfo", j3bVar.toString());
                j3b j3bVar2 = ck51Var.e;
                x22Var.reportEvent("tech_changed_file_upload_source", kotlin.collections.b.i(pair, pair2, new Pair("prevChatInfo", j3bVar2 != null ? j3bVar2.toString() : null)));
                z83.i();
            }
            ck51Var.e = j3bVar;
            ck51Var.d = Boolean.valueOf(a);
        }
        gVar.p = j3bVar;
        return zy11.a;
    }
}
