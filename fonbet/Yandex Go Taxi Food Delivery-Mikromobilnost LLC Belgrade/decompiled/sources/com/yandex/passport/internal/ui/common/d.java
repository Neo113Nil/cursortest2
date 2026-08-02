package com.yandex.passport.internal.ui.common;

import android.widget.LinearLayout;
import com.yandex.passport.R;
import defpackage.rs11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d extends com.lightside.slab.a {
    public final c E;
    public com.yandex.passport.internal.interaction.a F;

    public d(c cVar) {
        this.E = cVar;
    }

    @Override // defpackage.ins0
    public final void g() {
        LinearLayout linearLayout = (LinearLayout) this.E.getRoot();
        this.F = new com.yandex.passport.internal.interaction.a(6, linearLayout, this);
        linearLayout.setVisibility(8);
        linearLayout.setBackgroundResource(R.color.passport_transparent);
        super.g();
    }

    @Override // defpackage.ins0
    public final void h() {
        ((LinearLayout) this.E.getRoot()).removeCallbacks(this.F);
        super.h();
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        ((LinearLayout) this.E.getRoot()).postDelayed(this.F, 1000L);
        return zy11.a;
    }
}
