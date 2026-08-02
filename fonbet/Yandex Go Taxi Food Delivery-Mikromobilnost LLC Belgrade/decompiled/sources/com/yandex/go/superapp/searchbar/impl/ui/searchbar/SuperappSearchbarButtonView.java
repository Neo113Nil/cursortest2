package com.yandex.go.superapp.searchbar.impl.ui.searchbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.aew0;
import defpackage.bew0;
import defpackage.cew0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.e8h0;
import defpackage.gew0;
import defpackage.hbp0;
import defpackage.hew0;
import defpackage.iew0;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.msb1;
import defpackage.n7l0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.o2y;
import defpackage.okh0;
import defpackage.pav;
import defpackage.qbv;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010'\u001a\u00020&*\u00020$2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0014¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u000eH\u0014¢\u0006\u0004\b*\u0010\u001cJG\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0+¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarButtonView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lhew0;", "animation", "Lytz;", "lottieLoader", "Lkotlin/Function1;", "Lgew0;", "Lzy11;", "onLottieAnimationEnd", "bindLottieAnimation", "(Lhew0;Lytz;Ltls;)V", "Lcew0;", "icon", "Lpav;", "imageLoader", "bindIcon", "(Lcew0;Lpav;)V", "Lbew0;", "bindStaticIcon", "(Lbew0;Lpav;)V", "resetLottieAnimation", "()V", "Laew0;", "bindRotatableIcon", "(Laew0;Lpav;)V", "", "rotationDegrees", "updateRotation", "(Ljava/lang/Float;)V", "Liew0;", ClidProvider.STATE, "", "hasSameStateExceptRotation", "(Liew0;Liew0;)Z", "onAttachedToWindow", "onDetachedFromWindow", "Lkotlin/Function0;", "onClick", "bind", "(Liew0;Lpav;Lytz;Ltls;Lsls;)V", "Lo2y;", "binding", "Lo2y;", "Lhbp0;", "viewScope", "Lhbp0;", "Ll8x;", "lottieJob", "Ll8x;", "lastRotationDegrees", "Ljava/lang/Float;", "renderedState", "Liew0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSearchbarButtonView extends GoFrameLayout {
    private final o2y binding;
    private Float lastRotationDegrees;
    private l8x lottieJob;
    private iew0 renderedState;
    private final hbp0 viewScope;

    public SuperappSearchbarButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        LayoutInflater.from(context).inflate(okh0.layout_superapp_searchbar_button, this);
        int i = e8h0.searchbar_button_image;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = e8h0.searchbar_button_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, this);
            if (lottieAnimationView != null) {
                i = e8h0.searchbar_button_rotatable_image;
                GoImageView goImageView2 = (GoImageView) cma1.O(i, this);
                if (goImageView2 != null) {
                    this.binding = new o2y(this, goImageView, lottieAnimationView, goImageView2);
                    this.viewScope = new hbp0(new czo0(14), "SuperappSearchbarButtonView", null);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bind$lambda$0(sls slsVar) {
        slsVar.invoke();
        return zy11.a;
    }

    private final void bindIcon(cew0 icon, pav imageLoader) {
        if (icon instanceof bew0) {
            bindStaticIcon((bew0) icon, imageLoader);
        } else if (icon instanceof aew0) {
            bindRotatableIcon((aew0) icon, imageLoader);
        } else {
            w511.b();
        }
    }

    private final void bindLottieAnimation(hew0 animation, ytz lottieLoader, tls onLottieAnimationEnd) {
        if (animation == null || animation.equals(msb1.V)) {
            return;
        }
        if (!(animation instanceof gew0)) {
            w511.b();
        } else {
            this.lottieJob = tje.N(this.viewScope.c(), null, null, new SuperappSearchbarButtonView$bindLottieAnimation$1(lottieLoader, (gew0) animation, this, onLottieAnimationEnd, null), 3);
        }
    }

    private final void bindRotatableIcon(aew0 icon, pav imageLoader) {
        ((nac) imageLoader.a(this.binding.b)).b(new qbv(icon.a));
        this.binding.b.setVisibility(0);
        ((nac) imageLoader.a(this.binding.d)).b(new qbv(icon.b));
        this.binding.d.setVisibility(0);
        updateRotation(icon.c);
    }

    private final void bindStaticIcon(bew0 icon, pav imageLoader) {
        ((nac) imageLoader.a(this.binding.b)).b(new qbv(icon.a));
        this.binding.b.setVisibility(0);
        this.binding.d.setVisibility(8);
        this.binding.d.setRotation(0.0f);
        this.lastRotationDegrees = null;
    }

    private final boolean hasSameStateExceptRotation(iew0 iew0Var, iew0 iew0Var2) {
        cew0 cew0Var = iew0Var2.d;
        aew0 aew0Var = cew0Var instanceof aew0 ? (aew0) cew0Var : null;
        if (aew0Var == null) {
            return false;
        }
        cew0 cew0Var2 = iew0Var.d;
        aew0 aew0Var2 = cew0Var2 instanceof aew0 ? (aew0) cew0Var2 : null;
        if (aew0Var2 == null) {
            return false;
        }
        return iew0Var.equals(new iew0(iew0Var2.a, iew0Var2.b, iew0Var2.c, new aew0(aew0Var.a, aew0Var.b, aew0Var2.c), iew0Var2.e));
    }

    private final void resetLottieAnimation() {
        l8x l8xVar = this.lottieJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.lottieJob = null;
        LottieAnimationView lottieAnimationView = this.binding.c;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRotation(Float rotationDegrees) {
        this.lastRotationDegrees = rotationDegrees;
        if (rotationDegrees == null || this.binding.d.getVisibility() != 0 || jl40.g(this.binding.d.getRotation(), rotationDegrees)) {
            return;
        }
        this.binding.d.setRotation(rotationDegrees.floatValue());
    }

    public final void bind(iew0 state, pav imageLoader, ytz lottieLoader, tls onLottieAnimationEnd, sls onClick) {
        iew0 iew0Var = this.renderedState;
        if (jl40.l(iew0Var, state)) {
            return;
        }
        this.renderedState = state;
        if (iew0Var != null && hasSameStateExceptRotation(iew0Var, state)) {
            updateRotation(((aew0) state.d).c);
            return;
        }
        setContentDescription(state.b);
        c.z(new n7l0(15, onClick), this);
        resetLottieAnimation();
        bindIcon(state.d, imageLoader);
        bindLottieAnimation(state.e, lottieLoader, onLottieAnimationEnd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.viewScope.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.viewScope.b();
        resetLottieAnimation();
        this.renderedState = null;
        this.binding.b.setVisibility(0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperappSearchbarButtonView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SuperappSearchbarButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
