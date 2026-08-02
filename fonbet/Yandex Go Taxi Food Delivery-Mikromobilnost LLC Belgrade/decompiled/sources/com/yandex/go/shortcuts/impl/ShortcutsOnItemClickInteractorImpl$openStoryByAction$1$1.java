package com.yandex.go.shortcuts.impl;

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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.ShortcutsOnItemClickInteractorImpl$openStoryByAction$1$1", f = "ShortcutsOnItemClickInteractorImpl.kt", l = {HProv.ALG_SID_SHA_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShortcutsOnItemClickInteractorImpl$openStoryByAction$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onDismissAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsOnItemClickInteractorImpl$openStoryByAction$1$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$onDismissAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutsOnItemClickInteractorImpl$openStoryByAction$1$1(this.$onDismissAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutsOnItemClickInteractorImpl$openStoryByAction$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar = this.$onDismissAction;
            this.label = 1;
            if (tlsVar.invoke(this) == coroutineSingletons) {
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
