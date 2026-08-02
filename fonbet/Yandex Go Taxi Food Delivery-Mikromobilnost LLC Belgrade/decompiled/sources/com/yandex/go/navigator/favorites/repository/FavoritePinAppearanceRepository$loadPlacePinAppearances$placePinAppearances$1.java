package com.yandex.go.navigator.favorites.repository;

import defpackage.ie61;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lmub0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.repository.FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1", f = "FavoritePinAppearanceRepository.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<ie61> $zoomAppearanceList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$zoomAppearanceList = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1 favoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1 = new FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1(this.$zoomAppearanceList, this.this$0, continuation);
        favoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1.L$0 = obj;
        return favoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<ie61> list = this.$zoomAppearanceList;
            a aVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (ie61 ie61Var : list) {
                aVar.c.getClass();
                sjh sjhVar = uyj.a;
                arrayList.add(tje.h(tseVar, mdh.b, null, new FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1$1$1(aVar, ie61Var, null), 2));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
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
        return kotlin.collections.a.M((Iterable) obj);
    }
}
