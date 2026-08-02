package com.yandex.go.profile;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import defpackage.jy60;
import defpackage.nwl;
import defpackage.tje;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public final class a implements jy60 {
    public final Lifecycle a;
    public final com.yandex.go.profile.domain.divkit.a b;

    public a(Lifecycle lifecycle, com.yandex.go.profile.domain.divkit.a aVar) {
        this.a = lifecycle;
        this.b = aVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ProfileVariablesUpdater";
    }

    @Override // defpackage.jy60
    public final void h() {
        com.yandex.go.profile.domain.divkit.a aVar = this.b;
        Iterator it = ((Set) aVar.b.getValue()).iterator();
        while (it.hasNext()) {
            ((nwl) it.next()).a(aVar.a);
        }
        tje.N(r.a(this.a), null, null, new ProfileVariablesUpdater$onFirstContentfulPaint$1(this, null), 3);
    }
}
