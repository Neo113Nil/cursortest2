package com.ybsdk.widgets.common;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import defpackage.cma1;
import defpackage.e350;
import defpackage.e961;
import defpackage.evu0;
import defpackage.fch0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.ibv;
import defpackage.ii8;
import defpackage.jl40;
import defpackage.kok0;
import defpackage.kp50;
import defpackage.lwg0;
import defpackage.mtz0;
import defpackage.ntz0;
import defpackage.ny61;
import defpackage.otz0;
import defpackage.poh0;
import defpackage.ptz0;
import defpackage.qtz0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rtz0;
import defpackage.sls;
import defpackage.smg0;
import defpackage.stz0;
import defpackage.t3i0;
import defpackage.tls;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.vmu0;
import defpackage.xbg0;
import defpackage.xty0;
import defpackage.xz3;
import defpackage.ylg0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002\u000fFB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010\u0012J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010,\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010(J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010\u0012J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R#\u0010A\u001a\n <*\u0004\u0018\u00010;0;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/ybsdk/widgets/common/ToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Lstz0;", ClidProvider.STATE, "render", "(Lstz0;)V", "Lkotlin/Function1;", "update", "(Ltls;)V", "Lkotlin/Function0;", "listener", "setOnCloseButtonClickListener", "(Lsls;)V", "color", "setCloseButtonTint", "(I)V", "setOnImageClickListener", "setOnRightImageClickListener", "", "text", "setRightImageContentDescription", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "setRightPartCustomView", "(Landroid/view/View;)V", "announceTitleForAccessibility", "()V", "setSubtitleText", "setLeftImage", "setLeftSubtitleImage", "setLeftImageScaleType", "setLeftImageScaleAnimationOnClick", "setRightPart", "", "translationY", "animateSubtitleTo", "(F)V", "animateTitleTo", "Le961;", "binding", "Le961;", "preferredHeight", CA20Status.STATUS_USER_I, "currentState", "Lstz0;", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "Li3y;", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "Landroid/animation/Animator;", "subtitleAnimation", "Landroid/animation/Animator;", "Companion", "mtz0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToolbarView extends ConstraintLayout {
    private static final float ALPHA_OPAQUE = 1.0f;
    private static final float ALPHA_TRANSPARENT = 0.0f;
    private static final float DEFAULT_TRANSLATION = 0.0f;
    private static final long DURATION_ANIM = 200;
    private static final long START_DELAY_SUBTITLE_ALPHA = 100;
    private final e961 binding;
    private stz0 currentState;

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator;
    private final int preferredHeight;
    private Animator subtitleAnimation;
    private static final mtz0 Companion = new mtz0();
    private static final float TOOLBAR_TITLE_TRANSLATE = kp50.r(9);

    public ToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_toolbar_layout, this);
        int i2 = fch0.close_button;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i2, this);
        if (closeButtonView != null) {
            i2 = fch0.image;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = fch0.leftSubtitleIcon;
                ImageView imageView2 = (ImageView) cma1.O(i2, this);
                if (imageView2 != null) {
                    i2 = fch0.subtitle;
                    TextView textView = (TextView) cma1.O(i2, this);
                    if (textView != null) {
                        i2 = fch0.subtitleContainer;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
                        if (linearLayout != null) {
                            i2 = fch0.subtitleWithSpoiler;
                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                            if (spoilerTextView != null) {
                                i2 = fch0.title;
                                TextView textView2 = (TextView) cma1.O(i2, this);
                                if (textView2 != null) {
                                    i2 = fch0.toolbarCustomRightPartContainer;
                                    FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
                                    if (frameLayout != null) {
                                        i2 = fch0.toolbar_right_image;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                                        if (appCompatImageView != null) {
                                            i2 = fch0.toolbarSubtitleDelimeter;
                                            TextView textView3 = (TextView) cma1.O(i2, this);
                                            if (textView3 != null) {
                                                this.binding = new e961(this, closeButtonView, imageView, imageView2, textView, linearLayout, spoilerTextView, textView2, frameLayout, appCompatImageView, textView3);
                                                Text.Constant i3 = g8e.i(Text.Companion, "");
                                                Companion.getClass();
                                                this.currentState = new stz0(i3, null, null, null, null, qtz0.a, false, new ColorModel.Attr(ung0.ybColor_textIcon_primary), null, null, null, null, 32452);
                                                this.defaultInterpolator = kotlin.a.b(LazyThreadSafetyMode.NONE, new kok0(context, 17));
                                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkToolbarView);
                                                try {
                                                    render(new xz3(obtainStyledAttributes, obtainStyledAttributes.getBoolean(t3i0.YbSdkToolbarView_ybsdk_transparentBackground, false), 16));
                                                    obtainStyledAttributes.recycle();
                                                    setPadding(getResources().getDimensionPixelSize(lwg0.ybsdk_toolbar_view_side_padding), 0, getResources().getDimensionPixelSize(lwg0.ybsdk_toolbar_view_side_padding), 0);
                                                    setClipToPadding(false);
                                                    setLayoutTransition(null);
                                                    this.preferredHeight = getResources().getDimensionPixelSize(lwg0.ybsdk_toolbar_height);
                                                    return;
                                                } catch (Throwable th) {
                                                    obtainStyledAttributes.recycle();
                                                    throw th;
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
    public static final stz0 _init_$lambda$2(TypedArray typedArray, boolean z, stz0 stz0Var) {
        boolean z2 = typedArray.getBoolean(t3i0.YbSdkToolbarView_ybsdk_closeIconVisible, false);
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        String string = typedArray.getString(t3i0.YbSdkToolbarView_ybsdk_title);
        if (string == null) {
            string = "";
        }
        Text.Constant i = g8e.i(bVar, string);
        int i2 = t3i0.YbSdkToolbarView_ybsdk_title_color_attr;
        Companion.getClass();
        ColorModel e = rje.e(typedArray, i2, new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        String string2 = typedArray.getString(t3i0.YbSdkToolbarView_ybsdk_subtitle);
        Text.Constant constant = string2 != null ? new Text.Constant(string2) : null;
        boolean z3 = typedArray.getBoolean(t3i0.YbSdkToolbarView_ybsdk_animateChanges, false);
        rtz0 ntz0Var = z2 ? new ntz0(0) : qtz0.a;
        Drawable drawable = typedArray.getDrawable(t3i0.YbSdkToolbarView_ybsdk_leftImage);
        return stz0.a(stz0Var, i, constant, null, drawable != null ? new ibv(drawable) : null, null, ntz0Var, z3, z, e, null, 0, 32276);
    }

    private final void animateSubtitleTo(float translationY) {
        Animator animator = this.subtitleAnimation;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = this.binding.f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) ViewGroup.TRANSLATION_Y, linearLayout.getTranslationY(), translationY);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(getDefaultInterpolator());
        LinearLayout linearLayout2 = this.binding.f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) ViewGroup.ALPHA, linearLayout2.getAlpha(), 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setStartDelay(100L);
        ofFloat2.setInterpolator(getDefaultInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.widgets.common.ToolbarView$animateSubtitleTo$lambda$18$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                ToolbarView.this.subtitleAnimation = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
        animatorSet.start();
        this.subtitleAnimation = animatorSet;
    }

    private final void animateTitleTo(float translationY) {
        this.binding.h.animate().translationY(translationY).setDuration(200L).setInterpolator(getDefaultInterpolator()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$0(Context context) {
        return AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator);
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 setCloseButtonTint$lambda$4(int i, stz0 stz0Var) {
        return stz0.a(stz0Var, null, null, null, null, null, new ntz0(new ColorModel.Attr(i)), false, false, null, null, 0, 32735);
    }

    private final void setLeftImage(stz0 state) {
        Text text = state.e;
        rbv rbvVar = state.d;
        this.binding.c.setContentDescription(text != null ? com.ybsdk.core.utils.text.d.a(getContext(), text) : null);
        if (jl40.l(rbvVar, this.currentState.d)) {
            return;
        }
        e961 e961Var = this.binding;
        if (rbvVar == null) {
            e961Var.c.setVisibility(4);
        } else {
            v4b1.k(rbvVar, e961Var.c, null, null, 6);
            this.binding.c.setVisibility(0);
        }
    }

    private final void setLeftImageScaleAnimationOnClick() {
        AnimatorInflater.loadStateListAnimator(getContext(), smg0.ybsdk_click_scale_animator);
    }

    private final void setLeftImageScaleType(stz0 state) {
        ImageView.ScaleType scaleType = this.currentState.m;
        ImageView.ScaleType scaleType2 = state.m;
        if (scaleType != scaleType2) {
            this.binding.c.setScaleType(scaleType2);
        }
    }

    private final void setLeftSubtitleImage(stz0 state) {
        this.binding.d.setVisibility(state.l != null ? 0 : 8);
        rbv rbvVar = state.l;
        if (rbvVar != null) {
            v4b1.k(rbvVar, this.binding.d, null, null, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCloseButtonClickListener$lambda$3(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnImageClickListener$lambda$6$lambda$5(sls slsVar, View view) {
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnRightImageClickListener$lambda$9$lambda$8(sls slsVar, View view) {
        slsVar.invoke();
        return zy11.a;
    }

    private final void setRightPart(stz0 state) {
        rtz0 rtz0Var = state.f;
        ptz0 ptz0Var = rtz0Var instanceof ptz0 ? (ptz0) rtz0Var : null;
        rbv rbvVar = ptz0Var != null ? ptz0Var.a : null;
        Text text = state.n;
        this.binding.j.setContentDescription(text != null ? com.ybsdk.core.utils.text.d.a(getContext(), text) : null);
        this.binding.j.setVisibility(rbvVar != null ? 0 : 8);
        if (rbvVar != null) {
            v4b1.k(rbvVar, this.binding.j, null, null, 6);
        }
        boolean z = rtz0Var instanceof ntz0;
        e961 e961Var = this.binding;
        if (z) {
            com.ybsdk.core.utils.ext.view.b.z(e961Var.b, ((ntz0) rtz0Var).a.get(getContext()));
            this.binding.b.setVisibility(0);
        } else {
            e961Var.b.setVisibility(4);
        }
        this.binding.i.setVisibility(rtz0Var instanceof otz0 ? 0 : 8);
    }

    private final void setSubtitleText(stz0 state) {
        Text text = this.currentState.b;
        CharSequence a = text != null ? com.ybsdk.core.utils.text.d.a(getContext(), text) : null;
        Text text2 = state.b;
        boolean z = state.g;
        ColorModel colorModel = state.j;
        Text text3 = state.k;
        CharSequence a2 = text2 != null ? com.ybsdk.core.utils.text.d.a(getContext(), text2) : null;
        CharSequence a3 = text3 != null ? com.ybsdk.core.utils.text.d.a(getContext(), text3) : null;
        boolean z2 = false;
        this.binding.f.setVisibility(((a2 == null || evu0.J(a2)) && (a3 == null || evu0.J(a3))) ? 4 : 0);
        xty0.e(this.binding.e, colorModel);
        xty0.e(this.binding.g, colorModel);
        this.binding.e.setText(a2);
        this.binding.e.setMaxLines(evu0.J(com.ybsdk.core.utils.text.d.a(getContext(), state.a)) ? 2 : 1);
        this.binding.e.setVisibility((a2 == null || evu0.J(a2)) ? 4 : 0);
        SpoilerTextView spoilerTextView = this.binding.g;
        ViewGroup.LayoutParams layoutParams = spoilerTextView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins((a2 == null || evu0.J(a2)) ? 0 : kp50.r(1), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        spoilerTextView.setLayoutParams(marginLayoutParams);
        this.binding.g.setText(a3);
        this.binding.g.setVisibility((a3 == null || evu0.J(a3)) ? 4 : 0);
        SpoilerTextView.updateSpoilerState$default(this.binding.g, null, text3 != null, 1, null);
        this.binding.k.setVisibility((a3 == null || evu0.J(a3) || a2 == null || evu0.J(a2)) ? 8 : 0);
        if (z && a != null && !evu0.J(a) && (a2 == null || evu0.J(a2))) {
            z2 = true;
        }
        if (z && ((a == null || evu0.J(a)) && a2 != null && !evu0.J(a2))) {
            animateTitleTo(0.0f);
            this.binding.f.setAlpha(0.0f);
            this.binding.f.setTranslationY(TOOLBAR_TITLE_TRANSLATE);
            animateSubtitleTo(0.0f);
        }
        if (z2) {
            float f = TOOLBAR_TITLE_TRANSLATE;
            animateTitleTo(f);
            animateSubtitleTo(f);
        }
        if (this.subtitleAnimation == null) {
            int visibility = this.binding.f.getVisibility();
            e961 e961Var = this.binding;
            if (visibility != 4) {
                e961Var.h.setTranslationY(0.0f);
                this.binding.f.setTranslationY(0.0f);
            } else {
                TextView textView = e961Var.h;
                float f2 = TOOLBAR_TITLE_TRANSLATE;
                textView.setTranslationY(f2);
                this.binding.f.setTranslationY(f2);
            }
        }
    }

    public final void announceTitleForAccessibility() {
        TextView textView = this.binding.h;
        androidx.core.view.b.r(textView, textView.getText());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.preferredHeight, 1073741824));
    }

    public final void render(stz0 state) {
        if (jl40.l(this.currentState, state)) {
            return;
        }
        CharSequence a = com.ybsdk.core.utils.text.d.a(getContext(), state.a);
        this.binding.h.setMaxLines(state.o);
        this.binding.h.setText(a);
        xty0.e(this.binding.h, state.i);
        this.binding.h.setVisibility(evu0.J(a) ? 8 : 0);
        if (state.h) {
            com.ybsdk.core.utils.ext.view.b.x(ung0.ybColor_internal_transparent, this);
        } else {
            ColorModel colorModel = state.c;
            setBackgroundColor(colorModel != null ? colorModel.get(getContext()) : rje.a(getContext(), ung0.ybColor_background_primary));
        }
        setSubtitleText(state);
        setLeftImage(state);
        setRightPart(state);
        setLeftSubtitleImage(state);
        setLeftImageScaleType(state);
        this.currentState = state;
    }

    public final void setCloseButtonTint(int color) {
        render(new ii8(color, 23));
    }

    public final void setOnCloseButtonClickListener(sls listener) {
        this.binding.b.setOnClickListener(new xbg0(11, listener));
    }

    public final void setOnImageClickListener(sls listener) {
        vmu0 vmu0Var;
        setLeftImageScaleAnimationOnClick();
        ImageView imageView = this.binding.c;
        if (listener != null) {
            vmu0Var = new vmu0(13, new e350(19, listener));
        } else {
            vmu0Var = null;
        }
        imageView.setOnClickListener(vmu0Var);
    }

    public final void setOnRightImageClickListener(sls listener) {
        vmu0 vmu0Var;
        AppCompatImageView appCompatImageView = this.binding.j;
        if (listener != null) {
            vmu0Var = new vmu0(14, new e350(20, listener));
        } else {
            vmu0Var = null;
        }
        appCompatImageView.setOnClickListener(vmu0Var);
    }

    public final void setRightImageContentDescription(String text) {
        this.binding.j.setContentDescription(text);
    }

    public final void setRightPartCustomView(View view) {
        this.binding.i.removeAllViews();
        this.binding.i.addView(view);
    }

    public final void render(tls update) {
        render((stz0) update.invoke(this.currentState));
    }

    public ToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ToolbarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ToolbarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
