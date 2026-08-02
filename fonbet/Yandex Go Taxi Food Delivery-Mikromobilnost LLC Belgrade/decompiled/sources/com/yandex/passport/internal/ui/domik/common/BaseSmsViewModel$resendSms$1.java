package com.yandex.passport.internal.ui.domik.common;

import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.bouncer.error.n;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.usecase.ui.h0;
import com.yandex.passport.internal.usecase.ui.i0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.common.BaseSmsViewModel$resendSms$1", f = "BaseSmsViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseSmsViewModel$resendSms$1 extends SuspendLambda implements wls {
    final /* synthetic */ BaseTrack $authTrack;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSmsViewModel$resendSms$1(e eVar, BaseTrack baseTrack, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$authTrack = baseTrack;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseSmsViewModel$resendSms$1(this.this$0, this.$authTrack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSmsViewModel$resendSms$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            final e eVar = this.this$0;
            i0 i0Var = eVar.B;
            final int i3 = 0;
            final int i4 = 2;
            h0 h0Var = new h0(this.$authTrack, null, eVar instanceof com.yandex.passport.internal.ui.domik.smsauth.b, new n(3, eVar), new tls() { // from class: com.yandex.passport.internal.ui.domik.common.d
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    e eVar2 = eVar;
                    switch (i5) {
                        case 0:
                            eVar2.a0((BaseTrack) obj2);
                            break;
                        case 1:
                            eVar2.b.m((EventError) obj2);
                            break;
                        default:
                            eVar2.W(((Boolean) obj2).booleanValue());
                            break;
                    }
                    return zy11Var;
                }
            }, new tls() { // from class: com.yandex.passport.internal.ui.domik.common.d
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i5 = i2;
                    zy11 zy11Var = zy11.a;
                    e eVar2 = eVar;
                    switch (i5) {
                        case 0:
                            eVar2.a0((BaseTrack) obj2);
                            break;
                        case 1:
                            eVar2.b.m((EventError) obj2);
                            break;
                        default:
                            eVar2.W(((Boolean) obj2).booleanValue());
                            break;
                    }
                    return zy11Var;
                }
            }, new tls() { // from class: com.yandex.passport.internal.ui.domik.common.d
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    e eVar2 = eVar;
                    switch (i5) {
                        case 0:
                            eVar2.a0((BaseTrack) obj2);
                            break;
                        case 1:
                            eVar2.b.m((EventError) obj2);
                            break;
                        default:
                            eVar2.W(((Boolean) obj2).booleanValue());
                            break;
                    }
                    return zy11Var;
                }
            });
            this.label = 1;
            if (i0Var.a(h0Var, this) == coroutineSingletons) {
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
