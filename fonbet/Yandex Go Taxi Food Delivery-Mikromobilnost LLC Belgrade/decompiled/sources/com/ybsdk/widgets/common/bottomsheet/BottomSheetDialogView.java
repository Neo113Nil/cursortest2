package com.ybsdk.widgets.common.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.design.widget.SlidableCoordinatorLayout;
import com.ybsdk.core.design.widget.SlideableModalView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.widgets.common.ScrollableNestedScrollView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import defpackage.a0;
import defpackage.akf;
import defpackage.aqg0;
import defpackage.bkf;
import defpackage.cma1;
import defpackage.e8u0;
import defpackage.f061;
import defpackage.f8u0;
import defpackage.fch0;
import defpackage.gf6;
import defpackage.hf6;
import defpackage.i3y;
import defpackage.if6;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k751;
import defpackage.kf6;
import defpackage.kp50;
import defpackage.l650;
import defpackage.l95;
import defpackage.lcb1;
import defpackage.lf6;
import defpackage.m6;
import defpackage.m650;
import defpackage.mh3;
import defpackage.mob1;
import defpackage.n751;
import defpackage.nah0;
import defpackage.nnm;
import defpackage.np31;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.oo31;
import defpackage.p1b;
import defpackage.poh0;
import defpackage.rje;
import defpackage.ruz0;
import defpackage.sm91;
import defpackage.t750;
import defpackage.tls;
import defpackage.unr0;
import defpackage.utb1;
import defpackage.w511;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.xty0;
import defpackage.xx60;
import defpackage.z1x0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000×\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001h\u0018\u0000 \u0080\u00012\u00020\u0001:\u0004\u0081\u0001\u0082\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J%\u0010\u001e\u001a\u00020\n2\u0016\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u0015J!\u0010 \u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b \u0010\u0015J!\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\fJ\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0014¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010\fJ\u001f\u00100\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001fH\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\nH\u0014¢\u0006\u0004\b2\u0010\fJ\u000f\u00103\u001a\u00020\u0006H\u0014¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00106\u001a\u00020\u001f2\u0006\u00105\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\n¢\u0006\u0004\b9\u0010\fJ\u0015\u0010;\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020:¢\u0006\u0004\b=\u0010<J\u0015\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u0004\u0018\u00010\n2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010C\u001a\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010\fJ\u0011\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bN\u0010OJ\u0011\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\n2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0002¢\u0006\u0004\bW\u0010\fJ\u0017\u0010Y\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u001fH\u0002¢\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001a\u00020\u001f*\u0004\u0018\u00010[H\u0002¢\u0006\u0004\b\\\u0010]R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010lR\u0018\u0010p\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010lR\"\u0010y\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010l\u001a\u0004\by\u0010z\"\u0004\b{\u0010ZR\u0014\u0010\u007f\u001a\u00020|8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0083\u0001"}, d2 = {"Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lcom/ybsdk/core/design/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "getCardContentViewLayoutRes", "()I", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", ClidProvider.STATE, "render", "(Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;)V", "Lkotlin/Function1;", "updater", "(Ltls;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "onPrimaryAction", "(Landroid/view/View$OnClickListener;)V", "handler", "onSecondaryAction", "", "listener", "onHyperLinkAction", "", "onDismiss", "Landroid/app/Activity;", "activity", "Landroid/view/ViewGroup;", "container", "show", "(Landroid/app/Activity;Landroid/view/ViewGroup;)V", "updateSystemBarColors", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "dismissInternalWithoutAnimation", "onDismissManually", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "onModalViewDisappear", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "revertSystemBarColors", "Lcom/ybsdk/widgets/common/YbButtonView$a;", "updatePrimaryButton", "(Lcom/ybsdk/widgets/common/YbButtonView$a;)V", "updateSecondaryButton", "Landroid/widget/EditText;", "editText", "showKeyboard", "(Landroid/widget/EditText;)V", "Lcom/ybsdk/widgets/common/bottomsheet/h;", "content", "renderTitle", "(Lcom/ybsdk/widgets/common/bottomsheet/h;)Lzy11;", "Lcom/ybsdk/widgets/common/bottomsheet/d;", "renderContent", "(Lcom/ybsdk/widgets/common/bottomsheet/d;)V", "topPadding", "setPaddingTop", "(Ljava/lang/Integer;)V", "requestAccessibilityFocusIfNeeded", "Lm650;", "findNavigationBarColorOwner", "()Lm650;", "Lf8u0;", "findStatusBarColorOwner", "()Lf8u0;", "Landroid/view/View;", "view", "hideAllTooltips", "(Landroid/view/View;)V", "setInsetsListener", "slidesByWholeContent", "setSlideOption", "(Z)V", "Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;", "hasContent", "(Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;)Z", "Landroid/util/AttributeSet;", "Lf061;", "binding", "Lf061;", "Lbkf;", "customInsetsHandlingBehaviourProvider$delegate", "Li3y;", "getCustomInsetsHandlingBehaviourProvider", "()Lbkf;", "customInsetsHandlingBehaviourProvider", "lf6", "slideMotionHelper", "Llf6;", "dismissByUser", "Z", "focusedBeforeOpening", "Landroid/view/View;", "hideKeyboard", "currentState", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Ll650;", "overrideNavigationBarColorsCallback", "Ll650;", "Le8u0;", "overrideStatusBarColorsCallback", "Le8u0;", "shouldHandleInsets", "isPreviousFocusRequired", "()Z", "setPreviousFocusRequired", "Lcom/ybsdk/widgets/common/YbButtonViewGroup;", "getButtonsGroup", "()Lcom/ybsdk/widgets/common/YbButtonViewGroup;", "buttonsGroup", "Companion", "State", "com/ybsdk/widgets/common/bottomsheet/a", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomSheetDialogView extends SlideableModalView {
    public static final a Companion = new a();
    public static final int DEFAULT_TOP_PADDING_DP = 32;
    public static final int IMAGE_TOP_PADDING_DP = 12;
    private final AttributeSet attrs;
    private final f061 binding;
    private State currentState;

    /* renamed from: customInsetsHandlingBehaviourProvider$delegate, reason: from kotlin metadata */
    private final i3y customInsetsHandlingBehaviourProvider;
    private boolean dismissByUser;
    private View focusedBeforeOpening;
    private boolean hideKeyboard;
    private boolean isPreviousFocusRequired;
    private l650 overrideNavigationBarColorsCallback;
    private e8u0 overrideStatusBarColorsCallback;
    private boolean shouldHandleInsets;
    private final lf6 slideMotionHelper;

    public BottomSheetDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        this.attrs = attributeSet;
        int i2 = fch0.bottomSheetButtonsGroup;
        YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i2, this);
        if (ybButtonViewGroup != null) {
            i2 = fch0.bottomSheetCommonTitle;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = fch0.bottomSheetContentContainer;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
                if (frameLayout != null) {
                    i2 = fch0.bottomSheetDialogContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i2, this);
                    if (constraintLayout != null) {
                        i2 = fch0.bottomSheetNumberKeyboard;
                        NumberKeyboardView numberKeyboardView = (NumberKeyboardView) cma1.O(i2, this);
                        if (numberKeyboardView != null && (O = cma1.O((i2 = fch0.grip), this)) != null) {
                            nzm nzmVar = new nzm(O, 15, O);
                            i2 = fch0.scrollContent;
                            ScrollableNestedScrollView scrollableNestedScrollView = (ScrollableNestedScrollView) cma1.O(i2, this);
                            if (scrollableNestedScrollView != null) {
                                i2 = fch0.space;
                                Space space = (Space) cma1.O(i2, this);
                                if (space != null) {
                                    this.binding = new f061(this, ybButtonViewGroup, textView, frameLayout, constraintLayout, numberKeyboardView, nzmVar, scrollableNestedScrollView, space);
                                    this.customInsetsHandlingBehaviourProvider = kotlin.a.b(LazyThreadSafetyMode.NONE, new l95(26, this));
                                    this.slideMotionHelper = new lf6(this);
                                    this.shouldHandleInsets = true;
                                    this.isPreviousFocusRequired = true;
                                    setImportantForAccessibility(2);
                                    return;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final bkf customInsetsHandlingBehaviourProvider_delegate$lambda$0(BottomSheetDialogView bottomSheetDialogView) {
        Fragment u = com.ybsdk.core.utils.ext.view.b.u(bottomSheetDialogView, false);
        if (u != null) {
            ?? r0 = u;
            while (true) {
                if (r0 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof bkf)) {
                        activity = null;
                    }
                    bkf bkfVar = (bkf) activity;
                    r0 = bkfVar == null ? 0 : bkfVar;
                } else {
                    if (r0 instanceof bkf) {
                        break;
                    }
                    r0 = r0.getParentFragment();
                }
            }
            bkf bkfVar2 = (bkf) r0;
            if (bkfVar2 != null) {
                return bkfVar2;
            }
        }
        return akf.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissInternal$lambda$11(Runnable runnable, BottomSheetDialogView bottomSheetDialogView) {
        runnable.run();
        bottomSheetDialogView.revertSystemBarColors();
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

    private final YbButtonViewGroup getButtonsGroup() {
        return this.binding.b;
    }

    private final bkf getCustomInsetsHandlingBehaviourProvider() {
        return (bkf) this.customInsetsHandlingBehaviourProvider.getValue();
    }

    private final boolean hasContent(YbButtonViewGroup.b bVar) {
        if (bVar != null) {
            return (bVar.b == null && bVar.c == null) ? false : true;
        }
        return false;
    }

    private final void hideAllTooltips(View view) {
        Object tag = view.getTag(nah0.ybsdk_tooltip_controller_id);
        if (tag != null) {
            ruz0 ruz0Var = tag instanceof ruz0 ? (ruz0) tag : null;
            if (ruz0Var != null) {
                com.ybsdk.widgets.tooltip.a aVar = (com.ybsdk.widgets.tooltip.a) ruz0Var;
                aVar.a();
                View view2 = aVar.x;
                if (view2 != null) {
                    view2.setTag(null);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                hideAllTooltips(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onHyperLinkAction$lambda$7(tls tlsVar, String str) {
        if (tlsVar != null) {
            tlsVar.invoke(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPrimaryAction$lambda$5(View.OnClickListener onClickListener, BottomSheetDialogView bottomSheetDialogView) {
        onClickListener.onClick(bottomSheetDialogView.getButtonsGroup());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onSecondaryAction$lambda$6(View.OnClickListener onClickListener, BottomSheetDialogView bottomSheetDialogView) {
        onClickListener.onClick(bottomSheetDialogView.getButtonsGroup());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4$lambda$1(BottomSheetDialogView bottomSheetDialogView, State state) {
        bottomSheetDialogView.bottomSheetBehavior.W = !state.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4$lambda$2(BottomSheetDialogView bottomSheetDialogView, View view) {
        bottomSheetDialogView.onDismissManually();
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4$lambda$3(BottomSheetDialogView bottomSheetDialogView) {
        bottomSheetDialogView.setOnBackgroundClickListener(null);
        bottomSheetDialogView.setBlockUserInteractionOutside(false);
    }

    private final void renderContent(d content) {
        View view;
        FrameLayout frameLayout = this.binding.d;
        State state = this.currentState;
        if (state == null || !jl40.l(state.a, content)) {
            if (content instanceof State.a) {
                this.shouldHandleInsets = true;
                State.a aVar = (State.a) content;
                Integer num = aVar.e;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), num != null ? num.intValue() : 0, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                BottomSheetGeneralContentView bottomSheetGeneralContentView = new BottomSheetGeneralContentView(frameLayout.getContext(), null, 0, 6, null);
                bottomSheetGeneralContentView.render(aVar);
                view = bottomSheetGeneralContentView;
            } else if (content instanceof e) {
                this.shouldHandleInsets = true;
                e eVar = (e) content;
                Integer num2 = eVar.a;
                int intValue = num2 != null ? num2.intValue() : 0;
                Integer num3 = eVar.b;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), intValue, frameLayout.getPaddingRight(), num3 != null ? num3.intValue() : 0);
                view = (View) eVar.c.invoke();
            } else if (!(content instanceof f)) {
                w511.b();
                return;
            } else {
                this.shouldHandleInsets = false;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), 0, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                view = (View) ((f) content).a.invoke();
            }
            if (jl40.l(frameLayout.getChildAt(0), view)) {
                return;
            }
            frameLayout.removeAllViews();
            frameLayout.addView(view);
        }
    }

    private final zy11 renderTitle(h content) {
        TextView textView = this.binding.c;
        textView.setVisibility(content != null ? 0 : 8);
        if (content == null) {
            return null;
        }
        xty0.d(textView, content.a);
        xty0.e(textView, content.b);
        return zy11.a;
    }

    private final void requestAccessibilityFocusIfNeeded() {
        if (this.attrs == null) {
            return;
        }
        post(new gf6(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestAccessibilityFocusIfNeeded$lambda$16(BottomSheetDialogView bottomSheetDialogView) {
        com.ybsdk.core.utils.ext.view.b.n(1, bottomSheetDialogView.cardContentView);
    }

    private final void setInsetsListener() {
        com.ybsdk.core.utils.ext.view.b.w(this.binding.e, new m6(20, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setInsetsListener$lambda$20(BottomSheetDialogView bottomSheetDialogView, View view, n751 n751Var) {
        k751 k751Var = n751Var.a;
        if (!bottomSheetDialogView.shouldHandleInsets) {
            ConstraintLayout constraintLayout = bottomSheetDialogView.binding.e;
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), 0);
            return n751Var;
        }
        int i = k751Var.g(8).d;
        int i2 = k751Var.h(519).d;
        ConstraintLayout constraintLayout2 = bottomSheetDialogView.binding.e;
        if (i < i2) {
            i = i2;
        }
        constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), i);
        return n751.b;
    }

    private final void setPaddingTop(Integer topPadding) {
        setPadding(0, topPadding == null ? getCardMode() == SlideableModalView.CardMode.FULLSCREEN ? 0 : getTopPadding() : topPadding.intValue(), 0, 0);
    }

    private final void setSlideOption(boolean slidesByWholeContent) {
        SlidableCoordinatorLayout slidableCoordinatorLayout = this.root;
        lf6 lf6Var = this.slideMotionHelper;
        if (!slidesByWholeContent) {
            lf6Var = null;
        }
        slidableCoordinatorLayout.setSlideMotionHelper(lf6Var);
    }

    public static /* synthetic */ void show$default(BottomSheetDialogView bottomSheetDialogView, Activity activity, ViewGroup viewGroup, int i, Object obj) {
        if ((i & 2) != 0) {
            viewGroup = null;
        }
        bottomSheetDialogView.show(activity, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$8(BottomSheetDialogView bottomSheetDialogView) {
        com.ybsdk.core.utils.ext.view.b.m(bottomSheetDialogView.cardContentView);
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public /* bridge */ /* synthetic */ boolean allowTraverse() {
        return true;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public /* bridge */ /* synthetic */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView, defpackage.lv31
    public View asView() {
        return this;
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public int backgroundColor() {
        State state = this.currentState;
        State.Background background = state != null ? state.e : null;
        int i = background == null ? -1 : m.a[background.ordinal()];
        if (i == -1 || i == 1) {
            return super.backgroundColor();
        }
        if (i == 2) {
            return aqg0.yb_light_internal_transparent;
        }
        w511.b();
        return 0;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public int color(int i) {
        return asView().getContext().getColor(i);
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public int dimen(int i) {
        return rje.d(i, asView().getContext());
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        lcb1.d(this);
        super.dismissInternal(new mh3(16, onAnimationEnd, this));
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void dismissInternalWithoutAnimation() {
        lcb1.d(this);
        super.dismissInternalWithoutAnimation();
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public float dpToPx(float f) {
        return kp50.q(f);
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return poh0.ybsdk_bottom_sheet_dialog;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public View inflate(int i) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, true);
    }

    /* renamed from: isPreviousFocusRequired, reason: from getter */
    public final boolean getIsPreviousFocusRequired() {
        return this.isPreviousFocusRequired;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getCustomInsetsHandlingBehaviourProvider().isNewBottomSheetInsetsHandlingEnabled()) {
            if (getCustomInsetsHandlingBehaviourProvider().getDrawSdkUnderSafeArea() || !getCustomInsetsHandlingBehaviourProvider().isShownAsSlidableView()) {
                setInsetsListener();
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                np31.c(this);
            }
        }
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        if (newState == 4) {
            State state = this.currentState;
            if (!((state != null ? state.i : null) instanceof b)) {
                return;
            }
        }
        super.onBehaviorStateChanged(newState, movedByUser);
    }

    public final void onDismiss(tls handler) {
        setOnAppearingListener(new kf6(handler, this));
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void onDismissManually() {
        this.dismissByUser = true;
        revertSystemBarColors();
    }

    public final void onHyperLinkAction(tls listener) {
        this.binding.b.setLinkClickListener(new a0(17, listener));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.currentState != null ? super.onInterceptTouchEvent(event) : super.onInterceptTouchEvent(event);
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        if (this.isPreviousFocusRequired) {
            View view = this.focusedBeforeOpening;
            if (view != null) {
                view.requestFocus();
            }
        } else {
            this.isPreviousFocusRequired = true;
        }
        this.focusedBeforeOpening = null;
    }

    public final void onPrimaryAction(View.OnClickListener onClickListener) {
        getButtonsGroup().setPrimaryButtonOnClickListener(new hf6(0, onClickListener, this));
    }

    public final void onSecondaryAction(View.OnClickListener handler) {
        getButtonsGroup().setSecondaryButtonClickListener(new hf6(1, handler, this));
    }

    @Override // com.ybsdk.core.design.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return this.currentState != null ? super.onTouchEvent(event) : super.onTouchEvent(event);
    }

    public final void render(State state) {
        boolean z = state.o;
        p1b p1bVar = state.g;
        f061 f061Var = this.binding;
        YbButtonViewGroup buttonsGroup = getButtonsGroup();
        YbButtonViewGroup.b bVar = state.b;
        int i = 0;
        buttonsGroup.setVisibility(hasContent(bVar) ? 0 : 8);
        getButtonsGroup().render(bVar);
        int i2 = 1;
        showShadow(Boolean.valueOf(p1bVar != null));
        setPaddingTop(Integer.valueOf(state.f.a(this)));
        setShadowTint(p1bVar != null ? p1bVar.b(sm91.c(f061Var)) : null);
        boolean z2 = state.d;
        this.hideKeyboard = z2;
        if (z2 && isShown()) {
            lcb1.d(this);
        }
        renderTitle(state.c);
        renderContent(state.a);
        f061Var.h.setIsScrollable(state.h);
        setInterceptOnBackPress(state.j);
        setSlideOption(state.n);
        post(new mh3(17, this, state));
        if (state.i instanceof b) {
            setOnBackgroundClickListener(new if6(this, i));
        } else {
            post(new gf6(this, i2));
        }
        this.currentState = state;
        requestAccessibilityFocusIfNeeded();
        f061Var.g.b.setVisibility(z ? 0 : 8);
        f061Var.i.setVisibility(z ? 0 : 8);
    }

    public final void revertSystemBarColors() {
        l650 l650Var = this.overrideNavigationBarColorsCallback;
        if (l650Var != null) {
            t750 t750Var = (t750) l650Var;
            NavigationFragment.overrideNavigationBarColor$lambda$26(t750Var.a, t750Var.b);
        }
        this.overrideNavigationBarColorsCallback = null;
        e8u0 e8u0Var = this.overrideStatusBarColorsCallback;
        if (e8u0Var != null) {
            t750 t750Var2 = (t750) e8u0Var;
            NavigationFragment.overrideStatusBarColor$lambda$25(t750Var2.a, t750Var2.b);
        }
        this.overrideStatusBarColorsCallback = null;
    }

    public final void setPreviousFocusRequired(boolean z) {
        this.isPreviousFocusRequired = z;
    }

    public final void show(Activity activity, ViewGroup container) {
        View currentFocus;
        if (container == null && (container = (ViewGroup) activity.findViewById(fch0.ybsdkBottomSheetDialogContainer)) == null) {
            return;
        }
        hideAllTooltips(activity.getWindow().getDecorView().getRootView());
        if (this.hideKeyboard && (currentFocus = activity.getCurrentFocus()) != null) {
            lcb1.d(currentFocus);
        }
        this.focusedBeforeOpening = activity.getCurrentFocus();
        container.removeView(this);
        container.addView(this);
        post(new gf6(this, 0));
        updateSystemBarColors();
    }

    public final void showKeyboard(EditText editText) {
        NumberKeyboardView numberKeyboardView = this.binding.f;
        numberKeyboardView.setVisibility(0);
        utb1.d(numberKeyboardView, editText);
    }

    public final void updatePrimaryButton(YbButtonView.a state) {
        YbButtonViewGroup.b bVar;
        State state2 = this.currentState;
        if (state2 == null || (bVar = state2.b) == null) {
            return;
        }
        getButtonsGroup().render(YbButtonViewGroup.b.a(bVar, state, null, 13));
    }

    public final void updateSecondaryButton(YbButtonView.a state) {
        YbButtonViewGroup.b bVar;
        State state2 = this.currentState;
        if (state2 == null || (bVar = state2.b) == null) {
            return;
        }
        getButtonsGroup().render(YbButtonViewGroup.b.a(bVar, null, state, 11));
    }

    public final void updateSystemBarColors() {
        z1x0 z1x0Var;
        z1x0 z1x0Var2;
        State state = this.currentState;
        if (state != null && (z1x0Var2 = state.l) != null) {
            f8u0 findStatusBarColorOwner = findStatusBarColorOwner();
            this.overrideStatusBarColorsCallback = findStatusBarColorOwner != null ? findStatusBarColorOwner.overrideStatusBarColor(z1x0Var2) : null;
        }
        State state2 = this.currentState;
        if (state2 == null || (z1x0Var = state2.k) == null) {
            return;
        }
        m650 findNavigationBarColorOwner = findNavigationBarColorOwner();
        this.overrideNavigationBarColorsCallback = findNavigationBarColorOwner != null ? findNavigationBarColorOwner.overrideNavigationBarColor(z1x0Var) : null;
    }

    public static final class State {
        public final d a;
        public final YbButtonViewGroup.b b;
        public final h c;
        public final boolean d;
        public final Background e;
        public final l f;
        public final p1b g;
        public final boolean h;
        public final c i;
        public final boolean j;
        public final z1x0 k;
        public final z1x0 l;
        public final boolean m;
        public final boolean n;
        public final boolean o;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State$Background;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "TRANSPARENT", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Background {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Background[] $VALUES;
            public static final Background DEFAULT = new Background("DEFAULT", 0);
            public static final Background TRANSPARENT = new Background("TRANSPARENT", 1);

            private static final /* synthetic */ Background[] $values() {
                return new Background[]{DEFAULT, TRANSPARENT};
            }

            static {
                Background[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private Background(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static Background valueOf(String str) {
                return (Background) Enum.valueOf(Background.class, str);
            }

            public static Background[] values() {
                return (Background[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State$ImageScale;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "CENTER_CROP", "FIT_START", "FIT_CENTER", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ImageScale {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ImageScale[] $VALUES;
            public static final ImageScale CENTER = new ImageScale("CENTER", 0);
            public static final ImageScale CENTER_CROP = new ImageScale("CENTER_CROP", 1);
            public static final ImageScale FIT_START = new ImageScale("FIT_START", 2);
            public static final ImageScale FIT_CENTER = new ImageScale("FIT_CENTER", 3);

            private static final /* synthetic */ ImageScale[] $values() {
                return new ImageScale[]{CENTER, CENTER_CROP, FIT_START, FIT_CENTER};
            }

            static {
                ImageScale[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private ImageScale(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static ImageScale valueOf(String str) {
                return (ImageScale) Enum.valueOf(ImageScale.class, str);
            }

            public static ImageScale[] values() {
                return (ImageScale[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public State(d dVar, YbButtonView.a aVar, YbButtonView.a aVar2, Background background, p1b p1bVar, Text text, z1x0 z1x0Var, YbButtonViewGroup.Orientation orientation, h hVar, int i) {
            this(r4, (r1 == null && r3 == null) ? null : new YbButtonViewGroup.b(r12, r1, r3, new YbButtonViewGroup.a(r11, 6)), (32768 & i) != 0 ? null : hVar, r7, r8, r9, r10, true, (c) b.a, true, r14, r15, (i & 16384) != 0 ? r5 : true, (i & 65536) != 0 ? r5 : true, 36864);
            boolean z;
            d aVar3 = (i & 1) != 0 ? new a(null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP) : dVar;
            YbButtonView.a aVar4 = (i & 2) != 0 ? null : aVar;
            YbButtonView.a aVar5 = (i & 4) != 0 ? null : aVar2;
            boolean z2 = false;
            if ((i & 8) != 0) {
                z = false;
            } else {
                z = false;
                z2 = true;
            }
            Background background2 = (i & 16) != 0 ? Background.DEFAULT : background;
            l lVar = (i & 32) != 0 ? k.b : i.a;
            p1b p1bVar2 = (i & 64) != 0 ? null : p1bVar;
            Text text2 = (i & 1024) != 0 ? null : text;
            z1x0 z1x0Var2 = new z1x0(z1x0.d, null);
            z1x0 z1x0Var3 = (i & 4096) != 0 ? new z1x0(z1x0.e, mob1.c(true, true)) : z1x0Var;
            YbButtonViewGroup.Orientation orientation2 = (i & 8192) != 0 ? YbButtonViewGroup.Orientation.HORIZONTAL : orientation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [com.ybsdk.widgets.common.bottomsheet.d] */
        public static State a(State state, e eVar, YbButtonViewGroup.b bVar, int i) {
            e eVar2 = (i & 1) != 0 ? state.a : eVar;
            YbButtonViewGroup.b bVar2 = (i & 2) != 0 ? state.b : bVar;
            h hVar = state.c;
            boolean z = state.d;
            Background background = state.e;
            l lVar = (i & 32) != 0 ? state.f : i.a;
            p1b p1bVar = state.g;
            boolean z2 = state.h;
            c cVar = state.i;
            boolean z3 = state.j;
            z1x0 z1x0Var = state.k;
            z1x0 z1x0Var2 = state.l;
            state.getClass();
            boolean z4 = state.m;
            boolean z5 = state.n;
            boolean z6 = state.o;
            state.getClass();
            return new State(eVar2, bVar2, hVar, z, background, lVar, p1bVar, z2, cVar, z3, z1x0Var, z1x0Var2, z4, z5, z6);
        }

        public final YbButtonViewGroup.b b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return jl40.l(this.a, state.a) && jl40.l(this.b, state.b) && jl40.l(this.c, state.c) && this.d == state.d && this.e == state.e && jl40.l(this.f, state.f) && jl40.l(this.g, state.g) && this.h == state.h && jl40.l(this.i, state.i) && this.j == state.j && jl40.l(this.k, state.k) && jl40.l(this.l, state.l) && this.m == state.m && this.n == state.n && this.o == state.o;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            YbButtonViewGroup.b bVar = this.b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (this.f.hashCode() + ((this.e.hashCode() + unr0.e((hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.d)) * 31)) * 31;
            p1b p1bVar = this.g;
            int e = unr0.e((this.i.hashCode() + unr0.e((hashCode3 + (p1bVar == null ? 0 : p1bVar.hashCode())) * 31, 31, this.h)) * 31, 31, this.j);
            z1x0 z1x0Var = this.k;
            int hashCode4 = (e + (z1x0Var == null ? 0 : z1x0Var.hashCode())) * 31;
            z1x0 z1x0Var2 = this.l;
            return Boolean.hashCode(this.o) + unr0.e(unr0.e(unr0.e((hashCode4 + (z1x0Var2 == null ? 0 : z1x0Var2.hashCode())) * 31, 31, false), 31, this.m), 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(content=");
            sb.append(this.a);
            sb.append(", buttonGroupState=");
            sb.append(this.b);
            sb.append(", titleState=");
            sb.append(this.c);
            sb.append(", hideKeyboard=");
            sb.append(this.d);
            sb.append(", background=");
            sb.append(this.e);
            sb.append(", topPaddingStrategy=");
            sb.append(this.f);
            sb.append(", shadowTint=");
            sb.append(this.g);
            sb.append(", isScrollableContent=");
            sb.append(this.h);
            sb.append(", collapsingStrategy=");
            sb.append(this.i);
            sb.append(", interceptOnBackPress=");
            sb.append(this.j);
            sb.append(", navigationBarColorModel=");
            sb.append(this.k);
            sb.append(", statusBarColorModel=");
            sb.append(this.l);
            sb.append(", isPassThroughTouchesAboveContent=false, disableDragToDismiss=");
            nnm.v(", slidesByWholeContent=", ", isGripVisible=", sb, this.m, this.n);
            return x4e.i(sb, this.o, Extension.C_BRAKE);
        }

        public static final class a implements d {
            public final Text a;
            public final Text b;
            public final g c;
            public final g d;
            public final Integer e;
            public final Integer f;
            public final Integer g;

            public a(Text text, Text text2, g gVar, g gVar2, Integer num, Integer num2, int i) {
                text = (i & 1) != 0 ? null : text;
                text2 = (i & 2) != 0 ? null : text2;
                gVar = (i & 4) != 0 ? null : gVar;
                gVar2 = (i & 8) != 0 ? null : gVar2;
                num = (i & 16) != 0 ? null : num;
                num2 = (i & 32) != 0 ? null : num2;
                Integer num3 = (i & 64) != 0 ? null : 8;
                this.a = text;
                this.b = text2;
                this.c = gVar;
                this.d = gVar2;
                this.e = num;
                this.f = num2;
                this.g = num3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
            }

            public final int hashCode() {
                Text text = this.a;
                int hashCode = (text == null ? 0 : text.hashCode()) * 31;
                Text text2 = this.b;
                int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
                g gVar = this.c;
                int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
                g gVar2 = this.d;
                int hashCode4 = (hashCode3 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
                Integer num = this.e;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.g;
                return hashCode6 + (num3 != null ? num3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder p = defpackage.n.p("General(title=", this.a, ", description=", this.b, ", topImage=");
                p.append(this.c);
                p.append(", bottomImage=");
                p.append(this.d);
                p.append(", topPadding=");
                p.append(this.e);
                p.append(", topImageHeightDp=");
                p.append(this.f);
                p.append(", titleTopMarginDp=");
                return oo31.j(p, this.g, Extension.C_BRAKE);
            }

            public a() {
                this(null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
            }
        }

        public State(d dVar, YbButtonViewGroup.b bVar, h hVar, boolean z, Background background, l lVar, p1b p1bVar, boolean z2, c cVar, boolean z3, z1x0 z1x0Var, z1x0 z1x0Var2, boolean z4, boolean z5, boolean z6) {
            this.a = dVar;
            this.b = bVar;
            this.c = hVar;
            this.d = z;
            this.e = background;
            this.f = lVar;
            this.g = p1bVar;
            this.h = z2;
            this.i = cVar;
            this.j = z3;
            this.k = z1x0Var;
            this.l = z1x0Var2;
            this.m = z4;
            this.n = z5;
            this.o = z6;
        }

        public State(d dVar, YbButtonViewGroup.b bVar, h hVar, boolean z, Background background, l lVar, p1b p1bVar, boolean z2, c cVar, boolean z3, z1x0 z1x0Var, z1x0 z1x0Var2, boolean z4, boolean z5, int i) {
            this((i & 1) != 0 ? new a(null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP) : dVar, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? Background.DEFAULT : background, (i & 32) != 0 ? k.b : lVar, (i & 64) != 0 ? null : p1bVar, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? b.a : cVar, (i & 512) != 0 ? true : z3, (i & 1024) != 0 ? new z1x0(z1x0.d, null) : z1x0Var, (i & 2048) != 0 ? new z1x0(z1x0.e, mob1.c(true, true)) : z1x0Var2, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? false : z5, true);
        }

        public State() {
            this((d) null, (YbButtonViewGroup.b) null, (h) null, false, (Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65535);
        }
    }

    public BottomSheetDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BottomSheetDialogView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BottomSheetDialogView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void render(tls updater) {
        State state = this.currentState;
        if (state == null) {
            x4c.g("BottomSheetDialogView has empty state", null, null, null, 14);
        } else {
            render((State) updater.invoke(state));
        }
    }
}
