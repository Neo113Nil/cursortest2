package com.yandex.go.navigator.favorites;

import defpackage.a4c0;
import defpackage.biq0;
import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ugp;
import defpackage.wls;
import defpackage.xm00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lugp;", "it", "Lzy11;", "<anonymous>", "(Lugp;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.FavoritesPinsController$listenSelectedPlace$1", f = "FavoritesPinsController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FavoritesPinsController$listenSelectedPlace$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesPinsController$listenSelectedPlace$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoritesPinsController$listenSelectedPlace$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FavoritesPinsController$listenSelectedPlace$1 favoritesPinsController$listenSelectedPlace$1 = (FavoritesPinsController$listenSelectedPlace$1) create((ugp) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        favoritesPinsController$listenSelectedPlace$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f4c0 f4c0Var;
        xm00 xm00Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        Pair pair = fVar.n;
        if (pair != null) {
            ugp ugpVar = (ugp) pair.getFirst();
            biq0 biq0Var = (biq0) pair.getSecond();
            if (biq0Var != null) {
                xm00 xm00Var2 = fVar.k;
                if (xm00Var2 != null) {
                    xm00Var2.o(biq0Var.a);
                }
                f4c0 f4c0Var2 = biq0Var.b;
                if (f4c0Var2 != null && (xm00Var = fVar.k) != null) {
                    xm00Var.o(f4c0Var2);
                }
            }
            fVar.n = null;
            a4c0 a4c0Var = (a4c0) fVar.l.get(ugpVar);
            if (a4c0Var != null && (f4c0Var = a4c0Var.a) != null) {
                f4c0Var.i(!((Boolean) fVar.c.h()).booleanValue());
            }
        }
        return zy11.a;
    }
}
