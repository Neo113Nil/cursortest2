package com.yandex.go.taxi.order.details.v2.state.elements.status;

import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.go.slot.dto.SlotItemLineDto;
import defpackage.bss0;
import defpackage.css0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.irs0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrs0;
import defpackage.rnk0;
import defpackage.scc;
import defpackage.w511;
import defpackage.wls;
import defpackage.xrs0;
import defpackage.yrs0;
import defpackage.zrs0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timerString", "Lrnk0;", "<anonymous>", "(Ljava/lang/String;)Lrnk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.status.RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2", f = "RideCardStatusItemDataSource.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<SlotItemBodyDto> $body;
    final /* synthetic */ fef $currencyRules;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2(List list, a aVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$body = list;
        this.this$0 = aVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2 rideCardStatusItemDataSource$getBodyDescriptionStateFlow$2 = new RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2(this.$body, this.this$0, this.$currencyRules, continuation);
        rideCardStatusItemDataSource$getBodyDescriptionStateFlow$2.L$0 = obj;
        return rideCardStatusItemDataSource$getBodyDescriptionStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardStatusItemDataSource$getBodyDescriptionStateFlow$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        String b;
        String str;
        String obj2;
        String obj3;
        String str2 = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str3 = null;
        if (i == 0) {
            b.b(obj);
            List<SlotItemBodyDto> list2 = this.$body;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                loop2: while (it.hasNext()) {
                    List list3 = ((SlotItemBodyDto) it.next()).a;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            FormattedText formattedText = ((SlotItemLineDto) it2.next()).c;
                            if (formattedText != null && (list = formattedText.a) != null) {
                                List<o> list4 = list;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    for (o oVar : list4) {
                                        if ((oVar instanceof FormattedText.h) && evu0.y(((FormattedText.h) oVar).a, "$TIMER$", false)) {
                                            b = this.this$0.c.b(str2);
                                            break loop2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b = null;
            irs0 irs0Var = this.this$0.a;
            ArrayList b2 = qrs0.b("$TIMER$", str2, this.$body);
            fef fefVar = this.$currencyRules;
            this.L$0 = null;
            this.L$1 = b;
            this.label = 1;
            Object k = ((com.yandex.go.slot.mapper.a) irs0Var).k(b2, fefVar, this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = b;
            obj = k;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            b.b(obj);
        }
        css0 css0Var = (css0) obj;
        a aVar = this.this$0;
        Regex regex = a.f;
        aVar.getClass();
        if (str != null && !evu0.J(str)) {
            if (jl40.l(css0Var, yrs0.a)) {
                str3 = str;
            } else if (css0Var instanceof zrs0) {
                bss0 bss0Var = ((zrs0) css0Var).a;
                CharSequence charSequence = bss0Var.a;
                if (charSequence != null && (obj3 = charSequence.toString()) != null) {
                    str3 = a.f.j(obj3, "");
                }
                List g = scc.g(str3, bss0Var.d, str);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : g) {
                    CharSequence charSequence2 = (CharSequence) obj4;
                    if (charSequence2 != null && !evu0.J(charSequence2)) {
                        arrayList.add(obj4);
                    }
                }
                str3 = kotlin.collections.a.X(arrayList, null, null, null, null, 63);
            } else {
                if (!(css0Var instanceof xrs0)) {
                    w511.b();
                    return null;
                }
                bss0 bss0Var2 = ((xrs0) css0Var).a;
                CharSequence charSequence3 = bss0Var2.a;
                if (charSequence3 != null && (obj2 = charSequence3.toString()) != null) {
                    str3 = a.f.j(obj2, "");
                }
                List g2 = scc.g(str3, bss0Var2.d, str);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : g2) {
                    CharSequence charSequence4 = (CharSequence) obj5;
                    if (charSequence4 != null && !evu0.J(charSequence4)) {
                        arrayList2.add(obj5);
                    }
                }
                str3 = kotlin.collections.a.X(arrayList2, null, null, null, null, 63);
            }
        }
        return new rnk0(css0Var, str3);
    }
}
