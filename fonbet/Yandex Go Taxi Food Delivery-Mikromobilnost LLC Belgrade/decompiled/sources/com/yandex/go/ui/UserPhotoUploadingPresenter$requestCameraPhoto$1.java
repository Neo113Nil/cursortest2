package com.yandex.go.ui;

import com.yandex.go.domain.entities.UserPhotoButtonAction;
import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zf;
import defpackage.zo1;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$requestCameraPhoto$1", f = "UserPhotoUploadingPresenter.kt", l = {353}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$requestCameraPhoto$1 extends SuspendLambda implements wls {
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$requestCameraPhoto$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPhotoUploadingPresenter$requestCameraPhoto$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingPresenter$requestCameraPhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.ui.c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.permission.b bVar = (com.yandex.go.permission.b) this.this$0.B;
            final boolean z = !bVar.a(3) && bVar.f(3);
            if (z) {
                zf zfVar = this.this$0.G.c;
                zfVar.getClass();
                zfVar.a.a("AccessToCamera.Shown", new HashMap(), 1, new HashMap());
            }
            final d dVar = this.this$0;
            ?? r8 = new sls() { // from class: com.yandex.go.ui.c
                @Override // defpackage.sls
                public final Object invoke() {
                    d dVar2 = d.this;
                    ((cne0) dVar2.z.c.a.getValue()).d().putBoolean("ShouldRestore", true).commit();
                    com.yandex.go.navigation.a aVar = dVar2.x;
                    dVar2.E.b();
                    aVar.a();
                    tje.N(dVar2.Jg(), null, null, new UserPhotoUploadingPresenter$onCameraPermissionGranted$1(dVar2, null), 3);
                    if (z) {
                        dVar2.G.c("authorized");
                    }
                    return zy11.a;
                }
            };
            zo1 zo1Var = new zo1(dVar, z, 19);
            UserPhotoButtonAction userPhotoButtonAction = UserPhotoButtonAction.TAKE_SELFIE;
            this.Z$0 = z;
            this.label = 1;
            if (d.Kg(dVar, 3, r8, zo1Var, userPhotoButtonAction, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
