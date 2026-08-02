package com.yandex.go.safety.center.instructions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.ajl0;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.esl0;
import defpackage.hrl0;
import defpackage.i7h0;
import defpackage.ksl0;
import defpackage.lsl0;
import defpackage.msl0;
import defpackage.n48;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.rsl0;
import defpackage.ssl0;
import defpackage.tjh0;
import defpackage.usl0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/safety/center/instructions/SafetyCenterInstructionsView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lusl0;", "Llsl0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/instructions/a;", "presenter", "Lpav;", "imageLoader", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/instructions/a;Lpav;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;)V", "Lzy11;", "onAttachedToWindow", "()V", "Lksl0;", "model", "showModalContent", "(Lksl0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lusl0;", "Lcom/yandex/go/safety/center/instructions/a;", "Lpav;", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "itemsContainer", "Lru/yandex/taxi/design/AutoDividerComponentList;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterInstructionsView extends SlideableBindingModalView<usl0> implements lsl0 {
    private final SafetyCenterExperiment experiment;
    private final pav imageLoader;
    private final AutoDividerComponentList itemsContainer;
    private final a presenter;

    public SafetyCenterInstructionsView(Context context, a aVar, pav pavVar, SafetyCenterExperiment safetyCenterExperiment) {
        super(context);
        this.presenter = aVar;
        this.imageLoader = pavVar;
        this.experiment = safetyCenterExperiment;
        this.itemsContainer = getBinding().c;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new msl0(aVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showModalContent$lambda$0(SafetyCenterInstructionsView safetyCenterInstructionsView, SafetyCenterExperiment.Instruction instruction) {
        ssl0 ssl0Var = safetyCenterInstructionsView.presenter.x.a;
        n48 n48Var = new n48(instruction);
        ssl0Var.A(((esl0) ssl0Var.I).a(new hrl0(), n48Var), zy11.a, new rsl0());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public usl0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tjh0.safety_center_instructions_view, parent, false);
        int i = i7h0.image;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            int i2 = i7h0.safety_center_items;
            AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i2, inflate);
            if (autoDividerComponentList != null) {
                i2 = i7h0.safety_center_scroll_view;
                if (((NestedScrollViewAdvanced) cma1.O(i2, inflate)) != null) {
                    i2 = i7h0.scroll_indicator_shadow;
                    if (((ShadowScrollIndicator) cma1.O(i2, inflate)) != null) {
                        i2 = i7h0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                        if (robotoTextView != null) {
                            return new usl0(frameLayout, imageView, autoDividerComponentList, robotoTextView);
                        }
                    }
                }
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
    }

    @Override // defpackage.lsl0
    public void showModalContent(ksl0 model) {
        this.itemsContainer.removeAllViews();
        for (SafetyCenterExperiment.Instruction instruction : model.c) {
            String str = instruction.b;
            if (str.length() > 0) {
                String Y = d6z.Y(this.experiment, str);
                ListItemComponent listItemComponent = (ListItemComponent) c.q(this.itemsContainer, tjh0.safety_center_instructions_item, false);
                listItemComponent.setTitle(Y);
                listItemComponent.setDebounceClickListener(new ajl0(4, this, instruction));
                this.itemsContainer.addView(listItemComponent);
            }
        }
        getBinding().d.setText(model.a);
        String str2 = model.b;
        if (str2 != null) {
            ((nac) this.imageLoader.a(getBinding().b)).c(str2);
        }
    }
}
