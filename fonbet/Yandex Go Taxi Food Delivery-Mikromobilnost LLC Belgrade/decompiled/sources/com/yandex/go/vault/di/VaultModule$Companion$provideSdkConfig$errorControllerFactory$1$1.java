package com.yandex.go.vault.di;

import defpackage.h3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q331;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.di.VaultModule$Companion$provideSdkConfig$errorControllerFactory$1$1", f = "VaultModule.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultModule$Companion$provideSdkConfig$errorControllerFactory$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ q331 $payload;
    final /* synthetic */ h3y $reloadDocumentInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultModule$Companion$provideSdkConfig$errorControllerFactory$1$1(h3y h3yVar, q331 q331Var, Continuation continuation) {
        super(2, continuation);
        this.$reloadDocumentInteractor = h3yVar;
        this.$payload = q331Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultModule$Companion$provideSdkConfig$errorControllerFactory$1$1(this.$reloadDocumentInteractor, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultModule$Companion$provideSdkConfig$errorControllerFactory$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.vault.domain.a aVar = (com.yandex.go.vault.domain.a) this.$reloadDocumentInteractor.get();
            String str = this.$payload.b;
            this.label = 1;
            if (aVar.a(str, this) == coroutineSingletons) {
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
