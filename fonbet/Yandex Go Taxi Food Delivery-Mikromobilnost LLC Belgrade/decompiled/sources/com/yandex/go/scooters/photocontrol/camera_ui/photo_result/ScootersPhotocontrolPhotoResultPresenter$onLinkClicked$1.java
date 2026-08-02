package com.yandex.go.scooters.photocontrol.camera_ui.photo_result;

import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolExperiment;
import defpackage.aio0;
import defpackage.gio0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8p0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.vdm;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.photocontrol.camera_ui.photo_result.ScootersPhotocontrolPhotoResultPresenter$onLinkClicked$1", f = "ScootersPhotocontrolPhotoResultPresenter.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolPhotoResultPresenter$onLinkClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolPhotoResultPresenter$onLinkClicked$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPhotocontrolPhotoResultPresenter$onLinkClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotocontrolPhotoResultPresenter$onLinkClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aio0 aio0Var = this.this$0.B;
            this.label = 1;
            obj = aio0Var.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ScootersPhotocontrolExperiment.PersonalDataScreen.Legal legal = ((ScootersPhotocontrolExperiment) obj).d.e;
        zy11 zy11Var = zy11.a;
        if (legal != null && (str = legal.b) != null) {
            vdm vdmVar = ((gio0) this.this$0.F).a;
            vdmVar.A((m950) ((yvf0) vdmVar.G).get(), new w8p0(new q8p0(str, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
        }
        return zy11Var;
    }
}
