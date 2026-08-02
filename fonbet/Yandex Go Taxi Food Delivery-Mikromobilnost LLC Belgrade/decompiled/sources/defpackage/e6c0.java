package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.places.common.ui.ControlButtonView;

/* loaded from: classes13.dex */
public final class e6c0 implements zo31 {
    public final GoConstraintLayout a;
    public final ControlButtonView b;
    public final n5c0 c;
    public final ControlButtonView d;
    public final m2y e;
    public final ControlButtonView f;
    public final RecyclerView g;
    public final ControlButtonView h;
    public final ControlButtonView i;

    public e6c0(GoConstraintLayout goConstraintLayout, ControlButtonView controlButtonView, n5c0 n5c0Var, ControlButtonView controlButtonView2, m2y m2yVar, ControlButtonView controlButtonView3, RecyclerView recyclerView, ControlButtonView controlButtonView4, ControlButtonView controlButtonView5) {
        this.a = goConstraintLayout;
        this.b = controlButtonView;
        this.c = n5c0Var;
        this.d = controlButtonView2;
        this.e = m2yVar;
        this.f = controlButtonView3;
        this.g = recyclerView;
        this.h = controlButtonView4;
        this.i = controlButtonView5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
