package com.yandex.go.preorder.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.zone.model.Zone;
import defpackage.ez21;
import defpackage.fz21;
import defpackage.hz21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpe0;
import defpackage.tse;
import defpackage.vld0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.navigation.PreorderAddressValidationRouter$onLaunch$2", f = "PreorderAddressValidationRouter.kt", l = {47, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderAddressValidationRouter$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ tpe0 $payload;
    final /* synthetic */ hz21 $result;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderAddressValidationRouter$onLaunch$2(b bVar, hz21 hz21Var, tpe0 tpe0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$result = hz21Var;
        this.$payload = tpe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreorderAddressValidationRouter$onLaunch$2(this.this$0, this.$result, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreorderAddressValidationRouter$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (com.yandex.go.preorder.navigation.b.P(r4, r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.zone.interactors.e eVar = this.this$0.F;
            Address address = ((ez21) this.$result).a;
            this.label = 1;
            obj = eVar.a(address, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        hz21 hz21Var = (hz21) obj;
        boolean z = hz21Var instanceof fz21;
        b bVar = this.this$0;
        if (z) {
            Zone zone = ((fz21) hz21Var).a;
            tpe0 tpe0Var = this.$payload;
            this.L$0 = null;
            this.label = 2;
        } else {
            vld0 vld0Var = new vld0(16);
            com.yandex.go.preload.b bVar2 = bVar.K;
            if (bVar2 != null) {
                bVar2.i();
            }
            bVar.r(vld0Var);
        }
        return zy11.a;
    }
}
