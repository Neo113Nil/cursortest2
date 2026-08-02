package com.ybsdk.feature.rebind.payment.internal.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import com.ybsdk.utils.poller.c;
import defpackage.d6v;
import defpackage.mvg;
import defpackage.n8u0;
import defpackage.ny61;
import defpackage.t0e0;
import defpackage.wls;
import defpackage.wpy;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Ln8u0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.rebind.payment.internal.domain.RebindPaymentMethodInteractor$getRebindPaymentMethod$1", f = "RebindPaymentMethodInteractor.kt", l = {22, 31, 46, 48, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 64}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RebindPaymentMethodInteractor$getRebindPaymentMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ d6v $idempotencyToken;
    final /* synthetic */ String $paymentMethodId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RebindPaymentMethodInteractor$getRebindPaymentMethod$1(a aVar, String str, d6v d6vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$paymentMethodId = str;
        this.$idempotencyToken = d6vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RebindPaymentMethodInteractor$getRebindPaymentMethod$1 rebindPaymentMethodInteractor$getRebindPaymentMethod$1 = new RebindPaymentMethodInteractor$getRebindPaymentMethod$1(this.this$0, this.$paymentMethodId, this.$idempotencyToken, continuation);
        rebindPaymentMethodInteractor$getRebindPaymentMethod$1.L$0 = obj;
        return rebindPaymentMethodInteractor$getRebindPaymentMethod$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RebindPaymentMethodInteractor$getRebindPaymentMethod$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        if (((defpackage.x6f0) r1).y.o(r4, r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r11 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (((defpackage.x6f0) r1).y.o(r11, r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (((defpackage.x6f0) r1).y.o(r11, r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (((defpackage.x6f0) r1).y.o(r11, r10) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var;
        Object obj2;
        Throwable a;
        RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity;
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                y6f0 y6f0Var2 = (y6f0) this.L$0;
                com.ybsdk.feature.rebind.payment.internal.data.a aVar = this.this$0.a;
                String str = this.$paymentMethodId;
                d6v d6vVar = this.$idempotencyToken;
                this.L$0 = y6f0Var2;
                this.label = 1;
                Object c = aVar.c(d6vVar, str, this);
                if (c != coroutineSingletons) {
                    y6f0Var = y6f0Var2;
                    obj2 = c;
                    a aVar2 = this.this$0;
                    a = Result.a(obj2);
                    if (a == null) {
                        n8u0 n8u0Var = new n8u0(RebindPaymentMethodStatusEntity.FAILED, a, 2);
                        this.L$0 = null;
                        this.label = 6;
                        break;
                    } else {
                        wpy wpyVar = (wpy) obj2;
                        RebindPaymentMethodStatusEntity rebindPaymentMethodStatusEntity2 = wpyVar.a;
                        if (rebindPaymentMethodStatusEntity2 != RebindPaymentMethodStatusEntity.FINISHED && rebindPaymentMethodStatusEntity2 != (rebindPaymentMethodStatusEntity = RebindPaymentMethodStatusEntity.FAILED)) {
                            String str2 = wpyVar.b;
                            if (str2 == null) {
                                n8u0 n8u0Var2 = new n8u0(rebindPaymentMethodStatusEntity, new Throwable("payment_id is null"), 2);
                                this.L$0 = null;
                                this.label = 5;
                                break;
                            } else {
                                c c2 = aVar2.b.c(t0e0.b, new RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$1(2, null), new RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2(aVar2, str2, y6f0Var, null));
                                this.L$0 = y6f0Var;
                                this.label = 3;
                                e = c2.e(this);
                                break;
                            }
                        } else {
                            n8u0 n8u0Var3 = new n8u0(rebindPaymentMethodStatusEntity2, (Throwable) null, 6);
                            this.L$0 = null;
                            this.label = 2;
                            break;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                y6f0Var = (y6f0) this.L$0;
                b.b(obj);
                obj2 = ((Result) obj).getValue();
                a aVar22 = this.this$0;
                a = Result.a(obj2);
                if (a == null) {
                }
                break;
            case 2:
            case 4:
            case 5:
            case 6:
                b.b(obj);
                return zy11.a;
            case 3:
                y6f0Var = (y6f0) this.L$0;
                b.b(obj);
                e = ((Result) obj).getValue();
                Throwable a2 = Result.a(e);
                if (a2 != null) {
                    n8u0 n8u0Var4 = new n8u0(RebindPaymentMethodStatusEntity.FAILED, a2, 2);
                    this.L$0 = e;
                    this.label = 4;
                    break;
                }
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
