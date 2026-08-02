package com.yandex.go.scooters.data.mapper;

import defpackage.f9s;
import defpackage.fef;
import defpackage.i8w0;
import defpackage.jfo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s6k0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u1p0;
import defpackage.v1p0;
import defpackage.w1p0;
import defpackage.wls;
import defpackage.x1p0;
import defpackage.xdf;
import defpackage.y8o0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx1p0;", "<anonymous>", "(Ltse;)Lx1p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$whenSuperPassesAvailableOnly$2$purchaseWindow$1", f = "ScootersPassMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersPassMapper$whenSuperPassesAvailableOnly$2$purchaseWindow$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ i8w0 $superPasses;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$whenSuperPassesAvailableOnly$2$purchaseWindow$1(fef fefVar, i8w0 i8w0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$superPasses = i8w0Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$whenSuperPassesAvailableOnly$2$purchaseWindow$1(this.$currencyRules, this.$superPasses, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$whenSuperPassesAvailableOnly$2$purchaseWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        FormattedText formattedText;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jfo0 jfo0Var = this.$superPasses.e;
        if (jfo0Var == null) {
            return null;
        }
        d dVar = this.this$0;
        fef fefVar = this.$currencyRules;
        dVar.getClass();
        FormattedText formattedText2 = jfo0Var.a;
        FormattedText formattedText3 = jfo0Var.b;
        xdf xdfVar = dVar.c;
        List list = jfo0Var.c;
        if (list == null) {
            arrayList = null;
        } else {
            List<jfo0.a> list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            for (jfo0.a aVar : list2) {
                FormattedText c = f9s.c(xdfVar, fefVar, aVar.a);
                FormattedText formattedText4 = aVar.b;
                arrayList.add(new u1p0(aVar.c, c, formattedText4 != null ? f9s.c(xdfVar, fefVar, formattedText4) : null));
            }
        }
        jfo0.b bVar = jfo0Var.d;
        FormattedText formattedText5 = bVar.a;
        FormattedText formattedText6 = bVar.b;
        List list3 = bVar.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            jfo0.b.a aVar2 = (jfo0.b.a) it.next();
            String str = aVar2.a;
            jfo0.b.a.C0097a c0097a = aVar2.f;
            FormattedText c2 = f9s.c(xdfVar, fefVar, aVar2.b);
            FormattedText formattedText7 = aVar2.c;
            FormattedText c3 = formattedText7 != null ? f9s.c(xdfVar, fefVar, formattedText7) : null;
            Iterator it2 = it;
            FormattedText c4 = f9s.c(xdfVar, fefVar, aVar2.d);
            FormattedText formattedText8 = aVar2.e;
            FormattedText c5 = formattedText8 != null ? f9s.c(xdfVar, fefVar, formattedText8) : null;
            FormattedText formattedText9 = c3;
            FormattedText c6 = f9s.c(xdfVar, fefVar, c0097a.a);
            FormattedText formattedText10 = c0097a.b;
            y8o0 y8o0Var = new y8o0(c6, formattedText10 != null ? f9s.c(xdfVar, fefVar, formattedText10) : null);
            Integer num = aVar2.h;
            fef fefVar2 = fefVar;
            jfo0.b.a.c cVar = aVar2.i;
            if (cVar == null || (formattedText = cVar.a) == null) {
                formattedText = FormattedText.c;
            }
            arrayList2.add(new w1p0(str, c2, formattedText9, c4, c5, y8o0Var, num, new v1p0(cVar != null ? cVar.b : null, formattedText), aVar2.j));
            it = it2;
            fefVar = fefVar2;
        }
        return new x1p0(formattedText2, formattedText3, arrayList, new s6k0(formattedText5, formattedText6, arrayList2));
    }
}
