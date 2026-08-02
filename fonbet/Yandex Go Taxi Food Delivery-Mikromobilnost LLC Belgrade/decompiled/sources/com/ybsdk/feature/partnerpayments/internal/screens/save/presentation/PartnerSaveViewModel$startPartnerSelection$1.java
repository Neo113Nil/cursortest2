package com.ybsdk.feature.partnerpayments.internal.screens.save.presentation;

import com.ybsdk.di.modules.features.k;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o791;
import defpackage.ph90;
import defpackage.pz40;
import defpackage.srp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveViewModel$startPartnerSelection$1", f = "PartnerSaveViewModel.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerSaveViewModel$startPartnerSelection$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerSaveViewModel$startPartnerSelection$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PartnerSaveViewModel$startPartnerSelection$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerSaveViewModel$startPartnerSelection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            k kVar = this.this$0.G;
            this.label = 1;
            a = kVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = obj;
        }
        String str = (String) a;
        a aVar = this.this$0;
        if (str == null) {
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ph90.a((ph90) value, null, null, new Result(new Result.Failure(new Exception("User phone is null on save partner!"))), 3)));
            x4c.h("User phone is null on save partner!", new srp0[]{lrp0.s}, null, 12);
        } else {
            aVar.H.h(o791.j(aVar.F, str, null, PartnerSelectionFeature$Companion$Entry.EXTERNAL_BANK, null, null, null, null, null, null, 1016));
        }
        return zy11.a;
    }
}
