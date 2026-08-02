package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.al4;
import defpackage.c1f;
import defpackage.ekh0;
import defpackage.fl4;
import defpackage.g8v;
import defpackage.ga5;
import defpackage.ha5;
import defpackage.j1s0;
import defpackage.jl4;
import defpackage.lgp;
import defpackage.ll4;
import defpackage.n170;
import defpackage.pl4;
import defpackage.ql4;
import defpackage.r3h;
import defpackage.rp31;
import defpackage.scc;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.vcb1;
import defpackage.x3s0;
import defpackage.xw31;
import defpackage.zk4;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.BadgeView;

/* loaded from: classes13.dex */
public final class e extends c {
    public static final ArrayList q0;
    public final x3s0 h0;
    public final ConstraintLayout i0;
    public final BadgeView j0;
    public final BadgeView k0;
    public final BadgeView l0;
    public final Space m0;
    public final Space n0;
    public String o0;
    public final ArrayList p0;

    static {
        int i = 3;
        q0 = kotlin.collections.a.m0(scc.g(new lgp(DeeplinkShortcutViewHolder$Companion$PAYLOAD_TYPES$1.b, DeeplinkShortcutViewHolder$Companion$PAYLOAD_TYPES$2.b, i), new lgp(DeeplinkShortcutViewHolder$Companion$PAYLOAD_TYPES$3.b, DeeplinkShortcutViewHolder$Companion$PAYLOAD_TYPES$4.b, i), new lgp(DeeplinkShortcutViewHolder$Companion$PAYLOAD_TYPES$5.b, DeeplinkShortcutViewHolder$Companion$PAYLOAD_TYPES$6.b, i)), c.g0);
    }

    public e(com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, ru.yandex.taxi.widget.c cVar, View view, j1s0 j1s0Var, x3s0 x3s0Var) {
        super(c1fVar, n170Var, j1s0Var, t4s0Var, view, aVar, cVar);
        this.h0 = x3s0Var;
        int i = u7h0.shortcut_shape;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.i0 = (ConstraintLayout) ((View) rp31.d(view, i));
        this.j0 = (BadgeView) ((View) rp31.d(view, u7h0.shortcut_badge_left));
        this.k0 = (BadgeView) ((View) rp31.d(view, u7h0.shortcut_badge_right));
        this.l0 = (BadgeView) ((View) rp31.d(view, u7h0.shortcut_badge_right_bottom));
        this.m0 = (Space) ((View) rp31.d(view, u7h0.shortcut_bottom_end_space));
        this.n0 = (Space) ((View) rp31.d(view, u7h0.shortcut_bottom_start_space));
        this.o0 = "";
        this.p0 = new ArrayList();
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c, com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        f0(EmptyList.a, this.p0, ekh0.shortcut_transport_badge, this.n0.getId(), this.i0);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    public final void g0(ga5 ga5Var) {
        r3h r3hVar = (r3h) ga5Var;
        super.g0(r3hVar);
        q0(r3hVar);
        r0(r3hVar);
        p0(r3hVar);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final g8v h0(ga5 ga5Var) {
        return ((r3h) ga5Var).c;
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.c
    public final void l0(ha5 ha5Var) {
        CharSequence charSequence = ha5Var.a;
        CharSequence charSequence2 = ha5Var.b;
        this.a.setContentDescription(((Object) charSequence) + " " + ((Object) charSequence2) + " " + this.o0);
    }

    public final void p0(r3h r3hVar) {
        List list = (List) r3hVar.i.getValue();
        boolean isEmpty = list.isEmpty();
        int i = 0;
        Space space = this.n0;
        if (!isEmpty) {
            space.setVisibility(0);
        }
        int i2 = ekh0.shortcut_transport_badge;
        int id = space.getId();
        ConstraintLayout constraintLayout = this.i0;
        ArrayList arrayList = this.p0;
        f0(list, arrayList, i2, id, constraintLayout);
        for (Object obj : (List) r3hVar.i.getValue()) {
            int i3 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            com.yandex.go.shortcuts.impl.utils.a.d(this, (BadgeView) arrayList.get(i), (pl4) obj, this.T, 0, null, 24);
            i = i3;
        }
    }

    public final void q0(r3h r3hVar) {
        pl4 pl4Var = (pl4) r3hVar.g.getValue();
        BadgeView badgeView = this.j0;
        if (pl4Var == null) {
            badgeView.setVisibility(8);
            return;
        }
        boolean z = pl4Var instanceof ql4;
        BadgeView.Shape shape = null;
        ql4 ql4Var = z ? (ql4) pl4Var : null;
        badgeView.setAngle(ql4Var != null ? ql4Var.d : 0);
        boolean z2 = pl4Var instanceof ll4;
        Space space = this.m0;
        Space space2 = this.n0;
        if (z2 || (pl4Var instanceof jl4) || (pl4Var instanceof al4)) {
            space2.setVisibility(8);
            space.setVisibility(8);
        } else {
            space2.setVisibility(0);
            space.setVisibility(0);
        }
        if (pl4Var instanceof fl4) {
            shape = BadgeView.Shape.BUBBLE;
        } else if (z) {
            shape = BadgeView.Shape.STICKER;
        }
        badgeView.setShape(shape);
        com.yandex.go.shortcuts.impl.utils.a.d(this, this.j0, pl4Var, this.T, 0, null, 24);
    }

    public final void r0(r3h r3hVar) {
        zk4 d = vcb1.d(r3hVar);
        if (d != null) {
            com.yandex.go.shortcuts.impl.utils.a.d(this, this.l0, d, this.T, 0, this.h0, 8);
            xw31.D(ru.yandex.taxi.design.utils.c.h(9, this.a), this.l0);
            this.o0 = vcb1.c(d);
            return;
        }
        pl4 pl4Var = (pl4) r3hVar.h.getValue();
        BadgeView badgeView = this.k0;
        if (pl4Var != null) {
            com.yandex.go.shortcuts.impl.utils.a.d(this, badgeView, pl4Var, this.T, 0, null, 24);
        } else {
            badgeView.setVisibility(8);
        }
    }
}
