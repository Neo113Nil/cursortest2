package com.yandex.go.taxi.order.promotions.mapper;

import android.graphics.drawable.Drawable;
import defpackage.e480;
import defpackage.h2r;
import defpackage.h480;
import defpackage.l4y0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p4y0;
import defpackage.pdc;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll4y0;", "<anonymous>", "(Ltse;)Ll4y0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.mapper.OrderPromotionPopupStateMapper$map$2", f = "OrderPromotionPopupStateMapper.kt", l = {30, 31, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionPopupStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ e480 $modal;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPromotionPopupStateMapper$map$2(e480 e480Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$modal = e480Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPromotionPopupStateMapper$map$2 orderPromotionPopupStateMapper$map$2 = new OrderPromotionPopupStateMapper$map$2(this.$modal, this.this$0, continuation);
        orderPromotionPopupStateMapper$map$2.L$0 = obj;
        return orderPromotionPopupStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPromotionPopupStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0143  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object s;
        noh nohVar;
        noh nohVar2;
        List list;
        Object k;
        List list2;
        CharSequence charSequence;
        Object k2;
        CharSequence charSequence2;
        List list3;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new OrderPromotionPopupStateMapper$map$2$title$1(this.$modal, this.this$0, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new OrderPromotionPopupStateMapper$map$2$content$1(this.$modal, this.this$0, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new OrderPromotionPopupStateMapper$map$2$icon$1(this.$modal, this.this$0, null), 3);
            h480 h480Var = this.$modal.f;
            if (h480Var != null) {
                a aVar = this.this$0;
                pdc pdcVar = aVar.d;
                List<ActionButton> list4 = h480Var.a;
                arrayList = new ArrayList(tcc.n(list4, 10));
                for (ActionButton actionButton : list4) {
                    ufu ufuVar = (ufu) pdcVar;
                    arrayList.add(new p4y0(actionButton.b, ufuVar.e(actionButton.c), ufuVar.i(actionButton.d), new h2r(23, aVar, actionButton), 8));
                }
            } else {
                arrayList = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = arrayList;
            this.label = 1;
            s = h.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h2;
                list = arrayList;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence4 = (CharSequence) this.L$6;
                charSequence2 = (CharSequence) this.L$5;
                List list5 = (List) this.L$4;
                b.b(obj);
                charSequence3 = charSequence4;
                list3 = list5;
                k2 = obj;
                Drawable drawable = (Drawable) k2;
                if (list3 == null) {
                    list3 = EmptyList.a;
                }
                return new l4y0(charSequence2, charSequence3, drawable, list3, 8);
            }
            charSequence = (CharSequence) this.L$5;
            list2 = (List) this.L$4;
            nohVar = (noh) this.L$3;
            b.b(obj);
            k = obj;
            CharSequence charSequence5 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = list2;
            this.L$5 = charSequence;
            this.L$6 = charSequence5;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
                charSequence2 = charSequence;
                list3 = list2;
                charSequence3 = charSequence5;
                Drawable drawable2 = (Drawable) k2;
                if (list3 == null) {
                }
                return new l4y0(charSequence2, charSequence3, drawable2, list3, 8);
            }
            return coroutineSingletons;
        }
        list = (List) this.L$4;
        noh nohVar3 = (noh) this.L$3;
        nohVar2 = (noh) this.L$2;
        b.b(obj);
        nohVar = nohVar3;
        s = obj;
        CharSequence charSequence6 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = list;
        this.L$5 = charSequence6;
        this.label = 2;
        k = nohVar2.k(this);
        if (k != coroutineSingletons) {
            list2 = list;
            charSequence = charSequence6;
            CharSequence charSequence52 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = list2;
            this.L$5 = charSequence;
            this.L$6 = charSequence52;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
