package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.gzw;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.ChatTranslatorReporter$onChatOpened$1", f = "ChatTranslatorReporter.kt", l = {35, 36, 39}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslatorReporter$onChatOpened$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslatorReporter$onChatOpened$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTranslatorReporter$onChatOpened$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTranslatorReporter$onChatOpened$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        String str;
        x22 x22Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            gzw gzwVar = bVar.d;
            ChatRequest chatRequest = bVar.a;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(gzwVar.a(chatRequest), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$1;
                    x22Var = (x22) this.L$0;
                    kotlin.b.b(obj);
                    x22Var.reportEvent(str, (Map) obj);
                    return zy11.a;
                }
                booleanValue = this.Z$0;
                kotlin.b.b(obj);
                String str2 = (String) obj;
                b bVar2 = this.this$0;
                x22 x22Var2 = bVar2.b;
                Pair[] pairArr = {new Pair(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(booleanValue)), new Pair("activated", Boolean.valueOf(str2 != null))};
                this.L$0 = x22Var2;
                this.L$1 = "translator chat opened";
                this.label = 3;
                obj = b.a(bVar2, pairArr, this);
                if (obj != coroutineSingletons) {
                    str = "translator chat opened";
                    x22Var = x22Var2;
                    x22Var.reportEvent(str, (Map) obj);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        booleanValue = ((Boolean) obj).booleanValue();
        b bVar3 = this.this$0;
        k kVar = bVar3.e;
        ChatRequest chatRequest2 = bVar3.a;
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = kVar.d(chatRequest2, this);
    }
}
