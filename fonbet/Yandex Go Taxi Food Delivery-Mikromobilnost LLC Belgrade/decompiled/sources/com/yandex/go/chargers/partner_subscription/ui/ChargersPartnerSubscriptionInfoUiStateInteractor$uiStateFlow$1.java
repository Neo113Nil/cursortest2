package com.yandex.go.chargers.partner_subscription.ui;

import com.yandex.go.chargers.partner_subscription.data.ChargersPartnerSubscriptionInfoResponse;
import defpackage.cy9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qea;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lwea;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.partner_subscription.ui.ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1", f = "ChargersPartnerSubscriptionInfoUiStateInteractor.kt", l = {23, 26, 27, 27, 30, 30}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1 chargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1 = new ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1(this.this$0, continuation);
        chargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return chargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPartnerSubscriptionInfoUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00de, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        if (r2.emit(r7, r6) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (r7 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r0.emit(defpackage.rea.a, r6) == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        a aVar3;
        vpr vprVar;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        a aVar4 = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            th = th;
        }
        switch (aVar4) {
            case 0:
                kotlin.b.b(obj);
                this.L$0 = vprVar2;
                this.label = 1;
                break;
            case 1:
                kotlin.b.b(obj);
                aVar = this.this$0;
                com.yandex.go.chargers.partner_subscription.data.a aVar5 = aVar.c;
                this.L$0 = vprVar2;
                this.L$1 = aVar;
                this.L$2 = aVar;
                this.label = 2;
                obj = aVar5.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = aVar;
                b bVar = aVar2.d;
                this.L$0 = vprVar2;
                this.L$1 = aVar;
                this.L$2 = null;
                this.L$3 = vprVar2;
                this.label = 3;
                obj = bVar.b((ChargersPartnerSubscriptionInfoResponse) obj, this);
                if (obj != coroutineSingletons) {
                    aVar3 = aVar;
                    vprVar = vprVar2;
                    this.L$0 = vprVar2;
                    this.L$1 = aVar3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    break;
                }
                return coroutineSingletons;
            case 2:
                aVar = (a) this.L$2;
                aVar2 = (a) this.L$1;
                kotlin.b.b(obj);
                b bVar2 = aVar2.d;
                this.L$0 = vprVar2;
                this.L$1 = aVar;
                this.L$2 = null;
                this.L$3 = vprVar2;
                this.label = 3;
                obj = bVar2.b((ChargersPartnerSubscriptionInfoResponse) obj, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                vprVar = (vpr) this.L$3;
                aVar3 = (a) this.L$1;
                try {
                    kotlin.b.b(obj);
                    this.L$0 = vprVar2;
                    this.L$1 = aVar3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    aVar4 = aVar3;
                    com.yandex.go.chargers.error.data.a aVar6 = aVar4.b;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = vprVar2;
                    this.label = 5;
                    obj = aVar6.a(th, this);
                    break;
                }
            case 4:
                kotlin.b.b(obj);
                return zy11.a;
            case 5:
                vprVar2 = (vpr) this.L$3;
                kotlin.b.b(obj);
                qea qeaVar = new qea((cy9) obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                break;
            case 6:
                kotlin.b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
