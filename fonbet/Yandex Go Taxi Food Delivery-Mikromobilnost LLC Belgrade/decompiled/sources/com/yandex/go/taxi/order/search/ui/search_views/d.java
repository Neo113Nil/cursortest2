package com.yandex.go.taxi.order.search.ui.search_views;

import android.view.ViewGroup;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import defpackage.ow70;
import defpackage.p8h0;
import defpackage.tje;
import defpackage.tup0;
import defpackage.uxp0;
import defpackage.vup0;

/* loaded from: classes14.dex */
public final class d implements tup0 {
    public final vup0 a;
    public final ow70 b;

    public d(vup0 vup0Var, ow70 ow70Var) {
        this.a = vup0Var;
        this.b = ow70Var;
    }

    public final void B0(float f) {
        SearchViews I = I();
        if (I != null) {
            I.setSearchCoverAlpha(f);
        }
    }

    @Override // defpackage.tup0
    public final void C8(int i) {
        SearchViews I = I();
        if (I != null) {
            I.setIconLocation(i);
        }
    }

    public final SearchViews I() {
        ViewGroup a = this.b.a();
        if (a != null) {
            return (SearchViews) a.findViewById(p8h0.search_animation_view_container);
        }
        return null;
    }

    public final void M1(boolean z) {
        SearchViews I = I();
        if (I != null) {
            I.setSearchCoverVisibility(z);
        }
    }

    public final void h() {
        SearchViews I = I();
        if (I != null) {
            I.setOnMyLocationClickListener(new Runnable() { // from class: com.yandex.go.taxi.order.search.ui.search_views.c
                @Override // java.lang.Runnable
                public final void run() {
                    vup0 vup0Var = d.this.a;
                    tje.N(vup0Var.Jg(), null, null, new SearchMapPresenter$onPinClicked$1(vup0Var, null), 3);
                }
            });
        }
        vup0 vup0Var = this.a;
        vup0Var.Bg(this);
        tje.N(vup0Var.Jg(), null, null, new SearchMapPresenter$collectState$1(vup0Var, null), 3);
        tje.N(vup0Var.Jg(), null, null, new SearchMapPresenter$collectLocationAsset$1(vup0Var, null), 3);
    }

    @Override // defpackage.tup0
    public final void ie(uxp0 uxp0Var) {
        SearchViews I = I();
        if (I != null) {
            I.render(uxp0Var);
        }
    }
}
