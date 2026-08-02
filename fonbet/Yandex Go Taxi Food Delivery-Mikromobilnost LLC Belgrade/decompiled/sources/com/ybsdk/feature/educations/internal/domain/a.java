package com.ybsdk.feature.educations.internal.domain;

import com.ybsdk.di.modules.features.h;
import com.ybsdk.di.modules.features.i;
import defpackage.btc;
import defpackage.d6v;
import defpackage.gym;
import defpackage.nbp0;
import defpackage.tje;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class a {
    public final h a;
    public final i b;
    public final gym c;
    public final com.ybsdk.common.a d;
    public final LinkedHashMap e = new LinkedHashMap();

    public a(h hVar, i iVar, gym gymVar, com.ybsdk.common.a aVar) {
        this.a = hVar;
        this.b = iVar;
        this.c = gymVar;
        this.d = aVar;
    }

    public final void a(String str, d6v d6vVar) {
        tje.N(((nbp0) this.c.a).b, null, null, new EducationsPersistenceInteractorImpl$markAsRead$1(d6vVar, str, this, null), 3);
    }

    public final void b(btc btcVar) {
        tje.N(((nbp0) this.c.a).b, null, null, new EducationsPersistenceInteractorImpl$markShownInSession$1(this, btcVar, null), 3);
        this.d.c(btcVar);
    }
}
