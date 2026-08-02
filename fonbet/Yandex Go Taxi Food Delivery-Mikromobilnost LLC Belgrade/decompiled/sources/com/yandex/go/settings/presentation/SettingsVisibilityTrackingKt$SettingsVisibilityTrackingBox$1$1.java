package com.yandex.go.settings.presentation;

import androidx.compose.runtime.f;
import defpackage.is6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oip0;
import defpackage.rol0;
import defpackage.tpo0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.presentation.SettingsVisibilityTrackingKt$SettingsVisibilityTrackingBox$1$1", f = "SettingsVisibilityTracking.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SettingsVisibilityTrackingKt$SettingsVisibilityTrackingBox$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yx40 $scrollOffset$delegate;
    final /* synthetic */ oip0 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsVisibilityTrackingKt$SettingsVisibilityTrackingBox$1$1(oip0 oip0Var, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$scrollState = oip0Var;
        this.$scrollOffset$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsVisibilityTrackingKt$SettingsVisibilityTrackingBox$1$1(this.$scrollState, this.$scrollOffset$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsVisibilityTrackingKt$SettingsVisibilityTrackingBox$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new is6(this.$scrollState, 9));
            tpo0 tpo0Var = new tpo0(9, this.$scrollOffset$delegate);
            this.label = 1;
            if (o.collect(tpo0Var, this) == coroutineSingletons) {
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
