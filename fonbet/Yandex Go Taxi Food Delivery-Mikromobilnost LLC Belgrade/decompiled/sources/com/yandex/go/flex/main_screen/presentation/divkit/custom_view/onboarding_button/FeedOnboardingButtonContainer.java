package com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cpq;
import defpackage.kr;
import defpackage.oxu0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/FeedOnboardingButtonContainer;", "Lcpq;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/a;", "presenter", "Loxu0;", "styleScreenRepository", "Landroid/content/Context;", "context", "<init>", "(Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/a;Loxu0;Landroid/content/Context;)V", "Landroid/graphics/Bitmap;", "icon", "", "animated", "Lzy11;", "setIconAndShow", "(Landroid/graphics/Bitmap;Z)V", "hide", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/MainScreenOnboardingButtonProperties;", Constants.KEY_DATA, "bindData", "(Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/MainScreenOnboardingButtonProperties;)V", "release", "Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/a;", "Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/FeedOnboardingButton;", "feedOnboardingButton", "Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/FeedOnboardingButton;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedOnboardingButtonContainer extends GoFrameLayout implements cpq {
    private final FeedOnboardingButton feedOnboardingButton;
    private final a presenter;

    public FeedOnboardingButtonContainer(a aVar, oxu0 oxu0Var, Context context) {
        super(context, null, 0, 0, 14, null);
        FeedOnboardingButton feedOnboardingButton = new FeedOnboardingButton(oxu0Var, context);
        this.feedOnboardingButton = feedOnboardingButton;
        setImportantForAccessibility(4);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 65);
        setClipChildren(false);
        setClipToPadding(false);
        addView(feedOnboardingButton, layoutParams);
    }

    private static final zy11 bindData$lambda$0(FeedOnboardingButtonContainer feedOnboardingButtonContainer, MainScreenOnboardingButtonProperties mainScreenOnboardingButtonProperties, kr krVar) {
        feedOnboardingButtonContainer.getClass();
        throw null;
    }

    public final void bindData(MainScreenOnboardingButtonProperties data) {
        throw null;
    }

    public void hide() {
        this.feedOnboardingButton.hide();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public final void release() {
        this.feedOnboardingButton.release();
    }

    public void setIconAndShow(Bitmap icon, boolean animated) {
        this.feedOnboardingButton.setIconAndShow(icon, animated);
    }
}
