package com.yandex.go.common;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bjx0;
import defpackage.cjx0;
import defpackage.dix0;
import defpackage.eix0;
import defpackage.fix0;
import defpackage.fnx0;
import defpackage.h1g;
import defpackage.i130;
import defpackage.jh31;
import defpackage.kkx0;
import defpackage.lf2;
import defpackage.m950;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vdm;
import defpackage.wls;
import defpackage.zix0;
import defpackage.zjj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.common.TariffOptionsRouter$onLaunch$1", f = "TariffOptionsRouter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TariffOptionsRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ zix0 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsRouter$onLaunch$1(a aVar, zix0 zix0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = zix0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            mth b = ((k) this.this$0.D).j.b();
            this.label = 1;
            obj = e.y(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean g = this.this$0.F.g(((fnx0) obj).d);
        a aVar = this.this$0;
        zix0 zix0Var = this.$payload;
        if (g) {
            eix0 eix0Var = aVar.G;
            jh31 jh31Var = aVar.H;
            lf2 lf2Var = eix0Var.a;
            vdm vdmVar = new vdm((h1g) lf2Var.b.get(), (i130) lf2Var.c.get(), (fix0) lf2Var.a.a, jh31Var, 4);
            zjj0 zjj0Var = zix0Var.a;
            aVar.A(vdmVar, new dix0(), new bjx0(aVar));
        } else {
            aVar.A((m950) aVar.E.get(), new kkx0(zix0Var.a), new cjx0(aVar));
        }
        return zy11.a;
    }
}
