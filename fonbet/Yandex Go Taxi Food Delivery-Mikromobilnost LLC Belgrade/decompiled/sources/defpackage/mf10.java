package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.shortcuts.impl.view.adapter.c;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class mf10 extends c {
    public static final /* synthetic */ int l0 = 0;
    public final w3s0 h0;
    public final x3s0 i0;
    public final BadgeView j0;
    public String k0;

    public mf10(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, w3s0 w3s0Var, x3s0 x3s0Var, t4s0 t4s0Var, View view, a aVar, ru.yandex.taxi.widget.c cVar) {
        super(c1fVar, n170Var, j1s0Var, t4s0Var, view, aVar, cVar);
        this.h0 = w3s0Var;
        this.i0 = x3s0Var;
        this.e0.setTextSize(0, view.getResources().getDimension(mrg0.component_text_size_body));
        this.j0 = (BadgeView) view.findViewById(u7h0.shortcut_badge_right_bottom);
        this.k0 = "";
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    public final void g0(ga5 ga5Var) {
        zk4 d;
        kf10 kf10Var = (kf10) ga5Var;
        super.g0(kf10Var);
        BadgeView badgeView = this.j0;
        if (badgeView == null || (d = vcb1.d(kf10Var)) == null) {
            return;
        }
        com.yandex.go.shortcuts.impl.utils.a.d(this, badgeView, d, this.T, 0, this.i0, 8);
        this.k0 = vcb1.c(d);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final g8v h0(ga5 ga5Var) {
        return ((kf10) ga5Var).c;
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void l0(ha5 ha5Var) {
        CharSequence charSequence = ha5Var.a;
        CharSequence charSequence2 = ha5Var.b;
        this.a.setContentDescription(((Object) charSequence) + " " + ((Object) charSequence2) + " " + this.k0);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void m0(ga5 ga5Var) {
        int unitSizeToPixels;
        kf10 kf10Var = (kf10) ga5Var;
        super.m0(kf10Var);
        ea5 ea5Var = kf10Var.b;
        if (ea5Var.b >= 4) {
            unitSizeToPixels = this.h0.a.unitSizeToPixels(ea5Var.a);
            RobotoTextView robotoTextView = this.e0;
            int paddingLeft = (unitSizeToPixels - robotoTextView.getPaddingLeft()) - robotoTextView.getPaddingRight();
            if (paddingLeft > 0) {
                this.d0.setMaxLines(Math.max(4 - new StaticLayout(ea5Var.h.a, robotoTextView.getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1));
            }
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final void c(kf10 kf10Var) {
        boolean z = kf10Var.d instanceof pp8;
        e0(kf10Var, z);
        if (z) {
            return;
        }
        super.c(kf10Var);
        this.e0.setMaxLines(kf10Var.getBase().g.a.length() == 0 ? 4 : 3);
        this.a.setClickable(kf10Var.getBase().k != null);
    }
}
