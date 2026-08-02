package com.yandex.go.taxi.order.queue.presentation;

import android.content.Context;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.queue.analytics.QueueAnalytics$Action;
import defpackage.a3y0;
import defpackage.alg0;
import defpackage.cma1;
import defpackage.gpg0;
import defpackage.hkg0;
import defpackage.ikg0;
import defpackage.ip11;
import defpackage.iwh0;
import defpackage.jkg0;
import defpackage.kkg0;
import defpackage.ljg0;
import defpackage.m810;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.njg0;
import defpackage.ny61;
import defpackage.ojg0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pjg0;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.qjg0;
import defpackage.skg0;
import defpackage.tje;
import defpackage.tkg0;
import defpackage.ukg0;
import defpackage.vkg0;
import defpackage.w511;
import defpackage.wkg0;
import defpackage.xkg0;
import defpackage.xmf0;
import defpackage.xng0;
import defpackage.ykg0;
import defpackage.zkg0;
import defpackage.zkh0;
import defpackage.zmh;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001-B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u000e*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u000e*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u000e*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000eH\u0014¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u000eH\u0014¢\u0006\u0004\b)\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,¨\u0006."}, d2 = {"Lcom/yandex/go/taxi/order/queue/presentation/QueueView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lalg0;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lip11;Lalg0;Lpav;)V", "Lkkg0;", ClidProvider.STATE, "Lzy11;", "updateState", "(Lkkg0;)V", "renderEmptyState", "()V", "Likg0;", "renderContentState", "(Likg0;)V", "Lzkg0;", "content", "renderContent", "(Lzkg0;Likg0;)V", "Lxkg0;", "button", "renderButton", "(Lzkg0;Lxkg0;)V", "Lqjg0;", "renderCenterContent", "(Lzkg0;Lqjg0;)V", "", "getCurrentAnimationProgress", "()F", "Landroid/transition/Transition;", "newStateTransition", "()Landroid/transition/Transition;", "clearStateTransition", "onAttachedToWindow", "onDetachedFromWindow", "Lip11;", "Lalg0;", "Lpav;", "ykg0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QueueView extends GoFrameLayout {
    public static final int $stable = 8;
    private final pav imageLoader;
    private final alg0 presenter;
    private final ip11 typefaceDelegate;

    public QueueView(Context context, ip11 ip11Var, alg0 alg0Var, pav pavVar) {
        super(context, null, 0, 0, 14, null);
        this.typefaceDelegate = ip11Var;
        this.presenter = alg0Var;
        this.imageLoader = pavVar;
        setBackgroundResource(gpg0.queue_background);
    }

    private final Transition clearStateTransition() {
        return new Fade(2);
    }

    private final float getCurrentAnimationProgress() {
        View findViewById = findViewById(p8h0.center_content);
        if (findViewById instanceof LottieAnimationView) {
            return ((LottieAnimationView) findViewById).getProgress();
        }
        return 0.0f;
    }

    private final Transition newStateTransition() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(1);
        transitionSet.addTransition(new Fade(2));
        transitionSet.addTransition(new Fade(1));
        return transitionSet;
    }

    private final void renderButton(zkg0 zkg0Var, xkg0 xkg0Var) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setButtonBackground(xkg0Var.a);
        buttonComponent.setButtonTitleColor(qje.t(xng0.textInvert, buttonComponent.getContext()));
        buttonComponent.setText(xkg0Var.b);
        if (xkg0Var.e) {
            buttonComponent.setDebounceClickListener(new xmf0(3, this, xkg0Var));
        } else {
            buttonComponent.setDisabledButtonBackground(xkg0Var.a);
            buttonComponent.setEnabled(false);
        }
        if (xkg0Var.d) {
            buttonComponent.startProgress();
        }
        buttonComponent.setAlpha(xkg0Var.f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = tje.r(mrg0.go_design_s_space, getContext());
        zkg0Var.b.addView(buttonComponent, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButton$lambda$0$0(QueueView queueView, xkg0 xkg0Var) {
        alg0 alg0Var = queueView.presenter;
        wkg0 wkg0Var = xkg0Var.c;
        ljg0 ljg0Var = alg0Var.y;
        int i = 3;
        if (wkg0Var instanceof ukg0) {
            tkg0 tkg0Var = alg0Var.C;
            if (tkg0Var != null) {
                ljg0Var.a(QueueAnalytics$Action.PRIMARY, tkg0Var.a());
                alg0Var.Kg(tkg0Var.c());
            }
        } else if (wkg0Var instanceof vkg0) {
            tkg0 tkg0Var2 = alg0Var.C;
            if (tkg0Var2 != null) {
                ljg0Var.a(QueueAnalytics$Action.SECONDARY, tkg0Var2.a());
                alg0Var.Kg(tkg0Var2.d());
            }
        } else {
            a3y0.e((a3y0) alg0Var.A.getValue(), new String[0], null, new hkg0(i), 2);
        }
        tkg0 tkg0Var3 = alg0Var.C;
        if (tkg0Var3 != null) {
            if (!(tkg0Var3 instanceof skg0)) {
                tkg0Var3 = null;
            }
            if (tkg0Var3 != null) {
                pzt0 pzt0Var = alg0Var.D;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                alg0Var.D = tje.N(alg0Var.Jg(), null, null, new QueueViewPresenter$updatePrice$1(alg0Var, tkg0Var3, null), 3);
            }
        }
    }

    private final void renderCenterContent(zkg0 zkg0Var, qjg0 qjg0Var) {
        Pair pair;
        int b = m810.b(tje.w(80, getContext()));
        if (qjg0Var instanceof njg0) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
            lottieAnimationView.setAnimation(iwh0.queue_animation);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.playAnimation();
            lottieAnimationView.setProgress(getCurrentAnimationProgress());
            pair = new Pair(lottieAnimationView, new FrameLayout.LayoutParams(-1, b));
        } else if (qjg0Var instanceof pjg0) {
            pair = new Pair(new CircularProgressBar(getContext(), null, 0, 6, null), new FrameLayout.LayoutParams(b, b));
        } else {
            if (!(qjg0Var instanceof ojg0)) {
                w511.b();
                return;
            }
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            String str = ((ojg0) qjg0Var).a;
            if (str != null) {
                ((nac) this.imageLoader.a(appCompatImageView)).c(str);
            }
            pair = new Pair(appCompatImageView, new FrameLayout.LayoutParams(b, b));
        }
        View view = (View) pair.getFirst();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pair.getSecond();
        ViewStub viewStub = zkg0Var.d;
        viewStub.setLayoutParams(layoutParams);
        c.w(viewStub, view);
    }

    private final void renderContent(zkg0 zkg0Var, ikg0 ikg0Var) {
        RobotoTextView robotoTextView = zkg0Var.f;
        robotoTextView.setText(ikg0Var.a);
        ip11 ip11Var = this.typefaceDelegate;
        robotoTextView.getContext();
        robotoTextView.setTypeface(((zmh) ip11Var).d());
        zkg0Var.e.setText(ikg0Var.b);
        zkg0Var.c.setText(ikg0Var.e);
        zkg0Var.b.removeAllViews();
        Iterator it = ikg0Var.c.iterator();
        while (it.hasNext()) {
            renderButton(zkg0Var, (xkg0) it.next());
        }
        renderCenterContent(zkg0Var, ikg0Var.d);
    }

    private final void renderContentState(ikg0 state) {
        View inflate = LayoutInflater.from(getContext()).inflate(zkh0.queue_view, (ViewGroup) null, false);
        int i = p8h0.buttons;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = p8h0.caption;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = p8h0.center_content;
                ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
                if (viewStub != null) {
                    i = p8h0.subtitle;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        i = p8h0.title;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView3 != null) {
                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) inflate;
                            renderContent(new zkg0(goLinearLayout2, goLinearLayout, robotoTextView, viewStub, robotoTextView2, robotoTextView3), state);
                            TransitionManager.beginDelayedTransition(this, newStateTransition());
                            removeAllViews();
                            addView(goLinearLayout2);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    private final void renderEmptyState() {
        TransitionManager.beginDelayedTransition(this, clearStateTransition());
        removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(kkg0 state) {
        if (state instanceof ikg0) {
            renderContentState((ikg0) state);
        } else if (state instanceof jkg0) {
            renderEmptyState();
        } else {
            w511.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        alg0 alg0Var = this.presenter;
        alg0Var.Bg(new ykg0(this));
        alg0Var.y.b("QueueOverlay.Shown", new Pair[0]);
        tje.N(alg0Var.Jg(), null, null, new QueueViewPresenter$attachView$$inlined$safeCollectIn$1(e.X(alg0Var.z.a(alg0Var.x), new QueueViewPresenter$attachView$$inlined$flatMapLatest$1(null, alg0Var)), null, alg0Var), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
