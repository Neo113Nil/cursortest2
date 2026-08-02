package com.yandex.payment.divkit.bind;

import com.yandex.payment.divkit.usecases.d;
import defpackage.cnk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.scc;
import defpackage.tse;
import defpackage.u2l;
import defpackage.uvq;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.bind.DKBindCardViewModel$loadAndShowDivJson$1", f = "DKBindCardViewModel.kt", l = {424, 423}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKBindCardViewModel$loadAndShowDivJson$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isLightTheme;
    final /* synthetic */ boolean $isPaymentContext;
    final /* synthetic */ boolean $showBackButton;
    final /* synthetic */ boolean $showSaveCheckbox;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKBindCardViewModel$loadAndShowDivJson$1(b bVar, boolean z, boolean z2, boolean z3, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$isPaymentContext = z;
        this.$showBackButton = z2;
        this.$showSaveCheckbox = z3;
        this.$isLightTheme = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKBindCardViewModel$loadAndShowDivJson$1(this.this$0, this.$isPaymentContext, this.$showBackButton, this.$showSaveCheckbox, this.$isLightTheme, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKBindCardViewModel$loadAndShowDivJson$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r6 == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = this.this$0;
            uvq uvqVar = bVar.b;
            boolean z = this.$isPaymentContext;
            u2l u2lVar = bVar.R;
            this.L$0 = bVar;
            this.label = 1;
            d = ((d) uvqVar).d(z, u2lVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
            d = obj;
        }
        omk omkVar = (omk) d;
        boolean z2 = this.$isPaymentContext;
        boolean z3 = this.$showBackButton;
        boolean z4 = this.$showSaveCheckbox;
        boolean z5 = this.$isLightTheme;
        this.L$0 = null;
        this.label = 2;
        bVar.A.m(Boolean.FALSE);
        Object emit = bVar.S.emit(new cnk(omkVar, scc.g(new Pair("isLightTheme", String.valueOf(z5)), new Pair("card_input_screen_is_payment", String.valueOf(z2)), new Pair("card_input_screen_button_state", "number"), new Pair("card_input_screen_error_state", "none"), new Pair("card_input_screen_anim_div_state", "gone"), new Pair("card_input_screen_checkbox_value", "true"), new Pair("card_input_screen_pay_button_text", "Pay 100p"), new Pair("card_input_screen_back_button_div_state", z3 ? "visible" : "invisible"), new Pair("card_input_screen_checkbox_state", z4 ? "visible" : "gone"))), this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
