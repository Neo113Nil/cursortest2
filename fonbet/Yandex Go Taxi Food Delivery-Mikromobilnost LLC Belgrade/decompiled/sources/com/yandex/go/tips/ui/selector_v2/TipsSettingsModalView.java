package com.yandex.go.tips.ui.selector_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.go.tips.experiments.TipsSettingsModalExperiment;
import com.yandex.go.tips.ui.TipsView;
import com.yandex.go.tips.ui.selector_v2.TipsSettingsModalView;
import com.yandex.go.tips.ui.selector_v2.a;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.dlh0;
import defpackage.ehz0;
import defpackage.evu0;
import defpackage.fcl0;
import defpackage.ghz0;
import defpackage.hne0;
import defpackage.ihz0;
import defpackage.jfz0;
import defpackage.kux0;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.t8h0;
import defpackage.xng0;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006\""}, d2 = {"Lcom/yandex/go/tips/ui/selector_v2/TipsSettingsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lghz0;", "Lihz0;", "Lcom/yandex/go/tips/ui/selector_v2/a;", "presenter", "Landroid/content/Context;", "context", "<init>", "(Lcom/yandex/go/tips/ui/selector_v2/a;Landroid/content/Context;)V", "Lzy11;", "initView", "()V", "onAttachedToWindow", "", "Ljfz0;", "tips", "updateTips", "(Ljava/util/List;)V", "Lehz0;", ClidProvider.STATE, "updateDoneButton", "(Lehz0;)V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lghz0;", "Lcom/yandex/go/tips/ui/selector_v2/a;", "hhz0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsSettingsModalView extends SlideableBindingModalView<ghz0> implements ihz0 {
    private final a presenter;

    public TipsSettingsModalView(a aVar, Context context) {
        super(context);
        this.presenter = aVar;
        b.q(getBinding().d, true);
    }

    private final void initView() {
        final a aVar = this.presenter;
        final int i = 0;
        setOnBackPressedListener(new Runnable() { // from class: fhz0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                a aVar2 = aVar;
                switch (i2) {
                    case 0:
                        TipsSettingsModalView.initView$onExitWithoutSaving(aVar2);
                        break;
                    case 1:
                        TipsSettingsModalView.initView$onExitWithoutSaving$0(aVar2);
                        break;
                    case 2:
                        TipsSettingsModalView.initView$onExitWithoutSaving$1(aVar2);
                        break;
                    default:
                        TipsSettingsModalView.initView$onExitWithoutSaving$2(aVar2);
                        break;
                }
            }
        });
        final a aVar2 = this.presenter;
        final int i2 = 1;
        setOnTouchOutsideListener(new Runnable() { // from class: fhz0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                a aVar22 = aVar2;
                switch (i22) {
                    case 0:
                        TipsSettingsModalView.initView$onExitWithoutSaving(aVar22);
                        break;
                    case 1:
                        TipsSettingsModalView.initView$onExitWithoutSaving$0(aVar22);
                        break;
                    case 2:
                        TipsSettingsModalView.initView$onExitWithoutSaving$1(aVar22);
                        break;
                    default:
                        TipsSettingsModalView.initView$onExitWithoutSaving$2(aVar22);
                        break;
                }
            }
        });
        final a aVar3 = this.presenter;
        final int i3 = 2;
        setOnSlideOutListener(new Runnable() { // from class: fhz0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                a aVar22 = aVar3;
                switch (i22) {
                    case 0:
                        TipsSettingsModalView.initView$onExitWithoutSaving(aVar22);
                        break;
                    case 1:
                        TipsSettingsModalView.initView$onExitWithoutSaving$0(aVar22);
                        break;
                    case 2:
                        TipsSettingsModalView.initView$onExitWithoutSaving$1(aVar22);
                        break;
                    default:
                        TipsSettingsModalView.initView$onExitWithoutSaving$2(aVar22);
                        break;
                }
            }
        });
        final a aVar4 = this.presenter;
        final int i4 = 3;
        qdb1.c(this, new Runnable() { // from class: fhz0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i4;
                a aVar22 = aVar4;
                switch (i22) {
                    case 0:
                        TipsSettingsModalView.initView$onExitWithoutSaving(aVar22);
                        break;
                    case 1:
                        TipsSettingsModalView.initView$onExitWithoutSaving$0(aVar22);
                        break;
                    case 2:
                        TipsSettingsModalView.initView$onExitWithoutSaving$1(aVar22);
                        break;
                    default:
                        TipsSettingsModalView.initView$onExitWithoutSaving$2(aVar22);
                        break;
                }
            }
        });
        a aVar5 = this.presenter;
        hne0 hne0Var = aVar5.z;
        ArrayList a = hne0Var.e.a(aVar5.B);
        TipsSettingsModalExperiment tipsSettingsModalExperiment = aVar5.x;
        tipsSettingsModalExperiment.getClass();
        String Y = d6z.Y(tipsSettingsModalExperiment, "tips_settings_title_key");
        ehz0 ehz0Var = aVar5.D;
        String Y2 = d6z.Y(tipsSettingsModalExperiment, "tips_settings_text_key");
        ghz0 binding = getBinding();
        binding.b.setText(Y2);
        ButtonComponent buttonComponent = binding.c;
        buttonComponent.setText(ehz0Var.a);
        buttonComponent.setButtonBackground(ehz0Var.b);
        buttonComponent.setButtonTitleColor(ehz0Var.c);
        buttonComponent.setTextTypeface(ehz0Var.d);
        buttonComponent.setDebounceClickListener(new fcl0(29, ehz0Var.e));
        binding.d.setTitle(Y);
        post(new kux0(16, binding));
        TipsView tipsView = binding.e;
        tipsView.setModelsGroup(a);
        tipsView.setButtonToggledListener(new n2v0(23, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$1(ghz0 ghz0Var) {
        xw31.w(ghz0Var.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$2(TipsSettingsModalView tipsSettingsModalView, jfz0 jfz0Var, boolean z) {
        ehz0 ehz0Var;
        a aVar = tipsSettingsModalView.presenter;
        String str = jfz0Var.f;
        aVar.getClass();
        if (evu0.J(str)) {
            return;
        }
        int parseInt = Integer.parseInt(str);
        aVar.B = parseInt;
        ((ihz0) aVar.Dg()).updateTips(aVar.z.e.a(parseInt));
        if (aVar.C == aVar.B) {
            ehz0Var = aVar.D;
        } else {
            TipsSettingsModalExperiment tipsSettingsModalExperiment = aVar.x;
            tipsSettingsModalExperiment.getClass();
            ehz0Var = new ehz0(d6z.Y(tipsSettingsModalExperiment, "tips_settings_done_key"), new bdc(xng0.controlMain), new bdc(xng0.textOnControl), 3, new TipsSettingsPresenter$updateDoneButton$uiState$1(0, aVar, a.class, "closeAndUpdateTips", "closeAndUpdateTips()V", 0));
        }
        ((ihz0) aVar.Dg()).updateDoneButton(ehz0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$onExitWithoutSaving(a aVar) {
        aVar.A.b();
        ((com.yandex.go.tips.navigation.b) aVar.y.b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$onExitWithoutSaving$0(a aVar) {
        aVar.A.b();
        ((com.yandex.go.tips.navigation.b) aVar.y.b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$onExitWithoutSaving$1(a aVar) {
        aVar.A.b();
        ((com.yandex.go.tips.navigation.b) aVar.y.b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$onExitWithoutSaving$2(a aVar) {
        aVar.A.b();
        ((com.yandex.go.tips.navigation.b) aVar.y.b).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ghz0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dlh0.tips_settings_modal_view, parent, false);
        int i = t8h0.description;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = t8h0.done_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = t8h0.header;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    i = t8h0.tips;
                    TipsView tipsView = (TipsView) cma1.O(i, inflate);
                    if (tipsView != null) {
                        return new ghz0((LinearLayout) inflate, robotoTextView, buttonComponent, listHeaderComponent, tipsView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        initView();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "card_tips";
    }

    @Override // defpackage.ihz0
    public void updateDoneButton(ehz0 state) {
        ButtonComponent buttonComponent = getBinding().c;
        buttonComponent.setText(state.a);
        buttonComponent.setButtonBackground(state.b);
        buttonComponent.setButtonTitleColor(state.c);
        buttonComponent.setTextTypeface(state.d);
        buttonComponent.setDebounceClickListener(new fcl0(28, state.e));
    }

    @Override // defpackage.ihz0
    public void updateTips(List<jfz0> tips) {
        getBinding().e.setModelsGroup(tips);
    }
}
