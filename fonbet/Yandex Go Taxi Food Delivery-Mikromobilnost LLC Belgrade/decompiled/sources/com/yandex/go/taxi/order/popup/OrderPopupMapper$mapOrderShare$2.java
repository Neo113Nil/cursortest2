package com.yandex.go.taxi.order.popup;

import defpackage.bdc;
import defpackage.f480;
import defpackage.h480;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.r2y0;
import defpackage.s2y0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ls2y0;", "<anonymous>", "(Ltse;)Ls2y0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.OrderPopupMapper$mapOrderShare$2", f = "OrderPopupMapper.kt", l = {101, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupMapper$mapOrderShare$2 extends SuspendLambda implements wls {
    final /* synthetic */ f480 $item;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupMapper$mapOrderShare$2(f480 f480Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$item = f480Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPopupMapper$mapOrderShare$2 orderPopupMapper$mapOrderShare$2 = new OrderPopupMapper$mapOrderShare$2(this.$item, this.this$0, continuation);
        orderPopupMapper$mapOrderShare$2.L$0 = obj;
        return orderPopupMapper$mapOrderShare$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPopupMapper$mapOrderShare$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh h;
        r2y0 r2y0Var;
        String str;
        String str2;
        r2y0 r2y0Var2;
        ActionButton actionButton;
        ActionButton.ButtonActionType b;
        String str3;
        String str4;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.$item.b.a.isEmpty() && !this.$item.c.a.isEmpty()) {
                qoh h2 = tje.h(tseVar, null, null, new OrderPopupMapper$mapOrderShare$2$title$1(this.$item, this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new OrderPopupMapper$mapOrderShare$2$text$1(this.$item, this.this$0, null), 3);
                b bVar = this.this$0;
                h480 h480Var = this.$item.e;
                e eVar = bVar.c;
                List list = h480Var.a;
                if (list == null || (actionButton = (ActionButton) kotlin.collections.a.R(list)) == null) {
                    r2y0Var = null;
                } else {
                    String str5 = actionButton.b;
                    kdc v = eVar.v(actionButton.d);
                    if (v == null) {
                        v = new bdc(xng0.textOnControl);
                    }
                    kdc a = eVar.a(actionButton.c);
                    if (a == null) {
                        a = new bdc(xng0.controlMain);
                    }
                    ru.yandex.taxi.communications.model.widgets.b bVar2 = actionButton.e;
                    String analyticsName = (bVar2 == null || (b = bVar2.b()) == null) ? null : b.getAnalyticsName();
                    if (analyticsName == null) {
                        analyticsName = "";
                    }
                    r2y0Var = new r2y0(str5, v, a, analyticsName);
                }
                if (r2y0Var != null) {
                    f480 f480Var = this.$item;
                    str = f480Var.d.a;
                    if (str != null) {
                        str2 = f480Var.a;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = h;
                        this.L$3 = r2y0Var;
                        this.L$4 = str;
                        this.L$5 = str2;
                        this.label = 1;
                        obj = h2.s(this);
                        if (obj != coroutineSingletons) {
                            r2y0Var2 = r2y0Var;
                        }
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$6;
            str3 = (String) this.L$5;
            String str6 = (String) this.L$4;
            r2y0 r2y0Var3 = (r2y0) this.L$3;
            kotlin.b.b(obj);
            str4 = str6;
            r2y0Var2 = r2y0Var3;
            charSequence = charSequence2;
            return new s2y0(str3, charSequence, (CharSequence) obj, r2y0Var2, str4);
        }
        str2 = (String) this.L$5;
        str = (String) this.L$4;
        r2y0Var2 = (r2y0) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = r2y0Var2;
        this.L$4 = str;
        this.L$5 = str2;
        this.L$6 = charSequence3;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str3 = str2;
            str4 = str;
            charSequence = charSequence3;
            obj = k;
            return new s2y0(str3, charSequence, (CharSequence) obj, r2y0Var2, str4);
        }
        return coroutineSingletons;
    }
}
