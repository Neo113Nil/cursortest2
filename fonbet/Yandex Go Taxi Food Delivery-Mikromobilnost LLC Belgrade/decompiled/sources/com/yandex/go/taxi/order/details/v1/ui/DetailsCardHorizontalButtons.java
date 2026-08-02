package com.yandex.go.taxi.order.details.v1.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.amh;
import defpackage.g6j;
import defpackage.i3y;
import defpackage.k6j;
import defpackage.kp50;
import defpackage.l6j;
import defpackage.scc;
import defpackage.t4j;
import defpackage.tje;
import defpackage.uz;
import defpackage.w4j;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0011¨\u00066"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardHorizontalButtons;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "targetCount", "Lzy11;", "ensureButtonsCount", "(I)V", "startShowAnimation", "()V", "Landroid/animation/ValueAnimator;", "createShowAnimator", "()Landroid/animation/ValueAnimator;", "Lw4j;", ClidProvider.STATE, "render", "(Lw4j;)V", "", "", "getVisibleButtons", "()Ljava/util/List;", "getInvisibleButtons", "Lg6j;", "interactor", "setupHeightInteractor", "(Lg6j;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroidx/appcompat/widget/LinearLayoutCompat;", "parentLayout", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsButtonComponent;", "buttonsList", "Ljava/util/List;", "originalHeight", CA20Status.STATUS_USER_I, "heightMaximum", "Landroid/animation/Animator$AnimatorListener;", "heightAnimatorListener", "Landroid/animation/Animator$AnimatorListener;", "showAnimator$delegate", "Li3y;", "getShowAnimator", "showAnimator", "Companion", "l6j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsCardHorizontalButtons extends HorizontalScrollView {
    public static final int $stable = 8;

    @Deprecated
    public static final long BUTTONS_APPEAR_ANIMATION_DURATION = 300;
    private static final l6j Companion = new l6j();
    private final List<DetailsButtonComponent> buttonsList;
    private Animator.AnimatorListener heightAnimatorListener;
    private int heightMaximum;
    private int originalHeight;
    private final LinearLayoutCompat parentLayout;

    /* renamed from: showAnimator$delegate, reason: from kotlin metadata */
    private final i3y showAnimator;

    public DetailsCardHorizontalButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
        linearLayoutCompat.setClipChildren(false);
        linearLayoutCompat.setClipToPadding(false);
        linearLayoutCompat.setOrientation(0);
        linearLayoutCompat.setPadding((int) tje.x(linearLayoutCompat.getContext(), 6.0f), (int) tje.x(linearLayoutCompat.getContext(), 8.0f), (int) tje.x(linearLayoutCompat.getContext(), 6.0f), (int) tje.x(linearLayoutCompat.getContext(), 8.0f));
        this.parentLayout = linearLayoutCompat;
        this.buttonsList = new ArrayList();
        this.showAnimator = kotlin.a.b(LazyThreadSafetyMode.NONE, new amh(20, this));
        setHorizontalScrollBarEnabled(false);
        addView(linearLayoutCompat, -2, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator createShowAnimator() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new yi(19, this));
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createShowAnimator$lambda$0$0(DetailsCardHorizontalButtons detailsCardHorizontalButtons, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        detailsCardHorizontalButtons.heightMaximum = (int) (detailsCardHorizontalButtons.originalHeight * floatValue);
        if (floatValue > 1.0f) {
            floatValue = 1.0f;
        }
        detailsCardHorizontalButtons.setAlpha(floatValue);
        detailsCardHorizontalButtons.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ensureButtonsCount(int targetCount) {
        int size = targetCount - this.buttonsList.size();
        boolean z = size < 0;
        int abs = Math.abs(size);
        for (int i = 0; i < abs; i++) {
            if (z) {
                this.parentLayout.removeView((DetailsButtonComponent) kp50.M(this.buttonsList));
            } else {
                DetailsButtonComponent detailsButtonComponent = new DetailsButtonComponent(getContext(), null, 2, 0 == true ? 1 : 0);
                this.parentLayout.addView(detailsButtonComponent, -2, -2);
                this.buttonsList.add(detailsButtonComponent);
            }
        }
    }

    private final ValueAnimator getShowAnimator() {
        return (ValueAnimator) this.showAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHeightInteractor$onHeightAnimationFinished(g6j g6jVar) {
        g6jVar.a.a.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHeightInteractor$onNewActiveHeightAnimation(g6j g6jVar) {
        g6jVar.a.a.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startShowAnimation() {
        if (getShowAnimator().isRunning()) {
            return;
        }
        getShowAnimator().cancel();
        getShowAnimator().start();
    }

    public final List<String> getInvisibleButtons() {
        List<DetailsButtonComponent> list = this.buttonsList;
        ArrayList arrayList = new ArrayList();
        for (DetailsButtonComponent detailsButtonComponent : list) {
            String analyticsName = ru.yandex.taxi.design.utils.c.r(detailsButtonComponent) ? null : detailsButtonComponent.getAnalyticsName();
            if (analyticsName != null) {
                arrayList.add(analyticsName);
            }
        }
        return arrayList;
    }

    public final List<String> getVisibleButtons() {
        List<DetailsButtonComponent> list = this.buttonsList;
        ArrayList arrayList = new ArrayList();
        for (DetailsButtonComponent detailsButtonComponent : list) {
            String analyticsName = ru.yandex.taxi.design.utils.c.r(detailsButtonComponent) ? detailsButtonComponent.getAnalyticsName() : null;
            if (analyticsName != null) {
                arrayList.add(analyticsName);
            }
        }
        return arrayList;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.originalHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.heightMaximum;
        if (measuredHeight > i) {
            measuredHeight = i;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public final void render(w4j state) {
        boolean z = state.b;
        List list = state.a;
        int i = 0;
        if (z && this.buttonsList.isEmpty() && !list.isEmpty()) {
            this.heightMaximum = 0;
            OneShotPreDrawListener.add(this, new uz(26, this));
        } else {
            this.heightMaximum = Integer.MAX_VALUE;
        }
        ensureButtonsCount(list.size());
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            this.buttonsList.get(i).render((t4j) obj);
            i = i2;
        }
    }

    public final void setupHeightInteractor(g6j interactor) {
        if (getShowAnimator().isRunning()) {
            interactor.a.a.incrementAndGet();
        }
        this.heightAnimatorListener = new AnimUtils$AnimationStartEndListener(new k6j(interactor, 0), new k6j(interactor, 1));
        getShowAnimator().addListener(this.heightAnimatorListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetailsCardHorizontalButtons(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DetailsCardHorizontalButtons(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
