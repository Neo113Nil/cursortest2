package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.lwz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owz0;
import defpackage.pwz0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.appdelegates.SupportedOrderType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lpwz0;", "Lkotlin/Pair;", "", "<destruct>", "<anonymous>", "(Lvpr;Lkotlin/Pair;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2", f = "ClarifyAddressInteractor.kt", l = {35, 41, 44, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2 extends SuspendLambda implements zls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2 clarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2 = new ClarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2(this.this$0, (Continuation) obj3);
        clarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2.L$0 = (vpr) obj;
        clarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2.L$1 = (Pair) obj2;
        return clarifyAddressInteractor$clarifyAddressReasonFlow$clarifyAddressReasonForSupportedAddressFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r0.emit(r11, r13) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r0.emit(r11, r13) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:
    
        if (r0.emit(r3, r13) == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pwz0 pwz0Var;
        boolean z;
        int i;
        int i2;
        vpr vprVar = (vpr) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        boolean z2 = false;
        if (i3 == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
            pwz0Var = (pwz0) pair.getSecond();
            com.yandex.go.superapp.order.multi.old.provider.g gVar = this.this$0.d;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = pwz0Var;
            this.Z$0 = booleanValue;
            this.label = 1;
            gVar.getClass();
            SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
            Object q = gVar.b.q(this);
            if (q != coroutineSingletons) {
                z = booleanValue;
                obj = q;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    kotlin.b.b(obj);
                    return Boolean.valueOf(z2);
                }
                if (i3 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            z2 = true;
            return Boolean.valueOf(z2);
        }
        z = this.Z$0;
        pwz0Var = (pwz0) this.L$2;
        kotlin.b.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            com.yandex.go.superapp.order.multi.old.provider.g gVar2 = this.this$0.d;
            gVar2.getClass();
            SupportedOrderType supportedOrderType2 = SupportedOrderType.TAXI;
            if (gVar2.a().d.isEmpty() && !kotlin.collections.a.E(this.this$0.d.a().f)) {
                i = 0;
                i2 = (!(pwz0Var instanceof owz0) || i == 0) ? 0 : 1;
                lwz0 lwz0Var = lwz0.a;
                if (i2 != 0) {
                    if (z) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.Z$0 = z;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 3;
                    } else {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.Z$0 = z;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 4;
                    }
                    return coroutineSingletons;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.Z$0 = z;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 2;
                return Boolean.valueOf(z2);
            }
        }
        i = 1;
        if (pwz0Var instanceof owz0) {
        }
        lwz0 lwz0Var2 = lwz0.a;
        if (i2 != 0) {
        }
        return Boolean.valueOf(z2);
    }
}
