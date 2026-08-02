package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;
import com.yandex.go.shortcuts.dto.response.MediaStories;
import com.yandex.go.shortcuts.dto.response.f0;
import defpackage.ak11;
import defpackage.c1f;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.j1s0;
import defpackage.jl40;
import defpackage.l47;
import defpackage.lgp;
import defpackage.ml4;
import defpackage.n170;
import defpackage.ny61;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.scc;
import defpackage.t4s0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u4s0;
import defpackage.u7h0;
import defpackage.w3s0;
import defpackage.w511;
import defpackage.wys;
import defpackage.x3s0;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.yj11;
import defpackage.zj11;
import defpackage.zr01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes13.dex */
public final class w extends wys {
    public static final List f0 = Collections.singletonList(new lgp(TurboButtonsViewHolder$Companion$PAYLOAD_TYPES$1.b, TurboButtonsViewHolder$Companion$PAYLOAD_TYPES$2.b, 3));
    public static final TransitionSet g0;
    public final x3s0 R;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a S;
    public final t4s0 T;
    public final c1f U;
    public final ru.yandex.taxi.widget.c V;
    public final w3s0 W;
    public final n170 Z;
    public final int a0;
    public final int b0;
    public final float c0;
    public final ConstraintLayout d0;
    public final ArrayList e0;

    static {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.d0(0);
        transitionSet.Z(new ChangeBounds());
        Fade fade = new Fade();
        fade.A = Transition.s(u7h0.turbo_buttons_container, fade.A);
        transitionSet.Z(fade);
        ArrayList s = Transition.s(u7h0.turbo_button_1, transitionSet.E);
        transitionSet.E = s;
        ArrayList s2 = Transition.s(u7h0.turbo_button_2, s);
        transitionSet.E = s2;
        ArrayList s3 = Transition.s(u7h0.turbo_button_3, s2);
        transitionSet.E = s3;
        ArrayList s4 = Transition.s(u7h0.turbo_button_4, s3);
        transitionSet.E = s4;
        transitionSet.E = Transition.s(u7h0.turbo_button_5, s4);
        g0 = transitionSet;
    }

    public w(c1f c1fVar, n170 n170Var, j1s0 j1s0Var, w3s0 w3s0Var, x3s0 x3s0Var, t4s0 t4s0Var, View view, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar) {
        super(view);
        this.R = x3s0Var;
        this.S = aVar;
        this.T = t4s0Var;
        this.U = c1fVar;
        this.V = cVar;
        this.W = w3s0Var;
        this.Z = n170Var;
        this.a0 = -ru.yandex.taxi.design.utils.c.h(2, view);
        this.b0 = -tje.u(10, view.getContext());
        this.c0 = 13.0f * j1s0Var.a;
        int i = u7h0.turbo_buttons_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ConstraintLayout constraintLayout = (ConstraintLayout) ((View) rp31.d(view, i));
        this.d0 = constraintLayout;
        d6w n = y6i0.n(0, constraintLayout.getChildCount());
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add(new l47((ViewGroup) this.d0.getChildAt(it.nextInt())));
        }
        this.e0 = arrayList;
    }

    public static void e0(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i3 = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : i2;
        if (layoutParams.height == i && layoutParams.width == i && i3 == i2) {
            return;
        }
        layoutParams.height = i;
        layoutParams.width = i;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            l47 l47Var = (l47) it.next();
            String str = l47Var.g;
            if (str != null) {
                ((u4s0) this.T).c(str);
                l47Var.g = null;
            }
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        d0((zj11) obj, false);
    }

    public final void c0(yj11 yj11Var, l47 l47Var) {
        CharSequence charSequence;
        yj11 yj11Var2;
        int unitSizeToPixels;
        CountersShowPolicy countersShowPolicy;
        w wVar = this;
        t4s0 t4s0Var = wVar.T;
        if (yj11Var == null) {
            l47Var.a.setVisibility(8);
            String str = l47Var.g;
            if (str != null) {
                ((u4s0) t4s0Var).c(str);
                l47Var.g = null;
                return;
            }
            return;
        }
        FormattedText formattedText = yj11Var.d;
        String str2 = yj11Var.a;
        String str3 = yj11Var.b;
        String str4 = l47Var.g;
        ImageView imageView = l47Var.d;
        RoundedCornersImageView roundedCornersImageView = l47Var.b;
        RobotoTextView robotoTextView = l47Var.f;
        ViewGroup viewGroup = l47Var.a;
        if (!jl40.l(str4, str3)) {
            String str5 = l47Var.g;
            if (str5 != null) {
                ((u4s0) t4s0Var).c(str5);
                l47Var.g = null;
            }
            l47Var.g = str3;
            ((u4s0) t4s0Var).d(viewGroup, str3);
        }
        f0 f0Var = yj11Var.p;
        MediaStories mediaStories = f0Var instanceof MediaStories ? (MediaStories) f0Var : null;
        if (mediaStories != null && (countersShowPolicy = mediaStories.b) != null) {
            wVar.Z.g(countersShowPolicy);
        }
        Iterator it = yj11Var.k.a.iterator();
        while (it.hasNext()) {
            wVar.U.g((CountersShowPolicy) it.next());
        }
        viewGroup.setTag(str2);
        viewGroup.setVisibility(0);
        if (yj11Var.n) {
            xw31.x(wVar.b0, robotoTextView);
            robotoTextView.setMaxLines(2);
        } else {
            xw31.x(wVar.a0, robotoTextView);
            robotoTextView.setMaxLines(1);
        }
        robotoTextView.disableAutoSize();
        robotoTextView.setTextSize(1, wVar.c0);
        if (formattedText == null || (charSequence = formattedText.a()) == null) {
            charSequence = yj11Var.c;
        }
        robotoTextView.setText(charSequence);
        if (formattedText != null) {
            wVar = this;
            yj11Var2 = yj11Var;
            wVar.Z(new TurboButtonsViewHolder$bindButton$5$1(this, formattedText, l47Var, yj11Var, null), str2, true);
        } else {
            yj11Var2 = yj11Var;
        }
        robotoTextView.setTextColor(yj11Var2.e.d);
        roundedCornersImageView.setRoundedBackgroundColor(s8o.m(yj11Var2.f.g, roundedCornersImageView.getContext()));
        unitSizeToPixels = wVar.W.a.unitSizeToPixels(1.0f);
        e0(unitSizeToPixels, 0, l47Var.c);
        float f = unitSizeToPixels;
        e0((int) (1.5f * f), (int) (f * (-0.25f)), imageView);
        int i = ak11.a[yj11Var2.j.ordinal()];
        if (i == 1) {
            imageView.setVisibility(0);
            roundedCornersImageView.setVisibility(8);
            wVar.a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.b(wVar.S, l47Var.d, yj11Var2.h, new zr01(14, l47Var, yj11Var2), null, 44));
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            imageView.setVisibility(8);
            roundedCornersImageView.setVisibility(0);
            wVar.a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(wVar.S, l47Var.b, yj11Var2.h, null, null, yj11Var2.i, null, null, null, 1004));
        }
        ArrayList arrayList = yj11Var2.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ml4) {
                arrayList2.add(obj);
            }
        }
        ml4 ml4Var = (ml4) kotlin.collections.a.R(arrayList2);
        BadgeView badgeView = l47Var.e;
        if (ml4Var != null) {
            com.yandex.go.shortcuts.impl.utils.a.d(wVar, badgeView, ml4Var, wVar.V, viewGroup.getId(), null, 16);
        } else {
            badgeView.setVisibility(8);
        }
        ru.yandex.taxi.design.utils.c.z(new zr01(13, wVar, yj11Var2), viewGroup);
    }

    public final void d0(zj11 zj11Var, boolean z) {
        ConstraintLayout constraintLayout = this.d0;
        if (z) {
            TransitionManager.a(g0, constraintLayout);
        }
        ArrayList arrayList = new ArrayList(this.e0);
        ArrayList arrayList2 = zj11Var.b;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            l47 l47Var = null;
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            yj11 yj11Var = (yj11) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (jl40.l(((l47) it2.next()).a.getTag(), yj11Var.a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                l47Var = (l47) arrayList.remove(i);
            }
            arrayList3.add(l47Var);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        int i2 = 0;
        for (Object obj : zj11Var.b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            yj11 yj11Var2 = (yj11) obj;
            l47 l47Var2 = (l47) arrayList4.get(i2);
            if (l47Var2 == null) {
                l47Var2 = (l47) arrayList.remove(0);
                arrayList4.set(i2, l47Var2);
            }
            c0(yj11Var2, l47Var2);
            i2 = i3;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l47 l47Var3 = (l47) it3.next();
            arrayList4.add(l47Var3);
            c0(null, l47Var3);
        }
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.g(constraintLayout);
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            l47 l47Var4 = (l47) it4.next();
            Integer valueOf = l47Var4 != null ? Integer.valueOf(l47Var4.a.getId()) : null;
            if (valueOf != null) {
                arrayList5.add(valueOf);
            }
        }
        int[] I0 = kotlin.collections.a.I0(arrayList5);
        if (I0.length < 2) {
            ny61.g("must have 2 or more widgets in a chain");
            return;
        }
        eVar.o(I0[0]).e.W = 0;
        int i4 = 6;
        eVar.j(I0[0], 6, 0, 6, -1);
        for (int i5 = 1; i5 < I0.length; i5++) {
            int i6 = i5 - 1;
            eVar.j(I0[i5], i4, I0[i6], 7, -1);
            int i7 = i4;
            eVar.j(I0[i6], 7, I0[i5], i7, -1);
            i4 = i7;
        }
        eVar.j(I0[I0.length - 1], 7, 0, 7, -1);
        eVar.b(constraintLayout);
    }
}
