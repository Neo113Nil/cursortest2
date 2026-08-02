package com.yandex.go.payments.cards.info;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.payments.cards.info.CardInfoModalView;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.bia0;
import defpackage.cma1;
import defpackage.dr7;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.fl8;
import defpackage.g1a0;
import defpackage.g8e;
import defpackage.kyh0;
import defpackage.luh0;
import defpackage.ngd0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.sr4;
import defpackage.tje;
import defpackage.tma0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uf8;
import defpackage.xf8;
import defpackage.xqg0;
import defpackage.yf8;
import defpackage.zf8;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0003¢\u0006\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010=R\u0014\u0010F\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010=R\u0014\u0010G\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u0014\u0010H\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010=R\u0014\u0010I\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010=R\u0014\u0010J\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010=R\u0014\u0010K\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010@R\u0016\u0010M\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/yandex/go/payments/cards/info/CardInfoModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/payments/paymentlist/domain/i;", "interactor", "Ltse;", "coroutineScope", "Ltt2;", "appDispatchers", "Lg1a0;", "paymentImageLoader", "Lzf8;", "cardInfoPayload", "Lyf8;", "cardInfoNavigator", "Lbia0;", "paymentResourceProvider", "Ltma0;", "paymentsDesignInteractor", "<init>", "(Landroid/content/Context;Lcom/yandex/go/payments/paymentlist/domain/i;Ltse;Ltt2;Lg1a0;Lzf8;Lyf8;Lbia0;Ltma0;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "initViews", "displayCard", "", "cardTitle", "getMaskedCardTitle", "(Ljava/lang/String;)Ljava/lang/String;", "cardDescription", "()Ljava/lang/String;", "view", "disableViewWithTransparency", "(Landroid/view/View;)V", "Lru/yandex/taxi/payment_options/model/PaymentIconType;", "paymentIconType", "", "getColorFromIconType", "(Lru/yandex/taxi/payment_options/model/PaymentIconType;)I", "Lcom/yandex/go/payments/paymentlist/domain/i;", "Ltse;", "Ltt2;", "Lg1a0;", "Lzf8;", "Lyf8;", "Lbia0;", "Ltma0;", "Landroid/view/View;", "Landroid/widget/TextView;", "cardNumberView", "Landroid/widget/TextView;", "cardExpDateView", "Landroid/widget/ImageView;", "cardIconView", "Landroid/widget/ImageView;", "cancelView", "cardLayout", "menuView", "selectCardView", "verifyCardView", "deleteCardView", "selectCardTitleView", "Landroid/graphics/Typeface;", "sOCRATypeface", "Landroid/graphics/Typeface;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardInfoModalView extends ModalView {
    public static final int $stable = 8;
    private final tt2 appDispatchers;
    private final View cancelView;
    private final TextView cardExpDateView;
    private final ImageView cardIconView;
    private final yf8 cardInfoNavigator;
    private final zf8 cardInfoPayload;
    private final View cardLayout;
    private final TextView cardNumberView;
    private final View contentView;
    private final tse coroutineScope;
    private final View deleteCardView;
    private final i interactor;
    private final View menuView;
    private final g1a0 paymentImageLoader;
    private final bia0 paymentResourceProvider;
    private final tma0 paymentsDesignInteractor;
    private final Typeface sOCRATypeface;
    private final TextView selectCardTitleView;
    private final View selectCardView;
    private final View verifyCardView;

    public CardInfoModalView(Context context, i iVar, tse tseVar, tt2 tt2Var, g1a0 g1a0Var, zf8 zf8Var, yf8 yf8Var, bia0 bia0Var, tma0 tma0Var) {
        super(context);
        Typeface typeface;
        this.interactor = iVar;
        this.coroutineScope = tseVar;
        this.appDispatchers = tt2Var;
        this.paymentImageLoader = g1a0Var;
        this.cardInfoPayload = zf8Var;
        this.cardInfoNavigator = yf8Var;
        this.paymentResourceProvider = bia0Var;
        this.paymentsDesignInteractor = tma0Var;
        c.q(this, luh0.payment_method_chooser_card_info, true);
        int i = e6h0.content;
        WeakHashMap weakHashMap = b.a;
        this.contentView = (View) rp31.d(this, i);
        this.cardNumberView = (TextView) ((View) rp31.d(this, e6h0.card_number));
        this.cardExpDateView = (TextView) ((View) rp31.d(this, e6h0.card_exp_date));
        this.cardIconView = (ImageView) ((View) rp31.d(this, e6h0.icon));
        this.cancelView = (View) rp31.d(this, e6h0.cancel);
        this.cardLayout = (View) rp31.d(this, e6h0.card_layout);
        this.menuView = (View) rp31.d(this, e6h0.menu);
        this.selectCardView = (View) rp31.d(this, e6h0.select_card);
        this.verifyCardView = (View) rp31.d(this, e6h0.verify_card);
        this.deleteCardView = (View) rp31.d(this, e6h0.delete_card);
        this.selectCardTitleView = (TextView) ((View) rp31.d(this, e6h0.select_card_title));
        try {
            typeface = Typeface.createFromAsset(context.getAssets(), "fonts/cards.otf");
        } catch (RuntimeException unused) {
            typeface = null;
        }
        this.sOCRATypeface = typeface;
        initViews();
        displayCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String cardDescription() {
        String str = this.cardInfoPayload.a.l;
        if (str != null && str.length() != 0) {
            return str;
        }
        fl8 fl8Var = this.cardInfoPayload.a;
        String str2 = fl8Var.g;
        String str3 = fl8Var.f;
        return (evu0.J(str2) || evu0.J(str3)) ? "" : g8e.p(str2, "/", str3.substring(str3.length() - 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableViewWithTransparency(View view) {
        view.setAlpha(0.5f);
        view.setEnabled(false);
    }

    private final void displayCard() {
        tje.N(this.coroutineScope, null, null, new CardInfoModalView$displayCard$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColorFromIconType(PaymentIconType paymentIconType) {
        int i = uf8.a[paymentIconType.ordinal()];
        if (i == 1) {
            return getContext().getColor(xqg0.card_visa);
        }
        if (i == 2) {
            return getContext().getColor(xqg0.card_am_exp);
        }
        if (i == 3) {
            return getContext().getColor(xqg0.card_mir);
        }
        if (i != 4) {
            return 0;
        }
        return getContext().getColor(xqg0.card_discover);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMaskedCardTitle(String cardTitle) {
        return evu0.k0(cardTitle).toString().length() < 4 ? "" : getResources().getString(kyh0.card_mask, cardTitle.substring(cardTitle.length() - 4));
    }

    private final void initViews() {
        final int i = 0;
        c.z(new sls(this) { // from class: tf8
            public final /* synthetic */ CardInfoModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 initViews$lambda$0;
                zy11 initViews$lambda$1;
                zy11 initViews$lambda$2;
                int i2 = i;
                CardInfoModalView cardInfoModalView = this.b;
                switch (i2) {
                    case 0:
                        initViews$lambda$0 = CardInfoModalView.initViews$lambda$0(cardInfoModalView);
                        return initViews$lambda$0;
                    case 1:
                        initViews$lambda$1 = CardInfoModalView.initViews$lambda$1(cardInfoModalView);
                        return initViews$lambda$1;
                    default:
                        initViews$lambda$2 = CardInfoModalView.initViews$lambda$2(cardInfoModalView);
                        return initViews$lambda$2;
                }
            }
        }, this.selectCardView);
        final int i2 = 1;
        c.z(new sls(this) { // from class: tf8
            public final /* synthetic */ CardInfoModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 initViews$lambda$0;
                zy11 initViews$lambda$1;
                zy11 initViews$lambda$2;
                int i22 = i2;
                CardInfoModalView cardInfoModalView = this.b;
                switch (i22) {
                    case 0:
                        initViews$lambda$0 = CardInfoModalView.initViews$lambda$0(cardInfoModalView);
                        return initViews$lambda$0;
                    case 1:
                        initViews$lambda$1 = CardInfoModalView.initViews$lambda$1(cardInfoModalView);
                        return initViews$lambda$1;
                    default:
                        initViews$lambda$2 = CardInfoModalView.initViews$lambda$2(cardInfoModalView);
                        return initViews$lambda$2;
                }
            }
        }, this.verifyCardView);
        final int i3 = 2;
        c.z(new sls(this) { // from class: tf8
            public final /* synthetic */ CardInfoModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 initViews$lambda$0;
                zy11 initViews$lambda$1;
                zy11 initViews$lambda$2;
                int i22 = i3;
                CardInfoModalView cardInfoModalView = this.b;
                switch (i22) {
                    case 0:
                        initViews$lambda$0 = CardInfoModalView.initViews$lambda$0(cardInfoModalView);
                        return initViews$lambda$0;
                    case 1:
                        initViews$lambda$1 = CardInfoModalView.initViews$lambda$1(cardInfoModalView);
                        return initViews$lambda$1;
                    default:
                        initViews$lambda$2 = CardInfoModalView.initViews$lambda$2(cardInfoModalView);
                        return initViews$lambda$2;
                }
            }
        }, this.deleteCardView);
        this.cardExpDateView.setTypeface(this.sOCRATypeface);
        this.cardNumberView.setTypeface(this.sOCRATypeface);
        ru.yandex.taxi.widget.b n = ngd0.n(this.cardNumberView, null, 0);
        Context context = n.a.getContext();
        Resources.getSystem();
        float applyDimension = TypedValue.applyDimension(2, 1000.0f, context.getResources().getDisplayMetrics());
        if (applyDimension != n.g) {
            n.g = applyDimension;
            n.a();
        }
        n.c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initViews$lambda$0(CardInfoModalView cardInfoModalView) {
        ((dr7) ((sr4) cardInfoModalView.cardInfoNavigator).b).r(new xf8(cardInfoModalView.cardInfoPayload.a, 2));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initViews$lambda$1(CardInfoModalView cardInfoModalView) {
        ((dr7) ((sr4) cardInfoModalView.cardInfoNavigator).b).r(new xf8(cardInfoModalView.cardInfoPayload.a, 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initViews$lambda$2(CardInfoModalView cardInfoModalView) {
        ((dr7) ((sr4) cardInfoModalView.cardInfoNavigator).b).r(new xf8(cardInfoModalView.cardInfoPayload.a, 0));
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        this.cardLayout.setTranslationY(r0.getTop());
        this.cardLayout.setAlpha(0.0f);
        cma1.I(this.cardLayout);
        cma1.h(0.0f, this.cardLayout).setStartDelay(100L).withStartAction(onAnimateShowStartAction).withEndAction(onAnimateShowEndAction);
        this.menuView.setTranslationY(r5.getTop());
        cma1.h(0.0f, this.menuView);
        this.contentView.setAlpha(0.0f);
        cma1.I(this.contentView);
        animateShowBackground(200L);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.contentView;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.paymentImageLoader.a();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.paymentImageLoader.d();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        c.B(this.cancelView, onBackPressedListener);
    }
}
