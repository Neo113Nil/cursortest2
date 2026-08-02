package com.google.android.material.search;

import com.google.android.material.search.SearchView;
import defpackage.bh2;

/* loaded from: classes11.dex */
public final class f implements bh2 {
    public final /* synthetic */ com.google.android.material.animation.a a;
    public final /* synthetic */ g b;

    public f(g gVar, com.google.android.material.animation.a aVar) {
        this.b = gVar;
        this.a = aVar;
    }

    @Override // defpackage.bh2
    public final void a() {
        g gVar = this.b;
        gVar.u.a(false);
        gVar.a.setTransitionState(SearchView.TransitionState.HIDING);
    }

    @Override // defpackage.bh2
    public final void b() {
        g gVar = this.b;
        gVar.u.f(false);
        gVar.d.setVisibility(8);
        SearchView searchView = gVar.a;
        if (!searchView.isAdjustNothingSoftInputMode()) {
            gVar.k.clearFocus();
        }
        searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
        if (gVar.o == this.a) {
            gVar.o = null;
        }
    }
}
