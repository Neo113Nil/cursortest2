package com.yandex.go.messenger_native;

import com.yandex.go.messenger_native.api.NativeMessengerConnectionStatus;
import com.yandex.messaging.sync.CrossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1;
import defpackage.g92;
import defpackage.jb7;
import defpackage.kse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z8g;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.messenger_native.NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1", f = "NativeMessengerDelegateImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1(Continuation continuation, d dVar) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1 nativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1 = new NativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        nativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        nativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return nativeMessengerDelegateImpl$connectionStatusFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) obj2).booleanValue()) {
                jb7 jb7Var = new jb7(this.this$0.a);
                ((z8g) jb7Var.k()).a().reportEvent("tech_connection_status");
                z8g z8gVar = (z8g) jb7Var.k();
                g92Var = new c(e.F(e.X(((com.yandex.messaging.profile.d) z8gVar.S.get()).b(), new CrossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1(3, null)), ((kse) z8gVar.f.get()).b), this.this$0.b);
            } else {
                g92Var = new g92(2, NativeMessengerConnectionStatus.FAILED);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
