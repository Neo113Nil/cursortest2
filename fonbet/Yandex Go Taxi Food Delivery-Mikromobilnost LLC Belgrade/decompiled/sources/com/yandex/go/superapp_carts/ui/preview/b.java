package com.yandex.go.superapp_carts.ui.preview;

import defpackage.d0m;
import defpackage.h3y;
import defpackage.l2m;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u1m;
import defpackage.uyg;
import defpackage.uyj;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class b {
    public final h3y a;
    public final tt2 b;
    public final zuj0 c;

    public b(h3y h3yVar, tt2 tt2Var, zuj0 zuj0Var) {
        this.a = h3yVar;
        this.b = tt2Var;
        this.c = zuj0Var;
    }

    public final Object a(u1m u1mVar, Continuation continuation) {
        l2m l2mVar = new l2m((d0m) this.a.get(), (uyg) null);
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SuperappCartPreviewInteractor$getPreviewDocumentWithVariables$2(this, l2mVar, u1mVar, null), continuation);
    }
}
