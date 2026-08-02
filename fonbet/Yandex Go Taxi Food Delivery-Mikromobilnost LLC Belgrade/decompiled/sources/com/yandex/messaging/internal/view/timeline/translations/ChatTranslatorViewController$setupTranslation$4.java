package com.yandex.messaging.internal.view.timeline.translations;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocb;
import defpackage.pcb;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.translations.ChatTranslatorViewController$setupTranslation$4", f = "ChatTranslatorViewController.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslatorViewController$setupTranslation$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ pcb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslatorViewController$setupTranslation$4(pcb pcbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pcbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTranslatorViewController$setupTranslation$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTranslatorViewController$setupTranslation$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pcb pcbVar = this.this$0;
            tpr a = pcbVar.g.a(pcbVar.a);
            ocb ocbVar = new ocb(this.this$0);
            this.label = 1;
            if (a.collect(ocbVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
