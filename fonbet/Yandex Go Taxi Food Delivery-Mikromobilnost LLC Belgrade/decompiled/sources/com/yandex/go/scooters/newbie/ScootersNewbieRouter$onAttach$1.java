package com.yandex.go.scooters.newbie;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.qu;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.newbie.ScootersNewbieRouter$onAttach$1", f = "ScootersNewbieRouter.kt", l = {44, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ zy11 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieRouter$onAttach$1(d dVar, zy11 zy11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersNewbieRouter$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersNewbieRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.label = 1;
            dVar.H.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new ScootersNewbieRouter$fastNeedToSkip$2(dVar, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Boolean bool = (Boolean) obj;
                d dVar2 = this.this$0;
                if (bool == null) {
                    dVar2.r(new pzn0(9));
                    return zy11Var;
                }
                if (bool.booleanValue()) {
                    super/*pgd*/.G(this.$payload);
                    return zy11Var;
                }
                dVar2.r(new qu(9));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d dVar3 = this.this$0;
        if (booleanValue) {
            dVar3.r(new qu(9));
            return zy11Var;
        }
        this.label = 2;
        dVar3.getClass();
        obj = kotlinx.coroutines.a.w(3000L, new ScootersNewbieRouter$waitIsNewbie$2(dVar3, null), this);
    }
}
