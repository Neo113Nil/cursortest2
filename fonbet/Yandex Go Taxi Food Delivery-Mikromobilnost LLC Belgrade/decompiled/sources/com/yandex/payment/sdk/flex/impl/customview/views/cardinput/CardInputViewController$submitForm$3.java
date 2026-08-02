package com.yandex.payment.sdk.flex.impl.customview.views.cardinput;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.hg8;
import defpackage.knz0;
import defpackage.lh8;
import defpackage.lnz0;
import defpackage.mnz0;
import defpackage.mvg;
import defpackage.nh8;
import defpackage.ny61;
import defpackage.pcy;
import defpackage.q;
import defpackage.q7w;
import defpackage.qcx;
import defpackage.tse;
import defpackage.w04;
import defpackage.wb8;
import defpackage.wj00;
import defpackage.wls;
import defpackage.xg8;
import defpackage.yb8;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputViewController$submitForm$3", f = "CardInputViewController.kt", l = {148}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class CardInputViewController$submitForm$3 extends SuspendLambda implements wls {
    final /* synthetic */ hg8 $customProps;
    final /* synthetic */ lnz0 $data;
    int label;
    final /* synthetic */ nh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputViewController$submitForm$3(nh8 nh8Var, lnz0 lnz0Var, hg8 hg8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nh8Var;
        this.$data = lnz0Var;
        this.$customProps = hg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardInputViewController$submitForm$3(this.this$0, this.$data, this.$customProps, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInputViewController$submitForm$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        nh8 nh8Var = this.this$0;
        wb8 wb8Var = nh8Var.a;
        lnz0 lnz0Var = this.$data;
        hg8 hg8Var = this.$customProps;
        xg8 xg8Var = hg8Var.a;
        c cVar = xg8Var.c;
        String str = xg8Var.d;
        lh8 lh8Var = new lh8(nh8Var, hg8Var, 0);
        lh8 lh8Var2 = new lh8(nh8Var, hg8Var, 1);
        this.label = 1;
        yb8 yb8Var = (yb8) wb8Var;
        pcy pcyVar = yb8Var.a;
        yb8Var.c = pcyVar.b;
        if (str != null) {
            pcyVar.b = new q7w(null, str.concat("/api/"));
        }
        wj00 wj00Var = new wj00(0);
        for (Map.Entry entry : kotlin.collections.b.t(cVar).entrySet()) {
            wj00Var.k((String) entry.getKey(), qcx.n((kotlinx.serialization.json.b) entry.getValue()).a());
        }
        knz0 knz0Var = yb8Var.b;
        String v = cvu0.v(lnz0Var.a, " ", "", false);
        String N = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, lnz0Var.c);
        String str2 = lnz0Var.b;
        if (str2.length() < 3) {
            str2 = "20".concat(str2);
        }
        knz0Var.b(new mnz0(v, N, str2, null, lnz0Var.d), wj00Var).h(new q(28, yb8Var, lh8Var2, lh8Var)).c(new w04(28, yb8Var, lh8Var2));
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
