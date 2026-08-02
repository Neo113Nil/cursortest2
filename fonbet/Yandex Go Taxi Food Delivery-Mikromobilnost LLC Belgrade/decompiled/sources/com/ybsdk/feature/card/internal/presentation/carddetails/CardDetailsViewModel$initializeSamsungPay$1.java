package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import com.ybsdk.feature.card.internal.samsungpay.d;
import defpackage.bq51;
import defpackage.bq8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov3;
import defpackage.pz40;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.wls;
import defpackage.yd8;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$initializeSamsungPay$1", f = "CardDetailsViewModel.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$initializeSamsungPay$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$initializeSamsungPay$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$initializeSamsungPay$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsViewModel$initializeSamsungPay$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        bq8 bq8Var;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.M;
            this.label = 1;
            obj = dVar.a(this);
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
        com.ybsdk.feature.card.internal.samsungpay.a aVar = (com.ybsdk.feature.card.internal.samsungpay.a) obj;
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            bq8Var = (bq8) value;
        } while (!r0Var.k(value, bq8.a(bq8Var, null, null, false, null, null, null, null, SamsungPayState.a(bq8Var.j, aVar.a, aVar.c, aVar.b, false, null, null, 120), null, 15359)));
        b bVar = this.this$0;
        u8j0 u8j0Var = ((bq8) bVar.X()).a;
        if (u8j0Var != null && (list = (List) u8j0Var.a()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof yd8) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yd8 yd8Var = (yd8) it.next();
                ov3 ov3Var = bVar.N;
                String str = yd8Var.a.d;
                SamsungPayState samsungPayState = ((bq8) bVar.X()).j;
                bq51 bq51Var = yd8Var.a;
                ov3Var.a.a.edit().putBoolean("card_added_to_samsung_pay_".concat(str), samsungPayState.b(bq51Var.d, bq51Var.f)).apply();
            }
        }
        return zy11.a;
    }
}
