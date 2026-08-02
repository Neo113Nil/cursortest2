package com.yandex.go.safety.center.car.crash.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.safety.center.car.crash.status.SafetyCenterCarCrashStatusAnswerView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.eql0;
import defpackage.fql0;
import defpackage.g18;
import defpackage.gql0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ndl0;
import defpackage.pav;
import defpackage.ppl0;
import defpackage.qdb1;
import defpackage.tje;
import defpackage.tse0;
import defpackage.wpl0;
import defpackage.yiz0;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/go/safety/center/car/crash/status/SafetyCenterCarCrashStatusAnswerView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwpl0;", "Lfql0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/car/crash/status/a;", "presenter", "Lyiz0;", "styleDelegate", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/car/crash/status/a;Lyiz0;Lpav;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwpl0;", "progressNoCrash", "Leql0;", "model", "showModalContent", "(Leql0;)V", "progressAcceptCrash", "finishProgress", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lcom/yandex/go/safety/center/car/crash/status/a;", "Lyiz0;", "Lpav;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "bottomButton", "Lru/yandex/taxi/design/ButtonComponent;", "topButton", "Lg18;", "imageCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterCarCrashStatusAnswerView extends SlideableBindingModalView<wpl0> implements fql0 {
    private final ButtonComponent bottomButton;
    private final ListTextComponent description;
    private g18 imageCancellable;
    private final pav imageLoader;
    private final a presenter;
    private final yiz0 styleDelegate;
    private final ListTitleComponent title;
    private final ButtonComponent topButton;

    public SafetyCenterCarCrashStatusAnswerView(Context context, a aVar, yiz0 yiz0Var, pav pavVar) {
        super(context);
        this.presenter = aVar;
        this.styleDelegate = yiz0Var;
        this.imageLoader = pavVar;
        this.title = getBinding().e;
        this.description = getBinding().d;
        this.bottomButton = getBinding().c;
        this.topButton = getBinding().f;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.c(this, new gql0(aVar, 2));
        ViewGroup bottomSheet = getBottomSheet();
        float r = tje.r(mrg0.go_design_s_space, getContext());
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.m(bottomSheet, r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SafetyCenterCarCrashStatusAnswerView safetyCenterCarCrashStatusAnswerView) {
        a aVar = safetyCenterCarCrashStatusAnswerView.presenter;
        aVar.F = false;
        ((fql0) aVar.Dg()).progressAcceptCrash();
        tje.N(aVar.Jg(), null, null, new SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1(aVar, new gql0(aVar, 0), true, new gql0(aVar, 1), null), 3);
        ppl0 ppl0Var = aVar.A.a;
        ppl0Var.a.a("SafetyCenter.CarCrash.AccidentHappenedTapped", tse0.o(ppl0Var), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(SafetyCenterCarCrashStatusAnswerView safetyCenterCarCrashStatusAnswerView) {
        a aVar = safetyCenterCarCrashStatusAnswerView.presenter;
        aVar.F = false;
        ((fql0) aVar.Dg()).progressNoCrash();
        final ndl0 ndl0Var = aVar.z;
        final int i = 0;
        final int i2 = 1;
        tje.N(aVar.Jg(), null, null, new SafetyCenterCarCrashStatusAnswerPresenter$setAccidentStatus$1(aVar, new Runnable() { // from class: hql0
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                ndl0 ndl0Var2 = ndl0Var;
                switch (i3) {
                    case 0:
                        ((qql0) ndl0Var2.b).r(new qu(9));
                        break;
                    default:
                        ((qql0) ndl0Var2.b).r(new qu(9));
                        break;
                }
            }
        }, false, new Runnable() { // from class: hql0
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ndl0 ndl0Var2 = ndl0Var;
                switch (i3) {
                    case 0:
                        ((qql0) ndl0Var2.b).r(new qu(9));
                        break;
                    default:
                        ((qql0) ndl0Var2.b).r(new qu(9));
                        break;
                }
            }
        }, null), 3);
        ppl0 ppl0Var = aVar.A.a;
        ppl0Var.a.a("SafetyCenter.CarCrash.NoAccidentTapped", tse0.o(ppl0Var), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return getContent().getVisibility() != 4 ? super.getBackgroundColor() : mqg0.transparent;
    }

    @Override // defpackage.fql0
    public void finishProgress() {
        this.topButton.finishProgress();
        this.bottomButton.finishProgress();
        this.topButton.setEnabled(true);
        this.bottomButton.setEnabled(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.title.setTitleTypeface(this.styleDelegate.a(getContext()));
        ListTitleComponent listTitleComponent = this.title;
        this.styleDelegate.getClass();
        listTitleComponent.setTitleTextSizePx((int) tje.b0(getContext(), 24.0f));
        TextView title = this.title.title();
        this.styleDelegate.getClass();
        title.setLineHeight((int) tje.b0(getContext(), 27.0f));
        this.description.setTextPaddings(tje.u(16, getContext()), 0, tje.u(16, getContext()), tje.u(16, getContext()));
        final int i = 0;
        this.topButton.setDebounceClickListener(new Runnable(this) { // from class: kql0
            public final /* synthetic */ SafetyCenterCarCrashStatusAnswerView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                SafetyCenterCarCrashStatusAnswerView safetyCenterCarCrashStatusAnswerView = this.b;
                switch (i2) {
                    case 0:
                        SafetyCenterCarCrashStatusAnswerView.onAttachedToWindow$lambda$0(safetyCenterCarCrashStatusAnswerView);
                        break;
                    default:
                        SafetyCenterCarCrashStatusAnswerView.onAttachedToWindow$lambda$1(safetyCenterCarCrashStatusAnswerView);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.bottomButton.setDebounceClickListener(new Runnable(this) { // from class: kql0
            public final /* synthetic */ SafetyCenterCarCrashStatusAnswerView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                SafetyCenterCarCrashStatusAnswerView safetyCenterCarCrashStatusAnswerView = this.b;
                switch (i22) {
                    case 0:
                        SafetyCenterCarCrashStatusAnswerView.onAttachedToWindow$lambda$0(safetyCenterCarCrashStatusAnswerView);
                        break;
                    default:
                        SafetyCenterCarCrashStatusAnswerView.onAttachedToWindow$lambda$1(safetyCenterCarCrashStatusAnswerView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.imageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.fql0
    public void progressAcceptCrash() {
        this.topButton.startProgress();
        this.topButton.setEnabled(false);
        this.bottomButton.setEnabled(false);
    }

    @Override // defpackage.fql0
    public void progressNoCrash() {
        this.bottomButton.startProgress();
        this.bottomButton.setEnabled(false);
        this.topButton.setEnabled(false);
    }

    @Override // defpackage.fql0
    public void showModalContent(eql0 model) {
        this.title.setTitle(model.a);
        this.description.setText(model.b);
        this.topButton.setText(model.c);
        this.bottomButton.setText(model.d);
        String str = model.e;
        if (str != null) {
            g18 g18Var = this.imageCancellable;
            if (g18Var != null) {
                g18Var.cancel();
            }
            this.imageCancellable = ((nac) this.imageLoader.a(getBinding().b)).c(str);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wpl0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return wpl0.o(inflater, parent);
    }
}
