package com.yandex.go.antirobot;

import defpackage.hl2;
import defpackage.jl40;
import defpackage.ll2;
import defpackage.mvg;
import defpackage.nb20;
import defpackage.nl2;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wtq0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.antirobot.YandexAntirobotTokenRepository$tryToRefreshTokenIfNeed$2", f = "YandexAntirobotTokenRepository.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class YandexAntirobotTokenRepository$tryToRefreshTokenIfNeed$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexAntirobotTokenRepository$tryToRefreshTokenIfNeed$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YandexAntirobotTokenRepository$tryToRefreshTokenIfNeed$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YandexAntirobotTokenRepository$tryToRefreshTokenIfNeed$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.label = 1;
            obj = c.a(cVar, this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zy11 zy11Var = zy11.a;
        if (booleanValue) {
            wtq0 a = this.this$0.b.a();
            c cVar2 = this.this$0;
            if (a != null) {
                try {
                    cVar2.getClass();
                    if (a.b() + a.c() > cVar2.f.c().getTime()) {
                        cVar2.g.a(a.c() + a.b());
                        cVar2.h.set(new ll2(a.d()));
                        return zy11Var;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    nb20 nb20Var = cVar2.g;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    hl2 hl2Var = nb20Var.a;
                    hl2Var.getClass();
                    hl2Var.a("Antirobot.DeviceCheck.Failure", new Pair(Constants.KEY_MESSAGE, message));
                    AtomicReference atomicReference = cVar2.h;
                    if (a != null) {
                        atomicReference.set(new ll2(a.d()));
                    } else {
                        atomicReference.set(nl2.a);
                    }
                }
            }
            cVar2.g.a.a("Antirobot.DeviceCheck.Start", new Pair[0]);
            String h = cVar2.c.a().h();
            if (jl40.l(h, "err_safetynet_access")) {
                throw new IllegalStateException("Token loading error!");
            }
            c.b(cVar2);
            cVar2.h.set(new ll2(h));
            return zy11Var;
        }
        return zy11Var;
    }
}
