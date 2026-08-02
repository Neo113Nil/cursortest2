package com.yandex.go.taxi.order.details.v2.ui.view.item.driver;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.RideCardDriverSectionTransition;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title.RideCardDriverSectionTitleView;
import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import com.yandex.go.taxi.order.util.driver.BounceInterpolator;
import defpackage.bxl;
import defpackage.cma1;
import defpackage.cn91;
import defpackage.cvw;
import defpackage.gik0;
import defpackage.hg;
import defpackage.hgk0;
import defpackage.hik0;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.ijm;
import defpackage.jl40;
import defpackage.n4h0;
import defpackage.nj2;
import defpackage.njm;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.ogk0;
import defpackage.ojm;
import defpackage.p8h0;
import defpackage.pjm;
import defpackage.qjm;
import defpackage.r3k0;
import defpackage.rgk0;
import defpackage.sgk0;
import defpackage.sls;
import defpackage.sue0;
import defpackage.tgk0;
import defpackage.tje;
import defpackage.ugk0;
import defpackage.uhk0;
import defpackage.usg0;
import defpackage.vgk0;
import defpackage.vhk0;
import defpackage.vng;
import defpackage.vxj0;
import defpackage.w511;
import defpackage.wgk0;
import defpackage.whk0;
import defpackage.xgk0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.ygk0;
import defpackage.yzx;
import defpackage.zdk0;
import defpackage.zkh0;
import defpackage.zuc0;
import defpackage.zvi;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringImageView;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001qB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\fJ+\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J)\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u00104J/\u00108\u001a\u00020\n2\u0006\u0010*\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\n2\u0006\u00106\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010;J1\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b@\u0010;J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bI\u0010GJ\u000f\u0010J\u001a\u00020EH\u0002¢\u0006\u0004\bJ\u0010GJ\u000f\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bK\u00104J\u0013\u0010M\u001a\u00020\u001c*\u00020LH\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010VR\u001b\u0010_\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010T\u001a\u0004\b^\u0010VR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010YR(\u0010j\u001a\u0004\u0018\u00010\u00162\b\u0010i\u001a\u0004\u0018\u00010\u00168\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010gR\u0014\u0010p\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010V¨\u0006r"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/driver/RideCardDriverSectionView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lwhk0;", "driverAnimationInteractor", "<init>", "(Landroid/content/Context;Lwhk0;)V", "Lygk0;", "uiState", "Lzy11;", "render", "(Lygk0;)V", "Landroid/view/View$OnClickListener;", "listener", "setDriverClickListener", "(Landroid/view/View$OnClickListener;)V", "setCarPlateClickListener", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "renderStateWithoutAnimation", "", "animate", "", "duration", "contentUpdate", "(Lygk0;ZLjava/lang/Long;)V", "Lzuc0;", "updatePlate", "(Lzuc0;ZLjava/lang/Long;)V", "Lxgk0;", "titleUiState", "updateDriverTitle", "(Lxgk0;)V", "Lhgk0;", ClidProvider.STATE, "updateAvatar", "(Lhgk0;)V", "", "subtitleText", "updateDriverSubtitle", "(Ljava/lang/CharSequence;ZLjava/lang/Long;)V", "plainUpdateSubtitle", "(Ljava/lang/CharSequence;)V", "measureTitleHeight", "()V", "Logk0;", "hasExtraPaddingOnEnd", "expanded", "renderCarImageState", "(Logk0;ZZZ)V", "renderEmptyIcon", "(Z)V", "Landroid/graphics/drawable/Drawable;", "icon", "renderIcon", "(Landroid/graphics/drawable/Drawable;ZZZ)V", "showCarImage", "", "newDescription", "updateAccessibility", "(Ljava/lang/String;)V", "Landroid/animation/Animator;", "getPlateAppearAnimator", "()Landroid/animation/Animator;", "getPlateDisappearAnimator", "getSubtitleAppearAnimator", "getSubtitleDisappearAnimator", "requestLayoutInContentAnimation", "Lugk0;", "isExpandedTarget", "(Lugk0;)Z", "Lwhk0;", "Lyzx;", "binding", "Lyzx;", "avatarImageHeightHalf$delegate", "Li3y;", "getAvatarImageHeightHalf", "()I", "avatarImageHeightHalf", "titleHeight", CA20Status.STATUS_USER_I, "carPlateAnimationStartTranslation$delegate", "getCarPlateAnimationStartTranslation", "carPlateAnimationStartTranslation", "carImageEndPadding$delegate", "getCarImageEndPadding", "carImageEndPadding", "Lpjm;", "animator", "Lpjm;", "Lqjm;", "animationQueue", "Lqjm;", "callLayoutInContentAnimations", "Z", "originalHeight", "value", "targetHeight", "Ljava/lang/Integer;", "setTargetHeight", "(Ljava/lang/Integer;)V", "isFirstUpdate", "getTitleAnimationTopPaddingDelta", "titleAnimationTopPaddingDelta", "sue0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSectionView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final qjm animationQueue;
    private final pjm animator;

    /* renamed from: avatarImageHeightHalf$delegate, reason: from kotlin metadata */
    private final i3y avatarImageHeightHalf;
    private final yzx binding;
    private boolean callLayoutInContentAnimations;

    /* renamed from: carImageEndPadding$delegate, reason: from kotlin metadata */
    private final i3y carImageEndPadding;

    /* renamed from: carPlateAnimationStartTranslation$delegate, reason: from kotlin metadata */
    private final i3y carPlateAnimationStartTranslation;
    private final whk0 driverAnimationInteractor;
    private boolean isFirstUpdate;
    private int originalHeight;
    private Integer targetHeight;
    private int titleHeight;

    public RideCardDriverSectionView(Context context, whk0 whk0Var) {
        super(context, null, 0, 0, 8, null);
        this.driverAnimationInteractor = whk0Var;
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_driver_section, this);
        int i = p8h0.avatar_background;
        GoView goView = (GoView) cma1.O(i, this);
        if (goView != null) {
            i = p8h0.avatar_barrier;
            if (((Barrier) cma1.O(i, this)) != null) {
                i = p8h0.avatar_image;
                ShimmeringImageView shimmeringImageView = (ShimmeringImageView) cma1.O(i, this);
                if (shimmeringImageView != null) {
                    i = p8h0.avatar_overlay;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, this);
                    if (appCompatImageView != null) {
                        i = p8h0.car_image;
                        GoImageView goImageView = (GoImageView) cma1.O(i, this);
                        if (goImageView != null) {
                            i = p8h0.car_plate_layout;
                            RideCardDriverSectionCarPlateView rideCardDriverSectionCarPlateView = (RideCardDriverSectionCarPlateView) cma1.O(i, this);
                            if (rideCardDriverSectionCarPlateView != null) {
                                i = p8h0.driver_info_barrier;
                                if (((Barrier) cma1.O(i, this)) != null) {
                                    i = p8h0.driver_view;
                                    GoView goView2 = (GoView) cma1.O(i, this);
                                    if (goView2 != null) {
                                        i = p8h0.subtitle;
                                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                                        if (robotoTextView != null) {
                                            i = p8h0.title;
                                            RideCardDriverSectionTitleView rideCardDriverSectionTitleView = (RideCardDriverSectionTitleView) cma1.O(i, this);
                                            if (rideCardDriverSectionTitleView != null) {
                                                this.binding = new yzx(this, goView, shimmeringImageView, appCompatImageView, goImageView, rideCardDriverSectionCarPlateView, goView2, robotoTextView, rideCardDriverSectionTitleView);
                                                hik0 hik0Var = new hik0(this, 3);
                                                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                                                this.avatarImageHeightHalf = a.b(lazyThreadSafetyMode, hik0Var);
                                                this.titleHeight = (int) tje.b0(getContext(), 16.0f);
                                                this.carPlateAnimationStartTranslation = a.b(lazyThreadSafetyMode, new hik0(this, 4));
                                                this.carImageEndPadding = a.b(lazyThreadSafetyMode, new hik0(this, 0));
                                                pjm pjmVar = new pjm(new sue0(25, this));
                                                this.animator = pjmVar;
                                                this.animationQueue = new qjm(pjmVar);
                                                this.callLayoutInContentAnimations = true;
                                                this.isFirstUpdate = true;
                                                setImportantForAccessibility(2);
                                                goImageView.setScaleX(xw31.n(context) ? -1.0f : 1.0f);
                                                hg.a(goView2);
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
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int avatarImageHeightHalf_delegate$lambda$0(RideCardDriverSectionView rideCardDriverSectionView) {
        return c.h(26, rideCardDriverSectionView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int carImageEndPadding_delegate$lambda$0(RideCardDriverSectionView rideCardDriverSectionView) {
        return c.h(12, rideCardDriverSectionView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int carPlateAnimationStartTranslation_delegate$lambda$0(RideCardDriverSectionView rideCardDriverSectionView) {
        return c.h(20, rideCardDriverSectionView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void contentUpdate(ygk0 uiState, boolean animate, Long duration) {
        updateDriverTitle(uiState.c);
        updateDriverSubtitle(uiState.d, animate, duration);
        updatePlate(uiState.h, animate, duration);
        hgk0 hgk0Var = uiState.g;
        updateAvatar(hgk0Var);
        ogk0 ogk0Var = uiState.f;
        hgk0Var.getClass();
        renderCarImageState(ogk0Var, animate, !(hgk0Var == hgk0.c), isExpandedTarget(uiState.k));
        updateAccessibility(uiState.e);
    }

    public static /* synthetic */ void contentUpdate$default(RideCardDriverSectionView rideCardDriverSectionView, ygk0 ygk0Var, boolean z, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        rideCardDriverSectionView.contentUpdate(ygk0Var, z, l);
    }

    private final int getAvatarImageHeightHalf() {
        return ((Number) this.avatarImageHeightHalf.getValue()).intValue();
    }

    private final int getCarImageEndPadding() {
        return ((Number) this.carImageEndPadding.getValue()).intValue();
    }

    private final int getCarPlateAnimationStartTranslation() {
        return ((Number) this.carPlateAnimationStartTranslation.getValue()).intValue();
    }

    private final Animator getPlateAppearAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new PathInterpolator(0.6f, -0.1f, 0.6f, 1.4f));
        ofFloat.addUpdateListener(new nj2(2, new gik0(this, 3)));
        cn91.f(ofFloat, new hik0(this, 2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.binding.f, (Property<RideCardDriverSectionCarPlateView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(new PathInterpolator(1.0f, 0.0f, 1.0f, 0.0f));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getPlateAppearAnimator$lambda$0$0(RideCardDriverSectionView rideCardDriverSectionView, float f) {
        rideCardDriverSectionView.binding.f.setTranslationY((1.0f - f) * rideCardDriverSectionView.getCarPlateAnimationStartTranslation());
        int i = rideCardDriverSectionView.originalHeight;
        rideCardDriverSectionView.setTargetHeight(Integer.valueOf((int) (((i - r1) * f) + rideCardDriverSectionView.binding.c.getBottom())));
        rideCardDriverSectionView.requestLayoutInContentAnimation();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getPlateAppearAnimator$lambda$0$1(RideCardDriverSectionView rideCardDriverSectionView) {
        rideCardDriverSectionView.setTargetHeight(null);
        rideCardDriverSectionView.requestLayout();
        return zy11.a;
    }

    private final Animator getPlateDisappearAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new PathInterpolator(0.4f, -0.4f, 0.4f, 1.1f));
        ofFloat.addUpdateListener(new nj2(2, new gik0(this, 0)));
        cn91.f(ofFloat, new hik0(this, 1));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.binding.f, (Property<RideCardDriverSectionCarPlateView, Float>) ViewGroup.ALPHA, 1.0f, 0.0f);
        ofFloat2.setInterpolator(new PathInterpolator(0.0f, 1.0f, 0.0f, 1.0f));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getPlateDisappearAnimator$lambda$0$0(RideCardDriverSectionView rideCardDriverSectionView, float f) {
        rideCardDriverSectionView.binding.f.setTranslationY((1.0f - f) * rideCardDriverSectionView.getCarPlateAnimationStartTranslation());
        int i = rideCardDriverSectionView.originalHeight;
        rideCardDriverSectionView.setTargetHeight(Integer.valueOf((int) (((i - r1) * f) + rideCardDriverSectionView.binding.c.getBottom())));
        rideCardDriverSectionView.requestLayoutInContentAnimation();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getPlateDisappearAnimator$lambda$0$1(RideCardDriverSectionView rideCardDriverSectionView) {
        rideCardDriverSectionView.setTargetHeight(Integer.valueOf(rideCardDriverSectionView.binding.c.getBottom()));
        rideCardDriverSectionView.requestLayout();
        return zy11.a;
    }

    private final Animator getSubtitleAppearAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new PathInterpolator(0.6f, -0.1f, 0.6f, 1.4f));
        ofFloat.addUpdateListener(new nj2(2, new gik0(this, 2)));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.binding.h, (Property<RobotoTextView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(new PathInterpolator(1.0f, 0.0f, 1.0f, 0.0f));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getSubtitleAppearAnimator$lambda$0$0(RideCardDriverSectionView rideCardDriverSectionView, float f) {
        float titleAnimationTopPaddingDelta = (1.0f - f) * rideCardDriverSectionView.getTitleAnimationTopPaddingDelta();
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView = rideCardDriverSectionView.binding.i;
        rideCardDriverSectionTitleView.setPadding(rideCardDriverSectionTitleView.getPaddingLeft(), (int) titleAnimationTopPaddingDelta, rideCardDriverSectionTitleView.getPaddingRight(), rideCardDriverSectionTitleView.getPaddingBottom());
        rideCardDriverSectionView.requestLayoutInContentAnimation();
        return zy11.a;
    }

    private final Animator getSubtitleDisappearAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new PathInterpolator(0.4f, -0.4f, 0.4f, 1.1f));
        ofFloat.addUpdateListener(new nj2(2, new gik0(this, 4)));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.binding.h, (Property<RobotoTextView, Float>) ViewGroup.ALPHA, 1.0f, 0.0f);
        ofFloat2.setInterpolator(new PathInterpolator(0.0f, 1.0f, 0.0f, 1.0f));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getSubtitleDisappearAnimator$lambda$0$0(RideCardDriverSectionView rideCardDriverSectionView, float f) {
        float titleAnimationTopPaddingDelta = rideCardDriverSectionView.getTitleAnimationTopPaddingDelta() * f;
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView = rideCardDriverSectionView.binding.i;
        rideCardDriverSectionTitleView.setPadding(rideCardDriverSectionTitleView.getPaddingLeft(), (int) titleAnimationTopPaddingDelta, rideCardDriverSectionTitleView.getPaddingRight(), rideCardDriverSectionTitleView.getPaddingBottom());
        rideCardDriverSectionView.requestLayoutInContentAnimation();
        return zy11.a;
    }

    private final int getTitleAnimationTopPaddingDelta() {
        return getAvatarImageHeightHalf() - (this.titleHeight / 2);
    }

    private final boolean isExpandedTarget(ugk0 ugk0Var) {
        if (ugk0Var instanceof sgk0) {
            return true;
        }
        if (jl40.l(ugk0Var, rgk0.a)) {
            return false;
        }
        if (ugk0Var instanceof tgk0) {
            return ((tgk0) ugk0Var).a != RideCardDriverState.SEARCHING;
        }
        w511.b();
        return false;
    }

    private final void measureTitleHeight() {
        this.titleHeight = this.binding.i.measurePreRenderedHeight();
    }

    private final void plainUpdateSubtitle(CharSequence subtitleText) {
        yzx yzxVar = this.binding;
        yzxVar.h.setText(subtitleText);
        boolean z = subtitleText == null || subtitleText.length() == 0;
        yzxVar.h.setVisibility(z ? 8 : 0);
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView = yzxVar.i;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) rideCardDriverSectionTitleView.getLayoutParams();
        layoutParams.bottomToBottom = !z ? -1 : yzxVar.c.getId();
        rideCardDriverSectionTitleView.setLayoutParams(layoutParams);
    }

    private final void renderCarImageState(ogk0 state, boolean animate, boolean hasExtraPaddingOnEnd, boolean expanded) {
        Drawable drawable = state.a.getDrawable();
        if (drawable != null) {
            renderIcon(drawable, animate, hasExtraPaddingOnEnd, expanded);
        } else {
            renderEmptyIcon(hasExtraPaddingOnEnd);
        }
    }

    private final void renderEmptyIcon(boolean hasExtraPaddingOnEnd) {
        yzx yzxVar = this.binding;
        yzxVar.e.clearAnimation();
        GoImageView goImageView = yzxVar.e;
        ViewGroup.LayoutParams layoutParams = goImageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(hasExtraPaddingOnEnd ? getCarImageEndPadding() : 0);
        goImageView.setLayoutParams(layoutParams2);
        if (goImageView.getVisibility() == 0) {
            cma1.L(goImageView);
        }
    }

    private final void renderIcon(Drawable icon, boolean animate, boolean hasExtraPaddingOnEnd, boolean expanded) {
        yzx yzxVar = this.binding;
        yzxVar.e.clearAnimation();
        GoImageView goImageView = yzxVar.e;
        goImageView.setImageDrawable(icon);
        ViewGroup.LayoutParams layoutParams = goImageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(hasExtraPaddingOnEnd ? getCarImageEndPadding() : 0);
        goImageView.setLayoutParams(layoutParams2);
        if (expanded) {
            if (goImageView.getVisibility() != 0 || goImageView.hasTransientState()) {
                showCarImage(animate);
            }
        }
    }

    private final void renderStateWithoutAnimation(ygk0 uiState) {
        uhk0 uhk0Var;
        whk0 whk0Var = this.driverAnimationInteractor;
        ugk0 ugk0Var = uiState.k;
        whk0Var.getClass();
        if (ugk0Var instanceof sgk0) {
            uhk0Var = new uhk0(true, false);
        } else if (ugk0Var instanceof rgk0) {
            uhk0Var = new uhk0(false, false);
        } else {
            if (!(ugk0Var instanceof tgk0)) {
                w511.b();
                return;
            }
            tgk0 tgk0Var = (tgk0) ugk0Var;
            RideCardDriverState rideCardDriverState = tgk0Var.a;
            whk0Var.a.a(rideCardDriverState, tgk0Var.b);
            int i = vhk0.a[rideCardDriverState.ordinal()];
            if (i == 1) {
                uhk0Var = new uhk0(false, true);
            } else if (i == 2) {
                uhk0Var = new uhk0(true, true);
            } else {
                if (i != 3 && i != 4) {
                    w511.b();
                    return;
                }
                uhk0Var = new uhk0(true, false);
            }
        }
        setAlpha(uhk0Var.b ? 0.5f : 1.0f);
        if (!uhk0Var.a) {
            setTargetHeight(0);
        }
        contentUpdate$default(this, uiState, false, null, 4, null);
    }

    private final void requestLayoutInContentAnimation() {
        if (this.callLayoutInContentAnimations) {
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetHeight(Integer num) {
        Integer num2;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < 0) {
                intValue = 0;
            }
            num2 = Integer.valueOf(intValue);
        } else {
            num2 = null;
        }
        this.targetHeight = num2;
    }

    private final void showCarImage(boolean animate) {
        yzx yzxVar = this.binding;
        if (animate) {
            cma1.J(yzxVar.e);
        } else {
            yzxVar.e.setAlpha(1.0f);
            yzxVar.e.setVisibility(0);
        }
    }

    private final void updateAccessibility(String newDescription) {
        yzx yzxVar = this.binding;
        c.y(yzxVar.g, true);
        GoView goView = yzxVar.g;
        CharSequence contentDescription = goView.getContentDescription();
        if (contentDescription == null || !jl40.l(newDescription, contentDescription.toString())) {
            goView.setContentDescription(newDescription);
        }
    }

    private final void updateAvatar(hgk0 state) {
        yzx yzxVar = this.binding;
        state.getClass();
        if (state == hgk0.c) {
            yzxVar.c.setVisibility(4);
            yzxVar.b.setVisibility(4);
            yzxVar.d.setVisibility(4);
        } else {
            ShimmeringImageView shimmeringImageView = yzxVar.c;
            shimmeringImageView.setVisibility(0);
            shimmeringImageView.setImageDrawable(state.b);
            shimmeringImageView.setLoading(state.a);
            cvw.a0(tje.r(usg0.ride_card_driver_avatar_corners_radius, shimmeringImageView.getContext()), shimmeringImageView);
            yzxVar.b.setVisibility(0);
        }
    }

    private final void updateDriverSubtitle(CharSequence subtitleText, boolean animate, Long duration) {
        yzx yzxVar = this.binding;
        if (!animate) {
            plainUpdateSubtitle(subtitleText);
            return;
        }
        int i = 1;
        if (yzxVar.h.getVisibility() == 0 && subtitleText == null) {
            Animator duration2 = getSubtitleDisappearAnimator().setDuration(duration != null ? duration.longValue() : 0L);
            cn91.g(new gik0(this, i), duration2);
            cn91.f(duration2, new iik0(0, yzxVar));
            duration2.start();
            return;
        }
        if (yzxVar.h.getVisibility() == 0 || subtitleText == null) {
            plainUpdateSubtitle(subtitleText);
            return;
        }
        Animator duration3 = getSubtitleAppearAnimator().setDuration(duration != null ? duration.longValue() : 0L);
        cn91.g(new zdk0(i, yzxVar, this, subtitleText), duration3);
        duration3.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateDriverSubtitle$lambda$0$0(RideCardDriverSectionView rideCardDriverSectionView, Animator animator) {
        rideCardDriverSectionView.measureTitleHeight();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateDriverSubtitle$lambda$0$1(yzx yzxVar) {
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView = yzxVar.i;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) rideCardDriverSectionTitleView.getLayoutParams();
        layoutParams.bottomToBottom = yzxVar.c.getId();
        rideCardDriverSectionTitleView.setLayoutParams(layoutParams);
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView2 = yzxVar.i;
        rideCardDriverSectionTitleView2.setPadding(rideCardDriverSectionTitleView2.getPaddingLeft(), 0, rideCardDriverSectionTitleView2.getPaddingRight(), rideCardDriverSectionTitleView2.getPaddingBottom());
        RobotoTextView robotoTextView = yzxVar.h;
        robotoTextView.setText((CharSequence) null);
        robotoTextView.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateDriverSubtitle$lambda$0$2(yzx yzxVar, RideCardDriverSectionView rideCardDriverSectionView, CharSequence charSequence, Animator animator) {
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView = yzxVar.i;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) rideCardDriverSectionTitleView.getLayoutParams();
        layoutParams.bottomToBottom = -1;
        rideCardDriverSectionTitleView.setLayoutParams(layoutParams);
        rideCardDriverSectionView.measureTitleHeight();
        RideCardDriverSectionTitleView rideCardDriverSectionTitleView2 = yzxVar.i;
        rideCardDriverSectionTitleView2.setPadding(rideCardDriverSectionTitleView2.getPaddingLeft(), rideCardDriverSectionView.getTitleAnimationTopPaddingDelta(), rideCardDriverSectionTitleView2.getPaddingRight(), rideCardDriverSectionTitleView2.getPaddingBottom());
        RobotoTextView robotoTextView = yzxVar.h;
        robotoTextView.setVisibility(0);
        robotoTextView.setText(charSequence);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        defpackage.ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:
    
        if (((defpackage.wgk0) r6).a.length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1.length() != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        r1 = r0.i;
        r1.setVisibility(0);
        r1.render(r6);
        r6 = r0.h;
        r0 = r6.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0;
        r0.topToBottom = r1.getId();
        r0.topToTop = -1;
        r6.setLayoutParams(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateDriverTitle(xgk0 titleUiState) {
        yzx yzxVar = this.binding;
        titleUiState.getClass();
        if (titleUiState instanceof vgk0) {
            CharSequence charSequence = ((vgk0) titleUiState).a;
            if (charSequence != null) {
            }
            RobotoTextView robotoTextView = yzxVar.h;
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = yzxVar.c.getId();
            layoutParams2.topToBottom = -1;
            robotoTextView.setLayoutParams(layoutParams2);
            yzxVar.i.setVisibility(4);
        } else if (!(titleUiState instanceof wgk0)) {
            w511.b();
            return;
        }
        measureTitleHeight();
    }

    private final void updatePlate(zuc0 uiState, boolean animate, Long duration) {
        yzx yzxVar = this.binding;
        if (!animate) {
            yzxVar.f.render(uiState);
            return;
        }
        RideCardDriverSectionCarPlateView rideCardDriverSectionCarPlateView = yzxVar.f;
        int visibility = rideCardDriverSectionCarPlateView.getVisibility();
        zuc0 zuc0Var = zuc0.f;
        if (visibility == 0 && jl40.l(uiState, zuc0Var)) {
            Animator duration2 = getPlateDisappearAnimator().setDuration(duration != null ? duration.longValue() : 0L);
            cn91.f(duration2, new o8k0(3, yzxVar, uiState));
            duration2.start();
        } else {
            if (rideCardDriverSectionCarPlateView.getVisibility() == 0 || jl40.l(uiState, zuc0Var)) {
                rideCardDriverSectionCarPlateView.render(uiState);
                return;
            }
            Animator duration3 = getPlateAppearAnimator().setDuration(duration != null ? duration.longValue() : 0L);
            cn91.g(new vxj0(5, yzxVar, uiState), duration3);
            duration3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updatePlate$lambda$0$0(yzx yzxVar, zuc0 zuc0Var) {
        yzxVar.f.render(zuc0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updatePlate$lambda$0$1(yzx yzxVar, zuc0 zuc0Var, Animator animator) {
        yzxVar.f.render(zuc0Var);
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.b.setBackground(vng.t(n4h0.driver_avatar_round_corners, getContext()));
        setBackgroundAttr(xng0.bgMain);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.originalHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        Integer num = this.targetHeight;
        setMeasuredDimension(measuredWidth, num != null ? num.intValue() : getMeasuredHeight());
    }

    public final void render(ygk0 uiState) {
        RideCardDriverSectionTransition rideCardDriverSectionTransition;
        ojm ojmVar;
        final int i = 0;
        if (this.isFirstUpdate) {
            this.isFirstUpdate = false;
            renderStateWithoutAnimation(uiState);
            return;
        }
        whk0 whk0Var = this.driverAnimationInteractor;
        ugk0 ugk0Var = uiState.k;
        whk0Var.getClass();
        if ((ugk0Var instanceof sgk0) || jl40.l(ugk0Var, rgk0.a)) {
            rideCardDriverSectionTransition = RideCardDriverSectionTransition.PLAIN_CONTENT_CHANGE;
        } else if (!(ugk0Var instanceof tgk0)) {
            w511.b();
            return;
        } else {
            tgk0 tgk0Var = (tgk0) ugk0Var;
            rideCardDriverSectionTransition = whk0Var.a.a(tgk0Var.a, tgk0Var.b);
        }
        qjm qjmVar = this.animationQueue;
        final int i2 = 2;
        final r3k0 r3k0Var = new r3k0(i2, this, uiState);
        final pjm pjmVar = qjmVar.a;
        int i3 = njm.a[rideCardDriverSectionTransition.ordinal()];
        final int i4 = 5;
        final int i5 = 3;
        final int i6 = 1;
        switch (i3) {
            case 1:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                cn91.g(new zvi(27, r3k0Var), duration);
                ojmVar = new ojm(duration);
                break;
            case 2:
                ValueAnimator b = pjmVar.b(1.0f);
                cn91.g(new ijm(r3k0Var, pjmVar, i), b);
                cn91.f(b, new sls() { // from class: jjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                pjmVar2.a.c();
                                break;
                            case 1:
                                pjmVar2.a.c();
                                break;
                            case 2:
                                pjmVar2.a.c();
                                break;
                            default:
                                ((RideCardDriverSectionView) pjmVar2.a.b).callLayoutInContentAnimations = true;
                                break;
                        }
                        return zy11Var;
                    }
                });
                ojmVar = new ojm(b);
                break;
            case 3:
                ValueAnimator b2 = pjmVar.b(0.5f);
                cn91.g(new ijm(r3k0Var, pjmVar, i6), b2);
                cn91.f(b2, new sls() { // from class: jjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i6;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                pjmVar2.a.c();
                                break;
                            case 1:
                                pjmVar2.a.c();
                                break;
                            case 2:
                                pjmVar2.a.c();
                                break;
                            default:
                                ((RideCardDriverSectionView) pjmVar2.a.b).callLayoutInContentAnimations = true;
                                break;
                        }
                        return zy11Var;
                    }
                });
                ojmVar = new ojm(b2);
                break;
            case 4:
                ValueAnimator b3 = pjmVar.b(1.0f);
                cn91.g(new ijm(r3k0Var, pjmVar, i2), b3);
                cn91.f(b3, new sls() { // from class: jjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i2;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                pjmVar2.a.c();
                                break;
                            case 1:
                                pjmVar2.a.c();
                                break;
                            case 2:
                                pjmVar2.a.c();
                                break;
                            default:
                                ((RideCardDriverSectionView) pjmVar2.a.b).callLayoutInContentAnimations = true;
                                break;
                        }
                        return zy11Var;
                    }
                });
                ojmVar = new ojm(b3);
                break;
            case 5:
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setFloatValues(1.0f, 0.5f);
                valueAnimator.setDuration(300L);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ljm
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        yzx yzxVar;
                        yzx yzxVar2;
                        yzx yzxVar3;
                        yzx yzxVar4;
                        int i7 = i;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                sue0 sue0Var = pjmVar2.a;
                                ((RideCardDriverSectionView) sue0Var.b).setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                break;
                            case 1:
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                sue0 sue0Var2 = pjmVar2.a;
                                float c = y6i0.c(floatValue, 0.0f, 1.0f);
                                yzxVar = ((RideCardDriverSectionView) sue0Var2.b).binding;
                                yzxVar.d.setAlpha(c);
                                yzxVar2 = ((RideCardDriverSectionView) sue0Var2.b).binding;
                                yzxVar2.d.setScaleX(floatValue);
                                yzxVar2.d.setScaleY(floatValue);
                                break;
                            default:
                                float floatValue2 = 1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                sue0 sue0Var3 = pjmVar2.a;
                                float c2 = y6i0.c(floatValue2, 0.0f, 1.0f);
                                yzxVar3 = ((RideCardDriverSectionView) sue0Var3.b).binding;
                                yzxVar3.d.setAlpha(c2);
                                yzxVar4 = ((RideCardDriverSectionView) sue0Var3.b).binding;
                                yzxVar4.d.setScaleX(floatValue2);
                                yzxVar4.d.setScaleY(floatValue2);
                                break;
                        }
                    }
                });
                cn91.g(new ijm(r3k0Var, pjmVar, i5), valueAnimator);
                ojmVar = new ojm(valueAnimator);
                break;
            case 6:
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.setDuration(400L);
                valueAnimator2.setInterpolator(new BounceInterpolator(0.0d, 0.0d, 3, null));
                valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.DriverSectionAnimator$getAvatarOverlayAppearAnimator$lambda$0$$inlined$doOnStart$1
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
                        pjm.this.a.n(true);
                    }
                });
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ljm
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        yzx yzxVar;
                        yzx yzxVar2;
                        yzx yzxVar3;
                        yzx yzxVar4;
                        int i7 = i6;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                sue0 sue0Var = pjmVar2.a;
                                ((RideCardDriverSectionView) sue0Var.b).setAlpha(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                break;
                            case 1:
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                sue0 sue0Var2 = pjmVar2.a;
                                float c = y6i0.c(floatValue, 0.0f, 1.0f);
                                yzxVar = ((RideCardDriverSectionView) sue0Var2.b).binding;
                                yzxVar.d.setAlpha(c);
                                yzxVar2 = ((RideCardDriverSectionView) sue0Var2.b).binding;
                                yzxVar2.d.setScaleX(floatValue);
                                yzxVar2.d.setScaleY(floatValue);
                                break;
                            default:
                                float floatValue2 = 1.0f - ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                sue0 sue0Var3 = pjmVar2.a;
                                float c2 = y6i0.c(floatValue2, 0.0f, 1.0f);
                                yzxVar3 = ((RideCardDriverSectionView) sue0Var3.b).binding;
                                yzxVar3.d.setAlpha(c2);
                                yzxVar4 = ((RideCardDriverSectionView) sue0Var3.b).binding;
                                yzxVar4.d.setScaleX(floatValue2);
                                yzxVar4.d.setScaleY(floatValue2);
                                break;
                        }
                    }
                });
                cn91.g(new ijm(pjmVar, r3k0Var), valueAnimator2);
                ValueAnimator valueAnimator3 = new ValueAnimator();
                valueAnimator3.setFloatValues(0.0f, 1.0f);
                valueAnimator3.setDuration(100L);
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ljm
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        yzx yzxVar;
                        yzx yzxVar2;
                        yzx yzxVar3;
                        yzx yzxVar4;
                        int i7 = i2;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                sue0 sue0Var = pjmVar2.a;
                                ((RideCardDriverSectionView) sue0Var.b).setAlpha(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                break;
                            case 1:
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                sue0 sue0Var2 = pjmVar2.a;
                                float c = y6i0.c(floatValue, 0.0f, 1.0f);
                                yzxVar = ((RideCardDriverSectionView) sue0Var2.b).binding;
                                yzxVar.d.setAlpha(c);
                                yzxVar2 = ((RideCardDriverSectionView) sue0Var2.b).binding;
                                yzxVar2.d.setScaleX(floatValue);
                                yzxVar2.d.setScaleY(floatValue);
                                break;
                            default:
                                float floatValue2 = 1.0f - ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                sue0 sue0Var3 = pjmVar2.a;
                                float c2 = y6i0.c(floatValue2, 0.0f, 1.0f);
                                yzxVar3 = ((RideCardDriverSectionView) sue0Var3.b).binding;
                                yzxVar3.d.setAlpha(c2);
                                yzxVar4 = ((RideCardDriverSectionView) sue0Var3.b).binding;
                                yzxVar4.d.setScaleX(floatValue2);
                                yzxVar4.d.setScaleY(floatValue2);
                                break;
                        }
                    }
                });
                valueAnimator3.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.DriverSectionAnimator$getAvatarOverlayDisappearAnimator$lambda$0$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        pjm.this.a.n(false);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                valueAnimator3.setStartDelay(100L);
                cn91.f(valueAnimator3, new sls() { // from class: jjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i5;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        switch (i7) {
                            case 0:
                                pjmVar2.a.c();
                                break;
                            case 1:
                                pjmVar2.a.c();
                                break;
                            case 2:
                                pjmVar2.a.c();
                                break;
                            default:
                                ((RideCardDriverSectionView) pjmVar2.a.b).callLayoutInContentAnimations = true;
                                break;
                        }
                        return zy11Var;
                    }
                });
                animatorSet.playSequentially(valueAnimator2, valueAnimator3);
                ojmVar = new ojm(animatorSet);
                break;
            case 7:
                ValueAnimator a = pjmVar.a(1.0f);
                cn91.f(a, new sls() { // from class: kjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i7) {
                            case 0:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var = pjmVar2.a;
                                sue0Var.c();
                                sue0Var.m(false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var2 = pjmVar2.a;
                                sue0Var2.c();
                                sue0Var2.m(false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var3 = pjmVar2.a;
                                sue0Var3.c();
                                sue0Var3.m(false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                ojmVar = new ojm(a);
                break;
            case 8:
                ojmVar = pjmVar.c(1.0f, 1.0f, new sls() { // from class: hjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i6;
                        zy11 zy11Var = zy11.a;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i7) {
                            case 0:
                                r3k0Var2.d(null, false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                break;
                            case 2:
                                r3k0Var2.d(null, false);
                                break;
                            case 3:
                                r3k0Var2.d(null, false);
                                break;
                            case 4:
                                r3k0Var2.d(null, false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            case 9:
                ValueAnimator a2 = pjmVar.a(0.5f);
                cn91.f(a2, new sls() { // from class: kjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i6;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i7) {
                            case 0:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var = pjmVar2.a;
                                sue0Var.c();
                                sue0Var.m(false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var2 = pjmVar2.a;
                                sue0Var2.c();
                                sue0Var2.m(false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var3 = pjmVar2.a;
                                sue0Var3.c();
                                sue0Var3.m(false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                ojmVar = new ojm(a2);
                break;
            case 10:
                ojmVar = pjmVar.c(0.5f, 1.0f, new sls() { // from class: hjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i2;
                        zy11 zy11Var = zy11.a;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i7) {
                            case 0:
                                r3k0Var2.d(null, false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                break;
                            case 2:
                                r3k0Var2.d(null, false);
                                break;
                            case 3:
                                r3k0Var2.d(null, false);
                                break;
                            case 4:
                                r3k0Var2.d(null, false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            case 11:
                ojmVar = pjmVar.c(0.5f, 1.0f, new sls() { // from class: hjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i5;
                        zy11 zy11Var = zy11.a;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i7) {
                            case 0:
                                r3k0Var2.d(null, false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                break;
                            case 2:
                                r3k0Var2.d(null, false);
                                break;
                            case 3:
                                r3k0Var2.d(null, false);
                                break;
                            case 4:
                                r3k0Var2.d(null, false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            case 12:
                final int i7 = 4;
                ojmVar = pjmVar.c(0.5f, 0.5f, new sls() { // from class: hjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i72 = i7;
                        zy11 zy11Var = zy11.a;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i72) {
                            case 0:
                                r3k0Var2.d(null, false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                break;
                            case 2:
                                r3k0Var2.d(null, false);
                                break;
                            case 3:
                                r3k0Var2.d(null, false);
                                break;
                            case 4:
                                r3k0Var2.d(null, false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            case 13:
                ValueAnimator a3 = pjmVar.a(1.0f);
                cn91.f(a3, new sls() { // from class: kjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i72 = i2;
                        zy11 zy11Var = zy11.a;
                        pjm pjmVar2 = pjmVar;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i72) {
                            case 0:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var = pjmVar2.a;
                                sue0Var.c();
                                sue0Var.m(false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var2 = pjmVar2.a;
                                sue0Var2.c();
                                sue0Var2.m(false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                sue0 sue0Var3 = pjmVar2.a;
                                sue0Var3.c();
                                sue0Var3.m(false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                ojmVar = new ojm(a3);
                break;
            case 14:
                ojmVar = pjmVar.c(1.0f, 1.0f, new sls() { // from class: hjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i72 = i4;
                        zy11 zy11Var = zy11.a;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i72) {
                            case 0:
                                r3k0Var2.d(null, false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                break;
                            case 2:
                                r3k0Var2.d(null, false);
                                break;
                            case 3:
                                r3k0Var2.d(null, false);
                                break;
                            case 4:
                                r3k0Var2.d(null, false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            case 15:
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator a4 = pjmVar.a(1.0f);
                ValueAnimator b4 = pjmVar.b(0.5f);
                cn91.g(new ijm(r3k0Var, pjmVar, i4), b4);
                animatorSet2.playSequentially(a4, b4);
                ojmVar = new ojm(animatorSet2);
                break;
            case 16:
                ojmVar = pjmVar.c(1.0f, 1.0f, new sls() { // from class: hjm
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i72 = i;
                        zy11 zy11Var = zy11.a;
                        r3k0 r3k0Var2 = r3k0Var;
                        switch (i72) {
                            case 0:
                                r3k0Var2.d(null, false);
                                break;
                            case 1:
                                r3k0Var2.d(null, false);
                                break;
                            case 2:
                                r3k0Var2.d(null, false);
                                break;
                            case 3:
                                r3k0Var2.d(null, false);
                                break;
                            case 4:
                                r3k0Var2.d(null, false);
                                break;
                            default:
                                r3k0Var2.d(null, false);
                                break;
                        }
                        return zy11Var;
                    }
                });
                break;
            default:
                w511.b();
                return;
        }
        Animator animator = ojmVar.a;
        final bxl bxlVar = new bxl(12, qjmVar);
        animator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.DriverSectionAnimator$asContentChange$1$doOnComplete$$inlined$doOnEnd$1
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
        if (qjmVar.c != null) {
            qjmVar.b.offer(ojmVar);
        } else {
            qjmVar.c = ojmVar;
            animator.start();
        }
    }

    public final void setCarPlateClickListener(View.OnClickListener listener) {
        this.binding.f.setOnClickListener(listener);
    }

    public final void setDriverClickListener(View.OnClickListener listener) {
        this.binding.g.setOnClickListener(listener);
    }
}
