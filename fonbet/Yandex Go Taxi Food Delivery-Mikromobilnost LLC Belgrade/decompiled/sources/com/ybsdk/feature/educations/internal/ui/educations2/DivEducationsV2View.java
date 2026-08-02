package com.ybsdk.feature.educations.internal.ui.educations2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.core.analytics.generated.delegates.EducationEvents$EducationCloseCloseType;
import com.ybsdk.core.analytics.generated.delegates.EducationEvents$EducationErrorError;
import com.ybsdk.core.common.domain.entities.CommunicationType;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.educations.api.domain.EducationDivkitContentPositionEntity;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipAlignment;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipBehaviour;
import com.ybsdk.feature.educations.internal.domain.a;
import com.ybsdk.feature.educations.internal.ui.ScrollSnapPreference;
import com.ybsdk.feature.educations.internal.ui.ShadowView;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import defpackage.acj;
import defpackage.amh;
import defpackage.awg0;
import defpackage.bpn;
import defpackage.btc;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.cz2;
import defpackage.dzh0;
import defpackage.e161;
import defpackage.e8u0;
import defpackage.em3;
import defpackage.f8u0;
import defpackage.fpn;
import defpackage.g8e;
import defpackage.gc5;
import defpackage.hnh0;
import defpackage.ipn;
import defpackage.jc0;
import defpackage.jl40;
import defpackage.jok;
import defpackage.jpn;
import defpackage.kok;
import defpackage.kp50;
import defpackage.kpn;
import defpackage.l650;
import defpackage.li91;
import defpackage.lia1;
import defpackage.lpn;
import defpackage.lrp0;
import defpackage.lz;
import defpackage.m650;
import defpackage.mok;
import defpackage.mon;
import defpackage.mv3;
import defpackage.n751;
import defpackage.njp0;
import defpackage.nok;
import defpackage.non;
import defpackage.np31;
import defpackage.ny61;
import defpackage.ook;
import defpackage.oon;
import defpackage.p7b1;
import defpackage.pok;
import defpackage.pon;
import defpackage.rok;
import defpackage.ron;
import defpackage.rr51;
import defpackage.scc;
import defpackage.sls;
import defpackage.son;
import defpackage.t750;
import defpackage.tls;
import defpackage.tok;
import defpackage.ton;
import defpackage.tv3;
import defpackage.ung0;
import defpackage.uok;
import defpackage.uon;
import defpackage.v0h;
import defpackage.v8e;
import defpackage.vok;
import defpackage.w511;
import defpackage.wgr0;
import defpackage.wlp;
import defpackage.won;
import defpackage.x4c;
import defpackage.xon;
import defpackage.xx60;
import defpackage.y0h;
import defpackage.ye0;
import defpackage.ylg0;
import defpackage.ymj;
import defpackage.yon;
import defpackage.z1x0;
import defpackage.z50;
import defpackage.zah0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0002\u0086\u0001B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010\u001aJ\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010\u0011J\u000f\u0010.\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010\u001aJ\u0017\u00104\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00105\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u0011J\u0017\u00106\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b9\u00107J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010\u0011J'\u0010I\u001a\u00020H2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020)2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bK\u0010LJ\u001d\u0010N\u001a\u00020\u000f2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002¢\u0006\u0004\bN\u0010 J\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bP\u0010QJ!\u0010S\u001a\u0004\u0018\u00010\u00072\u0006\u0010R\u001a\u00020O2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010R\u001a\u00020OH\u0002¢\u0006\u0004\bV\u0010WJ-\u0010\\\u001a\u00020)*\u0004\u0018\u00010X2\u0006\u0010Z\u001a\u00020Y2\u000e\b\u0002\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002¢\u0006\u0004\b\\\u0010]J\u0019\u0010`\u001a\u00020\u000f2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010\u001aJ\u0011\u0010d\u001a\u0004\u0018\u00010cH\u0002¢\u0006\u0004\bd\u0010eJ\u0011\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010iR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010}R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010~R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u007fR!\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b(\u0010\u0084\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/ybsdk/feature/educations/internal/ui/educations2/DivEducationsV2View;", "Landroid/widget/FrameLayout;", "Llpn;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Look;", "interactor", "Lfpn;", "remoteConfig", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILook;Lfpn;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/ViewGroup;", "container", "prepareView", "(Landroid/view/ViewGroup;)V", "Lyon;", "viewState", "render", "(Lyon;)V", "dismiss", "dismissImmediately", "Lkotlin/Function0;", "onDismiss", "setOnDismissListener", "(Lsls;)V", "Lxon;", "scrollContext", "setScrollContext", "(Lxon;)V", "setClickListeners", "setInsetsListener", "Lwon;", "educationStep", "", "setDivkitData", "(Lwon;)Z", "showView", "prepareAnchorIfNeeded", "shouldDismissTooltip", "()Z", "", "addOnPreDrawActions", "(Lwon;)Ljava/lang/Object;", "animateShow", "onShown", "setContentInvisible", "setContentVisible", "(Lwon;)V", "updatePopupPosition", "updateShadow", "Luon;", "tooltipContentEntity", "updateTooltipContent", "(Luon;)V", "Lson;", "divkitContentEntity", "updateDivkitContent", "(Lson;)V", "updateFullscreenContent", "Landroid/view/View;", "anchor", "content", "Ljpn;", "tooltipEntity", "Lkok;", "getPositionBehavior", "(Landroid/view/View;Landroid/view/View;Ljpn;)Lkok;", "isTooltipFit", "(Ljpn;)Z", "showAction", "tryToScrollAndShowOrJustShow", "Lron;", "getScrollBehaviour", "(Lwon;)Lron;", "scrollBehaviour", "getScrollPosition", "(Lron;Lxon;)Ljava/lang/Integer;", "Lcom/ybsdk/feature/educations/internal/ui/ScrollSnapPreference;", "getSnapPreference", "(Lron;)Lcom/ybsdk/feature/educations/internal/ui/ScrollSnapPreference;", "Lrr51;", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "targetView", "onFailure", "setDataOrRun", "(Lrr51;Lcom/ybsdk/feature/divkit/api/ui/YbDivView;Lsls;)Z", "", "viewId", "onIncorrectAnchor", "(Ljava/lang/String;)V", "announceForAccessibilityOnShow", "Lm650;", "findNavigationBarColorOwner", "()Lm650;", "Lf8u0;", "findStatusBarColorOwner", "()Lf8u0;", "Look;", "Lfpn;", "Le161;", "binding", "Le161;", "Lz1x0;", "transparentSystemBarColors", "Lz1x0;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/view/ViewPropertyAnimator;", "animator", "Landroid/view/ViewPropertyAnimator;", "Ll650;", "overrideNavigationBarColorsCallback", "Ll650;", "Le8u0;", "overrideStatusBarColorsCallback", "Le8u0;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "Lxon;", "onDismissListener", "Lsls;", "currentViewState", "Lyon;", "Lwon;", "Companion", "tok", "feature-educations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivEducationsV2View extends FrameLayout implements lpn {

    @Deprecated
    public static final long ANIMATION_DURATION = 500;

    @Deprecated
    public static final long FADE_ANIMATION_DELAY = 50;
    private View anchor;
    private ViewPropertyAnimator animator;
    private final e161 binding;
    private ViewGroup container;
    private yon currentViewState;
    private won educationStep;
    private final Handler handler;
    private final ook interactor;
    private sls onDismissListener;
    private l650 overrideNavigationBarColorsCallback;
    private e8u0 overrideStatusBarColorsCallback;
    private final fpn remoteConfig;
    private xon scrollContext;
    private final z1x0 transparentSystemBarColors;
    private static final tok Companion = new tok();
    private static final float CORNER_RADIUS_PX = kp50.t(24);

    public DivEducationsV2View(Context context, AttributeSet attributeSet, int i, ook ookVar, fpn fpnVar) {
        super(context, attributeSet, i);
        this.interactor = ookVar;
        this.remoteConfig = fpnVar;
        LayoutInflater.from(context).inflate(hnh0.ybsdk_div_educations_v2_view, this);
        int i2 = zah0.educationsV2CrossButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) cma1.O(i2, this);
        if (appCompatImageButton != null) {
            i2 = zah0.educationsV2DivkitContentContainer;
            YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
            if (ybDivView != null) {
                i2 = zah0.educationsV2ShadowView;
                ShadowView shadowView = (ShadowView) cma1.O(i2, this);
                if (shadowView != null) {
                    i2 = zah0.educationsV2TooltipBubbleArrow;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView != null) {
                        i2 = zah0.educationsV2TooltipContentContainer;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
                        if (frameLayout != null) {
                            i2 = zah0.educationsV2TooltipDivkitData;
                            YbDivView ybDivView2 = (YbDivView) cma1.O(i2, this);
                            if (ybDivView2 != null) {
                                this.binding = new e161(this, appCompatImageButton, ybDivView, shadowView, appCompatImageView, frameLayout, ybDivView2);
                                this.transparentSystemBarColors = new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent), null);
                                this.handler = new Handler(Looper.getMainLooper());
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final Object addOnPreDrawActions(won educationStep) {
        e161 e161Var = this.binding;
        if (!(educationStep instanceof uon)) {
            if (!(educationStep instanceof son) && !(educationStep instanceof ton)) {
                return zy11.a;
            }
            YbDivView ybDivView = e161Var.c;
            return OneShotPreDrawListener.add(ybDivView, new lz(14, ybDivView, this, educationStep));
        }
        FrameLayout frameLayout = e161Var.f;
        uon uonVar = (uon) educationStep;
        OneShotPreDrawListener.add(frameLayout, new vok(frameLayout, this, uonVar, 0));
        View view = this.anchor;
        if (view != null) {
            return OneShotPreDrawListener.add(view, new vok(view, this, uonVar, 1));
        }
        return null;
    }

    private final void animateShow(yon viewState) {
        ViewPropertyAnimator viewPropertyAnimator = this.animator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        setAlpha(0.0f);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), ylg0.ybsdk_default_interpolator);
        ViewPropertyAnimator g = AnimUtils.g(this);
        g.setDuration(500L);
        g.setInterpolator(loadInterpolator);
        g.withEndAction(new pok(this, viewState, 1)).withStartAction(new rok(this, 0)).start();
        this.animator = g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShow$lambda$27(DivEducationsV2View divEducationsV2View, yon yonVar) {
        divEducationsV2View.animator = null;
        if (!divEducationsV2View.hasWindowFocus()) {
            divEducationsV2View.dismissImmediately();
            return;
        }
        won wonVar = divEducationsV2View.educationStep;
        divEducationsV2View.updatePopupPosition(wonVar != null ? wonVar : null);
        divEducationsV2View.onShown(yonVar);
        divEducationsV2View.announceForAccessibilityOnShow(yonVar);
        divEducationsV2View.setClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShow$lambda$28(DivEducationsV2View divEducationsV2View) {
        if (!divEducationsV2View.hasWindowFocus()) {
            divEducationsV2View.dismissImmediately();
            return;
        }
        won wonVar = divEducationsV2View.educationStep;
        if (wonVar == null) {
            wonVar = null;
        }
        divEducationsV2View.setContentVisible(wonVar);
    }

    private final void announceForAccessibilityOnShow(yon viewState) {
        Resources resources = getContext().getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(dzh0.ybsdk_educations_accessibility_announce_education_show));
        if (viewState.b.d.size() > 1) {
            sb.append(resources.getString(dzh0.ybsdk_educations_accessibility_announce_education_step, 1));
        }
        b.r(this, sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$50(DivEducationsV2View divEducationsV2View) {
        divEducationsV2View.dismissImmediately();
        divEducationsV2View.animator = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    private final m650 findNavigationBarColorOwner() {
        Fragment u = com.ybsdk.core.utils.ext.view.b.u(this, true);
        if (u == null) {
            return null;
        }
        ?? r1 = u;
        while (true) {
            if (r1 == 0) {
                xx60 activity = u.getActivity();
                if (!(activity instanceof m650)) {
                    activity = null;
                }
                m650 m650Var = (m650) activity;
                r1 = m650Var != null ? m650Var : null;
            } else {
                if (r1 instanceof m650) {
                    break;
                }
                r1 = r1.getParentFragment();
            }
        }
        return (m650) r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    private final f8u0 findStatusBarColorOwner() {
        Fragment u = com.ybsdk.core.utils.ext.view.b.u(this, true);
        if (u == null) {
            return null;
        }
        ?? r1 = u;
        while (true) {
            if (r1 == 0) {
                xx60 activity = u.getActivity();
                if (!(activity instanceof f8u0)) {
                    activity = null;
                }
                f8u0 f8u0Var = (f8u0) activity;
                r1 = f8u0Var != null ? f8u0Var : null;
            } else {
                if (r1 instanceof f8u0) {
                    break;
                }
                r1 = r1.getParentFragment();
            }
        }
        return (f8u0) r1;
    }

    private final kok getPositionBehavior(View anchor, View content, jpn tooltipEntity) {
        int i = uok.b[tooltipEntity.b.ordinal()];
        if (i == 1) {
            return new jok(anchor, content, this, tooltipEntity);
        }
        if (i == 2) {
            return new mok(anchor, content, this, tooltipEntity);
        }
        w511.b();
        return null;
    }

    private final ron getScrollBehaviour(won educationStep) {
        if (educationStep instanceof uon) {
            return ((uon) educationStep).d;
        }
        if (educationStep instanceof son) {
            return ((son) educationStep).f;
        }
        return null;
    }

    private final Integer getScrollPosition(ron scrollBehaviour, xon scrollContext) {
        if (scrollBehaviour instanceof oon) {
            int i = uok.c[((oon) scrollBehaviour).a.ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i != 2) {
                return null;
            }
            return Integer.valueOf(scc.f(scrollContext.a));
        }
        if (!(scrollBehaviour instanceof pon)) {
            return null;
        }
        List list = scrollContext.a;
        String str = ((pon) scrollBehaviour).a;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (cvu0.s(((gc5) it.next()).b(), str, false)) {
                break;
            }
            i2++;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (i2 != -1) {
            return valueOf;
        }
        return null;
    }

    private final ScrollSnapPreference getSnapPreference(ron scrollBehaviour) {
        if (scrollBehaviour instanceof oon) {
            return ScrollSnapPreference.SNAP_TO_START;
        }
        if (!(scrollBehaviour instanceof pon)) {
            return null;
        }
        int i = uok.d[((pon) scrollBehaviour).b.ordinal()];
        if (i == 1) {
            return ScrollSnapPreference.SNAP_TO_START;
        }
        if (i != 2) {
            return null;
        }
        return ScrollSnapPreference.SNAP_TO_END;
    }

    private final boolean isTooltipFit(jpn tooltipEntity) {
        EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour;
        View view = this.anchor;
        if (view != null) {
            Point j = com.ybsdk.core.utils.ext.view.b.j(view);
            FrameLayout frameLayout = this.binding.f;
            int i = j.y;
            int height = (view.getRootView().getHeight() - j.y) - view.getHeight();
            boolean z = i > frameLayout.getHeight();
            boolean z2 = height > frameLayout.getHeight();
            boolean z3 = frameLayout.getHeight() + j.y <= view.getRootView().getHeight();
            boolean z4 = (view.getHeight() + j.y) - frameLayout.getHeight() >= 0;
            EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour2 = tooltipEntity.b;
            EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment = tooltipEntity.c;
            EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour3 = EducationsTooltipEntity$EducationsTooltipBehaviour.ABOVE_ANCHOR;
            if ((educationsTooltipEntity$EducationsTooltipBehaviour2 == educationsTooltipEntity$EducationsTooltipBehaviour3 && educationsTooltipEntity$EducationsTooltipAlignment == EducationsTooltipEntity$EducationsTooltipAlignment.TOP && z) || ((educationsTooltipEntity$EducationsTooltipBehaviour2 == educationsTooltipEntity$EducationsTooltipBehaviour3 && educationsTooltipEntity$EducationsTooltipAlignment == EducationsTooltipEntity$EducationsTooltipAlignment.BOTTOM && z3) || ((educationsTooltipEntity$EducationsTooltipBehaviour2 == (educationsTooltipEntity$EducationsTooltipBehaviour = EducationsTooltipEntity$EducationsTooltipBehaviour.UNDER_ANCHOR) && educationsTooltipEntity$EducationsTooltipAlignment == EducationsTooltipEntity$EducationsTooltipAlignment.BOTTOM && z2) || (educationsTooltipEntity$EducationsTooltipBehaviour2 == educationsTooltipEntity$EducationsTooltipBehaviour && educationsTooltipEntity$EducationsTooltipAlignment == EducationsTooltipEntity$EducationsTooltipAlignment.TOP && z4)))) {
                return true;
            }
        }
        return false;
    }

    private final void onIncorrectAnchor(String viewId) {
        this.interactor.b(viewId);
        this.interactor.a();
        dismiss();
    }

    private final void onShown(yon viewState) {
        if (isAttachedToWindow()) {
            ook ookVar = this.interactor;
            kpn kpnVar = viewState.b;
            String str = kpnVar.b;
            String str2 = kpnVar.c;
            ye0 ye0Var = viewState.a;
            a aVar = ookVar.b;
            aVar.b(new btc(str, str2, ye0Var, CommunicationType.EDUCATION));
            aVar.a(str, ookVar);
            ook ookVar2 = this.interactor;
            nok nokVar = ookVar2.x;
            if (nokVar != null) {
                em3 em3Var = ookVar2.w.w;
                String str3 = nokVar.a;
                int i = nokVar.b;
                int i2 = nokVar.c;
                LinkedHashMap w = g8e.w(3, "education_id", str3);
                w.put("slides_cnt", Integer.valueOf(i));
                w.put("current_slide", Integer.valueOf(i2));
                em3Var.a.a("education.shown", w);
            }
        }
    }

    private final void prepareAnchorIfNeeded() {
        ipn ipnVar;
        won wonVar = this.educationStep;
        View view = null;
        if (wonVar == null) {
            wonVar = null;
        }
        uon uonVar = wonVar instanceof uon ? (uon) wonVar : null;
        String str = (uonVar == null || (ipnVar = uonVar.c.a) == null) ? null : ipnVar.a;
        ViewGroup viewGroup = this.container;
        if (viewGroup == null || str == null) {
            return;
        }
        View c = li91.c(viewGroup, str);
        if (c == null) {
            this.interactor.b(str);
        } else {
            view = c;
        }
        this.anchor = view;
    }

    private final void setClickListeners() {
        e161 e161Var = this.binding;
        e161Var.b.setOnTouchListener(new cz2(14));
        final int i = 0;
        e161Var.b.setOnClickListener(new View.OnClickListener(this) { // from class: sok
            public final /* synthetic */ DivEducationsV2View b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DivEducationsV2View divEducationsV2View = this.b;
                switch (i2) {
                    case 0:
                        DivEducationsV2View.setClickListeners$lambda$9$lambda$2(divEducationsV2View, view);
                        break;
                    default:
                        DivEducationsV2View.setClickListeners$lambda$9$lambda$4(divEducationsV2View, view);
                        break;
                }
            }
        });
        ook ookVar = this.interactor;
        amh amhVar = new amh(29, this);
        ((bpn) ookVar.c).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new amh(28, amhVar), 15));
        final int i2 = 1;
        e161Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: sok
            public final /* synthetic */ DivEducationsV2View b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                DivEducationsV2View divEducationsV2View = this.b;
                switch (i22) {
                    case 0:
                        DivEducationsV2View.setClickListeners$lambda$9$lambda$2(divEducationsV2View, view);
                        break;
                    default:
                        DivEducationsV2View.setClickListeners$lambda$9$lambda$4(divEducationsV2View, view);
                        break;
                }
            }
        });
        e161Var.g.setActionHandler(new tls(this) { // from class: qok
            public final /* synthetic */ DivEducationsV2View b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean clickListeners$lambda$9$lambda$8;
                int i3 = i2;
                DivEducationsV2View divEducationsV2View = this.b;
                Uri uri = (Uri) obj;
                switch (i3) {
                    case 0:
                        clickListeners$lambda$9$lambda$8 = DivEducationsV2View.setClickListeners$lambda$9$lambda$8(divEducationsV2View, uri);
                        break;
                    default:
                        clickListeners$lambda$9$lambda$8 = DivEducationsV2View.setClickListeners$lambda$9$lambda$6(divEducationsV2View, uri);
                        break;
                }
                return Boolean.valueOf(clickListeners$lambda$9$lambda$8);
            }
        });
        e161Var.c.setActionHandler(new tls(this) { // from class: qok
            public final /* synthetic */ DivEducationsV2View b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean clickListeners$lambda$9$lambda$8;
                int i3 = i;
                DivEducationsV2View divEducationsV2View = this.b;
                Uri uri = (Uri) obj;
                switch (i3) {
                    case 0:
                        clickListeners$lambda$9$lambda$8 = DivEducationsV2View.setClickListeners$lambda$9$lambda$8(divEducationsV2View, uri);
                        break;
                    default:
                        clickListeners$lambda$9$lambda$8 = DivEducationsV2View.setClickListeners$lambda$9$lambda$6(divEducationsV2View, uri);
                        break;
                }
                return Boolean.valueOf(clickListeners$lambda$9$lambda$8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListeners$lambda$9$lambda$2(DivEducationsV2View divEducationsV2View, View view) {
        ook ookVar = divEducationsV2View.interactor;
        nok nokVar = ookVar.x;
        if (nokVar != null) {
            ookVar.w.w.c(nokVar.a, nokVar.b, nokVar.c, EducationEvents$EducationCloseCloseType.CLOSE_BUTTON);
        }
        divEducationsV2View.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setClickListeners$lambda$9$lambda$3(DivEducationsV2View divEducationsV2View) {
        divEducationsV2View.dismiss();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListeners$lambda$9$lambda$4(DivEducationsV2View divEducationsV2View, View view) {
        ook ookVar = divEducationsV2View.interactor;
        nok nokVar = ookVar.x;
        if (nokVar != null) {
            ookVar.w.w.c(nokVar.a, nokVar.b, nokVar.c, EducationEvents$EducationCloseCloseType.EMPTY_SPACE_CLICK);
        }
        divEducationsV2View.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setClickListeners$lambda$9$lambda$6(DivEducationsV2View divEducationsV2View, Uri uri) {
        List list;
        y0h y0hVar = ((bpn) divEducationsV2View.interactor.c).a.c(uri.toString()).a;
        v0h v0hVar = y0hVar instanceof v0h ? (v0h) y0hVar : null;
        if (v0hVar != null && (list = v0hVar.a) != null && (!list.isEmpty())) {
            setClickListeners$lambda$9$lambda$6$lambda$5(divEducationsV2View);
        }
        return true;
    }

    private static final zy11 setClickListeners$lambda$9$lambda$6$lambda$5(DivEducationsV2View divEducationsV2View) {
        divEducationsV2View.dismiss();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setClickListeners$lambda$9$lambda$8(DivEducationsV2View divEducationsV2View, Uri uri) {
        List list;
        y0h y0hVar = ((bpn) divEducationsV2View.interactor.c).a.c(uri.toString()).a;
        v0h v0hVar = y0hVar instanceof v0h ? (v0h) y0hVar : null;
        if (v0hVar != null && (list = v0hVar.a) != null && (!list.isEmpty())) {
            setClickListeners$lambda$9$lambda$8$lambda$7(divEducationsV2View);
        }
        return true;
    }

    private static final zy11 setClickListeners$lambda$9$lambda$8$lambda$7(DivEducationsV2View divEducationsV2View) {
        divEducationsV2View.dismiss();
        return zy11.a;
    }

    private final void setContentInvisible() {
        e161 e161Var = this.binding;
        if (((CommonFeatureFlag) ((tv3) this.remoteConfig).a.d(wlp.y0).getData()).isEnabled()) {
            e161Var.a.setOnTouchListener(new cz2(5));
            ook ookVar = this.interactor;
            ookVar.y = false;
            ookVar.w.m0.a.a("tech.sleepInteractions.start", null);
        }
        e161Var.d.setVisibility(4);
        e161Var.f.setVisibility(4);
        e161Var.c.setVisibility(4);
        e161Var.b.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setContentInvisible$lambda$30$lambda$29(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void setContentVisible(won educationStep) {
        e161 e161Var = this.binding;
        DivEducationsV2View divEducationsV2View = e161Var.a;
        YbDivView ybDivView = e161Var.c;
        ShadowView shadowView = e161Var.d;
        divEducationsV2View.setOnTouchListener(new cz2(4));
        ook ookVar = this.interactor;
        if (!ookVar.y) {
            ookVar.w.m0.a.a("tech.sleepInteractions.end", null);
        }
        e161Var.b.setVisibility((educationStep.a() || lia1.g(getContext())) ? 0 : 8);
        if (educationStep instanceof uon) {
            shadowView.setVisibility(0);
            e161Var.f.setVisibility(0);
        } else if (educationStep instanceof son) {
            shadowView.setVisibility(0);
            ybDivView.setVisibility(0);
        } else if (educationStep instanceof ton) {
            ybDivView.setVisibility(0);
        }
    }

    private final boolean setDataOrRun(rr51 rr51Var, YbDivView ybDivView, sls slsVar) {
        if (rr51Var != null) {
            YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
            return true;
        }
        slsVar.invoke();
        return false;
    }

    public static /* synthetic */ boolean setDataOrRun$default(DivEducationsV2View divEducationsV2View, rr51 rr51Var, YbDivView ybDivView, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = new acj(15);
        }
        return divEducationsV2View.setDataOrRun(rr51Var, ybDivView, slsVar);
    }

    private final boolean setDivkitData(won educationStep) {
        e161 e161Var = this.binding;
        if (educationStep instanceof uon) {
            return setDataOrRun$default(this, ((uon) educationStep).c.d, e161Var.g, null, 2, null);
        }
        if (educationStep instanceof son) {
            return setDataOrRun(((son) educationStep).d, e161Var.c, new DivEducationsV2View$setDivkitData$1$1(0, this.interactor, ook.class, "onConfigurationFailed", "onConfigurationFailed()Lcom/ybsdk/feature/educations/internal/ui/educations2/DivEducationsV2Interactor$AnalyticsData;", 8));
        }
        if (educationStep instanceof ton) {
            return setDataOrRun(((ton) educationStep).b, e161Var.c, new DivEducationsV2View$setDivkitData$1$2(0, this.interactor, ook.class, "onConfigurationFailed", "onConfigurationFailed()Lcom/ybsdk/feature/educations/internal/ui/educations2/DivEducationsV2Interactor$AnalyticsData;", 8));
        }
        return false;
    }

    private final void setInsetsListener() {
        com.ybsdk.core.utils.ext.view.b.w(this, new v8e(19, this));
        WeakHashMap weakHashMap = b.a;
        np31.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setInsetsListener$lambda$11(DivEducationsV2View divEducationsV2View, View view, n751 n751Var) {
        AppCompatImageButton appCompatImageButton = divEducationsV2View.binding.b;
        ViewGroup.LayoutParams layoutParams = appCompatImageButton.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, com.ybsdk.core.utils.ext.view.b.h(awg0.ybsdk_cross_button_margin_top, divEducationsV2View) + p7b1.f(n751Var).b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        appCompatImageButton.setLayoutParams(marginLayoutParams);
        return n751Var;
    }

    private final boolean shouldDismissTooltip() {
        won wonVar = this.educationStep;
        if (wonVar == null) {
            wonVar = null;
        }
        uon uonVar = wonVar instanceof uon ? (uon) wonVar : null;
        if (uonVar != null) {
            return (((CommonFeatureFlag) ((tv3) this.remoteConfig).a.d(wlp.B0).getData()).isEnabled() && !isTooltipFit(uonVar.c)) || this.anchor == null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showView(yon viewState) {
        if (!hasWindowFocus()) {
            dismissImmediately();
            return;
        }
        prepareAnchorIfNeeded();
        if (shouldDismissTooltip()) {
            this.interactor.a();
            dismissImmediately();
            return;
        }
        tryToScrollAndShowOrJustShow(new ymj(6, this, viewState));
        viewState.getClass();
        m650 findNavigationBarColorOwner = findNavigationBarColorOwner();
        this.overrideNavigationBarColorsCallback = findNavigationBarColorOwner != null ? findNavigationBarColorOwner.overrideNavigationBarColor(this.transparentSystemBarColors) : null;
        f8u0 findStatusBarColorOwner = findStatusBarColorOwner();
        this.overrideStatusBarColorsCallback = findStatusBarColorOwner != null ? findStatusBarColorOwner.overrideStatusBarColor(this.transparentSystemBarColors) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showView$lambda$19(DivEducationsV2View divEducationsV2View, yon yonVar) {
        divEducationsV2View.animateShow(yonVar);
        won wonVar = divEducationsV2View.educationStep;
        if (wonVar == null) {
            wonVar = null;
        }
        divEducationsV2View.addOnPreDrawActions(wonVar);
        return zy11.a;
    }

    private final void tryToScrollAndShowOrJustShow(sls showAction) {
        lrp0 lrp0Var = lrp0.j;
        won wonVar = this.educationStep;
        if (wonVar == null) {
            wonVar = null;
        }
        ron scrollBehaviour = getScrollBehaviour(wonVar);
        xon xonVar = this.scrollContext;
        if (scrollBehaviour == null || xonVar == null) {
            showAction.invoke();
            return;
        }
        Integer scrollPosition = getScrollPosition(scrollBehaviour, xonVar);
        ScrollSnapPreference snapPreference = getSnapPreference(scrollBehaviour);
        ViewGroup viewGroup = this.container;
        if (scrollPosition == null || snapPreference == null || viewGroup == null) {
            nok nokVar = this.interactor.x;
            x4c.g("Education has wrong scroll behaviour", null, g8e.z("education_id", nokVar != null ? nokVar.a : null), Collections.singletonList(lrp0Var), 2);
            this.interactor.a();
            dismissImmediately();
            return;
        }
        RecyclerView recyclerView = xonVar.b;
        int intValue = scrollPosition.intValue();
        pon ponVar = scrollBehaviour instanceof pon ? (pon) scrollBehaviour : null;
        Integer num = ponVar != null ? ponVar.c : null;
        AppBarLayout appBarLayout = xonVar.c;
        jc0 jc0Var = new jc0(25, showAction);
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            x4c.g("RecyclerView doesn't contain layoutManager", null, null, Collections.singletonList(lrp0Var), 6);
            tryToScrollAndShowOrJustShow$lambda$52(this);
        } else {
            MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0);
            viewGroup.dispatchTouchEvent(obtain);
            obtain.recycle();
            recyclerView.post(new z50(new njp0(snapPreference, num, intValue, appBarLayout, recyclerView, jc0Var, recyclerView.getContext()), intValue, linearLayoutManager, 12));
        }
    }

    private static final zy11 tryToScrollAndShowOrJustShow$lambda$52(DivEducationsV2View divEducationsV2View) {
        divEducationsV2View.dismissImmediately();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 tryToScrollAndShowOrJustShow$lambda$53(sls slsVar) {
        slsVar.invoke();
        return zy11.a;
    }

    private final void updateDivkitContent(son divkitContentEntity) {
        wgr0 highlightViewBounds;
        wgr0 highlightViewBounds2;
        e161 e161Var = this.binding;
        YbDivView ybDivView = e161Var.c;
        ShadowView shadowView = e161Var.d;
        ViewGroup.LayoutParams layoutParams = ybDivView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = -2;
        ybDivView.setLayoutParams(layoutParams2);
        mon monVar = divkitContentEntity.c;
        EducationDivkitContentPositionEntity educationDivkitContentPositionEntity = monVar.a;
        String str = monVar.b;
        int i = uok.a[educationDivkitContentPositionEntity.ordinal()];
        if (i == 1) {
            ViewGroup.LayoutParams layoutParams3 = ybDivView.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 48;
            ybDivView.setLayoutParams(layoutParams4);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams5 = ybDivView.getLayoutParams();
            if (layoutParams5 == null) {
                ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.gravity = 80;
            ybDivView.setLayoutParams(layoutParams6);
            return;
        }
        if (i == 3) {
            if (str == null || (highlightViewBounds = shadowView.getHighlightViewBounds(str)) == null) {
                onIncorrectAnchor(str);
                return;
            }
            float f = highlightViewBounds.a;
            ViewGroup.LayoutParams layoutParams7 = ybDivView.getLayoutParams();
            if (layoutParams7 == null) {
                ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
            layoutParams8.gravity = 80;
            layoutParams8.bottomMargin = e161Var.a.getHeight() - ((int) f);
            ybDivView.setLayoutParams(layoutParams8);
            return;
        }
        if (i != 4) {
            w511.b();
            return;
        }
        if (str == null || (highlightViewBounds2 = shadowView.getHighlightViewBounds(str)) == null) {
            onIncorrectAnchor(str);
            return;
        }
        float f2 = highlightViewBounds2.b;
        ViewGroup.LayoutParams layoutParams9 = ybDivView.getLayoutParams();
        if (layoutParams9 == null) {
            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
        layoutParams10.gravity = 48;
        layoutParams10.topMargin = (int) f2;
        ybDivView.setLayoutParams(layoutParams10);
    }

    private final void updateFullscreenContent() {
        YbDivView ybDivView = this.binding.c;
        ViewGroup.LayoutParams layoutParams = ybDivView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = -1;
        ybDivView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePopupPosition(won educationStep) {
        if (educationStep instanceof uon) {
            updateShadow(educationStep);
            updateTooltipContent((uon) educationStep);
        } else if (educationStep instanceof son) {
            updateShadow(educationStep);
            updateDivkitContent((son) educationStep);
        } else if (educationStep instanceof ton) {
            updateFullscreenContent();
        }
    }

    private final void updateShadow(won educationStep) {
        ArrayList arrayList;
        com.ybsdk.feature.educations.internal.ui.a aVar;
        boolean z = educationStep instanceof uon;
        if (z) {
            arrayList = ((uon) educationStep).b.a;
        } else if (!(educationStep instanceof son)) {
            return;
        } else {
            arrayList = ((son) educationStep).b.a;
        }
        ArrayList arrayList2 = arrayList;
        Integer valueOf = (!z ? this : null) != null ? Integer.valueOf(com.ybsdk.core.utils.ext.view.b.g(ung0.ybColor_background_education, this)) : null;
        son sonVar = educationStep instanceof son ? (son) educationStep : null;
        if (sonVar != null) {
            non nonVar = sonVar.e;
            aVar = new com.ybsdk.feature.educations.internal.ui.a(nonVar.b, nonVar.a);
        } else {
            aVar = null;
        }
        ShadowView shadowView = this.binding.d;
        yon yonVar = this.currentViewState;
        shadowView.render(new ShadowView.a(yonVar != null ? yonVar.b.a : null, arrayList2, ((CommonFeatureFlag) ((tv3) this.remoteConfig).a.d(wlp.A0).getData()).isEnabled(), valueOf, aVar));
    }

    private final void updateTooltipContent(uon tooltipContentEntity) {
        View view = this.anchor;
        if (view == null) {
            return;
        }
        e161 e161Var = this.binding;
        TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.CENTER;
        FrameLayout frameLayout = e161Var.f;
        AppCompatImageView appCompatImageView = e161Var.e;
        kok positionBehavior = getPositionBehavior(view, frameLayout, tooltipContentEntity.c);
        Point g = positionBehavior.g(tooltipCommon$PreferredGravity);
        YbDivView ybDivView = e161Var.g;
        ybDivView.setPadding(ybDivView.getPaddingLeft(), 0, ybDivView.getPaddingRight(), positionBehavior.h());
        FrameLayout frameLayout2 = e161Var.f;
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = positionBehavior.i();
        layoutParams2.height = -2;
        layoutParams2.width = -1;
        frameLayout2.setLayoutParams(layoutParams2);
        appCompatImageView.setRotation(positionBehavior.e());
        appCompatImageView.setTranslationX(positionBehavior.d(g, appCompatImageView.getWidth(), tooltipCommon$PreferredGravity));
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) appCompatImageView.getLayoutParams();
        if (layoutParams3.gravity != positionBehavior.c()) {
            layoutParams3.gravity = positionBehavior.c();
            appCompatImageView.setLayoutParams(layoutParams3);
        }
    }

    @Override // defpackage.lpn
    public void dismiss() {
        ViewPropertyAnimator viewPropertyAnimator = this.animator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), ylg0.ybsdk_default_interpolator);
        ViewPropertyAnimator a = AnimUtils.a(0.0f, this);
        a.setInterpolator(loadInterpolator);
        a.setStartDelay(50L);
        a.setDuration(500L);
        this.animator = a.withEndAction(new rok(this, 1));
        a.start();
    }

    public void dismissImmediately() {
        ViewGroup viewGroup = this.container;
        if (viewGroup != null && isAttachedToWindow() && viewGroup.getViewTreeObserver().isAlive()) {
            viewGroup.removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        e161 e161Var = this.binding;
        super.onAttachedToWindow();
        li91.i(e161Var.a, String.valueOf(this.binding.a.getId()));
        YbDivView ybDivView = e161Var.g;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(CORNER_RADIUS_PX);
        gradientDrawable.setTint(com.ybsdk.core.utils.ext.view.b.g(ung0.ybColor_fill_default_50, this));
        ybDivView.setBackground(gradientDrawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        li91.i(this.binding.a, null);
        this.handler.removeCallbacksAndMessages(null);
        l650 l650Var = this.overrideNavigationBarColorsCallback;
        if (l650Var != null) {
            t750 t750Var = (t750) l650Var;
            NavigationFragment.overrideNavigationBarColor$lambda$26(t750Var.a, t750Var.b);
        }
        e8u0 e8u0Var = this.overrideStatusBarColorsCallback;
        if (e8u0Var != null) {
            t750 t750Var2 = (t750) e8u0Var;
            NavigationFragment.overrideStatusBarColor$lambda$25(t750Var2.a, t750Var2.b);
        }
        this.overrideNavigationBarColorsCallback = null;
        this.overrideStatusBarColorsCallback = null;
        sls slsVar = this.onDismissListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.onDismissListener = null;
        this.currentViewState = null;
        this.scrollContext = null;
        this.container = null;
        this.animator = null;
        this.anchor = null;
        super.onDetachedFromWindow();
    }

    public final void prepareView(ViewGroup container) {
        this.container = container;
        container.addView(this, 0);
        bringToFront();
        setInsetsListener();
    }

    @Override // defpackage.lpn
    public void render(yon viewState) {
        boolean z = viewState.c;
        kpn kpnVar = viewState.b;
        List list = kpnVar.d;
        if (scc.f(list) < 0) {
            ook ookVar = this.interactor;
            nok nokVar = ookVar.x;
            if (nokVar != null) {
                ookVar.w.w.d(nokVar.a, nokVar.b, nokVar.c, EducationEvents$EducationErrorError.INDEX_OUT_OF_RANGE);
            }
            dismissImmediately();
            return;
        }
        int i = 0;
        this.educationStep = (won) list.get(0);
        yon yonVar = this.currentViewState;
        won wonVar = yonVar != null ? (won) yonVar.b.d.get(0) : null;
        won wonVar2 = this.educationStep;
        if (wonVar2 == null) {
            wonVar2 = null;
        }
        if (jl40.l(wonVar, wonVar2)) {
            return;
        }
        this.currentViewState = viewState;
        if (!z) {
            won wonVar3 = this.educationStep;
            if (wonVar3 == null) {
                wonVar3 = null;
            }
            if (getScrollBehaviour(wonVar3) == null) {
                dismissImmediately();
                return;
            }
        }
        ook ookVar2 = this.interactor;
        String str = kpnVar.a;
        int size = list.size();
        ookVar2.getClass();
        ookVar2.x = new nok(str, size, 1);
        setContentInvisible();
        won wonVar4 = this.educationStep;
        if (wonVar4 == null) {
            wonVar4 = null;
        }
        if (!setDivkitData(wonVar4)) {
            dismissImmediately();
            return;
        }
        Integer num = kpnVar.e;
        if (num != null) {
            if (!z) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                this.handler.removeCallbacksAndMessages(null);
                this.handler.postDelayed(new pok(this, viewState, i), intValue);
                return;
            }
        }
        showView(viewState);
    }

    @Override // defpackage.lpn
    public void setOnDismissListener(sls onDismiss) {
        this.onDismissListener = onDismiss;
    }

    @Override // defpackage.lpn
    public void setScrollContext(xon scrollContext) {
        this.scrollContext = scrollContext;
    }

    public DivEducationsV2View(Context context, AttributeSet attributeSet, ook ookVar, fpn fpnVar) {
        this(context, attributeSet, 0, ookVar, fpnVar, 4, null);
    }

    public /* synthetic */ DivEducationsV2View(Context context, AttributeSet attributeSet, int i, ook ookVar, fpn fpnVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, ookVar, fpnVar);
    }

    public DivEducationsV2View(Context context, ook ookVar, fpn fpnVar) {
        this(context, null, 0, ookVar, fpnVar, 6, null);
    }
}
