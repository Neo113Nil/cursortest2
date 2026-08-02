package com.yandex.go.scooters.data.mapper;

import defpackage.f9s;
import defpackage.fef;
import defpackage.mvg;
import defpackage.n2p0;
import defpackage.ny61;
import defpackage.o2p0;
import defpackage.p0p0;
import defpackage.p2p0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xdf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lp2p0;", "<anonymous>", "(Ltse;)Lp2p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$whenSuperPassesAvailableOnly$2$upsaleWindow$1$1", f = "ScootersPassMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPassMapper$whenSuperPassesAvailableOnly$2$upsaleWindow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ p0p0 $it;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$whenSuperPassesAvailableOnly$2$upsaleWindow$1$1(d dVar, p0p0 p0p0Var, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$it = p0p0Var;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$whenSuperPassesAvailableOnly$2$upsaleWindow$1$1(this.this$0, this.$it, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$whenSuperPassesAvailableOnly$2$upsaleWindow$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        o2p0 o2p0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        p0p0 p0p0Var = this.$it;
        fef fefVar = this.$currencyRules;
        dVar.getClass();
        String str = p0p0Var.a;
        p0p0.a aVar = p0p0Var.g;
        FormattedText formattedText = p0p0Var.b;
        xdf xdfVar = dVar.c;
        FormattedText c = f9s.c(xdfVar, fefVar, formattedText);
        FormattedText c2 = f9s.c(xdfVar, fefVar, p0p0Var.c);
        FormattedText c3 = f9s.c(xdfVar, fefVar, p0p0Var.d);
        String str2 = p0p0Var.e;
        p0p0.b bVar = p0p0Var.f;
        if (bVar != null) {
            o2p0Var = new o2p0(bVar.b, f9s.c(xdfVar, fefVar, bVar.a));
        }
        return new p2p0(str, c, c2, c3, str2, o2p0Var, new n2p0(f9s.c(xdfVar, fefVar, aVar.a), f9s.c(xdfVar, fefVar, aVar.b), f9s.c(xdfVar, fefVar, aVar.c), f9s.c(xdfVar, fefVar, aVar.d)));
    }
}
