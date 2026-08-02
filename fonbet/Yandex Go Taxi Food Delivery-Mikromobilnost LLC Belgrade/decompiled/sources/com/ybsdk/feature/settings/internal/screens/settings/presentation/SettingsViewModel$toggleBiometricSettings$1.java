package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import defpackage.j59;
import defpackage.mvg;
import defpackage.nw70;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$toggleBiometricSettings$1", f = "SettingsViewModel.kt", l = {222, 225}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$toggleBiometricSettings$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$toggleBiometricSettings$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$toggleBiometricSettings$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsViewModel$toggleBiometricSettings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r2 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r2 == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            nw70 nw70Var = this.this$0.F;
            this.label = 1;
            Object c = ((com.ybsdk.feature.pin.internal.a) nw70Var.b).c(this);
            if (c != coroutineSingletons) {
                c = zy11Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                b = obj;
                j59 j59Var = (j59) b;
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wdr0.a((wdr0) value, null, null, null, null, false, null, j59Var, null, null, false, 4031)));
                return zy11Var;
            }
            b.b(obj);
        }
        this.this$0.H.a.S.a.a("disable_biometry.done", null);
        a aVar = this.this$0;
        com.ybsdk.feature.settings.internal.domain.security.a aVar2 = aVar.I;
        v7r0 v7r0Var = (v7r0) ((wdr0) aVar.X()).a.a();
        this.label = 2;
        b = aVar2.b(v7r0Var, this);
    }
}
