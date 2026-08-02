package com.yandex.go.promocodes;

import android.net.Uri;
import defpackage.epj;
import defpackage.j2f;
import defpackage.jl40;
import defpackage.lrf0;
import defpackage.m950;
import defpackage.mrf0;
import defpackage.mvg;
import defpackage.nrf0;
import defpackage.ny61;
import defpackage.orf0;
import defpackage.qrf0;
import defpackage.rqj;
import defpackage.srf0;
import defpackage.trf0;
import defpackage.tse;
import defpackage.vmf0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.PromocodesRouterImpl$onLaunch$1", f = "PromocodesRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PromocodesRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ qrf0 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromocodesRouterImpl$onLaunch$1(qrf0 qrf0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = qrf0Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromocodesRouterImpl$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PromocodesRouterImpl$onLaunch$1 promocodesRouterImpl$onLaunch$1 = (PromocodesRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        promocodesRouterImpl$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        orf0 orf0Var = this.$payload.a;
        if (jl40.l(orf0Var, lrf0.a)) {
            d dVar = this.this$0;
            dVar.A((m950) dVar.G.get(), new epj(null, EmptyList.a), new srf0(dVar));
        } else if (orf0Var instanceof mrf0) {
            d dVar2 = this.this$0;
            mrf0 mrf0Var = (mrf0) orf0Var;
            Uri uri = mrf0Var.a;
            dVar2.A((m950) dVar2.D.get(), new rqj(uri, mrf0Var.b, mrf0Var.c), new trf0(dVar2, uri));
        } else {
            if (!(orf0Var instanceof nrf0)) {
                w511.b();
                return null;
            }
            d dVar3 = this.this$0;
            dVar3.A((m950) dVar3.E.get(), new vmf0(((nrf0) orf0Var).a), new j2f(dVar3, 6));
        }
        return zy11.a;
    }
}
