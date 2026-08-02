package com.yandex.go.places.impl.ui.main.map.filters;

import defpackage.f2t;
import defpackage.g2t;
import defpackage.g6c0;
import defpackage.ksw;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$renderHeader$1", f = "PlacesCategoryFiltersPresenter.kt", l = {346, 347, 349}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesCategoryFiltersPresenter$renderHeader$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersPresenter$renderHeader$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesCategoryFiltersPresenter$renderHeader$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesCategoryFiltersPresenter$renderHeader$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        ksw kswVar;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.map.map_as_main_places.b bVar = this.this$0.I;
            this.label = 1;
            obj = bVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$0;
                    kotlin.b.b(obj);
                    list = ((g2t) obj).a.a.c;
                    if (list != null && (kswVar = (ksw) kotlin.collections.a.R(list)) != null && (str2 = kswVar.g) != null) {
                        ((g6c0) this.this$0.Dg()).Ff(str, str2);
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                String str3 = (String) obj;
                mth mthVar = ((f2t) this.this$0.N).h;
                this.L$0 = str3;
                this.label = 3;
                Object y = kotlinx.coroutines.flow.e.y(mthVar, this);
                if (y != coroutineSingletons) {
                    str = str3;
                    obj = y;
                    list = ((g2t) obj).a.a.c;
                    if (list != null) {
                        ((g6c0) this.this$0.Dg()).Ff(str, str2);
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            com.yandex.go.places.experiments.map.map_as_main_places.b bVar2 = this.this$0.I;
            this.label = 2;
            obj = bVar2.a(this);
        }
        return zy11.a;
    }
}
