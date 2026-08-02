package com.yandex.go.shortcuts.impl.view.adapter;

import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.shortcuts.impl.view.adapter.o;
import defpackage.a8k0;
import defpackage.b8k0;
import defpackage.e8k0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.lys;
import defpackage.mfb;
import defpackage.sls;
import defpackage.w511;
import defpackage.w7k0;
import defpackage.xng0;
import defpackage.ykn0;
import defpackage.zo31;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class o extends lys {
    public static final /* synthetic */ int Z = 0;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a S;
    public final ykn0 T;
    public final mfb U;
    public String V;
    public String W;

    public o(e8k0 e8k0Var, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ykn0 ykn0Var) {
        super(e8k0Var);
        this.S = aVar;
        this.T = ykn0Var;
        this.U = new mfb(e8k0Var.a.getContext(), null, xng0.listCheckBoxComponentStyle);
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void c(b8k0 b8k0Var) {
        final int i = 0;
        final a8k0 a8k0Var = (a8k0) kotlin.collections.a.S(0, b8k0Var.a);
        final int i2 = 1;
        final a8k0 a8k0Var2 = (a8k0) kotlin.collections.a.S(1, b8k0Var.a);
        e8k0 e8k0Var = (e8k0) ((zo31) this.R);
        d0(e8k0Var.b, a8k0Var);
        d0(e8k0Var.c, a8k0Var2);
        if (!jl40.l(a8k0Var != null ? a8k0Var.a : null, this.V)) {
            this.V = a8k0Var != null ? a8k0Var.a : null;
            ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: c8k0
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i3 = i;
                    zy11 zy11Var = zy11.a;
                    a8k0 a8k0Var3 = a8k0Var;
                    o oVar = this.b;
                    switch (i3) {
                        case 0:
                            ShortcutsView._init_$lambda$1((ShortcutsView) oVar.T.b, a8k0Var3 != null ? a8k0Var3.a : null);
                            break;
                        default:
                            ShortcutsView._init_$lambda$1((ShortcutsView) oVar.T.b, a8k0Var3 != null ? a8k0Var3.a : null);
                            break;
                    }
                    return zy11Var;
                }
            }, e8k0Var.b.a);
        }
        if (jl40.l(a8k0Var2 != null ? a8k0Var2.a : null, this.W)) {
            return;
        }
        this.W = a8k0Var2 != null ? a8k0Var2.a : null;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: c8k0
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                a8k0 a8k0Var3 = a8k0Var2;
                o oVar = this.b;
                switch (i3) {
                    case 0:
                        ShortcutsView._init_$lambda$1((ShortcutsView) oVar.T.b, a8k0Var3 != null ? a8k0Var3.a : null);
                        break;
                    default:
                        ShortcutsView._init_$lambda$1((ShortcutsView) oVar.T.b, a8k0Var3 != null ? a8k0Var3.a : null);
                        break;
                }
                return zy11Var;
            }
        }, e8k0Var.c.a);
    }

    public final void d0(w7k0 w7k0Var, a8k0 a8k0Var) {
        int i;
        GoConstraintLayout goConstraintLayout = w7k0Var.a;
        if (a8k0Var == null) {
            return;
        }
        boolean z = a8k0Var.c;
        String str = a8k0Var.b;
        boolean z2 = a8k0Var.e;
        RobotoTextView robotoTextView = w7k0Var.f;
        ShimmeringBar shimmeringBar = w7k0Var.c;
        CheckBoxComponent checkBoxComponent = w7k0Var.d;
        RobotoTextView robotoTextView2 = w7k0Var.b;
        goConstraintLayout.setEnabled(z2);
        boolean z3 = a8k0Var.g;
        if (z3) {
            shimmeringBar.setVisibility(0);
            robotoTextView2.setVisibility(8);
        } else if (z3) {
            w511.b();
            return;
        } else {
            shimmeringBar.setVisibility(8);
            robotoTextView2.setVisibility(0);
        }
        if (z2) {
            i = xng0.textMain;
        } else {
            if (z2) {
                w511.b();
                return;
            }
            i = xng0.textMinor;
        }
        robotoTextView.setText(str);
        robotoTextView.setTextColorAttr(i);
        robotoTextView2.setText(z2 ? a8k0Var.d : goConstraintLayout.getContext().getString(kyh0.unsupported_requirement_suffix));
        robotoTextView2.setTextColorAttr(i);
        checkBoxComponent.setVisibility(z2 ? 0 : 8);
        checkBoxComponent.setChecked(z);
        mfb mfbVar = this.U;
        checkBoxComponent.setImageDrawable(z ? mfbVar.a() : mfbVar.b());
        Z(new RidaTariffsViewHolder$bindTariff$1(this, w7k0Var, a8k0Var, null), str, true);
        w7k0Var.e.setAlpha(z2 ? 1.0f : 0.5f);
    }
}
