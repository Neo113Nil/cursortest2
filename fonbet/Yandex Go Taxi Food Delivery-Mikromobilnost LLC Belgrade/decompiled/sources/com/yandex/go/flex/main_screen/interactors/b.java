package com.yandex.go.flex.main_screen.interactors;

import defpackage.ajr;
import defpackage.fse;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b implements com.yandex.go.flex.main_screen.api.query.a {
    public final tt2 a;
    public final ajr b;
    public final a c;

    public b(tt2 tt2Var, ajr ajrVar, a aVar) {
        this.a = tt2Var;
        this.b = ajrVar;
        this.c = aVar;
    }

    public final Object b(String str, zzs zzsVar, List list, sls slsVar, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        fse fseVar;
        if (z2) {
            fseVar = EmptyCoroutineContext.a;
        } else {
            this.a.getClass();
            sjh sjhVar = uyj.a;
            fseVar = mdh.b;
        }
        return tje.k0(fseVar, new DocumentQueryFactoryImpl$prepareDocumentQuery$2(zzsVar, this, list, z, slsVar, str, null), continuationImpl);
    }
}
