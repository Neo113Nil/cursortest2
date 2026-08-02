package com.yandex.go.chargers.qr;

import com.yandex.go.chargers.qr.data.model.ChargersQrMode;
import defpackage.joa;
import defpackage.moa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.poa;
import defpackage.tse;
import defpackage.v41;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.qr.ChargersQrPresenter$start$1", f = "ChargersQrPresenter.kt", l = {81, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersQrPresenter$start$1 extends SuspendLambda implements wls {
    boolean Z$0;
    int label;
    final /* synthetic */ poa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersQrPresenter$start$1(poa poaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = poaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersQrPresenter$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersQrPresenter$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r3.collect(r4, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r7 == r0) goto L19;
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
            v7j0 v7j0Var = this.this$0.B;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) v7j0Var).d(3, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        poa poaVar = this.this$0;
        if (booleanValue) {
            joa joaVar = poaVar.C;
            joaVar.a.l(ChargersQrMode.QR_SCAN);
        } else {
            joa joaVar2 = poaVar.C;
            joaVar2.a.l(ChargersQrMode.MANUAL);
        }
        poa poaVar2 = this.this$0;
        m0 m0Var = poaVar2.D.b;
        v41 v41Var = new v41(4, (moa) poaVar2.Dg());
        this.Z$0 = booleanValue;
        this.label = 2;
    }
}
