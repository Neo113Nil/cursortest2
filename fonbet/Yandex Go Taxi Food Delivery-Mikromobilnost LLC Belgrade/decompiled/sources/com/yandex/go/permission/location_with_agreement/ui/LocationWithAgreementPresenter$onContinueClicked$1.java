package com.yandex.go.permission.location_with_agreement.ui;

import defpackage.bd;
import defpackage.fd;
import defpackage.kk5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xpy;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationWithAgreementPresenter$onContinueClicked$1", f = "LocationWithAgreementPresenter.kt", l = {HProv.ALG_SID_SHA3_256, 80}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class LocationWithAgreementPresenter$onContinueClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWithAgreementPresenter$onContinueClicked$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationWithAgreementPresenter$onContinueClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationWithAgreementPresenter$onContinueClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (com.yandex.go.permission.location_with_agreement.ui.c.Lg(r5, r4) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (LocationRequirementsException unused) {
            this.this$0.H.g(false);
            c cVar = this.this$0;
            bd bdVar = cVar.y;
            if (bdVar != null) {
                ((fd) cVar.C).d(bdVar, null);
                ((com.yandex.go.agreement.interactor.a) cVar.z).a(bdVar);
            }
            kk5 kk5Var = cVar.x.a;
            if (kk5Var.u()) {
                kk5Var.r(new xpy(27));
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.systemrequeirements.location.c cVar2 = this.this$0.B;
            this.label = 1;
            if (cVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
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
        this.this$0.H.g(true);
        c cVar3 = this.this$0;
        this.label = 2;
    }
}
