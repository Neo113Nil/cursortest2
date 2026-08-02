package com.yandex.go.lootbox.impl.presentation.modal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.lootbox.api.domain.analytics.LootBoxAnalytics$ButtonType;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo;
import defpackage.a2i0;
import defpackage.apz;
import defpackage.at5;
import defpackage.avj0;
import defpackage.cma1;
import defpackage.cqz;
import defpackage.dqz;
import defpackage.eqz;
import defpackage.fpz;
import defpackage.fqz;
import defpackage.gqz;
import defpackage.ike;
import defpackage.jqz;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.lqz;
import defpackage.m7x0;
import defpackage.mbb;
import defpackage.mqz;
import defpackage.nac;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.o61;
import defpackage.pav;
import defpackage.pj;
import defpackage.ppz;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r7v;
import defpackage.s8o;
import defpackage.scc;
import defpackage.ssz;
import defpackage.tje;
import defpackage.toz;
import defpackage.tse;
import defpackage.txc;
import defpackage.u8w;
import defpackage.uth0;
import defpackage.wih0;
import defpackage.xng0;
import defpackage.xtn;
import defpackage.yow;
import defpackage.zuj0;
import defpackage.zxs;
import defpackage.zy11;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BQ\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0014¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001bH\u0014¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u001bH\u0014¢\u0006\u0004\b0\u0010#J\u001f\u00105\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\b=\u0010#J5\u0010@\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010>\u001a\u0002092\u0006\u0010?\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001bH\u0016¢\u0006\u0004\bE\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/yandex/go/lootbox/impl/presentation/modal/LootBoxModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lmqz;", "Llqz;", "Landroid/content/Context;", "context", "Lcom/yandex/go/lootbox/impl/presentation/modal/c;", "presenter", "", "screenTitle", "Lgqz;", "lootBoxGiftsListAdapterFactory", "Lzuj0;", "resourcesProxy", "Lcqz;", "lootBoxErrorAlertDialogRouter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/lootbox/impl/presentation/modal/c;Ljava/lang/String;Lgqz;Lzuj0;Lcqz;Lpav;Lk7x0;)V", "", "Leqz;", "gifts", "Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;", "animationInfo", "Lzy11;", "animateGifts", "(Ljava/util/List;Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;)V", "Ltoz;", "action", "configureTakeAllButtonClickListener", "(Ltoz;)V", "showListAndButton", "()V", "Lppz;", "model", "", "getTakeAllButtonBackgroundColor", "(Lppz;)I", "", "seconds", "", "secondsToMilliseconds", "(F)J", "onAttachedToWindow", "onDetachedFromWindow", "onAppearAnimationComplete", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lmqz;", "setLootBoxV1ActivateData", "(Lppz;)V", "Ljava/io/InputStream;", "animationStream", "showLoadingLottie", "(Ljava/io/InputStream;)V", "showLoadingWithoutLottie", "openingAnimationStream", "completionAnimationStream", "startAnimateGifts", "(Ljava/util/List;Ljava/io/InputStream;Ljava/io/InputStream;Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;)V", "text", "showError", "(Ljava/lang/String;)V", "dismissView", "Lcom/yandex/go/lootbox/impl/presentation/modal/c;", "Ljava/lang/String;", "Lgqz;", "Lzuj0;", "Lcqz;", "Lpav;", "Lk7x0;", "Lru/yandex/taxi/design/ButtonComponent;", "takeAllButton", "Lru/yandex/taxi/design/ButtonComponent;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerGifts", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/ImageButton;", "backButton", "Landroid/widget/ImageButton;", "Lfqz;", "adapter", "Lfqz;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxModalView extends SlideableBindingModalView<mqz> implements lqz {
    private fqz adapter;
    private final ImageButton backButton;
    private final pav imageLoader;
    private final cqz lootBoxErrorAlertDialogRouter;
    private final gqz lootBoxGiftsListAdapterFactory;
    private final c presenter;
    private final RecyclerView recyclerGifts;
    private final zuj0 resourcesProxy;
    private final String screenTitle;
    private final k7x0 tagUrlFormatter;
    private final ButtonComponent takeAllButton;

    public LootBoxModalView(Context context, c cVar, String str, gqz gqzVar, zuj0 zuj0Var, cqz cqzVar, pav pavVar, k7x0 k7x0Var) {
        super(new ContextThemeWrapper(context.getApplicationContext(), a2i0.Taxi_Light));
        this.presenter = cVar;
        this.screenTitle = str;
        this.lootBoxGiftsListAdapterFactory = gqzVar;
        this.resourcesProxy = zuj0Var;
        this.lootBoxErrorAlertDialogRouter = cqzVar;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.takeAllButton = getBinding().j;
        this.recyclerGifts = getBinding().h;
        this.backButton = getBinding().e;
        setDismissOnTouchOutside(false);
    }

    private final void animateGifts(List<eqz> gifts, LootBoxAnimationInfo animationInfo) {
        char c = 0;
        int i = 0;
        for (Object obj : gifts) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            final ImageView imageView = new ImageView(getContext());
            imageView.setVisibility(8);
            imageView.setAlpha(0.0f);
            int u = tje.u(40, ((avj0) this.resourcesProxy).a);
            nac nacVar = (nac) this.imageLoader.a(imageView);
            nacVar.f(u, u);
            nacVar.i = new yow(29, ref$BooleanRef);
            nacVar.c(((m7x0) this.tagUrlFormatter).a(((eqz) obj).d));
            FrameLayout frameLayout = getBinding().b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            int height = (getBinding().k.getHeight() * 2) + (getBinding().b.getHeight() / 2);
            long secondsToMilliseconds = (i * secondsToMilliseconds(animationInfo.g)) + secondsToMilliseconds(animationInfo.h);
            float f = -height;
            float[] fArr = new float[1];
            fArr[c] = f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_Y, fArr);
            ofFloat.setDuration(secondsToMilliseconds(animationInfo.f));
            ofFloat.setStartDelay(secondsToMilliseconds);
            char c2 = c;
            ofFloat.addListener(new AnimUtils$AnimationStartEndListener(new xtn(imageView, 3), new mbb(this, imageView, i, gifts, 4)));
            float[] fArr2 = new float[1];
            fArr2[c2] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr2);
            ofFloat2.setDuration(secondsToMilliseconds(animationInfo.e));
            ofFloat2.setStartDelay(secondsToMilliseconds);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            animatorArr[c2] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorSet.playTogether(animatorArr);
            animatorSet.start();
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView$animateGifts$lambda$0$$inlined$addListener$default$1
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
                    mqz binding;
                    if (Ref$BooleanRef.this.element) {
                        animator.cancel();
                        imageView.setVisibility(8);
                        binding = this.getBinding();
                        binding.b.removeView(imageView);
                    }
                }
            });
            i = i2;
            c = c2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateGifts$lambda$0$1(Ref$BooleanRef ref$BooleanRef) {
        ref$BooleanRef.element = true;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateGifts$lambda$0$3$1(LootBoxModalView lootBoxModalView, ImageView imageView, int i, List list) {
        lootBoxModalView.getBinding().b.removeView(imageView);
        if (i == list.size() - 1) {
            lootBoxModalView.showListAndButton();
        }
    }

    private final void configureTakeAllButtonClickListener(toz action) {
        this.takeAllButton.setDebounceClickListener(new r7v(26, this, action));
    }

    public static /* synthetic */ void configureTakeAllButtonClickListener$default(LootBoxModalView lootBoxModalView, toz tozVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tozVar = null;
        }
        lootBoxModalView.configureTakeAllButtonClickListener(tozVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureTakeAllButtonClickListener$lambda$0(LootBoxModalView lootBoxModalView, toz tozVar) {
        lootBoxModalView.presenter.Lg(LootBoxAnalytics$ButtonType.TAKE_ALL, tozVar);
        lootBoxModalView.dismiss();
    }

    private final int getTakeAllButtonBackgroundColor(ppz model) {
        int t = qje.t(xng0.controlMain, getContext());
        kdc kdcVar = model.d.a;
        Integer valueOf = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, getContext())) : null;
        return valueOf != null ? valueOf.intValue() : t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(LootBoxModalView lootBoxModalView) {
        lootBoxModalView.dismiss();
        return zy11.a;
    }

    private final long secondsToMilliseconds(float seconds) {
        return (long) (seconds * 1000.0f);
    }

    private final void showListAndButton() {
        TransitionManager.a(new AutoTransition(), getBinding().a);
        getBinding().d.setVisibility(0);
        getBinding().c.setVisibility(0);
        getBinding().h.setVisibility(0);
        getBinding().i.setVisibility(0);
        getBinding().c.setVisibility(0);
        this.backButton.setVisibility(8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public mqz bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(uth0.loot_box_modal_view, parent, false);
        int i = wih0.animation_content;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null && (O = cma1.O((i = wih0.button_shadow), inflate)) != null) {
            i = wih0.button_wrapper;
            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout2 != null) {
                i = wih0.go_back;
                ImageButton imageButton = (ImageButton) cma1.O(i, inflate);
                if (imageButton != null) {
                    i = wih0.loot_box;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
                    if (lottieAnimationView != null) {
                        i = wih0.progress;
                        ProgressBar progressBar = (ProgressBar) cma1.O(i, inflate);
                        if (progressBar != null) {
                            i = wih0.recycler_gifs;
                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                            if (recyclerView != null) {
                                i = wih0.separator;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView != null) {
                                    i = wih0.take_all_button;
                                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                    if (buttonComponent != null) {
                                        i = wih0.title;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView2 != null) {
                                            return new mqz((ConstraintLayout) inflate, frameLayout, O, frameLayout2, imageButton, lottieAnimationView, progressBar, recyclerView, robotoTextView, buttonComponent, robotoTextView2);
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

    @Override // defpackage.lqz
    public void dismissView() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        c cVar = this.presenter;
        String str = cVar.E;
        tje.N(cVar.Jg(), null, null, new LootBoxModalViewPresenter$activateLootBox$1(cVar, cVar.F, str, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.presenter;
        cVar.Bg(this);
        ((jqz) cVar.B).a.c();
        apz apzVar = cVar.C;
        String str = cVar.E;
        pj pjVar = apzVar.d;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("lootbox_id", str);
        pjVar.a.a("LootboxGift.Shown", hashMap, 1, new HashMap());
        this.recyclerGifts.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        gqz gqzVar = this.lootBoxGiftsListAdapterFactory;
        tse Jg = this.presenter.Jg();
        txc txcVar = new txc(2, this.presenter);
        k7x0 k7x0Var = gqzVar.b;
        pav pavVar = gqzVar.a;
        ru.yandex.taxi.widget.c cVar2 = gqzVar.c;
        zuj0 zuj0Var = gqzVar.d;
        List list = com.yandex.go.lootbox.impl.presentation.recycler.a.a0;
        fqz fqzVar = new fqz(txcVar, Collections.singletonList(new zxs(qoi0.a(eqz.class), uth0.list_item_loot_box_gift, com.yandex.go.lootbox.impl.presentation.recycler.a.a0, new at5((ike) Jg, k7x0Var, pavVar, cVar2, txcVar, zuj0Var, 5))));
        this.adapter = fqzVar;
        this.recyclerGifts.setAdapter(fqzVar);
        ru.yandex.taxi.design.utils.c.z(new yow(28, this), this.backButton);
        configureTakeAllButtonClickListener$default(this, null, 1, null);
        RobotoTextView robotoTextView = getBinding().k;
        String str2 = this.screenTitle;
        if (str2 == null) {
            str2 = "";
        }
        robotoTextView.setText(str2);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.lqz
    public void setLootBoxV1ActivateData(ppz model) {
        String str = model.a;
        fpz fpzVar = model.d;
        if (str.length() > 0) {
            getBinding().k.setText(model.a);
        }
        getBinding().i.setText(model.b);
        fqz fqzVar = this.adapter;
        if (fqzVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(model.c);
            fqzVar.submitList(kotlin.collections.a.J0(arrayList), null);
        }
        ButtonComponent buttonComponent = this.takeAllButton;
        getBinding().j.setBackgroundColor(getTakeAllButtonBackgroundColor(model));
        buttonComponent.setText(fpzVar.b);
        configureTakeAllButtonClickListener(fpzVar.c);
    }

    @Override // defpackage.lqz
    public void showError(String text) {
        ((dqz) this.lootBoxErrorAlertDialogRouter).a(new LootBoxModalView$showError$1(0, this, LootBoxModalView.class, "dismissView", "dismissView()V", 0), text);
    }

    @Override // defpackage.lqz
    public void showLoadingLottie(InputStream animationStream) {
        getBinding().g.setVisibility(8);
        nsz nszVar = ssz.d(animationStream, null).a;
        if (nszVar != null) {
            getBinding().f.setComposition(nszVar);
        }
        getBinding().f.setRepeatCount(-1);
        getBinding().f.setRepeatMode(2);
        getBinding().f.playAnimation();
        getBinding().f.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView$showLoadingLottie$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                c cVar;
                super.onAnimationRepeat(animation);
                cVar = LootBoxModalView.this.presenter;
                apz apzVar = cVar.C;
                String str = cVar.E;
                o61 o61Var = apzVar.c;
                o61Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("lootbox_id", str);
                o61Var.a.a("Lootbox.FirstAnimationRepeated", hashMap, 1, new HashMap());
            }
        });
        u8w u8wVar = this.presenter.C.a;
        u8wVar.getClass();
        u8wVar.a.a("Lootbox.AnimationStart", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.lqz
    public void showLoadingWithoutLottie() {
        getBinding().g.setVisibility(0);
    }

    @Override // defpackage.lqz
    public void startAnimateGifts(List<eqz> gifts, InputStream openingAnimationStream, final InputStream completionAnimationStream, LootBoxAnimationInfo animationInfo) {
        getBinding().f.removeAllAnimatorListeners();
        nsz nszVar = ssz.d(openingAnimationStream, null).a;
        if (nszVar != null) {
            getBinding().f.setComposition(nszVar);
        }
        getBinding().f.setRepeatCount(0);
        getBinding().f.playAnimation();
        animateGifts(gifts, animationInfo);
        getBinding().f.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView$startAnimateGifts$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                mqz binding;
                mqz binding2;
                mqz binding3;
                mqz binding4;
                super.onAnimationEnd(animation);
                binding = LootBoxModalView.this.getBinding();
                binding.f.removeAnimatorListener(this);
                nsz nszVar2 = ssz.d(completionAnimationStream, null).a;
                if (nszVar2 != null) {
                    binding4 = LootBoxModalView.this.getBinding();
                    binding4.f.setComposition(nszVar2);
                }
                binding2 = LootBoxModalView.this.getBinding();
                binding2.f.setRepeatCount(-1);
                binding3 = LootBoxModalView.this.getBinding();
                binding3.f.playAnimation();
            }
        });
    }
}
