package com.yandex.go.tariffcard.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.RecyclerViewItemAnimationManager;
import com.yandex.go.tariffcard.ui.view.TariffCardScrollButtonView;
import com.yandex.go.taxi.summary.shared.expanded.SummaryExpandedView$ScrollingState;
import defpackage.a2i0;
import defpackage.adx0;
import defpackage.aox0;
import defpackage.c90;
import defpackage.ci70;
import defpackage.cma1;
import defpackage.dip0;
import defpackage.dzg0;
import defpackage.ec6;
import defpackage.efv0;
import defpackage.ekj0;
import defpackage.fc6;
import defpackage.fnx0;
import defpackage.g18;
import defpackage.g1f0;
import defpackage.gix0;
import defpackage.gvz0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.iix0;
import defpackage.j8u0;
import defpackage.jl40;
import defpackage.k8u0;
import defpackage.l8u0;
import defpackage.mi31;
import defpackage.nhx0;
import defpackage.nip0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pex0;
import defpackage.qhx0;
import defpackage.qje;
import defpackage.rhx0;
import defpackage.s5w0;
import defpackage.sgx0;
import defpackage.sls;
import defpackage.sm91;
import defpackage.t1w;
import defpackage.thx0;
import defpackage.tje;
import defpackage.vng;
import defpackage.w511;
import defpackage.x4e;
import defpackage.xfh0;
import defpackage.xix0;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.xrh0;
import defpackage.xvy0;
import defpackage.xw31;
import defpackage.y7r;
import defpackage.yfh0;
import defpackage.yhx0;
import defpackage.z0a0;
import defpackage.zpj0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001iB{\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010#J\u000f\u0010-\u001a\u00020!H\u0016¢\u0006\u0004\b-\u0010#J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00104\u001a\u00020!2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020!H\u0002¢\u0006\u0004\b6\u0010#J\u0017\u00108\u001a\u0002072\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020!2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u0002072\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ)\u0010D\u001a\u00020!\"\f\b\u0000\u0010C*\u00020)*\u00020B*\u00028\u00002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010LR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010NR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010OR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u00060iR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001b\u0010p\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001b\u0010s\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010m\u001a\u0004\br\u0010oR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010+¨\u0006z"}, d2 = {"Lcom/yandex/go/tariffcard/ui/TariffOptionsCardView;", "Landroid/widget/FrameLayout;", "Lefv0;", "Landroid/content/Context;", "context", "Liix0;", "presenter", "Lrhx0;", "cardAdapterFactory", "Lz0a0;", "paymentIconLoader", "Ladx0;", "priceVisibilityRepository", "Lec6;", "shadowRendererFactory", "Ldip0;", "scrollOnTariffChangeRepository", "Lyhx0;", "insetsRepository", "Ll8u0;", "statusBarThemeTracker", "Lgvz0;", "tooltipPlacementRepository", "Laox0;", "tariffSelectorViewHolderDelegateFactory", "Lru/yandex/taxi/summary/requirements/list/recycler/i;", "requirementItemsExternalDelegate", "Lekj0;", "requirementShowInteractor", "Lnhx0;", "tariffOptionsAnimationRepository", "<init>", "(Landroid/content/Context;Liix0;Lrhx0;Lz0a0;Ladx0;Lec6;Ldip0;Lyhx0;Ll8u0;Lgvz0;Laox0;Lru/yandex/taxi/summary/requirements/list/recycler/i;Lekj0;Lnhx0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/taxi/summary/shared/expanded/SummaryExpandedView$ScrollingState;", "scrollingState", "setScrollingState", "(Lcom/yandex/go/taxi/summary/shared/expanded/SummaryExpandedView$ScrollingState;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "onGoingToExpand", "onGoingToHide", "", "applyThemeForChildrenByDefault", "()Z", "allowTraverse", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "scrollToStart", "Landroid/graphics/drawable/Drawable;", "getFadeGradientDrawable", "(Lru/yandex/taxi/theme/ThemeType;)Landroid/graphics/drawable/Drawable;", "", "headerTariffClass", "scrollIfHeaderTariffChanged", "(Ljava/lang/String;)V", "Lcom/yandex/go/tariffcard/api/experiment/HeaderCollapseButtonType;", "headerCollapseButtonType", "iconByType", "(Lcom/yandex/go/tariffcard/api/experiment/HeaderCollapseButtonType;)Landroid/graphics/drawable/Drawable;", "Lnwy0;", "T", "applyThemeToTree", "(Landroid/view/View;Lru/yandex/taxi/theme/ThemeType;)V", "Liix0;", "Lrhx0;", "Lz0a0;", "Ldip0;", "Lyhx0;", "Ll8u0;", "Lgvz0;", "Laox0;", "Lru/yandex/taxi/summary/requirements/list/recycler/i;", "Lekj0;", "Lnhx0;", "Lthx0;", "binding", "Lthx0;", "Lqhx0;", "cardAdapter", "Lqhx0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lg1f0;", "priceVisibilityScrollListener", "Lg1f0;", "Lj8u0;", "statusBarThemeScrollListener", "Lj8u0;", "Lcom/yandex/go/tariffcard/ui/a;", "bottomContainerShadowListener", "Lcom/yandex/go/tariffcard/ui/a;", "Lzpj0;", "requirementsShowListener", "Lzpj0;", "Lg18;", "insetsCancellable", "Lg18;", "Lcom/yandex/go/tariffcard/ui/o0;", "mvpView", "Lcom/yandex/go/tariffcard/ui/o0;", "lightThemeFade$delegate", "Li3y;", "getLightThemeFade", "()Landroid/graphics/drawable/Drawable;", "lightThemeFade", "darkThemeFade$delegate", "getDarkThemeFade", "darkThemeFade", "Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/RecyclerViewItemAnimationManager;", "Luhx0;", "animationManager", "Lcom/yandex/go/tariffcard/ui/recyclerview/animationmanager/RecyclerViewItemAnimationManager;", "getFocusedView", "focusedView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffOptionsCardView extends FrameLayout implements efv0 {
    private final RecyclerViewItemAnimationManager animationManager;
    private final thx0 binding;
    private final a bottomContainerShadowListener;
    private qhx0 cardAdapter;
    private final rhx0 cardAdapterFactory;

    /* renamed from: darkThemeFade$delegate, reason: from kotlin metadata */
    private final i3y darkThemeFade;
    private final g18 insetsCancellable;
    private final yhx0 insetsRepository;

    /* renamed from: lightThemeFade$delegate, reason: from kotlin metadata */
    private final i3y lightThemeFade;
    private final LinearLayoutManager linearLayoutManager;
    private final o0 mvpView;
    private final z0a0 paymentIconLoader;
    private final iix0 presenter;
    private final g1f0 priceVisibilityScrollListener;
    private final ru.yandex.taxi.summary.requirements.list.recycler.i requirementItemsExternalDelegate;
    private final ekj0 requirementShowInteractor;
    private final zpj0 requirementsShowListener;
    private final dip0 scrollOnTariffChangeRepository;
    private final j8u0 statusBarThemeScrollListener;
    private final l8u0 statusBarThemeTracker;
    private final nhx0 tariffOptionsAnimationRepository;
    private final aox0 tariffSelectorViewHolderDelegateFactory;
    private final gvz0 tooltipPlacementRepository;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffOptionsCardView$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((iix0) this.receiver).y.b();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffOptionsCardView$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((iix0) this.receiver).y.a();
            return zy11.a;
        }
    }

    public TariffOptionsCardView(Context context, final iix0 iix0Var, rhx0 rhx0Var, z0a0 z0a0Var, adx0 adx0Var, ec6 ec6Var, dip0 dip0Var, yhx0 yhx0Var, l8u0 l8u0Var, gvz0 gvz0Var, aox0 aox0Var, ru.yandex.taxi.summary.requirements.list.recycler.i iVar, ekj0 ekj0Var, nhx0 nhx0Var) {
        super(context);
        Throwable th;
        this.presenter = iix0Var;
        this.cardAdapterFactory = rhx0Var;
        this.paymentIconLoader = z0a0Var;
        this.scrollOnTariffChangeRepository = dip0Var;
        this.insetsRepository = yhx0Var;
        this.statusBarThemeTracker = l8u0Var;
        this.tooltipPlacementRepository = gvz0Var;
        this.tariffSelectorViewHolderDelegateFactory = aox0Var;
        this.requirementItemsExternalDelegate = iVar;
        this.requirementShowInteractor = ekj0Var;
        this.tariffOptionsAnimationRepository = nhx0Var;
        LayoutInflater.from(context).inflate(xrh0.tariff_options_card, this);
        int i = yfh0.bubble_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
        if (frameLayout != null) {
            i = yfh0.scroll_button;
            TariffCardScrollButtonView tariffCardScrollButtonView = (TariffCardScrollButtonView) cma1.O(i, this);
            if (tariffCardScrollButtonView != null) {
                i = yfh0.tariff_card_bottom_container_shadow;
                ImageView imageView = (ImageView) cma1.O(i, this);
                if (imageView != null) {
                    i = xfh0.tariff_card_content;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, this);
                    if (recyclerView != null) {
                        i = yfh0.tariff_card_order_button_container;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
                        if (linearLayout != null) {
                            i = yfh0.tariff_options_card_footer_collapse_icon;
                            GoImageView goImageView = (GoImageView) cma1.O(i, this);
                            if (goImageView != null) {
                                i = yfh0.tariff_options_card_footer_collapse_icon_disabled_space;
                                Space space = (Space) cma1.O(i, this);
                                if (space != null) {
                                    i = yfh0.tariff_options_card_header_collapse_button;
                                    FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) cma1.O(i, this);
                                    if (floatButtonIconComponent != null) {
                                        i = yfh0.tariff_options_card_order_button;
                                        OrderButtonComponent orderButtonComponent = (OrderButtonComponent) cma1.O(i, this);
                                        if (orderButtonComponent != null) {
                                            i = yfh0.tariff_options_card_payment_icon;
                                            CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) cma1.O(i, this);
                                            if (compositePaymentIconsView != null) {
                                                i = yfh0.top_card_fade;
                                                View O = cma1.O(i, this);
                                                if (O == null) {
                                                    th = null;
                                                    ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
                                                    throw th;
                                                }
                                                this.binding = new thx0(this, frameLayout, tariffCardScrollButtonView, imageView, recyclerView, linearLayout, goImageView, space, floatButtonIconComponent, orderButtonComponent, compositePaymentIconsView, O);
                                                final int i2 = 1;
                                                final int i3 = 0;
                                                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
                                                this.linearLayoutManager = linearLayoutManager;
                                                this.priceVisibilityScrollListener = new g1f0(linearLayoutManager, adx0Var);
                                                this.statusBarThemeScrollListener = new j8u0(linearLayoutManager, l8u0Var);
                                                this.bottomContainerShadowListener = new a(recyclerView, imageView, (ru.yandex.taxi.design.utils.b) ((fc6) ec6Var).a.a.get());
                                                this.requirementsShowListener = new zpj0(linearLayoutManager, ekj0Var);
                                                this.insetsCancellable = tje.i(recyclerView, 119, new s5w0(12, this));
                                                this.mvpView = new o0(this);
                                                this.lightThemeFade = kotlin.a.a(new sls(this) { // from class: vix0
                                                    public final /* synthetic */ TariffOptionsCardView b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        Drawable lightThemeFade_delegate$lambda$0;
                                                        Drawable darkThemeFade_delegate$lambda$0;
                                                        zy11 _init_$lambda$1;
                                                        int i4 = i3;
                                                        TariffOptionsCardView tariffOptionsCardView = this.b;
                                                        switch (i4) {
                                                            case 0:
                                                                lightThemeFade_delegate$lambda$0 = TariffOptionsCardView.lightThemeFade_delegate$lambda$0(tariffOptionsCardView);
                                                                return lightThemeFade_delegate$lambda$0;
                                                            case 1:
                                                                darkThemeFade_delegate$lambda$0 = TariffOptionsCardView.darkThemeFade_delegate$lambda$0(tariffOptionsCardView);
                                                                return darkThemeFade_delegate$lambda$0;
                                                            default:
                                                                _init_$lambda$1 = TariffOptionsCardView._init_$lambda$1(tariffOptionsCardView);
                                                                return _init_$lambda$1;
                                                        }
                                                    }
                                                });
                                                this.darkThemeFade = kotlin.a.a(new sls(this) { // from class: vix0
                                                    public final /* synthetic */ TariffOptionsCardView b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        Drawable lightThemeFade_delegate$lambda$0;
                                                        Drawable darkThemeFade_delegate$lambda$0;
                                                        zy11 _init_$lambda$1;
                                                        int i4 = i2;
                                                        TariffOptionsCardView tariffOptionsCardView = this.b;
                                                        switch (i4) {
                                                            case 0:
                                                                lightThemeFade_delegate$lambda$0 = TariffOptionsCardView.lightThemeFade_delegate$lambda$0(tariffOptionsCardView);
                                                                return lightThemeFade_delegate$lambda$0;
                                                            case 1:
                                                                darkThemeFade_delegate$lambda$0 = TariffOptionsCardView.darkThemeFade_delegate$lambda$0(tariffOptionsCardView);
                                                                return darkThemeFade_delegate$lambda$0;
                                                            default:
                                                                _init_$lambda$1 = TariffOptionsCardView._init_$lambda$1(tariffOptionsCardView);
                                                                return _init_$lambda$1;
                                                        }
                                                    }
                                                });
                                                this.animationManager = new RecyclerViewItemAnimationManager();
                                                setClipChildren(false);
                                                recyclerView.setLayoutManager(linearLayoutManager);
                                                recyclerView.setHasFixedSize(true);
                                                recyclerView.setItemAnimator(null);
                                                ru.yandex.taxi.design.utils.c.z(new AnonymousClass2(0, iix0Var, iix0.class, "paymentMethodClicked", "paymentMethodClicked()V", 0), compositePaymentIconsView);
                                                orderButtonComponent.setDebounceClickListener(new Runnable() { // from class: wix0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i4 = i3;
                                                        iix0 iix0Var2 = iix0Var;
                                                        switch (i4) {
                                                            case 0:
                                                                TariffOptionsCardView._init_$orderClicked(iix0Var2);
                                                                break;
                                                            default:
                                                                TariffOptionsCardView._init_$collapseCard(iix0Var2);
                                                                break;
                                                        }
                                                    }
                                                });
                                                ru.yandex.taxi.design.utils.c.z(new AnonymousClass4(0, iix0Var, iix0.class, "collapseCard", "collapseCard()V", 0), goImageView);
                                                floatButtonIconComponent.setDebounceClickListener(new Runnable() { // from class: wix0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i4 = i2;
                                                        iix0 iix0Var2 = iix0Var;
                                                        switch (i4) {
                                                            case 0:
                                                                TariffOptionsCardView._init_$orderClicked(iix0Var2);
                                                                break;
                                                            default:
                                                                TariffOptionsCardView._init_$collapseCard(iix0Var2);
                                                                break;
                                                        }
                                                    }
                                                });
                                                final int i4 = 2;
                                                ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: vix0
                                                    public final /* synthetic */ TariffOptionsCardView b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        Drawable lightThemeFade_delegate$lambda$0;
                                                        Drawable darkThemeFade_delegate$lambda$0;
                                                        zy11 _init_$lambda$1;
                                                        int i42 = i4;
                                                        TariffOptionsCardView tariffOptionsCardView = this.b;
                                                        switch (i42) {
                                                            case 0:
                                                                lightThemeFade_delegate$lambda$0 = TariffOptionsCardView.lightThemeFade_delegate$lambda$0(tariffOptionsCardView);
                                                                return lightThemeFade_delegate$lambda$0;
                                                            case 1:
                                                                darkThemeFade_delegate$lambda$0 = TariffOptionsCardView.darkThemeFade_delegate$lambda$0(tariffOptionsCardView);
                                                                return darkThemeFade_delegate$lambda$0;
                                                            default:
                                                                _init_$lambda$1 = TariffOptionsCardView._init_$lambda$1(tariffOptionsCardView);
                                                                return _init_$lambda$1;
                                                        }
                                                    }
                                                }, tariffCardScrollButtonView);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        th = null;
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$collapseCard(iix0 iix0Var) {
        iix0Var.y.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(TariffOptionsCardView tariffOptionsCardView) {
        iix0 iix0Var = tariffOptionsCardView.presenter;
        qhx0 qhx0Var = tariffOptionsCardView.cardAdapter;
        List list = qhx0Var != null ? qhx0Var.x.f : null;
        if (list == null) {
            iix0Var.getClass();
        } else {
            iix0Var.R.getClass();
            int a = y7r.a(list);
            if (a != -1) {
                ((gix0) iix0Var.Dg()).ge(a);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$orderClicked(iix0 iix0Var) {
        pex0 pex0Var;
        sgx0 sgx0Var;
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) iix0Var.z).n();
        mi31 mi31Var = n != null ? n.a : null;
        if (mi31Var != null && (pex0Var = mi31Var.a) != null && (sgx0Var = pex0Var.J0) != null) {
            ((ci70) iix0Var.I).E = Events$Summary$SummaryState.EXPANDED;
            iix0Var.y.e(sgx0Var);
        }
        iix0Var.E.b(mi31Var != null ? mi31Var.f : null, mi31Var != null ? mi31Var.b : null);
        iix0Var.F.a(iix0Var.O.q());
    }

    private final <T extends View & nwy0> void applyThemeToTree(T t, ThemeType themeType) {
        xvy0.b(t, themeType, false, new c90(21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyThemeToTree$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable darkThemeFade_delegate$lambda$0(TariffOptionsCardView tariffOptionsCardView) {
        return sm91.b(kotlin.collections.b.i(new Pair(Integer.valueOf(ru.yandex.taxi.design.utils.c.a(xqg0.transparent, tariffOptionsCardView)), Float.valueOf(0.0f)), new Pair(Integer.valueOf(tariffOptionsCardView.getContext().getColor(xqg0.transparent_70_black)), Float.valueOf(1.0f))));
    }

    private final Drawable getDarkThemeFade() {
        return (Drawable) this.darkThemeFade.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getFadeGradientDrawable(ThemeType themeType) {
        boolean z = themeType == ThemeType.LIGHT;
        if (z) {
            return getLightThemeFade();
        }
        if (!z) {
            return getDarkThemeFade();
        }
        w511.b();
        return null;
    }

    private final Drawable getLightThemeFade() {
        return (Drawable) this.lightThemeFade.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable iconByType(HeaderCollapseButtonType headerCollapseButtonType) {
        int i = xix0.a[headerCollapseButtonType.ordinal()];
        if (i == 1) {
            int i2 = xw31.n(getContext()) ? dzg0.ic_arrow_right : dzg0.ic_arrow_left;
            Drawable t = vng.t(i2, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
            if (t != null) {
                return t;
            }
            w511.f(oyr.j(i2, "Drawable resource ", " not found"));
            return null;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        int i3 = dzg0.ic_cross_close;
        Drawable t2 = vng.t(i3, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t2 != null) {
            return t2;
        }
        w511.f(oyr.j(i3, "Drawable resource ", " not found"));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean insetsCancellable$lambda$0(TariffOptionsCardView tariffOptionsCardView, t1w t1wVar) {
        Object value;
        xw31.E(tariffOptionsCardView.binding.h, null, Integer.valueOf(t1wVar.b - tje.u(24, tariffOptionsCardView.getContext())), null, null);
        x4e.z(t1wVar.b, tariffOptionsCardView.insetsRepository.a, null);
        l8u0 l8u0Var = tariffOptionsCardView.statusBarThemeTracker;
        int i = t1wVar.b;
        kotlinx.coroutines.flow.r0 r0Var = l8u0Var.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, k8u0.a((k8u0) value, false, null, false, i > 0, false, 23)));
        View view = tariffOptionsCardView.binding.k;
        ru.yandex.taxi.design.utils.c.D(view.getLayoutParams().width, t1wVar.b, view);
        tariffOptionsCardView.statusBarThemeScrollListener.c = t1wVar.b;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable lightThemeFade_delegate$lambda$0(TariffOptionsCardView tariffOptionsCardView) {
        return sm91.b(kotlin.collections.b.i(new Pair(Integer.valueOf(ru.yandex.taxi.design.utils.c.a(xqg0.transparent, tariffOptionsCardView)), Float.valueOf(0.0f)), new Pair(Integer.valueOf(tariffOptionsCardView.getContext().getColor(xqg0.transparent_90_white)), Float.valueOf(0.75f)), new Pair(Integer.valueOf(tariffOptionsCardView.getContext().getColor(xqg0.white)), Float.valueOf(1.0f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollIfHeaderTariffChanged(String headerTariffClass) {
        nip0 nip0Var = (nip0) this.scrollOnTariffChangeRepository.a.getValue();
        if (!jl40.l(headerTariffClass, nip0Var.a) || nip0Var.b) {
            return;
        }
        scrollToStart();
        kotlinx.coroutines.flow.r0 r0Var = this.scrollOnTariffChangeRepository.a;
        r0Var.m(null, new nip0(((nip0) r0Var.getValue()).a, true));
    }

    private final void scrollToStart() {
        this.linearLayoutManager.r(0, 0);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.d.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, getContext())));
        this.binding.e.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgFloating, getContext())));
        a aVar = this.bottomContainerShadowListener;
        tje.N(aVar.d, null, null, new BottomContainerShadowListener$applyTheme$1(aVar, null), 3);
        qhx0 qhx0Var = this.cardAdapter;
        if (qhx0Var != null) {
            qhx0Var.applyTheme(themeType);
        }
        this.binding.i.applyTheme(themeType);
        this.binding.f.applyTheme(themeType);
        this.binding.h.applyTheme(themeType);
        applyThemeToTree(this.binding.c, themeType);
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // defpackage.efv0
    public View asView() {
        return this;
    }

    @Override // defpackage.efv0
    public View getFocusedView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        iix0 iix0Var = this.presenter;
        o0 o0Var = this.mvpView;
        iix0Var.Bg(o0Var);
        iix0Var.M.a();
        tje.N(iix0Var.Jg(), null, null, new TariffOptionsCardPresenter$attachView$1(iix0Var, o0Var, null), 3);
        tje.N(iix0Var.Jg(), null, null, new TariffOptionsCardPresenter$attachView$2(iix0Var, null), 3);
        tje.N(iix0Var.Jg(), null, null, new TariffOptionsCardPresenter$attachView$3(iix0Var, o0Var, null), 3);
        tje.N(iix0Var.Jg(), null, null, new TariffOptionsCardPresenter$attachView$4(iix0Var, o0Var, null), 3);
        l8u0 l8u0Var = this.statusBarThemeTracker;
        hbp0 hbp0Var = l8u0Var.d;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new StatusBarThemeTracker$attach$1(l8u0Var, null), 3);
        this.binding.d.addOnScrollListener(this.priceVisibilityScrollListener);
        this.binding.d.addOnScrollListener(this.bottomContainerShadowListener);
        this.binding.d.addOnScrollListener(this.statusBarThemeScrollListener);
        this.binding.d.addOnScrollListener(this.requirementsShowListener);
        this.animationManager.a(this.binding.d);
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        l8u0 l8u0Var = this.statusBarThemeTracker;
        l8u0Var.d.b();
        if (((k8u0) l8u0Var.b.getValue()).e) {
            l8u0Var.a();
        }
        this.binding.d.removeOnScrollListener(this.priceVisibilityScrollListener);
        this.binding.d.removeOnScrollListener(this.bottomContainerShadowListener);
        this.binding.d.removeOnScrollListener(this.statusBarThemeScrollListener);
        this.binding.d.removeOnScrollListener(this.requirementsShowListener);
        this.animationManager.c();
        this.insetsCancellable.cancel();
    }

    @Override // defpackage.efv0
    public void onGoingToExpand() {
        Object value;
        kotlinx.coroutines.flow.r0 r0Var = this.statusBarThemeTracker.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, k8u0.a((k8u0) value, true, null, false, false, false, 30)));
    }

    @Override // defpackage.efv0
    public void onGoingToHide() {
        Object value;
        kotlinx.coroutines.flow.r0 r0Var = this.statusBarThemeTracker.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, k8u0.a((k8u0) value, false, null, false, false, false, 30)));
    }

    @Override // defpackage.efv0
    public void setScrollingState(SummaryExpandedView$ScrollingState scrollingState) {
        this.bottomContainerShadowListener.b();
    }
}
