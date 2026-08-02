package com.yandex.go.flex.common.utils;

import defpackage.d6x;
import defpackage.j5x;
import defpackage.k6x;
import defpackage.kn2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld6x;", "<anonymous>", "(Ltse;)Ld6x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.utils.JasonStatePatcherImpl$patch$2", f = "JasonStatePatcherImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class JasonStatePatcherImpl$patch$2 extends SuspendLambda implements wls {
    final /* synthetic */ d6x $patchState;
    final /* synthetic */ List<Pair<List<Object>, j5x>> $pathsToNodes;
    final /* synthetic */ k6x $store;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JasonStatePatcherImpl$patch$2(k6x k6xVar, List list, d6x d6xVar, Continuation continuation) {
        super(2, continuation);
        this.$store = k6xVar;
        this.$pathsToNodes = list;
        this.$patchState = d6xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JasonStatePatcherImpl$patch$2(this.$store, this.$pathsToNodes, this.$patchState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JasonStatePatcherImpl$patch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return this.$store.d(new kn2(14, this.$pathsToNodes, this.$patchState));
    }
}
