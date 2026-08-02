package com.yandex.messaging.domain.actions;

import defpackage.avb0;
import defpackage.bp5;
import defpackage.cl21;
import defpackage.cn2;
import defpackage.d9g;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.actions.ChangePinOrderAction$doWork-gIAlu-s$$inlined$cancelableCoroutineWrapper$default$1", f = "ChangePinOrderAction.kt", l = {113}, m = "invokeSuspend")
/* renamed from: com.yandex.messaging.domain.actions.ChangePinOrderAction$doWork-gIAlu-s$$inlined$cancelableCoroutineWrapper$default$1, reason: invalid class name */
/* loaded from: classes15.dex */
public final class ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1 extends SuspendLambda implements wls {
    final /* synthetic */ List $actualPinnedChats$inlined;
    final /* synthetic */ cl21 $user$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1(Continuation continuation, cl21 cl21Var, List list) {
        super(2, continuation);
        this.$user$inlined = cl21Var;
        this.$actualPinnedChats$inlined = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1 changePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1 = new ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1(continuation, this.$user$inlined, this.$actualPinnedChats$inlined);
        changePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1.L$0 = obj;
        return changePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j18Var.w(new uo3(tseVar, new cn2(((avb0) ((d9g) this.$user$inlined).F0.get()).a((String[]) this.$actualPinnedChats$inlined.toArray(new String[0]), new bp5(j18Var)), 1), 16));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
