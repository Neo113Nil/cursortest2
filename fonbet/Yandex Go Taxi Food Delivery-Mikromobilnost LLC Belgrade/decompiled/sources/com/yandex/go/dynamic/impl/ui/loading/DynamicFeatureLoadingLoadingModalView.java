package com.yandex.go.dynamic.impl.ui.loading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.dynamic.impl.b;
import defpackage.bxl;
import defpackage.cma1;
import defpackage.e8n;
import defpackage.f8n;
import defpackage.fth0;
import defpackage.g8n;
import defpackage.hih0;
import defpackage.ho4;
import defpackage.l7n;
import defpackage.n7n;
import defpackage.ny61;
import defpackage.o7n;
import defpackage.r7n;
import defpackage.s7n;
import defpackage.tje;
import defpackage.uhm;
import defpackage.urm;
import defpackage.y130;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/dynamic/impl/ui/loading/DynamicFeatureLoadingLoadingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ls7n;", "Ln7n;", "Landroid/content/Context;", "context", "Lo7n;", "presenter", "<init>", "(Landroid/content/Context;Lo7n;)V", "Lg8n;", "uiState", "Lzy11;", "render", "(Lg8n;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ls7n;", "Ly130;", "insetsType", "()Ly130;", "Lo7n;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicFeatureLoadingLoadingModalView extends SlideableBindingModalView<s7n> implements n7n {
    private final o7n presenter;

    public DynamicFeatureLoadingLoadingModalView(Context context, o7n o7nVar) {
        super(context);
        this.presenter = o7nVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(DynamicFeatureLoadingLoadingModalView dynamicFeatureLoadingLoadingModalView) {
        return dynamicFeatureLoadingLoadingModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$back(o7n o7nVar) {
        ((r7n) o7nVar.y.a).r(new urm(19));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public s7n bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        int i = 0;
        View inflate = inflater.inflate(fth0.dynamic_feature_modal_view, parent, false);
        int i2 = hih0.dynamic_feature_error;
        View O = cma1.O(i2, inflate);
        if (O != null) {
            int i3 = hih0.action_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i3, O);
            if (buttonComponent != null) {
                i3 = hih0.error_icon;
                if (((AppCompatImageView) cma1.O(i3, O)) != null) {
                    i3 = hih0.title;
                    TextView textView = (TextView) cma1.O(i3, O);
                    if (textView != null) {
                        ho4 ho4Var = new ho4((ConstraintLayout) O, buttonComponent, textView, 4);
                        int i4 = hih0.dynamic_feature_loading;
                        View O2 = cma1.O(i4, inflate);
                        if (O2 != null) {
                            int i5 = hih0.progress_bar;
                            if (((CircularProgressBar) cma1.O(i5, O2)) != null) {
                                i5 = hih0.title;
                                if (((TextView) cma1.O(i5, O2)) != null) {
                                    return new s7n((FrameLayout) inflate, ho4Var, new l7n((ConstraintLayout) O2, i));
                                }
                            }
                            ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i5)));
                            return null;
                        }
                        i2 = i4;
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new bxl(20, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o7n o7nVar = this.presenter;
        o7nVar.Bg(this);
        tje.N(o7nVar.Jg(), null, null, new DynamicFeatureLoadingPresenter$attachView$1(o7nVar, null), 3);
        tje.N(o7nVar.Jg(), null, null, new DynamicFeatureLoadingPresenter$attachView$$inlined$collectIn$1(((b) o7nVar.z).j(o7nVar.x), null, o7nVar, this), 3);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        ((ButtonComponent) getBinding().b.b).setOnClickListener(new uhm(7, this.presenter));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.eyi0
    public void render(g8n uiState) {
        boolean z = uiState instanceof e8n;
        ((ConstraintLayout) getBinding().b.c).setVisibility(z ? 0 : 8);
        getBinding().c.b.setVisibility(uiState instanceof f8n ? 0 : 8);
        if (z) {
            e8n e8nVar = (e8n) uiState;
            ((TextView) getBinding().b.d).setText(e8nVar.a);
            ((ButtonComponent) getBinding().b.b).setText(e8nVar.b);
        }
    }
}
