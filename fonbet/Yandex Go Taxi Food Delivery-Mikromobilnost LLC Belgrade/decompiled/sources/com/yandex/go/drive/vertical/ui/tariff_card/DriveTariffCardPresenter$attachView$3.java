package com.yandex.go.drive.vertical.ui.tariff_card;

import defpackage.ahm;
import defpackage.dhm;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pcm;
import defpackage.pex0;
import defpackage.qcm;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "tariffSelection", "Lzy11;", "<anonymous>", "(Lfnx0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardPresenter$attachView$3", f = "DriveTariffCardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveTariffCardPresenter$attachView$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ahm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveTariffCardPresenter$attachView$3(ahm ahmVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ahmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriveTariffCardPresenter$attachView$3 driveTariffCardPresenter$attachView$3 = new DriveTariffCardPresenter$attachView$3(this.this$0, continuation);
        driveTariffCardPresenter$attachView$3.L$0 = obj;
        return driveTariffCardPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriveTariffCardPresenter$attachView$3 driveTariffCardPresenter$attachView$3 = (DriveTariffCardPresenter$attachView$3) create((fnx0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        driveTariffCardPresenter$attachView$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pex0 pex0Var = fnx0Var.c;
        dhm dhmVar = pex0Var.Y;
        ahm ahmVar = this.this$0;
        if (dhmVar == null) {
            pcm pcmVar = ahmVar.F;
            String str = ahmVar.y;
            String str2 = pex0Var.G;
            qcm qcmVar = (qcm) pcmVar;
            qcmVar.getClass();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("source", str);
            }
            if (str2 != null) {
                hashMap.put("unavailability_code", str2);
            }
            qcmVar.b("drive_vertical_load_error", hashMap);
        } else if (!ahmVar.O) {
            pcm pcmVar2 = ahmVar.F;
            String str3 = ahmVar.y;
            qcm qcmVar2 = (qcm) pcmVar2;
            qcmVar2.getClass();
            HashMap hashMap2 = new HashMap();
            if (str3 != null) {
                hashMap2.put("source", str3);
            }
            qcmVar2.b("drive_vertical_loaded", hashMap2);
            this.this$0.O = true;
        }
        return zy11.a;
    }
}
