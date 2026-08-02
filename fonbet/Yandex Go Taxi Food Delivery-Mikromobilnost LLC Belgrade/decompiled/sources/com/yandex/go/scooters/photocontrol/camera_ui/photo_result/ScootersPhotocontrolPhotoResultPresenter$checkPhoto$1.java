package com.yandex.go.scooters.photocontrol.camera_ui.photo_result;

import android.net.Uri;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import defpackage.gio0;
import defpackage.ijo0;
import defpackage.jst;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tio0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.photocontrol.camera_ui.photo_result.ScootersPhotocontrolPhotoResultPresenter$checkPhoto$1", f = "ScootersPhotocontrolPhotoResultPresenter.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolPhotoResultPresenter$checkPhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isLastExam;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolPhotoResultPresenter$checkPhoto$1(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$isLastExam = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPhotocontrolPhotoResultPresenter$checkPhoto$1(this.this$0, this.$isLastExam, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotocontrolPhotoResultPresenter$checkPhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.scooters.photocontrol.camera_ui.photo_result.d, int, zc5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                d dVar2 = this.this$0;
                boolean z2 = this.$isLastExam;
                krl0 krl0Var = dVar2.A;
                ScootersExamType scootersExamType = dVar2.D;
                this.L$0 = dVar2;
                this.L$1 = dVar2;
                this.Z$0 = z2;
                this.label = 1;
                Uri uri = ((ijo0) krl0Var.b).a;
                if ((uri == null ? zy11Var : ((com.yandex.go.scooters.photocontrol.data.c) krl0Var.a).a(uri, scootersExamType.getDocumentType(), this)) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z = z2;
                dVar = dVar2;
            } else {
                if (r1 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                dVar = (d) this.L$0;
                kotlin.b.b(obj);
            }
            if (!z) {
                ((tio0) dVar.Dg()).X4();
                return zy11Var;
            }
            dVar.y.d("photocontrol", "");
            ((gio0) dVar.F).a.r(new qu(9));
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.c(String.format("Error while photo control check", Arrays.copyOf(new Object[]{th}, 1)));
            ((gio0) r1.F).a(th);
            ((tio0) r1.Dg()).L8();
            return zy11Var;
        }
    }
}
