package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.analytics.DiscountsAnalyticsScreen;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.dotted_line.DiscountsDottedLineView;
import defpackage.aki0;
import defpackage.bys;
import defpackage.c4r0;
import defpackage.cma1;
import defpackage.cmf0;
import defpackage.crj;
import defpackage.da0;
import defpackage.dmf0;
import defpackage.drj;
import defpackage.dvh0;
import defpackage.e230;
import defpackage.emf0;
import defpackage.f3x;
import defpackage.fmf0;
import defpackage.g8e;
import defpackage.gmf0;
import defpackage.grj;
import defpackage.hrj;
import defpackage.irj;
import defpackage.iug0;
import defpackage.j0g;
import defpackage.j3x;
import defpackage.jst;
import defpackage.knf0;
import defpackage.krj;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.lhj;
import defpackage.lnf0;
import defpackage.mcb1;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.oy80;
import defpackage.qdb1;
import defpackage.qke;
import defpackage.qnh;
import defpackage.qu;
import defpackage.smf0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tqj;
import defpackage.tse;
import defpackage.uqj;
import defpackage.uyj;
import defpackage.v130;
import defpackage.vpj;
import defpackage.vqj;
import defpackage.w511;
import defpackage.wlf0;
import defpackage.wqj;
import defpackage.wwb;
import defpackage.wxs;
import defpackage.xng0;
import defpackage.xqj;
import defpackage.xw31;
import defpackage.y6h0;
import defpackage.zvg;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB/\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u0019*\u00020!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\u0019*\u00020(2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u0019*\u00020(2\u0006\u0010,\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u0019*\u00020(2\u0006\u0010,\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u0012\u0004\b6\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u001c\u0010;\u001a\n\u0012\u0006\b\u0000\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010=\u001a\n\u0012\u0006\b\u0000\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/details/DiscountsPromoCodeDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxqj;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Ldrj;", "presenter", "<init>", "(Landroid/content/Context;Ltse;Lru/yandex/taxi/widget/utils/e;Ldrj;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxqj;", "", "hasCustomBackground", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/widget/RobotoTextView;", "prepareInfoTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "", "detailsItem", "bindInfoItem", "(Lru/yandex/taxi/widget/RobotoTextView;Ljava/lang/CharSequence;)V", "Lru/yandex/taxi/design/ButtonComponent;", "prepareButtonComponent", "()Lru/yandex/taxi/design/ButtonComponent;", "Lhrj;", "item", "bindActivationButton", "(Lru/yandex/taxi/design/ButtonComponent;Lhrj;)V", "Lirj;", "bindAdditionalButton", "(Lru/yandex/taxi/design/ButtonComponent;Lirj;)V", "Lgrj;", "bindActionButton", "(Lru/yandex/taxi/design/ButtonComponent;Lgrj;)V", "Ltse;", "getCoroutineScope$annotations", "Lru/yandex/taxi/widget/utils/e;", "Ldrj;", "Lbys;", "", "infoAdapter", "Lbys;", "buttonsAdapter", "Lcom/yandex/go/design/view/GoImageView;", "decorationImageView", "Lcom/yandex/go/design/view/GoImageView;", "Ll8x;", "imageLoadCancellable", "Ll8x;", "com/yandex/go/promocodes/base/impl/discounts/presentation/ui/details/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsPromoCodeDetailsModalView extends SlideableBindingModalView<xqj> {
    private final bys buttonsAdapter;
    private final tse coroutineScope;
    private final GoImageView decorationImageView;
    private l8x imageLoadCancellable;
    private final bys infoAdapter;
    private final ru.yandex.taxi.widget.utils.e mediaInfoConverter;
    private final drj presenter;

    public DiscountsPromoCodeDetailsModalView(Context context, tse tseVar, ru.yandex.taxi.widget.utils.e eVar, drj drjVar) {
        super(context);
        this.coroutineScope = tseVar;
        this.mediaInfoConverter = eVar;
        this.presenter = drjVar;
        RecyclerView recyclerView = getBinding().d;
        j3x j3xVar = new j3x();
        infoAdapter$lambda$0(this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        int i = 1;
        recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.infoAdapter = bysVar;
        RecyclerView recyclerView2 = getBinding().b;
        j3x j3xVar2 = new j3x();
        buttonsAdapter$lambda$0(this, j3xVar2);
        LinearLayoutManager linearLayoutManager2 = j3xVar2.b;
        recyclerView2.setLayoutManager(linearLayoutManager2 == null ? new LinearLayoutManager(recyclerView2.getContext(), 1, false) : linearLayoutManager2);
        bys bysVar2 = new bys(new wxs(), j3xVar2.a);
        recyclerView2.setAdapter(bysVar2);
        this.buttonsAdapter = bysVar2;
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        this.decorationImageView = goImageView;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        BackButtonIconComponent b = qdb1.b(this, new vqj(drjVar, i));
        ((View) b.getParent()).setTranslationY(tje.w(8, b.getContext()));
        int r = tje.r(iug0.discount_promocode_details_rounded_corner_radius, getContext());
        ListHeaderComponent listHeaderComponent = getBinding().f;
        listHeaderComponent.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(r));
        listHeaderComponent.setClipToOutline(true);
        LinearLayout linearLayout = getBinding().e;
        linearLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(r));
        linearLayout.setClipToOutline(true);
        getBinding().c.updateColor(getContext().getColor(mqg0.component_gray_300));
        getBottomSheet().setBackground(null);
        goImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        goImageView.setContentDescription(null);
        goImageView.setImportantForAccessibility(2);
        SlideableModalView.addViewAboveCard$default(this, goImageView, 8388613, 0, 4, null);
        View view = (View) goImageView.getParent();
        view.setTranslationX(tje.w(20, view.getContext()) * (xw31.k(context) ? -1.0f : 1.0f));
        view.setTranslationY(tje.w(52, view.getContext()));
        view.setTranslationZ(0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$backButtonClicked(drj drjVar) {
        ((da0) drjVar.L.a).r(new qu(9));
    }

    private final void bindActionButton(ButtonComponent buttonComponent, grj grjVar) {
        buttonComponent.setEnabled(grjVar.e);
        buttonComponent.setText(mcb1.b(buttonComponent, grjVar.b, grjVar.c, 0, 12));
        buttonComponent.setButtonBackground(grjVar.d);
        buttonComponent.setDebounceClickListener(new zvg(29, this, grjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindActionButton$lambda$0(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, grj grjVar) {
        drj drjVar = discountsPromoCodeDetailsModalView.presenter;
        dmf0 dmf0Var = grjVar.a;
        if (dmf0Var instanceof emf0) {
            drjVar.z.a(false, ((emf0) dmf0Var).a, "PromoCode");
            qke.w(drjVar.x, HapticController$Effect.CLICK_MEDIUM, true, true);
            tje.N(drjVar.Jg(), null, null, new DiscountsPromoCodeDetailsPresenter$actionButtonClicked$1(drjVar, null), 3);
            return;
        }
        if (dmf0Var instanceof fmf0) {
            ((da0) drjVar.L.a).r(new wwb(((fmf0) dmf0Var).c, 15));
            return;
        }
        if (!(dmf0Var instanceof gmf0)) {
            drjVar.getClass();
            w511.b();
            return;
        }
        r0 r0Var = drjVar.M;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        tqj tqjVar = DiscountsPromoCodeDetailsActionUrl.Companion;
        String str = ((gmf0) dmf0Var).c;
        tqjVar.getClass();
        int i = crj.b[tqj.a(str).ordinal()];
        if (i == 1) {
            g8e.C("Unknown code of discounts action with type url", jst.e);
        } else if (i == 2) {
            tje.N(drjVar.Jg(), null, null, new DiscountsPromoCodeDetailsPresenter$handleUrlAction$1(drjVar, null), 3);
        } else {
            w511.b();
        }
    }

    private final void bindActivationButton(ButtonComponent buttonComponent, hrj hrjVar) {
        buttonComponent.setEnabled(hrjVar.a);
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.use_promocode_taxi));
        buttonComponent.setDebounceClickListener(new vqj(this.presenter, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindActivationButton$activationButtonClicked(drj drjVar) {
        j0g j0gVar = drjVar.A;
        wlf0 wlf0Var = drjVar.I;
        j0gVar.A("ButtonTapped", wlf0Var, "activate_promocode");
        oy80 oy80Var = drjVar.E;
        List list = drjVar.J;
        oy80Var.getClass();
        boolean z = wlf0Var.k && !wlf0Var.j;
        String str = wlf0Var.f;
        if (z) {
            ((smf0) oy80Var.c).a.r("selected_promo", str);
            com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar = (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) oy80Var.b;
            String a = ((com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c) cVar.g.get()).a.a();
            if (a == null) {
                a = "";
            }
            lnf0 a2 = ((knf0) cVar.l.getValue()).a(cVar.i(), a, list);
            if (a2 != null) {
                cVar.o(new lnf0(a, com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c.j(str, a2.c), list));
            }
        }
        tje.N(drjVar.Jg(), null, null, new DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1(drjVar, null), 3);
    }

    private final void bindAdditionalButton(ButtonComponent buttonComponent, irj irjVar) {
        buttonComponent.setEnabled(irjVar.d);
        buttonComponent.setText(irjVar.b);
        buttonComponent.setButtonBackground(irjVar.c);
        buttonComponent.setDebounceClickListener(new wqj(0, this, irjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdditionalButton$lambda$0(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, irj irjVar) {
        drj drjVar = discountsPromoCodeDetailsModalView.presenter;
        DiscountsButtonAction discountsButtonAction = irjVar.a;
        vpj vpjVar = drjVar.B;
        qnh qnhVar = drjVar.L;
        j0g j0gVar = drjVar.A;
        wlf0 wlf0Var = drjVar.I;
        j0gVar.z("ButtonTapped", wlf0Var, discountsButtonAction);
        int i = crj.a[discountsButtonAction.ordinal()];
        if (i == 1) {
            vpjVar.b(DiscountsAnalyticsScreen.DESCRIPTION_CARD, wlf0Var);
            ((da0) qnhVar.a).r(new lhj(8));
            return;
        }
        if (i == 2) {
            vpjVar.c(DiscountsAnalyticsScreen.DESCRIPTION_CARD, wlf0Var);
            ((da0) qnhVar.a).r(new lhj(7));
        } else {
            if (i != 3) {
                ((da0) qnhVar.a).r(new qu(9));
                return;
            }
            String str = (String) kotlin.collections.a.R(wlf0Var.m);
            if (str != null) {
                c4r0.e(drjVar.D, SelectionOrigin.USER, str, null, 12);
            }
            tje.N(drjVar.Jg(), null, null, new DiscountsPromoCodeDetailsPresenter$additionalButtonClicked$2(drjVar, null), 3);
        }
    }

    private final void bindInfoItem(RobotoTextView robotoTextView, CharSequence charSequence) {
        robotoTextView.setText(charSequence);
    }

    private static final zy11 buttonsAdapter$lambda$0(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, j3x j3xVar) {
        DiscountsPromoCodeDetailsModalView$buttonsAdapter$1$1 discountsPromoCodeDetailsModalView$buttonsAdapter$1$1 = new DiscountsPromoCodeDetailsModalView$buttonsAdapter$1$1(0, discountsPromoCodeDetailsModalView, DiscountsPromoCodeDetailsModalView.class, "prepareButtonComponent", "prepareButtonComponent()Lru/yandex/taxi/design/ButtonComponent;", 0);
        j3xVar.getClass();
        aki0.b(new f3x(hrj.class, j3xVar, discountsPromoCodeDetailsModalView$buttonsAdapter$1$1), new uqj(discountsPromoCodeDetailsModalView, 0));
        aki0.b(new f3x(irj.class, j3xVar, new DiscountsPromoCodeDetailsModalView$buttonsAdapter$1$3(0, discountsPromoCodeDetailsModalView, DiscountsPromoCodeDetailsModalView.class, "prepareButtonComponent", "prepareButtonComponent()Lru/yandex/taxi/design/ButtonComponent;", 0)), new uqj(discountsPromoCodeDetailsModalView, 1));
        aki0.b(new f3x(grj.class, j3xVar, new DiscountsPromoCodeDetailsModalView$buttonsAdapter$1$5(0, discountsPromoCodeDetailsModalView, DiscountsPromoCodeDetailsModalView.class, "prepareButtonComponent", "prepareButtonComponent()Lru/yandex/taxi/design/ButtonComponent;", 0)), new uqj(discountsPromoCodeDetailsModalView, 2));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buttonsAdapter$lambda$0$0(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, ButtonComponent buttonComponent, hrj hrjVar) {
        discountsPromoCodeDetailsModalView.bindActivationButton(buttonComponent, hrjVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buttonsAdapter$lambda$0$1(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, ButtonComponent buttonComponent, irj irjVar) {
        discountsPromoCodeDetailsModalView.bindAdditionalButton(buttonComponent, irjVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 buttonsAdapter$lambda$0$2(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, ButtonComponent buttonComponent, grj grjVar) {
        discountsPromoCodeDetailsModalView.bindActionButton(buttonComponent, grjVar);
        return zy11.a;
    }

    private static /* synthetic */ void getCoroutineScope$annotations() {
    }

    private static final zy11 infoAdapter$lambda$0(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, j3x j3xVar) {
        DiscountsPromoCodeDetailsModalView$infoAdapter$1$1 discountsPromoCodeDetailsModalView$infoAdapter$1$1 = new DiscountsPromoCodeDetailsModalView$infoAdapter$1$1(0, discountsPromoCodeDetailsModalView, DiscountsPromoCodeDetailsModalView.class, "prepareInfoTextView", "prepareInfoTextView()Lru/yandex/taxi/widget/RobotoTextView;", 0);
        j3xVar.getClass();
        aki0.b(new f3x(CharSequence.class, j3xVar, discountsPromoCodeDetailsModalView$infoAdapter$1$1), new uqj(discountsPromoCodeDetailsModalView, 3));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 infoAdapter$lambda$0$0(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView, RobotoTextView robotoTextView, CharSequence charSequence) {
        discountsPromoCodeDetailsModalView.bindInfoItem(robotoTextView, charSequence);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonComponent prepareButtonComponent() {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, tje.u(8, buttonComponent.getContext()), 0, 0);
        buttonComponent.setLayoutParams(marginLayoutParams);
        buttonComponent.setTextSize(tje.s(mrg0.component_text_size_body, buttonComponent.getContext()));
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView prepareInfoTextView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, 0, 0, tje.r(mrg0.go_design_s_space, robotoTextView.getContext()));
        robotoTextView.setLayoutParams(marginLayoutParams);
        robotoTextView.setTextColorAttr(xng0.textMain);
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_body, robotoTextView.getContext()));
        return robotoTextView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xqj bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dvh0.discounts_promo_code_details_modal_view, parent, false);
        int i = y6h0.buttons_recycler_view;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = y6h0.dotted_line;
            DiscountsDottedLineView discountsDottedLineView = (DiscountsDottedLineView) cma1.O(i, inflate);
            if (discountsDottedLineView != null) {
                i = y6h0.info_recycler_view;
                RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView2 != null) {
                    i = y6h0.main_container;
                    LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                    if (linearLayout != null) {
                        i = y6h0.title_header_component;
                        ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                        if (listHeaderComponent != null) {
                            return new xqj((ConstraintLayout) inflate, recyclerView, discountsDottedLineView, recyclerView2, linearLayout, listHeaderComponent);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        drj drjVar = this.presenter;
        a aVar = new a(this);
        drjVar.Bg(aVar);
        krj krjVar = drjVar.H;
        wlf0 wlf0Var = drjVar.I;
        cmf0 cmf0Var = drjVar.K;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(new c(krjVar.b.a(), krjVar, wlf0Var, cmf0Var), drjVar.M, new DiscountsPromoCodeDetailsUiStateInteractor$uiStateFlow$1(krjVar, wlf0Var, cmf0Var, null)));
        krjVar.a.getClass();
        tje.N(drjVar.Jg(), null, null, new DiscountsPromoCodeDetailsPresenter$attachView$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), null, aVar), 3);
        drjVar.A.z("Shown", wlf0Var, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        l8x l8xVar = this.imageLoadCancellable;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.imageLoadCancellable = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.m(getBinding().e, event) || xw31.m(getBinding().f, event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
