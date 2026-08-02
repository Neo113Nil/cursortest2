package com.yandex.go.masstransit.sdk.order.impl.activation;

import android.util.Base64;
import defpackage.ctb1;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t960;
import defpackage.tje;
import defpackage.tse;
import defpackage.v77;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.activation.TicketActivationScanUiStateInteractor$switchToNfcMode$1", f = "TicketActivationScanUiStateInteractor.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TicketActivationScanUiStateInteractor$switchToNfcMode$1 extends SuspendLambda implements wls {
    final /* synthetic */ tse $scope;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketActivationScanUiStateInteractor$switchToNfcMode$1(d dVar, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketActivationScanUiStateInteractor$switchToNfcMode$1(this.this$0, this.$scope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketActivationScanUiStateInteractor$switchToNfcMode$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        d dVar = this.this$0;
        tse tseVar = this.$scope;
        String str = dVar.h;
        if (str == null || str.length() == 0) {
            bArr = null;
        } else {
            try {
                bArr = Base64.decode(dVar.h, 0);
            } catch (Exception e) {
                xby.d.i("[TicketActivation] Failed to decode ticketBody from base64", e);
                dVar.b("Ticket data decoding error");
            }
        }
        String str2 = dVar.i;
        if (str2 == null || str2.length() == 0) {
            bArr2 = null;
        } else {
            try {
                bArr2 = Base64.decode(dVar.i, 0);
            } catch (Exception e2) {
                xby.d.i("[TicketActivation] Failed to decode savedBarcode from base64", e2);
                dVar.b("Error decoding the saved barcode");
            }
        }
        xby.d.d("ValidationProvider", "You should call onResume() before");
        i3y i3yVar = t960.d;
        t960.a(ctb1.b(), bArr != null ? new v77(bArr) : null, bArr2 != null ? new v77(bArr2) : null);
        dVar.k = tje.N(tseVar, null, null, new TicketActivationScanUiStateInteractor$startNfcValidation$1(ctb1.b().c, dVar, tseVar, null), 3);
        return zy11.a;
    }
}
