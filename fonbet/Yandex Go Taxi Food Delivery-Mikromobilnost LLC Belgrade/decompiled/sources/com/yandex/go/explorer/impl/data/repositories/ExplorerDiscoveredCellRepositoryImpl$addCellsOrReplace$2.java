package com.yandex.go.explorer.impl.data.repositories;

import defpackage.ito;
import defpackage.jto;
import defpackage.kto;
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
@mvg(c = "com.yandex.go.explorer.impl.data.repositories.ExplorerDiscoveredCellRepositoryImpl$addCellsOrReplace$2", f = "ExplorerDiscoveredCellRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerDiscoveredCellRepositoryImpl$addCellsOrReplace$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ito> $cells;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerDiscoveredCellRepositoryImpl$addCellsOrReplace$2(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cells = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerDiscoveredCellRepositoryImpl$addCellsOrReplace$2(this.this$0, this.$cells, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerDiscoveredCellRepositoryImpl$addCellsOrReplace$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kto ktoVar = this.this$0.a;
        List<ito> list = this.$cells;
        this.label = 1;
        Object c = androidx.room.util.a.c(new jto(ktoVar, list, 1), ktoVar.a, this, false, true);
        if (c != coroutineSingletons) {
            c = zy11Var;
        }
        return c == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
