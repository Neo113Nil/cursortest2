package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import defpackage.j59;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.v7r0;
import defpackage.wdr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$toggleShowSpoilerOnLaunchSetting$1", f = "SettingsViewModel.kt", l = {MSException.ERROR_NO_MORE_ITEMS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$toggleShowSpoilerOnLaunchSetting$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$toggleShowSpoilerOnLaunchSetting$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$toggleShowSpoilerOnLaunchSetting$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsViewModel$toggleShowSpoilerOnLaunchSetting$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            v7r0 v7r0Var = (v7r0) ((wdr0) this.this$0.X()).a.a();
            if (v7r0Var != null && v7r0Var.a()) {
                j59 a = this.this$0.C.a();
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wdr0.a((wdr0) value, null, null, null, null, false, null, null, null, a, false, 3583)));
                return zy11.a;
            }
            com.ybsdk.feature.settings.internal.domain.security.a aVar = this.this$0.I;
            this.label = 1;
            obj = aVar.b(v7r0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        j59 j59Var = (j59) obj;
        pz40 Y2 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, wdr0.a((wdr0) value2, null, null, null, null, false, null, j59Var, null, null, false, 4031)));
        return zy11.a;
    }
}
