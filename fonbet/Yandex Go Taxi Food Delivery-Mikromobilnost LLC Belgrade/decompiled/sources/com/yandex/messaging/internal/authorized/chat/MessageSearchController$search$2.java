package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.core.net.entities.Ranking;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.SearchParams;
import defpackage.fse;
import defpackage.j73;
import defpackage.k200;
import defpackage.l020;
import defpackage.l4o;
import defpackage.lqo;
import defpackage.mvg;
import defpackage.naz0;
import defpackage.ny61;
import defpackage.rv10;
import defpackage.tje;
import defpackage.tse;
import defpackage.tz10;
import defpackage.vmz;
import defpackage.wls;
import defpackage.yw01;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)[J"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.MessageSearchController$search$2", f = "MessageSearchController.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageSearchController$search$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageSearchController$search$2(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageSearchController$search$2(this.this$0, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageSearchController$search$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchData.Message[] messageArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lqo lqoVar = this.this$0.e;
            l4o l4oVar = tz10.a;
            lqoVar.getClass();
            Ranking.INSTANCE.getClass();
            Ranking ranking = new Ranking("messenger_search_ranking", "");
            naz0 naz0Var = this.this$0.b;
            SearchParams searchParams = new SearchParams(new String[]{"messages"}, naz0Var.a.b, this.$query, naz0Var.e(), ranking);
            j jVar = this.this$0;
            this.label = 1;
            fse fseVar = jVar.f.e;
            if (fseVar == null) {
                fseVar = get_context();
            }
            obj = tje.k0(fseVar, new MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1(null, jVar, searchParams), this);
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
        j jVar2 = this.this$0;
        jVar2.getClass();
        SearchData.Messages messages = ((SearchData) obj).messages;
        if (messages == null || (messageArr = messages.items) == null) {
            return new long[0];
        }
        l020 C = jVar2.d.C();
        try {
            List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new yw01(kotlin.sequences.b.g(new yw01(kotlin.sequences.b.i(j73.v(messageArr)), new rv10(0)), new rv10(1)), new rv10(2)), new k200(24, jVar2)), new vmz(17, jVar2, C)));
            C.s();
            long[] K0 = kotlin.collections.a.K0(s);
            C.close();
            return K0;
        } finally {
        }
    }
}
