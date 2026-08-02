package com.yandex.go.explorer.impl.ui.permission;

import com.yandex.go.explorer.impl.navigation.appsettings.a;
import defpackage.jb60;
import defpackage.lb60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.permission.NoBackgroundLocationPermissionBottomSheetPresenter$onOpenSettingsClicked$1", f = "NoBackgroundLocationPermissionBottomSheetPresenter.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NoBackgroundLocationPermissionBottomSheetPresenter$onOpenSettingsClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ jb60 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoBackgroundLocationPermissionBottomSheetPresenter$onOpenSettingsClicked$1(jb60 jb60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jb60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NoBackgroundLocationPermissionBottomSheetPresenter$onOpenSettingsClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NoBackgroundLocationPermissionBottomSheetPresenter$onOpenSettingsClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0.D;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ((lb60) this.this$0.A.a).r(new qu(9));
        return zy11.a;
    }
}
