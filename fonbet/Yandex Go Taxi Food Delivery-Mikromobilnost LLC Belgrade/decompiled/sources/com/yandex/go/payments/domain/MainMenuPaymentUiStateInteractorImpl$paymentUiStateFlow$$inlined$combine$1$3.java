package com.yandex.go.payments.domain;

import defpackage.lv90;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3", f = "MainMenuPaymentUiStateInteractorImpl.kt", l = {336, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ u $receiver$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3(u uVar, Continuation continuation) {
        super(3, continuation);
        this.$receiver$inlined = uVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3 mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3 = new MainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3(this.$receiver$inlined, (Continuation) obj3);
        mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return mainMenuPaymentUiStateInteractorImpl$paymentUiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c2, code lost:
    
        if (r1.emit(r2, r20) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        if (r2 == r3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k0;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            lv90 lv90Var = (lv90) objArr[5];
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            boolean booleanValue3 = ((Boolean) obj2).booleanValue();
            u uVar = this.$receiver$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.Z$0 = booleanValue;
            this.Z$1 = booleanValue2;
            this.Z$2 = booleanValue3;
            this.label = 1;
            uVar.a.getClass();
            sjh sjhVar = uyj.a;
            k0 = tje.k0(mdh.b, new MainMenuPaymentUiStateInteractorImpl$toUiState$2(uVar, (lv90) obj6, lv90Var, booleanValue3, booleanValue, booleanValue2, null), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            k0 = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.label = 2;
    }
}
