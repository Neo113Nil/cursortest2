package com.yandex.plus.home.plaque.feature.internal.presentation;

import com.yandex.plus.log.api.LogPriority;
import defpackage.boc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.phc0;
import defpackage.rhc0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "Lboc0;", "Lphc0;", "Lrhc0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Triple;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.presentation.PlaqueViewModel$5", f = "PlaqueViewModel.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlaqueViewModel$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueViewModel$5(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlaqueViewModel$5 plaqueViewModel$5 = new PlaqueViewModel$5(this.this$0, continuation);
        plaqueViewModel$5.L$0 = obj;
        return plaqueViewModel$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueViewModel$5) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boc0 boc0Var = (boc0) triple.getFirst();
            phc0 phc0Var = (phc0) triple.getSecond();
            rhc0 rhc0Var = (rhc0) triple.getThird();
            pgz pgzVar = this.this$0.h;
            LogPriority logPriority = LogPriority.INFO;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "PlaqueViewModel", "showPlaque(" + boc0Var + Extension.FIX_SPACE + phc0Var + Extension.FIX_SPACE + rhc0Var + ')');
            }
            d dVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (d.a(dVar, boc0Var, phc0Var, rhc0Var, this) == coroutineSingletons) {
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
