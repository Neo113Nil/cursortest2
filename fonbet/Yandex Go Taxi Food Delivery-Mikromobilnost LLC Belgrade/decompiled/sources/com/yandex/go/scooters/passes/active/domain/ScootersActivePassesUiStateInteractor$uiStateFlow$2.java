package com.yandex.go.scooters.passes.active.domain;

import defpackage.irm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p20;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.uqm0;
import defpackage.vqm0;
import defpackage.w20;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lw20;", "activePassesInfo", "Lirm0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lw20;)Lirm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.domain.ScootersActivePassesUiStateInteractor$uiStateFlow$2", f = "ScootersActivePassesUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersActivePassesUiStateInteractor$uiStateFlow$2 scootersActivePassesUiStateInteractor$uiStateFlow$2 = new ScootersActivePassesUiStateInteractor$uiStateFlow$2(3, (Continuation) obj3);
        scootersActivePassesUiStateInteractor$uiStateFlow$2.L$0 = (w20) obj2;
        return scootersActivePassesUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w20 w20Var = (w20) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ListBuilder a = rcc.a();
        a.add(new vqm0(w20Var.a));
        CharSequence charSequence = w20Var.b;
        if (charSequence != null) {
            a.add(new vqm0(charSequence));
        }
        List<p20> list = w20Var.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (p20 p20Var : list) {
            arrayList.add(new uqm0(p20Var.a, p20Var.b, p20Var.c));
        }
        a.addAll(arrayList);
        return new irm0(a.j());
    }
}
