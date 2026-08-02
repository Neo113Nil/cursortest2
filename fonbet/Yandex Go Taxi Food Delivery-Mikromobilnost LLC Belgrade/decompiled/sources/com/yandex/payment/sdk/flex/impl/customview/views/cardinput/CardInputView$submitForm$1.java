package com.yandex.payment.sdk.flex.impl.customview.views.cardinput;

import defpackage.bso;
import defpackage.dso;
import defpackage.fso;
import defpackage.hg8;
import defpackage.jlk;
import defpackage.lnz0;
import defpackage.lof;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nh8;
import defpackage.ny61;
import defpackage.ok8;
import defpackage.rg8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w9u0;
import defpackage.wls;
import defpackage.y031;
import defpackage.yzh;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView$submitForm$1", f = "CardInputView.kt", l = {327}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class CardInputView$submitForm$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ CardInputView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputView$submitForm$1(CardInputView cardInputView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardInputView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardInputView$submitForm$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInputView$submitForm$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nh8 nh8Var;
        Object value;
        lnz0 lnz0Var;
        Object k0;
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
        nh8Var = this.this$0.viewController;
        this.label = 1;
        r0 r0Var = nh8Var.i;
        hg8 hg8Var = nh8Var.c;
        if (hg8Var == null) {
            nh8Var.c();
        } else {
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, rg8.a((rg8) value, new w9u0(true), null, null, null, 0, 0, 62)));
            rg8 rg8Var = (rg8) r0Var.getValue();
            ok8 ok8Var = rg8Var.b;
            if (ok8Var.c instanceof y031) {
                String str = ok8Var.a;
                fso fsoVar = rg8Var.c;
                if (fsoVar.d instanceof y031) {
                    dso dsoVar = fsoVar.b;
                    if (dsoVar instanceof bso) {
                        bso bsoVar = (bso) dsoVar;
                        lof lofVar = rg8Var.d;
                        if (lofVar.c instanceof y031) {
                            lnz0Var = new lnz0(str, String.valueOf(bsoVar.b), String.valueOf(bsoVar.a), lofVar.a);
                            if (lnz0Var != null) {
                                jlk jlkVar = nh8Var.k;
                                if (jlkVar != null) {
                                    ((yzh) jlkVar).n(hg8Var.a.f);
                                }
                            } else {
                                sjh sjhVar = uyj.a;
                                k0 = tje.k0(mdh.b, new CardInputViewController$submitForm$3(nh8Var, lnz0Var, hg8Var, null), this);
                            }
                        }
                    }
                }
            }
            lnz0Var = null;
            if (lnz0Var != null) {
            }
        }
        k0 = zy11Var;
        return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
