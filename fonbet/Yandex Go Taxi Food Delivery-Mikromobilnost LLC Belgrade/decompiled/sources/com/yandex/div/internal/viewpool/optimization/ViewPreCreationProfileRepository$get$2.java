package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wfx;
import defpackage.wls;
import defpackage.yt31;
import defpackage.zt31;
import defpackage.zy11;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyt31;", "<anonymous>", "(Ltse;)Lyt31;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ViewPreCreationProfileRepository$get$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPreCreationProfileRepository$get$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewPreCreationProfileRepository$get$2 viewPreCreationProfileRepository$get$2 = new ViewPreCreationProfileRepository$get$2(this.this$0, this.$id, continuation);
        viewPreCreationProfileRepository$get$2.L$0 = obj;
        return viewPreCreationProfileRepository$get$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewPreCreationProfileRepository$get$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                String str = this.$id;
                WeakHashMap weakHashMap = a.c;
                Context context = aVar.a;
                WeakHashMap weakHashMap2 = a.c;
                Object obj2 = weakHashMap2.get(str);
                if (obj2 == null) {
                    String format = String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1));
                    zt31 zt31Var = zt31.b;
                    sjh sjhVar = uyj.a;
                    com.yandex.div.internal.storage.b bVar = new com.yandex.div.internal.storage.b(context, format, bvf0.a(mdh.b.plus(jl40.a())), zt31Var);
                    weakHashMap2.put(str, bVar);
                    obj2 = bVar;
                }
                gci0 gci0Var = ((com.yandex.div.internal.storage.b) obj2).f;
                this.label = 1;
                y = e.y(gci0Var, this);
                if (y == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                y = obj;
            }
            failure = (yt31) y;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            int i2 = wfx.a;
        }
        yt31 yt31Var = (yt31) (failure instanceof Result.Failure ? null : failure);
        if (yt31Var != null) {
            return yt31Var;
        }
        yt31 yt31Var2 = this.this$0.b;
        return new yt31(this.$id, yt31Var2.b, yt31Var2.c, yt31Var2.d, yt31Var2.e, yt31Var2.f, yt31Var2.g, yt31Var2.h, yt31Var2.i, yt31Var2.j, yt31Var2.k, yt31Var2.l, yt31Var2.m, yt31Var2.n, yt31Var2.o, yt31Var2.p, yt31Var2.q, yt31Var2.r, yt31Var2.s);
    }
}
