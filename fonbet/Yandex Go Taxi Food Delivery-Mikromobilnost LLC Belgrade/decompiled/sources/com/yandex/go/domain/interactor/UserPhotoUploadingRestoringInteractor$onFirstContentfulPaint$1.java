package com.yandex.go.domain.interactor;

import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import defpackage.cne0;
import defpackage.fr21;
import defpackage.gtq0;
import defpackage.hr21;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.or21;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.domain.interactor.UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1", f = "UserPhotoUploadingRestoringInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1 userPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1 = (UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        or21 or21Var = (or21) this.this$0.b.get();
        fr21 fr21Var = this.this$0.d;
        synchronized (fr21Var) {
            g = ((cne0) fr21Var.a.getValue()).g("ShouldRestore", false);
        }
        if (g && !gtq0.u(or21Var)) {
            ((pep0) this.this$0.c).f(or21Var, new hr21(UserPhotoUploadingEntryPoint.RESTORED, false, 6), hxx.a);
        }
        return zy11.a;
    }
}
