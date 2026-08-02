package com.yandex.go.safety.center.contacts;

import defpackage.brl0;
import defpackage.crl0;
import defpackage.drl0;
import defpackage.hoa;
import defpackage.hrl0;
import defpackage.iik0;
import defpackage.itl0;
import defpackage.m950;
import defpackage.mo30;
import defpackage.mvg;
import defpackage.ng11;
import defpackage.ny61;
import defpackage.oh11;
import defpackage.tql0;
import defpackage.tse;
import defpackage.v770;
import defpackage.w030;
import defpackage.w511;
import defpackage.wls;
import defpackage.wul0;
import defpackage.xql0;
import defpackage.yql0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.contacts.SafetyCenterContactsRouter$onLaunch$1", f = "SafetyCenterContactsRouter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterContactsRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ itl0 $payload;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterContactsRouter$onLaunch$1(b bVar, itl0 itl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = itl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterContactsRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterContactsRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v770 v770Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ng11 ng11Var = this.this$0.D;
            this.label = 1;
            obj = ng11Var.a(this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b bVar = this.this$0;
        if (booleanValue) {
            itl0 itl0Var = this.$payload;
            bVar.H.b();
            int i2 = yql0.a[itl0Var.a.ordinal()];
            if (i2 == 1) {
                v770Var = v770.p;
            } else if (i2 != 2) {
                v770Var = v770.c;
                if (i2 != 3 && i2 != 4) {
                    w511.b();
                    return null;
                }
            } else {
                v770Var = v770.d;
            }
            bVar.A((m950) bVar.E.get(), new oh11(v770Var, bVar.G), new wul0(1, new iik0(19, bVar)));
        } else {
            drl0 drl0Var = bVar.F;
            hrl0 hrl0Var = new hrl0();
            hoa hoaVar = drl0Var.a;
            bVar.z(new crl0(hrl0Var, (brl0) hoaVar.a.get(), (xql0) hoaVar.b.get(), (tql0) hoaVar.d.a, (w030) hoaVar.c.get()), new mo30(22, bVar));
        }
        return zy11.a;
    }
}
