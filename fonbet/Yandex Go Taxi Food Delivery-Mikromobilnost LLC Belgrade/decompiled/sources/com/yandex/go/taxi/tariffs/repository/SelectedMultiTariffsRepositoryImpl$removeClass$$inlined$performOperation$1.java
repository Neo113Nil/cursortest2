package com.yandex.go.taxi.tariffs.repository;

import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1", f = "SelectedMultiTariffsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $tariffClass$inlined;
    final /* synthetic */ String $verticalId;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(g gVar, String str, Continuation continuation, String str2) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$verticalId = str;
        this.$tariffClass$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(this.this$0, this.$verticalId, continuation, this.$tariffClass$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1 selectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1 = (SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        selectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.d;
        String str = this.$verticalId;
        do {
            value = r0Var.getValue();
            map = (Map) value;
        } while (!r0Var.k(value, kotlin.collections.b.n(map, gw00.e(new Pair(str, v4r0.f((Set) map.getOrDefault(str, EmptySet.a), this.$tariffClass$inlined))))));
        return zy11.a;
    }
}
