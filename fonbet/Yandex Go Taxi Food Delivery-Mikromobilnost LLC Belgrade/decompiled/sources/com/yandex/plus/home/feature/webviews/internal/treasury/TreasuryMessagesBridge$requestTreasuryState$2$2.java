package com.yandex.plus.home.feature.webviews.internal.treasury;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.jqd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.td11;
import defpackage.tnv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltnv;", "<anonymous>", "(Ltse;)Ltnv;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.treasury.TreasuryMessagesBridge$requestTreasuryState$2$2", f = "TreasuryMessagesBridge.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryMessagesBridge$requestTreasuryState$2$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $trackId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasuryMessagesBridge$requestTreasuryState$2$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$trackId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TreasuryMessagesBridge$requestTreasuryState$2$2(this.this$0, this.$trackId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TreasuryMessagesBridge$requestTreasuryState$2$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.label = 1;
            obj = c.a(cVar, this);
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
        jqd0 jqd0Var = (jqd0) obj;
        c cVar2 = this.this$0;
        cVar2.e = jqd0Var;
        td11 td11Var = cVar2.c;
        String str = this.$trackId;
        td11Var.getClass();
        tnv b = td11.b(jqd0Var, str);
        skd0.b(PlusLogTag.TREASURY, "requestTreasuryState() result inMessage=" + b);
        return b;
    }
}
