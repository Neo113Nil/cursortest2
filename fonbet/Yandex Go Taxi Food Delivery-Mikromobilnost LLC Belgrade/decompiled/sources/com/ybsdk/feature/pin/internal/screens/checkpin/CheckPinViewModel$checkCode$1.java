package com.ybsdk.feature.pin.internal.screens.checkpin;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.internal.entities.PinCode;
import defpackage.jhb;
import defpackage.khb;
import defpackage.lhb;
import defpackage.mvg;
import defpackage.nhb;
import defpackage.ny61;
import defpackage.phb;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$checkCode$1", f = "CheckPinViewModel.kt", l = {193, 204, 210}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$checkCode$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isBiometric;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$checkCode$1(b bVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$verificationToken = str;
        this.$isBiometric = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckPinViewModel$checkCode$1(this.this$0, this.$verificationToken, this.$isBiometric, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckPinViewModel$checkCode$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r2 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006d, code lost:
    
        if (r2 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object e0;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        Object obj2;
        Throwable a2;
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, khb.b, null, null, null, false, null, 4031)));
            b bVar = this.this$0;
            this.label = 1;
            e0 = b.e0(bVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.L$0;
                    kotlin.b.b(obj);
                    a = obj2;
                    b bVar2 = this.this$0;
                    a2 = Result.a(a);
                    if (a2 != null) {
                        bVar2.R.W(false);
                        pz40 Y2 = bVar2.Y();
                        do {
                            r0Var4 = (r0) Y2;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, phb.a((phb) value4, false, false, null, null, new lhb(a2), null, null, null, false, null, 4031)));
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                b bVar3 = this.this$0;
                boolean z = this.$isBiometric;
                if (!(a instanceof Result.Failure)) {
                    jhb jhbVar = (jhb) a;
                    pz40 Y3 = bVar3.Y();
                    do {
                        r0Var3 = (r0) Y3;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, phb.a((phb) value3, false, false, null, null, null, null, null, null, false, jhbVar.a, 2047)));
                    StartSessionState startSessionState = jhbVar.b;
                    this.L$0 = a;
                    this.label = 3;
                    if (b.g0(bVar3, startSessionState, z, this) != coroutineSingletons) {
                        obj2 = a;
                        a = obj2;
                    }
                    return coroutineSingletons;
                }
                b bVar22 = this.this$0;
                a2 = Result.a(a);
                if (a2 != null) {
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            e0 = ((Result) obj).getValue();
        }
        boolean z2 = e0 instanceof Result.Failure;
        b bVar4 = this.this$0;
        if (z2) {
            pz40 Y4 = bVar4.Y();
            do {
                r0Var2 = (r0) Y4;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, phb.a((phb) value2, false, false, null, null, new nhb(Result.a(e0)), null, null, null, false, null, 4031)));
            return zy11.a;
        }
        com.ybsdk.feature.pin.internal.domain.b bVar5 = bVar4.E;
        String m448constructorimpl = PinCode.m448constructorimpl(((phb) bVar4.X()).f);
        String str = this.$verificationToken;
        String originDeeplink = this.this$0.B.getOriginDeeplink();
        this.label = 2;
        a = bVar5.a(m448constructorimpl, str, originDeeplink, this);
    }
}
