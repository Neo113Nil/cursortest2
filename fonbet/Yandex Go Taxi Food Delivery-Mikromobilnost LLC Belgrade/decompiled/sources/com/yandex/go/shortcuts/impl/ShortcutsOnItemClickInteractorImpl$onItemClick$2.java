package com.yandex.go.shortcuts.impl;

import com.yandex.go.shortcuts.models.LoadingMode;
import defpackage.j0s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yyr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.ShortcutsOnItemClickInteractorImpl$onItemClick$2", f = "ShortcutsOnItemClickInteractorImpl.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShortcutsOnItemClickInteractorImpl$onItemClick$2 extends SuspendLambda implements tls {
    final /* synthetic */ yyr0 $baseModel;
    final /* synthetic */ LoadingMode $loadingMode;
    final /* synthetic */ j0s0 $shortcutLoadingListener;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsOnItemClickInteractorImpl$onItemClick$2(b bVar, LoadingMode loadingMode, yyr0 yyr0Var, j0s0 j0s0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$loadingMode = loadingMode;
        this.$baseModel = yyr0Var;
        this.$shortcutLoadingListener = j0s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ShortcutsOnItemClickInteractorImpl$onItemClick$2(this.this$0, this.$loadingMode, this.$baseModel, this.$shortcutLoadingListener, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ShortcutsOnItemClickInteractorImpl$onItemClick$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            LoadingMode loadingMode = this.$loadingMode;
            yyr0 yyr0Var = this.$baseModel;
            j0s0 j0s0Var = this.$shortcutLoadingListener;
            this.label = 1;
            if (bVar.c(loadingMode, yyr0Var, j0s0Var, this) == coroutineSingletons) {
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
