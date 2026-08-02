package com.yandex.go.navigator.favorites.repository;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.repository.FavoritePlacesRepository$refresh$2", f = "FavoritePlacesRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FavoritePlacesRepository$refresh$2 extends SuspendLambda implements wls {
    final /* synthetic */ RefreshType $refreshType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.favorites.repository.FavoritePlacesRepository$refresh$2$1", f = "FavoritePlacesRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.favorites.repository.FavoritePlacesRepository$refresh$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ RefreshType $refreshType;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, RefreshType refreshType, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$refreshType = refreshType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$refreshType, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                RefreshType refreshType = this.$refreshType;
                this.label = 1;
                if (b.a(bVar, refreshType, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.this$0.i = null;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritePlacesRepository$refresh$2(b bVar, RefreshType refreshType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$refreshType = refreshType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FavoritePlacesRepository$refresh$2 favoritePlacesRepository$refresh$2 = new FavoritePlacesRepository$refresh$2(this.this$0, this.$refreshType, continuation);
        favoritePlacesRepository$refresh$2.L$0 = obj;
        return favoritePlacesRepository$refresh$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FavoritePlacesRepository$refresh$2 favoritePlacesRepository$refresh$2 = (FavoritePlacesRepository$refresh$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        favoritePlacesRepository$refresh$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        RefreshType refreshType = this.$refreshType;
        bVar.d.getClass();
        sjh sjhVar = uyj.a;
        bVar.i = new Pair(refreshType, tje.N(tseVar, mdh.b, null, new AnonymousClass1(this.this$0, this.$refreshType, null), 2));
        return zy11.a;
    }
}
