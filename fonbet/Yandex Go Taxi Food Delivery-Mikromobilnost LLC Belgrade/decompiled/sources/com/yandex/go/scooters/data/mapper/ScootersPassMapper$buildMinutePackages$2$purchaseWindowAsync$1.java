package com.yandex.go.scooters.data.mapper;

import defpackage.b9o0;
import defpackage.f9o0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.g590;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8o0;
import defpackage.r9o0;
import defpackage.s8o0;
import defpackage.t8o0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u8o0;
import defpackage.v8o0;
import defpackage.v9o0;
import defpackage.w511;
import defpackage.w8o0;
import defpackage.w9o0;
import defpackage.wls;
import defpackage.x8o0;
import defpackage.xdf;
import defpackage.y8o0;
import defpackage.z8o0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lb9o0;", "<anonymous>", "(Ltse;)Lb9o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$buildMinutePackages$2$purchaseWindowAsync$1", f = "ScootersPassMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPassMapper$buildMinutePackages$2$purchaseWindowAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ g590 $packages;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$buildMinutePackages$2$purchaseWindowAsync$1(fef fefVar, g590 g590Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$packages = g590Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$buildMinutePackages$2$purchaseWindowAsync$1(this.$currencyRules, this.$packages, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$buildMinutePackages$2$purchaseWindowAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u8o0 u8o0Var;
        x8o0 v8o0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f9o0 f9o0Var = this.$packages.f;
        if (f9o0Var == null) {
            return null;
        }
        d dVar = this.this$0;
        fef fefVar = this.$currencyRules;
        dVar.getClass();
        FormattedText formattedText = f9o0Var.a;
        xdf xdfVar = dVar.c;
        FormattedText c = f9s.c(xdfVar, fefVar, formattedText);
        FormattedText c2 = f9s.c(xdfVar, fefVar, f9o0Var.b);
        f9o0.a aVar = f9o0Var.c;
        r8o0 r8o0Var = aVar != null ? new r8o0(aVar.b, f9s.c(xdfVar, fefVar, aVar.a)) : null;
        f9o0.e eVar = f9o0Var.d;
        String str = eVar != null ? eVar.a : null;
        f9o0.b bVar = f9o0Var.e;
        s8o0 s8o0Var = bVar != null ? new s8o0(f9s.c(xdfVar, fefVar, bVar.a), f9s.c(xdfVar, fefVar, bVar.b)) : null;
        List<f9o0.d> list = f9o0Var.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (f9o0.d dVar2 : list) {
            String str2 = dVar2.a;
            FormattedText c3 = f9s.c(xdfVar, fefVar, dVar2.b);
            FormattedText c4 = f9s.c(xdfVar, fefVar, dVar2.c);
            w9o0 w9o0Var = dVar2.d;
            if (w9o0Var instanceof v9o0) {
                v8o0Var = new w8o0(f9s.c(xdfVar, fefVar, ((v9o0) w9o0Var).a));
            } else {
                if (!(w9o0Var instanceof r9o0)) {
                    w511.b();
                    return null;
                }
                f9o0.a aVar2 = ((r9o0) w9o0Var).a;
                v8o0Var = new v8o0(new r8o0(aVar2.b, f9s.c(xdfVar, fefVar, aVar2.a)));
            }
            FormattedText c5 = f9s.c(xdfVar, fefVar, dVar2.e);
            f9o0.d.a aVar3 = dVar2.f;
            arrayList.add(new z8o0(str2, c3, c4, v8o0Var, c5, new y8o0(f9s.c(xdfVar, fefVar, aVar3.a), f9s.c(xdfVar, fefVar, aVar3.b))));
        }
        f9o0.c cVar = f9o0Var.g;
        if (cVar != null) {
            FormattedText c6 = f9s.c(xdfVar, fefVar, cVar.a);
            FormattedText c7 = f9s.c(xdfVar, fefVar, cVar.b);
            List<f9o0.c.a> list2 = cVar.c;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (f9o0.c.a aVar4 : list2) {
                arrayList2.add(new t8o0(aVar4.c, f9s.c(xdfVar, fefVar, aVar4.a), f9s.c(xdfVar, fefVar, aVar4.b)));
            }
            u8o0Var = new u8o0(c6, c7, arrayList2);
        } else {
            u8o0Var = null;
        }
        return new b9o0(c, c2, r8o0Var, str, s8o0Var, arrayList, u8o0Var);
    }
}
