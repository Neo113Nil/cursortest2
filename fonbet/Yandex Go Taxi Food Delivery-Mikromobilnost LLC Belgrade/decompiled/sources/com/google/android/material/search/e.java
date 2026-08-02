package com.google.android.material.search;

import com.google.android.material.search.SearchView;
import defpackage.bh2;

/* loaded from: classes11.dex */
public final class e implements bh2 {
    public final /* synthetic */ com.google.android.material.animation.a a;
    public final /* synthetic */ g b;

    public e(g gVar, com.google.android.material.animation.a aVar) {
        this.b = gVar;
        this.a = aVar;
    }

    @Override // defpackage.bh2
    public final void a() {
        g gVar = this.b;
        gVar.u.a(true);
        gVar.d.setVisibility(0);
        gVar.s.stopOnLoadAnimation();
    }

    @Override // defpackage.bh2
    public final void b() {
        g gVar = this.b;
        gVar.u.f(true);
        SearchView searchView = gVar.a;
        if (!searchView.isAdjustNothingSoftInputMode()) {
            searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        searchView.setTransitionState(SearchView.TransitionState.SHOWN);
        if (gVar.o == this.a) {
            gVar.o = null;
        }
    }
}
