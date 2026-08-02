package com.ybsdk.feature.main.internal.widgets;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import defpackage.a6f0;
import defpackage.cwg0;
import defpackage.enm;
import defpackage.ex0;
import defpackage.g7f0;
import defpackage.h7f0;
import defpackage.i3y;
import defpackage.j1;
import defpackage.jr31;
import defpackage.kp50;
import defpackage.n7f0;
import defpackage.ny61;
import defpackage.o990;
import defpackage.qd00;
import defpackage.rcc;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 N2\u00020\u0001:\u0002\u0015OB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\nj\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u0002022\u0006\u00105\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000202H\u0002¢\u0006\u0004\b;\u0010<R\u001b\u0010A\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR*\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nj\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bM\u0010%¨\u0006P"}, d2 = {"Lcom/ybsdk/feature/main/internal/widgets/ProductCardListView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Ln7f0;", "Lzy11;", "listener", "setOnProductClickListener", "(Ltls;)V", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setActionHandler", "Lh7f0;", ClidProvider.STATE, "needsToShowStackAnimation", "render", "(Lh7f0;Z)V", "", "scrollProgress", "scrolledByYValue", "animateOnScroll", "(FF)V", "", "", "Landroid/view/View;", "getSharedProductCards", "()Ljava/util/Map;", "isAnimationInProgress", "()Z", "Lkotlin/Function0;", "doOnEnd", "(Lsls;)V", "cancelAnimation", "()V", "Lcom/ybsdk/feature/main/internal/widgets/ProductCardView;", "createProductCardView", "()Lcom/ybsdk/feature/main/internal/widgets/ProductCardView;", "cardView", "index", "updateProductCardView", "(Lcom/ybsdk/feature/main/internal/widgets/ProductCardView;Lh7f0;I)V", "Landroid/animation/Animator;", "getCombinedAnimator", "(Lh7f0;)Landroid/animation/Animator;", "viewToAnimate", "position", "getTranslateAnimator", "(Landroid/view/View;Lh7f0;I)Landroid/animation/Animator;", "getItemYOffset", "(Lh7f0;I)I", "getAlphaAnimator", "()Landroid/animation/Animator;", "productCardHeight$delegate", "Li3y;", "getProductCardHeight", "()I", "productCardHeight", "onProductClickListener", "Ltls;", "actionHandler", "currentState", "Lh7f0;", "combinedStackAnimator", "Landroid/animation/Animator;", "delayedRenderInvocation", "Lsls;", "currentProgress", "F", "isCollapsed", "Companion", "g7f0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductCardListView extends LinearLayout {
    private static final float STACK_ANIMATION_ALPHA_END = 1.0f;
    private static final float STACK_ANIMATION_ALPHA_START = 0.0f;
    private static final long STACK_ANIMATION_DURATION_MS = 600;
    private static final float STACK_ANIMATION_INTERPOLATOR_X1 = 0.65f;
    private static final float STACK_ANIMATION_INTERPOLATOR_X2 = 0.0f;
    private static final float STACK_ANIMATION_INTERPOLATOR_Y1 = 0.35f;
    private static final float STACK_ANIMATION_INTERPOLATOR_Y2 = 1.0f;
    private static final float STACK_ANIMATION_TRANSLATION_Y_END = 0.0f;
    private tls actionHandler;
    private Animator combinedStackAnimator;
    private float currentProgress;
    private h7f0 currentState;
    private sls delayedRenderInvocation;
    private tls onProductClickListener;

    /* renamed from: productCardHeight$delegate, reason: from kotlin metadata */
    private final i3y productCardHeight;
    public static final g7f0 Companion = new g7f0();
    private static final int VERTICAL_OFFSET_FOR_CARD_PX = kp50.r(-125);
    private static final int BOTTOM_MARGIN_FOR_LAST_CARD_PX = kp50.r(52);
    private static final int CARD_CAPTION_EXTRA_TOP_PX = kp50.r(17);
    private static final int CARD_CAPTION_EXTRA_BOTTOM_PX = kp50.r(16);

    public ProductCardListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.productCardHeight = a.a(new qd00(context, 27));
        this.onProductClickListener = new a6f0(1);
        setOrientation(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductCardView createProductCardView() {
        ProductCardView productCardView = new ProductCardView(getContext(), null, 0, 6, null);
        productCardView.setLayoutParams(new LinearLayout.LayoutParams(-1, getProductCardHeight()));
        final int i = 0;
        productCardView.setOnProductActionClickListener(new tls(this) { // from class: f7f0
            public final /* synthetic */ ProductCardListView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 createProductCardView$lambda$12$lambda$10;
                boolean createProductCardView$lambda$12$lambda$11;
                int i2 = i;
                ProductCardListView productCardListView = this.b;
                switch (i2) {
                    case 0:
                        createProductCardView$lambda$12$lambda$10 = ProductCardListView.createProductCardView$lambda$12$lambda$10(productCardListView, (n7f0) obj);
                        return createProductCardView$lambda$12$lambda$10;
                    default:
                        createProductCardView$lambda$12$lambda$11 = ProductCardListView.createProductCardView$lambda$12$lambda$11(productCardListView, (Uri) obj);
                        return Boolean.valueOf(createProductCardView$lambda$12$lambda$11);
                }
            }
        });
        final int i2 = 1;
        productCardView.setActionHandler(new tls(this) { // from class: f7f0
            public final /* synthetic */ ProductCardListView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 createProductCardView$lambda$12$lambda$10;
                boolean createProductCardView$lambda$12$lambda$11;
                int i22 = i2;
                ProductCardListView productCardListView = this.b;
                switch (i22) {
                    case 0:
                        createProductCardView$lambda$12$lambda$10 = ProductCardListView.createProductCardView$lambda$12$lambda$10(productCardListView, (n7f0) obj);
                        return createProductCardView$lambda$12$lambda$10;
                    default:
                        createProductCardView$lambda$12$lambda$11 = ProductCardListView.createProductCardView$lambda$12$lambda$11(productCardListView, (Uri) obj);
                        return Boolean.valueOf(createProductCardView$lambda$12$lambda$11);
                }
            }
        });
        return productCardView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createProductCardView$lambda$12$lambda$10(ProductCardListView productCardListView, n7f0 n7f0Var) {
        productCardListView.onProductClickListener.invoke(n7f0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createProductCardView$lambda$12$lambda$11(ProductCardListView productCardListView, Uri uri) {
        tls tlsVar = productCardListView.actionHandler;
        return tlsVar != null && ((Boolean) tlsVar.invoke(uri)).booleanValue();
    }

    private final Animator getAlphaAnimator() {
        return ObjectAnimator.ofFloat(this, CaretView.ALPHA_PROPERTY, 0.0f, 1.0f);
    }

    private final Animator getCombinedAnimator(h7f0 state) {
        enm enmVar = new enm(new jr31(this, 0), new o990(8, this, state), 2);
        ListBuilder a = rcc.a();
        a.add(getAlphaAnimator());
        ycc.s(a, enmVar);
        ListBuilder j = a.j();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(j);
        animatorSet.setDuration(600L);
        animatorSet.setInterpolator(new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator getCombinedAnimator$lambda$14(ProductCardListView productCardListView, h7f0 h7f0Var, int i, View view) {
        return productCardListView.getTranslateAnimator(view, h7f0Var, i);
    }

    private final int getItemYOffset(h7f0 state, int position) {
        int i = 0;
        for (n7f0 n7f0Var : kotlin.collections.a.A0(state.a, position)) {
            i += getProductCardHeight() + VERTICAL_OFFSET_FOR_CARD_PX;
        }
        return -i;
    }

    private final int getProductCardHeight() {
        return ((Number) this.productCardHeight.getValue()).intValue();
    }

    private final Animator getTranslateAnimator(View viewToAnimate, h7f0 state, int position) {
        return ObjectAnimator.ofFloat(viewToAnimate, "translationY", getItemYOffset(state, position), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onProductClickListener$lambda$1(n7f0 n7f0Var) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int productCardHeight_delegate$lambda$0(Context context) {
        return context.getResources().getDimensionPixelOffset(cwg0.ybsdk_product_card_height);
    }

    public static /* synthetic */ void render$default(ProductCardListView productCardListView, h7f0 h7f0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        productCardListView.render(h7f0Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$2(ProductCardListView productCardListView, h7f0 h7f0Var, boolean z) {
        productCardListView.render(h7f0Var, z);
        return zy11.a;
    }

    private static final zy11 render$lambda$3(ProductCardListView productCardListView, h7f0 h7f0Var, int i, ProductCardView productCardView) {
        productCardListView.updateProductCardView(productCardView, h7f0Var, i);
        return zy11.a;
    }

    private final void updateProductCardView(ProductCardView cardView, h7f0 state, int index) {
        cardView.render((n7f0) state.a.get(index));
        List list = state.a;
        n7f0 n7f0Var = (n7f0) kotlin.collections.a.S(index - 1, list);
        Pair pair = (n7f0Var != null ? n7f0Var.t : null) != null ? new Pair(Integer.valueOf(CARD_CAPTION_EXTRA_TOP_PX), Integer.valueOf(CARD_CAPTION_EXTRA_BOTTOM_PX)) : new Pair(0, 0);
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        int i = n7f0Var != null ? VERTICAL_OFFSET_FOR_CARD_PX + intValue : 0;
        int i2 = index == scc.f(list) ? BOTTOM_MARGIN_FOR_LAST_CARD_PX - intValue2 : 0;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, i, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, i2);
        cardView.setLayoutParams(layoutParams2);
    }

    public final void animateOnScroll(float scrollProgress, float scrolledByYValue) {
        Animator animator = this.combinedStackAnimator;
        if (animator == null || !animator.isRunning()) {
            setAlpha(1.0f - scrollProgress);
            if (this.currentState != null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    float itemYOffset = getItemYOffset(r0, i) * scrollProgress;
                    View childAt = getChildAt(i);
                    if (childAt != null) {
                        childAt.setTranslationY(itemYOffset + scrolledByYValue);
                    }
                }
            }
            this.currentProgress = scrollProgress;
        }
    }

    public final void cancelAnimation() {
        Animator animator = this.combinedStackAnimator;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.combinedStackAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.combinedStackAnimator = null;
    }

    public final void doOnEnd(final sls doOnEnd) {
        Animator animator = this.combinedStackAnimator;
        if (animator != null) {
            animator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.main.internal.widgets.ProductCardListView$doOnEnd$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    sls.this.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                }
            });
        }
    }

    public final Map<String, View> getSharedProductCards() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            String transitionName = childAt.getTransitionName();
            if (transitionName != null) {
                linkedHashMap.put(transitionName, childAt);
            }
        }
        return linkedHashMap;
    }

    public final boolean isAnimationInProgress() {
        Animator animator = this.combinedStackAnimator;
        return animator != null && animator.isRunning();
    }

    public final boolean isCollapsed() {
        return this.currentProgress == 1.0f;
    }

    public final void render(h7f0 state, boolean needsToShowStackAnimation) {
        Animator animator = this.combinedStackAnimator;
        if (animator != null && animator.isRunning()) {
            this.delayedRenderInvocation = new ex0(this, state, needsToShowStackAnimation, 15);
            return;
        }
        int size = state.a.size();
        int i = 0;
        ProductCardListView$render$2 productCardListView$render$2 = new ProductCardListView$render$2(0, this, ProductCardListView.class, "createProductCardView", "createProductCardView()Lcom/ybsdk/feature/main/internal/widgets/ProductCardView;", 0);
        List t = b.t(b.o(new jr31(this, 0), new j1(20, this)));
        ArrayList arrayList = (ArrayList) t;
        int size2 = size - arrayList.size();
        if (size2 > 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                View view = (View) productCardListView$render$2.invoke();
                arrayList.add(view);
                addView(view);
            }
        } else if (size2 < 0) {
            int i3 = -size2;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.remove(scc.f(t));
            }
            removeViews(getChildCount() - i3, i3);
        }
        for (Object obj : t) {
            int i5 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            render$lambda$3(this, state, i, (ProductCardView) obj);
            i = i5;
        }
        if (needsToShowStackAnimation) {
            Animator combinedAnimator = getCombinedAnimator(state);
            combinedAnimator.start();
            combinedAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.main.internal.widgets.ProductCardListView$render$lambda$5$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    sls slsVar;
                    ProductCardListView.this.combinedStackAnimator = null;
                    slsVar = ProductCardListView.this.delayedRenderInvocation;
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                    ProductCardListView.this.delayedRenderInvocation = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                }
            });
            this.combinedStackAnimator = combinedAnimator;
        }
        this.currentState = state;
    }

    public final void setActionHandler(tls handler) {
        this.actionHandler = handler;
    }

    public final void setOnProductClickListener(tls listener) {
        this.onProductClickListener = listener;
    }

    public ProductCardListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProductCardListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ProductCardListView(Context context) {
        this(context, null, 0, 6, null);
    }
}
