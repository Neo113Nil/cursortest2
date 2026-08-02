package com.ybsdk.screens.upgrade.presentation.edit;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.SeekBar;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.formatter.FormatTextWatcher;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import defpackage.b9g;
import defpackage.bh11;
import defpackage.ce0;
import defpackage.dcs;
import defpackage.ea21;
import defpackage.eja1;
import defpackage.h9g;
import defpackage.hfb1;
import defpackage.i3y;
import defpackage.i470;
import defpackage.i861;
import defpackage.jah0;
import defpackage.jl40;
import defpackage.l76;
import defpackage.lb7;
import defpackage.lfx;
import defpackage.of11;
import defpackage.qa3;
import defpackage.rtu;
import defpackage.s921;
import defpackage.t921;
import defpackage.tb21;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tw51;
import defpackage.ub21;
import defpackage.uns0;
import defpackage.v6o0;
import defpackage.v921;
import defpackage.w511;
import defpackage.w921;
import defpackage.wx11;
import defpackage.x921;
import defpackage.xlg0;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.y921;
import defpackage.ylg0;
import defpackage.yr31;
import defpackage.zjy0;
import defpackage.zo1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 U2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0003'VWB\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010+\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u0010\u001aJ\u0017\u00106\u001a\u00020\u00162\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00162\u0006\u00108\u001a\u00020\"H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000204H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000204H\u0002¢\u0006\u0004\b=\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010ER\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR#\u0010T\u001a\n P*\u0004\u0018\u00010O0O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Li861;", "Lea21;", "Lcom/ybsdk/screens/upgrade/presentation/edit/b;", "Luns0;", "Ltw51;", "component", "<init>", "(Ltw51;)V", "createViewModel", "()Lcom/ybsdk/screens/upgrade/presentation/edit/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li861;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "onDestroy", "viewState", "render", "(Lea21;)V", "", "positionX", "positionY", "", "canSlideFrom", "(FF)Z", "Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditViewState$StepChange;", "stepChange", "Lw921;", "getHelperForRender", "(Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditViewState$StepChange;)Lw921;", "setupAnimations", "getViewHelperFor", "(Landroid/view/View;)Lw921;", "animateInputs", "(Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditViewState$StepChange;)V", "Lcom/ybsdk/widgets/common/LoadableInput;", "inputView", "proceedInputAccessibility", "(Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditViewState$StepChange;Lcom/ybsdk/widgets/common/LoadableInput;)V", "bindViews", "", "progress", "animateProgressBar", "(I)V", "isButtonBackVisible", "animateButtons", "(Z)V", "calculateRightButtonHalfSize", "()I", "calculateRightButtonFullSize", "Ltw51;", "", "Landroid/animation/Animator;", "animators", "Ljava/util/List;", "Landroid/view/animation/Animation;", "inFromTopAnimation", "Landroid/view/animation/Animation;", "inFromBottomAnimation", "outToBottomAnimation", "outToTopAnimation", "Ls921;", "upgradeComponent$delegate", "Li3y;", "getUpgradeComponent", "()Ls921;", "upgradeComponent", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "Companion", "UpgradeEditScreenParams", "v921", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpgradeEditFragment extends BaseMvvmFragment<i861, ea21, b> implements uns0 {
    public static final long ANIM_FADE_DURATION = 150;
    public static final long ANIM_PROGRESS_DURATION = 200;
    public static final String ANIM_PROGRESS_PROPERTY_NAME = "progress";
    public static final long ANIM_SLIDE_DURATION = 300;
    public static final v921 Companion = new v921();
    private final List<Animator> animators;
    private final tw51 component;

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator;
    private Animation inFromBottomAnimation;
    private Animation inFromTopAnimation;
    private Animation outToBottomAnimation;
    private Animation outToTopAnimation;

    /* renamed from: upgradeComponent$delegate, reason: from kotlin metadata */
    private final i3y upgradeComponent;

    public UpgradeEditFragment(tw51 tw51Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.component = tw51Var;
        this.animators = new ArrayList();
        this.upgradeComponent = kotlin.a.a(new t921(this, 1));
        this.defaultInterpolator = kotlin.a.a(new t921(this, 2));
    }

    private final void animateButtons(boolean isButtonBackVisible) {
        safePost(new zo1(this, isButtonBackVisible, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 animateButtons$lambda$27(final UpgradeEditFragment upgradeEditFragment, boolean z) {
        final i861 i861Var = (i861) upgradeEditFragment.getBinding();
        if (z) {
            final ValueAnimator e = AnimUtils.e(i861Var.c, upgradeEditFragment.calculateRightButtonHalfSize());
            e.setDuration(300L);
            e.setInterpolator(upgradeEditFragment.getDefaultInterpolator());
            e.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment$animateButtons$lambda$27$lambda$26$lambda$22$$inlined$doOnStart$1
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
                    Interpolator defaultInterpolator;
                    List list;
                    ViewPropertyAnimator duration = AnimUtils.g(i861.this.b).setDuration(150L);
                    defaultInterpolator = upgradeEditFragment.getDefaultInterpolator();
                    duration.setInterpolator(defaultInterpolator).start();
                    list = upgradeEditFragment.animators;
                    list.add(e);
                }
            });
            upgradeEditFragment.animators.add(e);
            e.start();
        } else {
            final ValueAnimator e2 = AnimUtils.e(i861Var.c, upgradeEditFragment.calculateRightButtonFullSize());
            e2.setDuration(300L);
            e2.setInterpolator(upgradeEditFragment.getDefaultInterpolator());
            e2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment$animateButtons$lambda$27$lambda$26$lambda$25$$inlined$doOnStart$1
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
                    Interpolator defaultInterpolator;
                    List list;
                    YbButtonView ybButtonView = i861.this.b;
                    ViewPropertyAnimator duration = AnimUtils.h(ybButtonView, upgradeEditFragment, new ce0(ybButtonView, 2)).setDuration(150L);
                    defaultInterpolator = upgradeEditFragment.getDefaultInterpolator();
                    duration.setInterpolator(defaultInterpolator).start();
                    list = upgradeEditFragment.animators;
                    list.add(e2);
                }
            });
            upgradeEditFragment.animators.add(e2);
            e2.start();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void animateInputs(UpgradeEditViewState$StepChange stepChange) {
        i861 i861Var = (i861) getBinding();
        int i = x921.a[stepChange.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ViewSwitcher viewSwitcher = i861Var.d;
                Animation animation = this.inFromBottomAnimation;
                if (animation == null) {
                    animation = null;
                }
                viewSwitcher.setInAnimation(animation);
                Animation animation2 = this.outToTopAnimation;
                viewSwitcher.setOutAnimation(animation2 != null ? animation2 : null);
                viewSwitcher.showNext();
                return;
            }
            if (i != 3) {
                w511.b();
                return;
            }
            ViewSwitcher viewSwitcher2 = i861Var.d;
            Animation animation3 = this.inFromTopAnimation;
            if (animation3 == null) {
                animation3 = null;
            }
            viewSwitcher2.setInAnimation(animation3);
            Animation animation4 = this.outToBottomAnimation;
            viewSwitcher2.setOutAnimation(animation4 != null ? animation4 : null);
            viewSwitcher2.showPrevious();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void animateProgressBar(int progress) {
        i861 i861Var = (i861) getBinding();
        if (i861Var.e.getProgress() != progress) {
            SeekBar seekBar = i861Var.e;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(seekBar, "progress", seekBar.getProgress(), progress);
            ofInt.setDuration(200L);
            ofInt.setInterpolator(getDefaultInterpolator());
            this.animators.add(ofInt);
            ofInt.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindViews() {
        i861 i861Var = (i861) getBinding();
        getViewHelperFor(((i861) getBinding()).d.getCurrentView());
        getViewHelperFor(((i861) getBinding()).d.getNextView());
        final int i = 0;
        i861Var.b.setOnClickListener(new View.OnClickListener(this) { // from class: u921
            public final /* synthetic */ UpgradeEditFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                UpgradeEditFragment upgradeEditFragment = this.b;
                switch (i2) {
                    case 0:
                        UpgradeEditFragment.bindViews$lambda$17$lambda$13(upgradeEditFragment, view);
                        break;
                    default:
                        UpgradeEditFragment.bindViews$lambda$17$lambda$14(upgradeEditFragment, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        i861Var.c.setOnClickListener(new View.OnClickListener(this) { // from class: u921
            public final /* synthetic */ UpgradeEditFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                UpgradeEditFragment upgradeEditFragment = this.b;
                switch (i22) {
                    case 0:
                        UpgradeEditFragment.bindViews$lambda$17$lambda$13(upgradeEditFragment, view);
                        break;
                    default:
                        UpgradeEditFragment.bindViews$lambda$17$lambda$14(upgradeEditFragment, view);
                        break;
                }
            }
        });
        ((i861) getBinding()).g.setOnCloseButtonClickListener(new t921(this, i));
        eja1.s(this).c(new UpgradeEditFragment$bindViews$1$4(i861Var, this, null));
        LoadableInput c = getViewHelperFor(((i861) getBinding()).d.getCurrentView()).c();
        c.post(new bh11(10, c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViews$lambda$17$lambda$13(UpgradeEditFragment upgradeEditFragment, View view) {
        upgradeEditFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViews$lambda$17$lambda$14(UpgradeEditFragment upgradeEditFragment, View view) {
        upgradeEditFragment.getViewModel().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindViews$lambda$17$lambda$15(UpgradeEditFragment upgradeEditFragment) {
        upgradeEditFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int calculateRightButtonFullSize() {
        int width = ((i861) getBinding()).o().getWidth() - (((i861) getBinding()).o().getPaddingEnd() + ((i861) getBinding()).o().getPaddingStart());
        int a = y921.a(((i861) getBinding()).c);
        ViewGroup.LayoutParams layoutParams = ((i861) getBinding()).c.getLayoutParams();
        return width - (a + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int calculateRightButtonHalfSize() {
        int width = ((i861) getBinding()).o().getWidth() - (((i861) getBinding()).o().getPaddingEnd() + ((i861) getBinding()).o().getPaddingStart());
        ViewGroup.LayoutParams layoutParams = ((i861) getBinding()).b.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = ((i861) getBinding()).b.getLayoutParams();
        int marginEnd = width - (marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0));
        ViewGroup.LayoutParams layoutParams3 = ((i861) getBinding()).c.getLayoutParams();
        int marginStart2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams4 = ((i861) getBinding()).c.getLayoutParams();
        return (marginEnd - (marginStart2 + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0))) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$1(UpgradeEditFragment upgradeEditFragment) {
        return AnimationUtils.loadInterpolator(upgradeEditFragment.requireContext(), ylg0.ybsdk_default_interpolator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final w921 getHelperForRender(UpgradeEditViewState$StepChange stepChange) {
        View currentView;
        int i = x921.a[stepChange.ordinal()];
        if (i == 1) {
            currentView = ((i861) getBinding()).d.getCurrentView();
        } else {
            if (i != 2 && i != 3) {
                w511.b();
                return null;
            }
            currentView = ((i861) getBinding()).d.getNextView();
        }
        return getViewHelperFor(currentView);
    }

    private final s921 getUpgradeComponent() {
        return (s921) this.upgradeComponent.getValue();
    }

    private final w921 getViewHelperFor(View view) {
        if (view.getTag() == null) {
            ub21 ub21Var = ub21.a;
            synchronized (y5e.a) {
                try {
                    if (y5e.b == null) {
                        y5e.b = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qa3 qa3Var = new qa3(new lb7(9, y5e.b, ub21Var), i470.b(new UpgradeEditFragment$getViewHelperFor$adapter$1(getViewModel())));
            LoadableInput loadableInput = (LoadableInput) view.findViewById(jah0.input);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(jah0.suggests);
            recyclerView.setAdapter(qa3Var);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            view.setTag(new w921(loadableInput, recyclerView, qa3Var));
        }
        return (w921) view.getTag();
    }

    private final void proceedInputAccessibility(UpgradeEditViewState$StepChange stepChange, LoadableInput inputView) {
        int i = x921.a[stepChange.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                inputView.requestFocus();
            } else {
                w511.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$3(Animator animator) {
        return !animator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$4(tls tlsVar, Object obj) {
        return ((Boolean) tlsVar.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$9$lambda$5(ea21 ea21Var, YbButtonView.a aVar) {
        return new YbButtonView.a(ea21Var.b(), null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$9$lambda$6(g gVar) {
        return g.a(gVar, "", null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554430);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$9$lambda$7(ea21 ea21Var, i861 i861Var, UpgradeEditFragment upgradeEditFragment, g gVar) {
        String f = ea21Var.f();
        hfb1 g = ea21Var.g();
        LoadableInput.LoadingState i = ea21Var.i();
        Text h = ea21Var.h();
        Text k = ea21Var.k();
        Text e = ea21Var.e();
        return new g(f, g, i, h, k, rtu.a(new UpgradeEditFragment$render$2$3$1(upgradeEditFragment.getViewModel()), com.ybsdk.core.utils.text.d.a(i861Var.o().getContext(), e).toString()), ea21Var.d(), ea21Var.c(), null, null, false, null, null, 33553920);
    }

    private final void setupAnimations() {
        this.inFromTopAnimation = AnimationUtils.loadAnimation(getContext(), xlg0.ybsdk_fade_in_slide_in_top_full);
        this.inFromBottomAnimation = AnimationUtils.loadAnimation(getContext(), xlg0.ybsdk_fade_in_slide_in_bottom_full);
        this.outToBottomAnimation = AnimationUtils.loadAnimation(getContext(), xlg0.ybsdk_fade_out_slide_out_bottom_full);
        this.outToTopAnimation = AnimationUtils.loadAnimation(getContext(), xlg0.ybsdk_fade_out_slide_out_top_full);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s921 upgradeComponent_delegate$lambda$0(UpgradeEditFragment upgradeEditFragment) {
        return ((h9g) upgradeEditFragment.component).k().a(upgradeEditFragment.component);
    }

    @Override // defpackage.uns0
    public boolean canSlideFrom(float positionX, float positionY) {
        return !com.ybsdk.core.utils.ext.view.b.f(requireView().findViewById(jah0.suggests));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((d) ((b9g) getUpgradeComponent()).a()).a((UpgradeEditScreenParams) dcs.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ((h9g) this.component).k().b();
        super.onDestroy();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        for (Animator animator : this.animators) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.animators.clear();
        super.onDestroyView();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViews();
        setupAnimations();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ea21 viewState) {
        this.animators.removeIf(new v6o0(5, new of11(22)));
        i861 i861Var = (i861) getBinding();
        animateProgressBar(viewState.l());
        animateButtons(viewState.a());
        i861Var.f.setText(com.ybsdk.core.utils.text.d.a(i861Var.o().getContext(), viewState.n()));
        i861Var.f.setContentDescription(com.ybsdk.core.utils.text.d.a(i861Var.o().getContext(), viewState.m()));
        i861Var.c.render(new wx11(7, viewState));
        w921 helperForRender = getHelperForRender(viewState.p());
        LoadableInput c = helperForRender.c();
        boolean r = viewState.r();
        EmptyList emptyList = EmptyList.a;
        ?? r9 = 0;
        if (!r) {
            c.removeTextChangedListener(helperForRender.b());
            helperForRender.g(null);
            helperForRender.f(emptyList);
        } else if (!jl40.l(helperForRender.a(), viewState.j())) {
            helperForRender.f(viewState.j());
            c.removeTextChangedListener(helperForRender.b());
            LoadableInput.render$default(c, false, new of11(23), 1, null);
            helperForRender.g(new FormatTextWatcher(l76.k(6, false, viewState.j()), c.getEditText(), null, false, null, 28, null));
        }
        LoadableInput.render$default(c, false, new zjy0(15, viewState, i861Var, this), 1, null);
        qa3 d = helperForRender.d();
        List q = viewState.q();
        if (!viewState.o()) {
            q = null;
        }
        if (q != null) {
            List list = q;
            r9 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r9.add(new tb21((String) it.next()));
            }
        }
        if (r9 != 0) {
            emptyList = r9;
        }
        d.g(emptyList);
        helperForRender.e().setVisibility(helperForRender.d().f().isEmpty() ? 8 : 0);
        animateInputs(viewState.p());
        proceedInputAccessibility(viewState.p(), c);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditFragment$UpgradeEditScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;", "field", "<init>", "(Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;", "copy", "(Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;)Lcom/ybsdk/screens/upgrade/presentation/edit/UpgradeEditFragment$UpgradeEditScreenParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/screens/upgrade/domain/entities/SimpleIdFormFieldEntity;", "getField", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class UpgradeEditScreenParams implements ScreenParams {
        public static final Parcelable.Creator<UpgradeEditScreenParams> CREATOR = new Creator();
        private final SimpleIdFormFieldEntity field;

        public UpgradeEditScreenParams(SimpleIdFormFieldEntity simpleIdFormFieldEntity) {
            this.field = simpleIdFormFieldEntity;
        }

        public static /* synthetic */ UpgradeEditScreenParams copy$default(UpgradeEditScreenParams upgradeEditScreenParams, SimpleIdFormFieldEntity simpleIdFormFieldEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                simpleIdFormFieldEntity = upgradeEditScreenParams.field;
            }
            return upgradeEditScreenParams.copy(simpleIdFormFieldEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final SimpleIdFormFieldEntity getField() {
            return this.field;
        }

        public final UpgradeEditScreenParams copy(SimpleIdFormFieldEntity field) {
            return new UpgradeEditScreenParams(field);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpgradeEditScreenParams) && this.field == ((UpgradeEditScreenParams) other).field;
        }

        public final SimpleIdFormFieldEntity getField() {
            return this.field;
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        public String toString() {
            return "UpgradeEditScreenParams(field=" + this.field + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.field.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UpgradeEditScreenParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpgradeEditScreenParams createFromParcel(Parcel parcel) {
                return new UpgradeEditScreenParams(SimpleIdFormFieldEntity.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpgradeEditScreenParams[] newArray(int i) {
                return new UpgradeEditScreenParams[i];
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public i861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return i861.p(inflater, container);
    }
}
