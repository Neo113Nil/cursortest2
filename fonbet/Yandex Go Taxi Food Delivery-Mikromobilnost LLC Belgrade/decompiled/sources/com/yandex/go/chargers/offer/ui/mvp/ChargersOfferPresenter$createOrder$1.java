package com.yandex.go.chargers.offer.ui.mvp;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import defpackage.b5a;
import defpackage.c8a;
import defpackage.gp9;
import defpackage.h9a;
import defpackage.hfa0;
import defpackage.hp9;
import defpackage.ip9;
import defpackage.j1a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oaa;
import defpackage.paa;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uo9;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.ui.mvp.ChargersOfferPresenter$createOrder$1", f = "ChargersOfferPresenter.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferPresenter$createOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferPresenter$createOrder$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersOfferPresenter$createOrder$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferPresenter$createOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            paa paaVar = (paa) this.this$0.I.getValue();
            c cVar = this.this$0;
            if (paaVar instanceof oaa) {
                oaa oaaVar = (oaa) paaVar;
                r0 r0Var = cVar.I;
                String str = oaaVar.a;
                hfa0 hfa0Var = oaaVar.b;
                CharSequence charSequence = oaaVar.c;
                c8a c8aVar = oaaVar.d;
                List list = c8aVar.h;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(uo9.a((uo9) it.next(), null, HProv.PP_VERSION_TIMESTAMP));
                }
                oaa oaaVar2 = new oaa(str, hfa0Var, charSequence, new c8a(c8aVar.a, c8aVar.b, c8aVar.c, c8aVar.d, c8aVar.e, c8aVar.f, c8aVar.g, arrayList, c8aVar.i, c8aVar.j, c8aVar.k, c8aVar.l, c8aVar.m), oaaVar.e, oaaVar.f, false, oaaVar.h, oaaVar.i);
                r0Var.getClass();
                obj2 = null;
                r0Var.m(null, oaaVar2);
            } else {
                obj2 = null;
            }
            com.yandex.go.chargers.offer.domain.c cVar2 = this.this$0.A;
            String str2 = this.$id;
            this.L$0 = obj2;
            this.label = 1;
            a = cVar2.a(str2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        ip9 ip9Var = (ip9) a;
        if (ip9Var instanceof gp9) {
            this.this$0.x.n(ChargersAnalytics$ChargersOfferCardCloseReason.Error);
            ((h9a) this.this$0.H.a).r(new j1a(((gp9) ip9Var).a, 2));
        } else {
            if (!(ip9Var instanceof hp9)) {
                w511.b();
                return null;
            }
            this.this$0.x.n(ChargersAnalytics$ChargersOfferCardCloseReason.CreateOrder);
            ((h9a) this.this$0.H.a).r(new b5a(((hp9) ip9Var).a, 4));
        }
        return zy11.a;
    }
}
