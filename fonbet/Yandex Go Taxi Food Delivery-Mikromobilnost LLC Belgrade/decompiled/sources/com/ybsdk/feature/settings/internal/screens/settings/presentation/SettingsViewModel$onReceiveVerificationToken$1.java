package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.pz40;
import defpackage.tse;
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
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$onReceiveVerificationToken$1", f = "SettingsViewModel.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$onReceiveVerificationToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$onReceiveVerificationToken$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$onReceiveVerificationToken$1(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsViewModel$onReceiveVerificationToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            o8r0 o8r0Var = ((wdr0) this.this$0.X()).c;
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, wdr0.a((wdr0) value, null, null, null, null, false, null, null, null, null, false, 4091)));
            String str = this.$verificationToken;
            if (str == null || o8r0Var == null) {
                this.this$0.e0(true);
            } else {
                a aVar = this.this$0;
                this.label = 1;
                if (aVar.c0(o8r0Var, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
