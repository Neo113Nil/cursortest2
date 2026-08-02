package com.yandex.go.agreement.photoupload;

import defpackage.hbp0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        a aVar = this.a.d;
        hbp0 hbp0Var = aVar.e.a;
        aVar.d.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new PhotoUploadEulaInteractorImpl$replay$1(aVar, null), 2);
        return zy11.a;
    }
}
