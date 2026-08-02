package com.yandex.plus.home.feature.webviews.internal.treasury;

import defpackage.cdz0;
import defpackage.g801;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.treasury.TreasuryMessagesBridge$ensureSubscribeOnTreasuryInMessages$1$1", f = "TreasuryMessagesBridge.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryMessagesBridge$ensureSubscribeOnTreasuryInMessages$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleInMessage;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasuryMessagesBridge$ensureSubscribeOnTreasuryInMessages$1$1(c cVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$handleInMessage = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TreasuryMessagesBridge$ensureSubscribeOnTreasuryInMessages$1$1(this.this$0, this.$handleInMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TreasuryMessagesBridge$ensureSubscribeOnTreasuryInMessages$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            tpr F = e.F(new jqr(e.t(new g801(4, new cdz0(cVar.a.c(), 7), cVar)), new TreasuryMessagesBridge$getTreasuryInMessageFlow$2(2, null), 3), cVar.d);
            t24 t24Var = new t24(22, this.$handleInMessage);
            this.label = 1;
            if (F.collect(t24Var, this) == coroutineSingletons) {
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
