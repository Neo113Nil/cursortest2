package com.ybsdk.screens.upgrade.presentation.main;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.b9g;
import defpackage.d451;
import defpackage.dzh0;
import defpackage.ggb1;
import defpackage.h861;
import defpackage.h9g;
import defpackage.ha21;
import defpackage.i3y;
import defpackage.ka21;
import defpackage.la21;
import defpackage.lb7;
import defpackage.lfx;
import defpackage.lr20;
import defpackage.ma21;
import defpackage.qa21;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.r921;
import defpackage.r9u0;
import defpackage.rtu;
import defpackage.s921;
import defpackage.sa21;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tw51;
import defpackage.ua21;
import defpackage.uns0;
import defpackage.vmu0;
import defpackage.w511;
import defpackage.wb21;
import defpackage.wx11;
import defpackage.xa21;
import defpackage.xb21;
import defpackage.xds0;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.yb21;
import defpackage.ylg0;
import defpackage.yr31;
import defpackage.z121;
import defpackage.zb21;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001KB\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\fJ!\u0010,\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R!\u00105\u001a\b\u0012\u0004\u0012\u0002000/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R!\u00108\u001a\b\u0012\u0004\u0012\u0002000/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R#\u0010G\u001a\n C*\u0004\u0018\u00010B0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/ybsdk/screens/upgrade/presentation/main/UpgradeFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lh861;", "Lzb21;", "Lcom/ybsdk/screens/upgrade/presentation/main/a;", "Luns0;", "Ltw51;", "component", "<init>", "(Ltw51;)V", "Lzy11;", "onDestroy", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lh861;", "createViewModel", "()Lcom/ybsdk/screens/upgrade/presentation/main/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "viewState", "render", "(Lzb21;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "positionX", "positionY", "", "canSlideFrom", "(FF)Z", "showInitialLoading", "previousViewState", "newViewState", "animateToForm", "(Lzb21;Lzb21;)V", "Ltw51;", "Lqa3;", "Lr921;", "formAdapter$delegate", "Li3y;", "getFormAdapter", "()Lqa3;", "formAdapter", "shimmerAdapter$delegate", "getShimmerAdapter", "shimmerAdapter", "Ls921;", "upgradeComponent$delegate", "getUpgradeComponent", "()Ls921;", "upgradeComponent", "Landroid/animation/Animator;", "shimmerFadeAnimator", "Landroid/animation/Animator;", "formCrossFadeAnimator", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "currentViewState", "Lzb21;", "Companion", "sa21", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpgradeFragment extends BaseMvvmFragment<h861, zb21, a> implements uns0 {
    private static final sa21 Companion = new sa21();

    @Deprecated
    public static final long FORM_FADE_IN_ANIMATION_DURATION = 300;

    @Deprecated
    public static final long FORM_FADE_IN_ANIMATION_OFFSET = 100;

    @Deprecated
    public static final long SHIMMER_FADE_IN_ANIMATION_DURATION = 300;

    @Deprecated
    public static final long SHIMMER_FADE_IN_ANIMATION_OFFSET = 300;

    @Deprecated
    public static final long SHIMMER_FADE_OUT_ANIMATION_DURATION = 300;

    @Deprecated
    public static final long SHIMMER_FADE_OUT_ANIMATION_OFFSET = 0;
    private final tw51 component;
    private zb21 currentViewState;

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator;

    /* renamed from: formAdapter$delegate, reason: from kotlin metadata */
    private final i3y formAdapter;
    private Animator formCrossFadeAnimator;

    /* renamed from: shimmerAdapter$delegate, reason: from kotlin metadata */
    private final i3y shimmerAdapter;
    private Animator shimmerFadeAnimator;

    /* renamed from: upgradeComponent$delegate, reason: from kotlin metadata */
    private final i3y upgradeComponent;

    public UpgradeFragment(tw51 tw51Var) {
        super(null, null, null, null, a.class, 15, null);
        this.component = tw51Var;
        final int i = 0;
        this.formAdapter = kotlin.a.a(new sls(this) { // from class: ra21
            public final /* synthetic */ UpgradeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qa3 formAdapter_delegate$lambda$0;
                s921 upgradeComponent_delegate$lambda$2;
                Interpolator defaultInterpolator_delegate$lambda$3;
                int i2 = i;
                UpgradeFragment upgradeFragment = this.b;
                switch (i2) {
                    case 0:
                        formAdapter_delegate$lambda$0 = UpgradeFragment.formAdapter_delegate$lambda$0(upgradeFragment);
                        return formAdapter_delegate$lambda$0;
                    case 1:
                        upgradeComponent_delegate$lambda$2 = UpgradeFragment.upgradeComponent_delegate$lambda$2(upgradeFragment);
                        return upgradeComponent_delegate$lambda$2;
                    default:
                        defaultInterpolator_delegate$lambda$3 = UpgradeFragment.defaultInterpolator_delegate$lambda$3(upgradeFragment);
                        return defaultInterpolator_delegate$lambda$3;
                }
            }
        });
        this.shimmerAdapter = kotlin.a.a(new z121(9));
        final int i2 = 1;
        this.upgradeComponent = kotlin.a.a(new sls(this) { // from class: ra21
            public final /* synthetic */ UpgradeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qa3 formAdapter_delegate$lambda$0;
                s921 upgradeComponent_delegate$lambda$2;
                Interpolator defaultInterpolator_delegate$lambda$3;
                int i22 = i2;
                UpgradeFragment upgradeFragment = this.b;
                switch (i22) {
                    case 0:
                        formAdapter_delegate$lambda$0 = UpgradeFragment.formAdapter_delegate$lambda$0(upgradeFragment);
                        return formAdapter_delegate$lambda$0;
                    case 1:
                        upgradeComponent_delegate$lambda$2 = UpgradeFragment.upgradeComponent_delegate$lambda$2(upgradeFragment);
                        return upgradeComponent_delegate$lambda$2;
                    default:
                        defaultInterpolator_delegate$lambda$3 = UpgradeFragment.defaultInterpolator_delegate$lambda$3(upgradeFragment);
                        return defaultInterpolator_delegate$lambda$3;
                }
            }
        });
        final int i3 = 2;
        this.defaultInterpolator = kotlin.a.a(new sls(this) { // from class: ra21
            public final /* synthetic */ UpgradeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qa3 formAdapter_delegate$lambda$0;
                s921 upgradeComponent_delegate$lambda$2;
                Interpolator defaultInterpolator_delegate$lambda$3;
                int i22 = i3;
                UpgradeFragment upgradeFragment = this.b;
                switch (i22) {
                    case 0:
                        formAdapter_delegate$lambda$0 = UpgradeFragment.formAdapter_delegate$lambda$0(upgradeFragment);
                        return formAdapter_delegate$lambda$0;
                    case 1:
                        upgradeComponent_delegate$lambda$2 = UpgradeFragment.upgradeComponent_delegate$lambda$2(upgradeFragment);
                        return upgradeComponent_delegate$lambda$2;
                    default:
                        defaultInterpolator_delegate$lambda$3 = UpgradeFragment.defaultInterpolator_delegate$lambda$3(upgradeFragment);
                        return defaultInterpolator_delegate$lambda$3;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ h861 access$getBinding(UpgradeFragment upgradeFragment) {
        return (h861) upgradeFragment.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    private final void animateToForm(zb21 previousViewState, zb21 newViewState) {
        ?? r2;
        ArrayList arrayList = new ArrayList();
        d451 g = newViewState.g();
        if (g != null) {
            arrayList.add(new r9u0(g));
        }
        List d = newViewState.d();
        if (newViewState.c() != null) {
            d = null;
        }
        if (d != null) {
            r2 = new ArrayList(tcc.n(d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                r2.add(new la21((ma21) it.next()));
            }
        } else {
            r2 = 0;
        }
        if (r2 == 0) {
            r2 = EmptyList.a;
        }
        arrayList.addAll((Collection) r2);
        getFormAdapter().g(arrayList);
        Animator animator = this.formCrossFadeAnimator;
        int i = 1;
        if (animator == null || !animator.isStarted()) {
            if (previousViewState == null || !previousViewState.e() || newViewState.e()) {
                ((h861) getBinding()).d.setVisibility(0);
                ((h861) getBinding()).e.setVisibility(8);
                return;
            }
            Animator animator2 = this.shimmerFadeAnimator;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.shimmerFadeAnimator = null;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new qa21(this, i));
            ofFloat.setInterpolator(getDefaultInterpolator());
            ofFloat.setDuration(300L);
            ofFloat.setStartDelay(0L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new qa21(this, 2));
            ofFloat2.setInterpolator(getDefaultInterpolator());
            ofFloat2.setDuration(300L);
            ofFloat2.setStartDelay(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.formCrossFadeAnimator = animatorSet;
            ((h861) getBinding()).d.setVisibility(0);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment$animateToForm$lambda$25$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator3) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator3) {
                    UpgradeFragment.this.formCrossFadeAnimator = null;
                    UpgradeFragment.access$getBinding(UpgradeFragment.this).e.setVisibility(8);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator3) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator3) {
                }
            });
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment$animateToForm$lambda$25$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator3) {
                    UpgradeFragment.this.formCrossFadeAnimator = null;
                    UpgradeFragment.access$getBinding(UpgradeFragment.this).e.setVisibility(8);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator3) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator3) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator3) {
                }
            });
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void animateToForm$lambda$20$lambda$19(UpgradeFragment upgradeFragment, ValueAnimator valueAnimator) {
        ((h861) upgradeFragment.getBinding()).e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void animateToForm$lambda$22$lambda$21(UpgradeFragment upgradeFragment, ValueAnimator valueAnimator) {
        ((h861) upgradeFragment.getBinding()).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$3(UpgradeFragment upgradeFragment) {
        return AnimationUtils.loadInterpolator(upgradeFragment.getContext(), ylg0.ybsdk_default_interpolator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 formAdapter_delegate$lambda$0(UpgradeFragment upgradeFragment) {
        ua21 ua21Var = ua21.a;
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new qa3(new lb7(9, y5e.b, ua21Var), ha21.a(new UpgradeFragment$formAdapter$2$1(upgradeFragment.getViewModel()), new UpgradeFragment$formAdapter$2$2(upgradeFragment.getViewModel())), ggb1.c(new UpgradeFragment$formAdapter$2$3(upgradeFragment.getViewModel())));
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    private final qa3 getFormAdapter() {
        return (qa3) this.formAdapter.getValue();
    }

    private final qa3 getShimmerAdapter() {
        return (qa3) this.shimmerAdapter.getValue();
    }

    private final s921 getUpgradeComponent() {
        return (s921) this.upgradeComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5$lambda$4(UpgradeFragment upgradeFragment, View view) {
        upgradeFragment.getViewModel().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$8$lambda$7(zb21 zb21Var, YbButtonView.a aVar) {
        return new YbButtonView.a(new Text.Resource(dzh0.ybsdk_uprid_button_send), null, null, null, null, null, null, false, zb21Var.f(), null, 3070);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 shimmerAdapter_delegate$lambda$1() {
        ua21 ua21Var = ua21.a;
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new qa3(new lb7(9, y5e.b, ua21Var), lr20.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showInitialLoading() {
        Animator animator = this.shimmerFadeAnimator;
        if (animator == null || !animator.isStarted()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.shimmerFadeAnimator = ofFloat;
            ((h861) getBinding()).e.setAlpha(0.0f);
            ((h861) getBinding()).e.setVisibility(0);
            ((h861) getBinding()).d.setVisibility(8);
            ofFloat.addUpdateListener(new qa21(this, 0));
            ofFloat.setInterpolator(getDefaultInterpolator());
            ofFloat.setDuration(300L);
            ofFloat.setStartDelay(300L);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment$showInitialLoading$lambda$15$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    UpgradeFragment.this.shimmerFadeAnimator = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment$showInitialLoading$lambda$15$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                    UpgradeFragment.this.shimmerFadeAnimator = null;
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
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showInitialLoading$lambda$15$lambda$12(UpgradeFragment upgradeFragment, ValueAnimator valueAnimator) {
        ((h861) upgradeFragment.getBinding()).e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s921 upgradeComponent_delegate$lambda$2(UpgradeFragment upgradeFragment) {
        return ((h9g) upgradeFragment.component).k().a(upgradeFragment.component);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uns0
    public boolean canSlideFrom(float positionX, float positionY) {
        return !b.f(((h861) getBinding()).d.getVisibility() == 0 ? r0.d : r0.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        yb21 yb21Var = sideEffect instanceof yb21 ? (yb21) sideEffect : null;
        if (yb21Var instanceof xb21) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((xb21) yb21Var).a(), null, 12);
            return;
        }
        if (!(yb21Var instanceof wb21)) {
            if (yb21Var == null) {
                super.consumeSideEffect(sideEffect);
                return;
            } else {
                w511.b();
                return;
            }
        }
        List f = getFormAdapter().f();
        if (f == null) {
            return;
        }
        androidx.core.view.b.r(((h861) getBinding()).o(), getText(dzh0.ybsdk_uprid_accessibility_incorrectly_filled_fields_warning));
        int i = 0;
        for (Object obj : f) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            r921 r921Var = (r921) obj;
            if (r921Var instanceof la21) {
                la21 la21Var = (la21) r921Var;
                if (((wb21) yb21Var).a().contains(la21Var.a().a())) {
                    getFormAdapter().notifyItemChanged(i, ka21.a);
                    androidx.core.view.b.r(((h861) getBinding()).d, d.a(requireContext(), la21Var.a().b()));
                }
            }
            i = i2;
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((b9g) getUpgradeComponent()).b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ((h9g) this.component).k().b();
        super.onDestroy();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Animator animator = this.shimmerFadeAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.shimmerFadeAnimator = null;
        Animator animator2 = this.formCrossFadeAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.formCrossFadeAnimator = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().f0();
        h861 h861Var = (h861) getBinding();
        h861Var.b.setOnClickListener(new vmu0(26, this));
        RecyclerView recyclerView = h861Var.e;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(getShimmerAdapter());
        RecyclerView recyclerView2 = h861Var.d;
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView2.setAdapter(getFormAdapter());
        recyclerView.setItemAnimator(null);
        recyclerView2.setItemAnimator(null);
        h861Var.c.setPrimaryButtonOnClickListener(new UpgradeFragment$onViewCreated$1$2(getViewModel()));
        h861Var.f.setMovementMethod(LinkMovementMethod.getInstance());
        qa3 shimmerAdapter = getShimmerAdapter();
        SimpleIdFormFieldEntity.Companion.getClass();
        int size = xds0.a().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(xa21.a);
        }
        shimmerAdapter.g(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(zb21 viewState) {
        CharSequence a;
        String obj;
        ((h861) getBinding()).c.render(viewState.c());
        if (viewState.e()) {
            showInitialLoading();
        } else {
            animateToForm(this.currentViewState, viewState);
        }
        YbButtonView ybButtonView = ((h861) getBinding()).b;
        ybButtonView.setVisibility((viewState.e() || viewState.c() != null) ? 8 : 0);
        ybButtonView.render(new wx11(r2, viewState));
        ybButtonView.setEnabled(viewState.b());
        TextView textView = ((h861) getBinding()).f;
        textView.setVisibility(viewState.a() != null ? 0 : 8);
        Text a2 = viewState.a();
        textView.setText((a2 == null || (a = d.a(textView.getContext(), a2)) == null || (obj = a.toString()) == null) ? null : rtu.a(new UpgradeFragment$render$2$1(getViewModel()), obj));
        this.currentViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public h861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return h861.p(inflater, container);
    }
}
