package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.RideCardAdaptiveLinearLayoutManager;
import defpackage.ars0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.e2y;
import defpackage.f1h0;
import defpackage.hg;
import defpackage.hxj0;
import defpackage.i3y;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.kqe0;
import defpackage.mqs0;
import defpackage.n4h0;
import defpackage.nqs0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.obk0;
import defpackage.p8h0;
import defpackage.p9y0;
import defpackage.pbk0;
import defpackage.qbk0;
import defpackage.qje;
import defpackage.t590;
import defpackage.tje;
import defpackage.vng;
import defpackage.wrs0;
import defpackage.xck0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yck0;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00142\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardAiBubbleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "defStyleRes", "Lp9y0;", "actionHandler", "Lars0;", "slotItemButtonViewFactory", "Lcom/yandex/go/taxi/order/details/v2/analytics/g;", "analytics", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILp9y0;Lars0;Lcom/yandex/go/taxi/order/details/v2/analytics/g;)V", "Lpbk0;", "title", "Lzy11;", "renderTitle", "(Lpbk0;)V", "Lobk0;", "content", "renderContent", "(Lobk0;)V", "Lnqs0;", "slotItemAction", "Lwrs0;", "setAction", "(Lnqs0;Lwrs0;)V", "", "Lyck0;", "buttons", "renderButtons", "(Ljava/util/List;)V", "Lqbk0;", "uiState", "render", "(Lqbk0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lp9y0;", "Lars0;", "Lcom/yandex/go/taxi/order/details/v2/analytics/g;", "Le2y;", "binding", "Le2y;", "Lxck0;", "buttonsAdapter$delegate", "Li3y;", "getButtonsAdapter", "()Lxck0;", "buttonsAdapter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardAiBubbleView extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;
    private final p9y0 actionHandler;
    private final g analytics;
    private e2y binding;

    /* renamed from: buttonsAdapter$delegate, reason: from kotlin metadata */
    private final i3y buttonsAdapter;
    private final ars0 slotItemButtonViewFactory;

    public RideCardAiBubbleView(Context context, AttributeSet attributeSet, int i, int i2, p9y0 p9y0Var, ars0 ars0Var, g gVar) {
        super(context, attributeSet, i, i2);
        this.actionHandler = p9y0Var;
        this.slotItemButtonViewFactory = ars0Var;
        this.analytics = gVar;
        LayoutInflater.from(context).inflate(zkh0.layout_ride_card_ai_bubble, this);
        int i3 = p8h0.bottom_spacer;
        if (((Space) cma1.O(i3, this)) != null) {
            i3 = p8h0.iv_background_ripple;
            GoImageView goImageView = (GoImageView) cma1.O(i3, this);
            if (goImageView != null) {
                i3 = p8h0.iv_chevron_image;
                GoImageView goImageView2 = (GoImageView) cma1.O(i3, this);
                if (goImageView2 != null) {
                    i3 = p8h0.iv_end_buttons_gradient;
                    GoImageView goImageView3 = (GoImageView) cma1.O(i3, this);
                    if (goImageView3 != null) {
                        i3 = p8h0.iv_start_buttons_gradient;
                        GoImageView goImageView4 = (GoImageView) cma1.O(i3, this);
                        if (goImageView4 != null) {
                            i3 = p8h0.iv_title_image;
                            GoImageView goImageView5 = (GoImageView) cma1.O(i3, this);
                            if (goImageView5 != null) {
                                i3 = p8h0.rv_buttons;
                                RecyclerView recyclerView = (RecyclerView) cma1.O(i3, this);
                                if (recyclerView != null) {
                                    i3 = p8h0.tv_content_text;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
                                    if (robotoTextView != null) {
                                        i3 = p8h0.tv_title_text;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, this);
                                        if (robotoTextView2 != null) {
                                            this.binding = new e2y(this, goImageView, goImageView2, goImageView3, goImageView4, goImageView5, recyclerView, robotoTextView, robotoTextView2);
                                            this.buttonsAdapter = a.a(new o8k0(1, context, this));
                                            RecyclerView recyclerView2 = this.binding.g;
                                            recyclerView2.setLayoutManager(new RideCardAdaptiveLinearLayoutManager(context));
                                            recyclerView2.addItemDecoration(new t590(tje.u(4, recyclerView2.getContext())));
                                            recyclerView2.setClipChildren(false);
                                            recyclerView2.setClipToPadding(false);
                                            recyclerView2.setItemAnimator(null);
                                            recyclerView2.setNestedScrollingEnabled(false);
                                            recyclerView2.setClipToOutline(true);
                                            recyclerView2.setVisibility(8);
                                            recyclerView2.setAdapter(getButtonsAdapter());
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
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xck0 buttonsAdapter_delegate$lambda$0(Context context, RideCardAiBubbleView rideCardAiBubbleView) {
        return new xck0(context, rideCardAiBubbleView.actionHandler, rideCardAiBubbleView.slotItemButtonViewFactory, rideCardAiBubbleView.analytics);
    }

    private final xck0 getButtonsAdapter() {
        return (xck0) this.buttonsAdapter.getValue();
    }

    private final void renderButtons(List<yck0> buttons) {
        boolean isEmpty = buttons.isEmpty();
        getButtonsAdapter().submitList(buttons, new hxj0(4, this));
        e2y e2yVar = this.binding;
        e2yVar.g.setVisibility(!isEmpty ? 0 : 8);
        int i = isEmpty ? 4 : 16;
        RobotoTextView robotoTextView = e2yVar.h;
        robotoTextView.setPadding(robotoTextView.getPaddingLeft(), robotoTextView.getPaddingTop(), robotoTextView.getPaddingRight(), (int) tje.w(i, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButtons$lambda$0(RideCardAiBubbleView rideCardAiBubbleView) {
        e2y e2yVar = rideCardAiBubbleView.binding;
        e2yVar.g.post(new hxj0(3, e2yVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButtons$lambda$0$0$0(e2y e2yVar) {
        RecyclerView recyclerView = e2yVar.g;
        GoImageView goImageView = e2yVar.e;
        GoImageView goImageView2 = e2yVar.d;
        boolean canScrollHorizontally = recyclerView.canScrollHorizontally(xw31.n(recyclerView.getContext()) ? -1 : 1);
        goImageView2.setVisibility(canScrollHorizontally ? 0 : 8);
        goImageView.setVisibility(canScrollHorizontally ? 0 : 8);
        goImageView2.setClipToOutline(true);
        goImageView.setClipToOutline(true);
    }

    private final void renderContent(obk0 content) {
        this.binding.h.setText(content.a);
    }

    private final void renderTitle(pbk0 title) {
        this.binding.f.setImageDrawable(title.a);
        this.binding.i.setText(title.b);
    }

    private final void setAction(nqs0 slotItemAction, wrs0 analytics) {
        boolean z = slotItemAction instanceof mqs0;
        boolean z2 = !z;
        b.p(this, !z ? hg.a : null);
        this.binding.c.setVisibility(!z ? 0 : 8);
        e2y e2yVar = this.binding;
        if (z) {
            e2yVar.a.setOnClickListener(null);
        } else {
            c.z(new kqe0(11, slotItemAction, this, analytics), e2yVar.a);
        }
        setClickable(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setAction$lambda$0(nqs0 nqs0Var, RideCardAiBubbleView rideCardAiBubbleView, wrs0 wrs0Var) {
        ibk0 a = ijk0.a(nqs0Var);
        if (a != null) {
            rideCardAiBubbleView.actionHandler.a(a, wrs0Var);
        }
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        e2y e2yVar = this.binding;
        e2yVar.f.applyTheme(themeType);
        e2yVar.i.applyTheme(themeType);
        e2yVar.h.applyTheme(themeType);
        GoImageView goImageView = e2yVar.b;
        goImageView.setBackground(vng.t(n4h0.bg_ai_bubble_ripple, getContext()));
        goImageView.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMinor, getContext())));
        GoImageView goImageView2 = e2yVar.c;
        goImageView2.setBackground(vng.t(f1h0.float_circle_button, getContext()));
        goImageView2.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgFloating, getContext())));
        goImageView2.setImageDrawable(vng.t(dzg0.ic_chevron, getContext()));
        e2yVar.d.setImageDrawable(vng.t(n4h0.ai_bubble_end_gradient, getContext()));
        e2yVar.e.setImageDrawable(vng.t(n4h0.ai_bubble_start_gradient, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void render(qbk0 uiState) {
        renderTitle(uiState.c);
        renderContent(uiState.d);
        renderButtons(uiState.f);
        setAction(uiState.e, uiState.g);
    }

    public RideCardAiBubbleView(Context context, AttributeSet attributeSet, int i, p9y0 p9y0Var, ars0 ars0Var, g gVar) {
        this(context, attributeSet, i, 0, p9y0Var, ars0Var, gVar, 8, null);
    }

    public RideCardAiBubbleView(Context context, AttributeSet attributeSet, p9y0 p9y0Var, ars0 ars0Var, g gVar) {
        this(context, attributeSet, 0, 0, p9y0Var, ars0Var, gVar, 12, null);
    }

    public RideCardAiBubbleView(Context context, p9y0 p9y0Var, ars0 ars0Var, g gVar) {
        this(context, null, 0, 0, p9y0Var, ars0Var, gVar, 14, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RideCardAiBubbleView(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, defpackage.p9y0 r13, defpackage.ars0 r14, com.yandex.go.taxi.order.details.v2.analytics.g r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            r10 = r16 & 4
            r0 = 0
            if (r10 == 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r11
        Le:
            r10 = r16 & 8
            if (r10 == 0) goto L19
            r4 = r0
            r1 = r9
            r5 = r13
            r6 = r14
            r7 = r15
            r0 = r8
            goto L1f
        L19:
            r4 = r12
            r0 = r8
            r1 = r9
            r5 = r13
            r6 = r14
            r7 = r15
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView.<init>(android.content.Context, android.util.AttributeSet, int, int, p9y0, ars0, com.yandex.go.taxi.order.details.v2.analytics.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
