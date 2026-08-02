package com.yandex.go.payments.cards.info;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.b1a0;
import defpackage.fl8;
import defpackage.g1a0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.lv90;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tma0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uma0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xw91;
import defpackage.zf8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payment_options.model.PaymentIconType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.info.CardInfoModalView$displayCard$1", f = "CardInfoModalView.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CardInfoModalView$displayCard$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CardInfoModalView this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.cards.info.CardInfoModalView$displayCard$1$1", f = "CardInfoModalView.kt", l = {139}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.cards.info.CardInfoModalView$displayCard$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$BooleanRef $allowDelete;
        final /* synthetic */ Ref$BooleanRef $selected;
        Object L$0;
        int label;
        final /* synthetic */ CardInfoModalView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, CardInfoModalView cardInfoModalView, Ref$BooleanRef ref$BooleanRef2, Continuation continuation) {
            super(2, continuation);
            this.$selected = ref$BooleanRef;
            this.this$0 = cardInfoModalView;
            this.$allowDelete = ref$BooleanRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$selected, this.this$0, this.$allowDelete, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i iVar;
            zf8 zf8Var;
            i iVar2;
            zf8 zf8Var2;
            Ref$BooleanRef ref$BooleanRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                Ref$BooleanRef ref$BooleanRef2 = this.$selected;
                iVar = this.this$0.interactor;
                zf8Var = this.this$0.cardInfoPayload;
                fl8 fl8Var = zf8Var.a;
                lv90 a = iVar.p.b.a();
                ref$BooleanRef2.element = jl40.l(fl8Var.a, a.b) && a.a() == PaymentMethod$Type.CARD;
                Ref$BooleanRef ref$BooleanRef3 = this.$allowDelete;
                iVar2 = this.this$0.interactor;
                zf8Var2 = this.this$0.cardInfoPayload;
                fl8 fl8Var2 = zf8Var2.a;
                this.L$0 = ref$BooleanRef3;
                this.label = 1;
                Object b = iVar2.b(fl8Var2, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = b;
                ref$BooleanRef = ref$BooleanRef3;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                b.b(obj);
            }
            ref$BooleanRef.element = ((Boolean) obj).booleanValue();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInfoModalView$displayCard$1(CardInfoModalView cardInfoModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardInfoModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardInfoModalView$displayCard$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInfoModalView$displayCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        tt2 tt2Var;
        Ref$BooleanRef ref$BooleanRef2;
        zf8 zf8Var;
        tma0 tma0Var;
        zf8 zf8Var2;
        String maskedCardTitle;
        TextView textView;
        TextView textView2;
        String cardDescription;
        g1a0 g1a0Var;
        ImageView imageView;
        zf8 zf8Var3;
        zf8 zf8Var4;
        View view;
        int colorFromIconType;
        zf8 zf8Var5;
        View view2;
        View view3;
        zf8 zf8Var6;
        View view4;
        TextView textView3;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        TextView textView4;
        TextView textView5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ref$BooleanRef = new Ref$BooleanRef();
            Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
            tt2Var = this.this$0.appDispatchers;
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, this.this$0, ref$BooleanRef3, null);
            this.L$0 = ref$BooleanRef;
            this.L$1 = ref$BooleanRef3;
            this.label = 1;
            if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$BooleanRef2 = ref$BooleanRef3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
            ref$BooleanRef = (Ref$BooleanRef) this.L$0;
            b.b(obj);
        }
        zf8Var = this.this$0.cardInfoPayload;
        boolean z = zf8Var.a.h;
        CardInfoModalView cardInfoModalView = this.this$0;
        tma0Var = cardInfoModalView.paymentsDesignInteractor;
        zf8Var2 = this.this$0.cardInfoPayload;
        maskedCardTitle = cardInfoModalView.getMaskedCardTitle(((uma0) tma0Var).b(zf8Var2.a));
        textView = this.this$0.cardNumberView;
        textView.setText(maskedCardTitle);
        textView2 = this.this$0.cardExpDateView;
        cardDescription = this.this$0.cardDescription();
        textView2.setText(cardDescription);
        g1a0Var = this.this$0.paymentImageLoader;
        imageView = this.this$0.cardIconView;
        zf8Var3 = this.this$0.cardInfoPayload;
        g1a0Var.c(imageView, zf8Var3.a);
        b1a0 b1a0Var = PaymentIconType.Companion;
        zf8Var4 = this.this$0.cardInfoPayload;
        String str = zf8Var4.a.e;
        b1a0Var.getClass();
        PaymentIconType a = b1a0.a(str);
        view = this.this$0.cardLayout;
        Drawable background = view.getBackground();
        colorFromIconType = this.this$0.getColorFromIconType(a);
        background.setColorFilter(colorFromIconType, PorterDuff.Mode.SRC_ATOP);
        if (z) {
            view9 = this.this$0.selectCardView;
            view9.setEnabled(false);
            textView4 = this.this$0.selectCardTitleView;
            textView5 = this.this$0.selectCardTitleView;
            textView4.setPaintFlags(textView5.getPaintFlags() | 16);
        }
        zf8Var5 = this.this$0.cardInfoPayload;
        boolean z2 = zf8Var5.a.c;
        CardInfoModalView cardInfoModalView2 = this.this$0;
        if (z2) {
            view7 = cardInfoModalView2.selectCardView;
            view7.setVisibility(0);
            view8 = this.this$0.verifyCardView;
            view8.setVisibility(8);
        } else {
            view2 = cardInfoModalView2.selectCardView;
            view2.setVisibility(8);
            view3 = this.this$0.verifyCardView;
            view3.setVisibility(0);
        }
        zf8Var6 = this.this$0.cardInfoPayload;
        if (!jl40.l(zf8Var6.b, xw91.C)) {
            CardInfoModalView cardInfoModalView3 = this.this$0;
            view6 = cardInfoModalView3.selectCardView;
            cardInfoModalView3.disableViewWithTransparency(view6);
        } else if (ref$BooleanRef.element) {
            CardInfoModalView cardInfoModalView4 = this.this$0;
            view4 = cardInfoModalView4.selectCardView;
            cardInfoModalView4.disableViewWithTransparency(view4);
            textView3 = this.this$0.selectCardTitleView;
            textView3.setText(kyh0.payment_card_is_selected);
        }
        if (!ref$BooleanRef2.element) {
            CardInfoModalView cardInfoModalView5 = this.this$0;
            view5 = cardInfoModalView5.deleteCardView;
            cardInfoModalView5.disableViewWithTransparency(view5);
        }
        return zy11.a;
    }
}
