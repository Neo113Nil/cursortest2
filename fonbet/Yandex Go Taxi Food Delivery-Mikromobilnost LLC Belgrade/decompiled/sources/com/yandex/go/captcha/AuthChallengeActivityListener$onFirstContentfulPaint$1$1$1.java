package com.yandex.go.captcha;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import com.yandex.go.captcha.api.AuthChallengeResult;
import defpackage.bi3;
import defpackage.g6u;
import defpackage.ki3;
import defpackage.lso;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.captcha.AuthChallengeActivityListener$onFirstContentfulPaint$1$1$1", f = "AuthChallengeActivityListener.kt", l = {HProv.ALG_SID_SHA3_224, 169}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AuthChallengeActivityListener$onFirstContentfulPaint$1$1$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthChallengeActivityListener$onFirstContentfulPaint$1$1$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthChallengeActivityListener$onFirstContentfulPaint$1$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthChallengeActivityListener$onFirstContentfulPaint$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (androidx.lifecycle.m0.a(r5, r6, r9, r8, r9, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r13 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.antirobot.experiment.b bVar = this.this$0.e;
            this.label = 1;
            obj = bVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        lso lsoVar = (lso) obj;
        d dVar = this.this$0;
        Lifecycle lifecycle = dVar.i;
        AtomicBoolean atomicBoolean = dVar.j;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a.x;
        boolean G = g6uVar.G(get_context());
        if (!G) {
            if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                boolean g = dVar.d.g();
                if (g) {
                    AuthChallengeResult authChallengeResult = AuthChallengeResult.AlreadyDone;
                    atomicBoolean.set(false);
                    dVar.a.a(authChallengeResult);
                }
                if (!g && !atomicBoolean.getAndSet(true)) {
                    d.d(dVar, new ki3(lsoVar.a, lsoVar.b, lsoVar.c));
                }
                return zy11.a;
            }
        }
        bi3 bi3Var = new bi3(dVar, lsoVar);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.Z$0 = G;
        this.label = 2;
    }
}
