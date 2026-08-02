package com.yandex.go.external_service.preloader.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.preloader.data.StaticRepository$preload$2", f = "StaticRepository.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class StaticRepository$preload$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $urls;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticRepository$preload$2(b bVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$urls = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StaticRepository$preload$2 staticRepository$preload$2 = new StaticRepository$preload$2(this.this$0, this.$urls, continuation);
        staticRepository$preload$2.L$0 = obj;
        return staticRepository$preload$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StaticRepository$preload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Iterator it;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            p4j0 p4j0Var = this.this$0.a;
            int d = y6i0.d(p4j0Var.c, 1, this.$urls.size());
            ArrayList F = kotlin.collections.a.F(this.$urls, d);
            bVar = this.this$0;
            it = F.iterator();
            i = d;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$3;
            bVar = (b) this.L$2;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            this.L$0 = tseVar;
            this.L$1 = null;
            this.L$2 = bVar;
            this.L$3 = it;
            this.L$4 = null;
            this.L$5 = null;
            this.I$0 = i;
            this.label = 1;
            if (b.a(bVar, tseVar, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
