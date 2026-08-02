package com.yandex.go.masstransit.sdk.checkout.impl.checkout;

import defpackage.cnb;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.plb;
import defpackage.rmb;
import defpackage.xnb;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcnb;", ClidProvider.STATE, "", "", "Leo21;", "userInput", "", "isSyncing", "Lplb;", "processingState", "paymentWidgetLoading", "Lxnb;", "<anonymous>", "(Lcnb;Ljava/util/Map;ZLplb;Z)Lxnb;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.checkout.impl.checkout.CheckoutUiStateInteractor$uiStateFlow$1", f = "CheckoutUiStateInteractor.kt", l = {30, 38}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CheckoutUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutUiStateInteractor$uiStateFlow$1(h hVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        CheckoutUiStateInteractor$uiStateFlow$1 checkoutUiStateInteractor$uiStateFlow$1 = new CheckoutUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj6);
        checkoutUiStateInteractor$uiStateFlow$1.L$0 = (cnb) obj;
        checkoutUiStateInteractor$uiStateFlow$1.L$1 = (Map) obj2;
        checkoutUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        checkoutUiStateInteractor$uiStateFlow$1.L$2 = (plb) obj4;
        checkoutUiStateInteractor$uiStateFlow$1.Z$1 = booleanValue2;
        return checkoutUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r13 == r11) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CheckoutUiStateInteractor$uiStateFlow$1 checkoutUiStateInteractor$uiStateFlow$1;
        i iVar;
        Throwable th;
        Object failure;
        cnb cnbVar = (cnb) this.L$0;
        Map map = (Map) this.L$1;
        boolean z = this.Z$0;
        plb plbVar = (plb) this.L$2;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            try {
                iVar = this.this$0.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = plbVar;
                this.L$3 = null;
                this.Z$0 = z;
                this.Z$1 = z2;
                this.label = 1;
                checkoutUiStateInteractor$uiStateFlow$1 = this;
            } catch (Throwable th2) {
                th = th2;
                checkoutUiStateInteractor$uiStateFlow$1 = this;
                th = th;
                failure = new Result.Failure(th);
                h hVar = checkoutUiStateInteractor$uiStateFlow$1.this$0;
                if (Result.a(failure) != null) {
                }
            }
            try {
                obj = iVar.g(cnbVar, map, z, plbVar, z2, checkoutUiStateInteractor$uiStateFlow$1);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                failure = new Result.Failure(th);
                h hVar2 = checkoutUiStateInteractor$uiStateFlow$1.this$0;
                if (Result.a(failure) != null) {
                }
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (xnb) obj;
            }
            try {
                kotlin.b.b(obj);
                checkoutUiStateInteractor$uiStateFlow$1 = this;
            } catch (Throwable th4) {
                th = th4;
                checkoutUiStateInteractor$uiStateFlow$1 = this;
                failure = new Result.Failure(th);
                h hVar22 = checkoutUiStateInteractor$uiStateFlow$1.this$0;
                if (Result.a(failure) != null) {
                }
            }
        }
        failure = (xnb) obj;
        h hVar222 = checkoutUiStateInteractor$uiStateFlow$1.this$0;
        if (Result.a(failure) != null) {
            return failure;
        }
        i iVar2 = hVar222.a;
        Map f = kotlin.collections.b.f();
        checkoutUiStateInteractor$uiStateFlow$1.L$0 = null;
        checkoutUiStateInteractor$uiStateFlow$1.L$1 = null;
        checkoutUiStateInteractor$uiStateFlow$1.L$2 = null;
        checkoutUiStateInteractor$uiStateFlow$1.L$3 = null;
        checkoutUiStateInteractor$uiStateFlow$1.Z$0 = z;
        checkoutUiStateInteractor$uiStateFlow$1.Z$1 = z2;
        checkoutUiStateInteractor$uiStateFlow$1.label = 2;
        obj = iVar2.g(rmb.a, f, z, plbVar, z2, checkoutUiStateInteractor$uiStateFlow$1);
    }
}
