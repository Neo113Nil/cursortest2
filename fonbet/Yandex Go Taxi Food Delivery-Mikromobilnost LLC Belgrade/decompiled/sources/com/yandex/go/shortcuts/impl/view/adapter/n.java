package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import defpackage.a6b0;
import defpackage.b6b0;
import defpackage.bwi;
import defpackage.egz;
import defpackage.j1;
import defpackage.lys;
import defpackage.psg0;
import defpackage.s5o;
import defpackage.sxr0;
import defpackage.tje;
import defpackage.w5b0;
import defpackage.x5b0;
import defpackage.y5b0;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final class n extends lys {
    public static final List e0 = Collections.singletonList(new s5o(PersonalSliderShortcutViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final sxr0 S;
    public final y5b0 T;
    public final LinearLayoutManager U;
    public final RecyclerView V;
    public final PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator W;
    public int Z;
    public boolean a0;
    public boolean b0;
    public a6b0 c0;
    public int d0;

    public n(PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout personalSliderShortcutViewHolder$DisallowInterceptLinearLayout, sxr0 sxr0Var, y5b0 y5b0Var) {
        super(personalSliderShortcutViewHolder$DisallowInterceptLinearLayout);
        this.S = sxr0Var;
        this.T = y5b0Var;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(personalSliderShortcutViewHolder$DisallowInterceptLinearLayout.getContext());
        linearLayoutManager.Z = 1;
        this.U = linearLayoutManager;
        RecyclerView recyclerView = new RecyclerView(personalSliderShortcutViewHolder$DisallowInterceptLinearLayout.getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(y5b0Var);
        recyclerView.getRecycledViewPool().e(y5b0Var.m(w5b0.class), 0);
        recyclerView.addItemDecoration(new b6b0(tje.u(4, recyclerView.getContext())));
        recyclerView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(psg0.shortcuts_corners_round, personalSliderShortcutViewHolder$DisallowInterceptLinearLayout.getContext())));
        recyclerView.setClipToOutline(true);
        new f0().b(recyclerView);
        recyclerView.addOnScrollListener(new m(this));
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.yandex.go.shortcuts.impl.view.adapter.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n nVar = n.this;
                nVar.a0 = true;
                nVar.Z(new PersonalSliderShortcutViewHolder$recyclerView$1$2$1(nVar, null), 10000L, true);
                return false;
            }
        });
        this.V = recyclerView;
        PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator = new PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator(personalSliderShortcutViewHolder$DisallowInterceptLinearLayout.getContext(), null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int u = tje.u(4, personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator.getContext());
        marginLayoutParams.setMarginStart(u);
        marginLayoutParams.setMarginEnd(u);
        personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator.setLayoutParams(marginLayoutParams);
        this.W = personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator;
        this.b0 = true;
        this.d0 = -1;
        PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout personalSliderShortcutViewHolder$DisallowInterceptLinearLayout2 = (PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout) ((View) this.R);
        personalSliderShortcutViewHolder$DisallowInterceptLinearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        personalSliderShortcutViewHolder$DisallowInterceptLinearLayout2.setOrientation(0);
        personalSliderShortcutViewHolder$DisallowInterceptLinearLayout2.setGravity(16);
        personalSliderShortcutViewHolder$DisallowInterceptLinearLayout2.addView(recyclerView);
        personalSliderShortcutViewHolder$DisallowInterceptLinearLayout2.addView(personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator);
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        a6b0 a6b0Var = this.c0;
        if (a6b0Var != null) {
            this.c0 = null;
            a6b0Var.a.removeOnScrollListener(a6b0Var.i);
            bwi bwiVar = a6b0Var.g;
            if (bwiVar != null) {
                a6b0Var.g = null;
                bwiVar.cancel();
            }
            a6b0Var.d = -1;
        }
        this.Z = 0;
        this.b0 = true;
        this.a0 = false;
        this.d0 = -1;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.T.notifyDataSetChanged();
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void c(final x5b0 x5b0Var) {
        int size = x5b0Var.d.size();
        this.Z = size;
        boolean z = size >= 2;
        if (z) {
            Z(new PersonalSliderShortcutViewHolder$bind$1(this, null), 5000L, true);
        } else {
            W(5000L);
        }
        ((PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout) ((View) this.R)).setDisallowIntercept(z);
        int i = z ? 0 : 8;
        PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator = this.W;
        personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator.setVisibility(i);
        personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator.setCount(this.Z);
        this.T.submitList(x5b0Var.d, new Runnable() { // from class: com.yandex.go.shortcuts.impl.view.adapter.l
            @Override // java.lang.Runnable
            public final void run() {
                final n nVar = n.this;
                boolean z2 = nVar.b0;
                RecyclerView recyclerView = nVar.V;
                if (z2) {
                    nVar.b0 = false;
                    recyclerView.scrollToPosition(1073741823 - (1073741823 % x5b0Var.d.size()));
                    nVar.W.setSelected(0);
                } else {
                    y5b0 y5b0Var = nVar.T;
                    List list = n.e0;
                    y5b0Var.notifyItemRangeChanged(egz.C(recyclerView, nVar.U) - 20, 40);
                }
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.shortcuts.impl.view.adapter.PersonalSliderShortcutViewHolder$bind$lambda$0$$inlined$doOnNextLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        n nVar2 = n.this;
                        PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator2 = nVar2.W;
                        List list2 = n.e0;
                        personalSliderShortcutViewHolder$PersonalVerticalDotsIndicator2.setSelected(egz.C(nVar2.V, nVar2.U) % n.this.Z);
                        a6b0 a6b0Var = n.this.c0;
                        if (a6b0Var != null) {
                            a6b0Var.a.removeOnScrollListener(a6b0Var.i);
                            bwi bwiVar = a6b0Var.g;
                            if (bwiVar != null) {
                                a6b0Var.g = null;
                                bwiVar.cancel();
                            }
                            a6b0Var.d = -1;
                        }
                        n nVar3 = n.this;
                        nVar3.c0 = new a6b0(nVar3.V, new j1(19, nVar3));
                        a6b0 a6b0Var2 = n.this.c0;
                        if (a6b0Var2 != null) {
                            a6b0Var2.a.addOnScrollListener(a6b0Var2.i);
                            int b = a6b0Var2.b();
                            if (b != -1) {
                                a6b0Var2.c = b;
                                a6b0Var2.e = System.currentTimeMillis();
                                a6b0Var2.c();
                            }
                        }
                    }
                });
                recyclerView.postInvalidateOnAnimation();
            }
        });
    }
}
