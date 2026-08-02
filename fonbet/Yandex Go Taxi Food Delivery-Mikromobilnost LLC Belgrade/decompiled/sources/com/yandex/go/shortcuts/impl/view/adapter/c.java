package com.yandex.go.shortcuts.impl.view.adapter;

import android.text.TextUtils;
import android.view.View;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;
import com.yandex.go.shortcuts.dto.response.MediaStories;
import com.yandex.go.shortcuts.dto.response.f0;
import defpackage.c1f;
import defpackage.da5;
import defpackage.g8v;
import defpackage.ga5;
import defpackage.ha5;
import defpackage.j1s0;
import defpackage.kdc;
import defpackage.l75;
import defpackage.lgp;
import defpackage.n170;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.sb0;
import defpackage.scc;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.umw0;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.AnimatedRoundedCornersImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public abstract class c extends d implements umw0 {
    public static final ArrayList g0;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a Z;
    public final c1f a0;
    public final n170 b0;
    public ga5 c0;
    public final RobotoTextView d0;
    public final RobotoTextView e0;
    public final AnimatedRoundedCornersImageView f0;

    static {
        int i = 3;
        g0 = kotlin.collections.a.m0(scc.g(new lgp(BaseShortcutViewHolder$Companion$BASE_PAYLOAD_TYPES$1.b, BaseShortcutViewHolder$Companion$BASE_PAYLOAD_TYPES$2.b, i), new lgp(BaseShortcutViewHolder$Companion$BASE_PAYLOAD_TYPES$3.b, BaseShortcutViewHolder$Companion$BASE_PAYLOAD_TYPES$4.b, i), new lgp(BaseShortcutViewHolder$Companion$BASE_PAYLOAD_TYPES$5.b, BaseShortcutViewHolder$Companion$BASE_PAYLOAD_TYPES$6.b, i)), d.W);
    }

    public c(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, t4s0 t4s0Var, View view, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar) {
        super(cVar, t4s0Var, view);
        this.Z = aVar;
        this.a0 = c1fVar;
        this.b0 = n170Var;
        int i = u7h0.shortcut_title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RobotoTextView robotoTextView = (RobotoTextView) ((View) rp31.d(view, i));
        this.d0 = robotoTextView;
        RobotoTextView robotoTextView2 = (RobotoTextView) ((View) rp31.d(view, u7h0.shortcut_subtitle));
        this.e0 = robotoTextView2;
        this.f0 = (AnimatedRoundedCornersImageView) ((View) rp31.d(view, u7h0.shortcut_background));
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        float f = j1s0Var.a;
        robotoTextView.setTextSize(1, 16.0f * f);
        robotoTextView2.setTextSize(1, 13.0f * f);
        robotoTextView.disableAutoSize();
        robotoTextView2.disableAutoSize();
    }

    public static void i0(c cVar, RobotoTextView robotoTextView, da5 da5Var) {
        l75 l75Var = new l75(6);
        cVar.Z(new BaseShortcutViewHolder$setFormattedTextToView$2(robotoTextView, da5Var, l75Var, cVar, null), Integer.valueOf(robotoTextView.getId()), true);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public void Y() {
        super.Y();
        this.c0 = null;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ga5 ga5Var = this.c0;
        if (ga5Var != null) {
            kdc kdcVar = ga5Var.getBase().c.g;
            AnimatedRoundedCornersImageView animatedRoundedCornersImageView = this.f0;
            animatedRoundedCornersImageView.setRoundedBackgroundColor(s8o.m(kdcVar, animatedRoundedCornersImageView.getContext()));
            n0(ga5Var);
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.wys
    /* renamed from: d0 */
    public void c(ga5 ga5Var) {
        CountersShowPolicy countersShowPolicy;
        this.c0 = ga5Var;
        super.c(ga5Var);
        Iterator it = ga5Var.getBase().n.a.iterator();
        while (it.hasNext()) {
            this.a0.g((CountersShowPolicy) it.next());
        }
        f0 f0Var = ga5Var.getBase().m;
        if (f0Var != null && (f0Var instanceof MediaStories) && (countersShowPolicy = ((MediaStories) f0Var).b) != null) {
            this.b0.g(countersShowPolicy);
        }
        k0(ga5Var);
        m0(ga5Var);
        n0(ga5Var);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    public void e0(ga5 ga5Var, boolean z) {
        super.e0(ga5Var, z);
        this.d0.setVisibility(z ? 4 : 0);
        this.e0.setVisibility(z ? 4 : 0);
        if (z) {
            int c = ru.yandex.taxi.design.utils.c.c(xng0.controlMinor, this.a);
            AnimatedRoundedCornersImageView animatedRoundedCornersImageView = this.f0;
            animatedRoundedCornersImageView.setRoundedBackgroundColor(c);
            animatedRoundedCornersImageView.setImageDrawable(null);
        }
    }

    public g8v h0(ga5 ga5Var) {
        return null;
    }

    public final void j0(ga5 ga5Var, sb0 sb0Var) {
        kdc kdcVar = ga5Var.getBase().c.g;
        AnimatedRoundedCornersImageView animatedRoundedCornersImageView = this.f0;
        animatedRoundedCornersImageView.setRoundedBackgroundColor(s8o.m(kdcVar, animatedRoundedCornersImageView.getContext()));
        animatedRoundedCornersImageView.setImageDrawable(null);
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.f0, ga5Var.getBase().c.b, null, ga5Var.getBase().c.c, 0, h0(ga5Var), sb0Var, null, 660));
    }

    public final void k0(ga5 ga5Var) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        String str = ga5Var.getBase().c.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        CharSequence charSequence = ga5Var.getBase().g.a;
        CharSequence charSequence2 = ga5Var.getBase().h.a;
        ha5 ha5Var = new ha5();
        ha5Var.a = charSequence;
        ha5Var.b = charSequence2;
        Z(new BaseShortcutViewHolder$updateBackgroundAndTitle$1(this, ga5Var, ref$BooleanRef, str2, ha5Var, null), Integer.valueOf(this.d0.getId()), true);
        Z(new BaseShortcutViewHolder$updateBackgroundAndTitle$2(this, ga5Var, ref$BooleanRef, str2, ha5Var, null), Integer.valueOf(this.e0.getId()), true);
        l0(ha5Var);
        if (str2.length() > 0) {
            j0(ga5Var, new sb0(6, ref$BooleanRef, this, ga5Var));
        } else {
            j0(ga5Var, null);
            o0(ga5Var);
        }
    }

    public void l0(ha5 ha5Var) {
    }

    public void m0(ga5 ga5Var) {
        this.c0 = ga5Var;
        i0(this, this.e0, ga5Var.getBase().h);
        this.d0.setMaxLines(ga5Var.getBase().h.a.length() == 0 ? 3 : 2);
    }

    public final void n0(ga5 ga5Var) {
        this.c0 = ga5Var;
        this.d0.setTextColor(ga5Var.getBase().i.d);
        this.e0.setTextColor(ga5Var.getBase().i.d);
    }

    public void o0(ga5 ga5Var) {
        i0(this, this.d0, ga5Var.getBase().g);
        i0(this, this.e0, ga5Var.getBase().h);
    }
}
