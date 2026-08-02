package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class ihn0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoConstraintLayout b;
    public final ScootersNewControlPanelView c;
    public final DialogueComponent d;
    public final ScootersCardHeaderComponent e;
    public final ShimmeringFrameLayout f;
    public final ho4 g;

    public ihn0(GoConstraintLayout goConstraintLayout, GoConstraintLayout goConstraintLayout2, ScootersNewControlPanelView scootersNewControlPanelView, DialogueComponent dialogueComponent, ScootersCardHeaderComponent scootersCardHeaderComponent, ShimmeringFrameLayout shimmeringFrameLayout, ho4 ho4Var) {
        this.a = goConstraintLayout;
        this.b = goConstraintLayout2;
        this.c = scootersNewControlPanelView;
        this.d = dialogueComponent;
        this.e = scootersCardHeaderComponent;
        this.f = shimmeringFrameLayout;
        this.g = ho4Var;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
