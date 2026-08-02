package com.yandex.go.taxi.order.details.v1.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.b6j;
import defpackage.bxl;
import defpackage.c6j;
import defpackage.cma1;
import defpackage.d0y;
import defpackage.d6j;
import defpackage.e6j;
import defpackage.f6j;
import defpackage.g6j;
import defpackage.hg;
import defpackage.i8m;
import defpackage.jbm;
import defpackage.jl40;
import defpackage.k6j;
import defpackage.mb4;
import defpackage.n4h0;
import defpackage.nj2;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.rjm;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.u5j;
import defpackage.v5j;
import defpackage.vng;
import defpackage.w511;
import defpackage.w5j;
import defpackage.wug0;
import defpackage.x5j;
import defpackage.xw31;
import defpackage.yi;
import defpackage.ymj;
import defpackage.z5j;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringImageView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0002\u0081\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\b\b\u0001\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010(J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010(J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010(J\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010(J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u0010(J\u0017\u0010:\u001a\u00020\r2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020<H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\r2\u0006\u0010A\u001a\u00020<H\u0002¢\u0006\u0004\bD\u0010CJ\u0017\u0010E\u001a\u00020\r2\u0006\u0010A\u001a\u00020<H\u0002¢\u0006\u0004\bE\u0010CJ\u0017\u0010F\u001a\u00020\r2\u0006\u0010A\u001a\u00020<H\u0002¢\u0006\u0004\bF\u0010CJ\u0017\u0010G\u001a\u00020\r2\u0006\u0010A\u001a\u00020<H\u0002¢\u0006\u0004\bG\u0010CJO\u0010R\u001a\u00020Q2\u0006\u0010I\u001a\u00020H2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\r0J2\b\b\u0002\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020H2\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020\r0OH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\r2\u0006\u0010\\\u001a\u00020XH\u0002¢\u0006\u0004\b]\u0010[J\u000f\u0010^\u001a\u00020\rH\u0002¢\u0006\u0004\b^\u0010(J\u000f\u0010_\u001a\u00020\rH\u0002¢\u0006\u0004\b_\u0010(J\u000f\u0010`\u001a\u00020\rH\u0002¢\u0006\u0004\b`\u0010(J\u000f\u0010a\u001a\u00020\rH\u0002¢\u0006\u0004\ba\u0010(J\u000f\u0010b\u001a\u00020\rH\u0002¢\u0006\u0004\bb\u0010(J\u000f\u0010c\u001a\u00020\rH\u0002¢\u0006\u0004\bc\u0010(J\u0013\u0010e\u001a\u00020\u0007*\u00020dH\u0002¢\u0006\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010kR\u0014\u0010q\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010tR\u0014\u0010v\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010tR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001e\u0010z\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010yR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020T0}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/ui/DriverSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lg6j;", "interactor", "Lzy11;", "setupHeightInteractor", "(Lg6j;)V", "Lf6j;", "content", "render", "(Lf6j;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/View$OnClickListener;", "listener", "setDriverClickListener", "(Landroid/view/View$OnClickListener;)V", "setCarPlateClickListener", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "color", "setAvatarBackgroundColor", "(I)V", "Lb6j;", "renderDriver", "(Lb6j;)V", "imitateCandidateState", "()V", "Le6j;", "renderWaitingCandidateResponse", "(Le6j;)V", "renderSearchCandidate", "Lu5j;", "renderCandidateRejected", "(Lu5j;)V", "applySearchStateCorrection", "renderEmpty", "setDriverInfoYTranslationForCandidate", "Lx5j;", ClidProvider.STATE, "renderCarImageState", "(Lx5j;)V", "renderEmptyIcon", "Landroid/graphics/drawable/Drawable;", "icon", "renderIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "getCandidateTitleYTranslation", "()F", "getCandidateHeight", "()I", "fraction", "avatarOverlayDisappearUpdate", "(F)V", "avatarOverlayShowUpdate", "driverFoundContentUpdate", "collapseAndFadeOutUpdate", "expandAndFadeInUpdate", "", "duration", "Lkotlin/Function1;", "update", "Landroid/view/animation/Interpolator;", "interpolator", "startDelay", "Lkotlin/Function0;", "doOnEnd", "Landroid/animation/ValueAnimator;", "createAnimator", "(JLtls;Landroid/view/animation/Interpolator;JLsls;)Landroid/animation/ValueAnimator;", "Landroid/animation/Animator;", "animator", "playAnimator", "(Landroid/animation/Animator;)V", "", "newDescription", "updateAccessibility", "(Ljava/lang/String;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "announceNewAccessibilityDescription", "enableAccessibility", "disableAccessibility", "hideSection", "ensureSectionNotGone", "ensureTransparent", "ensureNotTransparent", "Landroid/view/View;", "screenYLocation", "(Landroid/view/View;)I", "Ld0y;", "binding", "Ld0y;", "heightMaximum", CA20Status.STATUS_USER_I, "originalHeight", "Landroid/animation/Animator$AnimatorListener;", "heightAnimationsListener", "Landroid/animation/Animator$AnimatorListener;", "fixedCandidateHeight", "fixedCandidateInfoTranslationY", "F", "candidateExpandAndFadeInAnimator", "Landroid/animation/ValueAnimator;", "collapseAnimator", "rejectFadeAnimator", "Landroid/animation/AnimatorSet;", "driverFoundAnimatorsSet", "Landroid/animation/AnimatorSet;", "candidateUpdateCallback", "Lsls;", "candidateUpdateAnimatorsSet", "", "heightAnimators", "Ljava/util/List;", "Companion", "rjm", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverSectionView extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;

    @Deprecated
    public static final long AVATAR_OVERLAY_DISAPPEAR_DURATION = 100;

    @Deprecated
    public static final long AVATAR_OVERLAY_SHOW_DURATION = 200;

    @Deprecated
    public static final long COLLAPSE_DURATION = 300;
    private static final rjm Companion = new rjm();

    @Deprecated
    public static final long DRIVER_FOUND_ANIMATIONS_DELAY = 250;

    @Deprecated
    public static final long DRIVER_FOUND_DURATION = 300;

    @Deprecated
    public static final long EXPAND_DURATION = 300;

    @Deprecated
    public static final long REJECT_FADE_DURATION = 300;
    private final d0y binding;
    private final ValueAnimator candidateExpandAndFadeInAnimator;
    private final AnimatorSet candidateUpdateAnimatorsSet;
    private sls candidateUpdateCallback;
    private final ValueAnimator collapseAnimator;
    private final AnimatorSet driverFoundAnimatorsSet;
    private final int fixedCandidateHeight;
    private final float fixedCandidateInfoTranslationY;
    private Animator.AnimatorListener heightAnimationsListener;
    private final List<Animator> heightAnimators;
    private int heightMaximum;
    private int originalHeight;
    private final ValueAnimator rejectFadeAnimator;

    public DriverSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(zkh0.layout_driver_section, this);
        int i2 = p8h0.avatar_background;
        View O2 = cma1.O(i2, this);
        if (O2 != null) {
            i2 = p8h0.avatar_barrier;
            if (((Barrier) cma1.O(i2, this)) != null) {
                i2 = p8h0.avatar_image;
                ShimmeringImageView shimmeringImageView = (ShimmeringImageView) cma1.O(i2, this);
                if (shimmeringImageView != null) {
                    i2 = p8h0.avatar_overlay;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView != null) {
                        i2 = p8h0.car_image;
                        ImageView imageView = (ImageView) cma1.O(i2, this);
                        if (imageView != null) {
                            i2 = p8h0.car_plate_layout;
                            CarPlateLayout carPlateLayout = (CarPlateLayout) cma1.O(i2, this);
                            if (carPlateLayout != null) {
                                i2 = p8h0.driver_info;
                                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, this);
                                if (listItemComponent != null) {
                                    i2 = p8h0.driver_info_barrier;
                                    if (((Barrier) cma1.O(i2, this)) != null && (O = cma1.O((i2 = p8h0.driver_view), this)) != null) {
                                        this.binding = new d0y(this, O2, shimmeringImageView, appCompatImageView, imageView, carPlateLayout, listItemComponent, O);
                                        float w = tje.w(12, getContext());
                                        int r = (int) (tje.r(wug0.driver_avatar_size, getContext()) + w + w);
                                        this.fixedCandidateHeight = r;
                                        this.fixedCandidateInfoTranslationY = ((r - tje.b0(getContext(), 16.0f)) / 2.0f) - tje.w(12, getContext());
                                        ValueAnimator createAnimator$default = createAnimator$default(this, 300L, new DriverSectionView$candidateExpandAndFadeInAnimator$1(1, this, DriverSectionView.class, "expandAndFadeInUpdate", "expandAndFadeInUpdate(F)V", 0), null, 0L, new DriverSectionView$candidateExpandAndFadeInAnimator$2(0, this, DriverSectionView.class, "ensureNotTransparent", "ensureNotTransparent()V", 0), 12, null);
                                        this.candidateExpandAndFadeInAnimator = createAnimator$default;
                                        ValueAnimator createAnimator$default2 = createAnimator$default(this, 300L, new DriverSectionView$collapseAnimator$1(1, this, DriverSectionView.class, "collapseAndFadeOutUpdate", "collapseAndFadeOutUpdate(F)V", 0), null, 0L, new DriverSectionView$collapseAnimator$2(0, this, DriverSectionView.class, "ensureTransparent", "ensureTransparent()V", 0), 12, null);
                                        this.collapseAnimator = createAnimator$default2;
                                        ValueAnimator valueAnimator = new ValueAnimator();
                                        valueAnimator.setFloatValues(1.0f, 0.5f);
                                        valueAnimator.setDuration(300L);
                                        valueAnimator.addUpdateListener(new yi(26, this));
                                        this.rejectFadeAnimator = valueAnimator;
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        ValueAnimator createAnimator$default3 = createAnimator$default(this, 300L, new DriverSectionView$driverFoundAnimatorsSet$1$driverFoundContentAnimator$1(1, this, DriverSectionView.class, "driverFoundContentUpdate", "driverFoundContentUpdate(F)V", 0), null, 0L, null, 28, null);
                                        ValueAnimator createAnimator$default4 = createAnimator$default(this, 200L, new DriverSectionView$driverFoundAnimatorsSet$1$overlayAppearAnimator$1(1, this, DriverSectionView.class, "avatarOverlayShowUpdate", "avatarOverlayShowUpdate(F)V", 0), new OvershootInterpolator(), 0L, null, 24, null);
                                        createAnimator$default4.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v1.ui.DriverSectionView$driverFoundAnimatorsSet$lambda$0$0$$inlined$doOnStart$1
                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationCancel(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationEnd(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationRepeat(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationStart(Animator animator) {
                                                d0y d0yVar;
                                                d0y d0yVar2;
                                                d0yVar = DriverSectionView.this.binding;
                                                d0yVar.d.setVisibility(0);
                                                d0yVar2 = DriverSectionView.this.binding;
                                                d0yVar2.d.setAlpha(1.0f);
                                            }
                                        });
                                        ValueAnimator createAnimator$default5 = createAnimator$default(this, 100L, new DriverSectionView$driverFoundAnimatorsSet$1$overlayDisappearAnimator$1(1, this, DriverSectionView.class, "avatarOverlayDisappearUpdate", "avatarOverlayDisappearUpdate(F)V", 0), null, 0L, new bxl(13, this), 12, null);
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        animatorSet2.setStartDelay(250L);
                                        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v1.ui.DriverSectionView$driverFoundAnimatorsSet$lambda$0$2$$inlined$doOnStart$1
                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationCancel(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationEnd(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationRepeat(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationStart(Animator animator) {
                                                int i3;
                                                DriverSectionView driverSectionView = DriverSectionView.this;
                                                i3 = driverSectionView.fixedCandidateHeight;
                                                driverSectionView.heightMaximum = i3;
                                            }
                                        });
                                        animatorSet2.playTogether(createAnimator$default3, createAnimator$default5);
                                        animatorSet.playSequentially(createAnimator$default4, animatorSet2);
                                        this.driverFoundAnimatorsSet = animatorSet;
                                        AnimatorSet animatorSet3 = new AnimatorSet();
                                        ValueAnimator createAnimator$default6 = createAnimator$default(this, 300L, new DriverSectionView$candidateUpdateAnimatorsSet$1$expandAndFadeInAnimator$1(1, this, DriverSectionView.class, "expandAndFadeInUpdate", "expandAndFadeInUpdate(F)V", 0), null, 0L, new DriverSectionView$candidateUpdateAnimatorsSet$1$expandAndFadeInAnimator$2(0, this, DriverSectionView.class, "ensureNotTransparent", "ensureNotTransparent()V", 0), 12, null);
                                        createAnimator$default6.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v1.ui.DriverSectionView$candidateUpdateAnimatorsSet$lambda$0$0$$inlined$doOnStart$1
                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationCancel(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationEnd(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationRepeat(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public void onAnimationStart(Animator animator) {
                                                sls slsVar;
                                                slsVar = DriverSectionView.this.candidateUpdateCallback;
                                                if (slsVar != null) {
                                                    slsVar.invoke();
                                                }
                                            }
                                        });
                                        animatorSet3.playSequentially(createAnimator$default(this, 300L, new DriverSectionView$candidateUpdateAnimatorsSet$1$collapseAnimator$1(1, this, DriverSectionView.class, "collapseAndFadeOutUpdate", "collapseAndFadeOutUpdate(F)V", 0), null, 0L, new DriverSectionView$candidateUpdateAnimatorsSet$1$collapseAnimator$2(0, this, DriverSectionView.class, "ensureTransparent", "ensureTransparent()V", 0), 12, null), createAnimator$default6);
                                        this.candidateUpdateAnimatorsSet = animatorSet3;
                                        this.heightAnimators = scc.i(createAnimator$default, createAnimator$default2, animatorSet, animatorSet3);
                                        listItemComponent.disableAccessibility();
                                        imageView.setScaleX(xw31.n(context) ? -1.0f : 1.0f);
                                        hg.a(O);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void announceNewAccessibilityDescription(String description) {
        getRootView().announceForAccessibility(description);
    }

    private final void applySearchStateCorrection() {
        d0y d0yVar = this.binding;
        d0yVar.f.render(z5j.a);
        setDriverInfoYTranslationForCandidate();
        d0yVar.g.setSubtitle((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void avatarOverlayDisappearUpdate(float fraction) {
        this.binding.d.setAlpha(1.0f - fraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void avatarOverlayShowUpdate(float fraction) {
        this.binding.d.setScaleX(fraction);
        this.binding.d.setScaleY(fraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collapseAndFadeOutUpdate(float fraction) {
        float f = 1.0f - fraction;
        setAlpha(f);
        this.heightMaximum = (int) (getCandidateHeight() * f);
        requestLayout();
    }

    private final ValueAnimator createAnimator(long duration, tls update, Interpolator interpolator, long startDelay, final sls doOnEnd) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(duration);
        valueAnimator.setInterpolator(interpolator);
        valueAnimator.setStartDelay(startDelay);
        valueAnimator.addUpdateListener(new nj2(3, update));
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v1.ui.DriverSectionView$createAnimator$lambda$1$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sls.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return valueAnimator;
    }

    public static /* synthetic */ ValueAnimator createAnimator$default(DriverSectionView driverSectionView, long j, tls tlsVar, Interpolator interpolator, long j2, sls slsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            interpolator = new LinearInterpolator();
        }
        Interpolator interpolator2 = interpolator;
        if ((i & 8) != 0) {
            j2 = 0;
        }
        return driverSectionView.createAnimator(j, tlsVar, interpolator2, j2, (i & 16) != 0 ? new jbm(16) : slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimator$lambda$1$0(tls tlsVar, ValueAnimator valueAnimator) {
        tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
    }

    private final void disableAccessibility() {
        this.binding.h.setImportantForAccessibility(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 driverFoundAnimatorsSet$lambda$0$1(DriverSectionView driverSectionView) {
        driverSectionView.binding.d.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void driverFoundContentUpdate(float fraction) {
        this.heightMaximum = this.fixedCandidateHeight + ((int) ((this.originalHeight - r0) * fraction));
        d0y d0yVar = this.binding;
        d0yVar.f.setAlpha(fraction);
        ListItemComponent listItemComponent = d0yVar.g;
        listItemComponent.subtitle().setAlpha(fraction);
        float f = (1.0f - fraction) * this.fixedCandidateInfoTranslationY;
        listItemComponent.setTranslationY(f);
        d0yVar.f.setTranslationY(f);
        requestLayout();
    }

    private final void enableAccessibility() {
        ru.yandex.taxi.design.utils.c.y(this.binding.h, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureNotTransparent() {
        setAlpha(1.0f);
    }

    private final void ensureSectionNotGone() {
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureTransparent() {
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandAndFadeInUpdate(float fraction) {
        setAlpha(fraction);
        this.heightMaximum = (int) (getCandidateHeight() * fraction);
        setDriverInfoYTranslationForCandidate();
        requestLayout();
    }

    private final int getCandidateHeight() {
        d0y d0yVar = this.binding;
        return (int) (Math.max(d0yVar.g.getBottom() + getCandidateTitleYTranslation(), d0yVar.c.getBottom()) + tje.w(12, getContext()));
    }

    private final float getCandidateTitleYTranslation() {
        d0y d0yVar = this.binding;
        int screenYLocation = screenYLocation(d0yVar.g.title());
        ListItemComponent listItemComponent = d0yVar.g;
        int screenYLocation2 = screenYLocation - screenYLocation(listItemComponent);
        int height = listItemComponent.title().getHeight();
        return (((r0.getHeight() / 2.0f) + d0yVar.c.getY()) - (height / 2.0f)) - screenYLocation2;
    }

    private final void hideSection() {
        setVisibility(8);
    }

    private final void imitateCandidateState() {
        d0y d0yVar = this.binding;
        d0yVar.f.setAlpha(0.0f);
        ListItemComponent listItemComponent = d0yVar.g;
        listItemComponent.subtitle().setAlpha(0.0f);
        d0yVar.f.setTranslationY(this.fixedCandidateInfoTranslationY);
        listItemComponent.setTranslationY(this.fixedCandidateInfoTranslationY);
        this.heightMaximum = this.fixedCandidateHeight;
        requestLayout();
    }

    private final void playAnimator(Animator animator) {
        if (animator.isRunning()) {
            return;
        }
        animator.cancel();
        OneShotPreDrawListener.add(this, new i8m(3, animator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rejectFadeAnimator$lambda$0$0(DriverSectionView driverSectionView, ValueAnimator valueAnimator) {
        driverSectionView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void renderCandidateRejected(u5j content) {
        applySearchStateCorrection();
        ensureSectionNotGone();
        if (this.heightMaximum > 0) {
            updateAccessibility(content.a);
            playAnimator(this.rejectFadeAnimator);
        } else {
            announceNewAccessibilityDescription(content.a);
            disableAccessibility();
            ensureTransparent();
        }
    }

    private final void renderCarImageState(x5j state) {
        if (state instanceof w5j) {
            renderIcon(((w5j) state).a);
        } else if (state instanceof v5j) {
            renderEmptyIcon();
        } else {
            w511.b();
        }
    }

    private final void renderDriver(b6j content) {
        ensureSectionNotGone();
        ensureNotTransparent();
        d0y d0yVar = this.binding;
        d0yVar.f.render(content.f);
        ListItemComponent listItemComponent = d0yVar.g;
        listItemComponent.setTitle(content.a);
        listItemComponent.setSubtitle(content.b);
        ShimmeringImageView shimmeringImageView = d0yVar.c;
        mb4 mb4Var = content.e;
        shimmeringImageView.setImageDrawable(mb4Var.b);
        shimmeringImageView.setLoading(mb4Var.a);
        updateAccessibility(content.c);
        renderCarImageState(content.d);
        if (content.g) {
            imitateCandidateState();
            playAnimator(this.driverFoundAnimatorsSet);
        } else {
            this.heightMaximum = Integer.MAX_VALUE;
            requestLayout();
        }
    }

    private final void renderEmpty() {
        hideSection();
    }

    private final void renderEmptyIcon() {
        this.binding.e.clearAnimation();
        if (this.binding.e.getVisibility() == 0) {
            cma1.L(this.binding.e);
        }
    }

    private final void renderIcon(Drawable icon) {
        d0y d0yVar = this.binding;
        d0yVar.e.clearAnimation();
        ImageView imageView = d0yVar.e;
        imageView.setImageDrawable(icon);
        if (imageView.getVisibility() != 0 || imageView.hasTransientState()) {
            cma1.J(imageView);
        }
    }

    private final void renderSearchCandidate() {
        applySearchStateCorrection();
        ensureSectionNotGone();
        disableAccessibility();
        if (this.heightMaximum > 0) {
            playAnimator(this.collapseAnimator);
        } else {
            ensureTransparent();
        }
    }

    private final void renderWaitingCandidateResponse(e6j content) {
        ensureSectionNotGone();
        applySearchStateCorrection();
        ymj ymjVar = new ymj(12, this, content);
        this.candidateUpdateCallback = null;
        if (this.candidateUpdateAnimatorsSet.isRunning()) {
            ymjVar.invoke();
            return;
        }
        if (content.f) {
            this.candidateUpdateCallback = ymjVar;
            playAnimator(this.candidateUpdateAnimatorsSet);
        } else {
            ymjVar.invoke();
            if (this.heightMaximum == 0) {
                playAnimator(this.candidateExpandAndFadeInAnimator);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderWaitingCandidateResponse$lambda$0(DriverSectionView driverSectionView, e6j e6jVar) {
        d0y d0yVar = driverSectionView.binding;
        d0yVar.g.setTitle(e6jVar.a);
        ShimmeringImageView shimmeringImageView = d0yVar.c;
        mb4 mb4Var = e6jVar.d;
        shimmeringImageView.setImageDrawable(mb4Var.b);
        shimmeringImageView.setLoading(mb4Var.a);
        driverSectionView.updateAccessibility(e6jVar.b);
        driverSectionView.renderCarImageState(e6jVar.c);
        return zy11.a;
    }

    private final int screenYLocation(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    private final void setDriverInfoYTranslationForCandidate() {
        this.binding.g.setTranslationY(getCandidateTitleYTranslation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHeightInteractor$onHeightAnimationFinished(g6j g6jVar) {
        g6jVar.a.a.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHeightInteractor$onNewActiveHeightAnimation(g6j g6jVar) {
        g6jVar.a.a.incrementAndGet();
    }

    private final void updateAccessibility(String newDescription) {
        enableAccessibility();
        CharSequence contentDescription = this.binding.h.getContentDescription();
        if (contentDescription == null || !jl40.l(newDescription, contentDescription.toString())) {
            this.binding.h.setContentDescription(newDescription);
            announceNewAccessibilityDescription(newDescription);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.b.setBackground(vng.t(n4h0.driver_avatar_round_corners, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
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

    public final void render(f6j content) {
        if (content instanceof b6j) {
            renderDriver((b6j) content);
            return;
        }
        if (content instanceof e6j) {
            renderWaitingCandidateResponse((e6j) content);
            return;
        }
        if (content instanceof u5j) {
            renderCandidateRejected((u5j) content);
            return;
        }
        if (content instanceof d6j) {
            renderSearchCandidate();
        } else if (content instanceof c6j) {
            renderEmpty();
        } else {
            w511.b();
        }
    }

    public final void setAvatarBackgroundColor(int color) {
        this.binding.b.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
    }

    public final void setCarPlateClickListener(View.OnClickListener listener) {
        this.binding.f.setCarPlateClickListener(listener);
    }

    public final void setDriverClickListener(View.OnClickListener listener) {
        this.binding.h.setOnClickListener(listener);
    }

    public final void setupHeightInteractor(g6j interactor) {
        List<Animator> list = this.heightAnimators;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Animator) obj).isRunning()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interactor.a.a.incrementAndGet();
        }
        this.heightAnimationsListener = new AnimUtils$AnimationStartEndListener(new k6j(interactor, 2), new k6j(interactor, 3));
        Iterator<T> it2 = this.heightAnimators.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).addListener(this.heightAnimationsListener);
        }
    }

    public DriverSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DriverSectionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DriverSectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
