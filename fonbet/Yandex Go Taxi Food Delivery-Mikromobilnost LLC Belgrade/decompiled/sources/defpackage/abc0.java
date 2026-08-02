package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.ControlButtonView;

/* loaded from: classes13.dex */
public final class abc0 implements zo31 {
    public final GoConstraintLayout a;
    public final ControlButtonView b;
    public final ControlButtonView c;
    public final ControlButtonView d;
    public final ControlButtonView e;

    public abc0(GoConstraintLayout goConstraintLayout, GoLinearLayout goLinearLayout, ControlButtonView controlButtonView, ControlButtonView controlButtonView2, ControlButtonView controlButtonView3, ControlButtonView controlButtonView4) {
        this.a = goConstraintLayout;
        this.b = controlButtonView;
        this.c = controlButtonView2;
        this.d = controlButtonView3;
        this.e = controlButtonView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
