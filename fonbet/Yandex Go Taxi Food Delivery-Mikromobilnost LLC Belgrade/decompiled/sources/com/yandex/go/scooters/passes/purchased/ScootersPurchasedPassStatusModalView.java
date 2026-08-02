package com.yandex.go.scooters.passes.purchased;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import defpackage.c230;
import defpackage.cma1;
import defpackage.e230;
import defpackage.iin0;
import defpackage.koo0;
import defpackage.l8x;
import defpackage.loo0;
import defpackage.moo0;
import defpackage.noh;
import defpackage.noo0;
import defpackage.nsg0;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.srh0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tse;
import defpackage.v3n0;
import defpackage.w130;
import defpackage.xw31;
import defpackage.ynn0;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IBK\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0014¢\u0006\u0004\b2\u0010\u0015J\u000f\u00103\u001a\u00020\u0013H\u0014¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\u0013H\u0014¢\u0006\u0004\b4\u0010\u0015J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010:\u0012\u0004\b;\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR \u0010G\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/yandex/go/scooters/passes/purchased/ScootersPurchasedPassStatusModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnoo0;", "Landroid/content/Context;", "context", "Lytz;", "lottieLoader", "Ltse;", "coroutineScope", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lynn0;", "scootersFireworkForSuperPassPurchaseExperimentRepository", "Lcom/yandex/go/scooters/passes/domain/model/ScootersPassesType;", "scootersPassesType", "Lmoo0;", "scootersPurchaseSuccessStatus", "<init>", "(Landroid/content/Context;Lytz;Ltse;Lru/yandex/taxi/widget/utils/e;Lynn0;Lcom/yandex/go/scooters/passes/domain/model/ScootersPassesType;Lmoo0;)V", "Lzy11;", "loadAnimation", "()V", "startAnimation", "Lkoo0;", "iconStatus", "bindIconStatus", "(Lkoo0;)V", "Lloo0;", "textStatus", "bindTextStatus", "(Lloo0;)V", "", "title", "expirationStatus", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonTitle", "bindData", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnoo0;", "Le230;", "insetsType", "()Le230;", "", "isApplyShadow", "()Z", "onAttachedToWindow", "onAppearAnimationComplete", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Lytz;", "Ltse;", "getCoroutineScope$annotations", "Lru/yandex/taxi/widget/utils/e;", "Lynn0;", "Lcom/yandex/go/scooters/passes/domain/model/ScootersPassesType;", "Lmoo0;", "Ljava/lang/Runnable;", "Ll8x;", "iconLoadJob", "Ll8x;", "animationJob", "Lnoh;", "Lnsz;", "animationDeferred", "Lnoh;", "ooo0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPurchasedPassStatusModalView extends SlideableBindingModalView<noo0> {
    public static final int $stable = 8;
    private noh animationDeferred;
    private l8x animationJob;
    private final tse coroutineScope;
    private l8x iconLoadJob;
    private final ytz lottieLoader;
    private final e mediaInfoConverter;
    private Runnable onBackPressedListener;
    private final ynn0 scootersFireworkForSuperPassPurchaseExperimentRepository;
    private final ScootersPassesType scootersPassesType;
    private final moo0 scootersPurchaseSuccessStatus;

    public ScootersPurchasedPassStatusModalView(Context context, ytz ytzVar, tse tseVar, e eVar, ynn0 ynn0Var, ScootersPassesType scootersPassesType, moo0 moo0Var) {
        super(context);
        this.lottieLoader = ytzVar;
        this.coroutineScope = tseVar;
        this.mediaInfoConverter = eVar;
        this.scootersFireworkForSuperPassPurchaseExperimentRepository = ynn0Var;
        this.scootersPassesType = scootersPassesType;
        this.scootersPurchaseSuccessStatus = moo0Var;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    private final void bindData(CharSequence title, CharSequence expirationStatus, CharSequence description, CharSequence buttonTitle) {
        noo0 binding = getBinding();
        RobotoTextView robotoTextView = binding.h;
        ButtonComponent buttonComponent = binding.g;
        RobotoTextView robotoTextView2 = binding.c;
        robotoTextView.setText(title);
        RobotoTextView robotoTextView3 = binding.d;
        robotoTextView3.setVisibility(expirationStatus != null ? 0 : 8);
        robotoTextView3.setText(expirationStatus);
        robotoTextView2.setVisibility(description != null ? 0 : 8);
        robotoTextView2.setText(description);
        buttonComponent.setText(buttonTitle);
        buttonComponent.setDebounceClickListener(new v3n0(22, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0$0(ScootersPurchasedPassStatusModalView scootersPurchasedPassStatusModalView) {
        Runnable runnable = scootersPurchasedPassStatusModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void bindIconStatus(koo0 iconStatus) {
        getBottomSheet().setBackground(null);
        if (iconStatus.a != null) {
            l8x l8xVar = this.iconLoadJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.iconLoadJob = tje.N(this.coroutineScope, null, null, new ScootersPurchasedPassStatusModalView$bindIconStatus$1(this, iconStatus, null), 3);
        }
        getBinding().b.setVisibility(0);
        bindData(iconStatus.b, iconStatus.d, iconStatus.e, iconStatus.c);
    }

    private final void bindTextStatus(loo0 textStatus) {
        getBinding().e.setVisibility(8);
        getBinding().b.setVisibility(8);
        bindData(textStatus.a, textStatus.c, textStatus.d, textStatus.b);
    }

    private static /* synthetic */ void getCoroutineScope$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersPurchasedPassStatusModalView scootersPurchasedPassStatusModalView, t1w t1wVar) {
        int d = c.d(nsg0.scooters_purchased_passes_screen_ok_button_horizontal_margin, scootersPurchasedPassStatusModalView);
        xw31.E(scootersPurchasedPassStatusModalView.getBinding().g, Integer.valueOf(d), 0, Integer.valueOf(d), Integer.valueOf(t1wVar.g + tje.r(nsg0.scooters_purchased_passes_screen_ok_button_bottom_margin, scootersPurchasedPassStatusModalView.getContext())));
        return zy11.a;
    }

    private final void loadAnimation() {
        ScootersPurchasedPassStatusModalView$loadAnimation$1 scootersPurchasedPassStatusModalView$loadAnimation$1 = new ScootersPurchasedPassStatusModalView$loadAnimation$1(this, ScootersPurchasedPassStatusModalView.class, "animationDeferred", "getAnimationDeferred()Lkotlinx/coroutines/Deferred;", 0);
        l8x l8xVar = (l8x) scootersPurchasedPassStatusModalView$loadAnimation$1.get();
        scootersPurchasedPassStatusModalView$loadAnimation$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.animationDeferred = tje.h(this.coroutineScope, null, null, new ScootersPurchasedPassStatusModalView$loadAnimation$2(this, null), 3);
    }

    private final void startAnimation() {
        ScootersPurchasedPassStatusModalView$startAnimation$1 scootersPurchasedPassStatusModalView$startAnimation$1 = new ScootersPurchasedPassStatusModalView$startAnimation$1(this, ScootersPurchasedPassStatusModalView.class, "animationJob", "getAnimationJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersPurchasedPassStatusModalView$startAnimation$1.get();
        scootersPurchasedPassStatusModalView$startAnimation$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.animationJob = tje.N(this.coroutineScope, null, null, new ScootersPurchasedPassStatusModalView$startAnimation$2(this, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public noo0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_purchased_pass_status_modal_view, parent, false);
        int i = qfh0.container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
        if (goFrameLayout != null) {
            i = qfh0.description_text_view;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = qfh0.expiration_text_view;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = qfh0.icon;
                    GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                    if (goImageView != null) {
                        i = qfh0.lottie_animation_view;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
                        if (lottieAnimationView != null) {
                            i = qfh0.ok_button;
                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                            if (buttonComponent != null) {
                                i = qfh0.title_text_view;
                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                if (robotoTextView3 != null) {
                                    return new noo0((GoConstraintLayout) inflate, goFrameLayout, robotoTextView, robotoTextView2, goImageView, lottieAnimationView, buttonComponent, robotoTextView3);
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

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return this.scootersPurchaseSuccessStatus instanceof koo0 ? new w130(1, new iin0(22, this)) : new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        startAnimation();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moo0 moo0Var = this.scootersPurchaseSuccessStatus;
        if (moo0Var instanceof koo0) {
            if (this.scootersPassesType == ScootersPassesType.SUPER_PASSES) {
                loadAnimation();
            }
            bindIconStatus((koo0) this.scootersPurchaseSuccessStatus);
        } else if (moo0Var instanceof loo0) {
            bindTextStatus((loo0) moo0Var);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScootersPurchasedPassStatusModalView$onDetachedFromWindow$1 scootersPurchasedPassStatusModalView$onDetachedFromWindow$1 = new ScootersPurchasedPassStatusModalView$onDetachedFromWindow$1(this, ScootersPurchasedPassStatusModalView.class, "iconLoadJob", "getIconLoadJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersPurchasedPassStatusModalView$onDetachedFromWindow$1.get();
        scootersPurchasedPassStatusModalView$onDetachedFromWindow$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ScootersPurchasedPassStatusModalView$onDetachedFromWindow$2 scootersPurchasedPassStatusModalView$onDetachedFromWindow$2 = new ScootersPurchasedPassStatusModalView$onDetachedFromWindow$2(this, ScootersPurchasedPassStatusModalView.class, "animationJob", "getAnimationJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar2 = (l8x) scootersPurchasedPassStatusModalView$onDetachedFromWindow$2.get();
        scootersPurchasedPassStatusModalView$onDetachedFromWindow$2.i(null);
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        ScootersPurchasedPassStatusModalView$onDetachedFromWindow$3 scootersPurchasedPassStatusModalView$onDetachedFromWindow$3 = new ScootersPurchasedPassStatusModalView$onDetachedFromWindow$3(this, ScootersPurchasedPassStatusModalView.class, "animationDeferred", "getAnimationDeferred()Lkotlinx/coroutines/Deferred;", 0);
        l8x l8xVar3 = (l8x) scootersPurchasedPassStatusModalView$onDetachedFromWindow$3.get();
        scootersPurchasedPassStatusModalView$onDetachedFromWindow$3.i(null);
        if (l8xVar3 != null) {
            l8xVar3.a(null);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackPressedListener = onBackPressedListener;
    }
}
