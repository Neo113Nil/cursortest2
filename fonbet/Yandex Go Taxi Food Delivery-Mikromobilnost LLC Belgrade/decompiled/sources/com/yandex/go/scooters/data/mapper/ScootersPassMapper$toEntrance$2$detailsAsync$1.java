package com.yandex.go.scooters.data.mapper;

import defpackage.b3o;
import defpackage.b4o;
import defpackage.c3o;
import defpackage.f9s;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xdf;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lc3o;", "<anonymous>", "(Ltse;)Lc3o;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$toEntrance$2$detailsAsync$1", f = "ScootersPassMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$toEntrance$2$detailsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ b4o $this_toEntrance;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$toEntrance$2$detailsAsync$1(fef fefVar, b4o b4oVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$this_toEntrance = b4oVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = this.this$0;
        return new ScootersPassMapper$toEntrance$2$detailsAsync$1(this.$currencyRules, this.$this_toEntrance, dVar, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$toEntrance$2$detailsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        b4o b4oVar = this.$this_toEntrance;
        fef fefVar = this.$currencyRules;
        xdf xdfVar = dVar.c;
        b4o.b bVar = b4oVar.e;
        if (bVar == null) {
            return null;
        }
        FormattedText c = f9s.c(xdfVar, fefVar, bVar.a);
        FormattedText c2 = f9s.c(xdfVar, fefVar, bVar.b);
        List<b4o.b.a> list = bVar.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (b4o.b.a aVar : list) {
            arrayList.add(new b3o(aVar.b, f9s.c(xdfVar, fefVar, aVar.a)));
        }
        return new c3o(c, c2, arrayList);
    }
}
