package com.ybsdk.widgets.common;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import defpackage.ai;
import defpackage.ayy;
import defpackage.bk;
import defpackage.byy;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.cyy;
import defpackage.d6w;
import defpackage.dyy;
import defpackage.evu0;
import defpackage.eyy;
import defpackage.fch0;
import defpackage.g8e;
import defpackage.hfb1;
import defpackage.i361;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.lia1;
import defpackage.nwt0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rje;
import defpackage.sls;
import defpackage.sm91;
import defpackage.t3i0;
import defpackage.tls;
import defpackage.tm60;
import defpackage.txy;
import defpackage.ung0;
import defpackage.uqs;
import defpackage.uxy;
import defpackage.vsn;
import defpackage.vvg0;
import defpackage.vxy;
import defpackage.w511;
import defpackage.wxy;
import defpackage.xxy;
import defpackage.y530;
import defpackage.y6i0;
import defpackage.ylg0;
import defpackage.yqb;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0087\u00012\u00020\u0001:\t\u001a\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u001fJ\u0011\u0010,\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u001fJ\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u001fJ\u0011\u00100\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b0\u0010-J\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u001fJ'\u00103\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u001fJ\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010\u001fJ'\u0010:\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b:\u00104J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0012H\u0002¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010\u001fJ\u000f\u0010@\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010\u001fJ\u000f\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010\u001fJ\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\f2\u0006\u00102\u001a\u00020E2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\bH\u00104J\u0017\u0010I\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\bI\u00106J\u0017\u0010J\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\bJ\u0010=J'\u0010K\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u00104J\u001f\u0010N\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010\u001fJ\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u001fJ\u000f\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bT\u0010\u001fJ\u000f\u0010U\u001a\u00020\fH\u0002¢\u0006\u0004\bU\u0010\u001fJ\u000f\u0010V\u001a\u00020\fH\u0002¢\u0006\u0004\bV\u0010\u001fJ\u000f\u0010W\u001a\u00020\fH\u0002¢\u0006\u0004\bW\u0010\u001fJ\u000f\u0010X\u001a\u00020\fH\u0002¢\u0006\u0004\bX\u0010\u001fJ\u000f\u0010Y\u001a\u00020\fH\u0002¢\u0006\u0004\bY\u0010\u001fR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010]R*\u0010_\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010D\"\u0004\bb\u0010=R\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u001c\u0010p\u001a\n o*\u0004\u0018\u00010n0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010sR\u0014\u0010u\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\u0014\u0010v\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010sR\u0016\u0010w\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010`R\u0018\u0010z\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010`R\u0014\u0010\u0082\u0001\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0086\u0001\u001a\u00030\u0083\u00018F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/ybsdk/widgets/common/LoadableInput;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "Lzy11;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "requestFocus", "(ILandroid/graphics/Rect;)Z", "Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "animate", "Lkotlin/Function1;", "Lcom/ybsdk/widgets/common/g;", "update", "render", "(ZLtls;)V", "wiggle", "()V", "Landroid/text/TextWatcher;", "watcher", "removeTextChangedListener", "(Landroid/text/TextWatcher;)V", "Lkotlin/Function0;", "setOnClearIconClickListener", "(Lsls;)V", "scrollToInputStart", "oldState", "announceErrorForAccessibility", "(Lcom/ybsdk/widgets/common/g;)V", "onClear", "setupInputType", "()Lzy11;", "setupInputField", "setupBasePaddings", "setupLabel", "setupPlaceholder", ClidProvider.STATE, "setupHint", "(Lcom/ybsdk/widgets/common/g;Lcom/ybsdk/widgets/common/g;Z)V", "isErrorTextShowing", "(Lcom/ybsdk/widgets/common/g;)Z", "isHelperShowing", "animateHintShow", "animateHintHide", "setupErrorText", "isDelayed", "animateErrorTextShow", "(Z)V", "animateErrorTextHide", "setupEndIcon", "setupColors", "setAccessibilityFocus", "animateLabelState", "isInputEmpty", "()Z", "Lcom/ybsdk/widgets/common/LoadableInput$LabelState;", "setLabelState", "(Lcom/ybsdk/widgets/common/LoadableInput$LabelState;Z)V", "animateLabelError", "isErrorLabelShowing", "setupDivider", "animateDividerColor", "color", "hasError", "getDividerColor", "(IZ)I", "getLabelColor", "(Z)I", "setupInteractive", "setupPrefix", "setupSuffix", "animateLabelCollapse", "animateLabelExpansion", "setupEditTextBackground", "setMaxInputLength", "setMinHeight", "Li361;", "binding", "Li361;", "Lcom/ybsdk/widgets/common/g;", "value", "canShowSoftInputOnFocus", "Z", "getCanShowSoftInputOnFocus", "setCanShowSoftInputOnFocus", "Landroid/animation/Animator;", "dividerAnimator", "Landroid/animation/Animator;", "dividerColorizeAnimator", "hintAnimator", "errorTextAnimator", "Landroid/animation/AnimatorSet;", "labelExpandAnimator", "Landroid/animation/AnimatorSet;", "labelCollapseAnimator", "labelColorizeAnimator", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator", "Landroid/view/animation/Interpolator;", "labelExpandedPaddingTop", CA20Status.STATUS_USER_I, "labelCollapsedPaddingTop", "editTextExpandedPaddingBottom", "editTextCollapsedPaddingBottom", "labelState", "Lcom/ybsdk/widgets/common/LoadableInput$LabelState;", "labelIsInitial", "focusListener", "Landroid/view/View$OnFocusChangeListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "cursorVisible", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "Landroid/view/View;", "getEditTextLayout", "()Landroid/view/View;", "editTextLayout", "Companion", "LoadingState", "hfb1", "LabelState", "xxy", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoadableInput extends ConstraintLayout {
    public static final xxy Companion = new xxy();
    private static final long DIVIDER_ANIMATION_DURATION = 300;
    private static final long ERROR_ANIM_DURATION = 100;
    private static final long HINT_ANIM_DURATION = 200;
    private static final long LABEL_ANIMATION_DURATION = 300;
    private static final long LABEL_ANIMATION_OFFSET = 100;
    private static final long LABEL_COLLAPSE_ALPHA_ANIMATION_DURATION = 200;
    private static final long LABEL_COLORIZE_DURATION = 300;
    private static final long SHOW_KEYBOARD_DELAY_MS = 100;
    private static final float SPRING_DAMPING = 0.0625f;
    private static final float SPRING_STIFFNESS = 720.0f;
    private final i361 binding;
    private boolean canShowSoftInputOnFocus;
    private boolean cursorVisible;
    private final Interpolator defaultInterpolator;
    private Animator dividerAnimator;
    private Animator dividerColorizeAnimator;
    private final int editTextCollapsedPaddingBottom;
    private final int editTextExpandedPaddingBottom;
    private Animator errorTextAnimator;
    private View.OnFocusChangeListener focusListener;
    private Animator hintAnimator;
    private AnimatorSet labelCollapseAnimator;
    private final int labelCollapsedPaddingTop;
    private AnimatorSet labelColorizeAnimator;
    private AnimatorSet labelExpandAnimator;
    private final int labelExpandedPaddingTop;
    private boolean labelIsInitial;
    private LabelState labelState;
    private View.OnClickListener onClickListener;
    private g state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/LoadableInput$LabelState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LabelState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LabelState[] $VALUES;
        public static final LabelState EXPANDED = new LabelState("EXPANDED", 0);
        public static final LabelState COLLAPSED = new LabelState("COLLAPSED", 1);

        private static final /* synthetic */ LabelState[] $values() {
            return new LabelState[]{EXPANDED, COLLAPSED};
        }

        static {
            LabelState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private LabelState(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static LabelState valueOf(String str) {
            return (LabelState) Enum.valueOf(LabelState.class, str);
        }

        public static LabelState[] values() {
            return (LabelState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/widgets/common/LoadableInput$LoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "SUCCESS", JCP.RAW_PREFIX, "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadingState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState DEFAULT = new LoadingState("DEFAULT", 0);
        public static final LoadingState LOADING = new LoadingState("LOADING", 1);
        public static final LoadingState SUCCESS = new LoadingState("SUCCESS", 2);
        public static final LoadingState NONE = new LoadingState(JCP.RAW_PREFIX, 3);

        private static final /* synthetic */ LoadingState[] $values() {
            return new LoadingState[]{DEFAULT, LOADING, SUCCESS, NONE};
        }

        static {
            LoadingState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private LoadingState(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }

    public LoadableInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        LayoutInflater.from(context).inflate(poh0.ybsdk_layout_loadable_input, this);
        int i2 = fch0.clearIcon;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) cma1.O(i2, this);
        if (appCompatImageButton != null && (O = cma1.O((i2 = fch0.divider), this)) != null) {
            i2 = fch0.editText;
            SelectionAwareEditText selectionAwareEditText = (SelectionAwareEditText) cma1.O(i2, this);
            if (selectionAwareEditText != null && (O2 = cma1.O((i2 = fch0.editTextLayout), this)) != null) {
                i2 = fch0.editTextLayoutBarrierBottom;
                if (((Barrier) cma1.O(i2, this)) != null) {
                    i2 = fch0.endIconBarrier;
                    if (((Barrier) cma1.O(i2, this)) != null) {
                        i2 = fch0.minimalMarginEnd;
                        if (((Space) cma1.O(i2, this)) != null) {
                            i2 = fch0.progress;
                            ProgressBar progressBar = (ProgressBar) cma1.O(i2, this);
                            if (progressBar != null) {
                                i2 = fch0.space;
                                Space space = (Space) cma1.O(i2, this);
                                if (space != null) {
                                    i2 = fch0.spaceLeft;
                                    Space space2 = (Space) cma1.O(i2, this);
                                    if (space2 != null) {
                                        i2 = fch0.successIcon;
                                        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) cma1.O(i2, this);
                                        if (appCompatImageButton2 != null) {
                                            i2 = fch0.textError;
                                            TextView textView = (TextView) cma1.O(i2, this);
                                            if (textView != null) {
                                                i2 = fch0.textHint;
                                                TextView textView2 = (TextView) cma1.O(i2, this);
                                                if (textView2 != null) {
                                                    i2 = fch0.textLabel;
                                                    TextView textView3 = (TextView) cma1.O(i2, this);
                                                    if (textView3 != null) {
                                                        i2 = fch0.textPrefix;
                                                        TextView textView4 = (TextView) cma1.O(i2, this);
                                                        if (textView4 != null) {
                                                            i2 = fch0.textSuffix;
                                                            TextView textView5 = (TextView) cma1.O(i2, this);
                                                            if (textView5 != null) {
                                                                this.binding = new i361(this, appCompatImageButton, O, selectionAwareEditText, O2, progressBar, space, space2, appCompatImageButton2, textView, textView2, textView3, textView4, textView5);
                                                                this.state = g.z;
                                                                this.canShowSoftInputOnFocus = true;
                                                                this.defaultInterpolator = AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator);
                                                                this.labelExpandedPaddingTop = rje.d(vvg0.ybsdk_loadable_input_label_top_padding_expanded, context);
                                                                this.labelCollapsedPaddingTop = rje.d(vvg0.ybsdk_loadable_input_label_top_padding_collapsed, context);
                                                                this.editTextExpandedPaddingBottom = rje.d(vvg0.ybsdk_loadable_input_edit_text_bottom_padding_expanded, context);
                                                                this.editTextCollapsedPaddingBottom = rje.d(vvg0.ybsdk_loadable_input_edit_text_bottom_padding_collapsed, context);
                                                                this.labelState = LabelState.COLLAPSED;
                                                                this.labelIsInitial = true;
                                                                this.cursorVisible = true;
                                                                int i3 = 0;
                                                                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkLoadableInput, 0, 0);
                                                                g gVar = this.state;
                                                                boolean z = obtainStyledAttributes.getBoolean(t3i0.YbSdkLoadableInput_ybsdk_interactive, true);
                                                                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                                                                String string = obtainStyledAttributes.getString(t3i0.YbSdkLoadableInput_ybsdk_inputLabel);
                                                                Text.Constant i4 = g8e.i(bVar, string == null ? "" : string);
                                                                String string2 = obtainStyledAttributes.getString(t3i0.YbSdkLoadableInput_ybsdk_placeholder);
                                                                Text.Constant constant = new Text.Constant(string2 == null ? "" : string2);
                                                                String string3 = obtainStyledAttributes.getString(t3i0.YbSdkLoadableInput_ybsdk_helperText);
                                                                this.state = g.a(gVar, null, null, z, null, i4, constant, SpannableString.valueOf(string3 != null ? string3 : ""), false, null, null, null, obtainStyledAttributes.getBoolean(t3i0.YbSdkLoadableInput_ybsdk_showDivider, true), obtainStyledAttributes.getDrawable(t3i0.YbSdkLoadableInput_ybsdk_backgroundEditText), null, false, 0, false, 0, 0, null, null, null, 33544075);
                                                                this.cursorVisible = obtainStyledAttributes.getBoolean(t3i0.YbSdkLoadableInput_ybsdk_cursor_visible, true);
                                                                selectionAwareEditText.setShouldRestoreSavedInstanceState(obtainStyledAttributes.getBoolean(t3i0.YbSdkLoadableInput_ybsdk_should_restore_saved_instance_state, true));
                                                                setupBasePaddings();
                                                                setupInputType();
                                                                setupInputField();
                                                                setupLabel();
                                                                setupPlaceholder();
                                                                g gVar2 = this.state;
                                                                setupHint(gVar2, gVar2, false);
                                                                setupInteractive();
                                                                setupEndIcon();
                                                                androidx.core.view.b.p(this, new yqb(this, context, 2));
                                                                g gVar3 = this.state;
                                                                setupErrorText(gVar3, gVar3, false);
                                                                setupColors();
                                                                obtainStyledAttributes.recycle();
                                                                appCompatImageButton.setOnClickListener(new txy(this, i3));
                                                                selectionAwareEditText.setOnFocusChangeListener(new bk(23, this));
                                                                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                                                                selectionAwareEditText.setOnSelectionChanged(new wxy(this, i3));
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
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(LoadableInput loadableInput, View view, boolean z) {
        loadableInput.animateLabelState(true);
        if (z) {
            loadableInput.binding.a.requestFocus();
        }
        loadableInput.setAccessibilityFocus();
        loadableInput.setupDivider(true);
        View.OnFocusChangeListener onFocusChangeListener = loadableInput.focusListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(LoadableInput loadableInput, EditText editText) {
        if (cvu0.t(loadableInput.getEditText().getText().toString(), loadableInput.state.m, true)) {
            editText.setSelection(loadableInput.state.m.length());
        }
        return zy11.a;
    }

    private final void animateDividerColor(g oldState, g state, boolean animate) {
        if (oldState.h == state.h) {
            return;
        }
        Animator animator = this.dividerColorizeAnimator;
        if (animator != null) {
            animator.cancel();
        }
        int dividerColor = getDividerColor(oldState.q, oldState.h);
        int dividerColor2 = getDividerColor(state.q, state.h);
        if (!animate) {
            this.binding.c.setBackgroundColor(dividerColor2);
            return;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(dividerColor, dividerColor2);
        ofArgb.addUpdateListener(new uxy(this, 3));
        ofArgb.setInterpolator(this.defaultInterpolator);
        ofArgb.setDuration(300L);
        ofArgb.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateDividerColor$lambda$54$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                LoadableInput.this.dividerColorizeAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        ofArgb.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateDividerColor$lambda$54$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                LoadableInput.this.dividerColorizeAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        ofArgb.start();
        this.dividerColorizeAnimator = ofArgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDividerColor$lambda$54$lambda$51(LoadableInput loadableInput, ValueAnimator valueAnimator) {
        loadableInput.binding.c.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private final void animateErrorTextHide(boolean isDelayed) {
        Animator animator = this.errorTextAnimator;
        if (animator != null) {
            animator.cancel();
        }
        long j = isDelayed ? 200L : 0L;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.binding.j.getAlpha(), 0.0f);
        ofFloat.addUpdateListener(new uxy(this, 2));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(100L);
        ofFloat.setStartDelay(j);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateErrorTextHide$lambda$36$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                i361 i361Var;
                LoadableInput.this.errorTextAnimator = null;
                i361Var = LoadableInput.this.binding;
                i361Var.j.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        ofFloat.start();
        this.errorTextAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateErrorTextHide$lambda$36$lambda$34(LoadableInput loadableInput, ValueAnimator valueAnimator) {
        loadableInput.binding.j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void animateErrorTextShow(boolean isDelayed) {
        Animator animator = this.errorTextAnimator;
        if (animator != null) {
            animator.cancel();
        }
        long j = isDelayed ? 200L : 0L;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.binding.j.getAlpha(), 1.0f);
        ofFloat.addUpdateListener(new uxy(this, 1));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(100L);
        ofFloat.setStartDelay(j);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateErrorTextShow$lambda$33$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                i361 i361Var;
                i361Var = LoadableInput.this.binding;
                i361Var.j.setVisibility(0);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateErrorTextShow$lambda$33$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                LoadableInput.this.errorTextAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        ofFloat.start();
        this.errorTextAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateErrorTextShow$lambda$33$lambda$30(LoadableInput loadableInput, ValueAnimator valueAnimator) {
        loadableInput.binding.j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void animateHintHide() {
        Animator animator = this.hintAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.binding.k.getAlpha(), 0.0f);
        ofFloat.addUpdateListener(new uxy(this, 0));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateHintHide$lambda$27$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                i361 i361Var;
                LoadableInput.this.hintAnimator = null;
                i361Var = LoadableInput.this.binding;
                i361Var.k.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        ofFloat.start();
        this.hintAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHintHide$lambda$27$lambda$25(LoadableInput loadableInput, ValueAnimator valueAnimator) {
        loadableInput.binding.k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void animateHintShow() {
        Animator animator = this.hintAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.binding.k.getAlpha(), 1.0f);
        ofFloat.addUpdateListener(new uxy(this, 5));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateHintShow$lambda$24$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                i361 i361Var;
                i361Var = LoadableInput.this.binding;
                i361Var.k.setVisibility(0);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateHintShow$lambda$24$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                LoadableInput.this.hintAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        ofFloat.start();
        this.hintAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateHintShow$lambda$24$lambda$21(LoadableInput loadableInput, ValueAnimator valueAnimator) {
        loadableInput.binding.k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void animateLabelCollapse() {
        i361 i361Var = this.binding;
        AnimatorSet animatorSet = this.labelExpandAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.labelExpandAnimator = null;
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        TextView textView = i361Var.l;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(selectionAwareEditText.getAlpha(), 1.0f);
        ofFloat.addUpdateListener(new vxy(i361Var, 5));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(100L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(textView.getTextSize() / Resources.getSystem().getDisplayMetrics().scaledDensity, rje.c(vvg0.ybsdk_loadable_input_label_text_size, sm91.c(i361Var)));
        ofFloat2.addUpdateListener(new vxy(i361Var, 6));
        ofFloat2.setInterpolator(this.defaultInterpolator);
        ofFloat2.setDuration(300L);
        ValueAnimator ofInt = ValueAnimator.ofInt(textView.getPaddingTop(), this.labelCollapsedPaddingTop);
        ofInt.addUpdateListener(new vxy(i361Var, 7));
        ofInt.setInterpolator(this.defaultInterpolator);
        ofInt.setDuration(300L);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i361Var.d.getPaddingBottom(), this.editTextCollapsedPaddingBottom);
        ofInt2.addUpdateListener(new vxy(i361Var, 8));
        ofInt2.setInterpolator(this.defaultInterpolator);
        ofInt2.setDuration(300L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateLabelCollapse$lambda$70$lambda$69$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LoadableInput.this.labelCollapseAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet2.start();
        this.labelCollapseAnimator = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelCollapse$lambda$70$lambda$61$lambda$60(i361 i361Var, ValueAnimator valueAnimator) {
        i361Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        i361Var.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        i361Var.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelCollapse$lambda$70$lambda$63$lambda$62(i361 i361Var, ValueAnimator valueAnimator) {
        i361Var.l.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelCollapse$lambda$70$lambda$65$lambda$64(i361 i361Var, ValueAnimator valueAnimator) {
        TextView textView = i361Var.l;
        textView.setPadding(textView.getPaddingLeft(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), textView.getPaddingRight(), textView.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelCollapse$lambda$70$lambda$67$lambda$66(i361 i361Var, ValueAnimator valueAnimator) {
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        selectionAwareEditText.setPadding(selectionAwareEditText.getPaddingLeft(), selectionAwareEditText.getPaddingTop(), selectionAwareEditText.getPaddingRight(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private final void animateLabelError(g oldState, g state, boolean animate) {
        boolean isErrorLabelShowing = isErrorLabelShowing(oldState);
        boolean isErrorLabelShowing2 = isErrorLabelShowing(state);
        if (isErrorLabelShowing == isErrorLabelShowing2) {
            return;
        }
        Context context = getContext();
        int i = isErrorLabelShowing2 ? vvg0.ybsdk_loadable_input_error_alpha : vvg0.ybsdk_loadable_input_label_alpha;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        float f = typedValue.getFloat();
        int labelColor = getLabelColor(isErrorLabelShowing);
        int labelColor2 = getLabelColor(isErrorLabelShowing2);
        AnimatorSet animatorSet = this.labelColorizeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        i361 i361Var = this.binding;
        if (!animate) {
            i361Var.l.setAlpha(f);
            this.binding.l.setTextColor(labelColor2);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i361Var.l.getAlpha(), f);
        ofFloat.addUpdateListener(new uxy(this, 4));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(300L);
        ObjectAnimator ofArgb = ObjectAnimator.ofArgb(this.binding.l, "textColor", labelColor, labelColor2);
        ofArgb.setInterpolator(this.defaultInterpolator);
        ofArgb.setDuration(300L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofArgb);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateLabelError$lambda$46$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LoadableInput.this.labelColorizeAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateLabelError$lambda$46$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                LoadableInput.this.labelColorizeAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet2.start();
        this.labelColorizeAnimator = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelError$lambda$42$lambda$41(LoadableInput loadableInput, ValueAnimator valueAnimator) {
        loadableInput.binding.l.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void animateLabelExpansion() {
        i361 i361Var = this.binding;
        AnimatorSet animatorSet = this.labelCollapseAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.labelCollapseAnimator = null;
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        TextView textView = i361Var.l;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(selectionAwareEditText.getAlpha(), 0.0f);
        ofFloat.addUpdateListener(new vxy(i361Var, 1));
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.setDuration(200L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(textView.getTextSize() / Resources.getSystem().getDisplayMetrics().scaledDensity, rje.c(vvg0.ybsdk_loadable_input_empty_label_text_size, sm91.c(i361Var)));
        ofFloat2.addUpdateListener(new vxy(i361Var, 2));
        ofFloat2.setInterpolator(this.defaultInterpolator);
        ofFloat2.setDuration(300L);
        ofFloat2.setStartDelay(100L);
        ValueAnimator ofInt = ValueAnimator.ofInt(textView.getPaddingTop(), this.labelExpandedPaddingTop);
        ofInt.addUpdateListener(new vxy(i361Var, 3));
        ofInt.setInterpolator(this.defaultInterpolator);
        ofInt.setDuration(300L);
        ofInt.setStartDelay(100L);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i361Var.d.getPaddingBottom(), this.editTextExpandedPaddingBottom);
        ofInt2.addUpdateListener(new vxy(i361Var, 4));
        ofInt2.setInterpolator(this.defaultInterpolator);
        ofInt2.setDuration(300L);
        ofInt2.setStartDelay(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$animateLabelExpansion$lambda$81$lambda$80$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LoadableInput.this.labelExpandAnimator = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet2.start();
        this.labelExpandAnimator = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelExpansion$lambda$81$lambda$72$lambda$71(i361 i361Var, ValueAnimator valueAnimator) {
        i361Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        i361Var.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        i361Var.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelExpansion$lambda$81$lambda$74$lambda$73(i361 i361Var, ValueAnimator valueAnimator) {
        i361Var.l.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelExpansion$lambda$81$lambda$76$lambda$75(i361 i361Var, ValueAnimator valueAnimator) {
        TextView textView = i361Var.l;
        textView.setPadding(textView.getPaddingLeft(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), textView.getPaddingRight(), textView.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLabelExpansion$lambda$81$lambda$78$lambda$77(i361 i361Var, ValueAnimator valueAnimator) {
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        selectionAwareEditText.setPadding(selectionAwareEditText.getPaddingLeft(), selectionAwareEditText.getPaddingTop(), selectionAwareEditText.getPaddingRight(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private final void animateLabelState(boolean animate) {
        if (this.state.u != null) {
            return;
        }
        if (isInputEmpty() && !getEditText().hasFocus() && this.state.y) {
            setLabelState(LabelState.EXPANDED, animate);
        } else if (this.labelCollapseAnimator == null) {
            setLabelState(LabelState.COLLAPSED, animate);
        }
    }

    private final void announceErrorForAccessibility(g oldState) {
        if (jl40.l(this.state.i, oldState.i) || !this.state.h) {
            return;
        }
        View view = this.binding.a;
        if (lia1.g(view.getContext())) {
            int i = Build.VERSION.SDK_INT;
            AccessibilityEvent p = i >= 30 ? ai.p() : AccessibilityEvent.obtain(2048);
            if (i >= 34) {
                p.setContentChangeTypes(2048);
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestSendAccessibilityEvent(view, p);
            }
        }
    }

    private final int getDividerColor(int color, boolean hasError) {
        Context context = getContext();
        if (!hasError) {
            color = ung0.ybColor_textIcon_primary;
        }
        return rje.a(context, color);
    }

    private final int getLabelColor(boolean hasError) {
        return rje.a(getContext(), hasError ? ung0.ybColor_textIcon_negative : ung0.ybColor_textIcon_primary);
    }

    private final boolean isErrorLabelShowing(g state) {
        if (state.h) {
            return state.i == null || state.r;
        }
        return false;
    }

    private final boolean isErrorTextShowing(g state) {
        return state.h && state.i != null;
    }

    private final boolean isHelperShowing(g state) {
        Spanned spanned = state.g;
        return (spanned == null || spanned.length() == 0 || isErrorTextShowing(state)) ? false : true;
    }

    private final boolean isInputEmpty() {
        Editable text = getEditText().getText();
        if (text != null && text.length() != 0) {
            return false;
        }
        Text text2 = this.state.j;
        CharSequence a = text2 != null ? com.ybsdk.core.utils.text.d.a(getContext(), text2) : null;
        if (a != null && !evu0.J(a)) {
            return false;
        }
        Text text3 = this.state.k;
        CharSequence a2 = text3 != null ? com.ybsdk.core.utils.text.d.a(getContext(), text3) : null;
        return a2 == null || evu0.J(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClear() {
        render$default(this, false, new wxy(this, 1), 1, null);
        com.ybsdk.core.utils.ext.view.b.m(this.binding.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onClear$lambda$9(LoadableInput loadableInput, g gVar) {
        g gVar2 = loadableInput.state;
        return g.a(gVar2, gVar2.m, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554430);
    }

    public static /* synthetic */ void render$default(LoadableInput loadableInput, boolean z, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        loadableInput.render(z, tlsVar);
    }

    private final void setAccessibilityFocus() {
        Editable text = getEditText().getText();
        if ((text == null || text.length() == 0) && getEditText().hasFocus()) {
            com.ybsdk.core.utils.ext.view.b.m(getEditText());
        }
    }

    private final void setLabelState(LabelState state, boolean animate) {
        if (this.labelState == state) {
            return;
        }
        boolean z = !animate || this.labelIsInitial;
        this.labelIsInitial = false;
        if (z && state == LabelState.COLLAPSED) {
            this.binding.l.setTextSize(rje.c(vvg0.ybsdk_loadable_input_label_text_size, getContext()));
            TextView textView = this.binding.l;
            textView.setPadding(textView.getPaddingLeft(), this.labelCollapsedPaddingTop, textView.getPaddingRight(), textView.getPaddingBottom());
            SelectionAwareEditText selectionAwareEditText = this.binding.d;
            selectionAwareEditText.setPadding(selectionAwareEditText.getPaddingLeft(), selectionAwareEditText.getPaddingTop(), selectionAwareEditText.getPaddingRight(), this.editTextCollapsedPaddingBottom);
            this.binding.d.setAlpha(1.0f);
            this.binding.m.setAlpha(1.0f);
            this.binding.n.setAlpha(1.0f);
        } else if (z && state == LabelState.EXPANDED) {
            this.binding.l.setTextSize(rje.c(vvg0.ybsdk_loadable_input_empty_label_text_size, getContext()));
            TextView textView2 = this.binding.l;
            textView2.setPadding(textView2.getPaddingLeft(), this.labelExpandedPaddingTop, textView2.getPaddingRight(), textView2.getPaddingBottom());
            SelectionAwareEditText selectionAwareEditText2 = this.binding.d;
            selectionAwareEditText2.setPadding(selectionAwareEditText2.getPaddingLeft(), selectionAwareEditText2.getPaddingTop(), selectionAwareEditText2.getPaddingRight(), this.editTextExpandedPaddingBottom);
            this.binding.d.setAlpha(0.0f);
            this.binding.m.setAlpha(0.0f);
            this.binding.n.setAlpha(0.0f);
        } else if (state == LabelState.COLLAPSED) {
            animateLabelCollapse();
        } else if (state == LabelState.EXPANDED) {
            animateLabelExpansion();
        }
        this.labelState = state;
    }

    private final void setMaxInputLength() {
        getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.state.s)});
    }

    private final void setMinHeight() {
        this.binding.g.getLayoutParams().height = this.state.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClearIconClickListener$lambda$8(LoadableInput loadableInput, sls slsVar, View view) {
        loadableInput.onClear();
        slsVar.invoke();
    }

    private final void setupBasePaddings() {
        int i;
        int i2;
        LabelState labelState = this.state.u;
        int i3 = labelState == null ? -1 : h.a[labelState.ordinal()];
        if (i3 == -1) {
            i = this.labelCollapsedPaddingTop;
        } else if (i3 == 1) {
            i = this.labelCollapsedPaddingTop;
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            i = this.labelExpandedPaddingTop;
        }
        LabelState labelState2 = this.state.u;
        int i4 = labelState2 == null ? -1 : h.a[labelState2.ordinal()];
        if (i4 == -1) {
            i2 = this.editTextCollapsedPaddingBottom;
        } else if (i4 == 1) {
            i2 = this.editTextCollapsedPaddingBottom;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            i2 = this.editTextExpandedPaddingBottom;
        }
        TextView textView = this.binding.l;
        textView.setPadding(textView.getPaddingLeft(), i, textView.getPaddingRight(), textView.getPaddingBottom());
        SelectionAwareEditText selectionAwareEditText = this.binding.d;
        selectionAwareEditText.setPadding(selectionAwareEditText.getPaddingLeft(), selectionAwareEditText.getPaddingTop(), selectionAwareEditText.getPaddingRight(), i2);
    }

    private final void setupColors() {
        ColorModel colorModel = this.state.v;
        if (colorModel != null) {
            int i = colorModel.get(getContext());
            getEditText().setTextColor(i);
            this.binding.m.setTextColor(i);
        }
        ColorModel colorModel2 = this.state.w;
        if (colorModel2 != null) {
            getEditText().setHintTextColor(colorModel2.get(getContext()));
        }
        ColorModel colorModel3 = this.state.x;
        if (colorModel3 != null) {
            this.binding.l.setTextColor(colorModel3.get(getContext()));
        }
    }

    private final void setupDivider(boolean animate) {
        i361 i361Var = this.binding;
        int i = 0;
        i361Var.c.setVisibility(!this.state.l ? 4 : 0);
        if (this.state.l) {
            Context c = sm91.c(i361Var);
            int i2 = (!i361Var.d.hasFocus() || this.state.h) ? !this.state.h ? vvg0.ybsdk_loadable_input_divider_alpha_no_focus : vvg0.ybsdk_loadable_input_error_alpha : vvg0.ybsdk_loadable_input_divider_alpha_focused;
            TypedValue typedValue = new TypedValue();
            c.getResources().getValue(i2, typedValue, true);
            float f = typedValue.getFloat();
            View view = i361Var.c;
            if (!animate) {
                view.setAlpha(f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getAlpha(), f);
            ofFloat.addUpdateListener(new vxy(i361Var, i));
            ofFloat.setInterpolator(this.defaultInterpolator);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.LoadableInput$setupDivider$lambda$50$lambda$49$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    LoadableInput.this.dividerAnimator = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            ofFloat.start();
            this.dividerAnimator = ofFloat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDivider$lambda$50$lambda$49$lambda$47(i361 i361Var, ValueAnimator valueAnimator) {
        i361Var.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void setupEditTextBackground() {
        this.binding.e.setBackground(this.state.n);
        ColorModel colorModel = this.state.o;
        if (colorModel != null) {
            this.binding.e.setBackgroundTintList(ColorStateList.valueOf(colorModel.get(getContext())));
        }
        this.binding.h.setVisibility(this.state.n == null ? 0 : 8);
    }

    private final void setupEndIcon() {
        i361 i361Var = this.binding;
        i361Var.f.setVisibility(this.state.d == LoadingState.LOADING ? 0 : 8);
        AppCompatImageButton appCompatImageButton = i361Var.b;
        g gVar = this.state;
        appCompatImageButton.setVisibility((gVar.p || gVar.d != LoadingState.DEFAULT || !gVar.c || String.valueOf(i361Var.d.getText()).equals(this.state.m) || this.state.d == LoadingState.NONE) ? 8 : 0);
        i361Var.i.setVisibility(this.state.d == LoadingState.SUCCESS ? 0 : 8);
    }

    private final void setupErrorText(g oldState, g state, boolean animate) {
        i361 i361Var = this.binding;
        TextView textView = i361Var.j;
        Text text = state.i;
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(i361Var), text));
        Integer valueOf = Integer.valueOf(kp50.r(16));
        if (state.n == null) {
            valueOf = null;
        }
        textView.setPadding(valueOf != null ? valueOf.intValue() : 0, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        boolean isErrorTextShowing = isErrorTextShowing(oldState);
        boolean isErrorTextShowing2 = isErrorTextShowing(state);
        if (!animate || isErrorTextShowing == isErrorTextShowing2) {
            textView.setAlpha(isErrorTextShowing2 ? 1.0f : 0.0f);
            textView.setVisibility(isErrorTextShowing2 ? 0 : 8);
        } else if (!isErrorTextShowing && isErrorTextShowing2) {
            animateErrorTextShow(isHelperShowing(oldState));
        } else {
            if (!isErrorTextShowing || isErrorTextShowing2) {
                return;
            }
            animateErrorTextHide(isHelperShowing(oldState));
        }
    }

    private final void setupHint(g oldState, g state, boolean animate) {
        i361 i361Var = this.binding;
        i361Var.k.setText(state.g);
        TextView textView = i361Var.k;
        Integer valueOf = Integer.valueOf(kp50.r(16));
        if (state.n == null) {
            valueOf = null;
        }
        textView.setPadding(valueOf != null ? valueOf.intValue() : 0, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        boolean isHelperShowing = isHelperShowing(oldState);
        boolean isHelperShowing2 = isHelperShowing(state);
        if (!animate || isHelperShowing == isHelperShowing2) {
            textView.setAlpha(isHelperShowing2 ? 1.0f : 0.0f);
            textView.setVisibility(isHelperShowing2 ? 0 : 8);
        } else if (!isHelperShowing && isHelperShowing2) {
            animateHintShow();
        } else {
            if (!isHelperShowing || isHelperShowing2) {
                return;
            }
            animateHintHide();
        }
    }

    private final void setupInputField() {
        String str;
        i361 i361Var = this.binding;
        g gVar = this.state;
        hfb1 hfb1Var = gVar.b;
        if (hfb1Var instanceof cyy) {
            String str2 = gVar.a;
            Locale locale = tm60.a;
            str = tm60.i(str2);
        } else {
            if (!(hfb1Var instanceof ayy) && !jl40.l(hfb1Var, byy.a) && !jl40.l(hfb1Var, eyy.b) && !jl40.l(hfb1Var, eyy.c) && !jl40.l(hfb1Var, eyy.d)) {
                w511.b();
                return;
            }
            str = this.state.a;
        }
        if (evu0.J(str)) {
            str = this.state.m;
        }
        String str3 = str;
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        if (String.valueOf(selectionAwareEditText.getText()).equals(str3)) {
            return;
        }
        int e = String.valueOf(selectionAwareEditText.getText()).equalsIgnoreCase(str3) ? y6i0.e(selectionAwareEditText.getSelectionEnd(), new d6w(0, str3.length(), 1)) : str3.length();
        Editable text = selectionAwareEditText.getText();
        if (text != null) {
            text.replace(0, text.length(), str3, 0, str3.length());
        }
        try {
            selectionAwareEditText.setSelection(e);
        } catch (Throwable unused) {
        }
    }

    private final zy11 setupInputType() {
        SelectionAwareEditText selectionAwareEditText = this.binding.d;
        selectionAwareEditText.setInputType(this.state.b.c());
        hfb1 hfb1Var = this.state.b;
        if (hfb1Var instanceof cyy) {
            y530 y530Var = j.a;
            cyy cyyVar = (cyy) hfb1Var;
            j.a(selectionAwareEditText, cyyVar.a, cyyVar.b, null, 8);
        }
        dyy dyyVar = hfb1Var instanceof dyy ? (dyy) hfb1Var : null;
        if (dyyVar == null) {
            return null;
        }
        selectionAwareEditText.setKeyListener(DigitsKeyListener.getInstance(dyyVar.d()));
        return zy11.a;
    }

    private final void setupInteractive() {
        i361 i361Var = this.binding;
        setClickable(this.state.c);
        setFocusable(this.state.c);
        setFocusableInTouchMode(this.state.c);
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        selectionAwareEditText.setClickable(this.state.c);
        selectionAwareEditText.setFocusable(this.state.c);
        selectionAwareEditText.setFocusableInTouchMode(this.state.c);
        int i = 1;
        selectionAwareEditText.setCursorVisible(this.cursorVisible && this.state.c);
        if (this.state.c) {
            i361Var.d.setOnClickListener(new txy(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupInteractive$lambda$57$lambda$56(LoadableInput loadableInput, View view) {
        loadableInput.requestFocus();
        View.OnClickListener onClickListener = loadableInput.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final zy11 setupLabel() {
        i361 i361Var = this.binding;
        TextView textView = i361Var.l;
        Text text = this.state.e;
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(i361Var), text));
        LabelState labelState = this.state.u;
        if (labelState == null) {
            return null;
        }
        setLabelState(labelState, false);
        return zy11.a;
    }

    private final void setupPlaceholder() {
        i361 i361Var = this.binding;
        SelectionAwareEditText selectionAwareEditText = i361Var.d;
        Text text = this.state.f;
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        selectionAwareEditText.setHint(com.ybsdk.core.utils.text.d.a(sm91.c(i361Var), text));
    }

    private final void setupPrefix() {
        i361 i361Var = this.binding;
        TextView textView = i361Var.m;
        Text text = this.state.j;
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(i361Var), text));
    }

    private final void setupSuffix() {
        i361 i361Var = this.binding;
        TextView textView = i361Var.n;
        textView.setVisibility(this.state.k != null ? 0 : 8);
        Text text = this.state.k;
        if (text != null) {
            textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(i361Var), text));
            SelectionAwareEditText selectionAwareEditText = i361Var.d;
            textView.setTranslationX(StaticLayout.Builder.obtain(selectionAwareEditText.getText(), 0, selectionAwareEditText.getText().length(), selectionAwareEditText.getPaint(), Integer.MAX_VALUE).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).setMaxLines(1).build().getLineWidth(0));
        }
    }

    public final boolean getCanShowSoftInputOnFocus() {
        return this.canShowSoftInputOnFocus;
    }

    public final EditText getEditText() {
        return this.binding.d;
    }

    public final View getEditTextLayout() {
        return this.binding.e;
    }

    public final void removeTextChangedListener(TextWatcher watcher) {
        this.binding.d.removeTextChangedListener(watcher);
    }

    public final void render(boolean animate, tls update) {
        g gVar = this.state;
        g gVar2 = (g) update.invoke(gVar);
        this.state = gVar2;
        if (!jl40.l(gVar.b, gVar2.b)) {
            setupInputType();
        }
        if (gVar.s != this.state.s) {
            setMaxInputLength();
        }
        setupInputField();
        setupLabel();
        setupPlaceholder();
        setupHint(gVar, this.state, animate);
        setupErrorText(gVar, this.state, animate);
        setupEndIcon();
        setupInteractive();
        setupDivider(animate);
        animateDividerColor(gVar, this.state, animate);
        animateLabelState(animate);
        setAccessibilityFocus();
        setupPrefix();
        setupSuffix();
        setupEditTextBackground();
        animateLabelError(gVar, this.state, animate);
        announceErrorForAccessibility(gVar);
        if (gVar.t != this.state.t) {
            setMinHeight();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        boolean requestFocus = this.binding.d.requestFocus();
        if (this.canShowSoftInputOnFocus) {
            SelectionAwareEditText selectionAwareEditText = this.binding.d;
            selectionAwareEditText.postDelayed(new uqs(9, this, selectionAwareEditText), 100L);
        }
        return requestFocus;
    }

    public final void scrollToInputStart() {
        getEditText().setSelection(0);
    }

    public final void setCanShowSoftInputOnFocus(boolean z) {
        this.canShowSoftInputOnFocus = z;
        this.binding.d.setShowSoftInputOnFocus(z);
    }

    public final void setOnClearIconClickListener(sls listener) {
        this.binding.b.setOnClickListener(new vsn(25, this, listener));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
        this.onClickListener = listener;
        this.binding.d.setOnClickListener(listener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        this.focusListener = listener;
    }

    public final void wiggle() {
        nwt0 nwt0Var = new nwt0(this, 0.0f);
        nwt0Var.g(rje.d(vvg0.ybsdk_loadable_input_wiggle_start_translation, getContext()));
        nwt0Var.u.a(SPRING_DAMPING);
        nwt0Var.u.b(SPRING_STIFFNESS);
        nwt0Var.h();
    }

    public LoadableInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LoadableInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LoadableInput(Context context) {
        this(context, null, 0, 6, null);
    }
}
