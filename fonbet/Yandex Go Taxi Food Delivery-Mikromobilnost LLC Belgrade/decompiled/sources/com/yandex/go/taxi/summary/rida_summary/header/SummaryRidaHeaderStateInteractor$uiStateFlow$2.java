package com.yandex.go.taxi.summary.rida_summary.header;

import defpackage.b6k0;
import defpackage.c6k0;
import defpackage.f1h0;
import defpackage.iyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.q6k0;
import defpackage.scc;
import defpackage.w5k0;
import defpackage.xqg0;
import defpackage.y5k0;
import defpackage.y6i0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lq6k0;", "ridaPrices", "", "selectedIndex", "Ly5k0;", "<anonymous>", "(Ljava/util/List;I)Ly5k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.rida_summary.header.SummaryRidaHeaderStateInteractor$uiStateFlow$2", f = "SummaryRidaHeaderStateInteractor.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SummaryRidaHeaderStateInteractor$uiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryRidaHeaderStateInteractor$uiStateFlow$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        SummaryRidaHeaderStateInteractor$uiStateFlow$2 summaryRidaHeaderStateInteractor$uiStateFlow$2 = new SummaryRidaHeaderStateInteractor$uiStateFlow$2(this.this$0, (Continuation) obj3);
        summaryRidaHeaderStateInteractor$uiStateFlow$2.L$0 = (List) obj;
        summaryRidaHeaderStateInteractor$uiStateFlow$2.I$0 = intValue;
        return summaryRidaHeaderStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        q6k0 q6k0Var;
        w5k0 w5k0Var;
        List list = (List) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            if (list.isEmpty() || i < 0) {
                e eVar = this.this$0.a;
                return new y5k0(null, null, new w5k0(eVar.a.getColor(xqg0.rida_header_gradient_top), eVar.a.getColor(xqg0.rida_header_gradient_bottom)), false);
            }
            q6k0 q6k0Var2 = (q6k0) list.get(y6i0.d(i, 0, scc.f(list)));
            c cVar = this.this$0;
            cVar.getClass();
            String str2 = q6k0Var2.e;
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 == null) {
                str = cVar.a.a.getString(iyh0.rida_summary_your_trip);
            } else {
                str = str2;
            }
            e eVar2 = this.this$0.a;
            FormattedText formattedText = q6k0Var2.f;
            this.L$0 = null;
            this.L$1 = q6k0Var2;
            this.L$2 = str;
            this.I$0 = i;
            this.label = 1;
            Object s = e.s(eVar2, formattedText, this);
            if (s == coroutineSingletons) {
                return coroutineSingletons;
            }
            q6k0Var = q6k0Var2;
            obj = s;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            q6k0Var = (q6k0) this.L$1;
            kotlin.b.b(obj);
        }
        c6k0 c6k0Var = new c6k0((CharSequence) obj, false, 2);
        b6k0 b6k0Var = new b6k0(str, new Integer(f1h0.ic_location_fill_24));
        c cVar2 = this.this$0;
        String str3 = q6k0Var.c;
        String str4 = q6k0Var.d;
        cVar2.getClass();
        Integer S = q5z.S(str3);
        Integer S2 = q5z.S(str4);
        if (S == null || S2 == null) {
            e eVar3 = cVar2.a;
            w5k0Var = new w5k0(eVar3.a.getColor(xqg0.rida_header_gradient_top), eVar3.a.getColor(xqg0.rida_header_gradient_bottom));
        } else {
            w5k0Var = new w5k0(S.intValue(), S2.intValue());
        }
        return new y5k0(c6k0Var, b6k0Var, w5k0Var, false);
    }
}
