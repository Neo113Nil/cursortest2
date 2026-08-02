package com.yandex.go.tariffcard.ui.adapter.header.multiclass;

import defpackage.i5l0;
import defpackage.l5l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o68;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lp68;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.adapter.header.multiclass.RoutesConverter$createRoutesState$2$cars$1$1$1", f = "RoutesConverter.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoutesConverter$createRoutesState$2$cars$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $getCarDrawable;
    final /* synthetic */ int $i;
    final /* synthetic */ List<l5l0> $layers;
    final /* synthetic */ String $tariffClass;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutesConverter$createRoutesState$2$cars$1$1$1(List list, int i, wls wlsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$layers = list;
        this.$i = i;
        this.$getCarDrawable = wlsVar;
        this.$tariffClass = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoutesConverter$createRoutesState$2$cars$1$1$1(this.$layers, this.$i, this.$getCarDrawable, this.$tariffClass, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoutesConverter$createRoutesState$2$cars$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List a = this.$layers.get(this.$i).a();
        String str = this.$tariffClass;
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(new i5l0(str, (o68) it.next()));
        }
        wls wlsVar = this.$getCarDrawable;
        this.label = 1;
        Object a2 = a.a.a(arrayList, wlsVar, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
