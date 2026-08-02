package com.yandex.passport.internal.ui.authbytrack;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.TrackId;
import com.yandex.passport.internal.usecase.authorize.g;
import com.yandex.passport.internal.usecase.authorize.h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.authbytrack.AuthByTrackViewModel$authorizeByTrackId$1", f = "AuthByTrackViewModel.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthByTrackViewModel$authorizeByTrackId$1 extends SuspendLambda implements wls {
    final /* synthetic */ TrackId $trackId;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthByTrackViewModel$authorizeByTrackId$1(f fVar, TrackId trackId, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$trackId = trackId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthByTrackViewModel$authorizeByTrackId$1(this.this$0, this.$trackId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthByTrackViewModel$authorizeByTrackId$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.A;
            g gVar = new g(this.$trackId);
            this.label = 1;
            obj = hVar.a(gVar, this);
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
        Object value = ((Result) obj).getValue();
        f fVar = this.this$0;
        if (!(value instanceof Result.Failure)) {
            fVar.B.m((ModernAccount) value);
        }
        f fVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error authorize by track", a);
            }
            fVar2.b.m(fVar2.C.a(a));
        }
        return zy11.a;
    }
}
