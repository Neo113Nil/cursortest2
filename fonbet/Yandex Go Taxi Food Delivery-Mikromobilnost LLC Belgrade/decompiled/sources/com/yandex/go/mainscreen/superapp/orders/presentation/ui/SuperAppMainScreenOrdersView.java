package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.ate0;
import defpackage.bua0;
import defpackage.bys;
import defpackage.chw0;
import defpackage.dgh0;
import defpackage.e991;
import defpackage.fb80;
import defpackage.jl40;
import defpackage.jyw0;
import defpackage.kmr;
import defpackage.kyw0;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pfs0;
import defpackage.qoi0;
import defpackage.r2w0;
import defpackage.rr00;
import defpackage.s2w0;
import defpackage.tdc;
import defpackage.tje;
import defpackage.udc;
import defpackage.vaf0;
import defpackage.veu;
import defpackage.w601;
import defpackage.wn70;
import defpackage.xth0;
import defpackage.yaf0;
import defpackage.zl70;
import defpackage.zxs;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB+\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u001f\u0010'\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0016H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0014¢\u0006\u0004\b+\u0010*J!\u0010.\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J/\u00108\u001a\u00020\u00162\u0006\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020$H\u0014¢\u0006\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u001a\u0010<\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010*R\u0014\u0010?\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R(\u0010F\u001a\u0004\u0018\u00010\u000e2\b\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/orders/presentation/ui/SuperAppMainScreenOrdersView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lfb80;", "Lnwy0;", "Landroid/content/Context;", "context", "Lr2w0;", "presenter", "Ljyw0;", "swipeableTrackingCardItemTypeFactory", "Lcom/yandex/go/superapp/orders/card/experiments/y;", "superappTrackingCardRepository", "<init>", "(Landroid/content/Context;Lr2w0;Ljyw0;Lcom/yandex/go/superapp/orders/card/experiments/y;)V", "Lwn70;", "style", "Lbys;", "Lrr00;", "createAdapter", "(Lwn70;)Lbys;", "", "animatedValue", "Lzy11;", "decorateOrderSpace", "(F)V", "Landroid/graphics/RectF;", "paddings", "changeOrderSpacings", "(Landroid/graphics/RectF;)V", "Landroid/view/ViewGroup;", "parentRecyclerView", "()Landroid/view/ViewGroup;", "", "allowTraverse", "()Z", "applyThemeForChildrenByDefault", "", "widthSpec", "heightSpec", "onMeasure", "(II)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "filter", "bind", "(Ljava/lang/String;Lwn70;)V", "Lpfs0;", "appearanceState", "changeAppearanceState", "(Lpfs0;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lr2w0;", "Ljyw0;", "isTrackingsRedesignEnabled", "Z", "isTrackingsRedesignEnabled$annotations", "itemTopPadding", CA20Status.STATUS_USER_I, "itemBottomPadding", "itemHorizontalPaddings", "redesignedElementSpacing", "redesignedVerticalPadding", "value", "cardStyle", "Lwn70;", "setCardStyle", "(Lwn70;)V", "cardAdapter", "Lbys;", "Ludc;", "colorDelegate", "Ludc;", "Lbua0;", "percentageItemDecorator", "Lbua0;", "s2w0", "orders"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenOrdersView extends RecyclerView implements fb80, nwy0 {
    private bys cardAdapter;
    private wn70 cardStyle;
    private udc colorDelegate;
    private final boolean isTrackingsRedesignEnabled;
    private final int itemBottomPadding;
    private final int itemHorizontalPaddings;
    private final int itemTopPadding;
    private final bua0 percentageItemDecorator;
    private final r2w0 presenter;
    private final int redesignedElementSpacing;
    private final int redesignedVerticalPadding;
    private final jyw0 swipeableTrackingCardItemTypeFactory;

    public SuperAppMainScreenOrdersView(Context context, r2w0 r2w0Var, jyw0 jyw0Var, y yVar) {
        super(context);
        this.presenter = r2w0Var;
        this.swipeableTrackingCardItemTypeFactory = jyw0Var;
        boolean u = yVar.u();
        this.isTrackingsRedesignEnabled = u;
        int u2 = tje.u(18, getContext());
        this.itemTopPadding = u2;
        int r = tje.r(mrg0.go_design_m_space, getContext());
        this.itemBottomPadding = r;
        int r2 = tje.r(mrg0.go_design_m_space, getContext());
        this.itemHorizontalPaddings = r2;
        int u3 = tje.u(4, getContext());
        this.redesignedElementSpacing = u3;
        int u4 = tje.u(8, getContext());
        this.redesignedVerticalPadding = u4;
        setId(View.generateViewId());
        if (!u) {
            this.colorDelegate = new udc();
        }
        setLayoutManager(new LinearLayoutManager(context));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 1);
        bua0 bua0Var = new bua0(r2, r2, u ? u4 : u2, u ? u4 : r, u ? u3 : tje.u(10, getContext()), u ? u3 : tje.u(2, getContext()), u ? u4 : tje.u(8, getContext()));
        addItemDecoration(bua0Var);
        this.percentageItemDecorator = bua0Var;
        setImportantForAccessibility(2);
        setClipChildren(false);
        setClipToPadding(false);
        setNestedScrollingEnabled(false);
        setItemAnimator(null);
        new s(new g(new ate0(22, this))).f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr00 _init_$lambda$0(SuperAppMainScreenOrdersView superAppMainScreenOrdersView, int i) {
        bys bysVar = superAppMainScreenOrdersView.cardAdapter;
        if (bysVar != null) {
            return (rr00) bysVar.getItem(i);
        }
        return null;
    }

    private final void changeOrderSpacings(RectF paddings) {
        boolean f;
        if (paddings == null) {
            bua0 bua0Var = this.percentageItemDecorator;
            boolean z = this.isTrackingsRedesignEnabled;
            int i = z ? this.redesignedVerticalPadding : this.itemTopPadding;
            int i2 = z ? this.redesignedVerticalPadding : this.itemBottomPadding;
            int i3 = this.itemHorizontalPaddings;
            f = bua0Var.f(i3, i3, i, i2);
        } else {
            Float valueOf = Float.valueOf(paddings.left);
            if (e991.b(getContext())) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : paddings.right;
            Float valueOf2 = e991.b(getContext()) ? null : Float.valueOf(paddings.right);
            f = this.percentageItemDecorator.f(tje.v(getContext(), floatValue), tje.v(getContext(), valueOf2 != null ? valueOf2.floatValue() : paddings.left), tje.v(getContext(), paddings.top), tje.v(getContext(), paddings.bottom));
        }
        if (f) {
            invalidateItemDecorations();
        }
    }

    private final bys createAdapter(wn70 style) {
        jyw0 jyw0Var = this.swipeableTrackingCardItemTypeFactory;
        chw0 chw0Var = (chw0) this.presenter.L.getValue();
        chw0 chw0Var2 = (chw0) this.presenter.L.getValue();
        jyw0Var.getClass();
        zl70 zl70Var = new zl70(Collections.singletonList(new zxs(qoi0.a(kyw0.class), xth0.swipeable_tracking_card_item, EmptyList.a, new veu(jyw0Var, style, chw0Var, chw0Var2, 4))));
        setAdapter(zl70Var);
        return zl70Var;
    }

    private final void decorateOrderSpace(float animatedValue) {
        this.percentageItemDecorator.z = 1.0f - animatedValue;
        invalidateItemDecorations();
    }

    private static /* synthetic */ void isTrackingsRedesignEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x000d, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup parentRecyclerView() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
            while (viewGroup != null && !(viewGroup instanceof RecyclerView)) {
                ViewParent parent2 = viewGroup.getParent();
                if (parent2 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent2;
                }
            }
            return viewGroup;
        }
        viewGroup = null;
    }

    private final void setCardStyle(wn70 wn70Var) {
        if (jl40.l(this.cardStyle, wn70Var) || wn70Var == null) {
            return;
        }
        this.cardStyle = wn70Var;
        this.cardAdapter = createAdapter(wn70Var);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse, reason: from getter */
    public boolean getIsTrackingsRedesignEnabled() {
        return this.isTrackingsRedesignEnabled;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return this.isTrackingsRedesignEnabled;
    }

    @Override // defpackage.fb80
    public void bind(String filter, wn70 style) {
        udc udcVar;
        setCardStyle(style);
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                r2w0 r2w0Var = this.presenter;
                r2w0Var.getClass();
                w601 w601Var = new w601(filter != null ? new vaf0(filter, filter, ProductsScreenType$Type.TRACKING_LIST) : yaf0.b, style);
                r2w0Var.I.g(w601Var);
                r2w0Var.J = w601Var;
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            OrderCardView orderCardView = (OrderCardView) childAt.findViewById(dgh0.order_card);
            if (orderCardView != null && (udcVar = this.colorDelegate) != null) {
                udcVar.b.add(new WeakReference(orderCardView));
            }
            i = i2;
        }
    }

    @Override // defpackage.fb80
    public void changeAppearanceState(pfs0 appearanceState) {
        udc udcVar = this.colorDelegate;
        if (udcVar != null) {
            udcVar.a = appearanceState;
            Iterator it = udcVar.b.iterator();
            while (it.hasNext()) {
                OrderCardView orderCardView = (OrderCardView) ((WeakReference) it.next()).get();
                if (orderCardView != null) {
                    udcVar.a(orderCardView);
                }
            }
        }
        decorateOrderSpace(appearanceState.j);
        changeOrderSpacings(appearanceState.k);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        tdc tdcVar;
        super.onAttachedToWindow();
        this.presenter.Bg(new s2w0(this));
        udc udcVar = this.colorDelegate;
        if (udcVar == null || (tdcVar = udcVar.c) == null) {
            return;
        }
        addOnChildAttachStateChangeListener(tdcVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        tdc tdcVar;
        super.onDetachedFromWindow();
        this.presenter.Cg();
        udc udcVar = this.colorDelegate;
        if (udcVar != null && (tdcVar = udcVar.c) != null) {
            removeOnChildAttachStateChangeListener(tdcVar);
        }
        udc udcVar2 = this.colorDelegate;
        if (udcVar2 != null) {
            udcVar2.b.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        r2w0 r2w0Var = this.presenter;
        kmr kmrVar = r2w0Var.C;
        ((Boolean) r2w0Var.D.a.getValue()).getClass();
        kmrVar.getClass();
    }
}
