package com.yandex.go.scooters.data.mapper;

import defpackage.cbo0;
import defpackage.dbo0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.g590;
import defpackage.hbo0;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xdf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldbo0;", "<anonymous>", "(Ltse;)Ldbo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$buildMinutePackages$2$upsaleWindowAsync$1", f = "ScootersPassMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPassMapper$buildMinutePackages$2$upsaleWindowAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ g590 $packages;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$buildMinutePackages$2$upsaleWindowAsync$1(fef fefVar, g590 g590Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$packages = g590Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$buildMinutePackages$2$upsaleWindowAsync$1(this.$currencyRules, this.$packages, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$buildMinutePackages$2$upsaleWindowAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hbo0 hbo0Var = this.$packages.g;
        if (hbo0Var == null) {
            return null;
        }
        d dVar = this.this$0;
        fef fefVar = this.$currencyRules;
        dVar.getClass();
        String str = hbo0Var.a;
        hbo0.b bVar = hbo0Var.g;
        FormattedText formattedText = hbo0Var.b;
        xdf xdfVar = dVar.c;
        FormattedText c = f9s.c(xdfVar, fefVar, formattedText);
        FormattedText c2 = f9s.c(xdfVar, fefVar, hbo0Var.c);
        FormattedText c3 = f9s.c(xdfVar, fefVar, hbo0Var.d);
        String str2 = hbo0Var.e;
        hbo0.a aVar = hbo0Var.f;
        return new dbo0(str, c, c2, c3, str2, aVar != null ? new krl0(f9s.c(xdfVar, fefVar, aVar.a), aVar.b) : null, new cbo0(f9s.c(xdfVar, fefVar, bVar.a), f9s.c(xdfVar, fefVar, bVar.b), f9s.c(xdfVar, fefVar, bVar.c), f9s.c(xdfVar, fefVar, bVar.d)));
    }
}
