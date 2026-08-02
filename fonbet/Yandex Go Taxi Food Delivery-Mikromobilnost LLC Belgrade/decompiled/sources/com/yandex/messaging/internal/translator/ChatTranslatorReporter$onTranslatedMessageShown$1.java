package com.yandex.messaging.internal.translator;

import android.os.SystemClock;
import defpackage.mcb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x22;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.ChatTranslatorReporter$onTranslatedMessageShown$1", f = "ChatTranslatorReporter.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslatorReporter$onTranslatedMessageShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $messageTimestamp;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslatorReporter$onTranslatedMessageShown$1(b bVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$messageTimestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTranslatorReporter$onTranslatedMessageShown$1(this.this$0, this.$messageTimestamp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTranslatorReporter$onTranslatedMessageShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        x22 x22Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            mcb mcbVar = (mcb) this.this$0.g.get(this.$messageTimestamp);
            if (mcbVar == null) {
                return zy11Var;
            }
            this.this$0.g.remove(this.$messageTimestamp);
            this.this$0.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - mcbVar.a;
            String str2 = mcbVar.c ? "client polling" : mcbVar.b ? "client chat" : mcbVar.d ? "server proactive" : "other";
            b bVar = this.this$0;
            x22 x22Var2 = bVar.b;
            Pair[] pairArr = {new Pair(RemoteBioParameters.TIME, new Long(elapsedRealtime)), new Pair("source", str2)};
            this.L$0 = x22Var2;
            this.L$1 = "message translated";
            this.label = 1;
            obj = b.a(bVar, pairArr, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = "message translated";
            x22Var = x22Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            x22Var = (x22) this.L$0;
            kotlin.b.b(obj);
        }
        x22Var.reportEvent(str, (Map) obj);
        return zy11Var;
    }
}
