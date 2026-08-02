package com.yandex.go.vault.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.vault.domain.prize.ActionButtonType;
import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a230;
import defpackage.b9h0;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.d5b0;
import defpackage.e230;
import defpackage.evg0;
import defpackage.hpg0;
import defpackage.i331;
import defpackage.k7x0;
import defpackage.l331;
import defpackage.llh0;
import defpackage.m7x0;
import defpackage.mqg0;
import defpackage.mr21;
import defpackage.nac;
import defpackage.ny61;
import defpackage.o4f0;
import defpackage.o7r0;
import defpackage.pav;
import defpackage.q4f0;
import defpackage.q5z;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.r0d0;
import defpackage.r4f0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.v1y;
import defpackage.x231;
import defpackage.xng0;
import defpackage.yo90;
import defpackage.yso;
import defpackage.z231;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.InsetsAwareLinearLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001MBE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0014¢\u0006\u0004\b+\u0010\u0016J\u000f\u0010,\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010\u0016J\u001f\u00101\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001fH\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020#H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\n I*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/yandex/go/vault/ui/PrizeModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lv1y;", "Lr4f0;", "Landroid/content/Context;", "context", "Ll331;", "content", "Lkotlin/Function0;", "Lzy11;", "onDetachCallback", "Lq4f0;", "presenter", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "Li331;", "paletteRepository", "<init>", "(Landroid/content/Context;Ll331;Lsls;Lq4f0;Lk7x0;Lpav;Li331;)V", "setupAppearanceAnimation", "()V", "setContent", "startAnimation", "", "Lx231;", "buttons", "addButtons", "(Ljava/util/List;)V", "actionButtonInfo", "", "isLast", "addActionButton", "(Lx231;Z)V", "", "color", "Landroid/graphics/drawable/Drawable;", "createBackground", "(I)Landroid/graphics/drawable/Drawable;", "", "createTextForCopyActionButton", "(Lx231;)Ljava/lang/CharSequence;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lv1y;", "Le230;", "insetsType", "()Le230;", "shouldDismissOnTouchOutside", "()Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "oldButton", "newButton", "updateButton", "(Lx231;Lx231;)V", "close", "Ll331;", "Lsls;", "Lq4f0;", "Lk7x0;", "Lpav;", "Li331;", "", "actionButtons", "Ljava/util/List;", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "appearanceValueAnimator", "Landroid/animation/ValueAnimator;", "Companion", "o4f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrizeModalView extends SlideableBindingModalView<v1y> implements r4f0 {

    @Deprecated
    public static final float BOTTOM_BACKGROUND_RADIUS = 0.0f;

    @Deprecated
    public static final String CONFETTI_LOTTIE = "lottie_confetti.json";

    @Deprecated
    public static final String CONFETTI_LOTTIE_CACHE_KEY = "lottie_default_confetti_key";
    private static final o4f0 Companion = new o4f0();

    @Deprecated
    public static final int MAX_BUTTONS_SIZE = 3;
    private final List<x231> actionButtons;
    private final ValueAnimator appearanceValueAnimator;
    private final l331 content;
    private final pav imageLoader;
    private final sls onDetachCallback;
    private final i331 paletteRepository;
    private final q4f0 presenter;
    private final k7x0 tagUrlFormatter;

    public PrizeModalView(Context context, l331 l331Var, sls slsVar, q4f0 q4f0Var, k7x0 k7x0Var, pav pavVar, i331 i331Var) {
        super(context);
        this.content = l331Var;
        this.onDetachCallback = slsVar;
        this.presenter = q4f0Var;
        this.tagUrlFormatter = k7x0Var;
        this.imageLoader = pavVar;
        this.paletteRepository = i331Var;
        this.actionButtons = new ArrayList();
        this.appearanceValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setAnimateOnAppearing(false);
    }

    private final void addActionButton(x231 actionButtonInfo, boolean isLast) {
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(getContext()).inflate(llh0.vault_action_button, (ViewGroup) getBinding().e, false);
        ActionButtonType actionButtonType = actionButtonInfo.a;
        ActionButtonType actionButtonType2 = ActionButtonType.CLIPBOARD_COPY;
        buttonComponent.setText(actionButtonType == actionButtonType2 ? createTextForCopyActionButton(actionButtonInfo) : actionButtonInfo.b);
        if (isLast) {
            buttonComponent.setButtonTitleColor(qje.t(xng0.textOnControl, getContext()));
        } else {
            buttonComponent.setButtonTitleColor(getContext().getColor(mqg0.white));
        }
        int t = isLast ? qje.t(xng0.controlMain, getContext()) : getContext().getColor(hpg0.vault_prize_button_background);
        VaultPaletteDto vaultPaletteDto = this.paletteRepository.c;
        String str = vaultPaletteDto != null ? vaultPaletteDto.l : null;
        Integer S = actionButtonInfo.a == actionButtonType2 ? str != null ? q5z.S(str) : null : null;
        if (S != null) {
            t = S.intValue();
        }
        buttonComponent.setButtonBackground(t);
        if (actionButtonInfo.g) {
            buttonComponent.setDebounceClickListener(new yo90(20, this, actionButtonInfo));
        } else {
            buttonComponent.setAlpha(0.5f);
            buttonComponent.setRippleColor(new cdc(0));
        }
        this.actionButtons.add(actionButtonInfo);
        getBinding().e.addView(buttonComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addActionButton$lambda$1(PrizeModalView prizeModalView, x231 x231Var) {
        q4f0 q4f0Var = prizeModalView.presenter;
        tje.N(q4f0Var.Jg(), null, null, new PrizeModalViewPresenter$onActionButtonClicked$1(q4f0Var, x231Var, (Activity) prizeModalView.getContext(), null), 3);
    }

    private final void addButtons(List<x231> buttons) {
        getBinding().e.removeAllViews();
        this.actionButtons.clear();
        int i = 0;
        for (Object obj : kotlin.collections.a.A0(buttons, 3)) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            x231 x231Var = (x231) obj;
            boolean z = true;
            if (i != Math.min(3, buttons.size()) - 1) {
                z = false;
            }
            addActionButton(x231Var, z);
            i = i2;
        }
    }

    private final Drawable createBackground(int color) {
        float r = tje.r(evg0.slidable_view_card_corner_radius, getContext());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{r, r, r, r, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private final CharSequence createTextForCopyActionButton(x231 actionButtonInfo) {
        if (!actionButtonInfo.g) {
            return actionButtonInfo.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = actionButtonInfo.b;
        VaultPaletteDto vaultPaletteDto = this.paletteRepository.c;
        String str2 = vaultPaletteDto != null ? vaultPaletteDto.j : null;
        Integer S = str2 != null ? q5z.S(str2) : null;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(S != null ? S.intValue() : -1);
        VaultPaletteDto vaultPaletteDto2 = this.paletteRepository.c;
        String str3 = vaultPaletteDto2 != null ? vaultPaletteDto2.j : null;
        if (str3 != null) {
            q5z.S(str3);
        }
        SpannableStringBuilder append = spannableStringBuilder.append(str, foregroundColorSpan, 33).append((CharSequence) "\n");
        String str4 = actionButtonInfo.e;
        if (str4 == null) {
            str4 = "";
        }
        VaultPaletteDto vaultPaletteDto3 = this.paletteRepository.c;
        String str5 = vaultPaletteDto3 != null ? vaultPaletteDto3.k : null;
        Integer S2 = str5 != null ? q5z.S(str5) : null;
        return append.append(str4, new ForegroundColorSpan(S2 != null ? S2.intValue() : getResources().getColor(hpg0.vault_prize_button_subtitle_color)), 33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(PrizeModalView prizeModalView) {
        return prizeModalView;
    }

    private final void setContent() {
        VaultPaletteDto vaultPaletteDto = this.paletteRepository.c;
        Integer S = q5z.S(vaultPaletteDto != null ? vaultPaletteDto.h : null);
        if (S != null) {
            getBinding().a.setBackgroundTintList(ColorStateList.valueOf(S.intValue()));
        }
        getBinding().i.setText(this.content.b);
        getBinding().h.setText(qeb1.c(this.content.c));
        getBinding().h.setMovementMethod(LinkMovementMethod.getInstance());
        getBinding().b.setOnClickListener(new d5b0(18, this));
        try {
            getBinding().c.setImageTintList(ColorStateList.valueOf(Color.parseColor(this.content.d)));
        } catch (Exception unused) {
        }
        ((nac) this.imageLoader.a(getBinding().d)).c(((m7x0) this.tagUrlFormatter).a(this.content.e));
        addButtons(this.content.f);
        if (this.content.g) {
            startAnimation();
        }
    }

    private final void setupAppearanceAnimation() {
        this.appearanceValueAnimator.setDuration(300L);
        this.appearanceValueAnimator.addUpdateListener(new yso(20, this));
        this.appearanceValueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAppearanceAnimation$lambda$0(PrizeModalView prizeModalView, ValueAnimator valueAnimator) {
        prizeModalView.getBinding().f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void startAnimation() {
        getBinding().g.setImageAssetsFolder("lottie_loader");
        getBinding().g.setAnimation(getContext().getAssets().open(CONFETTI_LOTTIE), CONFETTI_LOTTIE_CACHE_KEY);
        getBinding().g.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.yandex.go.vault.ui.PrizeModalView$startAnimation$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                v1y binding;
                binding = PrizeModalView.this.getBinding();
                binding.g.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
            }
        });
        getBinding().g.playAnimation();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.black;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public v1y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(llh0.layout_prize, parent, false);
        parent.addView(inflate);
        int i = b9h0.back_button;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = b9h0.background_effect_image_view;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView2 != null) {
                i = b9h0.background_image_view;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView3 != null) {
                    i = b9h0.bottom_container;
                    if (((InsetsAwareLinearLayout) cma1.O(i, inflate)) != null) {
                        i = b9h0.buttons_container;
                        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                        if (goLinearLayout != null) {
                            i = b9h0.content;
                            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                            if (constraintLayout != null) {
                                i = b9h0.prize_lottie_container;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
                                if (lottieAnimationView != null) {
                                    i = b9h0.subtitle;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                                    if (appCompatTextView != null) {
                                        i = b9h0.title;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                                        if (appCompatTextView2 != null) {
                                            return new v1y((FrameLayout) inflate, appCompatImageView, appCompatImageView2, appCompatImageView3, goLinearLayout, constraintLayout, lottieAnimationView, appCompatTextView, appCompatTextView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.r4f0
    public void close() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new a230(11, new r0d0(21, this), null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(null);
        getCardContentView().setBackground(createBackground(getContext().getColor(hpg0.modal_view_background_color)));
        getBottomSheet().setBackground(new ColorDrawable(0));
        this.presenter.Bg(this);
        q4f0 q4f0Var = this.presenter;
        l331 l331Var = this.content;
        z231 z231Var = q4f0Var.y;
        String str = l331Var.a;
        ArrayList arrayList = l331Var.f;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x231) it.next()).a);
        }
        o7r0 o7r0Var = z231Var.a;
        String X = kotlin.collections.a.X(arrayList2, null, null, null, new mr21(17), 31);
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", X);
        if (str != null) {
            hashMap.put("id", str);
        }
        o7r0Var.a.a("Vault.PrizeCard.Shown", hashMap, 1, new HashMap());
        setupAppearanceAnimation();
        setContent();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.onDetachCallback.invoke();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: shouldDismissOnTouchOutside */
    public boolean getDismissOnTouchOutside() {
        return false;
    }

    @Override // defpackage.r4f0
    public void updateButton(x231 oldButton, x231 newButton) {
        this.actionButtons.set(this.actionButtons.indexOf(oldButton), newButton);
        List<x231> list = this.actionButtons;
        ArrayList arrayList = new ArrayList(list.size());
        for (x231 x231Var : list) {
            Objects.requireNonNull(x231Var);
            arrayList.add(x231Var);
        }
        addButtons(Collections.unmodifiableList(arrayList));
    }
}
